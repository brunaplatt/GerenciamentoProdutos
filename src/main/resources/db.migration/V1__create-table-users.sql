create TABLE Users (
    id TEXT PRIMARY KEY UNIQUE NOT NULL,
    nome TEXT NOT NULL,
    setor TEXT NOT NULL,
    email TEXT NOT NULL,
    login TEXT NOT NULL UNIQUE,
    password TEXT NOT NULL,
    status bool NOT NULL,
    role TEXT NOT NULL
);