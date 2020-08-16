create table mygrocerylist(
	user_id INT(6) UNSIGNED,
	groceryitem_name VARCHAR(30),
	notes VARCHAR(250),
	FOREIGN KEY (user_id) REFERENCES user(id),
	FOREIGN KEY (groceryitem_name) REFERENCES groceryitems(name)
);

insert into mygrocerylist (user_id, groceryitem_name, notes)
values (2, "banana", "buy 2 packets");

insert into mygrocerylist (user_id, groceryitem_name)
values (2, "tuna");

insert into mygrocerylist (user_id, groceryitem_name, notes)
values (2, "potato", "buy 2 kg");

insert into mygrocerylist (user_id, groceryitem_name, notes)
values (4, "banana", "buy 3 packets");

insert into mygrocerylist (user_id, groceryitem_name, notes)
values (4, "apple", "buy 3 pieces");

insert into mygrocerylist (user_id, groceryitem_name, notes)
values (3, "banana", "buy 2 packets");

insert into mygrocerylist (user_id, groceryitem_name)
values (3, "banana");

insert into mygrocerylist (user_id, groceryitem_name, notes)
values (3, "lettuce", "buy 1 kg");

insert into mygrocerylist (user_id, groceryitem_name)
values (3, "potato");

insert into mygrocerylist (user_id, groceryitem_name, notes)
values (3, "apple", "buy 2 pcs");