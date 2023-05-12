# Szabo Martin - GymBro

## Table of Contents

* [Project documentation](Documentation/KB3/GymBro_Documentation.pdf)
  * [JavaDoc documentation](Documentation/KB3/JavaDoc/protected/index.html)
* [UML diagrams](Documentation/KB3/Diagrams/GymBro.svg)
* [Versions](https://github.com/OOP-FIIT/oop-2023-stv-15-a-dakic-xszabom5/releases)
* [Technical details](Documentation/KB3/GymBro_Documentation.pdf)
* Simulation and demonstration
  * [Video demonstration](Documentation/KB2/Video/Video.mp4)
* [Importing project to Eclipse IDE](Documentation/Eclipse_Project_Import_Guide.pdf)

## Fulfillment of criteria

* Total amount of class inheritance hierarchies: 9
* Total amount of interface inheritance hierarchies: 1
* Total amount of polymorphisms: 7 classes; 12 objects
* Total amount of aggregations: 20
* Total amount of compositions: 28
* Total amount of encapsulated classes: 44 out of 47

## Certain implementations

### Inheritence hierarchies
---Inheritance hierarchy 1---
* BuilderMVC
  * FavoritesBuilder
  * GymBuilder
  * MapBuilder
  * PropertiesMenuBuilder

---Inheritance hierarchy 2---
* Controller
  * FavoritesController
  * GymController
  * MapController
  * PropertiesMenuController

---Inheritance hierarchy 3---
* View
  * FavoritesView
  * GymView
  * MapView
  * PropertiesMenuView

---Inheritance hierarchy 4---
* Setup
  * SetupFavorites

---Inheritance hierarchy 5---
* Model
  * FavoritesModel
  * GymModel
  * MapModel
  * PropertiesMenuModel

---Inheritance hierarchy 6---
* Application
  * Main

---Inheritance hierarchy 7---
* Event
  * EventEntry
  * EventManager

---Inheritance hierarchy 8---
* Exception
  * FileNameException

---Inheritance hierarchy 9---
* RuntimeException
  * UnknownGymException
  * WriteFileException

---Interface hierarchy 1---
* Serialization
  * Model
  * Property
  * Transform
  * Vector2D

### Main criteria

* application of object-oriented mechanisms in the program (See section [OOP Principles](#oop-principles) and [Fulfillment of criteria](#fulfillment-of-criteria))
* an appropriate use of inheritance, encapsulation, and aggregation (See section [OOP Principles](#oop-principles) and [Fulfillment of criteria](#fulfillment-of-criteria))
* code organization, and documentation quality. (See [project documentation](Documentation/KB3/GymBro_Documentation.pdf))


#### OOP Principles

##### Encapsulation
* "BuilderMVC" class encapsulates the "model" attribute.
* "BuilderMVC" class encapsulates the "view" attribute.
* "BuilderMVC" class encapsulates the "controller" attribute.
* "TransformBuilder" class encapsulates the "transform" attribute.
* "Controller" class encapsulates the "model" attribute.
* "Controller" class encapsulates the "view" attribute.
* "FavoritesModel" class encapsulates the "favorites" attribute.
* "GymModel" class encapsulates the "propertiesMenu" attribute.
* "MapModel" class encapsulates the "gyms" attribute.
* The "Model" class doesn't encapsulate all of its attributes!
* "PropertiesMenuModel" class encapsulates the "properties" attribute.
* "PropertiesMenuModel" class encapsulates the "owner" attribute.
* The "View" class doesn't encapsulate all of its attributes!
* "Parser" class encapsulates the "bytes" attribute.
* "Parser" class encapsulates the "offset" attribute.
* "Parser" class encapsulates the "line" attribute.
* "FavoritesHandler" class encapsulates the "favorites" attribute.
* "ImageViewHandler" class encapsulates the "view" attribute.
* "Launcher" class encapsulates the "mainThread" attribute.
* "EventEntry" class encapsulates the "event" attribute.
* "EventEntry" class encapsulates the "handler" attribute.
* "EventManager" class encapsulates the "handlers" attribute.
* "EventManager" class encapsulates the "owner" attribute.
* "EventManager" class encapsulates the "EventEntry" attribute.
* "SceneEventManager" class encapsulates the "owner" attribute.
* "SceneEventManager" class encapsulates the "keyEventManager" attribute.
* "SceneEventManager" class encapsulates the "mouseEventManager" attribute.
* "SceneManager" class encapsulates the "scene" attribute.
* "SceneManager" class encapsulates the "paneMap" attribute.
* "SceneManager" class encapsulates the "stage" attribute.
* "Setup" class encapsulates the "map" attribute.
* The "Constants" class doesn't encapsulate all of its attributes!
* "Property" class encapsulates the "name" attribute.
* "Property" class encapsulates the "value" attribute.
* "Transform" class encapsulates the "position" attribute.
* "Transform" class encapsulates the "rotation" attribute.
* "Transform" class encapsulates the "scale" attribute.
* "Vector2D" class encapsulates the "x" attribute.
* "Vector2D" class encapsulates the "y" attribute.
* "Window" class encapsulates the "transform" attribute.
* "Window" class encapsulates the "sceneManager" attribute.
* "Window" class encapsulates the "eventManager" attribute.
* "Window" class encapsulates the "focusedGym" attribute.
* "Window" class encapsulates the "instance" attribute.
* "Window" class encapsulates the "windowSetup" attribute.

##### Composition
* The "FavoritesBuilder" type composites the "FavoritesModel" type.
* The "FavoritesBuilder" type composites the "FavoritesView" type.
* The "FavoritesBuilder" type composites the "FavoritesController" type.
* The "GymBuilder" type composites the "GymModel" type.
* The "GymBuilder" type composites the "GymView" type.
* The "GymBuilder" type composites the "GymController" type.
* The "MapBuilder" type composites the "MapModel" type.
* The "MapBuilder" type composites the "MapView" type.
* The "MapBuilder" type composites the "MapController" type.
* The "PropertiesMenuBuilder" type composites the "PropertiesMenuModel" type.
* The "PropertiesMenuBuilder" type composites the "PropertiesMenuView" type.
* The "PropertiesMenuBuilder" type composites the "PropertiesMenuController" type.
* The "TransformBuilder" type composites the "Transform" type.
* The "FavoritesController" type composites the "FavoritesView" type.
* The "GymController" type composites the "GymView" type.
* The "PropertiesMenuController" type composites the "PropertiesMenuView" type.
* The "FavoritesView" type composites the "FavoritesModel" type.
* The "GymView" type composites the "GymModel" type.
* The "MapView" type composites the "MapModel" type.
* The "PropertiesMenuView" type composites the "PropertiesMenuModel" type.
* The "Parser" type composites the "GymModel" type.
* The "Parser" type composites the "PropertiesMenuController" type.
* The "Parser" type composites the "GymController" type.
* The "Parser" type composites the "Property" type.
* The "SceneEventManager" type composites the "EventManager" type.
* The "Transform" type composites the "Vector2D" type.
* The "Window" type composites the "Transform" type.
* The "Window" type composites the "Vector2D" type.

##### Aggregation
* The "BuilderMVC" type aggregates the "Controller" type.
* The "BuilderMVC" type aggregates the "View" type.
* The "BuilderMVC" type aggregates the "Model" type.
* The "Controller" type aggregates the "Model" type.
* The "Controller" type aggregates the "View" type.
* The "FavoritesModel" type aggregates the "GymController" type.
* The "GymModel" type aggregates the "PropertiesMenuController" type.
* The "MapModel" type aggregates the "GymController" type.
* The "Model" type aggregates the "Transform" type.
* The "PropertiesMenuModel" type aggregates the "Property" type.
* The "PropertiesMenuModel" type aggregates the "GymController" type.
* The "View" type aggregates the "Model" type.
* The "FavoritesHandler" type aggregates the "FavoritesController" type.
* The "EventManager" type aggregates the "EventEntry" type.
* The "Setup" type aggregates the "MapController" type.
* The "Transform" type aggregates the "Vector2D" type.
* The "Window" type aggregates the "SceneManager" type.
* The "Window" type aggregates the "SceneEventManager" type.
* The "Window" type aggregates the "Setup" type.
* The "Window" type aggregates the "GymController" type.

##### Associations
* The "GymView" type is associated with the "Window" type.
* The "PropertiesMenuView" type is associated with the "Window" type.
* The "View" type is associated with the "Window" type.
* The "Main" type is associated with the "Window" type.
* The "Setup" type is associated with the "Window" type.
* The "FavoritesMenuFxmlController" type is associated with the "Window" type.
* The "MainMenuFxmlController" type is associated with the "Window" type.
* The "MapFxmlController" type is associated with the "Window" type.
* The "PropertiesMenuFxmlController" type is associated with the "Window" type.

##### Polymorphism
* Class FavoritesModel:
  * The "model" object implements polymorphism.
* Class PropertiesMenuModel:
  * The "property" object implements polymorphism.
  * The "model" object implements polymorphism.
* Class PropertiesMenuView:
  * The "property" object implements polymorphism.
* Class Parser:
  * The "model" object implements polymorphism.
  * The "model" object implements polymorphism.
  * The "model" object implements polymorphism.
* Class FavoritesMenuFxmlController:
  * The "controller" object implements polymorphism.
* Class MainMenuFxmlController:
  * The "controller" object implements polymorphism.
  * The "controller" object implements polymorphism.
* Class MapFxmlController:
  * The "setup" object implements polymorphism.
  * The "setup" object implements polymorphism.



##### Inheritence and Implementations
* FavoritesBuilder.java:
  * Inheritance found at line 17:
  * "public class FavoritesBuilder extends BuilderMVC{"

* GymBuilder.java:
  * Inheritance found at line 16:
  * "public class GymBuilder extends BuilderMVC{"

* MapBuilder.java:
  * Inheritance found at line 19:
  * "public class MapBuilder extends BuilderMVC{"

* PropertiesMenuBuilder.java:
  * Inheritance found at line 19:
  * "public class PropertiesMenuBuilder extends BuilderMVC{"

* FavoritesController.java:
  * Inheritance found at line 9:
  * "public class FavoritesController extends Controller{"

* GymController.java:
  * Inheritance found at line 13:
  * "public class GymController extends Controller{"

* MapController.java:
  * Inheritance found at line 13:
  * "public class MapController extends Controller{"

* PropertiesMenuController.java:
  * Inheritance found at line 12:
  * "public class PropertiesMenuController extends Controller{"

* FavoritesModel.java:
  * Inheritance found at line 13:
  * "public class FavoritesModel extends Model{"

* GymModel.java:
  * Inheritance found at line 11:
  * "public class GymModel extends Model{"

* MapModel.java:
  * Inheritance found at line 14:
  * "public class MapModel extends Model{"

* Model.java:
  * Implementation of an interface found at line 16:
  * "public abstract class Model implements Serialization{"

* PropertiesMenuModel.java:
  * Inheritance found at line 14:
  * "public class PropertiesMenuModel extends Model{"

* FavoritesView.java:
  * Inheritance found at line 8:
  * "public class FavoritesView extends View{"

* GymView.java:
  * Inheritance found at line 12:
  * "public class GymView extends View{"

* MapView.java:
  * Inheritance found at line 8:
  * "public class MapView extends View{"

* PropertiesMenuView.java:
  * Inheritance found at line 17:
  * "public class PropertiesMenuView extends View{"

* Main.java:
  * Inheritance found at line 25:
  * "public class Main extends Application{"

* EventEntry.java:
  * Inheritance found at line 12:
  * "public class EventEntry<T extends Event>{"

* EventManager.java:
  * Inheritance found at line 16:
  * "public class EventManager<T extends Event>{"

* SetupFavorites.java:
  * Inheritance found at line 14:
  * "public class SetupFavorites extends Setup{"

* FileNameException.java:
  * Inheritance found at line 6:
  * "public class FileNameException extends Exception{"

* Property.java:
  * Implementation of an interface found at line 8:
  * "public class Property implements Serialization{"

* Transform.java:
  * Implementation of an interface found at line 11:
  * "public class Transform implements Serialization{"

* UnknownGymException.java:
  * Inheritance found at line 6:
  * "public class UnknownGymException extends RuntimeException{"

* Vector2D.java:
  * Implementation of an interface found at line 12:
  * "public class Vector2D implements Serialization{"

* WriteFileException.java:
  * Inheritance found at line 6:
  * "public class WriteFileException extends RuntimeException {"

### Secondary criteria

* application of [design patterns](#oop-design-patterns) except the Singleton design pattern (builder, factory, MVC)
* handling exceptional states using own exceptions – one exception is sufficient, but it has to be actually thrown and handled
* providing a graphical user interface separated from application logic and with at least part of the event handlers created manually
* explicit use of multithreading – starting an own thread directly or using a higher level API
* using generics in own classes – implementing and using an own generic class
* using lambda expressions or method references
* using default method implementation in interfaces
* using serialization
* using [aggregation](#aggregation), [composition](#composition) and [asociation](#associations)
* using interfaces
* organize code base into packages
* using [encapsulation](#encapsulation)
* using [polymorphism](#polymorphism)
* overriding (for example serialize method in serialization interface. "com.gymbro.model.GymModel" overrides this method)
* overloading (for example setTexture method in "com.gymbro.city.model.Model")
* at least 2 [inheritance hierarchies](#inheritence-hierarchies) (9 are present in the project)
* CRUD Principle - Create, Read, Update, Delete (GymBro's favorites system)
* JAR File

#### OOP Design patterns
* Builder
  * com.gymbro.city.builder
* Factory
  * com.gymbro.city.factory
* MVC
  * com.gymbro.city.model
  * com.gymbro.city.view
  * com.gymbro.city.controller
* Singleton
  * com.gymbro.city.window.Window (singleton class)

### Final words
All of the OOP principles, design patterns and other details about the project are thoroughly described in [project documentation](Documentation/KB3/GymBro_Documentation.pdf).