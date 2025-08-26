package br.com.provaPOO.main;

import br.com.provaPOO.service.HotelService;
import br.com.provaPOO.view.Interface;

public class Main {
    public static void main(String[] args) {
        HotelService service = new HotelService();
        Interface ui = new Interface(service);
        ui.iniciar();
    }
}
