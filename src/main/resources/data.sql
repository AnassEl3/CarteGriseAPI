
-- Administration ----------------------------------------
INSERT INTO `administrations`(`nom`, `adresse`) 
VALUES ('NARSA', 'Fès')
;
/*
-- Employes ----------------------------------------
INSERT INTO `employes`(`nom`, `prenom`, `sexe`, `date_naissance`, `cin`, `mot_de_passe`, `compte_active`, `administration_fk`) 
VALUES ('anass', 'el yaagoubi', 'm', '2001-03-04', 'cd25665', '$2a$10$SgeZM25e3JbBvzn3Rlhgd.YhPhuV1UdgXT8qmm5rqtdQo5Ht5wo9K', 1, '1'),
    ('kamal', 'miloudi', 'm', '1985-05-16', 'z857444', null, 0, '1'),
    ('amine', 'elhlo', 'm', '1992-10-02', 'z159624', null, 0, '1'),
    ('lamyae', 'idrissi', 'f', '1995-06-11', 'z628944', null, 0, '1'),
    ('imade', 'soussi', 'm', '2000-11-15', 'z325524', null, 0, '1'),
    ('ikram', 'wdghiri', 'f', '2002-02-01', 'cd652774', null, 0, '1'),
    ('samira', 'adrdor', 'f', '1999-05-09', 'cd778512', null, 0, '1'),
    ('mohammed', 'el oumari', 'm', '2000-10-28', 'z478885', null, 0, '1'),
    ('douae', 'soussi', 'f', '1998-03-20', 'cd119942', null, 0, '1')
;

-- Citoyens ----------------------------------------
INSERT INTO `citoyens`(`nom`, `prenom`, `sexe`, `date_naissance`, `lieu_naissance`, `cin`) 
VALUES ('mohammed', 'saidi', 'm', '2000-08-09', 'Méknes', 'cd589856'),
    ('zineb', 'ahrar', 'f', '1999-01-05', 'Fés', 'cd147852')
;

-- Véhicule  ----------------------------------------
-- carburant: diesel / essence / gazeux
-- puissance: en CH (chevaux)
-- ptac (Poids Total Autorisé en Charge): en Kg
INSERT INTO `vehicules`(`modele`, `marque`, `carburant`, `puissance`, `nb_place`, `nb_cylindres`, `ptac`) 
VALUES ('duster', 'dacia', 'diesel', '100', 5, 4, 1200)
;

-- Carte grise  ----------------------------------------
-- vehicule_usage: professionnel / personnelle
INSERT INTO `cartesgrise`(`immatriculation`, `immatriculation_anterieure`, `date_premiere_utilisation`, `date_mutation`, `date_fin_validation`, `vehicule_usage`, `vehicule_fk`, `citoyen_fk`) 
VALUES ('25255-A-15', null, '2014-12-08', null, '2028-05-13', 'personnelle', 1, 2)
;

-- Associer véhicules aux cartes grise  ----------------------------------------
UPDATE `vehicules` SET `cartegise_fk` = 1 WHERE `id` = 1;

-- Demande  ----------------------------------------
-- types: immatriculation / echange / duplication / retrait
-- etat: En cours de validation / Accépté & En cours de traitement / Refusé / Requête des documents supplémentaires / Requête de correction des informations / Terminé
INSERT INTO `demandes`(`type`, `date_demande`, `etat`, `description_etat`, `citoyen_fk`) 
VALUES ('duplication', '2023-04-12', 'Accépté & En cours de traitement', null, 1)
;
*/
-- ==============================================================================================================================================================================================

-- Insertion d'enregistrements dans la table "employes"
INSERT INTO employes (cin, compte_active, date_naissance, mot_de_passe, nom, prenom, sexe, administration_fk)
VALUES
  ('CD25665' , 1, '2001-03-04', '$2a$10$SgeZM25e3JbBvzn3Rlhgd.YhPhuV1UdgXT8qmm5rqtdQo5Ht5wo9K', 'el yaagoubi','anass' ,'M',1), 
  ('KL58478', 0, '1991-03-20', null, 'El Amrani', 'Mohammed', 'M', 1),
  ('MN789012', 0, '1986-08-14', null, 'Berrada', 'Fatima', 'F', 1),
  ('OP345678', 0, '1993-12-08', null, 'Hassani', 'Youssef', 'M', 1),
  ('QR901234', 0, '1989-05-25', null, 'Safi', 'Laila', 'F', 1),
  ('ST567890', 0, '1996-10-10', null, 'Hakimi', 'Khalid', 'M', 1),
  ('UV123456', 0, '1987-04-18', null, 'Tazi', 'Nadia', 'F', 1),
  ('WX789012', 0, '1982-09-09', null, 'Ait Addi', 'Ali', 'M', 1),
  ('YZ345678', 0, '1990-01-02', null, 'Laaribi', 'Samira', 'F', 1),
  ('AB901234', 0, '1997-06-28', null, 'Belkacem', 'Karima', 'F', 1),
  ('CD567890', 0, '1984-11-15', null, 'Ouazzani', 'Youssef', 'M', 1);

-- Insertion d'enregistrements dans la table "citoyens"
INSERT INTO citoyens (adresse, cin, date_naissance, email, lieu_naissance, nationalite, nom, prenom, profession, sexe, telephone)
VALUES
  ('Rue des Iris, Agadir', 'KL123456', '1981-04-05', 'mohammed.elamrani@example.com', 'Agadir', 'Marocaine', 'El Amrani', 'Mohammed', 'Architecte', 'M', '0612345678'),
  ('Avenue des Palmiers, Tétouan', 'MN789012', '1976-09-30', 'fatima.berrada@example.com', 'Tétouan', 'Marocaine', 'Berrada', 'Fatima', 'Enseignante', 'F', '0623456789'),
  ('Boulevard des Chênes, Oujda', 'OP345678', '1983-01-12', 'youssef.hassani@example.com', 'Oujda', 'Marocaine', 'Hassani', 'Youssef', 'Ingénieur', 'M', '0634567890'),
  ('Rue des Roses, Casablanca', 'QR901234', '1979-04-29', 'laila.safi@example.com', 'Casablanca', 'Marocaine', 'Safi', 'Laila', 'Médecin', 'F', '0645678901'),
  ('Avenue des Jasmins, Marrakech', 'ST567890', '1986-11-23', 'khalid.hakimi@example.com', 'Marrakech', 'Marocaine', 'Hakimi', 'Khalid', 'Avocat', 'M', '0656789012'),
  ('Rue des Lys, Agadir', 'UV123456', '1977-05-17', 'nadia.tazi@example.com', 'Agadir', 'Marocaine', 'Tazi', 'Nadia', 'Comptable', 'F', '0667890123'),
  ('Avenue des Orchidées, Tétouan', 'WX789012', '1972-10-08', 'ali.aitaddi@example.com', 'Tétouan', 'Marocaine', 'Ait Addi', 'Ali', 'Commercial', 'M', '0678901234'),
  ('Boulevard des Lys, Oujda', 'YZ345678', '1980-02-21', 'samira.laaribi@example.com', 'Oujda', 'Marocaine', 'Laaribi', 'Samira', 'Infirmière', 'F', '0689012345'),
  ('Rue des Jasmins, Casablanca', 'AB901234', '1997-07-11', 'karima.belkacem@example.com', 'Casablanca', 'Marocaine', 'Belkacem', 'Karima', 'Etudiante', 'F', '0690123456'),
  ('Avenue des Chênes, Marrakech', 'CD567890', '1982-01-28', 'youssef.ouazzani@example.com', 'Marrakech', 'Marocaine', 'Ouazzani', 'Youssef', 'Architecte', 'M', '0601234567'),
  ('Avenue Hassan Al Wazzan 2122', 'BC901234', '1984-01-12', 'reda.lahjouji@example.com', 'Tétouan', 'Marocaine', 'Lahjouji', 'Reda', 'Enseignant', 'M', '0654321098'),
  ('Boulevard Mohammed V 2324', 'DE567890', '1997-07-05', 'hassan.belmehdi@example.com', 'Salé', 'Marocaine', 'Belmehdi', 'Hassan', 'Comptable', 'M', '0612345678'),
  ('Rue Abdelaziz Ben Driss 2526', 'EF123456', '1981-12-30', 'safia.oudghiri@example.com', 'Marrakech', 'Marocaine', 'Oudghiri', 'Safia', 'Pharmacienne', 'F', '0698765432'),
  ('Avenue Moulay Ismail 2728', 'GH789012', '1994-09-15', 'ali.berrada@example.com', 'Casablanca', 'Marocaine', 'Berrada', 'Ali', 'Journaliste', 'M', '0654321098'),
  ('Boulevard Hassan II 2930', 'IJ345678', '1987-04-08', 'khadija.rahmani@example.com', 'Rabat', 'Marocaine', 'Rahmani', 'Khadija', 'Architecte', 'F', '0612345678'),
  ('Rue Mohammed Abdelkrim El Khattabi 3132', 'KL901234', '2000-01-25', 'abdelali.hafidi@example.com', 'Fès', 'Marocaine', 'Hafidi', 'Abdelali', 'Étudiant', 'M', '0698765432'),
  ('Avenue Mohammed VI 3334', 'MN567890', '1983-06-10', 'nadia.benjelloun@example.com', 'Casablanca', 'Marocaine', 'Benjelloun', 'Nadia', 'Ingénieure informatique', 'F', '0654321098'),
  ('Boulevard Abdelkader Ben Ghabrit 3536', 'OP123456', '1996-03-05', 'karim.elalamy@example.com', 'Tanger', 'Marocaine', 'El Alamy', 'Karim', 'Entrepreneur', 'M', '0612345678');

-- Insertion d'enregistrements dans la table "vehicules"
INSERT INTO vehicules (modele, marque, carburant, puissance, nb_place, nb_cylindres, ptac)
VALUES
  ('Clio', 'Renault', 'Essence', '90', 5, 4, 1200),
  ('308', 'Peugeot', 'Diesel', '110', 5, 4, 1400),
  ('Golf', 'Volkswagen', 'Essence', '115', 5, 4, 1300),
  ('Corolla', 'Toyota', 'Essence', '100', 5, 4, 1250),
  ('500', 'Fiat', 'Essence', '85', 4, 3, 1000),
  ('Focus', 'Ford', 'Diesel', '120', 5, 4, 1400),
  ('Megane', 'Renault', 'Essence', '130', 5, 4, 1350),
  ('208', 'Peugeot', 'Essence', '95', 4, 3, 1050),
  ('Passat', 'Volkswagen', 'Diesel', '150', 5, 4, 1600),
  ('Yaris', 'Toyota', 'Essence', '80', 4, 3, 950),
  ('Astra', 'Opel', 'Diesel', '110', 5, 4, 1350),
  ('Corsa', 'Opel', 'Essence', '75', 4, 3, 1000),
  ('Polo', 'Volkswagen', 'Essence', '95', 4, 3, 1100),
  ('C4', 'Citroen', 'Diesel', '120', 5, 4, 1300),
  ('Fiesta', 'Ford', 'Essence', '100', 4, 3, 950);

-- Insertion d'enregistrements dans la table "cartesgrise"
INSERT INTO cartesgrise (immatriculation, immatriculation_anterieure, date_premiere_utilisation, date_mutation, date_fin_validation, vehicule_usage, vehicule_fk, citoyen_fk)
VALUES
    ('25255-ب-15', null, '2014-12-08', null, '2028-05-13', 'personnelle', 1, 2),
    ('12345-ب-01', null, '2015-06-20', null, '2029-08-05', 'personnelle', 2, 3),
    ('67890-ب-02', null, '2016-03-15', null, '2026-02-10', 'professionnelle', 3, 4),
    ('54321-ب-03', null, '2017-09-10', null, '2031-07-20', 'personnelle', 4, 5),
    ('98765-ب-04', null, '2018-12-05', null, '2032-11-25', 'personnelle', 5, 6),
    ('45678-ب-05', null, '2019-07-01', null, '2033-06-15', 'professionnelle', 6, 7),
    ('13579-ب-06', null, '2020-04-25', null, '2034-09-30', 'personnelle', 7, 8),
    ('24680-ب-07', null, '2021-01-18', null, '2035-04-05', 'personnelle', 8, 9),
    ('98765-ب-08', null, '2016-08-10', null, '2036-10-12', 'personnelle', 9, 10),
    ('54321-ب-09', null, '2013-05-05', null, '2037-02-28', 'professionnelle', 10, 11),
    ('12345-ب-10', null, '2010-02-28', null, '2038-07-10', 'personnelle', 11, 12),
    ('67890-ب-11', null, '2019-09-20', null, '2039-12-15', 'personnelle', 12, 13),
    ('13579-ب-12', null, '2012-06-15', null, '2040-05-01', 'personnelle', 13, 14),
    ('45678-ب-13', null, '2013-03-10', null, '2041-08-18', 'professionnelle', 14, 15),
    ('25255-ب-14', null, '2009-10-02', null, '2035-01-25', 'personnelle', 15, 16),
    ('67890-ب-15', null, '2010-07-01', null, '2038-06-08', 'personnelle', 3, 17);

  -- Insertion d'enregistrements dans la table "demandes"
INSERT INTO demandes (code, type, date_demande, etat, description_etat, citoyen_fk)
VALUES
    ('853677', 'Immatriculation', '2023-05-20', 'En cours de validation', null, 2),
    ('589251', 'Echange', '2023-06-01', 'Requête de correction des informations', 'Le numéro de série du véhicule est incorrect.', 3),
    ('951258', 'Retrait', '2023-05-15', 'Accépté & En cours de traitement', null, 4),
    ('125486', 'Duplication', '2023-04-12', 'Terminée', null, 5),
    ('896428', 'Immatriculation' , '2023-06-10' , 'Requête des documents supplémentaires ', 'La copie de la carte nationale est manquante.', 6),
    ('987222', 'Echange', '2023-05-25', 'Refusée', 'Le certificat de conformité du véhicule est expiré.', 7),
    ('332648', 'Immatriculation', '2023-05-18', 'En cours de traitement', null, 8),
    ('679512', 'Duplication', '2023-06-05', 'En cours de validation', null, 9),
    ('553384', 'Retrait', '2023-06-12', 'Accéptée & En cours de traitement', null, 10),
    ('455462', 'Echange', '2023-05-30', 'Requête de correction des informations', 'Le nom du propriétaire est incorrect.', 11),
    ('258961', 'Immatriculation', '2023-05-22', 'Terminée', null, 12),
    ('314752', 'Duplication', '2023-06-08', 'Requête des documents supplémentaires', 'Le justificatif de domicile est périmé.', 13),
    ('228874', 'Retrait', '2023-05-28', 'En cours de validation', null, 14),
    ('642999', 'Immatriculation', '2023-06-03', 'Refusée', 'Le véhicule a été déclaré volé.', 15),
    ('245887', 'Echange', '2023-05-17', 'En cours de traitement', null, 16);
