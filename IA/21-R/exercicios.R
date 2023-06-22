x<-1
y<-2
.z <- 3
ls()
rm(list=ls())
rm(.z)

month.name
letters
pi

x <- 1
y = 2
3 -> z
ls()
rm(list=ls())

x<-4
y<-5
x^5
x%%y
x%/%y
x>y
x==y
x!=y
a<-c(TRUE,FALSE)
b<-c(FALSE,TRUE)
a & b
a || b

v1 <- c(3, 3, 5, 2, 4, 4, 3, 1, 3, 2, 1, 5, 5, 4, 2, 1, 3, 2, 2, 4)
v1
v2 <- 1:20
v3 <- seq(5,10,0.5)
v4 <- c(primeiro=10, segundo=20, terceiro=30)
length(v1)
sort(v1,decreasing = T)
unique(v1)
table(v1)
v1[c(1,3,5)]
v1[v1%%2==0]
v4["primeiro"]
v4[c("primeiro","segundo")]
v2[5] <-100
v2[v2<10]<-500
v5 <- v2[3:9]

m1 <- matrix(1:12, nrow=3, ncol=4)
rownames(m1) <- c("Linha1","Linha2","Linha3")
colnames(m1) <- c("Coluna1","Coluna2","Coluna3", "Coluna4")
m1[,2]
m1[c(2,3),]
m1[,-2]
m1[-1,]
m1[c(1,2),c(3,4)]
m1[m1%%2==1]
m1[,c("Coluna1","Coluna2")]
m1[c("Linha1","Linha2"),]
m1[c(2,3),c("Coluna1","Coluna2")]
m1[2,3]<-27
m1[m1<6] <- 42
t(m1)
m1 <- cbind(m1,c(100,200,300))
m1 <- rbind(m1,c(1111,2222,3333,4444,5555))
m1


l1 <- list("x"="abc", "y"=5, "c"=1:5)
l1
str(l1)
l1[1:2]
l1[-1]
l1[c(T,F,T)]
l2 = list("name"="John", "age"=19,"speaks"=c("English","French"))
l2
l2$name
l2[c("name","age")]
l2$age
l2$speaks[2]
l2$age=18
l2
l2["married"]=FALSE
l2
