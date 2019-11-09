package com.woniuxy.dao;

import com.woniuxy.domain.Tcombo;
import com.woniuxy.domain.TcomboExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcomboMapper {
    long countByExample(TcomboExample example);

    int deleteByExample(TcomboExample example);

    int deleteByPrimaryKey(String tcid);

    int insert(Tcombo record);

    int insertSelective(Tcombo record);

    List<Tcombo> selectByExample(TcomboExample example);

    Tcombo selectByPrimaryKey(String tcid);

    int updateByExampleSelective(@Param("record") Tcombo record, @Param("example") TcomboExample example);

    int updateByExample(@Param("record") Tcombo record, @Param("example") TcomboExample example);

    int updateByPrimaryKeySelective(Tcombo record);

    int updateByPrimaryKey(Tcombo record);
    
    
    
    
    
    List<Tcombo> findTheaterComboOrdersByUserName(String uname);
}