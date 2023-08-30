public class Main {
    public static void main(String[] args) {
        // Classe Objeto         Contrutor
        Turista mochileiro = new Turista();
        // Definir formato do objeto
        mochileiro.setNome("Lindsay Lohan");
        mochileiro.setCpf(Validacao.cpf("123"));
        Turista mochileira = new Turista("Maria");
        // Definir comportamento
        String retorno = mochileira.viajar();
        System.out.println(retorno);
    }
}