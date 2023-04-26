package org.example;

public class Candidato
{
    public boolean contratar() {return CandidatoFacade.verificarPendenciasContrato(this);}
}
