package utilsBank;

import utilsBank.arquivo.Exception.ArquivoVazioException;
import utilsBank.arquivo.Exception.LeituraArquivoException;
import utilsBank.arquivo.GerenciadorArquivo;

import java.util.HashSet;

public class GerenciadorGeracaoAleatoria {

    public static HashSet<String> inicializarGeracaoAleatoria(String path) {
        try {
            return GerenciadorArquivo.listarSetGeracaoAleatoria(path);
        } catch (ArquivoVazioException ex) {
            return new HashSet<>();
        } catch (LeituraArquivoException ex) {
            //TODO Tratar erro
            throw new RuntimeException();
        }
    }

    public static void salvandoGeracaoAleatoria(String path, HashSet<String> dados) {
        GerenciadorArquivo.inserirSetGeracao(path, dados);
    }
}