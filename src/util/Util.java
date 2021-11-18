package util;

public class Util {
    public static String printByteArrayInt ( byte[] byteArray ) {
        return byteArrayIntToString( byteArray );
    }

    public static String byteArrayIntToString ( byte[] byteArray ) {
        String out = "";
        int i = 0;
        for (; i < byteArray.length - 1; i++) {
            out += byteArray[i] + 128 + " ";
        }
        out += byteArray[i] + 128;

        return out;
    }
}
