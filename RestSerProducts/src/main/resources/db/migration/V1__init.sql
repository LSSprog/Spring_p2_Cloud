CREATE TABLE products_tbl (
    product_id       bigserial PRIMARY KEY,
    title_fld        VARCHAR(255),
    price_fld        INT,
    created_at       TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at       TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );
INSERT INTO products_tbl (title_fld, price_fld)
VALUES
('Re', 2900),
('StM', 3200),
('LaW1', 3500),
('LaW2', 3700),
('LaM1', 6500),
('Re2', 4600),
('StW3', 5900),
('StM2', 6000),
('LaW', 6200),
('StW1', 3500),
('StW2', 6500),
('LaM', 3500);

