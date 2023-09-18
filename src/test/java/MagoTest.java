import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagoTest {

    @Test
    void deveRetornarOQuePodeFazer(){
        IAventureiro aventureiro = AventureiroFactory.obterAventureiro("Mago");
        assertEquals("Sou um Mago, tenho Inteligencia. Posso usar magia.", aventureiro.oQuePodeFazer());
    }

}