create table Advisor (
  clientId int not null,
  FirstName varchar(20) not null,
  LastName varchar(20) not null,
  Address varchar(50) not null,
  Phone varchar(12) not null,
  email varchar(20),
  advisorId varchar(20) not null,
  foreign key(advisorId),
  primary key(clientId)
);