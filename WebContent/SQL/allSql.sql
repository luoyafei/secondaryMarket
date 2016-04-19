create database secondaryMarket;

/*
 *
user
userId
userNackName
userPassword
userRealName
userTel
userQQ
userEmail
userSchool
userRole

 * */	

create table user (
	userId int primary key auto_increment,
	userNackName varchar(30) not null,
	userPassword varchar(30) not null,
	userRealName varchar(30),
	userTel varchar(20),
	userQQ varchar(20),
	userEmail varchar(20),
	userSchool varchar(30),
	userRole int default 1,
	constraint unique(userNackName, userPassword)
);