package com.minhaLojaDeGames.minhaLojaDeGame.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minhaLojaDeGames.minhaLojaDeGame.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria>findAllByTipoContainingCase(String tipo);

}
