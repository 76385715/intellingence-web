package com.intellingence.dao;

import com.intellingence.pojo.YearHealthdata;
import com.intellingence.pojo.YearHealthdataQuery;
import com.intellingence.pojo.YearHealthdataWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YearHealthdataDao {
    int countByExample(YearHealthdataQuery example);

    int deleteByExample(YearHealthdataQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(YearHealthdataWithBLOBs record);

    int insertSelective(YearHealthdataWithBLOBs record);

    List<YearHealthdataWithBLOBs> selectByExampleWithBLOBs(YearHealthdataQuery example);

    List<YearHealthdata> selectByExample(YearHealthdataQuery example);

    YearHealthdataWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YearHealthdataWithBLOBs record, @Param("example") YearHealthdataQuery example);

    int updateByExampleWithBLOBs(@Param("record") YearHealthdataWithBLOBs record, @Param("example") YearHealthdataQuery example);

    int updateByExample(@Param("record") YearHealthdata record, @Param("example") YearHealthdataQuery example);

    int updateByPrimaryKeySelective(YearHealthdataWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(YearHealthdataWithBLOBs record);

    int updateByPrimaryKey(YearHealthdata record);
}