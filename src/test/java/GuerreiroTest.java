import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuerreiroTest {

    @Test
    void deveRetornarOQuePodeFazer(){
        IAventureiro aventureiro = AventureiroFactory.obterAventureiro("Guerreiro");
        assertEquals("Sou um Guerreiro, tenho Força. Posso atacar e defender.", aventureiro.oQuePodeFazer());
    }

}