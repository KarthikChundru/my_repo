package com.blog.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.blog.dto.Blogdto;
import com.blog.service.BlogService;

@RestController
@RequestMapping("/blogapp")
public class BlogController {

	@Autowired
	BlogService blogService;
	

	@PostMapping(value = "/blog", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Blogdto createNewBlog(@RequestBody Blogdto blog) {
		return blogService.createNewBlog(blog);
	}

	@GetMapping(value = "/blog/{id}", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Blogdto getBlogById(@PathVariable("id") int blogId) {
		return blogService.getBlogById(blogId);
	}

	@DeleteMapping(value = "/blog/{id}", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public boolean deleteBlogById(@PathVariable("id") int blogId) {
		return blogService.deleteBlogById(blogId);
	}

	@PutMapping(value = "/blog/{id}", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Blogdto updateStock(@PathVariable("id") int blogId, @RequestBody Blogdto updatedStock) {
		return blogService.updateBlog(blogId, updatedStock);
	}

}

