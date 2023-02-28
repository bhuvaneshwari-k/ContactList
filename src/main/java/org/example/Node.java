package org.example;

class Node{
    String name;
    long phno;
    String email;
    Node next=null;
    Node(String name, long phno, String email){
        this.name=name;
        this.phno=phno;
        this.email=email;
    }
}