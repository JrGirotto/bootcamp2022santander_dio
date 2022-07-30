package br.com.jrgirotto.soccer_news_woman.data;

import androidx.room.Room;

import br.com.jrgirotto.soccer_news_woman.App;
import br.com.jrgirotto.soccer_news_woman.data.local.SoccerNewsDb;
import br.com.jrgirotto.soccer_news_woman.data.remote.SoccerNewsApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SoccerNewsWomanRepository {

    private static final String REMOTE_API_URL = "https://JrGirotto.github.io/soccer-news-api/";
    private static final String LOCAL_DB_NAME = "soccer-news";

    private SoccerNewsApi remoteApi;
    private SoccerNewsDb localDb;

    public SoccerNewsApi getRemoteApi() {
        return remoteApi;
    }

    public SoccerNewsDb getLocalDb() {
        return localDb;
    }

    private SoccerNewsWomanRepository () {
        remoteApi = new Retrofit.Builder()
                .baseUrl(REMOTE_API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(SoccerNewsApi.class);

        localDb = Room.databaseBuilder(App.getInstance(), SoccerNewsDb.class, LOCAL_DB_NAME).build();
    }

    public static SoccerNewsWomanRepository getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final SoccerNewsWomanRepository INSTANCE = new SoccerNewsWomanRepository();
    }
}
