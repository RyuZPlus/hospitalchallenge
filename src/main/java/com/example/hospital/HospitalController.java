package com.example.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HospitalController {
    @Autowired
    private ConsultorioRepository consultorioInterface;

    @Autowired
    private CitasRepository citasRepository;

    @Autowired
    private DoctoresRepository doctoresRepository;

	@GetMapping("/index")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	@GetMapping(value = "/consultorio", produces = "application/json")
    public Iterable<Consultorio> Consultorio(){
        return consultorioInterface.findAll();         
    }

    @GetMapping(value = "/citas", produces = "application/json")
    public Iterable<Citas> Citas(){
        return citasRepository.findAll();         
    }

    @GetMapping(value = "/doctores", produces = "application/json")
    public Iterable<Doctores> Doctores(){
        return doctoresRepository.findAll();         
    }
}
