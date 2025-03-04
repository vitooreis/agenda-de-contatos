package tools;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RegexValidator {

    private final Scanner scanner;

    public RegexValidator(Scanner scanner) {
        this.scanner = scanner;
    }

    public String validateOnlyLettersName() {
        while (true) {
            try {
                System.out.print("Digite o nome do contato: ");
                String name = scanner.nextLine().trim();

                if (!name.matches("^[A-Za-zÀ-ÿ ]+$")) {
                    throw new InputMismatchException("Erro: O nome deve conter apenas letras e espaços.");
                }

                return name;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String validateOnlyNumbersPhone() {
        while (true) {
            try {
                System.out.print("Digite o telefone do contato: ");
                String phoneNumber = scanner.nextLine().trim();

                if (!phoneNumber.matches("^\\d{8,15}$")) {
                    throw new InputMismatchException("Erro: O telefone deve conter apenas números e ter entre 8 e 15 dígitos.");
                }

                return phoneNumber;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String validateEmailFormat() {
        while (true) {
            try {
                System.out.print("Digite o e-mail do contato: ");
                String email = scanner.nextLine().trim();

                if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                    throw new InputMismatchException("Erro: Formato de e-mail inválido.");
                }

                return email;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}


