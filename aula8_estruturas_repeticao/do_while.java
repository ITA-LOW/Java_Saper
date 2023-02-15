package aula8_estruturas_repeticao;

public class do_while {
    int counter = 1;

        public void contador(){
        do {
            System.out.printf("%d%n", counter);
            ++counter;
        } while (counter <= 10);
    }

        public void enquanto(){
            while(counter <= 10){
            System.out.printf("%d%n", counter);
            ++counter;
            }
        }
}
