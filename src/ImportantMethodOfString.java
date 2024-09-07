public class ImportantMethodOfString {
    public static void main(String[] args) {
        String input = "Ramesh Sharma";
        // to get the length of String
        int length = input.length();
        // getting character form String by using char charAt(int index)
        char firstChar = input.charAt(0);
        // getting index of character from String, int indexOf(int character)
        // will return the  first occurred index if the character is present in the String
        // or else will return -1
        int indexOfCharA = input.indexOf('a');
        int indexOfCharZ = input.indexOf('z');
        // variation of indexOf
        int indexOfCharFromGivenIndex = input.indexOf('a', 2);
        System.out.println("indexOfCharA = " + indexOfCharA);
        System.out.println("indexOfCharFromGivenIndex = " + indexOfCharFromGivenIndex);
        int indexOfMA = input.indexOf("sharma");
        System.out.println("indexOfMA = " + indexOfMA);

        // changing case of String
        // toUpperCase, toLowerCase
        String inputUpperCase = input.toUpperCase();
        String inputLowerCase = input.toLowerCase();

        System.out.println("inputLowerCase = " + inputLowerCase);
        System.out.println("inputUpperCase = " + inputUpperCase);
        System.out.println("input = " + input);

        // to check equality of String
        // boolean equals(Object anotherString), will check for equality of contents
        String value1 = new String("Ramesh Sharma");
        if(value1.equals(input)){
            System.out.println("Same same");
        }else{
            System.out.println("different");
        }

        if(inputLowerCase.equalsIgnoreCase(inputUpperCase)){
            System.out.println("Equals");
        }else{
            System.out.println("not equals");
        }


    }
}
