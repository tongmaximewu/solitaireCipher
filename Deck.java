package assignment2;

public class SolitaireCipher {
    public Deck key;

    public SolitaireCipher (Deck key) {
        this.key = new Deck(key); // deep copy of the deck
    }

    /*
     * TODO: Generates a keystream of the given size
     */
    public int[] getKeystream(int size) {
        /**** ADD CODE HERE ****/
        int[] keystream = new int[size];
        for(int i = 0; i <size; i++){

            keystream[i] = key.generateNextKeystreamValue();
        }
        return keystream;
    }

    /*
     * TODO: Encodes the input message using the algorithm described in the pdf.
     */
    public String encode(String msg) {
        /**** ADD CODE HERE ****/
        //put msg to all CAPS
        msg = msg.replaceAll("[^a-zA-Z]", "").toUpperCase();
        int[] keyStream = getKeystream(msg.length());
        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < msg.length(); i++) {
            int charValue = msg.charAt(i) - 'A' + 1;
            int encodedValue = (charValue + keyStream[i]) % 26;
            if (encodedValue == 0) encodedValue = 26;
            char encodedChar = (char) (encodedValue + 'A' - 1);
            encoded.append(encodedChar);
        }
        return encoded.toString();
    }

    /*
     * TODO: Decodes the input message using the algorithm described in the pdf.
     */
    public String decode(String msg) {
        /**** ADD CODE HERE ****/
        int[] keyStream = getKeystream(msg.length());
        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < msg.length(); i++) {
            int charValue = msg.charAt(i) - 'A' + 1;
            int decodedValue = charValue - keyStream[i];
            if (decodedValue <= 0) decodedValue += 26;
            char decodedChar = (char) (decodedValue + 'A' - 1);
            decoded.append(decodedChar);
        }
        return decoded.toString();
    }

}
