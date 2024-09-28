CREATE TABLE answers
(
    answerid INTEGER GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    answer   INTEGER                                  NOT NULL,
    date     TIMESTAMP WITHOUT TIME ZONE              NOT NULL,
    CONSTRAINT pk_answers PRIMARY KEY (answerid)
);

CREATE TABLE link_answers
(
    alinkid    INTEGER GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    answerid   INTEGER                                  NOT NULL,
    questionid INTEGER                                  NOT NULL,
    userid     INTEGER                                  NOT NULL,
    CONSTRAINT pk_link_answers PRIMARY KEY (alinkid)
);

CREATE TABLE link_notes
(
    nlinkid    INTEGER GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    userid     INTEGER                                  NOT NULL,
    questionid INTEGER,
    setid      INTEGER,
    CONSTRAINT pk_link_notes PRIMARY KEY (nlinkid)
);

CREATE TABLE link_questions
(
    qlinkid    INTEGER GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    questionid INTEGER                                  NOT NULL,
    setid      INTEGER                                  NOT NULL,
    userid     INTEGER,
    CONSTRAINT pk_link_questions PRIMARY KEY (qlinkid)
);

CREATE TABLE link_users_sets
(
    userid      INTEGER NOT NULL,
    setid       INTEGER NOT NULL,
    priority    INTEGER,
    last_access TIMESTAMP WITHOUT TIME ZONE,
    CONSTRAINT pk_link_users_sets PRIMARY KEY (userid, setid)
);

CREATE TABLE notes
(
    noteid       INTEGER GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    note         TEXT,
    creationtime TIMESTAMP WITHOUT TIME ZONE,
    nagging      VARCHAR(10),
    CONSTRAINT pk_notes PRIMARY KEY (noteid)
);

CREATE TABLE questions
(
    questionid INTEGER GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    question   TEXT,
    CONSTRAINT pk_questions PRIMARY KEY (questionid)
);

CREATE TABLE sets
(
    setid                          INTEGER GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    name                           VARCHAR(50),
    description                    VARCHAR(255),
    next_notification              TIMESTAMP WITHOUT TIME ZONE,
    notification_repeat_time_hours INTEGER,
    CONSTRAINT pk_sets PRIMARY KEY (setid)
);

CREATE TABLE users
(
    userid         INTEGER GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    username       VARCHAR(255),
    email          VARCHAR(255),
    passwordsha256 VARCHAR(100)                             NOT NULL,
    phone_number   BIGINT,
    CONSTRAINT pk_users PRIMARY KEY (userid)
);

ALTER TABLE link_answers
    ADD CONSTRAINT FK_LINK_ANSWERS_ON_ANSWERID FOREIGN KEY (answerid) REFERENCES answers (answerid);

ALTER TABLE link_answers
    ADD CONSTRAINT FK_LINK_ANSWERS_ON_QUESTIONID FOREIGN KEY (questionid) REFERENCES questions (questionid);

ALTER TABLE link_answers
    ADD CONSTRAINT FK_LINK_ANSWERS_ON_USERID FOREIGN KEY (userid) REFERENCES users (userid);

ALTER TABLE link_notes
    ADD CONSTRAINT FK_LINK_NOTES_ON_QUESTIONID FOREIGN KEY (questionid) REFERENCES questions (questionid);

ALTER TABLE link_notes
    ADD CONSTRAINT FK_LINK_NOTES_ON_SETID FOREIGN KEY (setid) REFERENCES sets (setid);

ALTER TABLE link_notes
    ADD CONSTRAINT FK_LINK_NOTES_ON_USERID FOREIGN KEY (userid) REFERENCES users (userid);

ALTER TABLE link_questions
    ADD CONSTRAINT FK_LINK_QUESTIONS_ON_QUESTIONID FOREIGN KEY (questionid) REFERENCES questions (questionid);

ALTER TABLE link_questions
    ADD CONSTRAINT FK_LINK_QUESTIONS_ON_SETID FOREIGN KEY (setid) REFERENCES sets (setid);

ALTER TABLE link_questions
    ADD CONSTRAINT FK_LINK_QUESTIONS_ON_USERID FOREIGN KEY (userid) REFERENCES users (userid);

ALTER TABLE link_users_sets
    ADD CONSTRAINT FK_LINK_USERS_SETS_ON_SETID FOREIGN KEY (setid) REFERENCES sets (setid);

ALTER TABLE link_users_sets
    ADD CONSTRAINT FK_LINK_USERS_SETS_ON_USERID FOREIGN KEY (userid) REFERENCES users (userid);