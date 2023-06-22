# ficheiro = open("test.txt", "r")
# print(ficheiro.name)
# ficheiro.close()
#
# with open("test.txt", "r") as ficheiro:
#     print(ficheiro.name)
#
# with open("test.txt", "r") as ficheiro:
#     ficheiro.read() # lê o ficheiro completo
#     ficheiro.readline() # lê uma linha do ficheiro
#     ficheiro.readlines() # lê o ficheiro completo como uma lista de linhas
#     ficheiro.read(5) # lê 5 carateres
#
# with open("test.txt", "r") as ficheiro:
#     for linha in ficheiro:
#         ...
#
# with open("test.txt","w") as ficheiro:
#     ficheiro.write("Era\n")
#
# with open("test.txt","a") as ficheiro:
#     ficheiro.write("uma\n")
#     ficheiro.write("vez\n")
#
# with open("test.txt","a") as ficheiro:
#     ficheiro.writelines(["em\n","Marte\n"])

# import csv

# dadosObtidos = []
# with open("dados.csv", "r", encoding="utf8") as ficheiro:
#     dicionario = csv.DictReader(ficheiro)
#     for linha in dicionario:
#         dadosObtidos.append(linha)
#
# print(dadosObtidos)

# estacaoCampanha = {
#     'CodPostal': '4300',
#     'Cidade': 'Porto',
#     'Freguesia': 'Campanhã',
#     'Morada': 'Largo da Estação',
#     'Instituição': 'Estação de Campanhã'
# }
# import csv
#
# with open("dados.csv", "a", encoding="utf8", newline='\n') as ficheiro:
#     writer = csv.DictWriter(ficheiro, fieldnames=estacaoCampanha.keys())
#     writer.writerow(estacaoCampanha)

import json

with open("dados.json", "r", encoding="utf8") as ficheiro:
    dicionario = json.load(ficheiro)

print(dicionario)
#
estacaoCampanha = {
    'CodPostal': '4300',
    'Cidade': 'Porto',
    'Freguesia': 'Campanhã',
    'Morada': 'Largo da Estação',
    'Instituição': 'Estação de Campanhã'
}
#
# dicionario["instituições"].append(estacaoCampanha)
# with open("dados.json", "w", encoding="utf8", newline='\n') as ficheiro:
#     writer = json.dump(dicionario, ficheiro)



# import xml.etree.ElementTree as ET
# arvore = ET.parse('dados.xml')
# raiz = arvore.getroot()
# for ramo in raiz:
#     print(ramo.tag, "=", ramo.text)

# import xmltodict
# #
# with open('dados.xml', 'r', encoding='utf-8') as ficheiro:
#     my_xml = ficheiro.read()
#     dicionario = xmltodict.parse(my_xml)
#
# print(dicionario)
#
# dicionario["dados"]["instituição"].append(estacaoCampanha)
# xml_string = xmltodict.unparse(dicionario)
#
# print(xml_string)
#
# with open('dados.xml', 'w', encoding='utf-8') as ficheiro:
#     ficheiro.write(xml_string)
#
# from urllib.request import urlopen
#
# url = "http://olympus.realpython.org/profiles/aphrodite"
# page = urlopen(url)
# html_bytes = page.read()
# html = html_bytes.decode("utf-8")
# print(html)
