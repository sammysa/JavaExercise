CREATE TABLE audit_log (
    log_id INT AUTO_INCREMENT PRIMARY KEY,
    action VARCHAR(50) NOT NULL,
    description VARCHAR(255),
    performed_by INT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
