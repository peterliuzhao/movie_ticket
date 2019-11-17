package com.woniuxy.dao;

import com.woniuxy.domain.Theater;
import com.woniuxy.domain.TheaterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TheaterMapper {
    long countByExample(TheaterExample example);

    int deleteByExample(TheaterExample example);

    int deleteByPrimaryKey(String tid);

    int insert(Theater record);

    int insertSelective(Theater record);

    List<Theater> selectByExample(TheaterExample example);

    Theater selectByPrimaryKey(String tid);

    int updateByExampleSelective(@Param("record") Theater record, @Param("example") TheaterExample example);

    int updateByExample(@Param("record") Theater record, @Param("example") TheaterExample example);

    int updateByPrimaryKeySelective(Theater record);

    int updateByPrimaryKey(Theater record);
    
    Theater findOneByTname(String tname);
}