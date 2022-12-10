public class TestMultiPrority1 extends  Thread{

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"name:"+Thread.currentThread().getName());
            //System.out.println("priority"+Thread.currentThread().getPriority());
        }

    }

    public static void main(String[] args) {
        TestMultiPrority1 m1=new TestMultiPrority1();
        TestMultiPrority1 m2=new TestMultiPrority1();
        m1.setName("t1");
        m2.setName("t2");
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();
    }
}
