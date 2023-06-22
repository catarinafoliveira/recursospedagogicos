from sklearn import linear_model
reg = linear_model.Lasso(alpha=0.1)
print(reg.fit([[0, 0], [1, 1]], [0, 1])) # Lasso(alpha=0.1)
print(reg.predict([[1, 1]])) # array([0.8])