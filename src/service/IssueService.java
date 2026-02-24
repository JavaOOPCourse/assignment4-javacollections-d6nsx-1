package service;

import model.Issue;
import java.util.*;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void init() {
        issues.add(new Issue("Lost ID", 4));
        issues.add(new Issue("Scholarship", 1));
        issues.add(new Issue("Exam conflict", 2));
        issues.add(new Issue("Registration error", 3));
        issues.add(new Issue("Payment issue", 5));

        issues.poll();
        issues.poll();
    }

    public void show() {
        if (!issues.isEmpty())
            System.out.println("Most urgent: " + issues.peek());

        for (Issue i : issues)
            System.out.println(i);
    }

    public void add(String desc, int level) {
        issues.add(new Issue(desc, level));
    }
}