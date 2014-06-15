package com.translator.testfiles;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StatementTest {

    void metoda(String a) {
        int j = 3;
        if (j > 3) {
            Object o = new Object();
            try {
                throw new Exception();
            } catch (Exception ex) {
            }
        }
        for (int i = 1; i < 10; i++) {
            something();
        }

        boolean b = true;

        while (b) {
            something();
        }

        try {
            something();
            throw new Exception();
        } catch (Exception ex) {
            int q = 2;
        } finally {
            something();
            int w = 5;
        }

        switch (j) {
            case 1:
                something();
                break;
            case 2: {
                int qwer = 4;
                break;
            }
            default:
                break;
        }

        return;
    }

    void something() {
    }
}
