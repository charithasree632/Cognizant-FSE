CREATE TABLE Accounts(
    Account_ID NUMBER PRIMARY KEY,
    Customer_Name VARCHAR2(50),
    Account_Type VARCHAR2(20),
    Balance NUMBER
);


CREATE TABLE Employees(
    Employee_ID NUMBER PRIMARY KEY,
    Employee_Name VARCHAR2(50),
    Department_ID NUMBER,
    Salary NUMBER
);