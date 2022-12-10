public class InnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.show();
    }
}

class Outer {
    public void show() {
        Inner in = new Inner();
        in.display();
    }

     static class Inner {
        public void display() {
            System.out.println("hello java");
        }
    }
}
class C{
    public void show(){
       // Outer.Inner in=new Outer().new Inner();
        //in.display();
        Outer.Inner in=new Outer.Inner();
        in.display();
    }

}
