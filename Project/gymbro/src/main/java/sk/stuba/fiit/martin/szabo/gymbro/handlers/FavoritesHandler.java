package sk.stuba.fiit.martin.szabo.gymbro.handlers;

import sk.stuba.fiit.martin.szabo.gymbro.city.builder.FavoritesBuilder;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.FavoritesController;
import sk.stuba.fiit.martin.szabo.gymbro.city.controller.GymController;
import sk.stuba.fiit.martin.szabo.gymbro.city.model.FavoritesModel;
import sk.stuba.fiit.martin.szabo.gymbro.file.Parser;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

// TODO:: refactor placement of Favorites MVC package?
public class FavoritesHandler{

    private static FavoritesController favorites = initalizeFavorites();

    private FavoritesHandler(){}

    public static FavoritesController initalizeFavorites(){
        if(getFavorites() == null) return new FavoritesBuilder().build();
        else return getFavorites();
    }

    public static FavoritesController getFavorites(){
        return favorites;
    }

    public static void setFavorites(FavoritesController favorites){
        FavoritesHandler.favorites = favorites;
    }

    public static void save(String fileName){
        if(getFavorites() == null) return;

        try{
            FileOutputStream fos = new FileOutputStream(fileName + ".zip");
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
        catch (IOException e){
            e.printStackTrace();
            System.exit(-1);
        }
    }

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
