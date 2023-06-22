from sklearn import datasets
iris = datasets.load_iris()

from sklearn.model_selection import train_test_split
X_train, X_test, y_train, y_test = train_test_split(iris.data, iris.target)

from sklearn.dummy import DummyClassifier
from sklearn.linear_model import Perceptron
from sklearn.tree import DecisionTreeClassifier
from sklearn.neighbors import KNeighborsClassifier
possible_base_estimators = [DummyClassifier(),
                            Perceptron(tol=1e-3),
                            DecisionTreeClassifier(),
                            KNeighborsClassifier()]

results = []
from sklearn.ensemble import BaggingClassifier
from sklearn.model_selection import RepeatedStratifiedKFold
from sklearn.model_selection import cross_val_score
from numpy import mean
for base_estimator in possible_base_estimators:
    for n_estimators in [1, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100]:
        print(base_estimator, n_estimators)
        model = BaggingClassifier(n_estimators=n_estimators, base_estimator=base_estimator, random_state=1)
        cv = RepeatedStratifiedKFold(n_splits=10, n_repeats=3, random_state=1)
        n_scores = cross_val_score(model, X_train, y_train, scoring='accuracy', cv=cv, n_jobs=-1, error_score='raise')
        res = [base_estimator, n_estimators, mean(n_scores)]
        results.append(res)

from pandas import DataFrame
results = DataFrame(results)
results.columns =['Base estimator','Nr estimators','Accuracy']

from  matplotlib import pyplot
import seaborn
seaborn.set(style='ticks')
fg = seaborn.FacetGrid(data=results, hue='Base estimator', aspect=1.61)
fg.map(pyplot.plot, 'Nr estimators', 'Accuracy', marker='.').add_legend()
fg.savefig('bagging_comp.png')
