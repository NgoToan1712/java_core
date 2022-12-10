package Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer("Nguyễn văn a", 10));
        list.add(new Customer("Nguyễn văn b", 5));
        list.add(new Customer("Nguyễn văn c", 3));
        list.add(new Customer("Nguyễn văn d", 7));
        list.add(new Customer("Nguyễn văn e", 9));
        list.add(new Customer("Nguyễn văn f", 1));
        list.add(new Customer("Nguyễn văn h", 8));
        //lọc các customer có points>=5;
        ArrayList<Customer> list1 = (ArrayList<Customer>) list
                .stream()
                .filter(item -> item.getPoints() >= 5)
                .collect(Collectors.toList());
        System.out.println("Customer points>=5");
        list1.forEach(item -> System.out.println(item.toString()));
        //đếm customer có point>=5
        int size = (int) list
                .stream()
                .filter(item -> item.getPoints() >= 5)
                .count();
        System.out.println("size= " + size);

        //map để ánh xạ obj này sang obj  khác
        System.out.println("list name customer");
        ArrayList<String> list4= (ArrayList<String>) list.stream().map(Customer::getName).collect(Collectors.toList());
        list4.forEach(System.out::println);

        System.out.println("________---------------");
        ArrayList<String> list3 = new ArrayList<>();
        for (Customer c : list) {
            list3.add(c.getName());
        }
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }
    }
}
