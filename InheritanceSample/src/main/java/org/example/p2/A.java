package org.example.p2;

public class A {  // Parent or Super Class
    public int v1 = 5;
    // int v2 = 10; package private, not Public, therefore not accessible from outside
    public int v3 = 15;
    public int v4 = 20;
    private int v7 = 45;  // private is only accessible in its own class
    // private variables do not get inherited

   // protected v8 = 45; // not accessible by Main or any other outside classes
}
