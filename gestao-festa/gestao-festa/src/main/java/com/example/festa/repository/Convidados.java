package com.example.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long>{

}
