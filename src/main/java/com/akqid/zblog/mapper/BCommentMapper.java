package com.akqid.zblog.mapper;

import com.akqid.zblog.vo.BComment;
import com.akqid.zblog.vo.BCommentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_comment
     *
     * @mbg.generated
     */
    long countByExample(BCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_comment
     *
     * @mbg.generated
     */
    int deleteByExample(BCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_comment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_comment
     *
     * @mbg.generated
     */
    int insert(BComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_comment
     *
     * @mbg.generated
     */
    int insertSelective(BComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_comment
     *
     * @mbg.generated
     */
    List<BComment> selectByExample(BCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_comment
     *
     * @mbg.generated
     */
    BComment selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_comment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") BComment record, @Param("example") BCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_comment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") BComment record, @Param("example") BCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(BComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(BComment record);
}