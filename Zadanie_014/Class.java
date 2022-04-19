package com.zadania_nieposortowane.Zadanie_014;

public class Class {

        public static int NWD_2(int pierwsza, int druga)
        {
            if (druga == 0)
            {
                return pierwsza;
            }
            else
            {
                return NWD_2(druga, pierwsza%druga);  // dwóch liczb.
            }
        }
    }

