package artexpo;

import java.util.ArrayList;
import java.util.List;

public class ArtExpo {

   
    public static void insertionSort(List<Artist> artists) {
        for (int i = 1; i < artists.size(); i++) {
            Artist key = artists.get(i);
            int j = i - 1;

         
            while (j >= 0 && artists.get(j).registrationTime > key.registrationTime) {
                artists.set(j + 1, artists.get(j));
                j--;
            }
            artists.set(j + 1, key);
        }
    }

    public static void main(String[] args) {

        List<Artist> registrations = new ArrayList<>();

      
        registrations.add(new Artist("Alice", 105));
        registrations.add(new Artist("Bob", 101));
        registrations.add(new Artist("Charlie", 110));
        registrations.add(new Artist("Diana", 103));

        
        insertionSort(registrations);

        System.out.println("Artists sorted by registration time:");
        for (Artist a : registrations) {
            System.out.println(a);
        }
    }
}