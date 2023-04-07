package com.emonics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emonics.beans.Book;

@RestController
public class ProducerBookController {
	public static final String TOPIC = "MyTopic";
	
	@Autowired
	private KafkaTemplate<String, Book> KafkaTemplate;
	
	@PostMapping("/book")
	public String publishBookMessage(@RequestBody Book book) {
		KafkaTemplate.send(TOPIC, book);
		return "Published successfully";
	}
}
