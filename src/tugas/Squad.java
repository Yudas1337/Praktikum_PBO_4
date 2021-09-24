package tugas;

public class Squad {

    private String name;
    private Kingdom kingdom;

    private String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public void setKingdom(Kingdom kingdom) {
        this.kingdom = kingdom;
    }

    public String info()
    {
        String info = "";
        info += "Squad name : " + this.getName() + "\n";
        System.out.println(kingdom.info());
        return info;
    }
    

}
