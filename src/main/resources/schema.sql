create database account_transaction;

use account_transaction;

create table accounts(
id int primary key auto_increment,
balance double check (balance > 0) );

create table transactions(
id int primary key auto_increment,
date_time datetime,
amount double check (amount>0),
debit_credit boolean,
from_acc int,
to_acc int,
foreign key (from_acc) references accounts(id),
foreign key (to_acc) references accounts(id)
);



