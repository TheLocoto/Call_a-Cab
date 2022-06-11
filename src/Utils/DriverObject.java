package Utils;

import Model.Driver;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is for only instance objects of class Driver
 * also for can use it in main
 */
public class DriverObject {
    Driver estebanArce = new Driver("Esteban Arce", 45215257, 7584589, 25, true);
    Driver marioEscalera = new Driver("Mario Escalera", 46521578, 6895475, 28, true);
    Driver andreaMamani = new Driver("Andrea Mamani", 48798585, 79545845, 23, true);
    Driver carlosEscalante = new Driver("Carlos Escalante", 45554789, 7554212, 19, true);
    Driver jhonCena = new Driver("Jhon Cena", 42523658, 7968545, 29, true);
    Driver marioColque = new Driver("Mario Colque", 49957852, 6988896, 35, true);
    Driver sergioContreras = new Driver("Sergio Contreras", 44142547, 7542556, 42, false);
    Driver jimenaRocha = new Driver("Jimena Rocha", 44456789, 6993515, 31, false);
    Driver gabrielaBerrios = new Driver("Gabriela Berrios", 42415445, 7668954, 29, true);
    Driver mateoEscalera = new Driver("Mateo Escalera", 44569785, 6521445, 45, false);


    /**
     * This method is collect all drivers in a collectDriversDataBase list and can
     * will ussed in future with the program.
     */
    public void collectDriversDataBase()
    {
        List<Driver> driversDataBase = new ArrayList<>();
        driversDataBase.add(estebanArce);
        driversDataBase.add(marioEscalera);
        driversDataBase.add(andreaMamani);
        driversDataBase.add(carlosEscalante);
        driversDataBase.add(jhonCena);
        driversDataBase.add(marioColque);
        driversDataBase.add(sergioContreras);
        driversDataBase.add(jimenaRocha);
        driversDataBase.add(gabrielaBerrios);
        driversDataBase.add(mateoEscalera);
    };
}

