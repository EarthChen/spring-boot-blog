package com.earthchen.spring.boot.blog.service.impl;

import com.earthchen.spring.boot.blog.dao.AuthorityDao;
import com.earthchen.spring.boot.blog.domain.Authority;
import com.earthchen.spring.boot.blog.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityServiceImpl  implements AuthorityService {

    @Autowired
    private AuthorityDao authorityRepository;

    @Override
    public Authority getAuthorityById(Long id) {
        return authorityRepository.findOne(id);
    }

}