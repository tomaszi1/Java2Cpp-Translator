package com.translator.testfiles;

public class ExpressionTest {

    void metoda() {
        boolean b = true;
        boolean a = false;
        boolean c = b && a;
    }

    public boolean doSomething(Number param) {
        if (param instanceof Klasa) {
            return true;
        } else if (param instanceof Number) {
            return false;
        }
        return true;
    }
}

abstract class Klasa extends Number implements Interfejs {
}

interface Interfejs {

    int i = 0;
}
