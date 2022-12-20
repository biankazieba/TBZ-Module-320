# K03

## Begriffe

- Exceptions: In Java ist eine Exception ein Fehler, der während der Ausführung eines Programms auftritt. Wenn eine Exception auftritt, versucht das Java-Runtime-System, eine Möglichkeit zu finden, um den Fehler zu behandeln.
  - Checked: Eine "checked" Exception ist eine Exception, die im Compilerzeitpunkt überprüft wird und die vom Programmierer behandelt werden muss.
  - Unchecked: Eine "unchecked" Exception wird während der Laufzeit des Programms ausgelöst und muss nicht vom Programmierer behandelt werden. Beide Typen von Exceptions können jedoch vom Programmierer behandelt werden, um das Programm stabil zu halten und mögliche Fehler zu vermeiden.

- Throws: Mit Throws wird bei einer Methode deklariert, dass ein try catch benötigt wird, weil es sonst einen Laufzeitfehler hat. Diese **muss** abgefangen werden, damit das Programm weiterläuft.
- Throw: Eine Exception während der Laufzeit werfen, falls beispielsweise ein Validierungsfehler besteht.

Beispiel für Throws & Throw:

```Java
    private int checkInput() throws MissmatchInputException { // Hier findet "throws" statt
            throw new MissmatchInputException("Input not found."); // Hier wird eine Exception geworfen
    }
```

- try-catch-finally: Eine Exception abfangen, um einen Laufzeitfehler (und somit einen Programmcrash) zu vermeiden. Finally wird dabei **immer** ausgeführt.
Beispiel:

```Java
public static void main(String[] args) {
  try {
    checkInput(); // Checkinput wird ausgeführt
  } catch(MissmatchInputException exception) {
    System.err.println(exception.getMessage()); // Die Exception wird abgefangen
  } finally {
    System.out.println("Das hier wird immer ausgegeben"); // Dabei wird immer finally ausgeführt.
  }
}
```
