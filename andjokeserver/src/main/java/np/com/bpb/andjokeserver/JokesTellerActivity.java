package np.com.bpb.andjokeserver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import np.com.bpb.jokeslib.Joke;
import np.com.bpb.jokeslib.JokesStore;

public class JokesTellerActivity extends AppCompatActivity {
    public static final String EXTRA_JOKES = "np.com.bpb.EXTRA_JOKES";
    private String joke;
    TextView jokesView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes_teller);
        joke = getIntent().getStringExtra(EXTRA_JOKES);
        jokesView = findViewById(R.id.jokes_text_view);
        jokesView.setText(joke);
        Log.d("AndroidServer:", "onCreate: "+joke);
    }

    public void refreshJoke(View view) {
        JokesStore.addJokes();
        Joke.setJokes(JokesStore.jokes);
        joke = Joke.tellAJoke();
        jokesView.setText(joke);
    }
}
