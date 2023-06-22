import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler, OneHotEncoder
from sklearn.neighbors import KNeighborsClassifier
from sklearn.metrics import accuracy_score, precision_score, recall_score, f1_score
import matplotlib.pyplot as plt
import seaborn as sns

df = pd.read_csv('C:/Users/Catarina/Desktop/Aulas/Materia/DataMining/02-ClassificacaoAvancada/csv/titanic_train.csv', sep=";")
X = df.drop('Survived', axis=1)
y = df.Survived

#train test split
X_train, X_test, y_train, y_test = train_test_split(X,y, random_state=42)

#defining numerical and categorical features in dataframe
numerical = ['Age', "SibSp", "Parch", 'Fare']
categorical = ["Pclass", "Sex"]

#defining train and test index variables for casting the scaled numerical values in a dataframe
X_train_index = X_train.index
X_test_index = X_test.index

#instantiating OneHotEncoder and defining the train and test features to be encoded
ohe = OneHotEncoder()
X_train_ohe = X_train[categorical]
X_test_ohe = X_test[categorical]

#fitting the encoder to the train set and transforming both the train and test set
X_train_encoded = ohe.fit_transform(X_train_ohe)
X_test_encoded = ohe.transform(X_test_ohe)

#instantiating StandardScaler and defining continous variables to be scaled
ss = StandardScaler()
X_train_cont = X_train[numerical].astype(float)
X_test_cont = X_test[numerical].astype(float)

#scaling the continuous features and casting results as dataframes
X_train_scaled = pd.DataFrame(ss.fit_transform(X_train_cont), columns=X_train_cont.columns, index=X_train_index)
X_test_scaled = pd.DataFrame(ss.transform(X_test_cont), columns=X_test_cont.columns, index=X_test_index)

#defining the columns for the train and test splits
train_columns = ohe.get_feature_names(input_features=X_train_ohe.columns)
test_columns = ohe.get_feature_names(input_features=X_test_ohe.columns)

#casting the encoded X_train and X_test as dataframes
X_train_processed = pd.DataFrame(X_train_encoded.todense(), columns=train_columns, index=X_train_index)
X_test_processed = pd.DataFrame(X_test_encoded.todense(), columns=test_columns, index=X_test_index)

#combining the encoded and scaled dataframes for a preprocessed
#X_train and X_test
X_train = pd.concat([X_train_scaled, X_train_processed], axis=1)
X_test = pd.concat([X_test_scaled, X_test_processed], axis=1)

# function for evaluating the model performance, returns recall,
# accuracy, precision, and f1 scores
def evaluation(k,d,type,y, y_hat):
    precision = round(precision_score(y, y_hat)*100,1)
    recall = round(recall_score(y, y_hat)*100,1)
    accuracy = round(accuracy_score(y, y_hat)*100,1)
    f1 = round(f1_score(y, y_hat)*100,1)
    return [k,d,type,recall,accuracy,precision,f1]


# instantiating and fitting K Neighbors Classifier
possible_ks = range(1, 50)
possible_distances = ['euclidean', 'manhattan']
results = []
for d in possible_distances:
    for k in possible_ks:
        knn = KNeighborsClassifier(n_neighbors=k, metric=d)
        knn.fit(X_train, y_train)
        y_hat_train = knn.predict(X_train)
        y_hat_test = knn.predict(X_test)
        results.append(evaluation(k,d,"train",y_train, y_hat_train))
        results.append(evaluation(k, d, "test", y_test, y_hat_test))
        # print('k =',k,"- distance =",d)
        # print("train:", format(evaluation(y_train, y_hat_train)))
        # print("test:", format(evaluation(y_test, y_hat_test)))

results = pd.DataFrame(results, columns=["k","d","type","recall","accuracy","precision","f1"])
g = sns.FacetGrid(results, col="d", row="type")
g.map(sns.pointplot, "k", "accuracy")
plt.show()

res_test = results[(results['type']=="test")]
print(res_test.loc[[res_test["accuracy"].idxmax()]])