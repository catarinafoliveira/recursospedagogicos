import pandas as pd
from sklearn.preprocessing import StandardScaler, OneHotEncoder

from sklearn.neighbors import KNeighborsClassifier

df_train = pd.read_csv('C:/Users/Catarina/Desktop/Aulas/Materia/DataMining/02-ClassificacaoAvancada/csv/titanic_train.csv', sep=";")
df_train = df_train[['Survived', 'Pclass', 'Age', 'SibSp', 'Parch', 'Fare', 'Sex']]

X_train = df_train.drop('Survived', axis=1)
y_train = df_train.Survived

df_test = pd.read_csv('C:/Users/Catarina/Desktop/Aulas/Materia/DataMining/02-ClassificacaoAvancada/csv/titanic_test.csv', sep=";")
df_test = df_test[['Pclass', 'Age', 'SibSp', 'Parch', 'Fare', 'Sex']]

X_test = df_test

#importing scaler and encoder

#defining numerical and categorical features in dataframe
numerical = ['Age', "SibSp", "Parch", 'Fare']
categorical = ["Pclass", "Sex"]

#defining train and test index variables for casting the scaled
#numerical values in a dataframe
X_train_index = X_train.index
X_test_index = X_test.index

#instantiating OneHotEncoder and defining the train and test
#features to be encoded
ohe = OneHotEncoder()
X_train_ohe = X_train[categorical]
X_test_ohe = X_test[categorical]

#fitting the encoder to the train set and transforming both
#the train and test set
X_train_encoded = ohe.fit_transform(X_train_ohe)
X_test_encoded = ohe.transform(X_test_ohe)

#instantiating StandardScaler and defining continous variables
#to be scaled
ss = StandardScaler()
X_train_cont = X_train[numerical].astype(float)
X_test_cont = X_test[numerical].astype(float)

#scaling the continuous features and casting results as dataframes
X_train_scaled = pd.DataFrame(ss.fit_transform(X_train_cont), columns=X_train_cont.columns,
                              index=X_train_index)
X_test_scaled = pd.DataFrame(ss.transform(X_test_cont), columns=X_test_cont.columns,
                             index=X_test_index)

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

# instantiating and fitting K Neighbors Classifier
knn = KNeighborsClassifier(n_neighbors=17, metric='euclidean')
knn.fit(X_train, y_train)
# predictions =
print(knn.predict(X_test))

