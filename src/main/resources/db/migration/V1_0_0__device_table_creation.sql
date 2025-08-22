DROP TABLE IF EXISTS device CASCADE;
CREATE TABLE device
(
    id         UUID      DEFAULT gen_random_uuid() PRIMARY KEY,
    "name"     VARCHAR(255) UNIQUE,
    created_at TIMESTAMP DEFAULT current_timestamp,
    updated_at TIMESTAMP DEFAULT current_timestamp
);
