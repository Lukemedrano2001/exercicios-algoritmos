package algoritmos.criptografia.hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {
	public static String calcularSHA256(String texto) {
        try {
            MessageDigest mensagemDigest = MessageDigest.getInstance("SHA-256");

            // Converte a string para bytes e calcula o hash
            byte[] bytesHash = mensagemDigest.digest(texto.getBytes());

            // Converte os bytes do hash para representa��o hexadecimal
            StringBuilder hexadecimalStringBuilder = new StringBuilder();
            for (byte byteHas: bytesHash) {
            	hexadecimalStringBuilder.append(String.format("%02x", byteHas));
            }

            return hexadecimalStringBuilder.toString();
        } catch (NoSuchAlgorithmException exception) {
        	exception.printStackTrace();
            return null;
        }
    }
	
	public static void main(String[] args) {
		String textoOriginal = "Hello, World!";
		String outroTexto = "Guilherme";
        String hashSHA256Primeiro = calcularSHA256(textoOriginal);
        String hashSHA256Segundo = calcularSHA256(outroTexto);

        System.out.println("Texto Original: " + textoOriginal);
        System.out.println("Hash 1 SHA-256: " + hashSHA256Primeiro);
        System.out.println("Hash 2 SHA-256: " + hashSHA256Segundo);
	}
}