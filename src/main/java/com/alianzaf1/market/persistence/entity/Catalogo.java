package com.alianzaf1.market.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "catalogo", schema = "products")
public class Catalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_catalogo", nullable = false)
    private Integer idCatalogo;

    @ManyToOne
    @JoinColumn(name = "id_empresa", nullable = true)
    private Empresa empresa;

    @Column(nullable = false, length = 255)
    private String nombre;


}
