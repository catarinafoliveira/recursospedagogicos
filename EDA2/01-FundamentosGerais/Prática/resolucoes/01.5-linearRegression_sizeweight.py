import pandas as pd  # To read data
data = pd.read_csv('C:/Users/Catarina/Dropbox/Aulas/UPT/2020_2021/2_semestre/EDA2/01/ficheiros CSV/sizeweight.csv')

import matplotlib.pyplot as plt
plt.rcParams['figure.figsize'] = (20.0, 10.0)
plt.scatter('size', 'weight', data=data)
plt.xlabel('size')
plt.ylabel('weight')
plt.show()

X = data['size'].values
Y = data['weight'].values

import numpy as np
# Mean X and Y
mean_x = np.mean(X)
mean_y = np.mean(Y)

# Total number of values
n = len(X)

# Using the formula to calculate m and c
numer = 0
denom = 0
for i in range(n):
    numer += (X[i] - mean_x) * (Y[i] - mean_y)
    denom += (X[i] - mean_x) ** 2
b1 = numer / denom
b0 = mean_y - (b1 * mean_x)

# Print coefficients
print('y =',b1,'* x +', b0)

# Plotting Values and Regression Line
max_x = np.max(X) + 100
min_x = np.min(X) - 100
# Calculating line values x and y
x = np.linspace(min_x, max_x, 1000)
y = b0 + b1 * x

# Ploting Line
plt.rcParams['figure.figsize'] = (20.0, 10.0)
plt.scatter('size', 'weight', data=data)
plt.xlabel('size')
plt.ylabel('weight')
plt.plot(x, y, color='#52b920')
plt.show()

#ss_t is the total sum of squares and ss_r is the total sum of squares of residuals(relate them to the formula).
ss_t = 0
ss_r = 0
for i in range(X.size):
    y_pred = b0 + b1 * X[i]
    ss_t += (Y[i] - mean_y) ** 2
    ss_r += (Y[i] - y_pred) ** 2
r2 = 1 - (ss_r/ss_t)
print("r2 (manual) =",r2)

from sklearn.linear_model import LinearRegression

# Cannot use Rank 1 matrix in scikit learn
X = X.reshape((X.size, 1))
# Creating Model
reg = LinearRegression()
# Fitting training data
reg = reg.fit(X, Y)
# Y Prediction
Y_pred = reg.predict(X)

# Calculating R2 Score
r2_score = reg.score(X, Y)

print("r2 (LinearRegression) =",r2_score)