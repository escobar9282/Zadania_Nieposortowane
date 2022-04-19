package com.zadania_nieposortowane.TotoLotek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OprNaLiczbach {
    public void wyszukajLiczby(BufferedReader in) throws IOException {
        String str;
        int[] tabl = sprawdzListeLiczb();
        while ((str = in.readLine()) != null) {
            int[] numbers = zamianaStrNaInt(str);
            Arrays.sort(tabl);
            if (Arrays.equals(tabl, numbers)) {
                wyswietlWiadomosc("Znaleziono! Data losowania: " + wyswietlDate(str));
            }
        }
    }

    public int[] sprawdzListeLiczb() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        wyswietlWiadomosc("Podaj liczby z zakresu 1-49: ");
        int[] tabl = new int[6];
        for (int i = 0; i < tabl.length; i++) {
            tabl[i] = sprawdzLiczbe(br);
        }
        return tabl;
    }

    public int sprawdzLiczbe(BufferedReader br) throws IOException {
        boolean poprawnie = false;
        int j = 0;
        do {
            try {
                j = Integer.parseInt(br.readLine());
                if (j < 1 || j > 49) {
                    throw new InvalidNumber();
                } else {
                    poprawnie = true;
                }
            } catch (NumberFormatException nfe) {
                wyswietlBlad("Niewłaściwa liczba!");
            } catch (InvalidNumber e) {
                wyswietlBlad("Liczba poza zakresem");
            }
        } while (!poprawnie);
        return j;
    }

    public int[] zamianaStrNaInt(String str) {
        String[] tab = str.substring(str.lastIndexOf(" ") + 1).split(",");
        int[] numbers = new int[6];
        for (int i = 0; i < tab.length; i++) {
            numbers[i] = Integer.parseInt(tab[i]);
        }
        Arrays.sort(numbers);
        return numbers;
    }

    public String wyswietlDate(String str) {
        return str.substring(str.indexOf(" ") + 1, str.lastIndexOf(" ") + 1);
    }

    public void wyswietlWiadomosc(String wiad) {
        System.out.println(wiad);
    }

    public void wyswietlBlad(String blad) {
        System.err.println(blad);
    }
}