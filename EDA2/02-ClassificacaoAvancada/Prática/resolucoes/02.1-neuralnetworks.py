# instalar: keras, theano, tensorflow
# conda install keras

# definir as libraries a importar
from numpy import loadtxt
from keras.models import Sequential
from keras.layers import Dense
from keras.utils.vis_utils import plot_model

# carregar o dataset: https://raw.githubusercontent.com/jbrownlee/Datasets/master/pima-indians-diabetes.data.csv
# dataset info: https://raw.githubusercontent.com/jbrownlee/Datasets/master/pima-indians-diabetes.names
dataset = loadtxt('C:/Users/Catarina/Desktop/Aulas/Materia/DataMining/02-ClassificacaoAvancada/csv/pima-indians-diabetes.data.csv', delimiter=',')
# split into input (X) and output (y) variables
X = dataset[:,0:8]
y = dataset[:,8]

# define the keras model
model = Sequential()
model.add(Dense(12, input_dim=8, activation='relu'))
model.add(Dense(8, activation='relu'))
model.add(Dense(1, activation='sigmoid'))

# compile the keras model
model.compile(loss='binary_crossentropy', optimizer='adam', metrics=['accuracy'])

# fit the keras model on the dataset
model.fit(X, y, epochs=150, batch_size=10)

# evaluate the keras model
_, accuracy = model.evaluate(X, y)
print(accuracy)
# print('Accuracy: %.2f' % (accuracy * 100))
#
# # make probability predictions with the model
# predictions = model.predict(X)
# # round predictions
# rounded = [round(x[0]) for x in predictions]
# print(predictions)
#
# # model = Sequential()
# # model.add(Dense(2, input_dim=1, activation='relu'))
# # model.add(Dense(1, activation='sigmoid'))
# print(model.summary())
# plot_model(model, to_file='model_plot.png', show_shapes=True, show_layer_names=True)
#
