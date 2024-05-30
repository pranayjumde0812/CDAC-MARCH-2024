package com.blogs.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//title , desc , contents , category id ,  author id
@Getter
@Setter
@ToString
public class BlogPostDTO extends BaseDTO {
	private String title;
	@JsonProperty(value = "desc") //Jackson annotation to customize json property name
	private String description;
	private String content;
	@JsonProperty(access = Access.WRITE_ONLY) //de ser only
	private Long bloggerId;
	@JsonProperty(access = Access.WRITE_ONLY) //de ser only
	private Long categoryId;
}
