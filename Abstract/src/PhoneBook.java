import java.util.ArrayList;
import java.util.Collections;


public class PhoneBook extends Phone {
    public ArrayList<String> PhoneList = new ArrayList<>();

    @Override
    void insertPhone(String name, String phone) {
        boolean c = false;
        for (String str : PhoneList) {
            if (str.contains(name) == true) {
                c = true;
                if (str.contains(phone) == true) {
                    System.out.println("The phone number is already in the list");
                } else {
                    str += ":" + phone;
                }

            }

        }
        if (c == false) {
            String s=name + ":" + phone;
            PhoneList.add(s);
        }
    }

    @Override
    void removePhone(String name) {
        boolean c = false;
        for (int i=0;i<PhoneList.size();i++) {
            if (name.equals(PhoneList.get(i).substring(0, PhoneList.get(i).indexOf(":")))) {
                PhoneList.remove(i);
                c = true;

            }
        }
        if (c == true) {
            System.out.println("Successful delete!");
        } else {
            System.out.println(name + " not found");
        }

    }

    @Override
    void updatePhone(String name, String newphone, int index) {
//        String s = name;
//        System.out.println(s);
//        s = s.substring(0, s.indexOf(":"));
//        System.out.println(s);
        //PhoneList.set(PhoneList.indexOf(s), s + ":" + newphone);
        PhoneList.set(index,(name+":"+newphone));
        System.out.println("Successful update!");
    }

    @Override
    void searchPhone(String name) {
        boolean c = false;
        for (String str : PhoneList) {
            if (str.contains(name)) {
                System.out.println(str.toString());
                c = true;
                break;
            }
        }
        if (c == false) {
            System.out.println(name + " not found");
        }

    }

    @Override
    void sort() {
        Collections.sort(PhoneList, new NameComparator());
        for (String str : PhoneList) {
            System.out.println(str);
        }
    }

}
