DROP TABLE IF EXISTS command CASCADE;
CREATE TABLE command
(
    id             UUID      DEFAULT gen_random_uuid() PRIMARY KEY,
    device_type_id UUID,
    cmd            VARCHAR(255) UNIQUE NOT NULL,
    cmd_comment    VARCHAR(1024),
    created_at     TIMESTAMP DEFAULT current_timestamp,
    updated_at     TIMESTAMP DEFAULT current_timestamp,
    FOREIGN KEY (device_type_id) REFERENCES device_type (id)
);
