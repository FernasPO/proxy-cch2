public class ImagemReal implements Imagem {
    private String nomeArquivo;

    public ImagemReal(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        carregarImagemDoDisco();
    }

    private void carregarImagemDoDisco() {
        System.out.println("Carregando " + nomeArquivo);
    }

    public void exibir() {
        System.out.println("Exibindo " + nomeArquivo);
    }
}