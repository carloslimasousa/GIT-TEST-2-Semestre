package controller.getinfo;

import controller.LoocaApi;
import controller.getinfo.formatation.DiskInfo;

import java.util.List;

public class GetDisc {
    private Integer numberOfDisks;
    private Double diskSize;
    private List<Double> listDiskOfReadBytes;

    public GetDisc() {
        LoocaApi loocaApi = new LoocaApi();
        DiskInfo diskInfoclass = new DiskInfo();

        this.numberOfDisks = loocaApi.getLoocaApiConsult().getGrupoDeDiscos().getQuantidadeDeDiscos();
        this.diskSize = loocaApi.getLoocaApiConsult().getGrupoDeDiscos().getTamanhoTotal().doubleValue() / 1073741824;
        this.listDiskOfReadBytes = diskInfoclass.getDisk();

    }

    public Integer getNumberOfDisks() {
        return numberOfDisks;
    }
    public Double getDiskSize() { return diskSize; }
    public List<Double> listDiskOfReadBytes() { return (List<Double>) listDiskOfReadBytes; }
}
