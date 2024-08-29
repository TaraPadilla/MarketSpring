package com.alianzaf1.market.persistence.entity.MKServicios;

import com.alianzaf1.market.persistence.entity.MKBases.Empresa;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "servicio", schema = "services")
@Getter
@Setter
@NoArgsConstructor
public class Servicio {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_servicio", nullable = false)
        private Integer idServicio;

        @Column(nullable = false, length = 150)
        private String descripcion;

        @Column(name = "nombre_servicio", nullable = false, length = 30)
        private String nombreServicio;

        @Column(nullable = false)
        private Boolean activo = true;

        @ManyToOne
        @JoinColumn(name = "id_empresa", nullable = false)
        private Empresa empresa;
}
