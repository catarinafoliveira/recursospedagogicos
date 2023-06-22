import pandas as pd  # To read data

data = pd.read_csv('C:/Users/Catarina/Dropbox/Aulas/UPT/2020_2021/2_semestre/EDA2/01/ficheiros CSV/zoo.csv')  # load data set
# print(data)

X = data[['hair', 'feathers', 'eggs', 'milk', 'airborne', 'aquatic', 'predator', 'toothed', 'backbone',
          'breathes', 'venomous', 'fins', 'legs', 'tail', 'domestic', 'catsize']]
Y = data[['type']]

from sklearn import tree
clf = tree.DecisionTreeClassifier()
clf = clf.fit(X, Y)

from sklearn.tree import export_text
r = export_text(clf, feature_names=['hair', 'feathers', 'eggs', 'milk', 'airborne', 'aquatic', 'predator', 'toothed',
                                    'backbone',
                                    'breathes', 'venomous', 'fins', 'legs', 'tail', 'domestic', 'catsize'])
print(r)

# Create DOT data
dot_data = tree.export_graphviz(clf, out_file=None,
                                feature_names=['hair', 'feathers', 'eggs', 'milk', 'airborne', 'aquatic', 'predator',
                                               'toothed', 'backbone', 'breathes', 'venomous', 'fins', 'legs', 'tail',
                                               'domestic', 'catsize'],
                                class_names=clf.classes_)

# Draw graph
import pydotplus
graph = pydotplus.graph_from_dot_data(dot_data)

# Show graph
from IPython.display import Image

Image(graph.create_png())
graph.write_pdf("dt.pdf")

from sklearn.model_selection import cross_val_predict
y_pred = cross_val_predict(clf, X, Y, cv=10)

from sklearn.metrics import classification_report, confusion_matrix
print(confusion_matrix(Y, y_pred))
print(classification_report(Y, y_pred))
from sklearn.model_selection import cross_validate
from statistics import mean
cv_results = cross_validate(clf, X, Y, cv=10)
print("Accuracy:", mean(cv_results['test_score']))