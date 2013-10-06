create table contacts (
	id identity,
	firstName varchar(30) not null,
	lastName varchar(50) not null,
	phoneNumber varchar(13),
	emailAddress varchar(30)
);

insert into contacts (firstName, lastName, phoneNumber, emailAddress) 
	   values ('Herman', 'Munster', '505-555-1313', 'herman@munster.com');
insert into contacts (firstName, lastName, phoneNumber, emailAddress) 
	   values ('Gomez', 'Addams', '303-666-0000', 'gomez@addams.org');
insert into contacts (firstName, lastName, phoneNumber, emailAddress) 
	   values ('Victor', 'Frankenstein', '123-123-1234', 'drvic@creepycastle.com');
