package dao;

import bean.MusicArtist;

public interface MusicArtistDao {

   MusicArtist queryArtistByName(String name);
}
