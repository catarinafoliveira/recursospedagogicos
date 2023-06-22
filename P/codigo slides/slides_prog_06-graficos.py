# pib_a = [497946, 518393, 581837, 601147, 652559, 759178, 810268, 907654, 981593, 1053194, 1188209, 1375146, 1622383,
#        1918162, 2270262, 2628540, 3144265, 4041243, 4998643, 6355729, 8260433, 9924528, 12000915, 15333022, 18828741,
#        23114269, 28247884, 33283267, 39728635, 46935787, 56356228, 64622267, 72651574, 75980307, 82379517, 89028557,
#        94351591, 102330960, 111353381, 119603305, 128414445, 135775009, 142554263, 146067858, 152248388, 158552704,
#        166260469, 175483401, 179102781, 175416437, 179610779, 176096171, 168295569, 170492269, 173053691, 179713159,
#        186489811, 195947210, 205184124, 214374620, 200518859, 214470702, 230526000]
# pib = [x/1000 for x in pib_a]
# anos = [1960, 1961, 1962, 1963, 1964, 1965, 1966, 1967, 1968, 1969, 1970, 1971, 1972, 1973, 1974, 1975, 1976, 1977,
#         1978, 1979, 1980, 1981, 1982, 1983, 1984, 1985, 1986, 1987, 1988, 1989, 1990, 1991, 1992, 1993, 1994, 1995,
#         1996, 1997, 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013,
#         2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022]
#
# plt.plot(anos, pib)
# plt.title("Evolução do PIB em Portugal")
# plt.xlabel("Anos")
# plt.ylabel("PIB (M€)")
# plt.show()

# # importing mplot3d toolkits, numpy and matplotlib
# from mpl_toolkits import mplot3d
# import numpy as np
# import matplotlib.pyplot as plt
#
# fig = plt.figure()
#
# # syntax for 3-D projection
# ax = plt.axes(projection='3d')
#
# # defining all 3 axis
# z = np.linspace(0, 1, 100)
# x = z * np.sin(25 * z)
# y = z * np.cos(25 * z)
#
# # plotting
# ax.plot3D(x, y, z, 'green')
# ax.set_title('3D line plot geeks for geeks')
# plt.show()

# import numpy as np
# from mpl_toolkits.basemap import Basemap
# import matplotlib.pyplot as plt
# from datetime import datetime
# # miller projection
# map = Basemap(projection='mill',lon_0=180)
# # plot coastlines, draw label meridians and parallels.
# map.drawcoastlines()
# map.drawparallels(np.arange(-90,90,30),labels=[1,0,0,0])
# map.drawmeridians(np.arange(map.lonmin,map.lonmax+30,60),labels=[0,0,0,1])
# # fill continents 'coral' (with zorder=0), color wet areas 'aqua'
# map.drawmapboundary(fill_color='aqua')
# map.fillcontinents(color='coral',lake_color='aqua')
# # shade the night areas, with alpha transparency so the
# # map shows through. Use current time in UTC.
# date = datetime.utcnow()
# CS=map.nightshade(date)
# plt.title('Day/Night Map for %s (UTC)' % date.strftime("%d %b %Y %H:%M:%S"))
# plt.show()

# import matplotlib as mpl
# import matplotlib.pyplot as plt
#
# plt.rcParams["figure.figsize"] = [7.50, 3.50]
# plt.rcParams["figure.autolayout"] = True
#
# mpl.use('Qt5Agg')
#
# plt.plot(range(10))
#
# plt.show()

# import matplotlib.pyplot as plt
#
# pib = [497.946, 518.393, 581.837, 601.147, 652.559, 759.178, 810.268, 907.654, 981.593, 1053.194, 1188.209, 1375.146,
#        1622.383, 1918.162, 2270.262, 2628.54, 3144.265, 4041.243, 4998.643, 6355.729, 8260.433, 9924.528, 12000.915,
#        15333.022, 18828.741, 23114.269, 28247.884, 33283.267, 39728.635, 46935.787, 56356.228, 64622.267, 72651.574,
#        75980.307, 82379.517, 89028.557, 94351.591, 102330.96, 111353.381, 119603.305, 128414.445, 135775.009,
#        142554.263, 146067.858, 152248.388, 158552.704, 166260.469, 175483.401, 179102.781, 175416.437, 179610.779,
#        176096.171, 168295.569, 170492.269, 173053.691, 179713.159, 186489.811, 195947.21, 205184.124, 214374.62,
#        200518.859, 214470.702, 230526.0]
# print(pib)
# anos = [1960, 1961, 1962, 1963, 1964, 1965, 1966, 1967, 1968, 1969, 1970, 1971, 1972, 1973, 1974, 1975, 1976, 1977,
#         1978, 1979, 1980, 1981, 1982, 1983, 1984, 1985, 1986, 1987, 1988, 1989, 1990, 1991, 1992, 1993, 1994, 1995,
#         1996, 1997, 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013,
#         2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022]
#
# plt.plot(anos, pib)
# plt.show()

# import matplotlib.pyplot as plt
#
# x = [0, 1, 4, 5, 10, 12, 20]
# y1 = [15, 0, 20, 100, 35, 5, 50]
# y2 = [30, 12, 6, 25, 70, 40, 80]
# plt.plot(x, y1)
# plt.plot(x, y2)
# plt.show()

# # importing mplot3d toolkits, numpy and matplotlib
# from mpl_toolkits import mplot3d
# import numpy as np
# import matplotlib.pyplot as plt
#
# fig = plt.figure()
#
# ax = plt.axes(projection='3d')
#
# z = np.linspace(0, 1, 100)
# x = z * np.sin(25 * z)
# y = z * np.cos(25 * z)
#
# ax.plot3D(x, y, z)
# plt.show()

import matplotlib.pyplot as plt

x = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
y = x
y1 = [i + 1 for i in x]
y2 = [i + 2 for i in x]
y3 = [i + 3 for i in x]
y4 = [i + 4 for i in x]
plt.plot(x, y, label="x")
plt.plot(x, y1, color="red", label="x+1")  # plt.plot(x, y1, c="red")
plt.plot(x, y2, c="red", linewidth=2, label="x+2")  # plt.plot(x, y2, c="red", lw=2)
plt.plot(x, y3, c="red", lw=2, linestyle="--", label="x+3")  # plt.plot(x, y3, c="red", lw=2, ls="--")
plt.plot(x, y4, c="red", lw=2, ls="--", marker="o", label="x+4")

plt.title('Título do gráfico')
plt.xlabel('Título do eixo XX')
plt.ylabel('Título do eixo YY')

plt.legend(loc='upper left')

plt.xlim([-5, 15])
plt.ylim([-10, 20])

plt.xticks([0, 5, 10])
plt.yticks([0, 2, 4, 6, 8, 10, 12, 14])

plt.savefig("graf/graf.png")
plt.savefig("graf/graf.jpg")
plt.savefig("graf/graf.pdf")
