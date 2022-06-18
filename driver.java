package kegiatan3;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class driver {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) throws InterruptedException {
        int pilih;
        int ronde = 1;
        String name, musuh;

        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang Dipertarungan");
        hero hero[] = new hero[2];
        System.out.println("-----------------------------------------");
        System.out.print("Silahkan Masukan Nama Hero kamu : ");
        name = input.nextLine();
        System.out.print("Silahkan Masukan Nama Hero musuh : ");
        musuh = input.nextLine();
        for (int i = 0; i < 2; i++) {
            clearScreen();
            System.out.println("SILAHKAN PILIH ROLE HERO");
            System.out.println("1. Assassin");
            System.out.println("2. Tank");
            System.out.println("3. Mage");
            System.out.print("Pilih hero ke - " + (i + 1) + ": ");
            pilih = input.nextInt();
            if (i == 0) {
                if (pilih == 1) {
                    hero[i] = new Assassin(new Random().nextInt(100), name);
                } else if (pilih == 2) {
                    hero[i] = new tank(new Random().nextInt(100), name);
                } else if (pilih == 3) {
                    hero[i] = new mage(new Random().nextInt(100), name);
                }
            } else {
                if (pilih == 1) {
                    hero[i] = new Assassin(new Random().nextInt(100), musuh);
                } else if (pilih == 2) {
                    hero[i] = new tank(new Random().nextInt(100), musuh);
                } else if (pilih == 3) {
                    hero[i] = new mage(new Random().nextInt(100), musuh);
                }
            }
        }
        hero[0].checkStatus();
        hero[1].checkStatus();

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("PERTANDINGAN DIMULAI");
        do {
            System.out.println();
            System.out.println("Loading.....");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("RONDE " + ronde++);
            System.out.println(hero[0].name + " menyerang");
            hero[0].attack(hero[1]);
            if (hero[1].healthPoint <= 0) {
                System.out.println("HERO " + hero[1].name + " MATI");
                break;
            }

            System.out.println("Loading.....");
            TimeUnit.SECONDS.sleep(1);
            System.out.println(hero[1].name + " menyerang");
            hero[1].attack(hero[0]);
            if (hero[0].healthPoint <= 0) {
                System.out.println("HERO " + hero[0].name + " MATI");
                break;
            }
        } while (hero[0].healthPoint > 0 || hero[1].healthPoint > 0);
        input.close();
    }
}
