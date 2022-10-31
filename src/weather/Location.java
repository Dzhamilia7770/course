package weather;

public class Location {
    public static void main(String[] arg) {
        String city = "Kyiv";
        String weatherIn = "Weather in ";
        int temp = 4;
        System.out.println(weatherIn + city + " today:");
        System.out.println("+" + temp);


        temp = 10;
        System.out.println(weatherIn + city + " tomorrow:");
        System.out.println("+" + temp);


    }

}
