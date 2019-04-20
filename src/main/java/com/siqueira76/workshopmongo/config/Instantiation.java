package com.siqueira76.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.siqueira76.workshopmongo.domain.Post;
import com.siqueira76.workshopmongo.domain.User;
import com.siqueira76.workshopmongo.repository.PostRepository;
import com.siqueira76.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner  {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria Marron", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		Post post1 = new Post(null, sdf.parse("20/04/2019"), "Partil viagem", "Vou Viajar para São Paulo", maria);
		Post post2 = new Post(null, sdf.parse("19/04/2019"), "Viagem Boa", "Vou Viajar para Bahia", maria);
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		postRepository.saveAll(Arrays.asList(post1, post2));
		
	}

}
