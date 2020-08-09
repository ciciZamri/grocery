create table mygrocerylist(
	user_id INT(6) UNSIGNED,
	groceryitem_id INT(6) UNSIGNED,
	notes VARCHAR(250),
	FOREIGN KEY (user_id) REFERENCES user(id),
	FOREIGN KEY (groceryitem_id) REFERENCES groceryitems(id)
);

insert into mygrocerylist (user_id, groceryitem_id, notes)
values (2, 3, "buy 2 packets");

insert into mygrocerylist (user_id, groceryitem_id)
values (2, 2);

insert into mygrocerylist (user_id, groceryitem_id, notes)
values (2, 5, "buy 2 kg");

insert into mygrocerylist (user_id, groceryitem_id, notes)
values (4, 3, "buy 3 packets");

insert into mygrocerylist (user_id, groceryitem_id, notes)
values (4, 6, "buy 3 pieces");

insert into mygrocerylist (user_id, groceryitem_id, notes)
values (3, 2, "buy 2 packets");

insert into mygrocerylist (user_id, groceryitem_id)
values (3, 3);

insert into mygrocerylist (user_id, groceryitem_id, notes)
values (3, 4, "buy 1 kg");

insert into mygrocerylist (user_id, groceryitem_id)
values (3, 5);

insert into mygrocerylist (user_id, groceryitem_id, notes)
values (3, 6, "buy 2 pcs");