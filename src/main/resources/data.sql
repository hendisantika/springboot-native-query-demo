drop table if exists USER;

CREATE TABLE USER (
  cod INT NOT NULL,
  full_name VARCHAR(45) NULL,
  active INT NULL,
  PRIMARY KEY (cod)
);

INSERT INTO USER (cod, full_name, active)
VALUES (1, 'Naruto', 1),
       (2, 'Sasuke', 1),
       (3, 'Sakura', 1),
       (4, 'Kakashi', 1),
       (5, 'Hinata', 1),
       (6, 'Minato', 1),
       (7, 'Shino', 1),
       (8, 'Hyuuga', 1),
(9, 'Rafael', 0);