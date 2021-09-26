package Application;

import controller.getinfo.GetDisc;
import controller.getinfo.GetRam;

public class Main {
    public static void main(String[] args) {
        GetRam ramInfo = new GetRam();
        GetDisc discInfo = new GetDisc();

        System.out.println("Coleta de ram:");

        System.out.println(String.format("Ram total: %.2f",ramInfo.getTotalRam()));
        System.out.println(String.format("Ram em uso: %.2f",ramInfo.getRamInUse()));
        System.out.println(String.format("Ram livre: %.2f",ramInfo.getRamAvailable()));

        System.out.println(String.format("Numero de discos: %d",discInfo.getNumberOfDisks()));
        System.out.println(String.format("Tamaho total disco: %.2f",discInfo.getDiskSize()));
        System.out.println(String.format("Byte escrita: %.2f",discInfo.listDiskOfReadBytes().get(0)));
    }
}
