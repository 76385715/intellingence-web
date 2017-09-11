package com.intellingence.dao;

import com.intellingence.pojo.ShoepadResult;
import com.intellingence.pojo.ShoepadResultQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoepadResultDao {
    int countByExample(ShoepadResultQuery example);

    int deleteByExample(ShoepadResultQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShoepadResult record);

    int insertSelective(ShoepadResult record);

    List<ShoepadResult> selectByExampleWithBLOBs(ShoepadResultQuery example);

    List<ShoepadResult> selectByExample(ShoepadResultQuery example);

    ShoepadResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShoepadResult record, @Param("example") ShoepadResultQuery example);

    int updateByExampleWithBLOBs(@Param("record") ShoepadResult record, @Param("example") ShoepadResultQuery example);

    int updateByExample(@Param("record") ShoepadResult record, @Param("example") ShoepadResultQuery example);

    int updateByPrimaryKeySelective(ShoepadResult record);

    int updateByPrimaryKeyWithBLOBs(ShoepadResult record);

    int updateByPrimaryKey(ShoepadResult record);
    
    
}