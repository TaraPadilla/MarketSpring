package com.alianzaf1.market.persistence.entity.MKBases;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "empresa", schema = "base")
@Getter
@Setter
@NoArgsConstructor
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_empresa")
    private Integer idEmpresa;

    @Column(nullable = false, length = 255)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private Boolean activa = true;

}
