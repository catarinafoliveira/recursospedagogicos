# Carregar o dataset iris e aplicar SVM:
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn import datasets
from sklearn import svm

X, y = datasets.load_iris(return_X_y=True)
print(X.shape, y.shape) # (150, 4) (150,)

# Definir conjunto de treino como 60% do dataset e de teste como 40%:
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.4, random_state=0)

print(X_train.shape, y_train.shape) # (90, 4) (90,)
print(X_test.shape, y_test.shape) # (60, 4) (60,)

clf = svm.SVC(kernel='linear', C=1).fit(X_train, y_train)
print(clf.score(X_test, y_test)) # 0.9666666666666667

# Aplicar 5-fold cross-validation
from sklearn.model_selection import cross_val_score
clf = svm.SVC(kernel='linear', C=1, random_state=42)
scores = cross_val_score(clf, X, y, cv=5)
print(scores) # [0.96666667 1.         0.96666667 0.96666667 1.        ]
print("%0.2f accuracy with a standard deviation of %0.2f" % (scores.mean(), scores.std())) # 0.98 accuracy with a standard deviation of 0.02

# Alterar a métrica usada para cálculo do score
from sklearn import metrics
scores = cross_val_score(clf, X, y, cv=5, scoring='f1_macro')
print(scores) # [0.96658312 1. 0.96658312 0.96658312 1.]

# Alterar o método de cross-validation
from sklearn.model_selection import ShuffleSplit
n_samples = X.shape[0]
cv = ShuffleSplit(n_splits=5, test_size=0.3, random_state=0)
print(cross_val_score(clf, X, y, cv=cv)) # [0.97777778 0.97777778 1. 0.95555556 1.]

# Usar várias métricas para avaliar cross-validation:
from sklearn.model_selection import cross_validate
from sklearn.metrics import recall_score
scoring = ['precision_macro', 'recall_macro']
clf = svm.SVC(kernel='linear', C=1, random_state=0)
scores = cross_validate(clf, X, y, scoring=scoring)
print(scores)
# {
#     'fit_time': array([0.01562285, 0., 0., 0., 0.]),
#     'score_time': array([0., 0., 0., 0., 0.]),
#     'test_precision_macro': array([0.96969697, 1., 0.96969697, 0.96969697, 1.]),
#     'test_recall_macro': array([0.96666667, 1., 0.96666667, 0.96666667, 1.])
# }