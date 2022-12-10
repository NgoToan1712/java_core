import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try{
        int a=(new Scanner(System.in)).nextInt();
        int b=(new Scanner(System.in)).nextInt();
        int c=a/b;
            System.out.println("a/b= "+c);

    }catch(Exception e){
            System.out.println("error: "+e);
        }
}}
