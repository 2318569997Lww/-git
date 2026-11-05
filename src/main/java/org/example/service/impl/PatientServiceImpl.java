package org.example.service.impl;

import org.example.entity.Patient;
import org.example.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    // 模拟数据库中的数据
    private static final List<Patient> mockDatabase = new ArrayList<>();

    static {
        mockDatabase.add(new Patient(1, "张三", "110101199001011234", "13800138000"));
        mockDatabase.add(new Patient(2, "李四", "110101199505055678", "13900139000"));
    }

    @Override
    public List<Patient> getPatientList() {
        return mockDatabase;
    }

    @Override
    public Patient getPatientById(Integer id) {
        return mockDatabase.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}