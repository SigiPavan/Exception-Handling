import java.sql.SQLException;

public class ThrowsConcept {
    public static void main(String[] args) {
        int a=  10;
        int b=0;
        try{
            int c=divide(a,b);
        }
        catch(Exception e){
            System.out.println("B");
        }
        System.out.println("A");
    }

     static int divide(int a, int b)  {
        return a/b;
    }
}
