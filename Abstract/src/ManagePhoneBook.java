import java.util.Scanner;

public class ManagePhoneBook {
    static PhoneBook p = new PhoneBook();
    static String name;
    static String phone;

    public static void main(String[] args) {
        int n;
        do {
            System.out.println(" PHONEBOOK MANAGEMENT SYSTEM");
            System.out.println("   1. Insert Phone" +
                    "\n" +
                    "   2. Remove Phone" +
                    "\n" +
                    "   3. Update Phone" +
                    "\n" +
                    "   4. Search Phone" +
                    "\n" +
                    "   5. Sort" +
                    "\n" +
                    "   6. Exit");
            System.out.println("Chọn:");
            n = (new Scanner(System.in)).nextInt();
            switch (n) {
                case 1:
                    insertPhone();
                    break;
                case 2:
                    removePhone();
                    break;
                case 3:
                    updatePhone();
                    break;
                case 4:
                    searchPhone();
                    break;
                case 5:
                    sort();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Lựa chọn khác:");
                    break;

            }

        } while (n != 6);
    }

    static void insertPhone() {
        System.out.println("Enter name:");
        name = (new Scanner(System.in)).nextLine();
        System.out.println("Enter phone:");
        phone = (new Scanner(System.in)).nextLine();
        p.insertPhone(name, phone);

    }

    static void removePhone() {
        System.out.println("Enter the name you want to delete");
        name = (new Scanner(System.in)).nextLine();
        p.removePhone(name);
    }

    static void updatePhone() {
        System.out.println("Enter the name you want to update");
        name = (new Scanner(System.in)).nextLine();
        boolean c = false;
        for (String str : p.PhoneList) {
            if (name.equals(str.substring(0, str.indexOf(":"))) == true) {
                int index=p.PhoneList.indexOf(str);
                System.out.println("Enter the phone you want to update");
                phone = (new Scanner(System.in)).nextLine();
                p.updatePhone(name, phone,index);
                c = true;
                break;

            }
        }
        if (c == false) {
            System.out.println(name + "not found");
        }

    }

    static void sort() {
        p.sort();
    }

    static void searchPhone() {
        System.out.println("Enter the name you want to search");
        name = (new Scanner(System.in)).nextLine();
        p.searchPhone(name);
    }

}
