package exceptionsDesafio;

public class ErroDeConversaoDeCepException extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeCepException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
