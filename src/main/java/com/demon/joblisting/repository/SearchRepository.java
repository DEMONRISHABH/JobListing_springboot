package com.demon.joblisting.repository;

import com.demon.joblisting.model.Post;

import java.util.List;

public interface SearchRepository
{
    List<Post> findByText(String text);
}
