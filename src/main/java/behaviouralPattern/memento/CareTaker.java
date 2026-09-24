package behaviouralPattern.memento;

import java.util.Stack;

public class CareTaker {
    private Stack<TextEditorMemento> history = new Stack<>();

    public void saveState(TextEditorOriginator textEditor) {
        history.push(textEditor.save());
    }

    public void restoreState(TextEditorOriginator textEditor) {
        history.pop();
        textEditor.restore(history.peek());
    }
}
