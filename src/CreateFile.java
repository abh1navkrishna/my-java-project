import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CreateFile {
    public static void main(String[] args) {
        // create new file

        // File f=new File("C:/Users/abhin/Downloads/Simple.txt");
        // try {
        // boolean status=f.createNewFile();
        // if (status) {
        // System.out.println("The new file craeted");
        // }else{
        // System.out.println("the file already exist");
        // }
        // } catch (Exception e) {
        // System.out.println(e);
        // }

        // add content

        // String message = "Learn Java Program";

        // try {
        // FileWriter fw=new FileWriter("C:/Users/abhin/Downloads/Simple.txt");
        // fw.write(message);
        // System.out.println("Message written to file...");
        // fw.close();
        // } catch (Exception e) {
        // System.out.println(e);
        // }

        // read file

        // char[] data=new char[50];

        // try {
        // FileReader fr=new FileReader("C:/Users/abhin/Downloads/Simple.txt");
        // fr.read(data);
        // System.out.println(data);
        // } catch (Exception e) {
        // System.out.println(e);
        // }

        // delete file

        File d = new File("C:/Users/abhin/Downloads/Simple.txt");
        d.delete();
    }

}
