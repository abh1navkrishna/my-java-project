import java.util.ArrayList;

public class WhatsAppArrayList {
    public static void main(String[] args) {
        ArrayList<String> messages = new ArrayList<>();

        messages.add("Hi");
        messages.add("How are you?");
        messages.add("I’m good. You?");

        System.out.println("Second message: " + messages.get(1));

        System.out.println("All messages: " + messages);

        messages.remove(0);
        System.out.println("After deleting first: " + messages);
    }
}
