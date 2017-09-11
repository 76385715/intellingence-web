package com.intellingence.dao;

import com.intellingence.pojo.QuarterHealthdata;
import com.intellingence.pojo.QuarterHealthdataQuery;
import com.intellingence.pojo.QuarterHealthdataWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuarterHealthdataDao {
    int countByExample(QuarterHealthdataQuery example);

    int deleteByExample(QuarterHealthdataQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuarterHealthdataWithBLOBs record);

    int insertSelective(QuarterHealthdataWithBLOBs record);

    List<QuarterHealthdataWithBLOBs> selectByExampleWithBLOBs(QuarterHealthdataQuery example);

    List<QuarterHealthdata> selectByExample(QuarterHealthdataQuery example);

    QuarterHealthdataWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuarterHealthdataWithBLOBs record, @Param("example") QuarterHealthdataQuery example);

    int updateByExampleWithBLOBs(@Param("record") QuarterHealthdataWithBLOBs record, @Param("example") QuarterHealthdataQuery example);

    int updateByExample(@Param("record") QuarterHealthdata record, @Param("example") QuarterHealthdataQuery example);

    int updateByPrimaryKeySelective(QuarterHealthdataWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QuarterHealthdataWithBLOBs record);

    int updateByPrimaryKey(QuarterHealthdata record);
}