package com.example.cqcias_backend.producto;

import java.util.List;

import com.example.cqcias_backend.entity.Producto;

public interface IProductoBusiness {
    public List<Producto> getAllProductosActivos();
    public List<Producto> getAllProductos();
    public Producto createProducto(Producto producto);
    public Producto getProductoById(Integer id) throws Exception;
    public Producto updateProducto(Producto producto, Integer id) throws Exception;
    public void deleteProducto(Integer id) throws Exception;
}
