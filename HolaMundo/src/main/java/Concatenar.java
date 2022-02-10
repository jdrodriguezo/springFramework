
public class Concatenar {
    public static void main(String[] args) {
        String usuario = "juan";
        String saludar = "hola";
        System.out.println(usuario + " " + saludar);
        
        int j = 3;
        int h = 6;
        System.out.println(j + h);
        
        System.out.println(saludar + j + h);
        System.out.println(j + h + saludar);
        System.out.println(saludar + (j + h));// 4 * 8 (1 + 1)
    }
}
