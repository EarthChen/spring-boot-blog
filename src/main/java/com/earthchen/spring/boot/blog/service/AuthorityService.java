package com.earthchen.spring.boot.blog.service;

import com.earthchen.spring.boot.blog.domain.Authority;

/**
 * 权限服务
 */
public interface AuthorityService {


    /**
     * 根据id获取 Authority
     * @param id
     * @return
     */
    Authority getAuthorityById(Long id);
}