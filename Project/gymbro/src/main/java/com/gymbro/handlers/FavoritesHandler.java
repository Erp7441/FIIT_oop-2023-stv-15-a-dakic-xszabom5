package com.gymbro.handlers;


import com.gymbro.Main;
import com.gymbro.city.builder.FavoritesBuilder;
import com.gymbro.city.controller.FavoritesController;
import com.gymbro.city.controller.GymController;
import com.gymbro.city.model.FavoritesModel;
import com.gymbro.file.Parser;
import com.gymbro.utils.WriteFileException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * The type Favorites handler.
 */
// TODO:: refactor placement of Favorites MVC package?
public class FavoritesHandler{

    private static FavoritesController favorites = initalizeFavorites();

    private FavoritesHandler(){}

    /**
     * Initalize favorites favorites controller.
     *
     * @return the favorites controller
     */
    public static FavoritesController initalizeFavorites(){
        if(getFavorites() == null) return new FavoritesBuilder().build();
        else return getFavorites();
    }

    /**
     * Get favorites favorites controller.
     *
     * @return the favorites controller
     */
    public static FavoritesController getFavorites(){
        return favorites;
    }

    /**
     * Set favorites.
     *
     * @param favorites the favorites
     */
    public static void setFavorites(FavoritesController favorites){
        FavoritesHandler.favorites = favorites;
    }

    /**
     * Save.
     *
     * @param fileName the file name
     */
    public static void save(String fileName){
        if(getFavorites() == null) return;


        try{
            String path = Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
            String folderPath = path.substring(0, path.lastIndexOf("/") + 1);

            FileOutputStream fos = new FileOutputStream(folderPath + "/" + fileName + ".zip");
            ZipOutputStream zos = new ZipOutputStream(fos);
            zos.putNextEntry(new ZipEntry(fileName + ".json"));

            zos.write("{\n".getBytes()); //? Begin JSON file
            String str = getFavorites().getModel().serialize(1);
            zos.write(str.getBytes());
            zos.write("\n}".getBytes()); //? End JSON file

            zos.closeEntry();
            zos.close();
            fos.close();
        }
        catch (IOException | URISyntaxException e){
            throw new WriteFileException(e.getMessage());
        }
    }

    /**
     * Load.
     */
    public static void load(){
        try{
            Parser.openFile("favorite_gyms");
            Parser.consume('{');

            FavoritesHandler.setFavorites(Parser.parseFavorites());

            ((FavoritesModel) FavoritesHandler.getFavorites().getModel()).
            getFavorites().forEach(GymController::makeInteractive);

            Parser.skipWhitespace();
            Parser.consume('}');
        }
        catch(Exception ignored){}
    }
}
