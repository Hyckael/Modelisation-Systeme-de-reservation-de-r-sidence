#                DESCRIPTION TEXTUELLE DES DIAGRAMMES DE SEQUENCE

Les diagrammes de séquence décrivent les interactions entre les acteurs (comme le Locataire ou le Gestionnaire) et le Système de Réservation pour chaque cas d'utilisation.
Préconditions générales : Le locataire et le gestionnaire doivent avoir un compte et être connectés avant toutes actions.
Voici une description des scénarios nominaux, alternatifs et d'exception pour chaque diagramme :
1. Ajouter un élément de résidence
•	Scénario nominal :
1.	Le Gestionnaire accède à l'interface de gestion des éléments.
2.	Le système affiche la liste des éléments de la résidence.
3.	Le Gestionnaire clique sur "Ajouter un élément" 
4.	Le système affiche le formulaire d’ajout d’un élément.
5.	Le Gestionnaire remplit le formulaire et valide.
6.	Le système enregistre le nouvel élément et affiche un message de succès.
•	Scénario alternatif :
1.	Le formulaire est mal rempli : le système affiche un message d'erreur et demande de corriger les informations. Le scénario reprend alors au point 4.


2. Ajouter un tarif
•	Scénario nominal :
o	Le Gestionnaire accède à l'interface de gestion des tarifs.
o	Le système affiche les tarifs actuels.
o	Le Gestionnaire clique sur "Ajouter un tarif" 
o	Le système affiche le formulaire d’ajout d’un tarif.
o	Le Gestionnaire remplit le formulaire et valide.
o	Le système enregistre le tarif et affiche un message de confirmation.
•	Scénario alternatif :
o	Le formulaire est mal rempli : le système affiche un message d'erreur et demande de corriger les informations. Le scénario reprend alors au point 4.


3. Ajouter une période d'indisponibilité
•	Scénario nominal :
1.	Le Gestionnaire accède à l'interface de gestion des disponibilités.
2.	Le système affiche la liste des éléments de la résidence.
3.	Le Gestionnaire sélectionne un élément et ajoute une période d'indisponibilité.
4.	Le système enregistre la période et affiche un message de succès.
•	Scénario d'exception :
1.	Si la période chevauche une réservation existante, le système affiche un message d'erreur.


4. Ajouter une règle
•	Scénario nominal :
1.	Le Gestionnaire accède à l'interface de gestion des règles.
2.	Le système affiche la liste des règles actuelles.
3.	Le Gestionnaire clique sur "Ajouter une règle" 
4.	Le système affiche le formulaire d’ajout d’une règle.
5.	Le Gestionnaire remplit le formulaire et valide.
6.	Le système enregistre la règle et affiche un message de succès.


5. Consulter une réservation
•	Scénario nominal :
1.	Le Gestionnaire accède à l'interface de gestion des réservations.
2.	Le système affiche la liste des réservations.
3.	Le Gestionnaire sélectionne une réservation pour en voir les détails.
4.	Le système affiche les détails de la réservation 


6. Communiquer
•	Scénario nominal :
1.	Le Locataire envoie un message au Gestionnaire via le système de communication.
2.	Le système transmet le message au Gestionnaire.
3.	Le Gestionnaire répond au message.
4.	Le système transmet la réponse au Locataire.
•	Scénario d'exception :
1.	Si le système de communication est indisponible, un message d'erreur est affiché.


7. Payer
préconditions spécifiques: Le locataire doit d'abord avoir reservé un élément de la résidence au préalable avant de payer.
•	Scénario nominal :
1.	Le Locataire sélectionne l'option "Payer" pour une réservation existante.
2.	Le système affiche le montant dû.
3.	Le Locataire saisit les informations de paiement.
4.	Le système de paiement traite la transaction et confirme le succès.
5.	Le système met à jour le statut de la réservation et envoie une confirmation au Locataire.
•	Scénario alternatif :
1.	Le paiement échoue : le système affiche un message d'erreur et demande de réessayer.


8. Réserver du matériel
préconditions spécifiques: Le locataire doit d'abord avoir reservé un élément de la résidence au préalable avant de reserver un matériel.
•	Scénario nominal :
1.	Le Locataire sélectionne un matériel à réserver.
2.	Le système vérifie la disponibilité du matériel.
3.	Le système confirme la disponibilité et affiche le prix.
4.	Le Locataire confirme la réservation.
5.	Le système enregistre la réservation et envoie une confirmation.
•	Scénario d'exception :
1.	Si le matériel est indisponible, le système affiche un message d'erreur.


9. Réserver un élément d'une résidence
•	Scénario nominal :
1.	Le Locataire sélectionne un élément de la résidence et les dates de réservation.
2.	Le système vérifie la disponibilité de l'élément.
3.	Le système confirme la disponibilité et affiche le prix total.
4.	Le Locataire confirme la réservation.
5.	Le système enregistre la réservation et envoie une demande de paiement.
•	Scénario d'exception :
1.	Si l'élément est indisponible, le système affiche un message d'erreur.


10. Annuler une réservation
•	Scénario nominal :
1.	Le Locataire consulte la liste de ses réservations.
2.	Le Locataire sélectionne une réservation à annuler.
3.	Le système affiche les détails de l'annulation.
4.	Le Locataire clique le bouton d’annulation.
5.	Le système affiche une boite de dialogue de confirmation. 
6.	Le Locataire confirme l'annulation.
7.	Le système annule la réservation, met à jour les disponibilités et envoie une confirmation.
•	Scénario d'exception :
1.	L'annulation n'est pas possible (par exemple, trop proche de la date de début) : le système affiche un message d'erreur.


11. Modifier un élément de résidence
•	Scénario nominal :
1.	Le Gestionnaire accède à l'interface de gestion des éléments.
2.	Le système affiche la liste des éléments de la résidence.
3.	Le Gestionnaire sélectionne un élément à modifier.
4.	Le système affiche un formulaire de modification.
5.	Le Gestionnaire modifie les informations et valide.
6.	Le système enregistre les modifications et affiche un message de succès.
•	Scénario alternatif :
1.	Les modifications sont invalides : le système affiche un message d'erreur et le scénario reprend au numéro 4.


12. Modifier un tarif
•	Scénario nominal :
1.	Le Gestionnaire accède à l'interface de gestion des tarifs.
2.	Le système affiche les tarifs actuels.
3.	Le Gestionnaire sélectionne un tarif à modifier.
4.	Le système affiche un formulaire de modification.
5.	Le Gestionnaire modifie le tarif et valide.
6.	Le système enregistre les modifications et affiche un message de succès.
•	Scénario d'exception :
1.	Si le nouveau tarif est invalide, le système affiche un message d'erreur.


13. Modifier une période d'indisponibilité
•	Scénario nominal :
1.	Le Gestionnaire accède à l'interface de gestion des disponibilités.
2.	Le système affiche la liste des éléments de la résidence.
3.	Le Gestionnaire sélectionne un élément et modifie la période d'indisponibilité.
4.	Le système enregistre les modifications et affiche un message de succès.
•	Scénario d'exception :
1.	La nouvelle période chevauche une réservation existante : le système affiche un message d'erreur.


14. Modifier une règle
•	Scénario nominal :
1.	Le Gestionnaire accède à l'interface de gestion des règles.
2.	Le système affiche la liste des règles actuelles.
3.	Le Gestionnaire sélectionne une règle à modifier.
4.	Le système affiche un formulaire de modification.
5.	Le Gestionnaire modifie la règle et valide.
6.	Le système enregistre les modifications et affiche un message de succès.


15. Supprimer un élément de résidence
•	Scénario nominal :
1.	Le Gestionnaire accède à l'interface de gestion des éléments.
2.	Le système affiche la liste des éléments de la résidence.
3.	Le Gestionnaire sélectionne un élément à supprimer.
4.	Le système affiche un pop-up de confirmation.
5.	Le Gestionnaire confirme la suppression.
6.	Le système supprime l'élément et affiche un message de succès.
•	Scénario d'exception :
1.	L'élément est associé à une réservation active : le système affiche un message d'erreur.


16. Supprimer une règle
•	Scénario nominal :
1.	Le Gestionnaire accède à l'interface de gestion des règles.
2.	Le système affiche la liste des règles actuelles.
3.	Le Gestionnaire sélectionne une règle à supprimer.
4.	Le système affiche un pop-up de confirmation.
5.	Le Gestionnaire confirme la suppression.
6.	Le système supprime la règle et affiche un message de succès.
•	Scénario d'exception :
1.	La règle est en cours d'utilisation (par exemple, elle est utilisée pour l’établissement d’un tarif associé à un élément réservé) : le système affiche un message d'erreur.

POUR LES CAS D'UTILISATION "gérer Matériel" et "gérer prestation", le procesuss est pareille que "Ajouter un élément de residence", on aura les memes sous-cas d'utilisation "ajouter", "Modifier", "suprimer".