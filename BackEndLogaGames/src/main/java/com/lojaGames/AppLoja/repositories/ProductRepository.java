package com.lojaGames.AppLoja.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojaGames.AppLoja.models.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long>{

	public List<ProductModel> findAllByNameContainingIgnoreCase (String titulo);
}
