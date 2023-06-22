from sklearn import datasets
iris = datasets.load_iris()

from sklearn.model_selection import train_test_split
X_train, X_test, y_train, y_test = train_test_split(iris.data, iris.target)

results = []
from sklearn.ensemble import AdaBoostClassifier
from sklearn.model_selection import RepeatedStratifiedKFold
from sklearn.model_selection import cross_val_score
from numpy import mean
for n_estimator in [1, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100]:
    print(n_estimator)
    model = AdaBoostClassifier(n_estimators=n_estimator)
    cv = RepeatedStratifiedKFold(n_splits=10, n_repeats=3, random_state=1)
    n_scores = cross_val_score(model, X_train, y_train, scoring='accuracy', cv=cv, n_jobs=-1, error_score='raise')
    res = [n_estimator, mean(n_scores)]
    results.append(res)

from pandas import DataFrame
results = DataFrame(results)
results.columns =['Nr estimators', 'Accuracy']

from matplotlib import pyplot
import seaborn
seaborn.set(style='ticks')
fg = seaborn.FacetGrid(data=results, aspect=1.61)
fg.set(ylim=(results['Accuracy'].min()-0.0025, results['Accuracy'].max()+0.0025))
fg.map(pyplot.plot, 'Nr estimators', 'Accuracy', marker='.').add_legend()
fg.savefig('adaboost.png')