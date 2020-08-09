create table user(
	id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(60) NOT NULL,
	email VARCHAR(50) NOT NULL UNIQUE,
	password VARCHAR(300) NOT NULL,
	registration_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

insert into user (name, email, password) values ("Ahmad", "ahmad@gmail.com", "900150983CD24FB0D6963F7D28E17F72");
insert into user (name, email, password) values ("Ali", "ali@gmail.com", "900150983CD24FB0D6963F7D28E17F72");
insert into user (name, email, password) values ("Sarah", "sarah@gmail.com", "900150983CD24FB0D6963F7D28E17F72");
insert into user (name, email, password) values ("Razi", "razi@gmail.com", "900150983CD24FB0D6963F7D28E17F72");
insert into user (name, email, password) values ("Nur", "nur@gmail.com", "900150983CD24FB0D6963F7D28E17F72");