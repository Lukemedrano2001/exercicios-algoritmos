package algoritmos.criptografia.rivestShamirAdleman;

import java.math.BigInteger;
import java.security.SecureRandom;

public class RSA {
	private BigInteger modulo, expoenteDescriptografia, expoenteCriptografia;
	
	public RSA(int tamanhoBits) {
        SecureRandom random = new SecureRandom();
        BigInteger primeiroPrimo = BigInteger.probablePrime(tamanhoBits / 2, random);
        BigInteger segundoPrimo = BigInteger.probablePrime(tamanhoBits / 2, random);
        BigInteger phi = primeiroPrimo.subtract(BigInteger.ONE).multiply(segundoPrimo.subtract(BigInteger.ONE));
        
        modulo = primeiroPrimo.multiply(segundoPrimo);
        expoenteDescriptografia = BigInteger.valueOf(65537);
        expoenteCriptografia = expoenteDescriptografia.modInverse(phi);
    }
	
    public BigInteger criptografia(BigInteger mensagem) {
        return mensagem.modPow(expoenteCriptografia, modulo);
    }

    public BigInteger descriptografia(BigInteger mensagemCriptografada) {
        return mensagemCriptografada.modPow(expoenteDescriptografia, modulo);
    }
	
	public static void main(String[] args) {
		RSA rsa = new RSA(1024);

        // Mensagem a ser criptografada
        BigInteger message = new BigInteger("42");

        // Criptografar
        BigInteger encryptedMessage = rsa.criptografia(message);
        System.out.println("Mensagem Criptografada: " + encryptedMessage);

        // Descriptografar
        BigInteger decryptedMessage = rsa.descriptografia(encryptedMessage);
        System.out.println("Mensagem Descriptografada: " + decryptedMessage);
	}
}