package controller.getinfo;

import controller.LoocaApi;

public class GetRam {
    private Double ramAvailable;
    private Double ramInUse;
    private Double totalRam;

    public GetRam() {
        LoocaApi loocaApi = new LoocaApi();

        this.ramAvailable = loocaApi.getLoocaApiConsult().getMemoria().getDisponivel().doubleValue() / 1073741824;
        this.ramInUse = loocaApi.getLoocaApiConsult().getMemoria().getEmUso().doubleValue() / 1073741824;
        this.totalRam = loocaApi.getLoocaApiConsult().getMemoria().getTotal().doubleValue() / 1073741824;
    }

    public Double getRamAvailable() { return ramAvailable; }

    public Double getRamInUse() {
        return ramInUse;
    }

    public Double getTotalRam() {
        return totalRam;
    }
}
