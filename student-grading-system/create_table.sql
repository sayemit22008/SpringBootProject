-- Create students table manually if needed
USE sms;

CREATE TABLE IF NOT EXISTS students (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255),
    class_test1 DOUBLE NOT NULL,
    class_test2 DOUBLE NOT NULL,
    class_test3 DOUBLE NOT NULL,
    average DOUBLE NOT NULL,
    status VARCHAR(255),
    PRIMARY KEY (id)
) ENGINE=InnoDB;

-- Verify table creation
DESCRIBE students;

-- Check if table exists
SHOW TABLES;
