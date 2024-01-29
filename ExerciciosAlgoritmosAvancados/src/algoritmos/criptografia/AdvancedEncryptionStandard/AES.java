package algoritmos.criptografia.AdvancedEncryptionStandard;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class AES {
	public static byte[] criptografar(String mensagem, SecretKey chaveSecreta) throws Exception {
        Cipher cifra = Cipher.getInstance("AES");
        cifra.init(Cipher.ENCRYPT_MODE, chaveSecreta);
        return cifra.doFinal(mensagem.getBytes());
    }

    public static String descriptografar(byte[] cifraTexto, SecretKey chaveSecreta) throws Exception {
        Cipher cifra = Cipher.getInstance("AES");
        cifra.init(Cipher.DECRYPT_MODE, chaveSecreta);
        byte[] bytesDescriptografados = cifra.doFinal(cifraTexto);
        return new String(bytesDescriptografados);
    }
	
	public static void main(String[] args) throws Exception {
		// Geração de Chave AES
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        SecretKey secretKey = keyGenerator.generateKey();

        // Mensagem a ser criptografada
        String mensagem = "Hello World, AES!";

        // Criptografar
        byte[] bytesCriptografados = criptografar(mensagem, secretKey);
        System.out.println("Mensagem Criptografada: " + new String(bytesCriptografados));

        // Descriptografar
        String mensagemDescriptografada = descriptografar(bytesCriptografados, secretKey);
        System.out.println("Mensagem Descriptografada: " + mensagemDescriptografada);
	}
}