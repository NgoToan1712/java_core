package Test1;
@FunctionalInterface
public interface IPrintable {
    void print(int a);
    //chỉ đuợc định nghĩa duy nhất 1 abs method
   // void print2();

    default void display(String name){
        System.out.println("name: "+name);
    }
}
