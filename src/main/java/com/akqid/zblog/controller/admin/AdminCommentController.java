package com.akqid.zblog.controller.admin;

import com.akqid.zblog.service.CommentService;
import com.akqid.zblog.vo.BComment;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * AUTHOR: zxy
 * com.akqid.zblog.controller.admin
 * DATE: 2017/10/13
 * TIME: 14:40
 **/
@Controller
@RequestMapping(value = "/admin/comment")
public class AdminCommentController {
    @Resource
    private CommentService commentService;
    @RequestMapping(value = "getById/{id}",method = RequestMethod.GET)
    @ResponseBody
    public BComment selectCommentById(@PathVariable String id){
        if (!StringUtils.isEmpty(id)){
            BComment bComment = commentService.selectCommentById(id);
            return bComment;
        }else {
            return null;
        }
    }
}
