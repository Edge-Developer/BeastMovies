package i.am.edgedeveloper.beastmovies.live;

import i.am.edgedeveloper.beastmovies.infrastructure.BeastMoviesApplication;

/**
 * Created by OPEYEMI OLORUNLEKE on 11/5/2016.
 */

public class Module {

    public static void Register (BeastMoviesApplication application){
        new LiveMovieServices(application);
    }
}
