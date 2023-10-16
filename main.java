public class main {
    public static void main(String[] args) {
        // Bitte lese dir die READ.me durch!

        // Testbeispiele
        char[] test1 = "2BHIT".toCharArray();
        printStringToLower(test1);

        char[] test2 = "Aufgabe".toCharArray();
        printStringToLower(test2);
    }

    /* Funktion:
    1. Übergabe des Char-Arrays.
    2. For-Schleife mit der gleichen Länge/Größe des Arrays, die jeden Eintrag im Array durchgeht.
    3. Die IF-Abfrage filtert Großbuchstaben heraus. Sollte es sich um einen Kleinbuchstaben, ein
       Sonderzeichen oder eine Zahl handeln, wird es direkt ausgegeben. Großbuchstaben werden mithilfe
       der toLowerCase-Methode zu Kleinbuchstaben umgewandelt und in der Konsole ausgegeben.
    4. Zum Schluss wird für die Übersicht ein Zeilenumbruch eingefügt.
     */
    public static void printStringToLower(char[] string) {
        for (int i = 0; i < string.length; i++) {
            if (string[i] >= 'A' && string[i] <= 'Z') {
                string[i] = Character.toLowerCase(string[i]);
            }
            System.out.print(string[i]);
        }
        System.out.println();
    }
}
