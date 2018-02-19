package com.earthchen.spring.boot.blog.dao;

import com.earthchen.spring.boot.blog.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: EarthChen
 * @date: 2018/02/19
 */
public interface VoteDao extends JpaRepository<Vote, Long> {

}