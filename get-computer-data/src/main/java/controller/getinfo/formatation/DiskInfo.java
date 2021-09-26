package controller.getinfo.formatation;

import controller.LoocaApi;

import java.util.ArrayList;
import java.util.List;

public class DiskInfo {

    List<Double> listDiskOfReadBytes = new ArrayList<Double>();

    public List<Double> getDisk() {
        List<Double> listdisk = createListdisk();
        return listdisk;
    }

    List<Double> createListdisk() {

        LoocaApi looca = new LoocaApi();
        Integer numberOfDisk = looca.getLoocaApiConsult().getGrupoDeDiscos().getDiscos().size();
        Double byteOfRead;

        for(Integer i = 0; i < numberOfDisk; i++) {
            byteOfRead = looca.getLoocaApiConsult().getGrupoDeDiscos().getDiscos().get(i).getBytesDeEscritas().doubleValue();
           this.listDiskOfReadBytes.add(byteOfRead);
        }

        return listDiskOfReadBytes;
    }

}
