import service.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        AppointmentService appointmentService = new AppointmentService();
        IssueService issueService = new IssueService();
        ActionHistoryService actionService = new ActionHistoryService();

        studentService.init();
        appointmentService.init();
        issueService.init();
        actionService.init();

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1 Students");
            System.out.println("2 Appointments");
            System.out.println("3 Issues");
            System.out.println("4 Actions");
            System.out.println("5 Add Issue");
            System.out.println("6 Undo Action");
            System.out.println("0 Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> studentService.showStudents();
                case 2 -> appointmentService.show();
                case 3 -> issueService.show();
                case 4 -> actionService.show();
                case 5 -> {
                    System.out.print("Description: ");
                    String d = sc.nextLine();
                    System.out.print("Urgency: ");
                    int u = sc.nextInt();
                    issueService.add(d, u);
                }
                case 6 -> actionService.undo();
            }

        } while (choice != 0);
    }
}