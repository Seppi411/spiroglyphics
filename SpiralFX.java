
public class SpiralFX extends Application {

    // Parameter der Archimedischen Spirale
    private final double a = 0;       // Startpunkt-Verschiebung
    private final double b = 0.1;     // Wachstumsrate der Spirale
    private final double maxTheta = 12 * Math.PI;  // Maximale Winkelwert für die Spiralen
    private final int numPoints = 1000;  // Anzahl der Punkte in der Spirale

    @Override
    public void start(Stage primaryStage) {
        // Erstellen eines Canvas zur Zeichnung
        Canvas canvas = new Canvas(600, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Spiralen zeichnen
        drawSpirals(gc);

        // Szene und Fenster einrichten
        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root, 600, 600);
        primaryStage.setTitle("Archimedische Spiralen in JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawSpirals(GraphicsContext gc) {
        // Mitte des Canvas für die Platzierung der Spiralen
        double centerX = gc.getCanvas().getWidth() / 2;
        double centerY = gc.getCanvas().getHeight() / 2;

        // Setzen der Linienfarbe
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(1);

        // Berechnung und Zeichnen der Punkte für beide Spiralen
        double[] x1 = new double[numPoints];
        double[] y1 = new double[numPoints];
        double[] x2 = new double[numPoints];
        double[] y2 = new double[numPoints];

        // Berechnung der (x, y)-Punkte für beide Spiralen
        for (int i = 0; i < numPoints; i++) {
            // Berechne Winkel theta für diesen Punkt
            double theta = i * maxTheta / (numPoints - 1);

            // Berechne den Radius r
            double r = a + b * theta;

            // Erste Spirale (oben links)
            x1[i] = centerX + r * Math.cos(theta);
            y1[i] = centerY + r * Math.sin(theta);

            // Zweite Spirale (unten rechts), 180 Grad versetzt
            x2[i] = centerX + r * Math.cos(theta + Math.PI);
            y2[i] = centerY + r * Math.sin(theta + Math.PI);
        }

        // Zeichne die erste Spirale
        for (int i = 0; i < numPoints - 1; i++) {
            gc.strokeLine(x1[i], y1[i], x1[i + 1], y1[i + 1]);
        }

        // Zeichne die zweite Spirale (gestrichelt)
        gc.setLineDashes(5);  // Setzt gestrichelte Linie
        for (int i = 0; i < numPoints - 1; i++) {
            gc.strokeLine(x2[i], y2[i], x2[i + 1], y2[i + 1]);
        }
        gc.setLineDashes(null);  // Setzt zurück auf durchgezogene Linien
    }

    public static void main(String[] args) {
        launch(args);
    }
}
