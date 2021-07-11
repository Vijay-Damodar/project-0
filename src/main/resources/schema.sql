create database accounts_db;

use accounts_db;

create table accounts(
num varchar(255) primary key,
balance double check (balance > 0) );

insert into accounts values("1", 10000.0);
insert into accounts values("2", 10000.0);
insert into accounts values("3", 10000.0);
insert into accounts values("4", 10000.0);
insert into accounts values("5", 10000.0);

select * from accounts;