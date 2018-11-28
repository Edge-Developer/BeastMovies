package i.am.edgedeveloper.beastmovies.live;

import com.squareup.otto.Subscribe;

import i.am.edgedeveloper.beastmovies.infrastructure.BeastMoviesApplication;
import i.am.edgedeveloper.beastmovies.services.MovieServices;

/**
 * Created by OPEYEMI OLORUNLEKE on 11/5/2016.
 */

public class LiveMovieServices extends BaseLiveService {


    public LiveMovieServices(BeastMoviesApplication application) {
        super(application);
    }

    @Subscribe
    public void getMovieMessage(MovieServices.SearchMoviesRequest request){
        MovieServices.SearchMoviesResponse response = new MovieServices.SearchMoviesResponse();
        response.modifiedQuery = request.query+" this query was modified";
        bus.post(response);
    }
}