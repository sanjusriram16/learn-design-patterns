package behaviouralPattern.templatePattern;

abstract class DataParser {
    public final void parseDataAndGenerateOutput() {
        readData();
        processData();
        writeData();
    }

    private void readData() {
        System.out.println("Reading data from source");
    }

    private void writeData() {
        System.out.println("Writing data to output");
    }

    abstract void processData();
}

class CSVDataParser extends DataParser {
    @Override
    void processData() {
        System.out.println("Processing CSV data");
    }
}

class XMLDataParser extends DataParser {
    @Override
    void processData() {
        System.out.println("Processing XML data");
    }
}

public class Main {
    public static void main(String[] args) {
        DataParser csvParser = new CSVDataParser();
        csvParser.parseDataAndGenerateOutput();

        System.out.println();

        DataParser xmlParser = new XMLDataParser();
        xmlParser.parseDataAndGenerateOutput();
    }
}
