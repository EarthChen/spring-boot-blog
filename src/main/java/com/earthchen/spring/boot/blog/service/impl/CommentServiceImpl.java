package com.earthchen.spring.boot.blog.service.impl;

import com.earthchen.spring.boot.blog.dao.CommentDao;
import com.earthchen.spring.boot.blog.domain.Comment;
import com.earthchen.spring.boot.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author: EarthChen
 * @date: 2018/02/18
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentRepository;


    @Override
    @Transactional
    public void removeComment(Long id) {
        commentRepository.delete(id);
    }

    @Override
    public Comment getCommentById(Long id) {
        return commentRepository.findOne(id);
    }

}