import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Volume vol = new Volume();
        Scanner scanear = new Scanner(System.in);
        System.out.println("Insira um valor a: ");
        vol.setA(scanear.nextFloat());

        System.out.println("Insira um valor b: ");
        vol.setB(scanear.nextFloat());

        System.out.println("Insira um valor c: ");
        vol.setC(scanear.nextFloat());

        System.out.println("Insira um valor r: ");
        vol.setR(scanear.nextFloat());

        System.out.println("Insira um valor h: ");
        vol.setH(scanear.nextFloat());

        System.out.println("Valor do cubo: " + vol.getCubo());

        System.out.println("Valor do prisma: " + vol.getPrisma());

        System.out.println("Valor do cilindro: " + vol.getCilindro());

        System.out.println("Valor do esfera: " + vol.getEsfera());

        System.out.println("Valor do cone: " + vol.getCone());

        System.out.println("Valor do piramide: " + vol.getPiramide());
    }
}