package com.portea.jphleboassignment.domain.vo;

public class ClinicianDetailVo {

    private Integer healthProfessionalId;
    private String latitude;
    private String longitude;

    public Integer getHealthProfessionalId() {
        return healthProfessionalId;
    }

    public void setHealthProfessionalId(Integer healthProfessionalId) {
        this.healthProfessionalId = healthProfessionalId;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public ClinicianDetailVo() {
    }

    public ClinicianDetailVo(Integer healthProfessionalId, String latitude, String longitude) {
        this.healthProfessionalId = healthProfessionalId;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
