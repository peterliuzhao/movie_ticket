package com.woniuxy.dao;

import com.woniuxy.domain.Customer;
import com.woniuxy.domain.ShowVenue;
import com.woniuxy.domain.ShowVenueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShowVenueMapper {
    long countByExample(ShowVenueExample example);

    int deleteByExample(ShowVenueExample example);

    int deleteByPrimaryKey(String svid);

    int insert(ShowVenue record);

    int insertSelective(ShowVenue record);

    List<ShowVenue> selectByExample(ShowVenueExample example);

    ShowVenue selectByPrimaryKey(String svid);

    int updateByExampleSelective(@Param("record") ShowVenue record, @Param("example") ShowVenueExample example);

    int updateByExample(@Param("record") ShowVenue record, @Param("example") ShowVenueExample example);

    int updateByPrimaryKeySelective(ShowVenue record);

    int updateByPrimaryKey(ShowVenue record);
    
    
    List<ShowVenue> findByTid(String tid);
}