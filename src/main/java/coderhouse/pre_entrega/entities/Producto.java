package coderhouse.pre_entrega.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "PRODUCTO")

public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 150, nullable = false)
    private String descripcion;

    @Column(length = 50, nullable = false, unique = true)
    private String codigo;

    private Integer stock;

    private Double price;
}
