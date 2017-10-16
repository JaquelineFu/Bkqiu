package com.akqid.zblog.service;

import com.akqid.zblog.vo.ArticleCustom;
import com.akqid.zblog.vo.BComment;
import com.akqid.zblog.vo.Pager;
import com.akqid.zblog.vo.Tag;

import java.util.List;

/**
 * @author Do
 * @package com.akqid.zblog.service
 * @name TagService
 * @date 2017/4/13
 * @time 18:55
 */
public interface CommentService {

    BComment selectCommentById(String commentId);
}
