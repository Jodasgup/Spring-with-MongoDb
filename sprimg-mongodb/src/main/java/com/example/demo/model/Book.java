package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;



@Getter
@Setter
@ToString

@Document(collection = "Book")
public class Book {
	
	@Id
	private Integer id;
	private String bookName;
	private String authorName;
	

	

}