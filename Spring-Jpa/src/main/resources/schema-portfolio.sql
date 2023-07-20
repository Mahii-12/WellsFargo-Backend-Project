create table Advisor (
  portfolioId int not null,
  creationDateint not null,
  clientId varchar(20) not null,
  foreign key(clientId),
  primary key(clientId)
);