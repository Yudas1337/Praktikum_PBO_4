package tugas;

public class Kingdom {

    private String name;

    private String getName(){
        return this.name;
    }

    public String setName(String name){
        return this.name = name;
    }

    public String info()
    {
        String info = "";
        info += "Kingdom name : " + this.getName();
        return info;
    }

}
