-- 3.a UNION
SELECT k.Unternehmung
FROM ksn_04_Kunde k
INNER JOIN ksn_04_Projekt p ON k.KID = p.KID
WHERE p.Deadline >= '2024-03-01' AND p.Deadline <= '2024-03-31'
UNION
SELECT k.Unternehmung
FROM ksn_04_Kunde k
INNER JOIN ksn_04_Projekt p ON k.KID = p.KID
WHERE p.Deadline >= '2024-04-01' AND p.Deadline <= '2024-04-30';

-- 3.b UNION ALL
SELECT m.`MID`, m.`Name` 
FROM `ksn_04_Mitarbeiter` m
INNER JOIN `ksn_04_Arbeitszeit` a ON m.`MID` = a.`MID`
INNER JOIN `ksn_04_Projekt` p ON a.`PID`=p.`PID`
INNER JOIN `ksn_04_Kunde` k ON p.`KID` = k.`KID`
WHERE k.`Unternehmung` = "Tech Solutions"
UNION
SELECT m.MID, m.`Name` 
FROM `ksn_04_Mitarbeiter` m
INNER JOIN `ksn_04_Arbeitszeit` a ON m.`MID` = a.`MID`
INNER JOIN `ksn_04_Projekt` p ON a.`PID`=p.`PID`
INNER JOIN `ksn_04_Kunde` k ON p.`KID` = k.`KID`
WHERE k.`Unternehmung` = "ABC GmbH";

-- 3.c INTERSECT
