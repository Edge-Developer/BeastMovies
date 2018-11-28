package i.am.edgedeveloper.beastmovies.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import i.am.edgedeveloper.beastmovies.R;
import i.am.edgedeveloper.beastmovies.entity.Movie;
import i.am.edgedeveloper.beastmovies.infrastructure.BeastMoviesApplication;

public class MainActivity extends BaseActivity {

    @BindView(R.id.activity_layout_progressbar)
    ProgressBar progressBar;

    @BindView(R.id.activity_movie_picture)
    ImageView moviePicture;

    @BindView(R.id.activity_main_movieTitle)
    TextView movieTitle;

    @BindView(R.id.activity_main_movieReleaseDate)
    TextView movieReleaseDate;

    @BindView(R.id.activity_main_movie_vote)
    TextView movieVote;

    @BindView(R.id.activity_main_movie_summary)
    TextView movieSummary;

    @BindView(R.id.activity_main_rightArrow)
    TextView rightArrow;

    @BindView(R.id.activity_main_leftArrow)
    TextView leftArrow;



/*    @BindView(R.id.activity_main_text)
    TextView textView;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Movie movie = new Movie("Android Movie", "A very fantastic Movie of the century",
                BeastMoviesApplication.BASE_PICTURE_URL + "/8uO0gUM8aNqYLs1OsTBQiXu0fEv.jpg", "11/6/2016", 5.0);

        updateUI(movie);
/*
        bus.post(new MovieServices.SearchMoviesRequest("query"));
    }

    @Subscribe
    public void getMovieMessage(MovieServices.SearchMoviesResponse responseh){
        textView.setText(responseh.modifiedQuery);

    }*/
    }

    private void updateUI(Movie movie) {
        progressBar.setVisibility(View.VISIBLE);
        movieTitle.setText(movie.getMovieTitle());
        movieSummary.setText(movie.getMovieSummary());
        movieReleaseDate.setText(movie.getMovieReleaseDate());
        movieVote.setText(Double.toString(movie.getMovieRating()));

        Picasso.with(this).load(movie.getMoviePictures())
                .fit()
                .centerCrop()
                .into(moviePicture, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBar.setVisibility(View.GONE);

                    }

                    @Override
                    public void onError() {

                    }
                });

    }

    @OnClick(R.id.activity_main_leftArrow)
    public void leftArrowAction (){
        Log.i(MainActivity.class.getSimpleName()
        , "Leftt Arrow was Clicked");
    }
    @OnClick(R.id.activity_main_rightArrow)
    public void rightArrowAction (){
        Log.i(MainActivity.class.getSimpleName()
                , "Right Arrow was Clicked");
    }
}
