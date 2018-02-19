package com.earthchen.spring.boot.blog.service.impl;

import com.earthchen.spring.boot.blog.dao.CatalogDao;
import com.earthchen.spring.boot.blog.domain.Catalog;
import com.earthchen.spring.boot.blog.domain.User;
import com.earthchen.spring.boot.blog.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: EarthChen
 * @date: 2018/02/19
 */
@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private CatalogDao catalogRepository;

    @Override
    public Catalog saveCatalog(Catalog catalog) {
        // 判断重复
        List<Catalog> list = catalogRepository.findByUserAndName(catalog.getUser(), catalog.getName());
        if (list != null && list.size() > 0) {
            throw new IllegalArgumentException("该分类已经存在了");
        }
        return catalogRepository.save(catalog);
    }

    @Override
    public void removeCatalog(Long id) {
        catalogRepository.delete(id);
    }

    @Override
    public Catalog getCatalogById(Long id) {
        return catalogRepository.findOne(id);
    }

    @Override
    public List<Catalog> listCatalogs(User user) {
        return catalogRepository.findByUser(user);
    }

}