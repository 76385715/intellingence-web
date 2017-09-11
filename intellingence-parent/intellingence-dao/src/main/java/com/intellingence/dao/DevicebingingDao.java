package com.intellingence.dao;

import com.intellingence.pojo.Devicebinging;
import com.intellingence.pojo.DevicebingingQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DevicebingingDao {
    int countByExample(DevicebingingQuery example);

    int deleteByExample(DevicebingingQuery example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Devicebinging record);

    int insertSelective(Devicebinging record);

    List<Devicebinging> selectByExample(DevicebingingQuery example);

    Devicebinging selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") Devicebinging record, @Param("example") DevicebingingQuery example);

    int updateByExample(@Param("record") Devicebinging record, @Param("example") DevicebingingQuery example);

    int updateByPrimaryKeySelective(Devicebinging record);

    int updateByPrimaryKey(Devicebinging record);
}