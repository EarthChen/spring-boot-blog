package com.earthchen.spring.boot.blog.dao;

import com.earthchen.spring.boot.blog.domain.Blog;
import com.earthchen.spring.boot.blog.domain.Catalog;
import com.earthchen.spring.boot.blog.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: EarthChen
 * @date: 2018/02/18
 */
public interface BlogDao extends JpaRepository<Blog, Long> {

    /**
     * 根据用户名分页查询用户列表
     *
     * @param user
     * @param title
     * @param pageable
     * @return
     */
    Page<Blog> findByUserAndTitleLikeOrderByCreateTimeDesc(User user, String title, Pageable pageable);

    /**
     * 根据用户名分页查询用户列表
     *
     * @param user
     * @param title
     * @param pageable
     * @return
     */
    Page<Blog> findByUserAndTitleLike(User user, String title, Pageable pageable);


    /**
     * @param title
     * @param user
     * @param tags
     * @param user2
     * @param pageable
     * @return
     */
//    Page<Blog> findByTitleLikeAndUserOrTagsLikeAndUserOrderByCreateTimeDesc(String title, User user, String tags, User user2, Pageable pageable);

    /**
     * 根据分类分页查询博客列表
     *
     * @param catalog
     * @param pageable
     * @return
     */
    Page<Blog> findByCatalog(Catalog catalog, Pageable pageable);
}
