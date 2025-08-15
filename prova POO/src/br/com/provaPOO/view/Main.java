package br.com.provaPOO.view;

import br.com.provaPOO.service.HotelService;

/**
 * Classe de inicialização da aplicação.
 */
public class Main {
    public static void main(String[] args) {
        HotelService service = new HotelService();
        Interface ui = new Interface(service);
        ui.iniciar();
    }
}
