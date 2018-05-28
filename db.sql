create database users;
use users;
create table user_names(id varchar(20) not null, password varchar(8) not null, primary key(password));
insert into user_names values("Mark", "password");
select * from user_names;
