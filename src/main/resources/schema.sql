CREATE TABLE CLIENTE (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    NOMBRE VARCHAR(75) NOT NULL,
    APELLIDO VARCHAR(75) NOT NULL,
    DNI VARCHAR(11) NOT NULL UNIQUE
);

CREATE TABLE PRODUCTO (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    DESCRIPCION VARCHAR(150) NOT NULL,
    CODIGO VARCHAR(50) NOT NULL UNIQUE,
    STOCK INT NOT NULL,
    PRICE DOUBLE NOT NULL
);

CREATE TABLE FACTURA (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    CLIENT_ID INT NOT NULL,
    CREADO_EN DATETIME DEFAULT CURRENT_TIMESTAMP,
    TOTAL DOUBLE NOT NULL,
    FOREIGN KEY (CLIENT_ID) REFERENCES CLIENTE(ID)
);

CREATE TABLE FACTURA_DETALLE (
    FACTURA_DETALLES_ID INT PRIMARY KEY AUTO_INCREMENT,
    FACTURA_ID INT NOT NULL,
    PRODUCTO_ID INT NOT NULL,
    CANTIDAD INT NOT NULL,
    PRECIO DOUBLE NOT NULL,
    FOREIGN KEY (FACTURA_ID) REFERENCES FACTURA(ID),
    FOREIGN KEY (PRODUCTO_ID) REFERENCES PRODUCTO(ID)
);
