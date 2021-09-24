package tugas;

public class Character extends Parent {

    private String name, position;
    private Magic magic;
    private Squad squad;

    private String getCharacterName() {
        return name;
    }

    public String setCharacterName(String name) {
        return this.name = name;
    }

    private String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setMagic(Magic magic) {
        this.magic = magic;
    }

    public void setSquad(Squad squad) {
        this.squad = squad;
    }

    public String info()
    {
        System.out.println(super.info());
        String info = "";
        info += "Character name : " + this.getCharacterName() + "\n";
        info += "Character position : " + this.getPosition() + "\n";
        System.out.print(magic.info());
        System.out.print(squad.info());
        return info;
    }

}
