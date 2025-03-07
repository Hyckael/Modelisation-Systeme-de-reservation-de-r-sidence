#                        COMMENTAIRE DIAGRAMME DE CLASS

Ce diagramme de classes propose une modélisation des principales entités du système de réservation de résidence, en s'appuyant sur les exigences du cahier des charges ; Nous avons identifié les classes suivantes :
Locataire, Gestionnaire, Element, Prestation, Materiel, Residence, Avis, Reservation.

Relation entre les classes :
1.	Locataire → Reservation : Un Locataire peut effectuer plusieurs Reservations (cardinalité 1...*).
2.	Reservation → Element : Une Reservation peut concerner un ou plusieurs Elements (cardinalité 1...*).
3.	Reservation → Prestation : Une Reservation peut inclure plusieurs Prestations (cardinalité 0...*).
4.	Reservation → Materiel : Une Reservation peut inclure plusieurs Materiels (cardinalité 0...*).
5.	Element → Residence : Un Element appartient à une Residence (cardinalité 1...1).
6.	Locataire → Avis : Un Locataire peut laisser un Avis après sa réservation (cardinalité 0...*).
7.	Gestionnaire → Residence : Un Gestionnaire peut gérer plusieurs Residences (cardinalité 1...*).

#                COMMENTAIRE DIAGRAMME DU CODE DES CLASSES GENEREES
Le code source généré à partir du diagramme de classes met en évidence les attributs et les méthodes de base (getters/setters) pour chaque classe. Les listes présentes dans certaines classes, comme Reservation, Residence, Locataire, et Gestionnaire, reflètent les relations de type "1 à plusieurs" définies dans le diagramme de classes.