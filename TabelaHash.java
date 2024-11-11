import java.util.HashMap;

public class TabelaHash {

    public static void main(String[] args) {

        // Criando um HashMap para armazenar IDs de usuários e seus nomes

        HashMap<String, String> usuarios = new HashMap<>();

        // Adicionando pares chave-valor ao HashMap

        usuarios.put("12345", "João Silva");
        usuarios.put("67890", "Maria Santos");
        usuarios.put("11223", "Carlos Oliveira");
        usuarios.put("44556", "Ana Souza");

        // Buscando um usuário pelo ID

        String idBuscado = "11223";

        if (usuarios.containsKey(idBuscado)) {
            System.out.println("Usuário encontrado: " + usuarios.get(idBuscado));
        } else {
            System.out.println("Usuário não encontrado.");
        }

        // Exibindo todos os pares chave-valor no HashMap

        System.out.println("\nLista de todos os usuários:");
        for (String id : usuarios.keySet()) {
            System.out.println("ID: " + id + ", Nome: " + usuarios.get(id));
        }

    }

}