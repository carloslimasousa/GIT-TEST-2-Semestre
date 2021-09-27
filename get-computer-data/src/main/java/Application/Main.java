<<<<<<< HEAD
package Application;

import com.github.britooo.looca.api.core.Looca;
import domain.getinfo.GetDisc;
import domain.getinfo.GetRam;

public class Main {
    public static void main(String[] args) {
        Looca looca = new Looca();
        GetRam ramInfo = new GetRam();
        GetDisc discInfo = new GetDisc();

        System.out.println("Coleta de ram:");

        System.out.println(String.format("Ram total: %.2f",ramInfo.getTotalRam()));
        System.out.println(String.format("Ram em uso: %.2f",ramInfo.getRamInUse()));
        System.out.println(String.format("Ram livre: %.2f",ramInfo.getRamAvailable()));

        System.out.println(String.format("Numero de discos: %d",discInfo.getNumberOfDisks()));
        System.out.println(String.format("Tamaho total disco: %.2f",discInfo.getDiskSize()));
        System.out.println(String.format("Byte escrita: %.2f",discInfo.listDiskOfReadBytes().get(0)));

        System.out.println(looca.getGrupoDeDiscos().getDiscos());
    }
}
=======
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
>>>>>>> 2b9db78a9cafb525f4e0d7e7069fb7b4ed41ac81
