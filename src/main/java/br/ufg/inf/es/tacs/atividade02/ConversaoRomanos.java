package br.ufg.inf.es.tacs.atividade02;

import org.apache.commons.collections.map.HashedMap;

import java.util.Map;

/**
 * Created by Alunoinf_2 on 14/11/2018.
 */
public class ConversaoRomanos {

    private static Map<Character, Integer> romanosDecinal = new HashedMap();

    public ConversaoRomanos() {
        this.romanosDecinal.put('I', 1);
        this.romanosDecinal.put('V', 5);
        this.romanosDecinal.put('X', 10);
        this.romanosDecinal.put('L', 50);
        this.romanosDecinal.put('C', 100);
        this.romanosDecinal.put('D', 500);
        this.romanosDecinal.put('M', 1000);
    }

    public static int convertorRomanos(String romano) {
        int decinal = 0;

        if (romano.length() == 1) {
            return romanosDecinal.get(romano.charAt(0));
        } else {
            for (int i = 0; i < romano.length() - 1; i++) {
                int valor1 = romanosDecinal.get(romano.charAt(i));
                int valor2 = romanosDecinal.get(romano.charAt(i + 1));
                if (valor1 < valor2) {
                    decinal += valor2-valor1;
                    i++;
                } else {
                    decinal += valor1;
                }
            }

            if (decinal < 1 || decinal > 4999) {
                throw new IllegalArgumentException("Valor Invalido");
            }

            return decinal;
        }
    }
    
}
