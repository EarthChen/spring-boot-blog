package com.earthchen.spring.boot.blog.service.impl;

import com.earthchen.spring.boot.blog.dao.BlogDao;
import com.earthchen.spring.boot.blog.domain.Blog;
import com.earthchen.spring.boot.blog.domain.Comment;
import com.earthchen.spring.boot.blog.domain.User;
import com.earthchen.spring.boot.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author: EarthChen
 * @date: 2018/02/18
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogDao blogRepository;

    /* (non-Javadoc)
     * @see com.waylau.spring.boot.blog.service.BlogService#saveBlog(com.waylau.spring.boot.blog.domain.Blog)
     */
    @Transactional
    @Override
    public Blog saveBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    /* (non-Javadoc)
     * @see com.waylau.spring.boot.blog.service.BlogService#removeBlog(java.lang.Long)
     */
    @Transactional
    @Override
    public void removeBlog(Long id) {
        blogRepository.delete(id);
    }

    /* (non-Javadoc)
     * @see com.waylau.spring.boot.blog.service.BlogService#updateBlog(com.waylau.spring.boot.blog.domain.Blog)
     */
    @Transactional
    @Override
    public Blog updateBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    /* (non-Javadoc)
     * @see com.waylau.spring.boot.blog.service.BlogService#getBlogById(java.lang.Long)
     */
    @Override
    public Blog getBlogById(Long id) {
        return blogRepository.findOne(id);
    }

    @Override
    public Page<Blog> listBlogsByTitleLike(User user, String title, Pageable pageable) {
        // 模糊查询
        title = "%" + title + "%";
        Page<Blog> blogs = blogRepository.findByUserAndTitleLikeOrderByCreateTimeDesc(user, title, pageable);
        return blogs;
    }

    @Override
    public Page<Blog> listBlogsByTitleLikeAndSort(User user, String title, Pageable pageable) {
        // 模糊查询
        title = "%" + title + "%";
        Page<Blog> blogs = blogRepository.findByUserAndTitleLike(user, title, pageable);
        return blogs;
    }

    @Override
    public void readingIncrease(Long id) {
        Blog blog = blogRepository.findOne(id);
        blog.setReadSize(blog.getCommentSize() + 1);
        blogRepository.save(blog);
    }

    @Override
    public Blog createComment(Long blogId, String commentContent) {
        Blog originalBlog = blogRepository.findOne(blogId);
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Comment comment = new Comment(user, commentContent);
        originalBlog.addComment(comment);
        return blogRepository.save(originalBlog);
    }

    @Override
    public void removeComment(Long blogId, Long commentId) {
        Blog originalBlog = blogRepository.findOne(blogId);
        originalBlog.removeComment(commentId);
        blogRepository.save(originalBlog);
    }
}

