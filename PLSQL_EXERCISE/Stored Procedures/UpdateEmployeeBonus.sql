CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_department_id IN NUMBER,
    p_bonus_percentage IN NUMBER
)
IS
BEGIN

    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus_percentage / 100)
    WHERE Department_ID = p_department_id;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Employee bonus updated successfully');

END;
/