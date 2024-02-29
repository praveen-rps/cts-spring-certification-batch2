package com.example.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="notes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Notes {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	int pid;
	//@Column(name="author")
	String author;
	String title;
	String description;
	

}
