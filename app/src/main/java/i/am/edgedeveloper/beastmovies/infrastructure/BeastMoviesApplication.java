package i.am.edgedeveloper.beastmovies.infrastructure;

import android.app.Application;

import com.squareup.otto.Bus;


/**
 * Created by OPEYEMI OLORUNLEKE on 11/5/2016.
 */

public class BeastMoviesApplication extends Application {

    private Bus bus;

    public static final String API_KEY = "11f4275ea0f71297a1d33044b675828f";
    public static final String BASE_URL = "https://api.themoviedb.org";
    public static final String BASE_PICTURE_URL = "https://image.tmdb.org/t/p/w185";

    public BeastMoviesApplication() {
        bus = new Bus();
    }
    
    @Override
    public void onCreate() {
        super.onCreate();
//        Module.Register(this);

    }

    public Bus getBus() {
        return bus;
    }
}

