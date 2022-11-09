package com.fiap.globalMS.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.globalMS.models.Veiculo;
import com.fiap.globalMS.repositories.VeiculoRepository;


@RestController
@RequestMapping("/v1")
public class VeiculoController {
		
	@Autowired
	private VeiculoRepository veiculoRepository;

	@PreAuthorize("hasAnyRole('ADMIN')")
	@GetMapping("/Veiculo")
	public ResponseEntity<Veiculo> getAll()
	{
		List<Veiculo> Veiculo = veiculoRepository.findAll();
		return new ResponseEntity(Veiculo.toArray(), HttpStatus.OK);
	}
	
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@GetMapping("/Veiculo/{idVeiculo}")
	public ResponseEntity<Veiculo> getById(@PathVariable long idVeiculo)
	{
		Optional<Veiculo> Veiculo = veiculoRepository.findById(idVeiculo);
		return new ResponseEntity<Veiculo>(Veiculo.get(), HttpStatus.OK);
	}
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@PostMapping("/Veiculo")
	public ResponseEntity<Veiculo> save(@RequestBody Veiculo Veiculo)
	{
		Optional<Veiculo> VeiculoExistente = veiculoRepository.findById(Veiculo.getIdVeiculo());
		
		if(VeiculoExistente.isPresent()) {
			return new ResponseEntity("Veiculo já existente!",HttpStatus.BAD_REQUEST);
		}
		
		veiculoRepository.save(Veiculo);
		return new ResponseEntity<Veiculo>(Veiculo, HttpStatus.CREATED);
	}
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@PutMapping("/Veiculo")
	public ResponseEntity<Veiculo> edit(@PathVariable long idVeiculo)
	{
		Optional<Veiculo> VeiculoExistente = veiculoRepository.findById(idVeiculo);
		
		if(!VeiculoExistente.isPresent()) {
			return new ResponseEntity("Veiculo não encontrado!",HttpStatus.BAD_REQUEST);
		}
		
		veiculoRepository.save(VeiculoExistente.get());
		return new ResponseEntity(VeiculoExistente, HttpStatus.CREATED);
	}
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@DeleteMapping("/Veiculo")
	public ResponseEntity<Veiculo> delete(@RequestBody Veiculo Veiculo){
		Optional<Veiculo> VeiculoExistente = veiculoRepository.findById(Veiculo.getIdVeiculo());
		if(!VeiculoExistente.isPresent()) {
			return new ResponseEntity("Veiculo não encontrado!",HttpStatus.BAD_REQUEST);
		}
		
		veiculoRepository.delete(Veiculo);
		return new ResponseEntity<Veiculo>(Veiculo, HttpStatus.OK);
	}

	
	
}
