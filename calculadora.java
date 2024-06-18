import javax.swing.JOptionPane;

 public class calculadora {
 @SuppressWarnings("static-access")
public static void main (String[] args) throws InterruptedException {
 JOptionPane jp = new JOptionPane();
    int resp = 1;


while (resp != 2) {
    String text1 = jp.showInputDialog("Digite o 1° número: ");
        double num1 = Double.parseDouble(text1);  
    String text2 = jp.showInputDialog("Digite o 2° número: ");
        double num2  = Double.parseDouble(text2);

        String[] options = {"Somar", "Subtrair", "Dividir","Multiplicar"};                         

int esco = jp.showOptionDialog(null, "Selecione a operação", "Calculadora", jp.YES_NO_CANCEL_OPTION, jp.QUESTION_MESSAGE, null, options, options[0]);

     if (esco == 0) {
        jp.showMessageDialog(null,"A soma dos números é: " + (num1 + num2));
                     
    } else if (esco == 1) {
        jp.showMessageDialog(null,"A subtração entre os números é: " + (num1 - num2));
                         
    } else if (esco == 2) {
        jp.showMessageDialog(null,"A divisão entre esses números é: " + (num1/num2));
                            
    } else if (esco == 3) {
        jp.showMessageDialog(null,("O valor da multiplicação entre esses números é: " + (num1*num2)));
                                   
    } else { 
        jp.showMessageDialog(null,"Escreva a operação que deseja realizar");                              
        }      
        
                String[] option = {"SIM", "NÃO"};                         
 resp = jp.showOptionDialog(null, "Deseja Continua?", "Calculadora", jp.YES_NO_CANCEL_OPTION, jp.QUESTION_MESSAGE, null, option, option[0]); 

                if (resp == 1) {
                    jp.showMessageDialog(null,"Fim!");
                        break;
                                                    
                    } else if (resp == 0) {
                        int contador = 1;
                            while (contador <= 3) {                                                
                                System.out.println("Recomeçando...\nRecomeçando...");
                                Thread.sleep(1000);
                                contador++;
                            }
                        }
                 }
        }
}
