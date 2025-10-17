# Aufgabe: Vorlesungsstundenrechner

## Kontext

Ihr sollt eine Konmandozeilenanwendung in Java 25 implementieren, die Zeitstunden in Vorlesungsstunden unrechnet. Dabei gilt:
- Eine Vorlesungsstunde dauert 45 Minuten.
- Nach 2 Vorlesungsstunden muss eine 15-minütige Pause eingeplant werden, wenn mindestens eine weitere Vorlesungsstunde folgt.
- Wenn keine weiteren Vorlesungsstunden nach den ersten zwei Stunden stattfinden, wird keine Pause ausgegeben.
- Für einen gegebenen Zeitraum sellen die Vorlesungsstunden und Pausen berechnet, werden.

### Beispiel:
Eingabe: 09:00 bis 13:15
Ergebnis: 5 Vorlesungsstunden, 2 Pausen (à 15 Minuten)

## Testfälle
1. *Exakte Anzahl an Vorlesungsstunden ohne Pausen**
- **Input:** Startzeit: 09:00, Endzeit: 10:30
- **Erwartetes Ergebnis:** 2 Vorlesungsstunden, 0 Pausen

2. **Zeitraum nit 2 Vorlesungsstunden ohne zusätzliche Vorlesungsstunden danach**
- **Input:** Startzeit: 09:00, Endzeit: 10:30
- **Erwartetes Ergebnis:** 2 Vorlesungsstunden, ® Pausen (da keine weitere Verlesung folgt)

3. **Zeitraum mit mehr als 2 Vorlesungsstunden und einer Pause**
- **Input:** Startzeit: 09:00, Endzeit: 12:00
- **Erwartetes Ergebnis:** 4 Vorlesungsstunden, 1 Pause (15 Minuten )

4. **Zeitraum mit 5 Vorlesungsstunden und 2 Pausen**
- **Input:** Startzeit: 09:00, Endzeit: 13:15
- **Erwartetes Ergebnis:** 5 Vorlesungsstunden, 2 Pausen (je 15 Minuten)

5. **Zeitraum ohne Vorlesungsstunden (weniger als 45 Minuten)**
- **Input:** Startzeit: 09:00, Endzeit: 89:30
- **Erwartetes Ergebnis:** 0 Vorlesungsstunden, 0 Pausen

6. **Zeitraum nit 3 Vorlesungsstunden**
- **Input:** Startzeit: 09:00, Endzeit: 11:15
- **Erwartetes Ergebnis:** 3 Vorlesungsstunden, 1 Pause (15 Minuten)

7. **Zeitraum nit 2 Vorlesungsstunden und keine Pause erforderlich**
- **Input:** Startzeit: 09:00, Endzeit: 10:30
- **Erwartetes Ergebnis:** 2 Vorlesungsstunden, 0 Pausen