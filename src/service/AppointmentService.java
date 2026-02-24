package service;

import java.util.*;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void init() {
        appointments.add("Consultation A");
        appointments.add("Consultation B");
        appointments.add("Consultation C");

        appointments.addFirst("URGENT Consultation");
        appointments.removeLast();
    }

    public void show() {
        System.out.println("First: " + appointments.getFirst());
        System.out.println("Last: " + appointments.getLast());

        for (String a : appointments)
            System.out.println(a);
    }
}