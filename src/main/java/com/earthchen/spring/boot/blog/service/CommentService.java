package com.earthchen.spring.boot.blog.service;

import com.earthchen.spring.boot.blog.domain.Comment;

/**
 * @author: EarthChen
 * @date: 2018/02/18
 */
public interface CommentService {
    /**
     * 根据id获取 Comment
     * @param id
     * @return
     */
    Comment getCommentById(Long id);
    /**
     * 删除评论
     * @param id
     * @return
     */
    void removeComment(Long id);
}