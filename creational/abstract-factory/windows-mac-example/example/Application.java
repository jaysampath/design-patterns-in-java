package example;

public class Application {
    private GUIFactory factory;
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        if (this.factory != null) {
            button = factory.createButton();
            checkBox = factory.createCheckBox();
        }
    }

    public void onClick() {
        button.onClick();
    }

    public void onCheck() {
        checkBox.onCheck();
    }
}
