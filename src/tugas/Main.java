package tugas;

public class Main {

    public static void main(String[] args) {
        Kingdom kingdom = new Kingdom();
        kingdom.setName("Clover");

        Squad squad = new Squad();
        squad.setName("Black Bulls");
        squad.setKingdom(kingdom);

        Magic magic = new Magic();
        magic.setName("Anti Magic");
        magic.setType("Demon Magic");
        
        Character character = new Character();
        character.setParentName("Lichita");
        character.setCharacterName("Asta");
        character.setPosition("Magic Knights");
        character.setMagic(magic);
        character.setSquad(squad);

        System.out.println(character.info());

        
    }
}
