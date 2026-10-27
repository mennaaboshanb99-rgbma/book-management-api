package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class BookDto {
	

	    @NotBlank(message = "Book name is required")
	    private String name;

	    public BookDto() {
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	}

