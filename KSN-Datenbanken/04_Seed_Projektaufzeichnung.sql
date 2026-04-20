-- Active: 1762768913226@@mysql1507.netcup.net@3306@k312467_johanna
CREATE TABLE ksn_04_Mitarbeiter (
    MID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100),
    Abteilung VARCHAR(20),
    Eintritt DATE
);

CREATE TABLE ksn_04_Kunde(
    KID INT PRIMARY KEY AUTO_INCREMENT,
    Unternehmung VARCHAR(100)
);

CREATE TABLE ksn_04_Projekt (
    PID INT PRIMARY KEY AUTO_INCREMENT,
    KID INT,
    Beschreibung TEXT,
    Deadline DATE,
    FOREIGN KEY (KID) REFERENCES ksn_04_Kunde(KID)
);

CREATE TABLE ksn_04_Arbeitszeit (
    MID INT NOT NULL,
    PID INT NOT NULL,
    Stunden INT,
    FOREIGN KEY (MID) REFERENCES ksn_04_Mitarbeiter(MID),
    FOREIGN KEY (PID) REFERENCES ksn_04_Projekt(PID)
);


INSERT INTO ksn_04_Mitarbeiter (Name, Abteilung, Eintritt) VALUES
('Peter Schmidt', 'IT', '2019-01-15'),
('Silvia Müller', 'HR', '2020-03-22'),
('Klaus Weber', 'IT', '2018-06-08'),
('Diana Bauer', 'Finance', '2021-09-11'),
('Thomas Fischer', 'IT', '2020-02-05'),
('Sabine Wagner', 'Marketing', '2017-11-30'),
('Michael Schulz', 'Finance', '2019-05-14'),
('Andreas Hoffmann', 'IT', '2022-01-10'),
('Monika Koch', 'HR', '2016-08-25'),
('Stefan Richter', 'Sales', '2021-04-02'),
('Julia Wolf', 'Marketing', '2023-02-15'),
('Christian Becker', 'IT', '2015-10-12'),
('Petra Neumann', 'Finance', '2020-11-20'),
('Markus Zimmermann', 'Sales', '2018-03-05'),
('Tanja Krüger', 'HR', '2022-07-19');

INSERT INTO ksn_04_Kunde (KID, Unternehmung) VALUES
(1, 'Logistik GmbH'),
(2, 'Global Trade Inc.'),
(3, 'ABC GmbH'),
(4, 'XYZ AG'),
(5, 'Tech Solutions');

INSERT INTO ksn_04_Projekt (PID, KID, Beschreibung, Deadline) VALUES
(101, 5, 'Datenbank-Redesign', '2024-02-28'),
(102, 3, 'API-Entwicklung', '2024-03-15'),
(103, 4, 'Schulungen', '2024-04-10'),
(104, 1, 'Cloud Migration', '2024-06-01'),
(105, 2, 'Sicherheits-Audit', '2024-05-20');

INSERT INTO ksn_04_Arbeitszeit (MID, PID, Stunden) VALUES
(1, 101, 40),
(2, 102, 35),
(3, 101, 50),
(4, 103, 30),
(5, 102, 45),
(1, 104, 12),
(6, 104, 25),
(7, 103, 15),
(8, 101, 20),
(9, 102, 10),
(10, 105, 38),
(11, 105, 42),
(12, 101, 5),
(13, 103, 22),
(14, 102, 33);


