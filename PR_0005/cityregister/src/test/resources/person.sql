create table Person (
	person_id SERIAL,
	first_name varchar(30),
	last_name varchar(30),
	primary key(Person_id)
);

insert into Person (first_name, last_name) values ('Алексей', 'Петров');

select * from Person;