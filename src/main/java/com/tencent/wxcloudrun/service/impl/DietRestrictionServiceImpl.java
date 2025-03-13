package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.DietRestrictionMapper;
import com.tencent.wxcloudrun.model.DietRestriction;
import com.tencent.wxcloudrun.service.DietRestrictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author Zxd
 * @Date 2025/3/13
 */
@Service
public class DietRestrictionServiceImpl implements DietRestrictionService {

    @Autowired
    private DietRestrictionMapper dietRestrictionMapper;

    @Override
    public List<DietRestriction> findByDiseaseName(String diseaseName) {
        return dietRestrictionMapper.findByDiseaseName(diseaseName);
    }
}
