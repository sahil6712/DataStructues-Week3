package stringbuffer.concatenatestrings;

public class StringConcatination {

    // Method to concatenate the strings in the array
    public static String concatenateStrings(String[] strings) {
        StringBuffer sb = new StringBuffer();

        // iterate the array of strings
        for(int i=0; i<strings.length; i++) {

            sb.append(strings[i]);

            if( i < strings.length-1) {
                sb.append(' ');
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        // Array of Strings
        String[] strings = {"always","be","positive"};

        // Call method to concatenate the array of strings
        String concatencatedString = concatenateStrings(strings);

        // Output
        System.out.println("The concatenated string is: "+concatencatedString);
    }
}
