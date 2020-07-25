package homeworks.exerciseVehicle;

public interface Transport {

    default String transportFromTo(String from, String to) {
        return "Transport start from " + from + " and goes to " + to;
    }


}
