public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;   //shift(fn{por estar no nootbock}) f6 muda o nome(a soma neste exemplo) de todo o codigo
    private int totalDeAvaliacao;       // private priva e n deixa modificar ( n ler nem escrever)
    int duracaoEmMinuto;

    int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    } // get pegar a variavel (devido o private)

    //devolve nada so vai fazer algo
    void exibeFichaTecnica() {
        System.out.println("NOME DO FILME: " + nome);
        System.out.println("ANO DE LANÇAMENTO: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    double pegaMedia(){
        return  somaDasAvaliacoes / totalDeAvaliacao;
    } // void parece uma functin em .jv

}
