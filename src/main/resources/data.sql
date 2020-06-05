INSERT INTO FAMILIA_EQUIPO (ID, NOMBRE, DESCRIPCION) VALUES (3, 'Cable', 'A long object used to make a physical connection. ');
INSERT INTO FAMILIA_EQUIPO (ID, NOMBRE, DESCRIPCION) VALUES (2, 'Cellphone', 'Portable telephone that can make and receive calls over a radio frequency link while the user is moving within a telephone service area. ');
INSERT INTO FAMILIA_EQUIPO (ID, NOMBRE, DESCRIPCION) VALUES (1, 'Computer', 'Programmable device that stores, retrieves, and processes data. ');

INSERT INTO SUB_FAMILIA_EQUIPO (ID, NOMBRE, FAMILIA_EQUIPO_ID, DESCRIPCION) VALUES (4, '1/4 Cable', 3, '1/4 Cable');
INSERT INTO SUB_FAMILIA_EQUIPO (ID, NOMBRE, FAMILIA_EQUIPO_ID, DESCRIPCION) VALUES (3, 'iPhone', 2, 'Apple Cellphone');
INSERT INTO SUB_FAMILIA_EQUIPO (ID, NOMBRE, FAMILIA_EQUIPO_ID, DESCRIPCION) VALUES (2, 'Samsung', 2, 'Korean Cellphone Brand');
INSERT INTO SUB_FAMILIA_EQUIPO (ID, NOMBRE, FAMILIA_EQUIPO_ID, DESCRIPCION) VALUES (1, 'Laptop', 1, 'Often called a notebook, is a small, portable personal computer (PC) with a clamshell form factor, typically having a thin LCD or LED computer screen mounted');