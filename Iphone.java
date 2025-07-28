public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    
    public void ligar(String numero){
        System.out.println("Ligando para o numero: "+numero);
    }

    public void atender(){
        System.out.println("Telelefone atendido");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio");
    }

    public void exibirPagina(String url){
        System.out.println("Exibindo a pagina da url "+url);
    }

    public void adicionarNovaAba(){
        System.out.println("Aba Adicionada");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando página");
    }

    public void tocar(){
        System.out.println("Iphone tocando");
    }

    public void pausar(){
        System.out.println("Musica do iphone pausada");
    }

    public void selecionarMusica(String musica){
        System.out.println("Tocando a música "+musica);
    }
}
