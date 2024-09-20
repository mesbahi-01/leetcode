package org.example.testt;

import java.io.File;

public class FileSystemPrinter implements MyInterface {
    private int mySecondAttribute;
    class SecondClass {
        public void print() {
            System.out.println(mySecondAttribute);
        }
    }
    public static void main(String[] args) {
        SecondClass sc = new FileSystemPrinter().new SecondClass();
        sc.print();
    }

}
