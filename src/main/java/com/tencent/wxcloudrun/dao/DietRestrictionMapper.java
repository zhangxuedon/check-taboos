package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.DietRestriction;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description
 * @Author Zxd
 * @Date 2025/3/13
 */
@Mapper
public interface DietRestrictionMapper {

    /**
     * 根据疾病名称查询忌口信息
     * @param diseaseName 疾病名称
     * @return 忌口信息列表
     */
    @Select("SELECT * FROM diet_restrictions_single WHERE disease_name = #{diseaseName}")
    List<DietRestriction> findByDiseaseName(String diseaseName);
}
