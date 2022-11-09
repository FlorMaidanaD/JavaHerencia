package Servicios;

import Entidades.Alquiler;
import Entidades.Amarre;
import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Cliente;
import Entidades.Velero;
import Entidades.Yate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int op;
    private int ob;
    private int x;

    ArrayList<Cliente> clientes = new ArrayList();
    ArrayList<Velero> veleros = new ArrayList();
    ArrayList<BarcoMotor> barcosAMotor = new ArrayList();
    ArrayList<Yate> yates = new ArrayList();
    ArrayList<Amarre> amarres = new ArrayList();
    ArrayList<Alquiler> alquileres = new ArrayList();

    public Menu() {
        //inicializo el puerto con 30 amarres
        // ver por que guarda el ultimo
        
        for (int i = 1; i < 30 + 1; i++) {
            Amarre am = new Amarre();
            am.setNum(i);
            am.setLibre(true);
            amarres.add(am);
        }

        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("________________________");
        System.out.println("      BIENVENIDOS       ");
        System.out.println("________________________");
        System.out.println("");
//        System.out.print("Ingrese la cantidad de amarres totales del puerto: ");
//        int cantAmarres = leer.nextInt();
//        Amarre am = new Amarre();
//        for (int i = 1; i < cantAmarres + 1; i++) {
//            am.setNum(i);
//            am.setLibre(true);
//            amarres.add(am);
//        }
        do {
            System.out.println("1. CARGAS");
            System.out.println("2. ALQUILER");
            System.out.println("3. CONSULTAS");
            System.out.println("4. SALIR");
            x = leer.nextInt();
            switch (x) {
                case 1:
                    MenuCargas();
                 System.out.println("\033[H\033[2J");
        System.out.flush();
                    break;
                case 2:
                    Alquilar();
                  System.out.println("\033[H\033[2J");
        System.out.flush();
                    break;
                case 3:
                    //consultas tipo consulta por cliente, por barco, por amarre
                    Consultas();
                    System.out.println("\033[H\033[2J");
        System.out.flush();
                    break;

            }

        } while (x != 4);
    }

    private void MenuCargas() {
       System.out.println("\033[H\033[2J");
       // System.out.flush();
       
        do {
              System.out.println("");
        System.out.println("");
        System.out.println("");
            System.out.println("1. NUEVO BARCO");
            System.out.println("2. NUEVO CLIENTE");
            System.out.println("3. CARGAS MASIVAS");
            System.out.println("4. VOLVER");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    MenuNuevoBarco();
                    break;
                case 2:
                    Cliente c = new Cliente();
                    c.crearCliente();
                    clientes.add(c);
                    break;
                case 3:
                    System.out.print("Cantidad de Veleros a crear: ");
                    int cantv =leer.nextInt();
                                      
                    
                    for (int i = 1; i < cantv + 1; i++) {
                        Velero v = new Velero();
                        v.fabricaVeleros(i);                        
                        veleros.add(v);
                    }
                    System.out.println("Veleros creados");
                    System.out.println("------------------------");

                    System.out.print("Cantidad de Barcos a Motor a crear: ");
                    int cantbm = leer.nextInt();
                    
                    for (int i = 1; i < cantbm + 1; i++) {
                        BarcoMotor bm = new BarcoMotor();
                        bm.fabricaBarcoMotor(i);
                        barcosAMotor.add(bm);
                    }
                    System.out.println("Barcos a motor creados");
                    System.out.println("------------------------");

                    System.out.print("Cantidad de Yates a crear: ");
                    int canty = leer.nextInt();
                  
                    for (int i = 1; i < canty + 1; i++) {
                        Yate y = new Yate();
                        y.FabricaYates(i);
                        yates.add(y);
                    }
                    System.out.println("Yates creados");
                    break;
            }

        } while (op != 4);
    }

    private void MenuNuevoBarco() {

        do {
            System.out.println("1. Velero");
            System.out.println("2. A motor");
            System.out.println("3. Yate");
            System.out.println("4. VOLVER");
            ob = leer.nextInt();
            switch (ob) {
                case 1:
                    Velero v = new Velero();
                    v.crearVelero();
                    veleros.add(v);
                    break;
                case 2:
                    BarcoMotor bm = new BarcoMotor();
                    bm.crearBarcoMotor();
                    barcosAMotor.add(bm);
                    break;
                case 3:
                    Yate y = new Yate();
                    y.CrearYate();
                    yates.add(y);
                    break;
            }
        } while (ob != 4);

    }

    private void Alquilar() {
    System.out.println("\033[H\033[2J");
        System.out.flush();
          System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.print("Ingrese el DNI del cliente: ");
        int dni = leer.nextInt();
        int busqueda = 0;
        Cliente c = new Cliente();
        Barco barcoElegido=new Barco();
        float precio=0;
        
        for (Cliente clientesaux : clientes) {
            if (clientesaux.getDni() == dni) {
                System.out.println("Nombre: " + clientesaux.getNombre());
                busqueda = 1;//aca quiero guardar en busqueda el index del array con indexof no puedo.
                c.setNombre(clientesaux.getNombre());
                c.setDni(dni);
            }
        }
        if (busqueda == 0) {
            System.out.println("No se encontro el cliente");
            System.out.println("Ingrese el nombre: ");
            String nom = leer.next();
            c.setDni(dni);
            c.setNombre(nom);        
            clientes.add(c);
        }
        System.out.println("Fecha de inicio del alquiler: ");
        System.out.print("Dia: ");
        int dia = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt()-1;
        System.out.print("Año (2022): ");
        int ano = leer.nextInt()-1900;

        Date fechaini = new Date(ano, mes, dia);


        System.out.println("Fecha devolución: ");
        System.out.print("Dia: ");
        int diad = leer.nextInt();
        System.out.print("Mes: ");
        int mesd = leer.nextInt()-1;
        System.out.print("Año (2022): ");
        int anod = leer.nextInt()-1900;
        Date fechadev = new Date(anod, mesd, diad);
        
        int cantDiasAlq = CalcularDias (fechaini, fechadev);
        // int cantidadDiasAlquiler= quiero guardar la cantidad de dias
        //Date cantDias = fechadev-fechaini; NO QUIERO HACER IF ENCADENADOS
        System.out.println("Amarres libre: ");
   
        for (Amarre amarresaux : amarres) {
            if (amarresaux.isLibre()) {
                System.out.println(amarresaux);
            } 
        }
        System.out.print("Ingrese n° de amarre elegido: ");
        int amarrenum = leer.nextInt()-1; 
        amarres.get(amarrenum-1).setLibre (false);  
        Amarre ae=amarres.get(amarrenum);
     
        System.out.println("Elija un barco: ");
        System.out.println("");
        System.out.println("1. Velero");
        System.out.println("2. A motor");
        System.out.println("3. Yate");
        int ob2 = leer.nextInt();
        int barElegido=0;
        switch (ob2) {
            case 1:
                System.out.println("Veleros disponibles");
                for (Velero velero : veleros) {
                    if (velero.isDisponible()) {
                        System.out.println(velero);
                    }
                }
                System.out.println("N° Eleccion: ");
                barElegido=leer.nextInt()-1;
                veleros.get(barElegido).setDisponible(false);                 
                Velero veleroElegido = veleros.get(barElegido);  
                barcoElegido=veleroElegido;
                precio=cantDiasAlq*veleroElegido.valorModulo();
                System.out.println("el valor de alquiler es de: " + precio);
                
                break;
            case 2:
                 System.out.println("Barcos a motor disponibles");
                for (BarcoMotor aMotor: barcosAMotor) {
                    if (aMotor.isDisponible()) {
                        System.out.println(aMotor);
                    }
                }
                System.out.println("N° Eleccion: ");
                barElegido=leer.nextInt()-1;
                barcosAMotor.get(barElegido).setDisponible(false);                
               BarcoMotor barcoMotorElegido = barcosAMotor.get(barElegido); 
               barcoElegido=barcoMotorElegido;
               precio=cantDiasAlq*barcoMotorElegido.valorModulo();
               System.out.println("el valor de alquiler es de: " + precio);
                break;
            case 3:
                System.out.println("Yates disponibles");
                for (Yate yateaux: yates) {
                    if (yateaux.isDisponible()) {
                        System.out.println(yateaux);
                    }
                }
                System.out.println("N° Eleccion: ");
                barElegido=leer.nextInt()-1;
                yates.get(barElegido).setDisponible(false);                
                Yate yateElegido = yates.get(barElegido);
                barcoElegido=yateElegido;                
                precio=cantDiasAlq*yateElegido.valorModulo();
                System.out.println("el valor de alquiler es de: " + precio);
                break;                
        }    
        
        Alquiler al=new Alquiler(c, fechaini, fechadev, ae, barcoElegido, precio);
        alquileres.add(al);       
        System.out.println("Se alquiló correctamente");
    }
    
    public int CalcularDias (Date fechaini, Date fechafin){
      
        int diferencia = (int) ((fechafin.getTime() - fechaini.getTime())/1000/60/60/24);
       
        System.out.println("cantidad de dias a alquilar: " + diferencia);
        return diferencia;
        
    }
    
    public void Consultas(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("******************************");
        System.out.println("1. ver Clientes");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
        System.out.println("******************************");
        System.out.println("2. ver Barcos");
        System.out.println("VELEROS:");
        for (Velero velero : veleros) {
            System.out.println(velero);
        }
        System.out.println("A MOTOR:");
        for (BarcoMotor barcoaux : barcosAMotor) {
            System.out.println(barcoaux);
        }System.out.println("YATES:");
        for (Yate yateaux : yates) {
            System.out.println(yateaux);
        }
                
        
        System.out.println("******************************");
        System.out.println("3. ver Alquileres");
        for (Alquiler alquileraux : alquileres) {
            System.out.println(alquileraux);   
        }
        System.out.println("******************************");
    }
    
    
//    public static Calendar StringToCalendar(String time, String format) {
//                Calendar calendar = Calendar.getInstance();
//                SimpleDateFormat dateformat = new SimpleDateFormat(format);
//                try {
//                        calendar.setTime(dateformat.parse(time));
//                        return calendar;
//                } catch (Exception e) {
//                        return calendar;
//                }
//        }
////public static Calendar StringToCalendar(String time, String format) {
//                Calendar calendar = Calendar.getInstance();
//                SimpleDateFormat dateformat = new SimpleDateFormat(format);
//                try {
//                        calendar.setTime(dateformat.parse(time));
//                        return calendar;
//                } catch (Exception e) {
//                        return calendar;
//                }
//        }

}
