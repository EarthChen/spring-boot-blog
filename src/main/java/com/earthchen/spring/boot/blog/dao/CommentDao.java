package com.earthchen.spring.boot.blog.dao;

import com.earthchen.spring.boot.blog.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: EarthChen
 * @date: 2018/02/18
 */
public interface CommentDao extends JpaRepository<Comment, Long> {

}

