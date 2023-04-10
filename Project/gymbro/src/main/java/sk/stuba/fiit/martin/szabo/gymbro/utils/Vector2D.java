package sk.stuba.fiit.martin.szabo.gymbro.utils;


import sk.stuba.fiit.martin.szabo.gymbro.file.Parser;
import sk.stuba.fiit.martin.szabo.gymbro.file.Serialization;

import java.util.Objects;

/**
 * Vector class representing 2 dimensional vector from physics with X and Y coordinates.
 */
public class Vector2D implements Serialization{
    private double x;
    private double y;

    /**
     * Constructs a new Vector2D that sets the X and Y values
     *
     * @param x Horizontal coordinate of the vector
     * @param y Vertical coordinate of the vector
     */
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor for empty vector class arguments. Automatically assumes that X and Y are 0
     */
    public Vector2D(){
        this.x = 0;
        this.y = 0;
    }

    /**
     * Add vector 2 d.
     *
     * @param vector2D the vector 2 d
     * @return the vector 2 d
     */
    public Vector2D add(Vector2D vector2D){
        this.setX(this.getX() + vector2D.getX());
        this.setY(this.getY() + vector2D.getY());
        return this;
    }

    /**
     * Subtract vector 2 d.
     *
     * @param vector2D the vector 2 d
     * @return the vector 2 d
     */
    public Vector2D subtract(Vector2D vector2D){
        this.setX(this.getX() - vector2D.getX());
        this.setY(this.getY() - vector2D.getY());
        return this;
    }

    /**
     * Multiply vector 2 d.
     *
     * @param vector2D the vector 2 d
     * @return the vector 2 d
     */
    public Vector2D multiply(Vector2D vector2D){
        this.setX(this.getX() * vector2D.getX());
        this.setY(this.getY() * vector2D.getY());
        return this;
    }

    /**
     * Divide vector 2 d.
     *
     * @param vector2D the vector 2 d
     * @return the vector 2 d
     */
    public Vector2D divide(Vector2D vector2D){
        this.setX(this.getX() / vector2D.getX());
        this.setY(this.getY() / vector2D.getY());
        return this;
    }

    /**
     * Copy vector 2 d.
     *
     * @return New Vector with same X and Y coordinates as this vector.
     */
    public Vector2D copy(){
        return new Vector2D(this.x, this.y);
    }

    /**
     * Get x double.
     *
     * @return the double
     */
    public double getX(){
        return x;
    }

    /**
     * Set x.
     *
     * @param x the x
     */
    public void setX(double x){
        this.x = x;
    }

    /**
     * Get y double.
     *
     * @return the double
     */
    public double getY(){
        return y;
    }

    /**
     * Set y.
     *
     * @param y the y
     */
    public void setY(double y){
        this.y = y;
    }

    public String serialize(int tabSize){
        StringBuilder builder = new StringBuilder();

        builder.append(addDoubleProperty("x", this.x, tabSize, true, true));
        builder.append(addDoubleProperty("y", this.y, tabSize, true, false));
        return builder.toString();
    }

    /**
     * Deserialize vector 2 d.
     *
     * @return the vector 2 d
     */
    public static Vector2D deserialize(){
        double x = Parser.consumeDoubleProperty("x");
        Parser.consume(',');
        double y = Parser.consumeDoubleProperty("y");
        return new Vector2D(x, y);
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        if(o instanceof  Vector2D){
            Vector2D vector2D = (Vector2D) o;
            return Double.compare(vector2D.x, x) == 0 && Double.compare(vector2D.y, y) == 0;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(x, y);
    }
}