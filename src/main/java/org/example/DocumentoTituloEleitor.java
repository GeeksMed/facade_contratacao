package org.example;

public class DocumentoTituloEleitor extends Solicitacao{
    private static DocumentoTituloEleitor documentoIdentidade = new DocumentoTituloEleitor();

    private DocumentoTituloEleitor() {};

    public static DocumentoTituloEleitor getInstancia() {return documentoIdentidade;}
}
