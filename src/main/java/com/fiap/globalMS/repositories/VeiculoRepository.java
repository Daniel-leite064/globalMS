package com.fiap.globalMS.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fiap.globalMS.models.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

	
	@Query("select * from tb_veiculo where id_veiculo = ?1")
	Optional<Veiculo> getById(long idVeiculo);
}
