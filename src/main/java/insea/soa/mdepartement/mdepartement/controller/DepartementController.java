package insea.soa.mdepartement.mdepartement.controller;

import insea.soa.mdepartement.mdepartement.model.*;
import insea.soa.mdepartement.mdepartement.model.*;
import insea.soa.mdepartement.mdepartement.repo.*;
import insea.soa.mdepartement.mdepartement.repo.*;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class DepartementController {
    
	@Autowired
	private DepartementRepo departementRepo;
    
   

    @GetMapping("/departements")
    public Iterable<Departement> getAll(){
        return departementRepo.findAll();
    }

    @GetMapping("/departements/{reference}")
    public Optional<Departement> getByReference(@PathVariable("reference") String reference){
        return departementRepo.findByReference(reference);
    }
    @GetMapping("/departements/nom/{nomDep}")
    public Optional<Departement> getByNom(@PathVariable("nomDep") String nomDep){
        return departementRepo.findByNom(nomDep);
    }

    
    

}
