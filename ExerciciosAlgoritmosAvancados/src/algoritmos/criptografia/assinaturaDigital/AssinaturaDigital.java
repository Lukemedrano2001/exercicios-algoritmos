package algoritmos.criptografia.assinaturaDigital;

import java.security.*;

public class AssinaturaDigital {
    public static void main(String[] args) {
        try {
            // Gera um par de chaves p�blica/privada
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
            keyGen.initialize(2048);
            KeyPair keyPair = keyGen.generateKeyPair();

            PrivateKey privateKey = keyPair.getPrivate();

            // Assina a mensagem
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(privateKey);
            String mensagem = "Esta � uma mensagem para assinar.";
            signature.update(mensagem.getBytes());
            byte[] assinatura = signature.sign();

            // Verifica a assinatura
            Signature verification = Signature.getInstance("SHA256withRSA");
            verification.initVerify(keyPair.getPublic());
            verification.update(mensagem.getBytes());

            if (verification.verify(assinatura)) {
                System.out.println("Assinatura v�lida.");
            } else {
                System.out.println("Assinatura inv�lida.");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
