CREATE OR REPLACE PROCEDURE TransferFunds(
    p_source_account IN NUMBER,
    p_target_account IN NUMBER,
    p_amount IN NUMBER
)
IS
    v_balance NUMBER;

BEGIN

    -- Get source account balance
    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE Account_ID = p_source_account;


    -- Check sufficient balance
    IF v_balance >= p_amount THEN


        -- Deduct from source account
        UPDATE Accounts
        SET Balance = Balance - p_amount
        WHERE Account_ID = p_source_account;


        -- Add to target account
        UPDATE Accounts
        SET Balance = Balance + p_amount
        WHERE Account_ID = p_target_account;


        COMMIT;

        DBMS_OUTPUT.PUT_LINE('Funds transferred successfully');


    ELSE

        DBMS_OUTPUT.PUT_LINE('Insufficient balance');

    END IF;


EXCEPTION

    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Account not found');

END;
/