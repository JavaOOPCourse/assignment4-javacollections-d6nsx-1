package service;

import java.util.*;

public class ActionHistoryService {

    private ArrayDeque<String> actions = new ArrayDeque<>();

    public void init() {
        actions.add("Submitted Assignment");
        actions.add("Dropped Course");
        actions.add("Registered Course");
        actions.add("Updated Profile");

        actions.removeLast();
        actions.add("Requested Transcript");
    }

    public void show() {
        System.out.println("First: " + actions.peekFirst());
        System.out.println("Last: " + actions.peekLast());

        for (String a : actions)
            System.out.println(a);
    }

    public void undo() {
        if (!actions.isEmpty())
            System.out.println("Removed: " + actions.removeLast());
    }
}