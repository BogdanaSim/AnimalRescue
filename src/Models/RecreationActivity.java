package Models;

public class RecreationActivity {
    private String name;

    public RecreationActivity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
