# Software Development Glossary

Ein Glossar zu wichtigen Begriffen der Softwareentwicklung, insbesondere Methoden und Werkzeuge.

  - [B](#b)
      - [Branch](#branch)
  - [C](#c)
      - [Compile](#compile)
  - [D](#d)
      - [Dependency](#dependency)
  - [E](#e)
      - [Exclusion](#exclusion)
  - [G](#g)
      - [Git](#git)
          - [git init](#git-init)
          - [git status](#git-status)
          - [git add](#git-add)
          - [git commit](#git-commit)
          - [git push](#git-push)
          - [git log](#git-log)
          - [git reset](#git-reset)
              - [git reset --soft](#git-reset---soft)
              - [git reset --hard](#git-reset---hard)
          - [git revert](#git-revert)
          - [git reflog](#git-reflog)
          - [git merge](#git-merge)
          - [git branch](#git-branch)
          - [git checkout](#git-checkout)
          - [git switch](#git-switch)
          - [Repository](#repository)
          - [Staging-Bereich](#staging-bereich)
          - [Working Directory](#working-directory)
      - [Gradle](#gradle)
  - [M](#m)
      - [Maven](#maven)
  - [P](#p)
      - [Plugin](#plugin)
      - [POM-Datei (pom.xml)](#pom-datei-pomxml)
  - [R](#r)
  - [S](#s)
  - [V](#v)
      - [Version Control](#version-control)
  - [W](#w)


## B

### Branch

Ein **Branch** (deutsch: Zweig) ist eine separate Entwicklungslinie in einem Versionskontrollsystem. Er ermöglicht es, an neuen Funktionen oder Fehlerbehebungen zu arbeiten, ohne den Hauptentwicklungszweig (oft `main` oder `master` genannt) zu beeinflussen.

-----

## C

### Compile

Der **Compile**-Vorgang (Kompilierung) ist der Prozess, bei dem ein Compiler den von Menschen geschriebenen Quellcode (z. B. in Java oder C++) in Maschinencode übersetzt. Dieser Maschinencode kann dann direkt von einem Computerprozessor ausgeführt werden.

-----

## D

### Dependency

Eine **Dependency** (deutsch: Abhängigkeit) ist eine externe Bibliothek oder ein externes Softwarepaket, das ein Projekt benötigt, um zu funktionieren. Build-Management-Tools wie Maven oder Gradle verwalten diese Abhängigkeiten automatisch, indem sie die benötigten Bibliotheken herunterladen und in das Projekt einbinden.

-----

## E

### Exclusion

Eine **Exclusion** (deutsch: Ausschluss) wird in Build-Management-Tools verwendet, um eine *transitive Abhängigkeit* gezielt zu ignorieren. Wenn eine von dir genutzte Bibliothek (A) selbst eine andere Bibliothek (B) benötigt, wird B automatisch mitgeladen. Mit einem Ausschluss kannst du verhindern, dass B geladen wird, was z. B. bei Versionskonflikten nützlich ist.

-----

## G

### Git

**Git** ist ein verteiltes Versionskontrollsystem, das es Entwicklern ermöglicht, Änderungen am Quellcode über die Zeit zu verfolgen. Es ist das Standardwerkzeug für die Zusammenarbeit in Softwareprojekten, da es erlaubt, Änderungen zu protokollieren, frühere Versionen wiederherzustellen und die Arbeit mehrerer Personen effizient zusammenzuführen.

#### git init

Initialisiert ein neues, leeres Git-Repository im aktuellen Verzeichnis. Dabei wird ein versteckter `.git`-Ordner erstellt, der die gesamte Historie und Konfiguration des Projekts enthält.

#### git status

Zeigt den aktuellen Zustand des Arbeitsverzeichnisses und des Staging-Bereichs an. Man sieht, welche Dateien geändert, neu oder für den nächsten Commit vorgemerkt sind.

#### git add

```bash
git add <dateiname>
# Oder alle geänderten Dateien hinzufügen:
git add .
```

Fügt eine oder mehrere Dateien zum **Staging-Bereich** (Index) hinzu. Damit werden die Änderungen für den nächsten Commit vorgemerkt.

#### git commit

```bash
git commit -m "Eine aussagekräftige Commit-Nachricht"
```

Speichert die im Staging-Bereich vorgemerkten Änderungen dauerhaft im lokalen Repository. Die `-m`-Option erlaubt es, eine Beschreibung der Änderungen direkt mitzugeben.

#### git push

```bash
git push <remote-name> <branch-name>
# Beispiel:
git push origin main
```

Lädt die lokalen Commits zu einem entfernten Repository (z. B. auf GitHub oder GitLab) hoch und teilt die Änderungen so mit anderen.

#### git log

Zeigt die bisherige Commit-Historie an, einschließlich Autor, Datum und Commit-Nachricht.

#### git reset

Setzt den Zustand des Repositories auf einen früheren Commit zurück. Dieser Befehl kann die Commit-Historie verändern und sollte bei veröffentlichten Branches mit Vorsicht verwendet werden.

##### git reset --soft

```bash
git reset --soft HEAD~1
```

Setzt den letzten Commit zurück (`HEAD~1`), aber behält die Änderungen sowohl im Arbeitsverzeichnis als auch im Staging-Bereich. Nützlich, um einen Commit neu zu formulieren.

##### git reset --hard

```bash
git reset --hard HEAD~1
```

Setzt den letzten Commit zurück und **verwirft alle Änderungen** im Arbeitsverzeichnis und im Staging-Bereich. **Achtung:** Nicht gespeicherte Arbeit geht dabei verloren.

#### git revert

```bash
git revert <commit-hash>
```

Erstellt einen neuen Commit, der die Änderungen eines früheren Commits rückgängig macht. Im Gegensatz zu `git reset` wird die Projekthistorie nicht umgeschrieben, was diesen Befehl sicherer für die Anwendung auf öffentlichen Branches macht.

#### git reflog

Zeigt ein Protokoll aller Aktionen, die den `HEAD` (also die Spitze eines Branches) verändert haben, wie Commits, Resets oder Branch-Wechsel. Extrem nützlich, um "verloren gegangene" Commits wiederzufinden.

#### git merge

```bash
git merge <branch-name>
```

Fügt die Änderungen eines anderen Branches in den aktuell ausgecheckten Branch ein.

#### git branch

```bash
# Neuen Branch erstellen
git branch <neuer-branch-name>

# Alle lokalen Branches auflisten
git branch
```

Erstellt einen neuen Branch oder listet vorhandene Branches auf.

#### git checkout

```bash
git checkout <branch-name>
```

Wechselt zu einem anderen, bereits existierenden Branch. Dieser Befehl kann auch verwendet werden, um Dateien aus einem anderen Commit wiederherzustellen.

#### git switch

```bash
git switch <branch-name>
```

Ein modernerer und sichererer Befehl, um zwischen Branches zu wechseln. Er wurde eingeführt, um die Funktionalität von `git checkout` aufzuteilen und klarer zu gestalten.

#### Repository

Ein **Repository** (kurz: Repo) ist das Herzstück von Git. Es ist ein Verzeichnis, das den gesamten Quellcode des Projekts sowie die vollständige Änderungshistorie in Form von Commits enthält. Man unterscheidet zwischen dem **lokalen Repository** auf dem eigenen Rechner und dem **entfernten Repository** (Remote) auf einem Server.

#### Staging-Bereich

Der **Staging-Bereich** (auch Index genannt) ist eine Zwischenebene zwischen dem Arbeitsverzeichnis und dem lokalen Repository. Mit `git add` wählt man gezielt aus, welche Änderungen in den nächsten Commit aufgenommen werden sollen.

#### Working Directory

Das **Working Directory** (Arbeitsverzeichnis) ist der Ordner auf dem Dateisystem, der die aktuellen Projektdateien enthält, an denen aktiv gearbeitet wird.

-----

### Gradle

**Gradle** ist ein modernes Build-Automatisierungswerkzeug, das vor allem im Java-Ökosystem (insbesondere für Android) beliebt ist. Es verwendet eine flexible und programmierbare Skriptsprache (Groovy oder Kotlin), um den Build-Prozess zu definieren. Gradle ist bekannt für seine hohe Performance, z. B. durch Caching und inkrementelle Builds.

-----

## M

### Maven

**Maven** ist ein etabliertes und weit verbreitetes Werkzeug zur Automatisierung von Builds und zur Verwaltung von Projektabhängigkeiten in der Java-Welt. Es verfolgt den Ansatz "Konvention vor Konfiguration", indem es eine standardisierte Projektstruktur vorgibt. Die gesamte Konfiguration erfolgt in einer zentralen XML-Datei, der `pom.xml`.

-----

## P

### Plugin

Ein **Plugin** ist eine Erweiterung für ein Build-Tool wie Maven oder Gradle. Es fügt dem Build-Prozess spezifische Aufgaben (Tasks/Goals) hinzu. Beispiele sind Plugins zum Kompilieren von Code, Ausführen von Tests, Erstellen von Docker-Images oder zum Verpacken der Anwendung in eine ausführbare Datei.

### POM-Datei (pom.xml)

Die **POM-Datei** (`Project Object Model`) ist die zentrale Konfigurationsdatei für ein Maven-Projekt. In dieser XML-Datei werden unter anderem Projektinformationen, Abhängigkeiten (Dependencies), Plugins und Build-Ziele definiert.

-----

## R

-----

## S

-----

## V

### Version Control

**Versionskontrolle** (auch Versionsverwaltung genannt) ist ein System, das Änderungen an Dateien oder einem Projekt über die Zeit hinweg erfasst. Es ermöglicht Entwicklern:

  - Änderungen zu protokollieren und zu sehen, wer was wann geändert hat.
  - Zu früheren Versionen zurückzukehren.
  - Parallel an verschiedenen Funktionen in Branches zu arbeiten.
  - Die Arbeit von mehreren Personen koordiniert zusammenzuführen.
    Das mit Abstand populärste Werkzeug hierfür ist **[Git](https://www.google.com/search?q=%23git)**.

-----

## W