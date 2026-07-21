DECLARE

    CURSOR customer_cursor IS
        SELECT customer_id, age
        FROM customer;

BEGIN

    FOR cust IN customer_cursor
    LOOP

        IF cust.age > 60 THEN

            UPDATE loan
            SET interest_rate = interest_rate - 1
            WHERE customer_id = cust.customer_id;

            DBMS_OUTPUT.PUT_LINE(
                '1% discount applied for Customer ID: ' 
                || cust.customer_id
            );

        END IF;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE(
        'Loan interest rates updated successfully.'
    );

END;
/