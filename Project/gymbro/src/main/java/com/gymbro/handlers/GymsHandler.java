package com.gymbro.handlers;

import com.gymbro.Main;
import com.gymbro.city.controller.GymController;
import com.gymbro.file.Parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GymsHandler{

    private GymsHandler(){}

    public static List<GymController> load(){
        try{
            String path = Objects.requireNonNull(Main.class.getResource("assets/layout.zip")).getPath();
            Parser.openFilePath(path, "layout");
            Parser.consume('{');

            ArrayList<GymController> gyms = new ArrayList<>();

            Parser.consumeBeginObjectProperty("GymModels");
            Parser.skipWhitespace();

            if(Parser.peek() == '"'){
                gyms.add(Parser.parseGymModel());
                while(Parser.peek() == ','){
                    Parser.consume(',');
                    Parser.skipWhitespace();
                    gyms.add(Parser.parseGymModel());
                }
                Parser.skipWhitespace();
            }
            Parser.consumeEndObjectProperty();

            gyms.forEach(GymController::makeInteractive);

            Parser.skipWhitespace();
            Parser.consume('}');
            return gyms;
        }
        catch(Exception e){ e.printStackTrace();}
        return null;
    }
}
