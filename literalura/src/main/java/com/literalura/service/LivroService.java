package com.literalura.service;

import com.literalura.model.Livro;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class LivroService {
    private final ApiService api = new ApiService();
    private final JsonParserService parser = new JsonParserService();
    private final Scanner scanner;

    public LivroService(Scanner scanner) {
        this.scanner = scanner;
    }

    public void menu() {
        while (true) {
            System.out.println("\n===== LiterAlura =====");
            System.out.println("1 - Buscar livro por título");
            System.out.println("2 - Sair");
            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1 -> buscarLivro();
                case 2 -> { return; }
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    private void buscarLivro() {
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        try {
            String json = api.getLivros(titulo);
            List<Livro> livros = parser.parseLivros(json);
            livros.forEach(System.out::println);
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao buscar livros: " + e.getMessage());
        }
    }
}
