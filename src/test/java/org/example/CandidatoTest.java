package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CandidatoTest {

    @Test
    void deveRetornarPendenciaAtestadoSaudeOcupacional() {
        Candidato candidato = new Candidato();
        AtestadoSaudeOcupacional.getInstancia().addCandidatoPendente(candidato);

        assertEquals(false, candidato.contratar());
    }
    @Test
    void deveRetornarPendenciaDocumentoCarteiraTrabalho() {
        Candidato candidato = new Candidato();
        DocumentoCarteiraTrabalho.getInstancia().addCandidatoPendente(candidato);

        assertEquals(false, candidato.contratar());
    }
    @Test
    void deveRetornarPendenciaDocumentoIdentidade() {
        Candidato candidato = new Candidato();
        DocumentoIdentidade.getInstancia().addCandidatoPendente(candidato);

        assertEquals(false, candidato.contratar());
    }
    @Test
    void deveRetornarPendenciaDocumentoTituloEleitor() {
        Candidato candidato = new Candidato();
        DocumentoTituloEleitor.getInstancia().addCandidatoPendente(candidato);

        assertEquals(false, candidato.contratar());
    }

    @Test
    void deveRetornarSemPendencia() {
        Candidato candidato = new Candidato();

        assertEquals(true, candidato.contratar());
    }


}