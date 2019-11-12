package com.woniuxy.dao;

import com.woniuxy.domain.Film;
import com.woniuxy.domain.FilmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FilmMapper {
    long countByExample(FilmExample example);

    int deleteByExample(FilmExample example);

    int deleteByPrimaryKey(String fid);

    int insert(Film record);

    int insertSelective(Film record);

    List<Film> selectByExampleWithBLOBs(FilmExample example);

    List<Film> selectByExample(FilmExample example);

    Film selectByPrimaryKey(String fid);

    int updateByExampleSelective(@Param("record") Film record, @Param("example") FilmExample example);

    int updateByExampleWithBLOBs(@Param("record") Film record, @Param("example") FilmExample example);

    int updateByExample(@Param("record") Film record, @Param("example") FilmExample example);

    int updateByPrimaryKeySelective(Film record);

    int updateByPrimaryKeyWithBLOBs(Film record);

    int updateByPrimaryKey(Film record);
}