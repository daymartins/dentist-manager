package br.com.dayanemt.dentistmanager.controller;

import br.com.dayanemt.dentistmanager.controller.dto.PatientListDTO;
import br.com.dayanemt.dentistmanager.model.Patient;
import br.com.dayanemt.dentistmanager.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientsController {

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping
    @Cacheable(value = "patientsList")
    public Page<PatientListDTO> list(@RequestParam(required = false) String name, @RequestParam(required = false) String cellphone,
                                     @PageableDefault(sort = "name", direction = Sort.Direction.ASC, page = 0, size = 15) Pageable pagination) {
        if (name == null && cellphone == null) {
            Page<Patient> patients = patientRepository.findAll(pagination);
            return PatientListDTO.convert(patients);
        } else {
            Page<Patient> patients = patientRepository.findPatient(name, cellphone, pagination);
            return PatientListDTO.convert(patients);
        }
    }
}
