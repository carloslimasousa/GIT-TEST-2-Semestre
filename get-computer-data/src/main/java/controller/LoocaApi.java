package controller;

import com.github.britooo.looca.api.core.Looca;

public class LoocaApi {
    private Looca loocaApiConsult;

    public LoocaApi() {
        this.loocaApiConsult = new Looca();
    }

    public Looca getLoocaApiConsult() {
        return loocaApiConsult;
    }
}
