package com.intellingence.dao;

import com.intellingence.pojo.ShoepadBangding;
import com.intellingence.pojo.ShoepadBangdingQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoepadBangdingDao {
    int countByExample(ShoepadBangdingQuery example);

    int deleteByExample(ShoepadBangdingQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShoepadBangding record);

    int insertSelective(ShoepadBangding record);

    List<ShoepadBangding> selectByExample(ShoepadBangdingQuery example);

    ShoepadBangding selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShoepadBangding record, @Param("example") ShoepadBangdingQuery example);

    int updateByExample(@Param("record") ShoepadBangding record, @Param("example") ShoepadBangdingQuery example);

    int updateByPrimaryKeySelective(ShoepadBangding record);

    int updateByPrimaryKey(ShoepadBangding record);
    
    List<ShoepadBangding> selectBangding(ShoepadBangding record);
    
    int updateBangding(ShoepadBangding record);
}