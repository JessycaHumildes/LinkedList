package com.jhumildes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee JessyHumble = new Employee("Jessy","Humble",3456);
        Employee JakeYoung = new Employee("Jake","Young",4563);
        Employee BiaLinda = new Employee("Bia","Linda",5463);
        Employee DoraDora = new Employee("Dora","Dora", 54637);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(JessyHumble);
        list.addToFront(JakeYoung);
        list.addToFront(BiaLinda);
        list.addToFront(DoraDora);

        list.printList();

    }
}
