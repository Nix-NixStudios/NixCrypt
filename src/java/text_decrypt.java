package nixstudios.chiper.nixcrypt;

import java.util.HashMap;

public class text_decrypt {
    private static final HashMap<String, Character> decryptMap = new HashMap<>();

    static {
        // Mapping kebalikan dari NixCrypt v1.0
        decryptMap.put("@", 'a');
        decryptMap.put("#", 's');
        decryptMap.put("-", 'h');
        decryptMap.put("(", 'k');
        decryptMap.put("7", 'u');
        decryptMap.put("$", 'd');
        decryptMap.put("3", 'e');
        decryptMap.put("0", 'p');
        decryptMap.put("4", 'r');
        decryptMap.put("8", 'i');
        decryptMap.put("9", 'o');

        decryptMap.put("A", 'A');
        decryptMap.put(";", 'B');
        decryptMap.put("'", 'C');
        decryptMap.put("$", 'D'); // note: sama dengan d kecil
        decryptMap.put("3", 'E'); // note: sama dengan e kecil
        decryptMap.put("_", 'F');
        decryptMap.put("&", 'G'); // note: sama dengan g kecil
        decryptMap.put("-", 'H'); // note: sama dengan h kecil
        decryptMap.put("8", 'I'); // note: sama dengan i kecil
        decryptMap.put("+", 'J');
        decryptMap.put("(", 'K'); // note: sama dengan k kecil
        decryptMap.put(")", 'L');
        decryptMap.put("?", 'M');
        decryptMap.put("!", 'N');
        decryptMap.put("9", 'O'); // note: sama dengan o kecil
        decryptMap.put("0", 'P'); // note: sama dengan p kecil
        decryptMap.put("1", 'Q');
        decryptMap.put("4", 'R'); // note: sama dengan r kecil
        decryptMap.put("#", 'S'); // note: sama dengan s kecil
        decryptMap.put("5", 'T'); // note: sama dengan t kecil
        decryptMap.put("7", 'U'); // note: sama dengan u kecil
        decryptMap.put(":", 'V');
        decryptMap.put("2", 'W');
        decryptMap.put("\"", 'X');
        decryptMap.put("6", 'Y');
        decryptMap.put("*", 'Z');

        decryptMap.put("&", 'g');
        decryptMap.put("5", 't');
    }

    public static String decrypt(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            String s = String.valueOf(c);
            if (decryptMap.containsKey(s)) {
                result.append(decryptMap.get(s));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}