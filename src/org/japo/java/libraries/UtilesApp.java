/*
 * Copyright 2023 alumnoT.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

/**
 *
 * @author alumnoT
 */
public final class UtilesApp {

    // VALORES POR DEFECTO 
    public static final String DEF_FICHER0_PRP = "app.properties";
    public static final String DEF_FICHER0_XML = "app.xml";

    private UtilesApp() {
    }

    // FICHERO XML > OBJETO PROPIEDADES
    public static final Properties importarPropiedadesXML(String fichero) {
        // OBJETO PROPIEDADES VACIO
        Properties prp = new Properties();

        // PERSISTENCIA > PROPIEDADES
        try ( FileInputStream fis = new FileInputStream(fichero)) {
            prp.loadFromXML(fis);
        } catch (Exception e) {
            System.out.println("ERROR: Imposible Acedder a " + fichero);
        }

        // RETURN
        return prp;
    }

    //  FICHERO PREDETERMINADO FICHERO PROPIEDADES > OBJETO PREDETERMINADO PROPIEDADES
    public static final Properties importarPropiedadesXML() {
        return importarPropiedadesXML(DEF_FICHER0_XML);
    }

// EXPORTAR PROPIEDADES XML
    public static final boolean exportarPropiedadesXML(Properties prp, String fichero) {
        // SEMAFORO DE ESTADO
        boolean estadoOk = false;

        // SALVAGUERDAS DE PROPERTIES
        try ( FileOutputStream fis = new FileOutputStream(fichero)) {
            // PROPIEDADES DEL SISTEMA
            prp.storeToXML(fis, null);

            // ESATDO OK
            estadoOk = true;

        } catch (Exception e) {
            System.out.println("ERROR: Imposible Acedder a " + fichero);
        }

        // RETORNO
        return estadoOk;
    }

    public static final boolean exportarPropiedadesXML(Properties prp) {
        return exportarPropiedadesXML(prp, DEF_FICHER0_XML);
    }

// FICHERO PROPIEDADES > OBJETO PROPIEDADES
    public static final Properties importarPropiedades(String fichero) {
        // OBJETO PROPIEDADES VACIO
        Properties prp = new Properties();

        // PERSISTENCIA > PROPIEDADES
        try ( FileReader fr = new FileReader(fichero)) {
            prp.load(fr);
        } catch (Exception e) {
            System.out.println("ERROR: Imposible Acedder a " + fichero);
        }

        // RETURN
        return prp;
    }

    //  FICHERO PREDETERMINADO FICHERO PROPIEDADES > OBJETO PREDETERMINADO PROPIEDADES
    public static final Properties importarPropiedades() {
        return importarPropiedades(DEF_FICHER0_PRP);
    }

    public static final boolean exportarPropiedades(Properties prp, String fichero) {
        // SEMAFORO DE ESTADO
        boolean estadoOk = false;

        // SALVAGUERDAS DE PROPERTIES
        try ( FileWriter fw = new FileWriter(fichero)) {
            // PROPIEDADES DEL SISTEMA
            prp.store(fw, null);

            // ESATDO OK
            estadoOk = true;

        } catch (Exception e) {
            System.out.println("ERROR: Imposible Acedder a " + fichero);
        }

        // RETORNO
        return estadoOk;
    }

    public static final boolean exportarPropiedades(Properties prp) {
        return exportarPropiedades(prp, DEF_FICHER0_PRP);
    }
}
