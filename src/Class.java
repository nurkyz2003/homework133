public class Class {
    private int number;
    private String word;
    private int[] array;
    public Class(int number, String word, int[] array){
        this.number = number;
        this.word = word;
        this.array = array;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getNumber() {
        return number;
    }

    public String getWord() {
        return word;
    }

    public int[] getArray() {
        return array;
    }
}
