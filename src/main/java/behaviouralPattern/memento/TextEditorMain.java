package behaviouralPattern.memento;

public class TextEditorMain {
    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();

        TextEditorOriginator textEditorOriginator = new TextEditorOriginator();

        textEditorOriginator.setContent("hello1");
        careTaker.saveState(textEditorOriginator);

        textEditorOriginator.setContent("hello2");
        careTaker.saveState(textEditorOriginator);

        careTaker.restoreState(textEditorOriginator);

    }
}
