package com.example.cqcias_backend.repository;

import java.util.List;

import com.example.cqcias_backend.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    List<Producto> findByEstatus(String estatus);
}
