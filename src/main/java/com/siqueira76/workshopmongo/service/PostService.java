package com.siqueira76.workshopmongo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siqueira76.workshopmongo.domain.Post;
import com.siqueira76.workshopmongo.repository.PostRepository;
import com.siqueira76.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> post = repo.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitle(String text){
		return repo.searchTitle(text);	
	}
	
	public List<Post> fullSearch(String text, Date minDate, Date maxDate){
		//ACRECENTANDO 1 DIA NA MAXDATE
		maxDate = new Date(maxDate.getTime() +24 * 60 * 60 * 1000);
		return repo.fullSearch(text, minDate, maxDate);
	}
}
