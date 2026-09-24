package behaviouralPattern.memento;

public class TextEditorOriginator {
    String content;

    public TextEditorOriginator() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public TextEditorMemento save() {
        return new TextEditorMemento(content);
    }

    public void restore(TextEditorMemento memento) {
        this.content = memento.content();
    }
}
