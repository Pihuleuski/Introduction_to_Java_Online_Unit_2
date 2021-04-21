package by.epam.gomel.onlinetrening.array;

public class Parametr {
    private int numberOfPositiveElements;
    private int numberOfNegativeElements;
    private int numberOfNullElements;

    public Parametr(int numberOfPositiveElements, int numberOfNegativeElements, int numberOfNullElements) {
        this.numberOfPositiveElements = numberOfPositiveElements;
        this.numberOfNegativeElements = numberOfNegativeElements;
        this.numberOfNullElements = numberOfNullElements;
    }

    public int getNumberOfPositiveElements() {
        return numberOfPositiveElements;
    }

    public int getNumberOfNegativeElements() {
        return numberOfNegativeElements;
    }

    public int getNumberOfNullElements() {
        return numberOfNullElements;
    }

    @Override
    public String toString() {
        return "Parametr{" +
                "numberOfPositiveElements=" + numberOfPositiveElements +
                ", numberOfNegativeElements=" + numberOfNegativeElements +
                ", numberOfNullElements=" + numberOfNullElements +
                '}';
    }
}
