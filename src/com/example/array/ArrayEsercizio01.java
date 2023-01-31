package com.example.array;

public class ArrayEsercizio01 {
	
	public static void main(String[] args) {
        String[] array = {"Buongiorno", "a tutti", "in un altro momento", "a tutti", "Buonanotte"};
        
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
	
}
