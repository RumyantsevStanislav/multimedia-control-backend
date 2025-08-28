DROP TABLE IF EXISTS connection_type CASCADE;
CREATE TABLE connection_type
(
    id         SMALLSERIAL PRIMARY KEY,
    "name"     VARCHAR(255) UNIQUE NOT NULL,
    created_at TIMESTAMP DEFAULT current_timestamp,
    updated_at TIMESTAMP DEFAULT current_timestamp
);
