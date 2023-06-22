import pandas as pd
from matplotlib import pyplot as plt

df = pd.read_csv("inventario.csv")
# print(df)

# print(df['Preço'])
# print(df.head(3))
# print(df.tail(3))
# print(df.info())
# print(df['Quantidade'] >= 5000)
# print(df.loc[df['Quantidade'] >= 5000])
# print(df.loc[df['Quantidade'] >= 5000,'Preço'])
# print(df.iloc[0:2,:])
# print(df.iloc[:, 0:2])
# print(df.iloc[0:2, 0:2])


# df['Preço'] = 1.5
# df.loc[df['Quantidade'] >= 5000, 'Preço'] = 1.5

# df.fillna(888, inplace = True)
# novoDF = df.fillna(888)
# print(novoDF)

# df["Quantidade"].fillna(888, inplace = True)
# novoDF = df.dropna()
# print(novoDF)
# df.dropna(inplace = True)

# print(df)

# print(df['Preço'].mean())
# print(df.iloc[1,1:3].mean())

# print(df['Preço'] * df['Quantidade'])
# print(df.iloc[0, 1:3] + df.iloc[1, 1:3])

# print(df.describe())
# print(df.iloc[:, 1:3].corr())

# df.plot()
# plt.show()

df.plot(x = 'Preço', y = 'Quantidade', kind='bar')
plt.show()
