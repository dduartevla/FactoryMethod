import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AventureiroFactoryTest {

    @Test
    void deveRetornarExcecaoAventureiroInexistente(){
        try{
            IAventureiro aventureiro = AventureiroFactory.obterAventureiro("Necromante");
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Aventureiro inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaAventureiroInvalido(){
        try {
            IAventureiro aventureiro= AventureiroFactory.obterAventureiro("Paladino");
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Aventureiro inválido", e.getMessage());
        }
    }

}