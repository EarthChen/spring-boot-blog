package com.earthchen.spring.boot.blog.dao;

import com.earthchen.spring.boot.blog.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 权限dao
 */
@Repository
public interface AuthorityDao extends JpaRepository<Authority, Long> {
}