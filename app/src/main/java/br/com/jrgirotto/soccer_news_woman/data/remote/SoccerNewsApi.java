package br.com.jrgirotto.soccer_news_woman.data.remote;

import java.util.List;

import br.com.jrgirotto.soccer_news_woman.domain.News;
import retrofit2.Call;
import retrofit2.http.GET;

public interface SoccerNewsApi {

    @GET("news.json")
    Call<List<News>> getNews();
}
