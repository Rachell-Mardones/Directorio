package cl.ucn.disc.dsm.rmardones.scrapper;

import lombok.Builder;
import lombok.Getter;

/**
 * The Funcionario
 *@author Rachell Mardones-Luna.
 */
@Builder
public final class Funcionario {

    /**
     * The ID.
     */
    @Getter
    private final Integer id;

    /**
     * The NOMBRE.
     */
    @Getter
    private final String nombre;

    /**
     * The CARGO.
     */
    @Getter
    private final String cargo;

    /**
     * The UNIDAD.
     */
    @Getter
    private final String unidad;

    /**
     * The EMAIL.
     */
    @Getter
    private final String email;

    /**
     * The TELEFONO.
     */
    @Getter
    private final String telefono;

    /**
     * The OFICINA.
     */
    @Getter
    private final String oficina;

    /**
     * The DIRECCION.
     */
    @Getter
    private final String direccion;

}
