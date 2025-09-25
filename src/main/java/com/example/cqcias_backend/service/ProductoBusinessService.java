package com.example.cqcias_backend.service;

import com.example.cqcias_backend.entity.ProductoBusinessEntity;

import java.util.List;

public interface ProductoBusinessService {
    public List<ProductoBusinessEntity> getAllProductosActivos();

    public List<ProductoBusinessEntity> getAllProductos();

    public ProductoBusinessEntity createProducto(ProductoBusinessEntity producto);

    public ProductoBusinessEntity getProductoById(Integer id) throws Exception;

    public ProductoBusinessEntity updateProducto(ProductoBusinessEntity producto, Integer id) throws Exception;

    public void deleteProducto(Integer id) throws Exception;
}
