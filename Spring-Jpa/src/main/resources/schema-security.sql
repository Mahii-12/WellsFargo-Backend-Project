create table Advisor (
  securityId int not null,
  Name varchar(20) not null,
  Category varchar(20) not null,
  purchaseDate date not null,
  purchasePrice float not null,
  quantity int not null,
  portdolioId varchar(20) not null,
  foreign key(portdolioId),
  primary key(clientId)
);