import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LadinoTest {

    @Test
    void deveRetornarOQuePodeFazer(){
        IAventureiro aventureiro = AventureiroFactory.obterAventureiro("Ladino");
        assertEquals("Sou um Ladino, tenho Destreza. Sou furtivo. Posso atacar por trás, abrir portas e baús.", aventureiro.oQuePodeFazer());
    }

}