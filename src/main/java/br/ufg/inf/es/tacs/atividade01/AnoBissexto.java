package br.ufg.inf.es.tacs.atividade01;

/**
 * Created by Alunoinf_2 on 14/11/2018.
 */
public class AnoBissexto {

    public static boolean anoBissexto(int ano) {

        return ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) ? true : false;
    }
}
