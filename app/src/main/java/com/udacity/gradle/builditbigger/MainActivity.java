package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.MobileAds;

import np.com.bpb.andjokeserver.JokesTellerActivity;
import np.com.bpb.jokeslib.Joke;
import np.com.bpb.jokeslib.JokesStore;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
//        MobileAds.initialize(this, "YOUR_ADMOB_APP_ID");
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        //calling sequence is important
        String joke;
        JokesStore.addJokes();
        Joke.setJokes(JokesStore.jokes);
        joke = Joke.tellAJoke();
//        Toast.makeText(this, Joke.tellAJoke(), Toast.LENGTH_SHORT).show();
        lauchJokesTellerActivity(joke);
    }

    public void lauchJokesTellerActivity(String joke){
        Intent intent = new Intent(this,JokesTellerActivity.class);
        intent.putExtra(JokesTellerActivity.EXTRA_JOKES,joke);
        startActivity(intent);
    }

}
