/* 
 * Copyright Copyright 2022 Javier Timoneda Marti - xavix2001xq@gmail.com.
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
package org.japo.java.main;

// IMPORTE DEL PAQUETE O LIBRERIA
import java.io.FileWriter;
import java.util.Properties;
import org.japo.java.app.App;
import org.japo.java.libraries.UtilesApp;

/**
 *
 * @author Javier Timoneda Marti
 */
public final class Main {
    
    public static final String ACCESS_UID = "JAPO-Omicron-0";

    public static void main(String[] args) {
        if (validarAcceso(args)) {
            //  CARGAR LAS PROPIEDADES
            Properties prp = UtilesApp.importarPropiedades();
        
        // Instancia App
        App app = new App(prp);
        
    
        // LOGICA DE NEGOCIO
        app.launchApp();
        } else {
        System.out.println("Acesso Denegado");
        }
    }

    private static boolean validarAcceso( String[] args) {
        return true
                && args != null
                && args.length == 1
                && args[0].equals(ACCESS_UID);
    }
    
    
}
