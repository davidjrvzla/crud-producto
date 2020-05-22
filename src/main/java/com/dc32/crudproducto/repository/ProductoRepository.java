package com.dc32.crudproducto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dc32.crudproducto.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
	List<Producto> findByPublished(boolean published);
	List<Producto> findByNombreContaining(String nombre);
}
