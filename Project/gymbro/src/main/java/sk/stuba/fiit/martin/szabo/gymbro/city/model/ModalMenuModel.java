package sk.stuba.fiit.martin.szabo.gymbro.city.model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sk.stuba.fiit.martin.szabo.gymbro.file.Serialization;
import sk.stuba.fiit.martin.szabo.gymbro.utils.ImageViewInitializer;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Property;
import sk.stuba.fiit.martin.szabo.gymbro.utils.Transform;

import java.io.FileInputStream;
import java.util.ArrayList;

public class ModalMenuModel extends Serialization{
    private ArrayList<Property> properties = new ArrayList<>();
    private Transform transform = new Transform();
    private Image texture = null;
    private ImageView imageView = null;


    public ModalMenuModel(){}

    public ModalMenuModel(ArrayList<Property> properties, Transform transform, Image texture){
        this.properties = properties;
        this.transform = transform;
        this.setTexture(texture);
    }

    public ModalMenuModel(ArrayList<Property> properties, Transform transform, String texturePath){
        this.properties = properties;
        this.transform = transform;
        this.setTexture(texturePath);
    }

    public String serialize(int tabSize){
        StringBuilder builder = new StringBuilder();



        return builder.toString();
    }

    public static Property deserialize(){


        return null;
    }


    public ArrayList<Property> getProperties(){
        return properties;
    }

    public void setProperties(ArrayList<Property> properties){
        this.properties = properties;
    }

    public Transform getTransform(){
        return transform;
    }

    public void setTransform(Transform transform){
        this.transform = transform;
    }

    public Image getTexture(){
        return texture;
    }

    public void setTexture(Image texture){
        this.texture = texture;

        this.setImageView(new ImageViewInitializer().initialize(
                this.getTexture(),
                this.getTransform()
        ));
    }
    public void setTexture(String texturePath){
        try{
            this.texture = new Image(new FileInputStream(texturePath));

            this.setImageView(new ImageViewInitializer().initialize(
                    this.getTexture(),
                    this.getTransform()
            ));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public ImageView getImageView(){
        return imageView;
    }

    public void setImageView(ImageView imageView){
        this.imageView = imageView;
    }
}
