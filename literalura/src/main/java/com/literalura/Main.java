package com.literalura;

import com.literalura.service.LivroService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LivroService service = new LivroService(scanner);
        service.menu();
    }
}
