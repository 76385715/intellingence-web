package com.intellingence.dao;

import com.intellingence.pojo.ShoepadData;
import com.intellingence.pojo.ShoepadDataQuery;
import com.intellingence.pojo.ShoepadDataWithBLOBs;
import com.intellingence.pojo.ShoepadResult;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoepadDataDao {
    int countByExample(ShoepadDataQuery example);

    int deleteByExample(ShoepadDataQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShoepadDataWithBLOBs record);

    int insertSelective(ShoepadDataWithBLOBs record);

    List<ShoepadDataWithBLOBs> selectByExampleWithBLOBs(ShoepadDataQuery example);

    List<ShoepadData> selectByExample(ShoepadDataQuery example);

    ShoepadDataWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShoepadDataWithBLOBs record, @Param("example") ShoepadDataQuery example);

    int updateByExampleWithBLOBs(@Param("record") ShoepadDataWithBLOBs record, @Param("example") ShoepadDataQuery example);

    int updateByExample(@Param("record") ShoepadData record, @Param("example") ShoepadDataQuery example);

    int updateByPrimaryKeySelective(ShoepadDataWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ShoepadDataWithBLOBs record);

    int updateByPrimaryKey(ShoepadData record);
    
    List<ShoepadDataWithBLOBs> selectShoepadList(ShoepadDataWithBLOBs record);
    
    int updateShoepadState(ShoepadData record);
}