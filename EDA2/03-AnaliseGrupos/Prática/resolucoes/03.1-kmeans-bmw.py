import pandas as pd
data = pd.read_csv("C:/Users/Catarina/Dropbox/Aulas/UPT/2020_2021/2_semestre/EDA2/03-AnaliseGrupos/csv/bmw-browsers.csv")

# scores_kmeans = []
# for k in range(2,10):
#     kMeans = KMeans(n_clusters=k, random_state=0).fit(data)
#     scores_kmeans.append(kMeans.inertia_)
#
# import matplotlib.pyplot as plt
# plt.plot(scores_kmeans, label="k-means")
# plt.xlabel('k')
# plt.ylabel('SSE')
# plt.title('Evolução SSE com k')
# plt.legend()
# plt.show()

from sklearn.cluster import KMeans
kmeans = KMeans(n_clusters=5, random_state=0).fit(data)

print("score:",kmeans.score(data))

import numpy as np
np.set_printoptions(formatter={'float_kind': '{:.3f}'.format})
print("Centroids:")
print(kmeans.cluster_centers_)

data['kmean'] = kmeans.labels_
print("Clustered instances:")
print(data['kmean'].value_counts())
