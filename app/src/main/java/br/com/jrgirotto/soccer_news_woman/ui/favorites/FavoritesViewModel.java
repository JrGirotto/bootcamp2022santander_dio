package br.com.jrgirotto.soccer_news_woman.ui.favorites;

import android.os.AsyncTask;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import br.com.jrgirotto.soccer_news_woman.data.SoccerNewsWomanRepository;
import br.com.jrgirotto.soccer_news_woman.domain.News;

public class FavoritesViewModel extends ViewModel {

    public FavoritesViewModel() {

    }

    public LiveData<List<News>> loadFavoriteNews() {
        return SoccerNewsWomanRepository.getInstance().getLocalDb().newsDao().loadFavoriteNews();
    }

    public void saveNews(News news) {
        AsyncTask.execute(() -> SoccerNewsWomanRepository.getInstance().getLocalDb().newsDao().save(news));
    }

}