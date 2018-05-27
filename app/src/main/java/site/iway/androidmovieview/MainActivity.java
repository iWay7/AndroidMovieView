package site.iway.androidmovieview;

import android.app.Activity;
import android.content.res.AssetManager;
import android.os.Bundle;

import java.io.IOException;
import java.io.InputStream;

import site.iway.androidhelpers.MovieView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            AssetManager assetManager = getAssets();
            InputStream inputStream = assetManager.open("movie.gif");
            MovieView movieView = findViewById(R.id.movieView);
            movieView.load(inputStream);
        } catch (IOException e) {
            // nothing
        }
    }
}
