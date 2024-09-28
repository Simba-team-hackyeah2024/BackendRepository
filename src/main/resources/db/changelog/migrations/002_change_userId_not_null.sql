-- Liquibase SQL migration to alter the UserID column to NOT NULL

ALTER TABLE Link_Questions
    ALTER COLUMN UserID SET NOT NULL;
