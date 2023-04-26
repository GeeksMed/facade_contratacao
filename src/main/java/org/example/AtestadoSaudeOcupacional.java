package org.example;

public class AtestadoSaudeOcupacional extends Solicitacao{
    private static AtestadoSaudeOcupacional documentoIdentidade = new AtestadoSaudeOcupacional();

    private AtestadoSaudeOcupacional() {};

    public static AtestadoSaudeOcupacional getInstancia() {return documentoIdentidade;}
}
