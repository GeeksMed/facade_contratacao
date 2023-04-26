package org.example;

public class DocumentoIdentidade extends Solicitacao{
    private static DocumentoIdentidade documentoIdentidade = new DocumentoIdentidade();

    private DocumentoIdentidade() {};

    public static DocumentoIdentidade getInstancia() {return documentoIdentidade;}
}
