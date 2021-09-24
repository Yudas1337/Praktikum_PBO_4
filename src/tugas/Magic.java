package tugas;

public class Magic {

    private String name;
    private String type;

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String info()
    {
        String info = "";
        info += "Magic name : " + this.getName() + "\n";
        info += "Magic type : " + this.getType() + "\n";
        return info;
    }

}
