package cipher;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class SymmetricCipher {
    private SecretKey secretKey;
    private Cipher cipher;

    public SymmetricCipher ( SecretKey secretKey, String transformation ) {
        this.secretKey = secretKey;

        try {
            cipher = Cipher.getInstance(transformation);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public byte[] encryptMessage ( String input ) {
        byte[] cipherText = null;
        byte[] clearText = input.getBytes();

        try {
            cipher.init( Cipher.ENCRYPT_MODE, secretKey );
            cipherText = cipher.doFinal(clearText);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return cipherText;
    }

    public String decryptMessage ( byte[] input ) {
        String output = "";

        try {
            cipher.init( Cipher.DECRYPT_MODE, secretKey );
            byte[] clearText = cipher.doFinal(input);
            output = new String(clearText);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return output;
    }

    public SecretKey getKey() {
        return secretKey;
    }
}
