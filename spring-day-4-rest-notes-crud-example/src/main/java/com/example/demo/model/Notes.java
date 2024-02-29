package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
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
	@Min(value=7000, message="Pid value must be above 7000")
	int pid;
	//@Column(name="author")
	@NotNull(message="Author name cannot be blank")
	String author;
	@NotNull
	String title;
	String description;
	
}
