package coderhouse.pre_entrega.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "FACTURA_DETALLE")

public class FacturaDetalle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FACTURA_DETALLES_ID")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "FACTURA_ID", nullable = false)
    private Factura factura;

    @ManyToOne
    @JoinColumn(name = "PRODUCTO_ID", nullable = false)
    private Producto producto;

    private Integer cantidad;

    private Double precio;
}

