
package testeencapsulamento;


public class TesteEncapsulamento {

 
    public static void main(String[] args) {
    ControleRemoto Controle = new ControleRemoto();
 
 //ALL COMMANDS
    //Controle.abrirMenu();
    //Controle.Ligar();
    // Controle.Desligar();
    //Controle.ligarMudo();
    // Controle.desligarMudo();
    // Controle.play();
    // Controle.pause();
    // Controle.maisVolume();
    // Controle.menosVoulume();
   
  
    
 //WITHOUT TURNS CONTROL ON, NOTHING IS GOING TO WORK. -> Controle.Ligar();  
    
    
 //SHOWING HOW MUTE BUTTON WORKS

   /* 
   Controle.Ligar(); //Turn control on
   Controle.abrirMenu();
   Controle.ligarMudo(); //turns muted on
   Controle.abrirMenu(); 
   Controle.desligarMudo();//turns muted off
   Controle.abrirMenu();     
   */ 
   
 //SHOWING HOW VOLUME WORKS   
   
   /*
   Controle.Ligar();
   Controle.abrirMenu();
   Controle.maisVolume(); //turn up the volume
   Controle.abrirMenu();
   Controle.menosVolume();//turn down the volume twice
   Controle.menosVolume();
   Controle.abrirMenu();
   Controle.ligarMudo();//if you mute on try to decrease or increase the volume , the muted will be disabled.
   Controle.abrirMenu();
   Controle.menosVolume();//besides muted be disabled,volume will decrease or increase depending on what you chose.
   Controle.abrirMenu();
   */ 
    
    
    
    }
    
}
