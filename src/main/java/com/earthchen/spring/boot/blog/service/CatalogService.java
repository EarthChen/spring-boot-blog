package com.earthchen.spring.boot.blog.service;

import com.earthchen.spring.boot.blog.domain.Catalog;
import com.earthchen.spring.boot.blog.domain.User;

import java.util.List;

/**
 * @author: EarthChen
 * @date: 2018/02/19
 */
public interface CatalogService {

    /**
     * 保存Catalog
     *
     * @param catalog
     * @return
     */
    Catalog saveCatalog(Catalog catalog);

    /**
     * 删除Catalog
     *
     * @param id
     * @return
     */
    void removeCatalog(Long id);

    /**
     * 根据id获取Catalog
     *
     * @param id
     * @return
     */
    Catalog getCatalogById(Long id);

    /**
     * 获取Catalog列表
     *
     * @return
     */
    List<Catalog> listCatalogs(User user);
}