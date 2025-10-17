# 🚀 Git-Übung: Praktische Prüfung der Git-Kenntnisse

## Aufgabenstellung für Studierende

**Liebe Studierende,**

Diese Übung prüft Ihre praktischen Git-Kenntnisse. Sie arbeiten ausschließlich in der **Kommandozeile/Terminal** 💻 und dokumentieren jeden Schritt durch Screenshots.

---

## **Ihre Aufgabe: Ein persönliches Projekt-Repository erstellen**

Sie sollen ein Git-Repository für ein fiktives "Studienplaner"-Projekt anlegen und verschiedene Entwicklungsschritte simulieren.

### **Teil 1: Repository-Grundlagen (20 Punkte)**

**Szenario:** Sie starten ein neues Projekt für einen digitalen Studienplaner.

**Ihre Schritte:**
1.  📂 Erstellen Sie einen Ordner `studienplaner-[IhrNachname]` auf Ihrem Desktop.
2.  Navigieren Sie in diesen Ordner.
3.  Initialisieren Sie ein Git-Repository.
4.  Konfigurieren Sie Git mit Ihrem Namen und Ihrer E-Mail-Adresse.
5.  ✍️ Erstellen Sie eine Datei `projekt-info.md` mit folgendem Inhalt:
    ```
    # Studienplaner-Projekt
    
    **Ersteller:** [Ihr vollständiger Name]
    **E-Mail:** [Ihre E-Mail] 
    **Startdatum:** 04.10.2025
    **Projektbeschreibung:** Digitaler Planer für das Studium
    ```
6.  Fügen Sie die Datei zur Versionskontrolle hinzu.
7.  Erstellen Sie Ihren ersten Commit mit der Nachricht "Projektstart: Grundinformationen hinzugefügt".

**📸 Abgabe:** Screenshot nach jedem Terminal-Befehl + finaler Screenshot der `git log --oneline --graph --all` Ausgabe.

---

### **Teil 2: Funktionen entwickeln (20 Punkte)**

**Szenario:** Sie entwickeln die ersten Funktionen Ihres Studienplaners.

**Ihre Schritte:**
1.  ✨ Erstellen Sie eine Datei `module.txt` und listen Sie 5 Module Ihres aktuellen Semesters auf.
2.  ✍️ Bearbeiten Sie die `projekt-info.md` und fügen Sie eine neue Zeile hinzu: `Status: In Entwicklung`.
3.  Prüfen Sie den aktuellen Status Ihres Repositories.
4.  Fügen Sie **nur** die geänderte `projekt-info.md` zur Staging Area hinzu.
5.  Erstellen Sie einen Commit mit der Nachricht "Status-Update: Projekt in Entwicklung".
6.  Fügen Sie nun die `module.txt` zur Staging Area hinzu und committen Sie mit "Feature: Modulliste hinzugefügt".
7.  Zeigen Sie die gesamte Commit-Historie an.

**📸 Abgabe:** Screenshots der `git status` Ausgaben nach Schritt 3 + finaler Screenshot der `git log --oneline --graph --all` Ausgabe.

---

### **Teil 3: Fehlerkorrektur und Rückgängigmachen (20 Punkte)**

**Szenario:** Sie haben einen Fehler gemacht und müssen Änderungen rückgängig machen.

**Ihre Schritte:**
1.  ✍️ Fügen Sie eine 6. Zeile zu `module.txt` hinzu: "Zusatzmodul XYZ".
2.  Fügen Sie diese Änderung zur Staging Area hinzu.
3.  🛑 **STOPP!** Sie merken, das Zusatzmodul ist falsch. Entfernen Sie die Datei aus der Staging Area mit `git reset HEAD module.txt`.
4.  Prüfen Sie den Repository-Status.
5.  🔧 Machen Sie die Änderung in der Datei komplett rückgängig mit `git checkout -- module.txt`.
6.  Erstellen Sie nun eine andere Änderung: Fügen Sie zu `projekt-info.md` eine Zeile hinzu: "Version: 0.1".
7.  Committen Sie diese Änderung.
8.  🤔 **Ups, falscher Commit!** Machen Sie den letzten Commit rückgängig mit `git reset --soft HEAD~1`.

    > 💡 **Info:** Wir nutzen `--soft`, damit nur der Commit entfernt wird, Ihre Änderungen aber erhalten bleiben. `--mixed` (der Standard) würde die Änderungen nur ins Arbeitsverzeichnis verschieben und `--hard` würde sie komplett und endgültig löschen!

**📸 Abgabe:** Screenshots nach den Schritten 3, 4, 5 und 8, um die Reset-Operationen zu dokumentieren.

---

### **Teil 4: Teamarbeit simulieren (20 Punkte)**

**Szenario:** Sie arbeiten an einem neuen Feature in einem separaten Branch.

**Ihre Schritte:**
1.  🌱 Erstellen Sie einen neuen Branch namens `kalender-feature`.
2.  Wechseln Sie zu diesem Branch.
3.  Erstellen Sie eine Datei `kalender.txt` mit folgendem Inhalt:
    ```
    Kalender-Feature für Studienplaner:
    - Terminverwaltung
    - Erinnerungen
    - Prüfungsdaten
    ```
4.  Committen Sie diese neue Datei mit "Feature: Kalender-Grundfunktionen".
5.  Wechseln Sie zurück zum Haupt-Branch (`main`).
6.  ✍️ Bearbeiten Sie `projekt-info.md` und ändern Sie den Status auf "Status: Feature-Entwicklung".
7.  Committen Sie diese Änderung.
8.  🤝 Führen Sie den `kalender-feature` Branch in den Haupt-Branch zusammen.
9.  🗑️ Löschen Sie den `kalender-feature` Branch.
10. Zeigen Sie die finale Commit-Historie mit Verzweigungsdarstellung an.

**📸 Abgabe:** Screenshots der Branch-Wechsel und des Merges + finaler Screenshot der `git log --oneline --graph --all` Ausgabe.

---

### **Teil 5: Dateien ignorieren (20 Punkte)**

**Szenario:** Sie möchten bestimmte Dateien und Ordner von der Versionskontrolle ausschließen.

**Ihre Schritte:**
1.  🙈 Erstellen Sie eine `.gitignore` Datei im Hauptverzeichnis.
2.  Fügen Sie Regeln hinzu, um folgende Elemente zu ignorieren:
    * Alle `.backup` Dateien
    * Den Ordner `temp/`
    * Die Datei `debug.log`
3.  Erstellen Sie zu Testzwecken eine Datei `notizen.backup` und einen Ordner `temp`.
4.  Prüfen Sie mit `git status`, ob die neuen Elemente korrekt ignoriert werden.
5.  Fügen Sie die `.gitignore` Datei zur Staging Area hinzu.
6.  Committen Sie die `.gitignore` mit der Nachricht "Feat: .gitignore für Projektdateien hinzugefügt".

**📸 Abgabe:** Screenshots, die den Inhalt der `.gitignore` zeigen, die `git status` Ausgabe nach Schritt 4 und die finale `git log --oneline --graph --all` Ausgabe.

---

## **Abgabe-Details**

**Deadline:** [Datum einsetzen]
**Abgabe über:** Miro-Board in Ihrem persönlichen Kanal
**Screenshot-Benennung:** `Git-Teil[X]-Schritt[Y]-[IhrNachname].png`

**Wichtige Hinweise:**
-   Arbeiten Sie ausschließlich in der Kommandozeile (Terminal/Git Bash).
-   Jeder Screenshot muss die verwendeten Befehle UND deren Ausgabe zeigen.
-   Der Befehl zur Anzeige der Commit-Historie lautet einheitlich: `git log --oneline --graph --all`.
-   Screenshots müssen chronologisch und lesbar hochgeladen werden.

**Bei Problemen:** Melden Sie sich sofort, falls Git-Befehle nicht funktionieren 🆘.

---

## **Was wird bewertet:**

✅ **Korrekte Git-Befehle** (sichtbar in Screenshots)
✅ **Richtige Terminal-Ausgaben** (Repository-Status, Logs)
✅ **Vollständige Dokumentation** (alle geforderten Screenshots)
✅ **Saubere Commit-Historie** (aussagekräftige Commit-Nachrichten)

Viel Erfolg bei der Übung! 🎉