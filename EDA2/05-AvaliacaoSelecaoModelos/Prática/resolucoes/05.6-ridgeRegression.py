# Ridge Regression
from sklearn import linear_model
reg = linear_model.Ridge(alpha=.5)
print(reg.fit([[0, 0], [0, 0], [1, 1]], [0, .1, 1])) # Ridge(alpha=0.5)
print(reg.coef_) # [0.34545455 0.34545455]
print(reg.intercept_) # 0.13636363636363638