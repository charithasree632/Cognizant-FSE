CREATE TABLE LOAN (
    Loan_ID NUMBER PRIMARY KEY,
    Customer_ID NUMBER,
    Loan_Amount NUMBER(10,2),
    Interest_Rate NUMBER(5,2),
    Due_Date DATE,

    CONSTRAINT fk_customer
    FOREIGN KEY (Customer_ID)
    REFERENCES CUSTOMER(Customer_ID)
);