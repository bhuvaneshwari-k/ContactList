package org.example;
import java.util.logging.Level;
import java.util.logging.Logger;
class LinkedList{
    Logger l=Logger.getLogger("welcome");
    Node rootNode=null;
    int count=0;
    public void addContact(String name, long phno, String email) {
        if(rootNode==null){
            rootNode=new Node(name,phno,email);
            count++;
        }
        else{
            Node temp=rootNode;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new Node(name,phno,email);
            count++;
        }
    }
    public void insertContact(String name, long phno, String email,int index){
        Node newNode=new Node(name,phno,email);
        if(index==0){
            l.info("After insert the contact at start:");
            Node temp=rootNode;
            newNode.next=temp;
            rootNode=newNode;
        }
        else{
            l.info("After insert the contact at middle/last:");
            Node temp=rootNode;
            int count1=0;
            while(temp!=null){
                Node current=temp.next;
                count1++;
                if(count1==index){
                    temp.next=newNode;
                    newNode.next=current;
                    break;
                }
                temp=temp.next;
            }
        }
        count++;
    }
    public void deleteContact(int index){
        if(index==0){
            l.info("After delete the contact at start:");
            Node temp=rootNode;
            rootNode=temp.next;
        }
        else{
            l.info("After delete the contact at middle/last:");
            Node temp=rootNode;
            int count1=0;
            while(temp!=null){
                Node prev=temp.next;
                count1++;
                if(count1==index){
                    temp.next=prev.next;
                    break;
                }
                temp=temp.next;
            }
        }
        count--;
    }
    public void searchContact(String name){
        Node temp=rootNode;
        int search=0;
        while(temp!=null){
            if(temp.name.equals(name)){
                search++;
                String contactname=temp.name;
                long phonenumber=temp.phno;
                String emailid=temp.email;
                l.log(Level.INFO,()->"The searched contact name is:"+contactname);
                l.log(Level.INFO,()->"The searched contact phonenumnber is:"+phonenumber);
                l.log(Level.INFO,()->"The searched contact email id is:"+emailid);
                break;
            }
            temp=temp.next;
        }
        if(search==0)
            l.info("The searched contact is not present in the list.");
    }
    public void displayContact(){
        Node temp=rootNode;
        if(temp==null){
            l.info("Contact List is empty");
        }
        else{
            while(temp!=null){
                String contactname=temp.name;
                long phonenumber=temp.phno;
                String emailid=temp.email;
                l.log(Level.INFO,()->"Contact Name is:"+contactname );
                l.log(Level.INFO,()->"Contact Phone Number is:"+ phonenumber);
                l.log(Level.INFO,()->"Contact Email ID is:"+ emailid);
                temp=temp.next;
            }
        }
        l.log(Level.INFO,()->"Contact List size is:"+ count);

    }
}
