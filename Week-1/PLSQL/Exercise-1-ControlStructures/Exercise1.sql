CREATE TABLE Customers (
                           CustomerID NUMBER PRIMARY KEY,
                           Name VARCHAR2(100),
                           Age NUMBER,
                           Balance NUMBER,
                           IsVIP VARCHAR2(5)
);


CREATE TABLE Loans (
                       LoanID NUMBER PRIMARY KEY,
                       CustomerID NUMBER,
                       InterestRate NUMBER,
                       DueDate DATE
);

INSERT INTO Customers VALUES (1,'Rahul',65,15000,'FALSE');
INSERT INTO Customers VALUES (2,'Priya',45,8000,'FALSE');
INSERT INTO Customers VALUES (3,'Amit',70,20000,'FALSE');

INSERT INTO Loans VALUES (101,1,8.5,SYSDATE+15);
INSERT INTO Loans VALUES (102,2,9.0,SYSDATE+45);
INSERT INTO Loans VALUES (103,3,7.5,SYSDATE+25);

COMMIT;

-- Scenario 1

BEGIN
FOR cust IN (SELECT CustomerID, Age FROM Customers)
    LOOP
        IF cust.Age > 60 THEN
UPDATE Loans
SET InterestRate = InterestRate - 1
WHERE CustomerID = cust.CustomerID;
END IF;
END LOOP;

COMMIT;
END;
/

-- Scenario 2

BEGIN
FOR cust IN (SELECT CustomerID, Balance FROM Customers)
    LOOP
        IF cust.Balance > 10000 THEN
UPDATE Customers
SET IsVIP = 'TRUE'
WHERE CustomerID = cust.CustomerID;
END IF;
END LOOP;

COMMIT;
END;
/

-- Scenario 3

SET SERVEROUTPUT ON;

BEGIN
FOR loan IN (
        SELECT CustomerID, LoanID, DueDate
        FROM Loans
        WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ID ' || loan.LoanID ||
            ' for Customer ID ' || loan.CustomerID ||
            ' is due on ' || loan.DueDate
        );
END LOOP;
END;
/