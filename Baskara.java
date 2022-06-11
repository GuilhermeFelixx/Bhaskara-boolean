
package classes;
public class Baskara {
    private float valorDeA;
    private float valorDeB;
    private float valorDeC;
    
    public double calcularResultadoParaX1(){
        return valorDeB+Math.sqrt(valorDeB*valorDeB-4*valorDeA*valorDeC)/(2*valorDeA);
    }
    public double calcularResultadoDeX2(){
        return valorDeB-Math.sqrt(valorDeB*valorDeB-4*valorDeA*valorDeC)/(2*valorDeA);
    }    
    public float getValorDeA(){
        return this.valorDeA;
    }
    public float getValorDeB(){
        return this.valorDeB;
    }
    public float getValorDeC(){
        return this.valorDeC;
    }
    public void setValorDeA(float valorDeA){
        this.valorDeA=valorDeA;
    }
    public void setValorDeB(float valorDeB){
        this.valorDeB=valorDeB;
    }
    public void setValorDeC(float valorDeC){
        this.valorDeC=valorDeC;
    }
    public boolean validarBaskara(){
        if(valorDeA==0 || valorDeB*valorDeB-4*valorDeA*valorDeC<0){
            return false;
        }else{
            return true;
            
        }    
      }
    }


    
    
    
    

