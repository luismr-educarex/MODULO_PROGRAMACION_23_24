CREATE TABLE visitas_clientes (
    visita INT,
    cliente INT,
    servicio VARCHAR(50),
    PRIMARY KEY (visita, cliente, servicio)
);