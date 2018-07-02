package com.portea.jphleboassignment.domain.vo;

import java.util.List;

/**
 * Created by user on 14/6/18.
 */
public class PhleboAssignmentVo {

    private Integer healthProfessionalId;

    private Integer clusterId;

    private List<AppointmentDetailVo> appointmentDetailList;

    public Integer getHealthProfessionalId() {
        return healthProfessionalId;
    }

    public void setHealthProfessionalId(Integer healthProfessionalId) {
        this.healthProfessionalId = healthProfessionalId;
    }

    public Integer getClusterId() {
        return clusterId;
    }

    public void setClusterId(Integer clusterId) {
        this.clusterId = clusterId;
    }

    public List<AppointmentDetailVo> getAppointmentDetailList() {
        return appointmentDetailList;
    }

    public void setAppointmentDetailList(List<AppointmentDetailVo> appointmentDetailList) {
        this.appointmentDetailList = appointmentDetailList;
    }

    public PhleboAssignmentVo(Integer healthProfessionalId, Integer clusterId, List<AppointmentDetailVo> appointmentDetailList) {
        this.healthProfessionalId = healthProfessionalId;
        this.clusterId = clusterId;
        this.appointmentDetailList = appointmentDetailList;
    }

    public PhleboAssignmentVo() {
    }

    @Override
    public String toString() {
        return "PhleboAssignment{" +
                "healthProfessionalId=" + healthProfessionalId +
                ", clusterId=" + clusterId +
                ", appointmentDetailList=" + appointmentDetailList +
                '}';
    }

}
