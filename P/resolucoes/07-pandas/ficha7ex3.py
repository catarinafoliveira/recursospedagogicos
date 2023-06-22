import pandas as pd
import matplotlib.pyplot as plt

# 3.1
df = pd.read_csv("vendas.csv")

# 3.2
print(df.head(7))
print(df.info())  # Nulls em "Vendas"
df["Vendas"].fillna(df["Vendas"].mean(), inplace=True)

# 3.3
df.plot()
plt.show()

# 3.4
print(df.loc[df['Vendas'] == df['Vendas'].max(), ["Mes", "Loja", "Categoria"]])

# 3.5
print(df.loc[df['Vendas'] == df['Vendas'].min(), ["Mes", "Loja", "Categoria"]])

# 3.6
aposAumento = df["Vendas"] * 1.15
plt.plot(df["Vendas"])
plt.plot(aposAumento)
plt.legend(["Atual", "Apos aumento de 15%"])
plt.show()

# 3.7.1
nomesLojas = ["Arrabida", "Maia", "Norte"]

# 3.7.2
arrabida = df.loc[df["Loja"] == "Arrabida"].reset_index()
maia = df.loc[df["Loja"] == "Maia"].reset_index()
norte = df.loc[df["Loja"] == "NorteShop"].reset_index()

# 3.7.3
print("Média Arrabida", arrabida["Vendas"].mean())
print("Mediana Arrabida", arrabida["Vendas"].median())
print("Desv.Pad Arrabida", arrabida["Vendas"].std())

print("Média Maia", maia["Vendas"].mean())
print("Mediana Maia", maia["Vendas"].median())
print("Desv.Pad Maia", maia["Vendas"].std())

print("Média Norte", norte["Vendas"].mean())
print("Mediana Norte", norte["Vendas"].median())
print("Desv.Pad Norte", norte["Vendas"].std())

# 3.7.4
vendasLojas = [arrabida["Vendas"].sum(), maia["Vendas"].sum(), norte["Vendas"].sum()]
print(vendasLojas)

# 3.7.5
plt.plot(arrabida["Vendas"])
plt.plot(maia["Vendas"])
plt.plot(norte["Vendas"])
plt.title("Vendas por Loja")
plt.legend(nomesLojas)
plt.xlabel("Meses e Categorias")
plt.ylabel("Vendas")
plt.show()

# 3.7.6
plt.bar(nomesLojas, vendasLojas)
plt.show()