package org.example.testt;

public interface MyInterface {
    int myattribute = 0;

    default int getMyattribute() {
        return myattribute;
    }
}
