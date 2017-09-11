package com.intellingence.dao;

import com.intellingence.pojo.DeviceConfig;
import com.intellingence.pojo.DeviceConfigQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceConfigDao {
    int countByExample(DeviceConfigQuery example);

    int deleteByExample(DeviceConfigQuery example);

    int insert(DeviceConfig record);

    int insertSelective(DeviceConfig record);

    List<DeviceConfig> selectByExample(DeviceConfigQuery example);

    int updateByExampleSelective(@Param("record") DeviceConfig record, @Param("example") DeviceConfigQuery example);

    int updateByExample(@Param("record") DeviceConfig record, @Param("example") DeviceConfigQuery example);
}