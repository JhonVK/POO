package classes;

import java.util.ArrayList;
import java.util.List;

public class Patio {
    private static List<Caminhao> caminhoes = new ArrayList<>();

    public static void comprarCaminhao(Caminhao caminhao) throws PatioCheioException {
        if (caminhoes.size() < 10) {
            caminhoes.add(caminhao);
        } else {
            throw new PatioCheioException("Não há espaço disponível no pátio para mais caminhões.");
        }
    }

    public void venderCaminhao(int id) throws IdException {
        Caminhao caminhao = null;
        for (Caminhao c : caminhoes) {
            if (c.getId() == id) {
                caminhao = c;
                break;
            }
        }
        if (caminhao != null) {
            caminhoes.remove(caminhao);
            System.out.println("Caminhão de ID " + id + " vendido.");
        } else {
            throw new IdException("ID não encontrado.");
        }
    }
    public static List<Caminhao> getCaminhoes() {
        return new ArrayList<>(caminhoes); // Retorna uma cópia da lista para evitar modificações externas
    }
    public void imprimirCaminhoes() {
        if (caminhoes.isEmpty()) {
            System.out.println("Não há caminhões no pátio.");
        } else {
            for (Caminhao c : caminhoes) {
                System.out.println(c);
            }
        }
    }
}
