public class Main {
    public static void main(String[] args) {
        Imagem imagem = new ProxyImagem("foto1.png");

        System.out.println("Primeiro acesso:");
        imagem.exibir();

        System.out.println("Segundo acesso:");
        imagem.exibir();
    }
}