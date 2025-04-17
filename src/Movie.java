public class Movie extends Main {
    private String director;
    private int duration;

    public Movie(String title, int publicationYear, String director, int duration) {
        super(title, publicationYear);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Director: " + director);
        System.out.println("Duration: " + duration + " minutes");
    }

    public void checkDuration() {
        if (duration > 120) {
            System.out.println(title + " is a long movie (" + duration + " minutes).");
        } else {
            System.out.println(title + " is a standard movie (" + duration + " minutes).");
        }
    }
}

