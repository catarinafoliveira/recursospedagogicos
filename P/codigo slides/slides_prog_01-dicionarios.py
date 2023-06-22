quantidade = {
    "bananas": 25,
    "peras": 12,
    "laranjas": 10
}

# print(quantidade) # {'bananas': 25, 'peras': 12, 'laranjas': 10}

# print(quantidade["peras"]) # 12

quantidade["bananas"] = 50

quantidade["peras"] += 15

quantidade["mangas"] = 20

# print(quantidade)
# {'bananas': 50, 'peras': 27, 'laranjas': 10, 'mangas': 20}

# quantidade = [("bananas", 25), ("peras", 12), ("laranjas", 10)]
# for (fruta, unidades) in quantidade:
#     if (fruta == "laranjas"):
#         print(unidades)
#
# quantidade = [("bananas", 25), ("bananas", 12), ("bananas", 10)]

# print(len(quantidade))             # 4
# print(quantidade.keys())           # dict_keys(['bananas', 'peras', 'laranjas', 'mangas'])
# print(quantidade.values())         # dict_values([50, 27, 10, 20])
# print(quantidade.items())          # dict_items([('bananas', 50), ('peras', 27), ('laranjas', 10), ('mangas', 20)])
# print(quantidade.get("peras"))     # 27
# print(quantidade)                  # {'bananas': 50, 'peras': 27, 'laranjas': 10, 'mangas': 20}
# del quantidade["mangas"]
# print(quantidade)                  # {'bananas': 50, 'peras': 27, 'laranjas': 10}
# print("bananas" in quantidade)     # True
# print("bananas" not in quantidade) # False
# print("macas" in quantidade)       # False
# print("macas" not in quantidade)   # True
# print(list(quantidade.keys()))     # ['bananas', 'peras', 'laranjas']
# print(list(quantidade.values()))   # [50, 27, 10]

# for fruta in quantidade.keys():
#     print("A quantidade de",fruta,"é",quantidade[fruta])
# # A quantidade de bananas é 50
# # A quantidade de peras é 27
# # A quantidade de laranjas é 10
# # A quantidade de mangas é 20
#
# for fruta in quantidade:
#     print("A quantidade de",fruta,"é",quantidade[fruta])
# # A quantidade de bananas é 50
# # A quantidade de peras é 27
# # A quantidade de laranjas é 10
# # A quantidade de mangas é 20

# for f, q in quantidade.items():
#     print("A quantidade de", f, "é", q)
# # A quantidade de bananas é 50
# # A quantidade de peras é 27
# # A quantidade de laranjas é 10
# # A quantidade de mangas é 20

# for fruta in quantidade:
#     print("{0:10} {1}".format(fruta, quantidade[fruta]))
# # bananas    50
# # peras      27
# # laranjas   10
# # mangas     20

# ordQuant = [(quantidade[fruta], fruta) for fruta in quantidade]
# ordQuant.sort()
# print(ordQuant)
# for q, f in ordQuant:
#     print("{0:10} {1}".format(f, q))
# # laranjas   10
# # mangas     20
# # peras      27
# # bananas    50

# ordQuant = [(fruta, quantidade[fruta]) for fruta in quantidade]
# ordQuant.sort()
# for f, q in ordQuant:
#     print("{0:10} {1}".format(f, q))
# # bananas    50
# # laranjas   10
# # mangas     20
# # peras      27
