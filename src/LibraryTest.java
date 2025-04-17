public class LibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book("The Witcher", 1990, "Andrzej Sapkowski", 320);
        Movie movie1 = new Movie("The Green Mile", 1999, "Frank Darabont", 189);

        Main[] mediaArray = new Main[2];
        mediaArray[0] = book1;
        mediaArray[1] = movie1;

        System.out.println("===== INFORMATION ABOUT ALL MEDIA =====");
        for (Main media : mediaArray) {
            media.displayInformation();
            System.out.println("--------------------");
        }

        System.out.println("\n===== BORROWING AND RETURNING OPERATIONS =====");
        book1.borrow();
        book1.borrow(); // should fail
        book1.returnMedia();

        System.out.println("\n===== TYPE-SPECIFIC METHODS =====");
        book1.checkNumberOfPages();
        movie1.checkDuration();

        System.out.println("\n===== TYPE CASTING =====");
        for (Main media : mediaArray) {
            if (media instanceof Book) {
                Book b=(Book)media;
                b.checkNumberOfPages();
            } else if (media instanceof Movie) {
                ((Movie) media).checkDuration();
            }
        }
    }
}


