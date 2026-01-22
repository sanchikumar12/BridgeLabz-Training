package CinemaHouse;

class Movie {
    String name;
    int showTime; // 24-hour format, e.g., 1430

    Movie(String name, int showTime) {
        this.name = name;
        this.showTime = showTime;
    }
}