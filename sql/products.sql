CREATE DATABASE 'stock-manager';

CREATE TABLE products(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT NULL,
    qty INT NOT NULL,
    unit_price DECIMAL(10,2) NOT NULL,
    category VARCHAR(255)
);

INSERT INTO products
    (name, description, qty, unit_price, category)
VALUES
    ("Tablet", "qldkfdlf adjfha fjahf fajh adoha jhad foah ", 10, 400, "tech"),
    ("Phone", "qldkfdlf adjfha fjahf fajh adoha jhad foah ", 16, 350, "tech"),
    ("T-Shirt", "qldkfdlf adjfha fjahf fajh adoha jhad foah ", 20, 250, "clothing"),
    ("Trousers", "qldkfdlf kjhfg rjkgha rjhagdf kj jhad foah ", 10, 500, "clothing");

