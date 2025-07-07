package test;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Abhinav");
        list.add("Appu");
        list.add("Achu");
        list.size();
        

        for (String name : list) {
            System.out.println(name);
        }

    }
}
