package examples.JavaAccessExample.demo;

import examples.JavaAccessExample.test.Foo3;

public class Bar3 extends Foo3 {
    private int sum = 10;

    public void reportSum() {
        sum += getResult();
    }
}