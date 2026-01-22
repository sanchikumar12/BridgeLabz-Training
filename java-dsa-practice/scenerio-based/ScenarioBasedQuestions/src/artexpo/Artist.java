package artexpo;

import java.util.ArrayList;
import java.util.List;

class Artist {
    String name;
    long registrationTime; // smaller value = earlier registration

    Artist(String name, long registrationTime) {
        this.name = name;
        this.registrationTime = registrationTime;
    }

    @Override
    public String toString() {
        return name + " (time=" + registrationTime + ")";
    }
}