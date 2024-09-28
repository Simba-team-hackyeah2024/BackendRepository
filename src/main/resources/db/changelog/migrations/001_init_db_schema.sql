-- Table: Users
CREATE TABLE public.Users (
                              UserID SERIAL PRIMARY KEY,
                              Username VARCHAR(100),
                              Email VARCHAR(100),
                              PasswordSHA256 VARCHAR(100),
                              PhoneNumber INTEGER NULL
);

-- Table: Sets
CREATE TABLE public.Sets (
                             SetID SERIAL PRIMARY KEY,
                             Name VARCHAR(50),
                             Description VARCHAR(255),
                             NextNotification TIMESTAMP NULL,
                             NotificationRepeatTimeHours INTEGER NULL
);

-- Table: Notes
CREATE TABLE public.Notes (
                              NoteID SERIAL PRIMARY KEY,
                              Note TEXT,
                              CreationTime TIMESTAMP,
                              Nagging VARCHAR(10)
);

-- Table: LinkNotes
CREATE TABLE public.LinkNotes (
                                  NLinkID SERIAL PRIMARY KEY,
                                  UserID INTEGER NOT NULL,
                                  QuestionID INTEGER NULL,
                                  SetID INTEGER NULL,
                                  CONSTRAINT FK_LinkNotes_Users FOREIGN KEY (UserID) REFERENCES public.Users(UserID)
);

-- Table: LinkUsersSets
CREATE TABLE public.LinkUsersSets (
                                      UserID INTEGER NOT NULL,
                                      SetID INTEGER NOT NULL,
                                      Priority INTEGER NULL,
                                      LastAccess TIMESTAMP NULL,
                                      PRIMARY KEY (UserID, SetID),
                                      CONSTRAINT FK_LinkUsersSets_Users FOREIGN KEY (UserID) REFERENCES public.Users(UserID),
                                      CONSTRAINT FK_LinkUsersSets_Sets FOREIGN KEY (SetID) REFERENCES public.Sets(SetID)
);

-- Table: Questions
CREATE TABLE public.Questions (
                                  QuestionID SERIAL PRIMARY KEY,
                                  Question TEXT NULL
);

-- Table: LinkQuestions
CREATE TABLE public.LinkQuestions (
                                      QLinkID SERIAL PRIMARY KEY,
                                      QuestionID INTEGER NOT NULL,
                                      SetID INTEGER NOT NULL,
                                      UserID INTEGER NULL,
                                      CONSTRAINT FK_LinkQuestions_Questions FOREIGN KEY (QuestionID) REFERENCES public.Questions(QuestionID),
                                      CONSTRAINT FK_LinkQuestions_Sets FOREIGN KEY (SetID) REFERENCES public.Sets(SetID),
                                      CONSTRAINT FK_LinkQuestions_Users FOREIGN KEY (UserID) REFERENCES public.Users(UserID)
);

-- Table: Answers
CREATE TABLE public.Answers (
                                AnswerID SERIAL PRIMARY KEY,
                                Answer INTEGER NOT NULL,
                                Date TIMESTAMP NOT NULL
);

-- Table: LinkAnswers
CREATE TABLE public.LinkAnswers (
                                    ALinkID SERIAL PRIMARY KEY,
                                    AnswerID INTEGER NOT NULL,
                                    QuestionID INTEGER NOT NULL,
                                    UserID INTEGER NOT NULL,
                                    CONSTRAINT FK_LinkAnswers_Answers FOREIGN KEY (AnswerID) REFERENCES public.Answers(AnswerID),
                                    CONSTRAINT FK_LinkAnswers_Questions FOREIGN KEY (QuestionID) REFERENCES public.Questions(QuestionID),
                                    CONSTRAINT FK_LinkAnswers_Users FOREIGN KEY (UserID) REFERENCES public.Users(UserID)
);
