package projeto5;

public class JogoMatemático {
    private String calculo;
    private int resposta;

    public String getCalculo() {
        return calculo;
    }

    public int getResposta() {
        return resposta;
    }
    
    public void sortearCalculo(){
        int[] valores = {(int)(Math.random() * 101), (int)(Math.random() * 101)};
        int operacaoGerador = (int)(Math.random() * 4);
        String operacao;
        
        switch(operacaoGerador){
            case 0:
                operacao = "+";
                this.resposta = valores[0] + valores[1];
                break;
            case 1:
                operacao = "-";
                this.resposta = valores[0] - valores[1];
                break;
            case 2:
                operacao = "*";
                this.resposta = valores[0] * valores[1];
                break;
            default:
                operacao = "/";
                this.resposta = valores[0] / valores[1];
        }
        
        this.calculo = valores[0] + " " + operacao + " " + valores[1]; 
    }
    
    public boolean checarResposta(int valor){
        return valor == this.resposta;
    }
}
