CREATE TABLE IF NOT EXISTS 
    services (
        id_service SERIAL PRIMARY KEY,
        name VARCHAR(50) NOT NULL,
        creation_dt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
      	modification_dt TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );

-- Création fonction (trigger) => si ON AJOUTE des données
CREATE OR REPLACE FUNCTION set_creation_date_services() -- déclare ma fonction
RETURNS TRIGGER AS $create_date_services$ --  retourne la variable trigger
BEGIN -- démarre la fonction
	NEW.creation_dt := CURRENT_TIMESTAMP; -- attribut de la date et l'heure actuelles à la colonne creation_dt
	RETURN NEW; -- retourne la nouvelle ligne modifiée
END;
$create_date_services$ LANGUAGE plpgsql; -- variable trigger + spécifie le langage

--Création du trigger (en appelant la fonction 'set_creation_date_services()')
CREATE TRIGGER set_creation_date_services_trigger
BEFORE INSERT ON services -- avant l'insertion dans la table services
FOR EACH ROW -- pour chaque ligne
EXECUTE FUNCTION set_creation_date_services(); -- exécute la fonction pour chaque nouvelle ligne insérée    

-- Création fonction (trigger) => si ON MODIFIE des données
CREATE OR REPLACE FUNCTION set_modification_date_services()
RETURNS TRIGGER AS $update_date_services$ --  retourne la variable trigger
BEGIN -- démarre la fonction
	NEW.modification_dt := CURRENT_TIMESTAMP; -- attribut de la date et l'heure actuelles à la colonne modification_dt
	RETURN NEW; -- retourne la nouvelle ligne modifiée
END;
$update_date_services$ LANGUAGE plpgsql; -- variable trigger + spécifie le langage

--Création du trigger (en appelant la fonction 'set_modification_date_services()')
CREATE TRIGGER set_modification_date_services_trigger
BEFORE UPDATE ON services -- avant l'insertion dans la table services
FOR EACH ROW -- pour chaque ligne
EXECUTE FUNCTION set_modification_date_services(); -- exécute la fonction pour chaque nouvelle ligne insérée

----------------------------------------------------------------------------------------------------------- 

CREATE TABLE IF NOT EXISTS 
    bedrooms (
        id_bedroom SERIAL PRIMARY KEY,
        numbers INTEGER NOT NULL,
        creation_dt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
      	modification_dt TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );

-- Création fonction (trigger) => si ON AJOUTE des données
CREATE OR REPLACE FUNCTION set_creation_date_bedrooms() -- déclare ma fonction
RETURNS TRIGGER AS $create_date_bedrooms$ --  retourne la variable trigger
BEGIN -- démarre la fonction
	NEW.creation_dt := CURRENT_TIMESTAMP; -- attribut de la date et l'heure actuelles à la colonne creation_dt
	RETURN NEW; -- retourne la nouvelle ligne modifiée
END;
$create_date_bedrooms$ LANGUAGE plpgsql; -- variable trigger + spécifie le langage

--Création du trigger (en appelant la fonction 'set_creation_date_bedrooms()')
CREATE TRIGGER set_creation_date_bedrooms_trigger
BEFORE INSERT ON bedrooms -- avant l'insertion dans la table bedrooms
FOR EACH ROW -- pour chaque ligne
EXECUTE FUNCTION set_creation_date_bedrooms(); -- exécute la fonction pour chaque nouvelle ligne insérée    

-- Création fonction (trigger) => si ON MODIFIE des données
CREATE OR REPLACE FUNCTION set_modification_date_bedrooms()
RETURNS TRIGGER AS $update_date_bedrooms$ --  retourne la variable trigger
BEGIN -- démarre la fonction
	NEW.modification_dt := CURRENT_TIMESTAMP; -- attribut de la date et l'heure actuelles à la colonne modification_dt
	RETURN NEW; -- retourne la nouvelle ligne modifiée
END;
$update_date_bedrooms$ LANGUAGE plpgsql; -- variable trigger + spécifie le langage

--Création du trigger (en appelant la fonction 'set_modification_date_bedrooms()')
CREATE TRIGGER set_modification_date_bedrooms_trigger
BEFORE UPDATE ON bedrooms -- avant l'insertion dans la table bedrooms
FOR EACH ROW -- pour chaque ligne
EXECUTE FUNCTION set_modification_date_bedrooms(); -- exécute la fonction pour chaque nouvelle ligne insérée

----------------------------------------------------------------------------------------------------------- 

CREATE TABLE IF NOT EXISTS 
    beds (
        id_bed SERIAL PRIMARY KEY,
        numbers INTEGER NOT NULL,
        creation_dt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
      	modification_dt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        id_bedroom INT REFERENCES bedrooms (id_bedroom)
    );

-- Création fonction (trigger) => si ON AJOUTE des données
CREATE OR REPLACE FUNCTION set_creation_date_beds() -- déclare ma fonction
RETURNS TRIGGER AS $create_date_beds$ --  retourne la variable trigger
BEGIN -- démarre la fonction
	NEW.creation_dt := CURRENT_TIMESTAMP; -- attribut de la date et l'heure actuelles à la colonne creation_dt
	RETURN NEW; -- retourne la nouvelle ligne modifiée
END;
$create_date_beds$ LANGUAGE plpgsql; -- variable trigger + spécifie le langage

--Création du trigger (en appelant la fonction 'set_creation_date_beds()')
CREATE TRIGGER set_creation_date_beds_trigger
BEFORE INSERT ON beds -- avant l'insertion dans la table beds
FOR EACH ROW -- pour chaque ligne
EXECUTE FUNCTION set_creation_date_beds(); -- exécute la fonction pour chaque nouvelle ligne insérée    

-- Création fonction (trigger) => si ON MODIFIE des données
CREATE OR REPLACE FUNCTION set_modification_date_beds()
RETURNS TRIGGER AS $update_date_beds$ --  retourne la variable trigger
BEGIN -- démarre la fonction
	NEW.modification_dt := CURRENT_TIMESTAMP; -- attribut de la date et l'heure actuelles à la colonne modification_dt
	RETURN NEW; -- retourne la nouvelle ligne modifiée
END;
$update_date_beds$ LANGUAGE plpgsql; -- variable trigger + spécifie le langage

--Création du trigger (en appelant la fonction 'set_modification_date_beds()')
CREATE TRIGGER set_modification_date_beds_trigger
BEFORE UPDATE ON beds -- avant l'insertion dans la table beds
FOR EACH ROW -- pour chaque ligne
EXECUTE FUNCTION set_modification_date_beds(); -- exécute la fonction pour chaque nouvelle ligne insérée

CREATE TABLE IF NOT EXISTS 
    patients (
        id_patient SERIAL PRIMARY KEY,
        name VARCHAR(50) NOT NULL,
        firstname VARCHAR(50) NOT NULL,
        dob DATE NOT NULL,
        securitysocialnumber VARCHAR(13) NOT NULL,
        creation_dt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
      	modification_dt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        id_service INT REFERENCES services (id_service),
        id_bed INT REFERENCES beds (id_bed)

    );


-- Création fonction (trigger) => si ON AJOUTE des données
CREATE OR REPLACE FUNCTION set_creation_date_patients() -- déclare ma fonction
RETURNS TRIGGER AS $create_date_patients$ --  retourne la variable trigger
BEGIN -- démarre la fonction
	NEW.creation_dt := CURRENT_TIMESTAMP; -- attribut de la date et l'heure actuelles à la colonne creation_dt
	RETURN NEW; -- retourne la nouvelle ligne modifiée
END;
$create_date_patients$ LANGUAGE plpgsql; -- variable trigger + spécifie le langage

-- Création du trigger (en appelant la fonction 'set_creation_date_patients()')
CREATE TRIGGER set_creation_date_patients_trigger
BEFORE INSERT ON patients -- avant l'insertion dans la table patients
FOR EACH ROW -- pour chaque ligne
EXECUTE FUNCTION set_creation_date_patients(); -- exécute la fonction pour chaque nouvelle ligne insérée    

-- Création fonction (trigger) => si ON MODIFIE des données
CREATE OR REPLACE FUNCTION set_modification_date_patients()
RETURNS TRIGGER AS $update_date_patients$ --  retourne la variable trigger
BEGIN -- démarre la fonction
	NEW.modification_dt := CURRENT_TIMESTAMP; -- attribut de la date et l'heure actuelles à la colonne modification_dt
	RETURN NEW; -- retourne la nouvelle ligne modifiée
END;
$update_date_patients$ LANGUAGE plpgsql; -- variable trigger + spécifie le langage

--Création du trigger (en appelant la fonction 'set_modification_date_patients()')
CREATE TRIGGER set_modification_date_patients_trigger
BEFORE UPDATE ON patients -- avant l'insertion dans la table patients
FOR EACH ROW -- pour chaque ligne
EXECUTE FUNCTION set_modification_date_patients(); -- exécute la fonction pour chaque nouvelle ligne insérée

----------------------------------------------------------------------------------------------------------- 

INSERT INTO services (name) VALUES
    ('Urgences'),
    ('Cardiologie'),
    ('Chirurgie'),
    ('Pédiatrie'),
    ('Radiologie'),
    ('Maternité'),
    ('Neurologie'),
    ('Psychiatrie');

INSERT INTO bedrooms (numbers) VALUES
    (601),
    (602),
    (603),
    (604),
    (605),
    (606),
    (607), 
    (608),
    (609);

INSERT INTO beds (numbers, id_bedroom) VALUES
    (91, 1),
    (92, 2),
    (93, 3),
    (94, 4),
    (95, 5),
    (96, 6),
    (97, 7),
    (98, 8),
    (99, 9);

INSERT INTO patients (name, firstname, dob, securitysocialnumber, id_service, id_bed ) VALUES
    ('Durand', 'Anne', '1978-05-15', '1234567890123', 2, 1),
    ('Leroux', 'Marc', '1965-09-22', '2345678901234', 1, 9),
    ('Fournier', 'Sophie', '1982-12-10', '3456789012345', 3, 5),
    ('Girard', 'Pierre', '1990-03-03', '4567890123456', 7, 6),
    ('Dubois', 'Marie', '1976-07-28', '5678901234567', 8, 9),
    ('Lefevre', 'Luc', '1950-11-18', '6789012345678', 7, 9),
    ('Petit', 'Laura', '1995-02-05', '7890123456789', 6, 1),
    ('Thomas', 'Jean', '1988-04-30', '8901234567890', 4, 9);