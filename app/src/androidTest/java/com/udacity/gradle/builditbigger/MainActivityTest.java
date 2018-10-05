package com.udacity.gradle.builditbigger;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Test
    public void testGCETask() {
        try {
            JokeLoaderTask task = new JokeLoaderTask(new JokeLoaderTask.Listener() {
                @Override
                public void onJokeLoaded(String joke) {
                    assertNotNull("Joke is null", joke);
                }
            });

            String joke = task.execute().get(10, TimeUnit.SECONDS);

            assertNotNull("Joke is null", joke);
//            assertTrue("Joke length is shorter than 1", joke.length() >= 1);
        } catch (Exception ex) {
            fail("Exception while trying to load joke: " + ex.getMessage());
        }

    }
}