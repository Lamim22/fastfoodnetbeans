/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabriel.fastfood.domain.repository;

import com.gabriel.fastfood.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author devsys-a
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
