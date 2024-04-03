package trimestre2.repaso.examenAñoPasado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* */
public class ejercicio06A {
    public static void main(String[] args) {
        ArrayList<Carta> mano = new ArrayList<>();
        HashMap<String, Integer> valoresCartas = new HashMap<>();
        valoresCartas.put("as", 11);
        valoresCartas.put("rey", 10);
        valoresCartas.put("caballo", 10);
        valoresCartas.put("sota", 10);
        valoresCartas.put("diez", 10);
        valoresCartas.put("nueve", 9);
        valoresCartas.put("ocho", 8);
        valoresCartas.put("siete", 7);
        valoresCartas.put("seis", 6);
        valoresCartas.put("cinco", 5);
        valoresCartas.put("cuatro", 4);
        valoresCartas.put("tres", 3);
        valoresCartas.put("dos", 2);

        while (mano.size() < 7) {
            Carta nuevaCarta = new Carta();
            if (!mano.contains(nuevaCarta)) {
                mano.add(nuevaCarta);
            }
        }


        System.out.println("Mano de cartas ordenadas por PALO y NÚMERO:");
        for (Carta carta : mano) {
            System.out.println(carta.getValor() + " de " + carta.getPalo());
        }

        int totalPuntos = calcularTotalPuntos(mano, valoresCartas);
        System.out.println("\nTotal de puntos de la mano: " + totalPuntos);
    }

    public static int calcularTotalPuntos(ArrayList<Carta> mano, HashMap<String, Integer> valores) {
        int total = 0;
        for (Carta carta : mano) {
            if (valores.containsKey(carta.getValor())) {
                total += valores.get(carta.getValor());
            } else {
                total += Integer.parseInt(carta.getValor());
            }
        }
        return total;
    }
}
