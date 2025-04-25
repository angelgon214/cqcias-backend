package com.example.cqcias_backend.producto;

import com.example.cqcias_backend.entity.Producto;
import com.example.cqcias_backend.repository.ProductoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/productos")
public class ProductoBusiness implements IProductoBusiness {

    private final ProductoRepository productoRepository;

    public ProductoBusiness(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @GetMapping
    public List<Producto> getAllProductosActivos() {
        return productoRepository.findByEstatus("A");
    }

    @GetMapping("/todos")
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

    @PostMapping
    public Producto createProducto(@RequestBody Producto producto) {
        return productoRepository.save(producto);
    }

    @GetMapping("/{id}")
    public Producto getProductoById(@PathVariable("id") Integer id) {
        return productoRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontró el producto con ID: " + id));
    }

    @PutMapping("/{id}")
    public Producto updateProducto(@RequestBody Producto producto, @PathVariable("id") Integer id) {
        if (!productoRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontró el producto con ID: " + id);
        }
        producto.setId(id);
        return productoRepository.save(producto);
    }

    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable("id") Integer id) {
        if (!productoRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se encontró el producto con ID: " + id);
        }
        productoRepository.deleteById(id);
    }
}