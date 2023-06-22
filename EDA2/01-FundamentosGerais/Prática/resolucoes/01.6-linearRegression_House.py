# 1.	Ler os ficheiros  House.csv e House_Final_new.csv
import pandas as pd  # To read data
data = pd.read_csv('C:/Users/Catarina/Dropbox/Aulas/UPT/2020_2021/2_semestre/EDA2/01/ficheiros CSV/House.csv')  # load data set
data_final_new = pd.read_csv('C:/Users/Catarina/Dropbox/Aulas/UPT/2020_2021/2_semestre/EDA2/01/ficheiros CSV/House_Final_new.csv')  # load data set
print(data)
# 2.	Criar um modelo  de regressão linear com os dados em questão
from sklearn.linear_model import LinearRegression
linear_regressor = LinearRegression()  # create object for the class
# linear_regressor.fit(data[['HouseSize', 'LotSize', 'Bedrooms', 'Granite', 'Bathroom']], data['SellingPrice'])  # perform linear regression
linear_regressor.fit(data[['HouseSize', 'LotSize', 'Bedrooms', 'Bathroom']], data['SellingPrice'])  # perform linear regression

# 3.	Visualizar os coeficientes e o intercept do modelo
import numpy as np
np.set_printoptions(formatter={'float_kind': '{:f}'.format})
print("coefs:", linear_regressor.coef_, sep=" ")
print("intercept:", linear_regressor.intercept_, sep=" ")

# 4.	Obter algumas métricas de performance do modelo
# predictions = linear_regressor.predict(data[['HouseSize', 'LotSize', 'Bedrooms', 'Granite', 'Bathroom']])
from sklearn.metrics import mean_absolute_error, mean_squared_error, r2_score
import math
predictions = linear_regressor.predict(data[['HouseSize', 'LotSize', 'Bedrooms', 'Bathroom']])
print("model predictions:", predictions, sep=" ")
print("\n= METRICS =")
print('mean_absolute_error: ', mean_absolute_error(data['SellingPrice'], predictions), sep="")
print('Root mean_squared_error: ', math.sqrt(mean_squared_error(data['SellingPrice'], predictions)), sep="")
print('R_squared: ', r2_score(data['SellingPrice'], predictions), sep="")

# 5.	Calcular e visualizar as previsões do modelo para os dados novos.
# predictions2 = linear_regressor.predict(data_final_new[['HouseSize', 'LotSize', 'Bedrooms', 'Granite', 'Bathroom']])
predictions2 = linear_regressor.predict(data_final_new[['HouseSize', 'LotSize', 'Bedrooms', 'Bathroom']])
print("\nmodel final predictions:", predictions2, sep=" ")
