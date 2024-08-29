package com.alianzaf1.market.persistence.entity.MKComercial;

import com.alianzaf1.market.persistence.entity.MKProductos.Catalogo;
import com.alianzaf1.market.persistence.entity.MKBases.Usuario;
import com.alianzaf1.market.persistence.entity.MKServicios.Servicio;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "cotizacion")
@Getter
@Setter
@NoArgsConstructor
public class Cotizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cotizacion", nullable = false)
    private Integer idCotizacion;

    @Column(nullable = false, length = 255)
    private String estado;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDateTime fechaCreacion;

    @Column(nullable = true, length = 255)
    private String notas;

    @Column(name = "precio_total", nullable = false)
    private Double precioTotal;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false,
                insertable = false, updatable = false )
    private Usuario usuario;
}
