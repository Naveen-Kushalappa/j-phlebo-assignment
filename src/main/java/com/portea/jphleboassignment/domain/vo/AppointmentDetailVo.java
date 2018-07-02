package com.portea.jphleboassignment.domain.vo;

/**
 * Created by user on 14/6/18.
 */
public class AppointmentDetailVo {

    private Integer patientId;

    private Integer appointmentId;

    private String latitude;
    private String longitude;


    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
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

    public AppointmentDetailVo(Integer patientId, Integer appointmentId, String latitude, String longitude) {
        this.patientId = patientId;
        this.appointmentId = appointmentId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public AppointmentDetailVo() {
    }

    @Override
    public String toString() {
        return "AppointmentDetail{" +
                "patientId=" + patientId +
                ", appointmentId=" + appointmentId +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }
}
