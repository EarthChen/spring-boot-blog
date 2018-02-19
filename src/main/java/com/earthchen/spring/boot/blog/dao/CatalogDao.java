package com.earthchen.spring.boot.blog.dao;

import com.earthchen.spring.boot.blog.domain.Catalog;
import com.earthchen.spring.boot.blog.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: EarthChen
 * @date: 2018/02/19
 */
public interface CatalogDao extends JpaRepository<Catalog, Long> {

    /**
     * 根据用户查询
     *
     * @param user
     * @return
     */
    List<Catalog> findByUser(User user);

    /**
     * 根据用户查询
     *
     * @param user
     * @param name
     * @return
     */
    List<Catalog> findByUserAndName(User user, String name);
}