package com.earthchen.spring.boot.blog.service;

import com.earthchen.spring.boot.blog.domain.Vote;

/**
 * @author: EarthChen
 * @date: 2018/02/19
 */
public interface VoteService {
    /**
     * 根据id获取 Vote
     *
     * @param id
     * @return
     */
    Vote getVoteById(Long id);

    /**
     * 删除Vote
     *
     * @param id
     * @return
     */
    void removeVote(Long id);
}