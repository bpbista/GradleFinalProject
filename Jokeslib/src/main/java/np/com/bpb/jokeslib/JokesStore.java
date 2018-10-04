package np.com.bpb.jokeslib;

import java.util.ArrayList;
import java.util.List;

public class JokesStore {
    public static final List<String> jokes = new ArrayList<>();
    public static void addJokes(){

        //Jokes from http://www.laughfactory.com

        jokes.add("Q: What do computers eat for a snack? \n" +
                "A: Microchips!");
        jokes.add("I decided to make my password \"incorrect\" because if I type it in wrong, my computer will remind me, \"Your password is incorrect.\"");
        jokes.add("Q: What did the spider do on the computer? \n" +
                "A: Made a website!");
        jokes.add("Me: Siri, where is the best place to hide a body?\n" +
                "Siri: The second page of a Google search.");
        jokes.add("Yo mamma is so fat that when she sat on a laptop, the hardware turned into software!");
        jokes.add("I put my phone on airplane mode, but it sure ain't flyin'.");

    }
}
