DECLARE

    CURSOR loan_cursor IS

        SELECT 
            c.name,
            l.loan_id,
            l.due_date

        FROM loan l

        JOIN customer c
        ON l.customer_id = c.customer_id

        WHERE l.due_date 
        BETWEEN SYSDATE AND SYSDATE + 30;


BEGIN

    FOR loan_rec IN loan_cursor
    LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear ' 
            || loan_rec.name
            || ', your loan ID '
            || loan_rec.loan_id
            || ' is due on '
            || loan_rec.due_date
        );

    END LOOP;


END;/
