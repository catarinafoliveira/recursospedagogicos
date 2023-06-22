import pandas as pd  # To read data
data = pd.read_csv('C:/Users/Catarina/Dropbox/Aulas/UPT/2020_2021/2_semestre/EDA2/01/ficheiros CSV/House.csv')  # load data set
data_final_new = pd.read_csv('C:/Users/Catarina/Dropbox/Aulas/UPT/2020_2021/2_semestre/EDA2/01/ficheiros CSV/House_Final_new.csv')  # load data set
# print(data_final_new)

X = data[['HouseSize', 'LotSize', 'Bedrooms', 'Granite', 'Bathroom']]
Y = data[['SellingPrice']]

from sklearn.tree import DecisionTreeRegressor
regr_1 = DecisionTreeRegressor()
regr_1.fit(X, Y)

# evaluate model
from sklearn.metrics import mean_squared_error
predictions = regr_1.predict(X=data[['HouseSize', 'LotSize', 'Bedrooms', 'Granite', 'Bathroom']])
mse = mean_squared_error(data[['SellingPrice']], predictions)
print("MSE:", mse)


from sklearn.tree import export_text
r = export_text(regr_1, feature_names=['HouseSize', 'LotSize', 'Bedrooms', 'Granite', 'Bathroom'])
print(r)

from sklearn import tree
# Create DOT data
dot_data = tree.export_graphviz(regr_1, out_file=None,
                                feature_names=['HouseSize', 'LotSize', 'Bedrooms', 'Granite', 'Bathroom'],
                                class_names=regr_1.classes_)

# Draw graph
import pydotplus
graph = pydotplus.graph_from_dot_data(dot_data)

# Show graph
from IPython.display import Image

Image(graph.create_png())
graph.write_pdf('dt_regr.pdf')

predictions = regr_1.predict(X=data_final_new[['HouseSize', 'LotSize', 'Bedrooms', 'Granite', 'Bathroom']])
print("Predicted price: % d\n"% predictions)