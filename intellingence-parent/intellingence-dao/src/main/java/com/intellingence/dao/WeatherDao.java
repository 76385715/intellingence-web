package com.intellingence.dao;

import com.intellingence.pojo.Weather;
import com.intellingence.pojo.WeatherQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeatherDao {
    int countByExample(WeatherQuery example);

    int deleteByExample(WeatherQuery example);

    int deleteByPrimaryKey(Integer updatetimestamp);

    int insert(Weather record);

    int insertSelective(Weather record);

    List<Weather> selectByExample(WeatherQuery example);

    Weather selectByPrimaryKey(Integer updatetimestamp);

    int updateByExampleSelective(@Param("record") Weather record, @Param("example") WeatherQuery example);

    int updateByExample(@Param("record") Weather record, @Param("example") WeatherQuery example);

    int updateByPrimaryKeySelective(Weather record);

    int updateByPrimaryKey(Weather record);
}