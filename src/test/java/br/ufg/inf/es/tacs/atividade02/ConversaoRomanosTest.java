package br.ufg.inf.es.tacs.atividade02;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Alunoinf_2 on 14/11/2018.
 */
public class ConversaoRomanosTest {

    @Test(expected = IllegalArgumentException.class)
    public void testLastRangeInvalidValue() throws Exception {
        ConversaoRomanos conversaoRomanos = new ConversaoRomanos();
        conversaoRomanos.convertorRomanos("MMMMMM");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueWithInvalidCharacters() throws Exception {
        ConversaoRomanos conversaoRomanos = new ConversaoRomanos();
        conversaoRomanos.convertorRomanos("MMW");
    }

    @Test
    public void testCasoTrivial() {
        ConversaoRomanos conversaoRomanos = new ConversaoRomanos();
        Assert.assertEquals(1, conversaoRomanos.convertorRomanos("I"));
        Assert.assertEquals(10, conversaoRomanos.convertorRomanos("X"));
        Assert.assertEquals(9, conversaoRomanos.convertorRomanos("IX"));
        Assert.assertEquals(494,conversaoRomanos.convertorRomanos("CDXCIV"));
        Assert.assertEquals(1004 , conversaoRomanos.convertorRomanos("MIV"));
        Assert.assertEquals(1094, conversaoRomanos.convertorRomanos("MXCIV"));
        Assert.assertEquals(1449, conversaoRomanos.convertorRomanos("MCDXLIX"));
    }
}
