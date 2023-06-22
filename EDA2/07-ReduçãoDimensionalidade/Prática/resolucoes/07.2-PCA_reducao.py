# Ler o dataset mnist_784
import pandas as pd
df = pd.read_csv('C:/Users/Catarina/Desktop/Aulas/Materia/DataMining/07-ReduçãoDimensionalidade/CSV/mnist_784.csv');

# Separar o dataset em conjuntos de treino e teste
from sklearn.model_selection import train_test_split
# test_size: what proportion of original data is used for test set
train_img, test_img, train_lbl, test_lbl = train_test_split(df.iloc[:,:-1], df.iloc[: , -1], test_size=1/7.0, random_state=0)

# Standardizar o dataset
from sklearn.preprocessing import StandardScaler
scaler = StandardScaler() # Fit on training set only.
scaler.fit(train_img) # Apply transform to both the training set and the test set.
train_img = scaler.transform(train_img)
test_img = scaler.transform(test_img)

# Importar e aplicar PCA (no trainset)
from sklearn.decomposition import PCA # Make an instance of the Model
pca = PCA(.95)
pca.fit(train_img)

# Aplicar o mapeamento (transformação) aos conjuntos de treino e de teste
train_img = pca.transform(train_img)
test_img = pca.transform(test_img)

# Aplicar Logistic Regression aos dados transformados
from sklearn.linear_model import LogisticRegression
logisticRegr = LogisticRegression(solver = 'lbfgs')
logisticRegr.fit(train_img, train_lbl)

# Prever para apenas uma observação (imagem)
print("Previsao da imagem 0:")
print(logisticRegr.predict(test_img[0].reshape(1,-1)))

print("Previsao das 10 primeiras imagens:")
# Prever múltiplas observações
print(logisticRegr.predict(test_img[0:10]))

# Medir a performance do modelo
print("Performance do modelo:")
print(logisticRegr.score(test_img, test_lbl))

