package com.woniuxy.dao;

import com.woniuxy.domain.FilmType;
import com.woniuxy.domain.FilmTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FilmTypeMapper {
    long countByExample(FilmTypeExample example);

    int deleteByExample(FilmTypeExample example);

    int deleteByPrimaryKey(String ftid);

    int insert(FilmType record);

    int insertSelective(FilmType record);

    List<FilmType> selectByExample(FilmTypeExample example);

    FilmType selectByPrimaryKey(String ftid);

    int updateByExampleSelective(@Param("record") FilmType record, @Param("example") FilmTypeExample example);

    int updateByExample(@Param("record") FilmType record, @Param("example") FilmTypeExample example);

    int updateByPrimaryKeySelective(FilmType record);

    int updateByPrimaryKey(FilmType record);
}