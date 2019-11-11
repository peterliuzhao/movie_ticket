package com.woniuxy.dao;

import com.woniuxy.domain.Review;
import com.woniuxy.domain.ReviewExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ReviewMapper {
    long countByExample(ReviewExample example);

    int deleteByExample(ReviewExample example);

    int deleteByPrimaryKey(String rwid);

    int insert(Review record);

    int insertSelective(Review record);

    List<Review> selectByExampleWithBLOBs(ReviewExample example);

    List<Review> selectByExample(ReviewExample example);

    Review selectByPrimaryKey(String rwid);

    int updateByExampleSelective(@Param("record") Review record, @Param("example") ReviewExample example);

    int updateByExampleWithBLOBs(@Param("record") Review record, @Param("example") ReviewExample example);

    int updateByExample(@Param("record") Review record, @Param("example") ReviewExample example);

    int updateByPrimaryKeySelective(Review record);

    int updateByPrimaryKeyWithBLOBs(Review record);

    int updateByPrimaryKey(Review record);
    
    
    
    
    List<Map<String,Object>> findAll();
}