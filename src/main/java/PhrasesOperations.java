public final class PhrasesOperations {

    public static String dancingPhrase(String phrase){

        int index = phrase.indexOf(' ');
        if(index > 0) {
            return Character.toUpperCase(phrase.charAt(0)) + phrase.substring(1, index) + " " + dancingPhrase(phrase.substring(index + 1));
        }
        else{
            return Character.toUpperCase(phrase.charAt(0)) + phrase.substring(1);
        }

    }
}
