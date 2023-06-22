from sklearn import datasets
iris = datasets.load_iris()

from sklearn.model_selection import train_test_split
X_train, X_test, y_train, y_test = train_test_split(iris.data, iris.target)

results = []
from sklearn.ensemble import RandomForestClassifier
from sklearn.model_selection import RepeatedStratifiedKFold
from sklearn.model_selection import cross_val_score
from numpy import mean
for n_estimator in [1, 50, 100, 250, 500, 750, 1000, 2500, 5000]:
    for features in ['auto', 'sqrt', 'log2']:
        print(n_estimator, features)
        model = RandomForestClassifier(n_estimators=100, max_features="auto")
        cv = RepeatedStratifiedKFold(n_splits=10, n_repeats=3, random_state=1)
        n_scores = cross_val_score(model, X_train, y_train, scoring='accuracy', cv=cv, n_jobs=-1, error_score='raise')
        res = [n_estimator, features, mean(n_scores)]
        results.append(res)

from pandas import DataFrame
results = DataFrame(results)
results.columns =['Nr estimators', 'Features', 'Accuracy']

from matplotlib import pyplot
import seaborn
seaborn.set(style='ticks')
fg = seaborn.FacetGrid(data=results, hue='Features', aspect=1.61)
fg.set(ylim=(results['Accuracy'].min()-0.0025, results['Accuracy'].max()+0.0025))
fg.map(pyplot.plot, 'Nr estimators', 'Accuracy', marker='.').add_legend()
fg.savefig('randomForests.png')