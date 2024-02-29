package com.example.demo.controllers;




import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Notes {
	

	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	int pid;
	//@Column(name="author")
	String author;
	String title;
	String description;
	

}
