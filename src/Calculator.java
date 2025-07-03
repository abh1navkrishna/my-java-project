public class Calculator {

    //method overloading
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public void sum(int x,int y,int z){
        System.out.println(x+y+z);
    }
    public void sum(double d,double e){
        System.out.println(d+e);
    }

public static void main(String[] args) {
    Calculator s=new Calculator();

    s.sum(4,66,4);
}

}
