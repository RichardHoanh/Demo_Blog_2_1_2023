package com.example.blog.service;

import com.example.blog.model.Blog;
import com.example.blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService {
    @Autowired
    IBlogRepository iBlogRepository;

    public List<Blog> getAll() {
        return (List<Blog>) iBlogRepository.findAll();
    }

    public Blog findBlogById(int id) {
        return iBlogRepository.findById(id).get();
    }

    public void create(Blog blog) {
        iBlogRepository.save(blog);
    }

    public void deleteById (int id){
        iBlogRepository.deleteById(id);
    }

}
