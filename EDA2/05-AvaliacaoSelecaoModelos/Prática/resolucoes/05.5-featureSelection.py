# Univariate feature selection (com teste chi^2):
from sklearn.datasets import load_iris
from sklearn.feature_selection import SelectKBest
from sklearn.feature_selection import chi2
X, y = load_iris(return_X_y=True)
print(X[:5])
X_new = SelectKBest(chi2, k=2).fit_transform(X, y)
print(X_new[:5])