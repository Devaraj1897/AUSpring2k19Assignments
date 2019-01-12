create database accolite_cab_service;
use accolite_cab_service;

create table Customer(
ssn int primary key,
fname varchar(255) not null,
lname varchar(255) not null,
phoneNumber numeric(10) not null,
paytmAccount varchar(255) not null);


create table taxiDriver(
driverId varchar(255) primary key,
driverfirstName varchar(255) not null,
driverlastName varchar(255) not null,
driverphoneNumber numeric(10) not null,
driverAddress varchar(255) not null);

insert into taxiDriver values("D001","ABCD","X",9789789872,"Baker street");

create table taxi(
taxiNumber int primary key,
taxiOwnerId varchar(255),
taxiModel varchar(255) not null,
dateOfregister date not null,
foreign key(taxiOwnerId) references taxiDriver(driverId));

create table rents(
dropLocation varchar(255) not null,
pickupLocation varchar(255) not null,
taxiId int,
cssn int,
foreign key(taxiId) references taxi(taxiNumber),
foreign key(cssn) references customer(ssn));

create table accoliteBase(
id int primary key,
cssn int,
foreign key(cssn) references customer(ssn),
taxidriverId varchar(255),
foreign key(taxidriverId) references taxidriver(driverId));
 
 describe customer;
 describe taxidriver;
 describe taxi;
 describe rents;
 describe accolitebase;
 
 
 
 alter table rents
 add primary key(cssn,taxiId);
 
 show tables;
 describe customer;
 
 insert into customer values(9667777,"Shruthi","G",9988724654,"pay888tm77"); 
 select * from customer where phoneNumber LIKE "%654";
 
 
 select max(ssn) from customer;
 
 
 select * from customer;
 insert into taxidriver values("D004","Komal","Shantanu",8923108809,"Cessna street");
 select * from taxidriver;
 
 insert into taxi values(9051,"D001","A3","2015-01-12");
 select * from taxi;
 
 insert into rents values("Marathahalli","Whitefield",9053,1234321);
 select * from rents;
 
 insert into accolitebase values(1,1234321,"D001");
 
 
 select max(ssn) from customer;
 select min(driverphoneNumber) from taxidriver;
 select count(*) from taxidriver;
 select avg(driverphoneNumber) from taxidriver;
 
 
select ssn from customer
where ssn between 2000000 and 5000000;


select * from taxidriver inner join taxi
on taxi.taxiOwnerId = taxidriver.driverid; 

select * from taxidriver left join taxi
on taxi.taxiOwnerId = taxidriver.driverId;

select * from taxidriver right join taxi
on taxi.taxiOwnerId = taxidriver.driverId; 
 
select *
from customer
order by fname; 
 
 
delimiter //
create procedure 
getName(
IN ssnin int ,
OUT fullname int
)
BEGIN
   select fname into fullname
   from customer
   where ssnin=ssn;
END //

call getName(1,@balance);
select @balance;

drop procedure getName;
 
 
 
 
 
 
 