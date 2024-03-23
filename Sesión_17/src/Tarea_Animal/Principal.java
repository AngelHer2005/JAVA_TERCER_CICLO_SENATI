/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea_Animal;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        // Creamos las instancias:
        // Mamíferos:
        Mamifero Gato = new Mamifero("Gato", 'H', "pequeño", 3.8, "Carnívoro", 4);
        Mamifero Oso = new Mamifero("Oso Pardo", 'M', "Grande", 230.3, "Omnívoro", 4);
        Mamifero Leon = new Mamifero("León", 'M', "Grande", 150.2, "Carnívoro", 4);
        Mamifero Conejo = new Mamifero("Conejo", 'H', "Pequeño", 3.5, "Hervíboro", 4);
        Mamifero Gacela = new Mamifero("Gacela", 'M', "Mediano", 33.3, "Hervíboro", 4);
        Mamifero[] mamife ={Gato, Oso, Leon, Conejo, Gacela};

        // Peces:
        Pez Payaso = new Pez("Pez Payaso", 'H', "pequeño", 1.1, "Hervíboro", 4);
        Pez Globo = new Pez("Pez Globo", 'M', "pequeño", 1.5, "Omnívoro", 3);
        Pez Cirujano = new Pez("Pez Cirujano", 'H', "pequeño", 1.8, "Herbívoro", 5);
        Pez Betta = new Pez("Pez Betta", 'M', "pequeño", 0.3, "Carnívoro", 2);
        Pez TetraNeon = new Pez("Pez Tetra Neón", 'H', "pequeño", 0.2, "Omnívoro", 1);
        Pez[] pez = {Payaso, Globo, Cirujano, Betta, TetraNeon};

        // Aves:
        Ave Gallina = new Ave("Gallina", 'H', "pequeño", 6, "Hervíboro", false);
        Ave Pato = new Ave("Pato", 'M', "mediano", 3.5, "Omnívoro", true);
        Ave AguilaCalva = new Ave("Águila Calva", 'H', "grande", 6.8, "Carnívoro", true);
        Ave Perdiz = new Ave("Perdiz", 'H', "pequeño", 0.4, "Herbívoro", false);
        Ave CondorAndes = new Ave("Cóndor de los Andes", 'H', "grande", 11.5, "Carnívoro", true);
        Ave[] ave = {Gallina, Pato, AguilaCalva, Perdiz, CondorAndes};
        
        // Insectos:
        Insecto Hormiga = new Insecto("Hormiga", 'M', "pequeño", 0.03, "Omnívoro", 6, false);
        Insecto MariMona = new Insecto("Mariposa Monarca", 'H', "pequeño", 0.02, "Herbívoro", 6, true);
        Insecto EscaRino = new Insecto("Escarabajo Rinoceronte", 'M', "mediano", 0.03, "Omnívoro", 6, false);
        Insecto AbejaMe = new Insecto("Abeja Melífera", 'H', "pequeño", 0.02, "Herbívoro", 6, true);
        Insecto Libelula = new Insecto("Libélula", 'H', "pequeño", 0.05, "Carnívoro", 6, true);
        Insecto[] insecto = {Hormiga, MariMona, EscaRino, AbejaMe, Libelula};
        
        // Reptiles:
        Reptil Iguana = new Reptil("Iguana", 'M', "pequeño", 3, "Hervíboro", 4, true);
        Reptil SerpPi = new Reptil("Serpiente Pitón", 'H', "grande", 25, "Carnívoro", 0, false);
        Reptil TorMar = new Reptil("Tortuga Marina", 'H', "grande", 150, "Herbívoro", 4, false);
        Reptil CocoNilo = new Reptil("Cocodrilo del Nilo", 'H', "grande", 500, "Carnívoro", 4, true);
        Reptil DragonKomodo = new Reptil("Dragón de Komodo", 'H', "grande", 90, "Carnívoro", 4, false);
        Reptil[] reptil = {Iguana, SerpPi, TorMar, CocoNilo, DragonKomodo};
        
        JOptionPane.showMessageDialog(null, "Este código te permitirá elegir uno entre muchos animales de "
                + "distintas especies, cada uno tendrá un método y algunos son juegos. ¡Diviértete!\nComencemos..." );
        String msj = "";
        int animal_op=0, opcion = 0;
        int[] animales = {1, 2, 3, 4, 5};
        
        /*Map<Integer, Object[]> dic = new HashMap<>();
        dic.put(1, mamife);
        dic.put(2, new Pez[]{Payaso, Globo, Cirujano, Betta, TetraNeon});
        dic.put(3, new Ave[]{Gallina, Pato, AguilaCalva, Perdiz, CondorAndes});
        dic.put(4, new Insecto[]{Hormiga, MariMona, EscaRino, AbejaMe, Libelula});
        dic.put(5, new Reptil[]{Iguana, SerpPi, TorMar, CocoNilo, DragonKomodo});
        
        System.out.println(dic.get(1)[0].nombre);*/
        String[] especie = {"los Mamíferos", "los Peces", "las Aves", "los Insectos", "los Reptiles"}; 
        boolean val = true;
        while (val) {
            while (true) {
            // Escogemos un animal:
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué especie elegirás?\n1. Mamífero\n2. Peces\n3. Aves\n4. Insectos\n5. Reptiles\n"));
                if(opcion > 0 && opcion < 6){
                    msj = "Elegiste " + especie[opcion-1] + ".\n¡Ahora comenzará lo bueno!\nElige el animal.\n";
                    for (int i = 0; i < 5; i++) {
                        switch (opcion) {
                            case 1 -> msj += (i + 1) + ". " + mamife[i].nombre + "\n";
                            case 2 -> msj += (i + 1) + ". " + pez[i].nombre + "\n";
                            case 3 -> msj += (i + 1) + ". " + ave[i].nombre + "\n";
                            case 4 -> msj += (i + 1) + ". " + insecto[i].nombre + "\n";
                            case 5 -> msj += (i + 1) + ". " + reptil[i].nombre + "\n";
                        }
                    }
                    animal_op = Integer.parseInt(JOptionPane.showInputDialog(msj));

                    break;
                }else{
                        JOptionPane.showMessageDialog(null, "Ingresaste un valor incorrecto, inténtalo de nuevo.");
                    }
            }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Se ingresó un valor no numérico, ingresa de nuevo.");
            }
            
        }
        
        // Pasamos con los métodos:
        String animal = "";
        switch (opcion) {
                        case 1 -> animal = mamife[animal_op-1].nombre;
                        case 2 -> animal = pez[animal_op-1].nombre;
                        case 3 -> animal = ave[animal_op-1].nombre;
                        case 4 -> animal = insecto[animal_op-1].nombre;
                        case 5 -> animal = reptil[animal_op-1].nombre;
                    }
            System.out.println(animal);
        boolean val_m = true;
        while (val_m) {
            msj = "Ingresa un método entre los disponibles: ";
            switch (especie[opcion-1].substring(4)) {
                case "Mamíferos" -> msj += "\n1. Comer\n2. Rugir\n3. Descripción";
                case "Peces" -> msj += "\n1. Comer\n2. Nadar\n3. Desovar\n4. Descripción";
                case "Aves" -> msj += "\n1. Comer\n2. Volar\n3. Construir nido\n4. Descripción";
                case "Insectos" -> msj += "\n1. Comer\n2. Volar\n3. Navegación\n4. Descripción";
                case "Reptiles" -> msj += "\n1. Comer\n2. Camuflar\n3. Muda de piel\n4. Descripción";
                }
            int op_meto = Integer.parseInt(JOptionPane.showInputDialog(msj));
            switch (op_meto) {
                case 1 -> {
                    switch (especie[opcion-1].substring(4)) {
                        case "Mamíferos" -> mamife[animal_op-1].Comer();
                        case "Peces" -> pez[animal_op-1].Comer();
                        case "Aves" -> ave[animal_op-1].Comer();
                        case "Insectos" -> insecto[animal_op-1].Comer();
                        case "Reptiles" -> reptil[animal_op-1].Comer();
                    }
                }
                case 2 -> {
                    switch (especie[opcion-1].substring(4)) {
                        case "Mamíferos" -> mamife[animal_op-1].rugir();
                        case "Peces" -> pez[animal_op-1].Nadar();
                        case "Aves" -> ave[animal_op-1].Volar();
                        case "Insectos" -> insecto[animal_op-1].Volar();
                        case "Reptiles" -> {
                            if (reptil[animal_op-1].camuflaje) {
                                String camu = JOptionPane.showInputDialog("¿En qué te quieres camuflar?");
                                reptil[animal_op-1].Camuflar(camu);
                            } else {
                                JOptionPane.showMessageDialog(null, "El animal que escogiste no puede camuflarse, elige otro método.");
                            }
                        }
                        
                    }
                }

                case 3 -> {
                    switch (especie[opcion-1].substring(4)) {
                        case "Mamíferos" -> mamife[animal_op-1].descripcion();
                        case "Peces" -> pez[animal_op-1].Desovar();
                        case "Aves" -> ave[animal_op-1].construirNidos();
                        case "Insectos" -> insecto[animal_op-1].Navegacion();
                        case "Reptiles" -> reptil[animal_op-1].MudaPiel();
                    }
                }
                case 4 -> {
                    switch (especie[opcion-1].substring(4)) {
                        case "Peces" -> pez[animal_op-1].descripcion();
                        case "Aves" -> ave[animal_op-1].descripcion();
                        case "Insectos" -> insecto[animal_op-1].descripcion();
                        case "Reptiles" -> reptil[animal_op-1].descripcion();
                    }
                }                    
            }
            boolean opc_cam = true, validor = false;
            int opt = 0;
            while (opc_cam) {
                try{
                    opt = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres cambiar de animal(1), seguir con los métodos(2) o salir(3)?"));
                    validor = true;
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Se ingresó un valor no numérico, ingresa de nuevo."); 
                }finally{
                    if (validor) {
                        switch (opt) {
                            case 1 -> {
                                JOptionPane.showMessageDialog(null, "Regresando..."); 
                                opc_cam=false;
                                val_m = !val_m;
                            }
                            case 2 -> {
                                JOptionPane.showMessageDialog(null, "Sigamos...");
                                opc_cam=false;
                            }
                            case 3 -> {
                                JOptionPane.showMessageDialog(null, "Saliendo..."); 
                                opc_cam=false;
                                val = !val;
                                val_m = !val_m;
                            }
                            default -> JOptionPane.showMessageDialog(null, "Se detectó un valor número incorrecto, ingresa de nuevo."); 
                        }
                    }
                }
            }
            
        }
    }
  }
}