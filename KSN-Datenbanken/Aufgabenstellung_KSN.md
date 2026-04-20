# Aufgabenstellung KSN

## 1. Ernährungstabelle

```sql
DROP TABLE IF EXISTS ksn_01_nutrition;

CREATE TABLE ksn_01_nutrition (
    id INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (id),
    bezeichnung VARCHAR(40),
    menge VARCHAR(30),
    art ENUM ('Essen','Trinken'),
    kcal INT
);

-- Einträge erstellen
INSERT INTO ksn_01_nutrition VALUES
(NULL, 'Leberkässemmel', 'Stück', 'Essen', 500),
(NULL, 'Spaghetti Bolognese', 'Teller', 'Essen', 595),
(NULL, 'Weißbier', 'Halbe', 'Trinken', 225),
(NULL, 'Avocado', 'Stück', 'Essen', 543),
(NULL, 'Laugenbrezel', 'Stück', 'Essen', 192),
(NULL, 'Cola', 'kleine Flasche', 'Trinken', 220);
```

### 1.1 Wähle alle Einträge aus der Tabelle, deren Kalorienwert höher als 250 ist.
```sql
SELECT bezeichnung, menge, art, kcal
FROM ksn_01_nutrition
WHERE kcal > 250;
```

### 1.2 Finde alle Getränke in der Tabelle und zeige ihre Namen und Kalorienwerte an.
```sql
SELECT bezeichnung, kcal
FROM ksn_01_nutrition
WHERE art = "Trinken";
```

### 1.3 Aktualisiere den Kalorienwert des Lebensmittels Leberkässemmel auf 550 kcal.

```sql
UPDATE ksn_01_nutrition
SET kcal = 550
WHERE bezeichnung = "Leberkässemmel";
```

### 1.4 Füge einen neuen Eintrag mit dem Namen Salat, der Art Essen, einer Menge Schüssel und einem Kalorienwert von 350 kcal hinzu
```sql
INSERT INTO ksn_01_nutrition VALUES
(NULL, 'Salat', 'Schüssel', 'Essen', 350);
```

### 1.5 Lösche den Eintrag mit der niedrigsten Kalorienanzahl aus der Tabelle.
```sql
-- Angedacht, aber funktioniert nicht (lokal schon)
DELETE FROM ksn_01_nutrition 
WHERE kcal = (SELECT MIN(kcal) FROM ksn_01_nutrition);

-- Funktioniert
DELETE FROM ksn_01_nutrition 
ORDER BY kcal ASC
LIMIT 1;
```

### 1.6 Zeige den Durchschnitt der Kalorien aller Lebensmittel an.

```sql
SELECT AVG(kacl) FROM ksn_01_nutrition;
```

### 1.7 Wähle den Namen und die Menge der Einträge aus, die mehr als 500 Kalorien haben.
```sql
SELECT bezeichnung, menge FROM ksn_01_nutrition WHERE kcal >500;
```

### 1.8 Zähle, wie viele Einträge in der Tabelle der Kategorie Essen zugeordnet sind
```sql
SELECT COUNT(art) FROM ksn_01_nutrition WHERE art = "Essen";
```

### 1.9 Wähle den Eintrag mit der höchsten Kalorienanzahl aus und zeige seinen Namen und Kalorienwert an.

```sql
SELECT FROM ksn_01_nutrition 
WHERE kcal = (SELECT MAX(kcal) FROM ksn_01_nutrition);
```

### 1.10 Ändere die Bezeichnung von Weißbier zu Hefeweizen und aktualisiere den Kalorienwert auf 240 kcal.

## 2. Mitarbeiter
https://pixelpilot.github.io/fsst/Datenbanken/110_Select_1.html

```sql
-- Tabelle löschen
DROP TABLE IF EXISTS ksn_02_mitarbeiter;

-- Tabelle erstellen
CREATE TABLE ksn_02_mitarbeiter (
    ID INT PRIMARY KEY,
    Name VARCHAR(100),
    Abteilung VARCHAR(50),
    Gehalt DECIMAL(10, 2),
    Eintrittsdatum DATE,
    Vorgesetzter INT,
    FOREIGN KEY (Vorgesetzter) REFERENCES ksn_02_mitarbeiter(ID)
);

-- Vorgesetzte erstellen:
INSERT INTO ksn_02_mitarbeiter (ID, Name, Abteilung, Gehalt, Eintrittsdatum, Vorgesetzter) VALUES
    (1, 'Max Mustermann', 'IT', 70000, '2018-04-16', NULL),
    (2, 'Erika Mustermann', 'Marketing', 68000, '2019-03-15', NULL),
    (4, 'Tobias Müller', 'Vertrieb', 73000, '2020-07-23', NULL),
    (6, 'Christian Weber', 'IT', 75000, '2018-04-16', NULL);

-- Mitarbeiter erstellen:
INSERT INTO ksn_02_mitarbeiter (ID, Name, Abteilung, Gehalt, Eintrittsdatum, Vorgesetzter) VALUES
    (3, 'Julia Schmidt', 'IT', 62000, '2019-06-01', 1),
    (5, 'Sophia Becker', 'Marketing', 58000, '2021-02-09', 2),
    (7, 'Laura Koch', 'Vertrieb', 47000, '2020-11-12', 4),
    (8, 'Alexander Schmitt', 'Marketing', 53000, '2019-12-04', 2),
    (9, 'Sarah Meyer', 'IT', 66000, '2021-08-21', 1),
    (10, 'Andreas Schulz', 'Vertrieb', 49000, '2022-01-30', 4),
    (11, 'Marie Fischer', 'IT', 69000, '2020-05-15', 6),
    (12, 'Simon Lange', 'Marketing', 56000, '2021-07-19', 2),
    (13, 'Lena Hoffmann', 'Vertrieb', 52000, '2022-02-28', 4),
    (14, 'Oliver Krause', 'IT', 72000, '2019-11-01', 6),
    (15, 'Anna Braun', 'Marketing', 65000, '2018-09-23', 2),
    (16, 'Niklas Maier', 'Vertrieb', 54000, '2020-10-05', 4),
    (17, 'Emily Schmid', 'IT', 67000, '2021-03-17', 1),
    (18, 'Noah Fuchs', 'Marketing', 61000, '2019-06-07', 2),
    (19, 'Luisa Herzog', 'Vertrieb', 58000, '2022-01-15', 4),
    (20, 'Jonas Wagner', 'IT', 64000, '2020-04-20', 6);
```

### Einfache Abfragen:
1. Alle Mitarbeiter aus der IT-Abteilung.
```sql
SELECT * FROM `ksn_02_mitarbeiter` WHERE Abteilung = "IT";
```
2. Berechne das durchschnittliche Gehalt aller Mitarbeiter.
```sql
SELECT AVG(Gehalt) AS Durchschnittsgehalt FROM `ksn_02_mitarbeiter`;
```
3. Finde das höchste Gehalt im Unternehmen.
```sql
SELECT MAX(Gehalt) AS Maximalgehalt FROM `ksn_02_mitarbeiter`;
```
4. Ermittle das Gesamtgehalt aller Mitarbeiter in der Marketingabteilung.
```sql
SELECT SUM(Gehalt) AS Summe 
FROM `ksn_02_mitarbeiter` 
WHERE Abteilung = 'Marketing';
```
5. Finde alle Mitarbeiter, die nach dem 1. Januar 2020 eingestellt wurden.
```sql
SELECT * FROM `ksn_02_mitarbeiter` WHERE Eintrittsdatum > "2020-01-01";
```
6. Ordne die Mitarbeiter nach ihrem Gehalt in absteigender Reihenfolge.
```sql
SELECT * FROM `ksn_02_mitarbeiter` ORDER BY Gehalt DESC;
```

### Weitere Abfragen:
1. Bestimme den Mitarbeiter mit dem höchsten Gehalt in jeder Abteilung.
```sql
SELECT * FROM ksn_02_mitarbeiter m1
WHERE m1.Gehalt = (
    SELECT MAX(Gehalt)
    FROM ksn_02_mitarbeiter m2
    WHERE m1.Abteilung = m2.Abteilung
)
ORDER BY m1.Abteilung, m1.Gehalt DESC;
```
2. Zähle die Anzahl der Mitarbeiter in jeder Abteilung.
```sql
SELECT Abteilung, COUNT(*) AS Mitarbeiteranzahl
FROM ksn_02_mitarbeiter
GROUP BY Abteilung;
```
3. Berechne das Durchschnittsgehalt und die Gesamtanzahl der Mitarbeiter nach Abteilung.
```sql
SELECT Abteilung, COUNT(*) AS Mitarbeiteranzahl, AVG(Gehalt) AS Durchschnittsgehalt
FROM ksn_02_mitarbeiter
GROUP BY Abteilung;
```
4. Selektiere die Namen der Mitarbeiter, deren Gehalt über dem Durchschnitt liegt.
```sql
SELECT Name FROM ksn_02_mitarbeiter
WHERE Gehalt > (
    SELECT AVG(Gehalt)
    FROM ksn_02_mitarbeiter
);
```

### komplexere Abfragen:
1. Mitarbeiter ohne Vorgesetzte
Finde alle Mitarbeiter, die keinen eingetragenen Vorgesetzten haben (Top-Level-Management).

```sql
SELECT * FROM ksn_02_mitarbeiter
WHERE Vorgesetzter IS NULL;
```

2. Mitarbeiter, die mehr verdienen als ihr Vorgesetzter
Identifiziere Fälle, in denen Mitarbeiter ein höheres Gehalt haben als ihre Vorgesetzten.
```sql
SELECT Name, Gehalt, Vorgesetzter
FROM ksn_02_mitarbeiter
WHERE Gehalt > (
        SELECT Gehalt
        FROM ksn_02_mitarbeiter
        WHERE ID = ksn_02_mitarbeiter.Vorgesetzter
    );

```

3. Anzahl der Mitarbeiter unter jedem Vorgesetzten
Zähle, wie viele Mitarbeiter jedem Vorgesetzten unterstellt sind, sortiert nach dieser Anzahl in absteigender Reihenfolge.

4. Mitarbeiter mit dem höchsten Gehalt in jeder Abteilung und deren Vorgesetzte (Nested Selects)
Liste für jede Abteilung den Mitarbeiter mit dem höchsten Gehalt und dessen Vorgesetzten auf, ohne JOINs zu verwenden.

5. Mitarbeiter, die länger als ihr Vorgesetzter im Unternehmen sind
Finde alle Mitarbeiter, die bereits vor ihrem aktuellen Vorgesetzten im Unternehmen tätig waren, ohne direkte JOINs zu nutzen.

## 3. JOIN Einstieg
[Aufgabenstellung](https://pixelpilot.github.io/fsst/Datenbanken/200_Joins_0.html)

```sql
DROP TABLE IF EXISTS ksn_03_JoinSimple_Personen;
DROP TABLE IF EXISTS ksn_03_JoinSimple_Fremdsprachen;
DROP TABLE IF EXISTS ksn_03_JoinSimple_Sprachkenntnisse;

-- Tabelle Personen
CREATE TABLE ksn_03_JoinSimple_Personen (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    Vorname VARCHAR(50),
    Nachname VARCHAR(50),
    Geburtsdatum DATE
);

-- Tabelle Fremdsprachen
CREATE TABLE ksn_03_JoinSimple_Fremdsprachen (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    Sprache VARCHAR(50)
);

-- Tabelle Sprachkenntnisse
CREATE TABLE ksn_03_JoinSimple_Sprachkenntnisse (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    PersonID INT,
    FremdspracheID INT,
    Niveau ENUM('Anfänger', 'Fortgeschritten', 'Fließend', 'Muttersprachler'),
    FOREIGN KEY (PersonID) REFERENCES ksn_03_JoinSimple_Personen(ID),
    FOREIGN KEY (FremdspracheID) REFERENCES ksn_03_JoinSimple_Fremdsprachen(ID)
);

-- Personen einfügen
INSERT INTO ksn_03_JoinSimple_Personen (Vorname, Nachname, Geburtsdatum) VALUES
('Max', 'Mustermann', '1990-05-15'),
('Anna', 'Müller', '1985-09-23'),
('Tom', 'Schmidt', '1995-03-10');

-- Fremdsprachen einfügen
INSERT INTO ksn_03_JoinSimple_Fremdsprachen (Sprache) VALUES
('Englisch'),
('Französisch'),
('Spanisch'),
('Chinesisch');

-- Sprachkenntnisse einfügen
-- Max spricht Englisch fließend, Spanisch auf fortgeschrittenem Niveau und Französisch auf Anfängerniveau
INSERT INTO ksn_03_JoinSimple_Sprachkenntnisse (PersonID, FremdspracheID, Niveau) VALUES
(1, 1, 'Fließend'),
(1, 3, 'Fortgeschritten'),
(1, 2, 'Anfänger');

-- Anna spricht Englisch auf muttersprachlichem Niveau und Spanisch fließend
INSERT INTO ksn_03_JoinSimple_Sprachkenntnisse (PersonID, FremdspracheID, Niveau) VALUES
(2, 1, 'Muttersprachler'),
(2, 3, 'Fließend');

-- Tom spricht Chinesisch auf Anfängerniveau und Englisch auf fortgeschrittenem Niveau
INSERT INTO ksn_03_JoinSimple_Sprachkenntnisse (PersonID, FremdspracheID, Niveau) VALUES
(3, 4, 'Anfänger'),
(3, 1, 'Fortgeschritten');
```

### Funktionsweise von JOIN

```sql
-- mit WHERE und AND einschränken funktioniert nicht !!!
SELECT 
    * FROM ksn_03_JoinSimple_Personen
    JOIN ksn_03_JoinSimple_Fremdsprachen 
    JOIN ksn_03_JoinSimple_Sprachkenntnisse
    -- Bis hier her wird einfach alles mit allem verbunden
    WHERE ksn_03_JoinSimple_Sprachkenntnisse.PersonenID = 1 -- nur Personen mit der ID 1
    AND ksn_03_JoinSimple_Sprachkenntnisse.FremdspracheID = 1 -- Sprache mit ID 1
```


```sql
-- mit ON!!!
SELECT 
    * FROM ksn_03_JoinSimple_Personen
    JOIN ksn_03_JoinSimple_Fremdsprachen 
    JOIN ksn_03_JoinSimple_Sprachkenntnisse
    -- Bis hier her wird einfach alles mit allem verbunden
    ON ksn_03_JoinSimple_Sprachkenntnisse.PersonID = ksn_03_JoinSimple_Personen.ID 
    AND ksn_03_JoinSimple_Sprachkenntnisse.FremdspracheID = ksn_03_JoinSimple_Fremdsprachen.ID;
```