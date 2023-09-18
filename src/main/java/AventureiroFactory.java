public class AventureiroFactory {

    public static IAventureiro obterAventureiro(String aventureiro){
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName(aventureiro);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Aventureiro inexistente");
        }
        if (!(objeto instanceof IAventureiro)) {
            throw new IllegalArgumentException("Aventureiro inválido");
        }
        return (IAventureiro) objeto;
    }
    }


}
