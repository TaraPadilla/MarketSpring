package com.alianzaf1.market.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "compras")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra", nullable = false)
    private Integer id_compra;

    @Column(name = "id_cliente")
    private String idCliente;

    @Column
    private Date fecha;

    @Column(name = "medio_pago", length = 1)
    private String medioPago;

    @Column(name = "comentario")
    private String comentario;

    @Column(name = "estado", length = 1)
    private String estado;

}