import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class Guerreiro extends Jogador {

        private int eficacia;
        Scanner leitura = new Scanner(System.in);
        Random rand = new Random();
        public Guereiro( int vida, int ataque, int defesa, int iniciativa){
            super(vida, ataque, defesa, iniciativa);
        }
  
        public void Ataque () {
            System.out.println("Escolha seu ataque Guerreiro:");
            System.out.println("1- Soco devastador");
            System.out.println("2- Ataque do trovão");
            System.out.println("3- Ataque Giratório");
            System.out.println("4- Golpe de Espada");
            int ataque = leitura.nextInt();
            switch (ataque) {
                case 1:
                    System.out.println("SOCO DEVASTADOOOR!!");
                    ataque = 5;
                    break;

                case 2:
                    System.out.println("ATAQUE DE TROVÃO!!");
                    ataque = 8;
                    break;
                case 3:
                    System.out.println("ATAQUE GIRATÓRIO!!");
                    ataque = 7;
                    break;
                case 4:
                    System.out.println("GOLPE DE ESPADA!!");
                    ataque = 10;
                    break;

            }
        }
      
        public void Defesa () {
            System.out.println("Escolha sua defesa Guerreiro:");
            System.out.println("1- Escudo");
            System.out.println("2- Desviar");
            int option = leitura.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Posisão de defesa");
                    int defesa = 5;
                    break;

                case 2:
                    System.out.println("Você optou desviar do ataque inimigo");
                    int defesa = rand.nextInt(20) + 1;
                    break;
            }
        }
      

      }

