package com.gymbro.handlers;

import com.gymbro.Main;
import com.gymbro.city.controller.GymController;
import com.gymbro.city.factory.GymFactory;
import com.gymbro.file.Parser;
import com.gymbro.utils.FileNameException;
import com.gymbro.utils.Places;
import com.gymbro.utils.UnknownGymException;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class GymsHandler{

    private GymsHandler(){}

    public static List<GymController> load(){


        try{
            Parser.openFilePath("config/layout.json");
        }
        catch(FileNameException e){
            e.printStackTrace();
        }

        try{
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
        return Collections.emptyList();
    }

    public GymController createGym(String type, Places location, Integer amountOfEquipment, URL website){
        GymFactory gymFactory = new GymFactory();

        switch(type){
            case "FITINN":
                return gymFactory.createFitinnGym(location, amountOfEquipment, website);
            case "LifeGym":
                return gymFactory.createLifeGymGym(location, amountOfEquipment, website);
            case "Golem":
                return gymFactory.createGolemGym(location, amountOfEquipment, website);
            case "NobelGym":
                return gymFactory.createNobelGymGym(location, amountOfEquipment, website);
            default:
                throw new UnknownGymException("Unexpected value of gym type: " + type);
        }
    }
}
