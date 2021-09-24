package tugas;

public class Parent {

    private String name;

    public String setParentName(String name){
        return this.name = name;
    }

    private String getName(){
        return this.name;
    }

    public String info(){
        String info = "";
        info += "Parent name : " + this.getName();
        return info;
    }

}
