getwd()
setwd("C:/Users/Catarina/Desktop/")
ls()
x=1
ls()
rm(x)
ls()

division <- 3
division
Quadrado <- "azul"
Quadrado
.sub.multiplication <- "a"
.sub.multiplication
accumulative_sum <- 2
accumulative_sum
Sum5<- 10
Sum5

# tot@l <- 1
# Error in tot@l <- 1 : object 'tot' not found
# 5um <- 1
# Error in tot@l <- 1 : object 'tot' not found
# _fine <- 1
# Error: unexpected input in "_"
# FALSE <- 1
# Error in FALSE <- 1 : invalid (do_set) left-hand side to assignment
# .0three <- 1
# Error: unexpected symbol in ".0three"

typeof(2)
# [1] "double"
typeof(2L)
# [1] "integer"
typeof(2i)
# [1] "complex"
typeof('example')
# [1] "character"
typeof('2')
# [1] "character"

x <-20
x
# [1] 20
x = 30
x
# [1] 30
5 -> x
x
# [1] 5

x <- 20
y <- 15
x + y
# [1] 35
x - y
# [1] 5
x * y
# [1] 300
x / y
# [1] 1.333333
x %/% y
# [1] 1
x %% y
# [1] 5
x ^ y
# [1] 3.2768e+19

x < y
# [1] FALSE
x > y
# [1] TRUE
x <= y
# [1] FALSE

x <- c(TRUE, FALSE, 0, 3)
y <- c(FALSE, TRUE, FALSE, TRUE)
!x
# [1] FALSE  TRUE  TRUE FALSE
x & y
# [1] FALSE FALSE FALSE  TRUE
x || y
# [1] TRUE

3 + 4 / 2
# [1] 5
(3 + 4) / 2
# [1] 3.5
3/4/2
# [1] 0.375
3/(4/2)
# [1] 1.5

v <- c(1, 5, 4, 9, 0)
v
# [1] 1 5 4 9 0
v <- c(1, 5.4 , TRUE , "hello")
v
# [1] "1"     "5.4"   "TRUE"  "hello"
v <- 1:7
v
# [1] 1 2 3 4 5 6 7
v <- -2:2
v
# [1] -2 -1  0  1  2
v <- seq(from=1, to = 3,by = 0.2)
v
#  [1] 1.0 1.2 1.4 1.6 1.8 2.0 2.2 2.4 2.6 2.8 3.0
v <- seq(1, 5, length.out = 4)
v
# [1] 1.000000 2.333333 3.666667 5.000000
a <- c (4, 3, 2, 5, 2, 4, 3, 1, 2, 4)
a
#  [1] 4 3 2 5 2 4 3 1 2 4
length(a)
# [1] 10
sort(a)
# [1] 1 2 2 2 3 3 4 4 4 5
unique(a)
# [1] 4 3 2 5 1
table(a)
# a
# 1 2 3 4 5 
# 1 3 2 3 1 
b <- seq (-3, 3, 2)
b
# [1] -3 -1  1  3
b[c(1,4)]
# [1] -3  3
b[b<0]
# [1] -3 -1
b[b>0]
# [1] 1 3
d <- c(first=3, second=0, third=9)
d
# first second  third 
# 3      0      9 
names(d)
# [1] "first"  "second" "third" 
d["second"]
# second 
# 0
d[c("first","third")]
# first third 
# 3     9 
e <- seq (-3, 9, 1)
e
# [1] -3 -2 -1  0  1  2  3  4  5  6  7  8  9
e[2] <- 0
e
#  [1] -3  0 -1  0  1  2  3  4  5  6  7  8  9
e[e<0]<-12
e
#  [1] 12  0 12  0  1  2  3  4  5  6  7  8  9
f <- e[1:4]
f
# [1] 12  0 12  0

m1 <- matrix(1:9, nrow=3, ncol=3)
m1
#       [,1] [,2] [,3]
# [1,]    1    4    7
# [2,]    2    5    8
# [3,]    3    6    9
m2 <- matrix(1:9, nrow=3, ncol=3, byrow = TRUE)
m2
#      [,1] [,2] [,3]
# [1,]    1    2    3
# [2,]    4    5    6
# [3,]    7    8    9
rownames(m2) <- c("L1","L2","L3")
colnames(m2) <- c("C1","C2","C3")
m2
#    C1 C2 C3
# L1  1  2  3
# L2  4  5  6
# L3  7  8  9
m4 <- cbind(c(1,2,3),c(4,5,6))
m4
#      [,1] [,2]
# [1,]    1    4
# [2,]    2    5
# [3,]    3    6
m5 <- rbind(c(7,8,9), c(10,11,12))
m5
#      [,1] [,2] [,3]
# [1,]    7    8    9
# [2,]   10   11   12
m1
#      [,1] [,2] [,3]
# [1,]    1    4    7
# [2,]    2    5    8
# [3,]    3    6    9
m1[1,]
# [1] 1 4 7
m1[,1]
# [1] 1 2 3
m1[-1,]
#      [,1] [,2] [,3]
# [1,]    2    5    8
# [2,]    3    6    9
m1[c(1,2),c(2,3)]
#      [,1] [,2]
# [1,]    4    7
# [2,]    5    8
m1[c(1,2),]
#      [,1] [,2] [,3]
# [1,]    1    4    7
# [2,]    2    5    8
m1[m1%%2==0]
# [1] 2 4 6 8
m2
#    C1 C2 C3
# L1  1  2  3
# L2  4  5  6
# L3  7  8  9
m2[,c("C1","C2")]
#    C1 C2
# L1  1  2
# L2  4  5
# L3  7  8
m2[c("L2","L3"),]
#    C1 C2 C3
# L2  4  5  6
# L3  7  8  9
m2[c(2,3),c("C1","C2")]
#    C1 C2
# L2  4  5
# L3  7  8
m2[2,2]<-10
m2
#    C1 C2 C3
# L1  1  2  3
# L2  4 10  6
# L3  7  8  9
m2[m2<5] <- 0
m2
#    C1 C2 C3
# L1  0  0  0
# L2  0 10  6
# L3  7  8  9
t(m2)
#    L1 L2 L3
# C1  0  0  7
# C2  0 10  8
# C3  0  6  9
m2 <- cbind(m2,c(20,30,40))
m2
#    C1 C2 C3   
# L1  0  0  0 20
# L2  0 10  6 30
# L3  7  8  9 40
m2 <- rbind(m2,c(500,600,700,800))
m2
#     C1  C2  C3    
# L1   0   0   0  20
# L2   0  10   6  30
# L3   7   8   9  40
# 500 600 700 800
m2[-3,]
#     C1  C2  C3    
# L1   0   0   0  20
# L2   0  10   6  30
# 500 600 700 800

x1 <- list(a=2.5, b=TRUE, c=c(1:3))
x1
# $a
# [1] 2.5
# 
# $b
# [1] TRUE
# 
# $c
# [1] 1 2 3
str(x1)
# List of 3
# $ a: num 2.5
# $ b: logi TRUE
# $ c: int [1:3] 1 2 3

x1[1:2]
# $a
# [1] 2.5
# 
# $b
# [1] TRUE
x1[-2]
# $a
# [1] 2.5
# 
# $c
# [1] 1 2 3
x1[c(TRUE, FALSE, FALSE)]
# $a
# [1] 2.5
x2 <- list(nome="John", age=19, speaks=c("English","French"))
x2
# $nome
# [1] "John"
# 
# $age
# [1] 19
# 
# $speaks
# [1] "English" "French"
x2["age"]
# $age
# [1] 19
x2[c("age","speaks")]
# $age
# [1] 19
# 
# $speaks
# [1] "English" "French" 
x2$nome
# [1] "John"
x2$speaks[1]
# [1] "English"
x2$nome="Clair"
x2
# $nome
# [1] "Clair"
# 
# $age
# [1] 19
# 
# $speaks
# [1] "English" "French
x2[["married"]]=FALSE
x2
# $nome
# [1] "Clair"
# 
# $age
# [1] 19
# 
# $speaks
# [1] "English" "French" 
# 
# $married
# [1] FALSE

x3<-data.frame(SN=1:2, Age=c(21,15), Name=c("John","Dora"))
x3
#  SN Age Name
# 1  1  21 John
# 2  2  15 Dora
str(x3)
# 'data.frame':	2 obs. of  3 variables:
# $ SN  : int  1 2
# $ Age : num  21 15
# $ Name: chr  "John" "Dora"
x3["Name"]
#  Name
# 1 John
# 2 Dora
x3[["Name"]]
# [1] "John" "Dora"
x3$Name
# [1] "John" "Dora"
x3$Name[2]
# [1] "Dora"
iris
head(iris,n = 3)
#   Sepal.Length Sepal.Width Petal.Length Petal.Width Species
# 1          5.1         3.5          1.4         0.2  setosa
# 2          4.9         3.0          1.4         0.2  setosa
# 3          4.7         3.2          1.3         0.2  setosa
iris[iris$Species=="setosa",]
x3$Age[1]=20
x3
#   SN Age Name
# 1  1  20 John
# 2  2  15 Dora
x3<-cbind(x3, State=c("NY","FL"))
x3
#   SN Age Name State
# 1  1  20 John    NY
# 2  2  15 Dora    FL

x4<-factor(c("single", "married", "married", "single"))
x4
# [1] single  married married single 
# Levels: married single
x5<-factor(c("single", "married", "married", "single"), levels=c("single","married","divorced"))
x5
# [1] single  married married single 
# Levels: single married divorced
x5[2]="single"
x5
# [1] single  single  married single 
# Levels: single married divorced
x5[2]="widowed"
# Warning message:
#   In `[<-.factor`(`*tmp*`, 2, value = "widowed") :
#   invalid factor level, NA generated
# x5
# [1] single  <NA>    married single 
# Levels: single married divorced

sqrt(2)
# [1] 1.414214
cos(pi)
# [1] -1
abs(-3)
# [1] 3
x<-"abcdef"
x
# [1] "abcdef"
substr(x,start = 2, stop = 4)
# [1] "bcd"
grep("A",c("B","A","C"))
# [1] 2
paste("x",c(1:3),sep="")
# [1] "x1" "x2" "x3"
x<-c(2,5,7)
x
# [1] 2 5 7
mean(x)
# [1] 4.666667
max(x)
# [1] 7
rep(20,5)
# [1] 20 20 20 20 20