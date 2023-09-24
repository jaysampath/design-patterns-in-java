package example;

public class FactoryConfiguration {
    public static void main(String[] args) {
        GUIFactory factory = null;
        String os = getOSInfo();

        if (os.equals("WINDOWS")) {
            factory = new WinFactory();
        } else if (os.equals("MAC")) {
            factory = new MacFactory();
        }

        Application application = new Application(factory);
        application.createUI();
    }

    private static String getOSInfo() {
        return "";
    }
}
