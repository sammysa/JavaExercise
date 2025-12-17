CREATE TABLE user (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    user_name VARCHAR(20) NOT NULL,
    first_name VARCHAR(15),
    last_name VARCHAR(15),
    contact_email VARCHAR(30) NOT NULL,
    user_role VARCHAR(20) NOT NULL,
    user_status VARCHAR(20) NOT NULL,
    company_id INT NOT NULL,

    CONSTRAINT uq_user_name UNIQUE (user_name),
    CONSTRAINT uq_contact_email UNIQUE (contact_email),

    CONSTRAINT chk_user_role CHECK (user_role IN ('MEMBER','ACCOUNTS','ADMINISTRATOR')),
    CONSTRAINT chk_user_status CHECK (user_status IN ('ACTIVE','PENDING','DELETED')),

    CONSTRAINT fk_user_company
        FOREIGN KEY (company_id) REFERENCES company(company_id)
        ON DELETE CASCADE
);
