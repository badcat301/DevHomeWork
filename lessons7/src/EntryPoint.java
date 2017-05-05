import Exeptions.CityNotFoundException;
import Model.City;
import Model.CityFactory;
import util.ConsoleHelper;

public class EntryPoint {
    public static void main(String[] args)  {
        String c = ConsoleHelper.getLine("Enter you city: LA, Paris, Krasnodar");

        CityFactory factory = new CityFactory();
         City city = factory.getCity(c);
try {
    System.out.println(city.getCity());
}catch (CityNotFoundException e){
    System.out.println(e.getMessage());
}




    }
}
