package functionalprogramming.optionals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class OptionalChallenge {
    public static void main(String[] args) {
        List<Client> clients = getClients();

        System.out.println("-----Bienvenido a Envios TodoCode-----");
        System.out.println("Ingrese el número de cliente a enviar un paquete");
        Scanner sc = new Scanner(System.in);
        Long keyboard = sc.nextLong();

        Optional<Client> firstClientFound = getClient(clients, keyboard);

        // Check Client.
        if (firstClientFound.isPresent()) {
            Optional<String> address = getAddress(firstClientFound);
            if (address.isPresent()) {
                System.out.println("The client's address is: " + address.get());
            }else  {
                System.out.println("The client does not have address yet");
            }
        }else {
            System.out.println("The client does not exist.");
        }
    }

    public static Optional<String> getAddress(Optional<Client> client) {
        return client.map(Client::getAddress);
    }

    public static Optional<Client> getClient(List<Client> clients, Long id) {
        Optional<Client> firstClientFound = clients
                .stream()
                .filter(client -> client.getClientID().equals(id))
                .findFirst();
        return firstClientFound;
    }

    public static List<Client> getClients() {
        List<Client> clients = Arrays.asList(
                new Client(1L, "Juan", "Pérez", null, "1111-1111"),
                new Client(2L, "María", "Gómez", "Av. Siempre Viva 742", "2222-2222"),
                new Client(3L, "Carlos", "López", "Mitre 100", "3333-3333"),
                new Client(4L, "Lucía", "Martínez", "Belgrano 456", "4444-4444"),
                new Client(5L, "Ana", "Fernández", "San Martín 789", "5555-5555"),
                new Client(6L, "Pedro", "Sánchez", null, "3333-4444"),
                new Client(7L, "Laura", "Díaz", "Corrientes 202", "7777-7777"),
                new Client(8L, "Diego", "Ramírez", null, "8888-8888"),
                new Client(9L, "Suscribite", "Todocode", "Internet 404", "9999-9999"),
                new Client(10L, "Valeria", "Acosta", null, "0000-0000")
        );
        return clients;
    }
}
