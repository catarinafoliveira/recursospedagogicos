# import math
# import sys
# lista = [1, 4, 9, 16, 25,36,49,64,91,100]
# listG=(math.sqrt(x) for x in lista)
# listC=[math.sqrt(x) for x in lista]
# print(sys.getsizeof(listG))
# print(sys.getsizeof(listC))

# import math
#
# lista = [1, 4, 9, 16, 25]
#
# list2 = map(math.sqrt, lista)
# print(list(list2))  # [1.0, 2.0, 3.0, 4.0, 5.0]

# def dobro(x):
#     return x * 2
#
# lista = [1, 4, 9, 16, 25]
#
# lista2 = map(dobro, lista)
# print(list(lista2))  # [2, 8, 18, 32, 50]

# import operator
# import functools
#
# lista = [1, 4, 9, 16, 25]
# resultado = functools.reduce(operator.add, lista)
# print(resultado) # 55

# import functools
#
# def somar(x,y):
#     return x+y
#
# lista = [1, 4, 9, 16, 25]
# resultado = functools.reduce(somar, lista)
# print(resultado) # 55


# def ePar(x):
#     return x % 2 == 0
#
# lista = [1, 4, 9, 16, 25]
# lista2 = filter(ePar, lista)
# print(list(lista2))  # [4, 16]

# x = lambda a : a * 10
# print(x(5))

# import math
#
#
#
# lista = [1, 4, 9, 16, 25]
# lista2 = [math.sqrt(x) for x in lista]
# print(lista2)  # [1.0, 2.0, 3.0, 4.0, 5.0]

# def dobro(a):
#     return a * 2
#
# lista = [1, 4, 9, 16, 25]
# lista2 = [dobro(x) for x in lista]
# print(lista2)  # [2, 8, 18, 32, 50]

# import math
#
# lista = [1, 4, 9, 16, 25]
# lista2 = [math.sqrt(x) for x in lista if x % 2 == 1]
# print(lista2)  # [1.0, 3.0, 5.0]

# def dobro(a):
#     return a * 2
#
# lista = [1, 4, 9, 16, 25]
# lista2 = [dobro(x) for x in lista if x % 2 == 1 and x > 5]
# print(lista2)  # [18, 50]

# import math
#
# d = {"a": 1, "b": 4, "c": 9, "d": 16, "e": 25}
# d2 = {k: math.sqrt(v) for (k, v) in d.items()}
# print(d2)  # {'a': 1.0, 'b': 2.0, 'c': 3.0, 'd': 4.0, 'e': 5.0}

# import math
#
# d = {"a": 1, "b": 4, "c": 9, "d": 16, "e": 25}
# d2 = {k: math.sqrt(v) for (k, v) in d.items() if v % 2 == 1}
# print(d2)  # {'a': 1.0, 'c': 3.0, 'e': 5.0}

# def dobro(a):
#     return a * 2
#
# d = {"a": 1, "b": 4, "c": 9, "d": 16, "e": 25}
# d2 = {k: dobro(v) for (k, v) in d.items()}
# print(d2)
# # {'a': 2, 'b': 8, 'c': 18, 'd': 32, 'e': 50}


# def dobro(a):
#     return a * 2
#
# d = {"a": 1, "b": 4, "c": 9, "d": 16, "e": 25}
# d2 = {k: dobro(v) for (k, v) in d.items() if v % 2 == 1 and v > 5}
# print(d2)  # {'c': 18, 'e': 50}

# def funcao():
#     yield 1
#     yield 2
#     yield 3
#
# print(list(funcao()))

# def geradorParesAte(limite):
#     for x in range(limite + 1):
#         if x % 2 == 0:
#             yield x
#
# pares10 = geradorParesAte(10)
# print(list(pares10))  # [0, 2, 4, 6, 8, 10]

import math
import sys

lista = [1, 4, 9, 16, 25, 36, 49, 64, 81]

listaG = (math.sqrt(x) for x in lista)
listaC = [math.sqrt(x) for x in lista]

print(list(listaG)) # [1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0]
print(listaC) # [1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0]

print(sys.getsizeof(listaG)) # 104
print(sys.getsizeof(listaC)) # 184
