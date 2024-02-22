package examples.JavaAccessExample.demo;

import examples.JavaAccessExample.test.Foo;

public class Bar extends Foo {
    private int sum = 10;
    public void reportSum() {
        sum += result;
//        compiler error:
//        sum += value;
    }
}