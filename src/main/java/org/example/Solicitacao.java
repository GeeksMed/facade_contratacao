package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Solicitacao {
    private List<Candidato> candidatoPendencia = new ArrayList<Candidato>();

    public void addCandidatoPendente(Candidato candidato){
        this.candidatoPendencia.add(candidato);
    }

    public boolean verificarPendencia(Candidato candidato) {
        return this.candidatoPendencia.contains(candidato);
    }
}
