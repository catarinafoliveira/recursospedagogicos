# import funcoes
#
# print(funcoes.soma(2,3))

# from funcoes import dobro
#
# print(dobro(2))

# from auxiliar import funcoes as f
#
# print(f.soma(2,3))
# print(f.dobro(2))

def recursiva(x):
    if x<5:
        print(x)
        recursiva(x+1)

recursiva(1)
# import sys
# print(sys.getrecursionlimit())