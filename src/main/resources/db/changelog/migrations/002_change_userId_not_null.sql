-- Liquibase SQL migration to alter the UserID column to NOT NULL

ALTER TABLE LinkQuestions
    ALTER COLUMN UserID SET NOT NULL;
