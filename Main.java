public class Main {

    // Prints the array with index numbers so we can see the order clearly
    static void printArray(WordFreq[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ": " + arr[i]);
        }
    }

    public static void main(String[] args) {

        // Survey data
        WordFreq[] arr = new WordFreq[] {
            new WordFreq("happy", 400),
            new WordFreq("satisfied", 100),
            new WordFreq("neutral", 300),
            new WordFreq("would buy again", 200),
            new WordFreq("terrible", 160),
            new WordFreq("inconvenient", 900),
            new WordFreq("difficult to use", 100),
            new WordFreq("easy to use", 140),
            new WordFreq("would recommend to friends", 800),
            new WordFreq("visit the store", 700)
        };

        System.out.println("Original array order:");
        printArray(arr);

        // Next step: build the max heap
    }
}
