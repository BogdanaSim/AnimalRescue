package Models;

public class RecreationActivity {
    public String name;

    public RecreationActivity() {
    }

    public RecreationActivity(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RecreationActivity{" +
                "name='" + name + '\'' +
                '}';
    }
}
