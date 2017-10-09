package com.snc.dao;

import com.snc.entity.PiwikLogAction;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PiwikLogActionDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table piwik_log_action
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer idaction);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table piwik_log_action
     *
     * @mbggenerated
     */
    int insert(PiwikLogAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table piwik_log_action
     *
     * @mbggenerated
     */
    int insertSelective(PiwikLogAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table piwik_log_action
     *
     * @mbggenerated
     */
    PiwikLogAction selectByPrimaryKey(Integer idaction);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table piwik_log_action
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PiwikLogAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table piwik_log_action
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(PiwikLogAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table piwik_log_action
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PiwikLogAction record);

    /**
     * 查询对应网站的模块信息
     * @param idsite 网站id
     * @return
     */
    List<Map<String, Object>> selectSiteModules(@Param("idsite") Integer idsite);

    /**
     * 查询name值
     * @param type 1为url，4为模块
     * @return
     */
    List<String> selectNamesByType(@Param("type") Integer type);

    /**
     * 查询idaction的最大值
     * @return
     */
    int selectIdactionMax();

    /**
     * 查询大于idaction值的模块名
     * @param idaction
     * @param idSite
     * @return
     */
    List<String> selectNamesByIdaction(@Param("idaction") Integer idaction, @Param("idSite") Integer idSite);
}