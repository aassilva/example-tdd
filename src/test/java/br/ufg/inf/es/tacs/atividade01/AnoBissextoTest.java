package br.ufg.inf.es.tacs.atividade01;

import br.ufg.inf.es.tacs.atividade01.AnoBissexto;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Alunoinf_2 on 14/11/2018.
 */
public class AnoBissextoTest {

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(true, AnoBissexto.anoBissexto(400));
        Assert.assertEquals(false, AnoBissexto.anoBissexto(500));
        Assert.assertEquals(true, AnoBissexto.anoBissexto(1200));
        Assert.assertEquals(false, AnoBissexto.anoBissexto(1500));
        Assert.assertEquals(true, AnoBissexto.anoBissexto(2000));
        Assert.assertEquals(false, AnoBissexto.anoBissexto(2001));
        Assert.assertEquals(true, AnoBissexto.anoBissexto(2004));
        Assert.assertEquals(false, AnoBissexto.anoBissexto(2100));
    }
}
