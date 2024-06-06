CREATE DATABASE devoluciones_db;

USE devoluciones_db;

CREATE TABLE devoluciones (
    id INT AUTO_INCREMENT PRIMARY KEY,
    pedido_de VARCHAR(255),
    numero_referencia INT,
    numero_pedido VARCHAR(255),
    transportista VARCHAR(255),
    fecha_devolucion TIMESTAMP,
    origen VARCHAR(255),
    punto VARCHAR(255),
    destino VARCHAR(255)
);

CREATE TABLE situaciones (
    id INT AUTO_INCREMENT PRIMARY KEY,
    devolucion_id INT,
    fecha_hora TIMESTAMP,
    situacion VARCHAR(255),
    FOREIGN KEY (devolucion_id) REFERENCES devoluciones(id)
);


GRANT Alter ON devoluciones_db.* TO 'devolucion'@'%';
GRANT Create ON devoluciones_db.* TO 'devolucion'@'%';
GRANT Create view ON devoluciones_db.* TO 'devolucion'@'%';
GRANT Delete ON devoluciones_db.* TO 'devolucion'@'%';
GRANT Delete history ON devoluciones_db.* TO 'devolucion'@'%';
GRANT Drop ON devoluciones_db.* TO 'devolucion'@'%';
GRANT Grant option ON devoluciones_db.* TO 'devolucion'@'%';
GRANT Index ON devoluciones_db.* TO 'devolucion'@'%';
GRANT Insert ON devoluciones_db.* TO 'devolucion'@'%';
GRANT References ON devoluciones_db.* TO 'devolucion'@'%';
GRANT Select ON devoluciones_db.* TO 'devolucion'@'%';
GRANT Show view ON devoluciones_db.* TO 'devolucion'@'%';
GRANT Trigger ON devoluciones_db.* TO 'devolucion'@'%';
GRANT Update ON devoluciones_db.* TO 'devolucion'@'%';
