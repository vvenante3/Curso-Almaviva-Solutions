public class Lampada {
    
    /*
    ter um estado: ligada ou desligada
        conseguir ligar
        conseguir desligar
    */

    // ATRIBUTOS

    private boolean ligado; 

    // METODOS

    public boolean getLigada(){
        return ligado;
    }

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }

    public void mostrarEstado(){
        if(ligado){
            System.out.println("Lâmpada ligada");
        } else {
            System.out.println("Lâmpada desligada");
        }
    }
    
}