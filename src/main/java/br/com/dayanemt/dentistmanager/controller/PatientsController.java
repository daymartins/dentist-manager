package br.com.dayanemt.dentistmanager.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacients")
public class PatientsController {

//    @GetMapping
//    @Cacheable(value = "patientsList")
//    public Page<>list()
}
