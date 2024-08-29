package com.alianzaf1.market.persistence.entity.MKBases;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuario", schema ="base")
@Getter
@Setter
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private Integer idUsuario;

    @Column(name = "tipo_usuario", nullable = false)
    private Character tipoUsuario = 'E';

    @Column(name = "nombre_temp")
    private String nombreTemp;

    @ManyToOne
    @JoinColumn(name = "id_empresa", nullable = false)
    private Empresa empresa;
}
