import numpy as np
import matplotlib.pyplot as plt

# Parameter der Archimedischen Spirale
a = 0    # Startpunkt-Verschiebung
b = 0.1  # Wachstumsrate der Spirale
max_theta = 12 * np.pi  # Maximale Winkelwert für die Spiralen

# Winkelbereich (theta) für die Spiralen
theta = np.linspace(0, max_theta, 1000)

# Erste Spirale (nach oben links)
r1 = a + b * theta
x1 = r1 * np.cos(theta)
y1 = r1 * np.sin(theta)

# Zweite Spirale (nach unten rechts), um 180 Grad versetzt
r2 = a + b * theta
x2 = r2 * np.cos(theta + np.pi)  # Phasenverschiebung von π (180 Grad)
y2 = r2 * np.sin(theta + np.pi)

# Zeichnen der beiden Spiralen
plt.figure(figsize=(6, 6))
plt.plot(x1, y1, color='black', label='Spirale 1 (oben links)')
plt.plot(x2, y2, color='black', linestyle='--', label='Spirale 2 (unten rechts)')
plt.gca().set_aspect('equal', adjustable='box')
plt.axis('off')
plt.legend()
plt.show()



