public class Lasagna{
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int min){
        return 40 - min;
    }
    public int preparationTimeInMinutes(int layers){
        return 2 * layers;
    }
    public int totalTimeInMinutes(int layers, int min){
        return preparationTimeInMinutes(layers) + min;
    }
}