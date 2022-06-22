package jana60.shop;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int numero;
		int selezione, grandezzaPollici, memoria;
		double iva, prezzo;
		String marca, colore, codice, risoluzione;
		boolean wireless = false, smart = false;
		int smartInt, wirelessInt;
		Scanner scan = new Scanner(System.in);
		System.out.println("inserisci prodotti da aggiungere, inserisci -1 per annullare");
		numero = Integer.parseInt(scan.nextLine());
		do {
			Prodotti[] numeroArray = new Prodotti[numero];
			for (int i = 0; i < numero; i++) {
				System.out.println("Inserisci cosa aggiungere : 1 per smartphone, 2 per televisioni, 3 per cuffie:");
				selezione = Integer.parseInt(scan.nextLine());
				switch (selezione) {
				case 1:
					System.out.println("Hai selezionato Smartphone! digita la marca:");
					marca = scan.nextLine();
					System.out.println("digita prezzo e iva:");
					prezzo = scan.nextDouble();
					iva = scan.nextDouble();
					System.out.println("digita codice e taglio di memoria");
					scan.nextLine();
					codice = scan.nextLine();
					memoria = Integer.parseInt(scan.nextLine());
					Smartphone smartphone = new Smartphone(marca, prezzo, iva, codice, memoria);
					numeroArray[i] = smartphone;
					break;
				case 2:
					System.out.println("Hai selezionato Televisione! digita la marca:");
					marca = scan.nextLine();
					System.out.println("digita prezzo e iva:");
					prezzo = scan.nextDouble();
					iva = scan.nextDouble();
					System.out.println("digita grandezza e la risoluzione");
					scan.nextLine();
					grandezzaPollici = Integer.parseInt(scan.nextLine());
					risoluzione = scan.nextLine();
					System.out.println("digita il codice:");
					codice = scan.nextLine();
					System.out.println("digita 1 se é smart");
					smartInt = Integer.parseInt(scan.nextLine());
					if (smartInt == 1)
						smart = true;
					Televisione televisione = new Televisione(marca, prezzo, iva, codice, grandezzaPollici, risoluzione,
							smart);
					numeroArray[i] = televisione;
					break;
				case 3:
					System.out.println("Hai selezionato Cuffie! digita la marca:");
					marca = scan.nextLine();
					System.out.println("digita prezzo e iva:");
					prezzo = scan.nextDouble();
					iva = scan.nextDouble();
					System.out.println("digita il colore");
					scan.nextLine();
					colore = scan.nextLine();
					System.out.println("digita il codice:");
					codice = scan.nextLine();
					System.out.println("digita 1 se é wireless");
					wirelessInt = Integer.parseInt(scan.nextLine());
					if (wirelessInt == 1)
						wireless = true;
					Cuffie cuffie = new Cuffie(marca, prezzo, iva, codice, colore, wireless);
					numeroArray[i] = cuffie;
					break;
				}
			}
			for (int i = 0; i < numero; i++) {
				System.out.println(numeroArray[i]);
			}

		} while (numero == -1);

		// Prodotti telefono1 = new Smartphone("apple", 500.90, 0.21, "smartphone 1",
		// 128);
		// Prodotti sonytv = new Televisione("Sony", 865.44, 0.32, "124312541", 52,
		// "4k", true);
		// Prodotti xiaomi = new Cuffie("Xiaomi", 15.33, 0.21, "1241234", "blu", false);
		// System.out.println(sonytv);
		// System.out.println(telefono1);
		// System.out.println(xiaomi);
		scan.close();

	}

}
