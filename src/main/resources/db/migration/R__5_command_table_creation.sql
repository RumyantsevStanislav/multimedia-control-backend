DROP TABLE IF EXISTS command CASCADE;
CREATE TABLE command
(
    id         UUID      DEFAULT gen_random_uuid() PRIMARY KEY,
    brand      VARCHAR(255) UNIQUE NOT NULL,
    cmd        VARCHAR(255)        NOT NULL,
    name       VARCHAR(255),
    created_at TIMESTAMP DEFAULT current_timestamp,
    updated_at TIMESTAMP DEFAULT current_timestamp
);
