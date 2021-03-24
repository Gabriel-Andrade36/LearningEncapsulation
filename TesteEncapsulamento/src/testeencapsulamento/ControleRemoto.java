

package testeencapsulamento;
import javax.swing.JOptionPane;



public class ControleRemoto implements Controlador {
private int volume;
private boolean ligado;
private boolean tocando;
private int mudo;
private boolean mudoState;
    
public ControleRemoto(){
this.setVolume(50);
this.setLigado(false);
this.setTocando(false);

}
    
    @Override
    public void Ligar() {
    this.setLigado(true);
    }

    @Override
    public void Desligar() {
    this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
    JOptionPane.showMessageDialog(null,"Ligado: " + this.getLigado() + "\nVolume:  " + this.getVolume() + "\nTocando: " + this.getTocando(), "Menu:",1);   

    }

    @Override
    public void fecharMenu() {
    }

    @Override
    public void maisVolume() {
    if(getLigado()== true){
      if(getMudoState()==false){
         this.setVolume(this.getVolume()+5);
        }else{
         this.setVolume(this.getMudo()+5);
         this.setMudoState(false);        
        }    
    }
    }

    @Override
    public void menosVolume() {
     if(getLigado()==true){
             if(getMudoState()==false){
             this.setVolume(this.getVolume()-5);
            }else{
             this.setVolume(this.getMudo()-5);
             this.setMudoState(false);        
            }
        }
    } 

    @Override
    public void ligarMudo() {
    if(getMudoState()==false && getLigado()==true){
     this.setMudo(this.getVolume());
     this.setVolume(0);
     this.setMudoState(true);
    }
    
    }

    @Override
    public void desligarMudo() {
    if(this.getMudoState() == true && getLigado()==true){
     this.setVolume(this.getMudo());
     this.setMudoState(false);    
    }
    
    }

    @Override
    public void play() {
    if(this.getLigado()== true && this.getTocando() == false){
    this.setTocando(true);    
    }
    }

    @Override
    public void pause() {
    if(this.getLigado()==true && this.getTocando() == true){
    this.setTocando(false);    
    }
    }

private void setVolume (int v){
this.volume = v;    
}
public int getVolume (){
return this.volume;
}
private void setLigado (boolean l){
this.ligado = l;    
}
public boolean getLigado(){
return this.ligado;    
}
private void setTocando(boolean t){
this.tocando = t;    
}
private boolean getTocando(){
return this.tocando;    
}
private void setMudo(int m){
this.mudo = m;    
}
private int getMudo(){
return this.mudo;    
}
private void setMudoState(boolean m){
this.mudoState = m;    
}
private boolean getMudoState(){
return this.mudoState;
}
}
