package com.jhumildes;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public int getSize(){
        return size;
    }

    //to know if the list is empty
    public boolean isEmpty(){
        return  head == null;
    }

    //removing items

    public EmployeeNode removeFromFront(){
        if (isEmpty()){
            return null;
        }
        EmployeeNode removedNode = head;
        head = head.getNext();
        size --;
        return removedNode;
    }
    public void printList(){
        EmployeeNode current = head;
        System.out.print("HEAD->");
        while(current !=null){
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("Null");
    }
}
