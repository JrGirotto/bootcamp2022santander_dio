package br.com.jrgirotto.soccer_news_woman.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import br.com.jrgirotto.soccer_news_woman.domain.News;

@Database(entities = {News.class}, version = 1)
public abstract class SoccerNewsDb extends RoomDatabase {
    public abstract NewsDao newsDao();
}
