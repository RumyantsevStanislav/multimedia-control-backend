DROP TABLE IF EXISTS device_type CASCADE;
CREATE TABLE device_type
(
    id                 UUID      DEFAULT gen_random_uuid() PRIMARY KEY,
    "name"             VARCHAR(255) UNIQUE NOT NULL,
    port               INT,
    connection_type_id SMALLINT,
    created_at         TIMESTAMP DEFAULT current_timestamp,
    updated_at         TIMESTAMP DEFAULT current_timestamp,
    FOREIGN KEY (connection_type_id) REFERENCES connection_type(id)
);
