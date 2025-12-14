CREATE TABLE company (
    company_id INT AUTO_INCREMENT PRIMARY KEY,
    company_name VARCHAR(80) NOT NULL,
    company_contact INT NOT NULL,
    company_number VARCHAR(12) NOT NULL UNIQUE,
    company_address VARCHAR(80),
    company_email_address VARCHAR(30),

    CONSTRAINT uq_company_name UNIQUE (company_name),
    CONSTRAINT uq_company_email UNIQUE (company_email_address)
);
