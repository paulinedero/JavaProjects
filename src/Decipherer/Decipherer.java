package Decipherer;

class Decipherer {

    public static int getKeyNumber(String message) {
        return message.length() / 2;
    }

    public static String getSubstringFromMessage (String message, int keyNumber) {
        return message.substring(5, 5+keyNumber);
    }

    public static String replaceSpecialCharacters (String message) {
        return message.replace("@", " ").replace("#", " ").replace("?", " ");
    }

    public static String reverseMessage (String message) {
        return new StringBuilder(message).reverse().toString();
    }

    public static String getFinalMessage (String message) {
        int keyNumber = getKeyNumber(message);
        String substring = getSubstringFromMessage(message, keyNumber);
        String replacedMessage = replaceSpecialCharacters(substring);

        return reverseMessage(replacedMessage);
    }

    public static void main(String[] args) {
        System.out.println(getFinalMessage("0@sn9sirppa@#?ia'jgtvryko1"));
        System.out.println(getFinalMessage("q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj"));
        System.out.println(getFinalMessage("aopi?sedohtém@#?sedhtmg+p9l!"));
    }
}
