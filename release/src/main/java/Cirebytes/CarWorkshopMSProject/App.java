package Cirebytes.CarWorkshopMSProject;

import Cirebytes.CarWorkshopMSProject.Domain.Box;
import Cirebytes.CarWorkshopMSProject.Domain.Mechanic;
import Cirebytes.CarWorkshopMSProject.Domain.PartList;
import Cirebytes.CarWorkshopMSProject.Domain.Statistics_Gestor;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        new Box();
        new Mechanic();
        new PartList();
        new Statistics_Gestor();
        System.out.println( "Everything created" );
    }
}
