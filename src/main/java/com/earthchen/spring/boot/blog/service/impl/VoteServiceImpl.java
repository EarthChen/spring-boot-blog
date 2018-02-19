package com.earthchen.spring.boot.blog.service.impl;

import com.earthchen.spring.boot.blog.dao.VoteDao;
import com.earthchen.spring.boot.blog.domain.Vote;
import com.earthchen.spring.boot.blog.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author: EarthChen
 * @date: 2018/02/19
 */
@Service
public class VoteServiceImpl implements VoteService {

    @Autowired
    private VoteDao voteRepository;

    @Override
    @Transactional
    public void removeVote(Long id) {
        voteRepository.delete(id);
    }

    @Override
    public Vote getVoteById(Long id) {
        return voteRepository.findOne(id);
    }

}