import pandas as pd
data = pd.read_csv("C:/Users/Catarina/Desktop/Aulas/Materia/DataMining/02-ClassificacaoAvancada/csv/imc.csv")

x=data.iloc[:,0:2]
y=data.iloc[:,2]

from sklearn.neighbors import KNeighborsClassifier
knn = KNeighborsClassifier(n_neighbors=3, weights='distance', metric="euclidean")
knn.fit(x, y)

print("previsao (65,165): ", knn.predict([[65, 165]]))

# groups = data.groupby("IMC")

# import matplotlib.pyplot as plt
#
# # plt.rcParams['figure.figsize'] = (20.0, 10.0)
#
# for name, group in groups:
#     plt.plot(group["Peso"], group["Altura"], marker="o", ms=10, linestyle="", label=name)
#
# handles, labels = plt.gca().get_legend_handles_labels()
# order = [1,2,4,3,0]
# plt.legend([handles[idx] for idx in order],[labels[idx] for idx in order], bbox_to_anchor=(1.05, -0.05),
#           fancybox=True, shadow=True, ncol=5)
# # plt.tight_layout()
# plt.show()




# # Splitting the dataset into training and test set.
# from sklearn.model_selection import train_test_split
# x_train, x_test, y_train, y_test=train_test_split(x, y, test_size=0.5, random_state=0)
# from sklearn.neighbors import KNeighborsClassifier
# from sklearn.metrics import accuracy_score
# for k in range(1,6):
#     knn = KNeighborsClassifier(n_neighbors=k, weights='distance', metric="euclidean")
#     knn.fit(x, y)
#     y_pred= knn.predict(x_test)
#     # print(y_pred,"===",y_test)
#     print("K =",k,"-> Accuracy of test set=", accuracy_score(y_test, y_pred) * 100)