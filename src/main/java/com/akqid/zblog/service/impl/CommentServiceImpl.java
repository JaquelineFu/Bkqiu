package com.akqid.zblog.service.impl;

import com.akqid.zblog.mapper.BCommentMapper;
import com.akqid.zblog.service.CommentService;
import com.akqid.zblog.vo.BComment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * AUTHOR: zxy
 * com.akqid.zblog.service.impl
 * DATE: 2017/10/13
 * TIME: 14:53
 **/
@Service
public class CommentServiceImpl implements CommentService{
    @Resource
    private BCommentMapper bCommentMapper;

    @Override
    public BComment selectCommentById(String commentId) {
        return bCommentMapper.selectByPrimaryKey(commentId);
    }
}
