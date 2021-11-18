package test;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import cipher.SymmetricCipher;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import util.Util;

public class SymmetricCipherTest01 {
    public static void main ( String[] args ) {
        SecretKey secretKey = null;
        long timeBeforeMili = System.currentTimeMillis();
        long timeBeforeNano = System.nanoTime();

        try {
            secretKey = KeyGenerator.getInstance("DES").generateKey();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        SymmetricCipher s = new SymmetricCipher( secretKey, "DES/ECB/PKCS5Padding" );

        String clearText = "Bienvenido a la criptografia!";

        byte[] cipherText = null;

        System.out.println( clearText );

        cipherText = s.encryptMessage( clearText );
        System.out.println( cipherText );

        Util.printByteArrayInt( cipherText );

        clearText = s.decryptMessage( cipherText );
        System.out.println( clearText );
        System.out.println( "Longitud: " + clearText.length() );

        /*
        char[] text = new char[300];
        for ( int i = 0; i < text.length; i++ ) {
            text[i] = 'a';
        }

        String clearText = new String( text );

        System.out.println( clearText );
        */

        long timeAfterMili = System.currentTimeMillis();
        long timeAfterNano = System.nanoTime();

        System.out.println("Tiempo transcurrido en milisegundos: " + ( timeAfterMili - timeBeforeMili ));
        System.out.println("Tiempo transcurrido en nanosegundos: " + ( timeAfterNano - timeBeforeNano ));
    }
}
