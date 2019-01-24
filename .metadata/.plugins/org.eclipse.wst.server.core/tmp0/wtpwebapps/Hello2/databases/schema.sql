CREATE DATABASE IF NOT EXISTS market 
DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE market;

CREATE TABLE IF NOT EXISTS user (
    id VARCHAR(32) PRIMARY KEY	COMMENT 'email', 
    password VARCHAR(32),
    name VARCHAR(32),
    date DATE
)            