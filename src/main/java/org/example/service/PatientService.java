package org.example.service;

import org.example.entity.Patient;
import java.util.List;

public interface PatientService {
    // 获取患者列表（模拟数据）
    List<Patient> getPatientList();

    // 根据ID查询患者
    Patient getPatientById(Integer id);
}