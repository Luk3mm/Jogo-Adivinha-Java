import javax.swing.JOptionPane;

public class JogoAdivinha {
    public static void main(String[] args) throws Exception {
        boolean jogarNovamente = true;

        while(jogarNovamente){

            int numeroASerAdivinhado = (int) (Math.random() * 20 + 1);

            int numeroTentativas = 0;

            for( int i = 0; i < 10; i++){
                boolean numeroPermitido = false;
                int numeroDaTentativa = 0;

                while(!numeroPermitido){

                String tentativa = JOptionPane.showInputDialog(null, "Digite um numero entre 1 e 20: ");

                try{
                    numeroDaTentativa = Integer.parseInt(tentativa);
                    numeroPermitido = true;
                }
                catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Digite apenas numero!");
                }

                }

                if(numeroDaTentativa == numeroASerAdivinhado){
                    JOptionPane.showMessageDialog(null, "Parabens, voce acertou o numero na " + numeroTentativas + " tentativa");
                    break;
                }

                else if(numeroDaTentativa < numeroASerAdivinhado){
                    JOptionPane.showMessageDialog(null, "O numero precisa ser maior");
                }
                else if(numeroDaTentativa > numeroASerAdivinhado){
                    JOptionPane.showMessageDialog(null, "O numero precisa ser menor");
                }

                numeroTentativas++;
            }

            if(numeroTentativas == 10){
                JOptionPane.showMessageDialog(null, "Infelizmente acabou as tentativas, GAME OVER! O numero era: " + numeroASerAdivinhado);
            }

            int escolha = JOptionPane.showConfirmDialog(null, "Gostaria de jogar novamente? ", "Jogar Novamente", JOptionPane.YES_NO_OPTION);
            jogarNovamente = (escolha == JOptionPane.YES_OPTION);

        }
    }
}
