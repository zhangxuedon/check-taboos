package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.model.DietRestriction;
import com.tencent.wxcloudrun.service.DietRestrictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Author Zxd
 * @Date 2025/3/13
 */
@RestController
public class DietRestrictionController {

    @Autowired
    private DietRestrictionService dietRestrictionService;

    /**
     * 根据疾病名称查询忌口信息
     * @param diseaseName 疾病名称
     * @return 忌口信息列表
     */
    @GetMapping("/diet-restrictions/disease")
    public List<DietRestriction> findByDiseaseName(@RequestParam String diseaseName) {
        return dietRestrictionService.findByDiseaseName(diseaseName);
    }
}
