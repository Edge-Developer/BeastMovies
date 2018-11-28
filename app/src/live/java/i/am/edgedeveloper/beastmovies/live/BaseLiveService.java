package i.am.edgedeveloper.beastmovies.live;

import com.squareup.otto.Bus;

import i.am.edgedeveloper.beastmovies.infrastructure.BeastMoviesApplication;

/**
 * Created by OPEYEMI OLORUNLEKE on 11/5/2016.
 */

public class BaseLiveService {

    protected BeastMoviesApplication application;
    protected Bus bus;

    public BaseLiveService(BeastMoviesApplication application) {
        this.application = application;
        bus= application.getBus();
        bus.register(this);
    }

}
