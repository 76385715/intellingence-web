package com.intellingence.dao;

import com.intellingence.pojo.Version;
import com.intellingence.pojo.VersionQuery;
import com.intellingence.pojo.VersionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VersionDao {
    int countByExample(VersionQuery example);

    int deleteByExample(VersionQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(VersionWithBLOBs record);

    int insertSelective(VersionWithBLOBs record);

    List<VersionWithBLOBs> selectByExampleWithBLOBs(VersionQuery example);

    List<Version> selectByExample(VersionQuery example);

    VersionWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VersionWithBLOBs record, @Param("example") VersionQuery example);

    int updateByExampleWithBLOBs(@Param("record") VersionWithBLOBs record, @Param("example") VersionQuery example);

    int updateByExample(@Param("record") Version record, @Param("example") VersionQuery example);

    int updateByPrimaryKeySelective(VersionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(VersionWithBLOBs record);

    int updateByPrimaryKey(Version record);
    
    public VersionWithBLOBs selectLastVersion();
}