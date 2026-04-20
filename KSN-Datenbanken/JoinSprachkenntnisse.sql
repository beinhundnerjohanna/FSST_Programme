-- Aufgabe 1
SELECT 
    `Vorname`,`Nachname` FROM `ksn_03_JoinSimple_Personen` AS `p` 
    JOIN `ksn_03_JoinSimple_Fremdsprachen` AS `s` 
    JOIN `ksn_03_JoinSimple_Sprachkenntnisse` AS `k`
    ON k.PersonID = p.ID 
    AND k.FremdspracheID = s.ID
    WHERE `FremdspracheID` = (SELECT ID FROM `ksn_03_JoinSimple_Fremdsprachen` WHERE `Sprache` = 'Englisch');

-- Aufgabe 2
SELECT 
    `Vorname`,`Nachname`, `Geburtsdatum` FROM ksn_03_JoinSimple_Personen
    JOIN ksn_03_JoinSimple_Sprachkenntnisse
    ON ksn_03_JoinSimple_Sprachkenntnisse.PersonID = ksn_03_JoinSimple_Personen.ID 
    WHERE `Niveau` = 'Fließend';

-- Aufgabe 3
SELECT 
    `Vorname`,`Nachname`, `Niveau`, `Sprache` 
    FROM ksn_03_JoinSimple_Personen
    JOIN ksn_03_JoinSimple_Fremdsprachen 
    JOIN ksn_03_JoinSimple_Sprachkenntnisse
    ON ksn_03_JoinSimple_Sprachkenntnisse.PersonID = ksn_03_JoinSimple_Personen.ID 
    AND ksn_03_JoinSimple_Sprachkenntnisse.FremdspracheID = ksn_03_JoinSimple_Fremdsprachen.ID
    WHERE `Sprache` LIKE 'Chin%';

-- Aufgabe 4
SELECT DISTINCT
`Sprache`
FROM `ksn_03_JoinSimple_Personen`
     JOIN `ksn_03_JoinSimple_Fremdsprachen`
     JOIN `ksn_03_JoinSimple_Sprachkenntnisse`
     ON `ksn_03_JoinSimple_Sprachkenntnisse`.PersonID = `ksn_03_JoinSimple_Personen`.ID
     AND `ksn_03_JoinSimple_Sprachkenntnisse`.FremdspracheID = `ksn_03_JoinSimple_Fremdsprachen`.ID
     WHERE(SELECT COUNT(FremdspracheID) FROM `ksn_03_JoinSimple_Sprachkenntnisse`)>=2;

-- Aufgabe 5
SELECT 
    p.Vorname,
    p.Nachname
FROM ksn_03_JoinSimple_Personen p
JOIN ksn_03_JoinSimple_Sprachkenntnisse sk 
    ON p.ID = sk.PersonID
GROUP BY p.ID
HAVING 
    COUNT(*) > 0
    AND MAX(sk.FremdspracheID = 1) = 0;

-- Aufgabe 6
SELECT 
    p.Vorname,
    p.Nachname
FROM ksn_03_JoinSimple_Personen p
JOIN ksn_03_JoinSimple_Sprachkenntnisse sk 
    ON p.ID = sk.PersonID
GROUP BY p.ID
HAVING 
    COUNT(*) > 2;

-- Aufgabe 7
SELECT `Sprache` 
FROM `ksn_03_JoinSimple_Fremdsprachen` s 
JOIN `ksn_03_JoinSimple_Sprachkenntnisse` sk ON s.`ID` = sk.`FremdspracheID`
GROUP BY s.`ID`
HAVING COUNT(`Sprache` WHERE Niveau = 'Muttersprachler') > 0;
