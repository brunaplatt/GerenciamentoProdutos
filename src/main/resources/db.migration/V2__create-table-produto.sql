CREATE TABLE PRODUTO(
    id TEXT PRIMARY KEY UNIQUE NOT NULL,
    name TEXT NOT NULL,
    categoria TEXT NOT NULL,
    modelo TEXT NOT NULL,
    ano INTEGER NOT NULL,
    fabricante TEXT NOT NULL,
    voltagem INTEGER NOT NULL,
    litros INTEGER NOT NULL,
    cor TEXT NOT NULL,
    preco INTEGER NOT NULL,
    status bool NOT NULL
);