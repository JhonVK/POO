package classes;

public class Cinema {
    private int numIngressos;

    public Cinema(int ingressos){
        this.numIngressos=ingressos;
    }

    public boolean vendaIngressos(int quantIngressos){
        if(this.numIngressos-quantIngressos>=0){
            this.numIngressos-=quantIngressos;
            return true;
        }else{
            return false; 
        }
    }

    public int getIngressosDisponiveis(){
        return this.numIngressos;
    }
}
