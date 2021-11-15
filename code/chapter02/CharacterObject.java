/**
 * Character 使用
 */
public class CharacterObject {

    public static void main(String[] args) {
        Character characterValue = new Character('a');
        System.out.println(characterValue);

        characterValue = Character.valueOf('b');
        System.out.println(characterValue);
        
        characterValue = 'c';
        System.out.println(characterValue);

        char charValue = characterValue.charValue();
        System.out.println(charValue);
    }
}
