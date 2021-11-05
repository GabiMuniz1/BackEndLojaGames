package com.lojaGames.AppLoja.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcductRepository extends JpaRepository<ProductModel, Long>{

	public List<ProductModel> findAllByNameContainingIgnoreCase (String titulo);
}
