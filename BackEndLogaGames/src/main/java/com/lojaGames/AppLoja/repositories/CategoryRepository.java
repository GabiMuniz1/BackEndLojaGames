package com.lojaGames.AppLoja.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojaGames.AppLoja.models.CategoryModel;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel, Long>{
	public List<CategoryModel> findAllByNameContainingIgnoreCase(String name);

}



