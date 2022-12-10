import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<News> list = new ArrayList<>();
        int n;
        do {
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            n = (new Scanner(System.in)).nextInt();
            switch (n) {
                case 1:
                    News news = new News();
                    insertNews(news);
                    news.setId(list.size() + 1);
                    list.add(news);
                    System.out.println("successfull add");
                    break;
                case 2:
                    System.out.println("List news:");
                    for (News n2 : list) {
                        n2.Display();
                    }
                    break;
                case 3:
                    System.out.println("List news calculation:");
                    for (News n1 : list) {
                        n1.Calculate();
                        n1.Display();
                    }
                    break;

                case 4:
                    break;
                default:
                    System.out.println("Another choice!");
                    break;

            }
        } while (n != 4);
    }

    static void insertNews(News news) {
        System.out.println("enter title:");
        news.setTitle((new Scanner(System.in)).nextLine());
        news.setPublishDate(LocalDate.now());
        System.out.println("enter author: ");
        news.setAuthor((new Scanner(System.in)).nextLine());
        System.out.println("enter content");
        news.setContent((new Scanner(System.in)).nextLine());
        System.out.println("enter reviews(1->5):");
        for (int i = 0; i < news.RateList.length; i++) {
            do {
                System.out.printf("review %d: ", i + 1);
                news.RateList[i] = (new Scanner(System.in)).nextInt();
            } while (!(1 <= news.RateList[i] && news.RateList[i] <= 5));

        }

    }
}
