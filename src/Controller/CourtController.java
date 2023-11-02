package Controller;
import Model.Court;
import java.util.ArrayList;

public class CourtController {
    public static ArrayList<Court> getCourts(Boolean onlyAvailable){
        return Court.getCourts(onlyAvailable);
    }
    
    public static void createCourt(String notes, int active){
        Court.createCourt(notes, active);
    }
}
