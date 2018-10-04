package np.com.bpb.jokeslib;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Joke {
    private static List<String> jokes = new ArrayList<>();

    public static String tellAJoke(){
        int jokeIndex;
        jokeIndex = getAJoke();
        return jokes.get(jokeIndex);
    }
    private static int getAJoke(){
        int number;
        Random random = new Random();
        number = random.nextInt(jokes.size());
        return number;
    }

    public static void setJokes(List<String> jokes) {
        Joke.jokes = jokes;
    }

    public static List<String> getJokes() {
        return jokes;
    }
}

