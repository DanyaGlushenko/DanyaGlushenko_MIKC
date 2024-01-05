package main;

public abstract class Command {
    public Editor editor;

    Command(Editor editor) {
        this.editor = editor;
    }


    public void execute() {
        editor.textField.append(this.getClass().toString()+" detected\n");
    }
}
