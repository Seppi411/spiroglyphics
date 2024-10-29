// Eine öffentliche Klasse, die von überall im Projekt und anderen Projekten zugänglich ist
public class PublicClass
{
    // Ein öffentliches Feld, das von überall zugänglich ist
    public int PublicField;

    // Ein privates Feld, das nur innerhalb dieser Klasse zugänglich ist
    private int PrivateField;

    // Ein geschütztes Feld, das in dieser Klasse und abgeleiteten Klassen zugänglich ist
    protected int ProtectedField;

    // Ein internes Feld, das nur innerhalb desselben Projekts zugänglich ist
    internal int InternalField;

    // Ein geschütztes internes Feld, das in derselben Assembly oder in abgeleiteten Klassen zugänglich ist
    protected internal int ProtectedInternalField;

    // Ein privates geschütztes Feld, das nur in dieser Klasse oder in abgeleiteten Klassen innerhalb derselben Assembly zugänglich ist
    public static void Main(string[] args)
    {
        // Beispiel für die Erstellung einer Instanz der PublicClass
        PublicClass publicClassInstance = new PublicClass();
        publicClassInstance.PublicField = 10;

        // Beispiel für die Erstellung einer Instanz der SealedClass
        SealedClass sealedClassInstance = new SealedClass();
        sealedClassInstance.ExampleMethod();

        // Hinweis: Instanzen von AbstractClass können nicht direkt erstellt werden
        // AbstractClass abstractClassInstance = new AbstractClass();

        // Beispiel für die Erstellung einer Instanz der PrivateClass
        PrivateClass privateClassInstance = new PrivateClass();
        privateClassInstance.ExampleMethod();
    }
    private protected int PrivateProtectedField;
}

// Eine private Klasse, die nur innerhalb derselben Datei zugänglich ist
// Hinweis: In C# können Klassen nicht direkt als private deklariert werden, aber sie können in einer anderen Klasse oder Struktur als private deklariert werden
class PrivateClass
{
    // Ein Beispiel für eine Methode in einer privaten Klasse
    public void ExampleMethod()
    {
        // Implementierung
    }
}

// Eine abstrakte Klasse, die nicht instanziiert werden kann und von der geerbt werden muss
public abstract class AbstractClass
{
    // Eine abstrakte Methode, die in abgeleiteten Klassen implementiert werden muss
    public abstract void AbstractMethod();
}

// Eine versiegelte Klasse, die nicht vererbt werden kann
public sealed class SealedClass
{
    // Ein Beispiel für eine Methode in einer versiegelten Klasse
    public void ExampleMethod()
    {
        // Implementierung
    }
}