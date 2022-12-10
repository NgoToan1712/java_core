import java.time.LocalDate;
import java.util.Arrays;

public class News implements INews {
    int id;
    String title;
   LocalDate publishDate;
    String author;
    String content;
    float averageRate;

    public News() {

    }

    public News(int id, String title, LocalDate publishDate, String author, String content, float averageRate) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public LocalDate getPublishDate() {

        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {

        this.publishDate = publishDate;
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {

        this.author = author;
    }

    public String getContent() {

        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {

        return averageRate;
    }

    int[] RateList = new int[3];

    void Calculate() {
        this.averageRate = (float) (RateList[0] + RateList[1] + RateList[2]) / RateList.length;
    }

    @Override
    public void Display() {
        System.out.println("Title "+this.getTitle()+"Publish date "+this.getPublishDate());
        System.out.println("Publish date "+this.getPublishDate());
        System.out.println("Author "+this.getAuthor());
        System.out.println("Average rate:"+this.getAverageRate());
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", averageRate=" + averageRate +
                ", RateList=" + Arrays.toString(RateList) +
                '}';
    }
}
