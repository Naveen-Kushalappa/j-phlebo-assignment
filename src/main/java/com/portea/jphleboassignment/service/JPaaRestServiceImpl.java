package com.portea.jphleboassignment.service;


import com.portea.jphleboassignment.domain.vo.AppointmentDetailVo;
import com.portea.jphleboassignment.domain.vo.ClinicianDetailVo;
import com.portea.jphleboassignment.domain.vo.PhleboAssignmentVo;

import java.util.ArrayList;
import java.util.List;

public class JPaaRestServiceImpl implements JPaaRestService {

    @Override
    public List<PhleboAssignmentVo> assignPhlebo() {

        List<ClinicianDetailVo> clinicianDetailVos = new ArrayList<>();

        ClinicianDetailVo clinicianDetailVo1 = new ClinicianDetailVo(1, "12.955521","77.6980904");
        ClinicianDetailVo clinicianDetailVo2 = new ClinicianDetailVo(2, "12.9599448","77.50828330000002");
        ClinicianDetailVo clinicianDetailVo3 = new ClinicianDetailVo(3, "13.038268","77.66547600000001");
        ClinicianDetailVo clinicianDetailVo4 = new ClinicianDetailVo(4, "13.0250726","77.65966500000002");

        clinicianDetailVos.add(clinicianDetailVo1);
        clinicianDetailVos.add(clinicianDetailVo2);
        clinicianDetailVos.add(clinicianDetailVo3);
        clinicianDetailVos.add(clinicianDetailVo4);


        List<AppointmentDetailVo> appointmentDetailVos = new ArrayList<>();

        AppointmentDetailVo appointmentDetailVo1 = new AppointmentDetailVo(123, 1, "12.9925237", "77.68081280000001");
        AppointmentDetailVo appointmentDetailVo2 = new AppointmentDetailVo(124, 2, "12.9008962", "77.51882509999996");
        AppointmentDetailVo appointmentDetailVo3 = new AppointmentDetailVo(125, 3, "12.9079567", "77.640957");
        AppointmentDetailVo appointmentDetailVo4 = new AppointmentDetailVo(126, 4, "12.9938754", "77.6249593");
        AppointmentDetailVo appointmentDetailVo5 = new AppointmentDetailVo(127, 5, "12.949698", "77.72205839999992");
        AppointmentDetailVo appointmentDetailVo6 = new AppointmentDetailVo(128, 6, "12.8873185", "77.57807509999998");
        AppointmentDetailVo appointmentDetailVo7 = new AppointmentDetailVo(129, 7, "13.0283779", "77.76017669999999");
        AppointmentDetailVo appointmentDetailVo8 = new AppointmentDetailVo(130, 8, "13.0119571", "77.64713069999993");
        AppointmentDetailVo appointmentDetailVo9 = new AppointmentDetailVo(131, 9, "12.9605313", "77.6385912");
        AppointmentDetailVo appointmentDetailVo10 = new AppointmentDetailVo(132, 10, "12.9861535", "77.56716630000005");

        appointmentDetailVos.add(appointmentDetailVo1);
        appointmentDetailVos.add(appointmentDetailVo2);
        appointmentDetailVos.add(appointmentDetailVo3);
        appointmentDetailVos.add(appointmentDetailVo4);
        appointmentDetailVos.add(appointmentDetailVo5);
        appointmentDetailVos.add(appointmentDetailVo6);
        appointmentDetailVos.add(appointmentDetailVo7);
        appointmentDetailVos.add(appointmentDetailVo8);
        appointmentDetailVos.add(appointmentDetailVo9);
        appointmentDetailVos.add(appointmentDetailVo10);

        //pass the above


        List<PhleboAssignmentVo> phleboAssignmentVos = assignPhleboForClinicianAppmt(appointmentDetailVos,clinicianDetailVos);

        return phleboAssignmentVos;
    }

    private List<PhleboAssignmentVo> assignPhleboForClinicianAppmt(List<AppointmentDetailVo> appointmentDetailVos, List<ClinicianDetailVo> clinicianDetailVos) {

        List<PhleboAssignmentVo> phleboAssignmentVos = new ArrayList<>();

        double appointmentCount = appointmentDetailVos.size();
        double clinicianCount = clinicianDetailVos.size();

        int assignmentSize = (int) Math.ceil(appointmentCount/clinicianCount);

        AppointmentDetailVo[] detailVos = appointmentDetailVos.toArray(new AppointmentDetailVo[appointmentDetailVos.size()]);
        ClinicianDetailVo[] clinicianDetailVos1 = clinicianDetailVos.toArray(new ClinicianDetailVo[clinicianDetailVos.size()]);

        int count = 0;
        for (ClinicianDetailVo aClinicianDetailVos1 : clinicianDetailVos1) {
            int counter = 1;

            PhleboAssignmentVo phleboAssignmentVo = new PhleboAssignmentVo();
            phleboAssignmentVo.setHealthProfessionalId(aClinicianDetailVos1.getHealthProfessionalId());

            List<AppointmentDetailVo> appointmentDetailVos1 = new ArrayList<>();

            for (int j = count; j < detailVos.length; j++) {

                appointmentDetailVos1.add(detailVos[j]);
                count++;
                if (++counter == assignmentSize) {
                    break;
                }
            }
            phleboAssignmentVo.setAppointmentDetailList(appointmentDetailVos1);
            phleboAssignmentVos.add(phleboAssignmentVo);
        }

        return phleboAssignmentVos;


    }
}
