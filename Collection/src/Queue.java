import java.util.PriorityQueue;
import java.util.Stack;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        //đẩy cách phần tử vào hàng đơi
        queue.offer("A1");
        queue.offer("A2");
        queue.offer("A3");
        //ấy phần tử ra
        System.out.println(queue.poll());
        Stack<Integer> s=new Stack<>();
        //đẩy ptuwr vào năng xếp
        for (int i = 0; i < 10; i++) {
            s.push(i);
        }
        //trả về vị trí ptu trong stack tu đỉnh nếu ko thấy trả về -1
        System.out.println(s.search(6));
        //lấy phần tử đầu ngăn xếp
        while (!s.isEmpty()){
            //trả về phần tử đầu stck mà ko loại bỏ nó ra khỏi stack
            System.out.println(s.peek()+"  ");
            //ấy 1 ptu từ đinh
            s.pop();
        }
    }
}
