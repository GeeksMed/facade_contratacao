package org.example;

public class CandidatoFacade {
    public static boolean verificarPendenciasContrato(Candidato candidato){
        if (AtestadoSaudeOcupacional.getInstancia().verificarPendencia(candidato)){
            return false;
        }
        if (DocumentoCarteiraTrabalho.getInstancia().verificarPendencia(candidato)){
            return false;
        }
        if (DocumentoIdentidade.getInstancia().verificarPendencia(candidato)){
            return false;
        }
        if (DocumentoTituloEleitor.getInstancia().verificarPendencia(candidato)){
            return false;
        }
        return true;
    }
}
