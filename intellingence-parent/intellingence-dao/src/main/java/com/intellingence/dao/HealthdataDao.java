package com.intellingence.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.intellingence.entry.ZaoboLouboTimes;
import com.intellingence.pojo.HealthDataQueryVo;
import com.intellingence.pojo.Healthdata;
import com.intellingence.pojo.HealthdataQuery;
import com.intellingence.pojo.HealthdataQueryAndUserId;
import com.intellingence.pojo.HealthdataWithBLOBs;

public interface HealthdataDao {
    int countByExample(HealthdataQuery example);

    int deleteByExample(HealthdataQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(HealthdataWithBLOBs record);

    int insertSelective(HealthdataWithBLOBs record);

    List<HealthdataWithBLOBs> selectByExampleWithBLOBs(HealthdataQuery example);

    List<Healthdata> selectByExample(HealthdataQuery example);

    HealthdataWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HealthdataWithBLOBs record, @Param("example") HealthdataQuery example);

    int updateByExampleWithBLOBs(@Param("record") HealthdataWithBLOBs record, @Param("example") HealthdataQuery example);

    int updateByExample(@Param("record") Healthdata record, @Param("example") HealthdataQuery example);

    int updateByPrimaryKeySelective(HealthdataWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HealthdataWithBLOBs record);

    int updateByPrimaryKey(Healthdata record);
    

    //这是按年月查询
    public List<HealthdataWithBLOBs> selectHRrepHealthDataByParameter(HealthDataQueryVo queryVo);
    //心电数据总数
    public int selectCountHealthDataByParameter(HealthDataQueryVo queryVo);
    //正常心电数据
    public int selectCountNormalHealthDataByParameter(HealthDataQueryVo queryVo);
    //异常心电数据
    public int selectCountAbnormalHealthDataByParameter(HealthDataQueryVo queryVo);
    //漏搏心电数据
    public int selectCountLouboHealthDataByParameter(HealthDataQueryVo queryVo);
    //早搏心电数据
    public int selectCountZaoboHealthDataByParameter(HealthDataQueryVo queryVo);
    
    public List<HealthdataWithBLOBs> selectHRRrepHealthDataByParameter(HealthDataQueryVo queryVo);
    
    public List<HealthdataWithBLOBs> selectHRVrepHealthDataByParameter(HealthDataQueryVo queryVo);
    
    //这是按年季度查询
    public List<HealthdataWithBLOBs> selectHRrepHealthDataByParameterQuarter(HealthDataQueryVo queryVo);
    //心电数据总数
    public int selectCountHealthDataByParameterQuarter(HealthDataQueryVo queryVo);
    //正常心电数据
    public int selectCountNormalHealthDataByParameterQuarter(HealthDataQueryVo queryVo);
    //异常心电数据
    public int selectCountAbnormalHealthDataByParameterQuarter(HealthDataQueryVo queryVo);
    //漏搏心电数据
    public int selectCountLouboHealthDataByParameterQuarter(HealthDataQueryVo queryVo);
    //早搏心电数据
    public int selectCountZaoboHealthDataByParameterQuarter(HealthDataQueryVo queryVo);
    
    public List<HealthdataWithBLOBs> selectHRRrepHealthDataByParameterQuarter(HealthDataQueryVo queryVo);
    
    public List<HealthdataWithBLOBs> selectHRVrepHealthDataByParameterQuarter(HealthDataQueryVo queryVo);
    
    //这是按年度查询
    public List<HealthdataWithBLOBs> selectHRrepHealthDataByParameterYear(HealthDataQueryVo queryVo);
    //心电数据总数
    public int selectCountHealthDataByParameterYear(HealthDataQueryVo queryVo);
    //正常心电数据
    public int selectCountNormalHealthDataByParameterYear(HealthDataQueryVo queryVo);
    //异常心电数据
    public int selectCountAbnormalHealthDataByParameterYear(HealthDataQueryVo queryVo);
    //漏搏心电数据
    public int selectCountLouboHealthDataByParameterYear(HealthDataQueryVo queryVo);
    //早搏心电数据
    public int selectCountZaoboHealthDataByParameterYear(HealthDataQueryVo queryVo);
    
    public List<HealthdataWithBLOBs> selectHRRrepHealthDataByParameterYear(HealthDataQueryVo queryVo);
    
    public List<HealthdataWithBLOBs> selectHRVrepHealthDataByParameterYear(HealthDataQueryVo queryVo);
    
    public int selectTotalCountByUserId(Integer id);
    
    public List<HealthdataWithBLOBs> selectHealthDataByPage(HealthdataQueryAndUserId page);
    
    public int updateAlivenessById(Integer id);
    //一周内运动时间之和
    public int selectSportTimesByWeek(HealthDataQueryVo queryVo);
    //一周内早搏次数,漏搏次数之和
    public List<ZaoboLouboTimes> selectZaoBoLouBoTimesByWeek(HealthDataQueryVo queryVo);
    //一周内所有的平均心率数组
    public List<Integer> selectAHRByWeek(HealthDataQueryVo queryVo);
    //一周内所有的疲劳指数数组
    public List<Integer> selectFIByWeek(HealthDataQueryVo queryVo);
    //一周内所有的恢复心率数组
    public List<Integer> selectRAByWeek(HealthDataQueryVo queryVo);
    //一周内符合条件的健康数据集合
    public List<HealthdataWithBLOBs> selectHealthDatasByWeek(HealthDataQueryVo queryVo);
    
    //给美国的数据
    public List<HealthdataWithBLOBs> selectDatasToAmerica();
    
    //根据userid和timestamp来判断是否重复上传
    public HealthdataWithBLOBs selectHealthdataWithBLOBsByUserIDANDTimestamp(HealthdataWithBLOBs blobs);
    
    public List<HealthdataWithBLOBs> selectHealthdataByIdAndUserid(HealthdataWithBLOBs b);
    
}