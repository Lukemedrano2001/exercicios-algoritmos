package strings;

public class ImprimeLetraPorLetra {
    public static void main(String[] args) {
        String nome = "guilherme";

        System.out.println(letraPorLetra(nome));
    }

    public static String letraPorLetra(String string) {
    	StringBuilder resultado = new StringBuilder();
        for (char letra: string.toCharArray()) {
            resultado.append(String.format("%s \n", letra));
        }
        
        return resultado.toString();
    }

}