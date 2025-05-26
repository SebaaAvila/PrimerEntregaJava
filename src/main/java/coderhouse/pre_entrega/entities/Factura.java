package coderhouse.pre_entrega.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "FACTURA")

public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    private Cliente cliente;

    @Column(name = "CREADO_EN")
    private LocalDateTime creadoEn;

    private Double total;

    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL)
    private List<FacturaDetalle> detalles;
}

