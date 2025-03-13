package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.DietRestriction;

import java.util.List;

/**
 * @Description
 * @Author Zxd
 * @Date 2025/3/13
 */
public interface DietRestrictionService {
    List<DietRestriction> findByDiseaseName(String diseaseName);
}
