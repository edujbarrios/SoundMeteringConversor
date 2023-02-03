import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean exit = false;

    while (!exit) {
      System.out.println("1. Convertir de LUFS a dB");
      System.out.println("2. Convertir de dB a LUFS");
      // Funcionalidades extra:
      System.out.println("3. Convertir de BPM a milisegundos");
      System.out.println("4. Convertir de milisegundos a BPM");
      System.out.println("5. Salir");
      System.out.print("Selecciona una opción: ");
      int option = scan.nextInt();

      switch (option) {
        case 1:
          System.out.print("Introduce los LUFS: ");
          double lufs = scan.nextDouble();
          System.out.println(lufs + " LUFS = " + (lufs + (-70)) + " dB");
          break;
        case 2:
          System.out.print("Introduce los dB: ");
          double dB = scan.nextDouble();
          System.out.println(dB + " dB = " + (dB - (-70)) + " LUFS");
          break;
        case 3:
          System.out.print("Introduce los BPM: ");
          double bpm = scan.nextDouble();
          System.out.println(bpm + " BPM = " + (60 / bpm) * 1000 + " milisegundos");
          break;
        case 4:
          System.out.print("Introduce los milisegundos: ");
          double ms = scan.nextDouble();
          System.out.println(ms + " milisegundos = " + (60 * 1000) / ms + " BPM");
          break;
        case 5:
          exit = true;
          break;
        default:
          System.out.println("Opción inválida, intenta de nuevo.");
          break;
      }
    }
  }
}
