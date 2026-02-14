// This class represents one survey phrase and how many times it appeared.
// We will use the frequency to decide priority in the max heap.
public class WordFreq {

    String word;       // the actual phrase from the survey
    int frequency;     // how many times it showed up

    // Constructor: used to create a WordFreq object
    public WordFreq(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }

    // This helps when printing the object so it looks clean
    public String toString() {
        return "(" + word + ", " + frequency + ")";
    }
}
