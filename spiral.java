public class SpiralCalculation {

    public static void main(String[] args) {
        // Parameter der Archimedischen Spirale
        double a = 0; // Startpunktverschiebung, kontrolliert die Entfernung vom Ursprung
        double b = 0.1; // Wachstumsrate der Spirale, bestimmt wie schnell die Spirale sich vom Zentrum ausdehnt
        double maxTheta = 12 * Math.PI; // Der maximale Winkel für die Spiralen (12 volle Umdrehungen)

        int numPoints = 1000; // Anzahl der Punkte zur Berechnung der Spirale (je mehr Punkte, desto glatter die Spirale)

        // Arrays zur Speicherung der berechneten (x, y)-Koordinaten für die erste und zweite Spirale
        double[] x1 = new double[numPoints]; // x-Koordinaten für Spirale 1
        double[] y1 = new double[numPoints]; // y-Koordinaten für Spirale 1
        double[] x2 = new double[numPoints]; // x-Koordinaten für Spirale 2 (um 180 Grad versetzt)
        double[] y2 = new double[numPoints]; // y-Koordinaten für Spirale 2

        // Berechnung der (x, y)-Punkte für beide Spiralen
        for (int i = 0; i < numPoints; i++) {
            // Bestimmen des aktuellen Winkels "theta" für diesen Punkt
            // theta wird gleichmäßig von 0 bis maxTheta verteilt
            double theta = i * maxTheta / (numPoints - 1);

            // Berechnen des Radius r basierend auf der Formel r = a + b * theta
            // Dies ist der Abstand vom Ursprung für jeden Punkt
            double r = a + b * theta;

            // Erste Spirale (oben links) - Berechnung der x- und y-Koordinaten
            // Der Punkt (x1[i], y1[i]) wird auf dem Kreis mit Radius r und Winkel theta platziert
            x1[i] = r * Math.cos(theta); // x-Koordinate mit Hilfe des Cosinus
            y1[i] = r * Math.sin(theta); // y-Koordinate mit Hilfe des Sinus

            // Zweite Spirale (unten rechts), um 180 Grad versetzt
            // Hier wird eine Phasenverschiebung von π (180 Grad) hinzugefügt, um die Spirale zu spiegeln
            x2[i] = r * Math.cos(theta + Math.PI); // x-Koordinate, 180 Grad gedreht
            y2[i] = r * Math.sin(theta + Math.PI); // y-Koordinate, 180 Grad gedreht
        }

        // Ausgabe der berechneten Koordinaten für jede Spirale
        System.out.println("Spirale 1 (oben links) Koordinaten:");
        for (int i = 0; i < numPoints; i++) {
            System.out.printf("Punkt %d: (%.2f, %.2f)%n", i, x1[i], y1[i]);
        }

        System.out.println("\nSpirale 2 (unten rechts) Koordinaten:");
        for (int i = 0; i < numPoints; i++) {
            System.out.printf("Punkt %d: (%.2f, %.2f)%n", i, x2[i], y2[i]);
        }
    }
}
