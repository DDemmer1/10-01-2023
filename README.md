# 10-01-2023
WS22 - Interfaces, Vererbung

### 📝 Aufgabe:
- Implementiert eine Klasse ```Item```  mit den Attributen ```int id```, ```float price``` und ```String name``` und einem Konstruktor der alle Attribute abdeckt.
- Außerdem soll die Klasse eine Methode ```public String toString()``` haben, die beim Aufruf alle Werte als ```String``` zurückgibt.<br>
Bsp.: "Item: id=2, price=249.99, name=Monitor"

------------------------------

- Erzeugt 5 ```Item``` Objekte in der ```main-methode```
- Erstellt ein ```Item```-Array und füllt dieses mit den 5 ```Item``` Objekten

------------------------------

In Java gibt das schon fertige ```interface Comparable``` mit der Methode ```public int compareTo(Item otherItem)```
- Folgendes sollte die Methode zurückgeben:
 - Einen POSITIVEN ```int``` wenn das Objekt von dem aus die Methode ausgeführt wurde GRÖSSER sein soll
 - Einen NEGATIVEN ```int``` wenn das Objekt von dem aus die Methode ausgeführt wurde KLEINER sein soll
 - Eine 0  wenn die Objekte gleich sein sollen

Versucht das Interface in die Item Klasse zu implementieren und anhand der ```int id``` die ```compareTo``

  ### ℹ️ Resourcen:
Hier noch ein paar nützliche 📃Artikel, 🖊️Threads und 🎥Videos

- [ 🎥 GitHub Projekte in Eclipse importieren](https://drive.google.com/file/d/1IpwHADmwViEGQ7Pf4BgybUYpz7WBoMe5/view?usp=sharing)
