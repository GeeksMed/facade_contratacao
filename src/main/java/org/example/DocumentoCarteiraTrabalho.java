package org.example;

public class DocumentoCarteiraTrabalho extends Solicitacao{
    private static DocumentoCarteiraTrabalho documentoIdentidade = new DocumentoCarteiraTrabalho();

    private DocumentoCarteiraTrabalho() {};

    public static DocumentoCarteiraTrabalho getInstancia() {return documentoIdentidade;}
}
