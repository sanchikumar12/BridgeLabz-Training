package CinemaHouse;

import java.util.Scanner;

public class CinemaHouse {

    public static void bubbleSort(Movie[] movies, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (movies[j].showTime > movies[j + 1].showTime) {
                    Movie temp = movies[j];
                    movies[j] = movies[j + 1];
                    movies[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Movie[] movies = new Movie[n];

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int time = sc.nextInt();
            sc.nextLine();
            movies[i] = new Movie(name, time);
        }

        bubbleSort(movies, n);

        for (Movie m : movies) {
            System.out.println(m.name + " " + m.showTime);
        }

        sc.close();
    }
}