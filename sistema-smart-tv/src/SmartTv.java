public class SmartTv {
    boolean ligada = false;
    int canal=1;
    int volume=25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }

    public void ligar(){
        ligada=true;
    }
    
    public void ligar(){
        ligada=true;
    }

    public void desLigar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
}
    