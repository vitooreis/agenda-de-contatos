package application;

import model.entities.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactManager {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Contact> contactList = new ArrayList<>();

        while (true) {
            showMenu();
            System.out.print("\nEscolha uma opção: ");

            int option;
            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um número válido.");
                continue;
            }

            switch (option) {
                case 1:
                    addContact(contactList, scanner);
                    break;
                case 2:
                    listContacts(contactList);
                    break;
                case 3:
                    searchContact(contactList, scanner);
                    break;
                case 4:
                    deleteContact(contactList, scanner);
                    break;
                case 5:
                    System.out.println("Encerrando a agenda...");
                    scanner.close();
                    return;
                default:
                    printLine();
                    System.out.println("Opção Inválida!");
                    printLine();
            }
        }
    }

    public static void showMenu() {
        System.out.println("Menu da agenda de contatos:");
        System.out.println("[1] Adicionar contato");
        System.out.println("[2] Listar os contatos");
        System.out.println("[3] Procurar contato");
        System.out.println("[4] Excluir contato");
        System.out.println("[5] Sair");
    }

    public static void addContact(List<Contact> contactList, Scanner scanner) {
        Contact newContact = Contact.createContact(scanner);
        contactList.add(newContact);

        printLine();
        System.out.println("Contato adicionado com sucesso!");
        printLine();
    }

    public static void listContacts(List<Contact> contactList) {
        printLine();
        if (contactList.isEmpty()) {
            System.out.println("A agenda está vazia.");
            printLine();
            return;
        }

        for (int i = 0; i < contactList.size(); i++) {
            System.out.println("Contato " + (i + 1) + ":");
            System.out.println(contactList.get(i));
            printLine();
        }
    }

    public static void searchContact(List<Contact> contactList, Scanner scanner) {
        System.out.print("Digite o nome do contato que deseja procurar: ");
        String searchName = scanner.nextLine().trim().toLowerCase();

        for (Contact contact : contactList) {
            if (contact.getName().toLowerCase().equals(searchName)) {
                printLine();
                System.out.println("Contato encontrado:");
                System.out.println(contact);
                printLine();
                return;
            }
        }

        printLine();
        System.out.println("Contato não encontrado!");
        printLine();
    }

    public static void deleteContact(List<Contact> contactList, Scanner scanner) {
        System.out.print("Digite o nome do contato que deseja excluir: ");
        String searchName = scanner.nextLine().trim().toLowerCase();

        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getName().toLowerCase().equals(searchName)) {
                contactList.remove(i);
                printLine();
                System.out.println("Contato removido com sucesso!");
                printLine();
                return;
            }
        }

        printLine();
        System.out.println("Contato não encontrado!");
        printLine();
    }

    public static void printLine() {
        System.out.println("------------------------------");
    }
}

