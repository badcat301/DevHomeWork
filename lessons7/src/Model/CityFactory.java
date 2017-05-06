package Model;


import Exeptions.CityNotFoundException;

public class CityFactory  {
   public City getCity(String c) throws CityNotFoundException {


       if("LA".equals(c)){
           return new LACity();
       }
       else if ("Paris".equals(c)){
           return new ParisCity();
       }
       else if("Krasnodar".equals(c))
       {

       }
 throw new CityNotFoundException("City not Found!!!!!");



   }
}
