package com.portea.jphleboassignment.service;

import com.portea.jphleboassignment.domain.vo.PhleboAssignmentVo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public interface JPaaRestService {

    List<PhleboAssignmentVo> assignPhlebo();
}
