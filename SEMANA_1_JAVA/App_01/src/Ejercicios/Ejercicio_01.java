public class Main {
    public static void main(String[] args) {
        
        int[][][] edificios = new int[3][9][3];
        for (int edificio = 0; edificio < 3; edificio++) {
            for (int piso = 0; piso < 9; piso++) {
                for (int cuarto = 0; cuarto < 3; cuarto++) {
                    
                    int numeroDeCuarto = ((edificio + 1) * 100) + ((piso + 1) * 10) + (cuarto + 1);

                    edificios[edificio][piso][cuarto] = numeroDeCuarto;
                }
            }
        }

  
        for (int edificio = 0; edificio < 3; edificio++) {
            System.out.println("Edificio " + (edificio + 1) + ":");
            for (int piso = 0; piso < 9; piso++) {
                for (int cuarto = 0; cuarto < 3; cuarto++) {
                    System.out.print(edificios[edificio][piso][cuarto] + " ");
                }
                System.out.println(); 
            }
            System.out.println(); 
        }
    }
}
