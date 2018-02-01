package com.codingdojo.secondweek.lookifyplaylist.repository;

import java.util.List;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.secondweek.lookifyplaylist.models.Playlist;

@Repository
public interface PlaylistRepository extends CrudRepository<Playlist, Long> {
	
	List<Playlist> findTop10ByOrderByRatingDesc();
	List<Playlist> findByArtistName(String search);
	List<Playlist> findByArtistTitle(String search);
	
	
}