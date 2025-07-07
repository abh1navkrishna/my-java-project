public class App {

    public static void main(String[] args) throws Exception {

        // =============== Polimorphism ================

        India p1 = new India();
        India p2 = new Delhi();
        India p3 = new TamilNad();
        India p4 = new Kerala();

        // p1.speaking();
        // p2.speaking();
        // p3.speaking();
        // p4.speaking();

        // ================= Encapsulation ===============

        Employee e = new Employee();

        e.setName("Abhinav");
        e.setSalary(100000);

        // System.out.println("Name : "+ e.getName());
        // System.out.println("Salary : "+e.getSalary());

        // ================= Abstraction ====================

        // method 1

        SearchAll a = new SearchAll();
        ImageSearch i=new ImageSearch();
        VideoSearch v=new VideoSearch();

        // i.search();
        // v.search();
        // a.search();

        // method 2

        AudioCall audioCall=new AudioCall();
        VideoCall videoCall=new VideoCall();

        audioCall.call();
        audioCall.mute();
        videoCall.disConnect();
        
    }
}
