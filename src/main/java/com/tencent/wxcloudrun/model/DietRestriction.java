package com.tencent.wxcloudrun.model;

/**
 * @Description
 * @Author Zxd
 * @Date 2025/3/13
 */
public class DietRestriction {
    private Integer id;
    private String diseaseName;
    private String restrictedFoodName;
    private String restrictionReason;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getRestrictedFoodName() {
        return restrictedFoodName;
    }

    public void setRestrictedFoodName(String restrictedFoodName) {
        this.restrictedFoodName = restrictedFoodName;
    }

    public String getRestrictionReason() {
        return restrictionReason;
    }

    public void setRestrictionReason(String restrictionReason) {
        this.restrictionReason = restrictionReason;
    }
}
