package i.am.edgedeveloper.beastmovies.services;

/**
 * Created by OPEYEMI OLORUNLEKE on 11/5/2016.
 */

public class MovieServices {

    private MovieServices() {

    }

    public static class SearchMoviesRequest{
        public String query;

        public SearchMoviesRequest(String query) {
            this.query = query;
        }
    }

    public static class SearchMoviesResponse{
        public String modifiedQuery;

    }
}
