package i.am.edgedeveloper.beastmovies.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.squareup.otto.Bus;

import i.am.edgedeveloper.beastmovies.infrastructure.BeastMoviesApplication;

/**
 * Created by OPEYEMI OLORUNLEKE on 11/5/2016.
 */

public class BaseActivity extends AppCompatActivity{

    protected BeastMoviesApplication application;
    protected Bus bus;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        application = (BeastMoviesApplication) getApplication();
        bus = application.getBus();
        bus.register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bus.unregister(this);

    }
}
