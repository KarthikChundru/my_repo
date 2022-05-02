package com.blog.service;


import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.dto.Blog;
import com.blog.entity.BlogDocument;
import com.blog.repository.BlogRepo;




@Service
public class BlogServiceImpl implements BlogService {
	
	@Autowired
	BlogRepo blogRepo;
	
	
	@Autowired
	ModelMapper modelMapper;

	@Override
	public BlogDocument createNewBlog(BlogDocument blog) {
		BlogDocument blogDocument = convertDTOIntoEntity(blog);
		blogDocument = blogRepo.save(blogDocument);
		return convertEntityIntoDTO(blogDocument);
	}

	
	@Override
	public boolean deleteBlogById(int blogId) {
		if (blogRepo.existsById(blogId)) {
			blogRepo.deleteById(blogId);
			return true;
		}
		return false;
	}
	
	@Override
	public BlogDocument updateBlog(int blogId, BlogDocument updatedBlog) {
		Optional<BlogDocument> opBlogDocument = blogRepo.findById(blogId);
		if (opBlogDocument.isPresent()) {
			BlogDocument blogDocument = opBlogDocument.get();
			blogDocument.setTitle(updatedBlog.getTitle());
			blogDocument.setContent(updatedBlog.getContent());
			blogRepo.save(blogDocument);
		}
		return null;
	}

	
	@Override
	public BlogDocument getBlogById(int blogId) {
		Optional<BlogDocument> opBlogEntity = blogRepo.findById(blogId);
		if (opBlogEntity.isPresent()) {
			BlogDocument blogDocument = opBlogEntity.get();
			return convertEntityIntoDTO(blogDocument);
		}
		return null;
	}
	
	
	
	private BlogDocument convertDTOIntoEntity(BlogDocument blog) {
		TypeMap<BlogDocument, BlogDocument> typeMap = modelMapper.typeMap(BlogDocument.class, BlogDocument.class);
		BlogDocument blogDocument = modelMapper.map(blog, BlogDocument.class);
		return blogDocument;
	}

	private BlogDocument convertEntityIntoDTO(BlogDocument stockEntity) {
		TypeMap<BlogDocument, BlogDocument> typeMap = modelMapper.typeMap(BlogDocument.class, BlogDocument.class);
		BlogDocument blog = modelMapper.map(stockEntity, BlogDocument.class);
		return blog;
	}

}
