use mybatis;
create table t_account
(
    id       int primary key auto_increment,
    username varchar(11),
    password varchar(11),
    age      int
);

create table classes
(
    id   int primary key auto_increment,
    name varchar(11)
);

create table student
(
    id   int primary key auto_increment,
    name varchar(11),
    cid  int
);


create table customer
(
    id   int primary key auto_increment,
    name varchar(11)
);

create table goods
(
    id   int primary key auto_increment,
    name varchar(11)
);

create table customer_goods
(
    id  int primary key auto_increment,
    cid int,
    gid int
);