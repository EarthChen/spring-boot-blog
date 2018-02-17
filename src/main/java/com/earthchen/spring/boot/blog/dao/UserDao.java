package com.earthchen.spring.boot.blog.dao;

import com.earthchen.spring.boot.blog.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 用户dao
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {

    /**
     * 根据用户名分页查询用户列表
     *
     * @param name
     * @param pageable
     * @return
     */
    Page<User> findByNameLike(String name, Pageable pageable);

    User findByUsername(String username);
}
