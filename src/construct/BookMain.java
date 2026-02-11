package construct;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayinfo();

        Book book2 = new Book("hello java", "seo");
        book2.displayinfo();
        Book book3 = new Book("jpa 프로그래밍", "kim", 70);
        book3.displayinfo();



    }
}
