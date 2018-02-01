package com.codingdojo.dojooverflow.repositories;



import org.springframework.data.repository.CrudRepository;


import com.codingdojo.dojooverflow.models.Tag;

public interface TagRepo extends CrudRepository<Tag, Long> {
	Tag findTagBySubject(String search);
}