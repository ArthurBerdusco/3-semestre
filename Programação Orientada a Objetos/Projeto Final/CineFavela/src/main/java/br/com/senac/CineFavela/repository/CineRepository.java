package br.com.senac.CineFavela.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senac.CineFavela.model.Sala;

public interface CineRepository extends JpaRepository<Sala, Long> {
    
}
