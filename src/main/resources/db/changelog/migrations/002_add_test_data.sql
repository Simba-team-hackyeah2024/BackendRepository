INSERT INTO users (username, email, passwordsha256, phone_number)
VALUES
    ('Alice', 'alice@example.com', 'hash_password1', 1234567890),
    ('Bob', 'bob@example.com', 'hash_password2', 2345678901),
    ('Charlie', 'charlie@example.com', 'hash_password3', 3456789012),
    ('David', 'david@example.com', 'hash_password4', 4567890123),
    ('Eve', 'eve@example.com', 'hash_password5', 5678901234);

INSERT INTO sets (name, description, next_notification, notification_repeat_time_hours)
VALUES
    ('Set A', 'Description of Set A', '2024-10-01 10:00:00', 24),
    ('Set B', 'Description of Set B', '2024-10-02 10:00:00', 48),
    ('Set C', 'Description of Set C', '2024-10-03 10:00:00', 24);

INSERT INTO questions (question)
VALUES
    ('What is your favorite color?'),
    ('What is your favorite food?'),
    ('What is your favorite movie?'),
    ('Where do you want to travel next?'),
    ('What motivates you the most?');

INSERT INTO answers (answer, date)
VALUES
    (1, '2024-09-25 12:00:00'),
    (2, '2024-09-26 13:00:00'),
    (3, '2024-09-27 14:00:00'),
    (4, '2024-09-28 15:00:00'),
    (5, '2024-09-29 16:00:00');

INSERT INTO link_answers (answerid, questionid, userid)
VALUES
    (1, 1, 1),
    (2, 2, 2),
    (3, 3, 3),
    (4, 4, 4),
    (5, 5, 5);

INSERT INTO notes (note, creationtime, nagging)
VALUES
    ('Reminder to complete daily reflection.', '2024-09-24 10:00:00', 'Yes'),
    ('Reminder to review your goals.', '2024-09-25 11:00:00', 'No'),
    ('Reminder to journal your thoughts.', '2024-09-26 12:00:00', 'Yes');

INSERT INTO link_notes (userid, questionid, setid)
VALUES
    (1, 1, 1),
    (2, 2, 2),
    (3, 3, 3),
    (4, NULL, 1),
    (5, NULL, 2);

INSERT INTO link_questions (questionid, setid, userid)
VALUES
    (1, 1, 1),
    (2, 2, 2),
    (3, 3, 3),
    (4, 1, 4),
    (5, 2, 5);

INSERT INTO link_users_sets (userid, setid, priority, last_access)
VALUES
    (1, 1, 1, '2024-09-28 10:00:00'),
    (2, 2, 2, '2024-09-27 10:30:00'),
    (3, 3, 1, '2024-09-26 11:00:00'),
    (4, 1, 3, '2024-09-25 11:30:00'),
    (5, 2, 2, '2024-09-24 12:00:00');

