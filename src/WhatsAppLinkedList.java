import java.util.LinkedList;

public class WhatsAppLinkedList {
    public static void main(String[] args) {
        LinkedList<String> notifications = new LinkedList<>();

        notifications.addFirst("New Message from Alice");
        notifications.addFirst("New Group Created");
        notifications.addFirst("Missed Call from Bob");

        System.out.println("Notifications: " + notifications);

        notifications.removeFirst();
        System.out.println("After clearing latest: " + notifications);
    }
}
