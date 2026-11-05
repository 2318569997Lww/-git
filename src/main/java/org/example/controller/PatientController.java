package org.example.controller;

import org.example.common.Result;
import org.example.entity.Patient;
import org.example.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patient")
public class PatientController {

    // 依赖注入 Service 层
    @Autowired
    private PatientService patientService;

    // 查询所有患者
    @GetMapping("/list")
    public Result<List<Patient>> list() {
        List<Patient> list = patientService.getPatientList();
        return Result.success(list);
    }

    // 根据ID查询患者
    @GetMapping("/{id}")
    public Result<Patient> getById(@PathVariable Integer id) {
        Patient patient = patientService.getPatientById(id);
        if (patient != null) {
            return Result.success(patient);
        } else {
            return Result.error("未找到该患者");
        }
    }
}