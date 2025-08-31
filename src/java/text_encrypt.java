package nixstudios.chiper.nixcrypt;

import java.util.HashMap;

public class text_encrypt {
    private static final HashMap<Character, String> encryptMap = new HashMap<>();

    static {
        // Mapping NixCrypt v1.0
        encryptMap.put('a', "@");
        encryptMap.put('s', "#");
        encryptMap.put('h', "-");
        encryptMap.put('k', "(");
        encryptMap.put('u', "7");
        encryptMap.put('d', "$");
        encryptMap.put('e', "3");
        encryptMap.put('p', "0");
        encryptMap.put('r', "4");
        encryptMap.put('i', "8");
        encryptMap.put('o', "9");

        encryptMap.put('A', "A");
        encryptMap.put('B', ";");
        encryptMap.put('C', "'");
        encryptMap.put('D', "$");
        encryptMap.put('E', "3");
        encryptMap.put('F', "_");
        encryptMap.put('G', "&");
        encryptMap.put('H', "-");
        encryptMap.put('I', "8");
        encryptMap.put('J', "+");
        encryptMap.put('K', "(");
        encryptMap.put('L', ")");
        encryptMap.put('M', "?");
        encryptMap.put('N', "!");
        encryptMap.put('O', "9");
        encryptMap.put('P', "0");
        encryptMap.put('Q', "1");
        encryptMap.put('R', "4");
        encryptMap.put('S', "#");
        encryptMap.put('T', "5");
        encryptMap.put('U', "7");
        encryptMap.put('V', ":");
        encryptMap.put('W', "2");
        encryptMap.put('X', "\"");
        encryptMap.put('Y', "6");
        encryptMap.put('Z', "*");

        encryptMap.put('g', "&");
        encryptMap.put('t', "5");
    }

    public static String encrypt(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (encryptMap.containsKey(c)) {
                result.append(encryptMap.get(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}