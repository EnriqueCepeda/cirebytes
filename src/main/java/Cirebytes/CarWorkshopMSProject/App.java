package Cirebytes.CarWorkshopMSProject;

import Cirebytes.CarWorkshopMSProject.Domain.Box;
import Cirebytes.CarWorkshopMSProject.Domain.Mechanic;
import Cirebytes.CarWorkshopMSProject.Domain.PartList;

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
        System.out.println( "Everything created" );
    }
}
