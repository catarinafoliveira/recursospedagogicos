from sklearn import datasets
iris = datasets.load_iris()
X = iris.data
y = iris.target
print(iris)

from pandas import DataFrame
data = DataFrame(X)
data['y'] = y

from sklearn.cluster import KMeans
from sklearn_extra.cluster import KMedoids
scores_kmeans = []
scores_kmedoids = []
for k in range(2,10):
    kMeans = KMeans(n_clusters=k, random_state=0).fit(X)
    scores_kmeans.append(kMeans.inertia_)
    kmedoids = KMedoids(n_clusters=k, random_state=0).fit(X)
    scores_kmedoids.append(kmedoids.inertia_)

import matplotlib.pyplot as plt
plt.plot(scores_kmeans, label="k-means")
# plt.plot(scores_kmedoids, label = "k-medoids")
plt.xlabel('k')
plt.ylabel('SSE')
plt.title('Evolução SSE com k')
plt.legend()
plt.show()

kmeans = KMeans(n_clusters=3, random_state=0).fit(X)
data['kmeans'] = kmeans.labels_
kmedoids = KMedoids(n_clusters=3, random_state=0).fit(X)
data['kmedoids'] = kmedoids.labels_

from sklearn.neighbors import NearestNeighbors
import numpy as np
neighbors = NearestNeighbors(n_neighbors=8)
neighbors_fit = neighbors.fit(X)
distances, indices = neighbors_fit.kneighbors(X)
distances = np.sort(distances, axis=0)
distances = distances[:,1]
plt.plot(distances)
plt.show()

from sklearn.cluster import DBSCAN
dbscan = DBSCAN(eps=0.4, min_samples=8).fit(X)
data['dbscan'] = dbscan.labels_

from sklearn.cluster import AgglomerativeClustering
hierarchical_AgglomerativeClustering = AgglomerativeClustering(n_clusters=3, affinity='euclidean', linkage='single')
hierarchical_AgglomerativeClustering.fit_predict(X)
data['agglomerative'] = hierarchical_AgglomerativeClustering.labels_


fig, axes = plt.subplots(1, 5, figsize=(40,5))
axes[0].scatter(X[:, 0], X[:, 1], c=y, cmap='gist_rainbow',edgecolor='k', s=150)
axes[1].scatter(X[:, 0], X[:, 1], c=data['kmeans'], cmap='jet',edgecolor='k', s=150)
axes[2].scatter(X[:, 0], X[:, 1], c=data['kmedoids'], cmap='jet',edgecolor='k', s=150)
axes[3].scatter(X[:, 0], X[:, 1], c=data['dbscan'], cmap='jet',edgecolor='k', s=150)
axes[4].scatter(X[:, 0], X[:, 1], c=data['agglomerative'], cmap='jet',edgecolor='k', s=150)
for i in range(0,2):
    axes[i].set_xlabel('Sepal length', fontsize=18)
    axes[i].set_ylabel('Sepal width', fontsize=18)
    axes[i].tick_params(direction='in', length=10, width=5, colors='k', labelsize=20)
axes[0].set_title('Actual', fontsize=18)
axes[1].set_title('Predicted - kmeans', fontsize=18)
axes[2].set_title('Predicted - kmedoids', fontsize=18)
axes[3].set_title('Predicted - dbscan', fontsize=18)
axes[4].set_title('Predicted - agglomerative', fontsize=18)
plt.show()

print(data)
