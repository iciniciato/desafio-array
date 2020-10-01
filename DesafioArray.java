public class DesafioArray {

    public static void adicionarElementoDefineTamanhoArray(String[] array, String texto, TamanhoEnum tamanho) {
        if (tamanho != TamanhoEnum.FIXO) {
            String[] dadoManipulado = null;
            Integer posicao = 0;
            if ("".equals(array[array.length - 1]) || array[array.length - 1] == null) {
                dadoManipulado = new String[array.length - 1];
                posicao = array.length - 1;
            } else {
                if (tamanho.equals(TamanhoEnum.CEM_POR_CENTO)) {
                    dadoManipulado = new String[array.length * 2];
                } else if (tamanho.equals(TamanhoEnum.CINQUENTA_POR_CENTO)) {
                    dadoManipulado = new String[(int) Math.round(array.length * 1.5)];
                }
                posicao = array.length;
            }
            for (int i = 0; i < array.length; i++) {
                dadoManipulado[i] = array[i];
            }
            dadoManipulado[posicao] = texto;
            array = dadoManipulado;
        } else {
            if ("".equals(array[array.length - 1]) || array[array.length - 1] == null) {
                array[array.length - 1] = texto;
            }
        }
    }

    public static void adicionarElemento(String[] array, String texto) {
        String[] dadoManipulado = new String[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            dadoManipulado[i] = array[i];
        }
        dadoManipulado[dadoManipulado.length - 1] = texto;
        array = dadoManipulado;
    }

    public static void removerUltimoElemento(String[] array) {
        String[] dadoManipulado = new String[array.length - 1];
        for (int i = 0; i < dadoManipulado.length; i++) {
            dadoManipulado[i] = array[i];
        }
        array = dadoManipulado;
    }

    public static void removerElementoEscolhido(String[] array, Integer elemento) {
        String[] dadoManipulado = new String[array.length - 1];
        Integer contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != elemento) {
                dadoManipulado[contador] = array[i];
                contador++;
            }
        }
        array = dadoManipulado;
    }

    public static String recuperarElemento(String[] array, Integer elemento) {
        return array[elemento];
    }

    public enum TamanhoEnum {
        CINQUENTA_POR_CENTO, CEM_POR_CENTO, FIXO;
    }
}
