# Remover features com baixa variância (mesmo valor em mais que 80% dos dados):
from sklearn.feature_selection import VarianceThreshold
X = [[0, 0, 1], [0, 1, 0], [1, 0, 0], [0, 1, 1], [0, 1, 0], [0, 1, 1]]
sel = VarianceThreshold(threshold=(.8 * (1 - .8)))
print(sel.fit_transform(X))
# [[0 1]
#  [1 0]
#  [0 0]
#  [1 1]
#  [1 0]
#  [1 1]]