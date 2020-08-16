create table groceryitems(
	name VARCHAR(30) PRIMARY KEY,
	category VARCHAR(30) NOT NULL,
	description TEXT(20000) NOT NULL
);

insert into groceryitems (name, category, description)
values ("banana", "fruits",
"banana is yellow in color and rich with potasssium.");

insert into groceryitems (name, category, description)
values ("sardine", "fish",
"sardine is good for health.");

insert into groceryitems (name, category, description)
values ("apple", "fruits",
"apple is good for health.");

insert into groceryitems (name, category, description)
values ("lettuce", "vegetables",
"lettuce is good for health.");

insert into groceryitems (name, category, description)
values ("cow meat", "meats",
"cow meat is good for health.");

insert into groceryitems (name, category, description)
values ("tuna", "fish",
"tuna is good for health.");

insert into groceryitems (name, category, description)
values ("salmon", "fish",
"salmon is good for health.");