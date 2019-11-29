package LeticiaAtividade;

import java.util.Random;
import java.util.Stack;

public class Baralho {
    private Stack<Carta> baralho;

    public Baralho() {
        String[] faces = {"Às", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
        String[] naipes = {"Paus", "Espadas", "Copas", "Ouros"};

        baralho = new Stack<>();

        int i = 0;

        while(i < 52){
            baralho.push(new Carta(faces[i%13],i%13 + 1,naipes[i/13]));
            i++;
        }
    }

    public Carta virarCarta(){
        return baralho.pop();
    }

    public Carta removerCarta(int ind){
        Stack<Carta> aux = new Stack<Carta>();

        for (int i = 0; i < ind; i++) {
            aux.push(baralho.pop());
        }
        Carta alvo = baralho.pop();

        while (!aux.isEmpty()) {
            baralho.push(aux.pop());
        }
        return alvo;

    }

    public void embaralhar(){
        Random nrAleatorio = new Random();
        for (int i = 0; i < 52; i++){
            int indice = nrAleatorio.nextInt(52);

            if(indice != 0){
                baralho.push(removerCarta(indice));
            }
        }
    }

    @Override
    public String toString() {
        return "Baralho: " + "\n" + baralho.toString() + "\n";
    }

}
