import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowException{
    public static void main(String[] args) throws AgeException {

        try{
            int tuoi=input();
            System.out.println("Tuổi: "+tuoi);
        }catch (AgeException e){
            throw new AgeException("Tuoi không thể là số âm");
        }catch (InputMismatchException ex){
            throw new InputMismatchException("tuổi không là chữ");
        }
    }
    public static  int input()throws AgeException,InputMismatchException{
        System.out.println("Nhập tuổi: ");
        int tuoi=0;

            tuoi=(new Scanner(System.in)).nextInt();
            if(tuoi<0) {
                throw new AgeException("Tuổi không thể là soo âm");
            }


        return tuoi;
    }
}

class AgeException extends Exception{
    public AgeException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "lỗi khi nhập: "+super.getMessage();
    }
}
