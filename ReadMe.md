# Szabo Martin - GymBro

## Table of Contents

* [Project documentation](Documentation/GymBro_CP1_Szabo_EN.pdf)
  * [JavaDoc documentation](Documentation/JavaDoc/index.html)
* [UML diagrams](Documentation/Diagrams/GymBro.svg)
* [Versions](Documentation/002_versions)
* [Technical details](Documentation/003_tech_details)
* Simulation and demonstration  
  * [Video demonstration](Documentation/Video/Video.mp4)

## Fulfillment of criteria

* Total amount of class inheritance hierarchies: 7
* Total amount of interface inheritance hierarchies: 1
* Total amount of polymorphisms: 4 classes; 5 objects
* Total amount of aggregations: 36
* Total amount of compositions: 28
* Total amount of encapsulated classes: 39 out of 42

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
* Model
    * FavoritesModel
    * GymModel
    * MapModel
    * PropertiesMenuModel

---Inheritance hierarchy 4---
* View
    * FavoritesView
    * GymView
    * MapView
    * PropertiesMenuView

---Inheritance hierarchy 5---
* Setup
    * SetupFavorites

---Inheritance hierarchy 6 (Parent not declared in the input files)---
* Application
    * Main

---Inheritance hierarchy 7 (Parent not declared in the input files)---
* Event
    * EventEntry
    * EventManager

### Main criteria

#### Encapsulation
* "BuilderMVC" class encapsulates the "model" attribute.
* "BuilderMVC" class encapsulates the "view" attribute.
* "BuilderMVC" class encapsulates the "controller" attribute.
* "TransformBuilder" class encapsulates the "transform" attribute.
* "Controller" class encapsulates the "model" attribute.
* "Controller" class encapsulates the "view" attribute.
* "FavoritesModel" class encapsulates the "favorites" attribute.
* "GymModel" class encapsulates the "amountOfEquipment" attribute.
* "GymModel" class encapsulates the "propertiesMenu" attribute.
* "MapModel" class encapsulates the "gyms" attribute.
* "PropertiesMenuModel" class encapsulates the "properties" attribute.
* "PropertiesMenuModel" class encapsulates the "owner" attribute.
* "Parser" class encapsulates the "bytes" attribute.
* "Parser" class encapsulates the "offset" attribute.
* "Parser" class encapsulates the "line" attribute.
* "FavoritesHandler" class encapsulates the "favorites" attribute.
* "ImageViewHandler" class encapsulates the "view" attribute.
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

#### Composition
* The "FavoritesBuilder" class composites the "FavoritesModel" class.
* The "FavoritesBuilder" class composites the "FavoritesView" class.
* The "FavoritesBuilder" class composites the "FavoritesController" class.
* The "GymBuilder" class composites the "GymModel" class.
* The "GymBuilder" class composites the "GymView" class.
* The "GymBuilder" class composites the "GymController" class.
* The "MapBuilder" class composites the "MapModel" class.
* The "MapBuilder" class composites the "MapView" class.
* The "MapBuilder" class composites the "MapController" class.
* The "PropertiesMenuBuilder" class composites the "PropertiesMenuModel" class.
* The "PropertiesMenuBuilder" class composites the "PropertiesMenuView" class.
* The "PropertiesMenuBuilder" class composites the "PropertiesMenuController" class.
* The "TransformBuilder" class composites the "Transform" class.
* The "FavoritesController" class composites the "FavoritesView" class.
* The "GymController" class composites the "GymView" class.
* The "PropertiesMenuController" class composites the "PropertiesMenuView" class.
* The "FavoritesView" class composites the "FavoritesModel" class.
* The "GymView" class composites the "GymModel" class.
* The "MapView" class composites the "MapModel" class.
* The "PropertiesMenuView" class composites the "PropertiesMenuModel" class.
* The "Parser" class composites the "GymModel" class.
* The "Parser" class composites the "PropertiesMenuController" class.
* The "Parser" class composites the "GymController" class.
* The "Parser" class composites the "Property" class.
* The "SceneEventManager" class composites the "EventManager" class.
* The "Transform" class composites the "Vector2D" class.
* The "Window" class composites the "Transform" class.
* The "Window" class composites the "Vector2D" class.

#### Agregation
* The "BuilderMVC" class aggregates the "Controller" class.
* The "BuilderMVC" class aggregates the "View" class.
* The "BuilderMVC" class aggregates the "Model" class.
* The "FavoritesBuilder" class aggregates the "FavoritesController" class.
* The "FavoritesBuilder" class aggregates the "FavoritesModel" class.
* The "FavoritesBuilder" class aggregates the "FavoritesView" class.
* The "GymBuilder" class aggregates the "GymController" class.
* The "GymBuilder" class aggregates the "GymModel" class.
* The "GymBuilder" class aggregates the "GymView" class.
* The "MapBuilder" class aggregates the "MapController" class.
* The "MapBuilder" class aggregates the "MapModel" class.
* The "MapBuilder" class aggregates the "MapView" class.
* The "PropertiesMenuBuilder" class aggregates the "PropertiesMenuController" class.
* The "PropertiesMenuBuilder" class aggregates the "PropertiesMenuModel" class.
* The "PropertiesMenuBuilder" class aggregates the "PropertiesMenuView" class.
* The "Controller" class aggregates the "Model" class.
* The "Controller" class aggregates the "View" class.
* The "MapController" class aggregates the "MapModel" class.
* The "PropertiesMenuController" class aggregates the "PropertiesMenuModel" class.
* The "FavoritesModel" class aggregates the "GymController" class.
* The "GymModel" class aggregates the "PropertiesMenuController" class.
* The "MapModel" class aggregates the "GymController" class.
* The "Model" class aggregates the "Transform" class.
* The "PropertiesMenuModel" class aggregates the "Property" class.
* The "PropertiesMenuModel" class aggregates the "GymController" class.
* The "View" class aggregates the "Model" class.
* The "FavoritesHandler" class aggregates the "FavoritesController" class.
* The "EventManager" class aggregates the "EventEntry" class.
* The "Setup" class aggregates the "MapController" class.
* The "SetupFavorites" class aggregates the "FavoritesHandler" class.
* The "Transform" class aggregates the "Vector2D" class.
* The "Window" class aggregates the "FavoritesHandler" class.
* The "Window" class aggregates the "SceneManager" class.
* The "Window" class aggregates the "SceneEventManager" class.
* The "Window" class aggregates the "Setup" class.
* The "Window" class aggregates the "GymController" class.

#### Associations
* The "BuilderMVC" class is associated with the "Transform" class.
* The "FavoritesBuilder" class is associated with the "GymController" class.
* The "FavoritesBuilder" class is associated with the "Controller" class.
* The "FavoritesBuilder" class is associated with the "Model" class.
* The "FavoritesBuilder" class is associated with the "View" class.
* The "FavoritesBuilder" class is associated with the "Transform" class.
* The "GymBuilder" class is associated with the "PropertiesMenuController" class.
* The "GymBuilder" class is associated with the "Controller" class.
* The "GymBuilder" class is associated with the "Model" class.
* The "GymBuilder" class is associated with the "View" class.
* The "GymBuilder" class is associated with the "Transform" class.
* The "MapBuilder" class is associated with the "GymController" class.
* The "MapBuilder" class is associated with the "Controller" class.
* The "MapBuilder" class is associated with the "Model" class.
* The "MapBuilder" class is associated with the "View" class.
* The "MapBuilder" class is associated with the "Transform" class.
* The "PropertiesMenuBuilder" class is associated with the "Property" class.
* The "PropertiesMenuBuilder" class is associated with the "GymController" class.
* The "PropertiesMenuBuilder" class is associated with the "Controller" class.
* The "PropertiesMenuBuilder" class is associated with the "Model" class.
* The "PropertiesMenuBuilder" class is associated with the "View" class.
* The "PropertiesMenuBuilder" class is associated with the "Transform" class.
* The "TransformBuilder" class is associated with the "Vector2D" class.
* The "FavoritesController" class is associated with the "FavoritesModel" class.
* The "FavoritesController" class is associated with the "GymController" class.
* The "GymController" class is associated with the "GymModel" class.
* The "MapController" class is associated with the "MapView" class.
* The "MapController" class is associated with the "GymController" class.
* The "MapController" class is associated with the "Vector2D" class.
* The "MapController" class is associated with the "MapModel" class.
* The "PropertiesMenuController" class is associated with the "Property" class.
* The "PropertiesMenuController" class is associated with the "GymController" class.
* The "PropertiesMenuController" class is associated with the "PropertiesMenuModel" class.
* The "GymFactory" class is associated with the "GymController" class.
* The "FavoritesModel" class is associated with the "Transform" class.
* The "FavoritesModel" class is associated with the "Parser" class.
* The "GymModel" class is associated with the "Transform" class.
* The "GymModel" class is associated with the "Property" class.
* The "MapModel" class is associated with the "Transform" class.
* The "MapModel" class is associated with the "Property" class.
* The "Model" class is associated with the "Vector2D" class.
* The "Model" class is associated with the "ImageViewHandler" class.
* The "PropertiesMenuModel" class is associated with the "Transform" class.
* The "PropertiesMenuModel" class is associated with the "Parser" class.
* The "GymView" class is associated with the "PropertiesMenuController" class.
* The "GymView" class is associated with the "Window" class.
* The "GymView" class is associated with the "PropertiesMenuFxmlController" class.
* The "PropertiesMenuView" class is associated with the "SceneManager" class.
* The "PropertiesMenuView" class is associated with the "Constants" class.
* The "PropertiesMenuView" class is associated with the "Property" class.
* The "PropertiesMenuView" class is associated with the "Window" class.
* The "View" class is associated with the "ImageViewHandler" class.
* The "View" class is associated with the "Window" class.
* The "View" class is associated with the "Vector2D" class.
* The "View" class is associated with the "Transform" class.
* The "Parser" class is associated with the "Transform" class.
* The "Parser" class is associated with the "PropertiesMenuModel" class.
* The "FavoritesHandler" class is associated with the "Parser" class.
* The "FavoritesHandler" class is associated with the "GymController" class.
* The "FavoritesHandler" class is associated with the "FavoritesModel" class.
* The "ImageViewHandler" class is associated with the "Transform" class.
* The "Launcher" class is associated with the "Main" class.
* The "Main" class is associated with the "Window" class.
* The "Setup" class is associated with the "Window" class.
* The "Setup" class is associated with the "MapBuilder" class.
* The "Setup" class is associated with the "TransformBuilder" class.
* The "Setup" class is associated with the "Vector2D" class.
* The "Setup" class is associated with the "GymController" class.
* The "Setup" class is associated with the "GymFactory" class.
* The "SetupFavorites" class is associated with the "GymController" class.
* The "Transform" class is associated with the "Parser" class.
* The "Vector2D" class is associated with the "Parser" class.
* The "FavoritesMenuFxmlController" class is associated with the "MapFxmlController" class.
* The "FavoritesMenuFxmlController" class is associated with the "Main" class.
* The "FavoritesMenuFxmlController" class is associated with the "Constants" class.
* The "FavoritesMenuFxmlController" class is associated with the "Window" class.
* The "FavoritesMenuFxmlController" class is associated with the "FavoritesHandler" class.
* The "MainMenuFxmlController" class is associated with the "MapFxmlController" class.
* The "MainMenuFxmlController" class is associated with the "FavoritesMenuFxmlController" class.
* The "MainMenuFxmlController" class is associated with the "Window" class.
* The "MapFxmlController" class is associated with the "Setup" class.
* The "MapFxmlController" class is associated with the "Main" class.
* The "MapFxmlController" class is associated with the "Constants" class.
* The "MapFxmlController" class is associated with the "Window" class.
* The "MapFxmlController" class is associated with the "SetupFavorites" class.
* The "PropertiesMenuFxmlController" class is associated with the "Constants" class.
* The "PropertiesMenuFxmlController" class is associated with the "Window" class.
* The "GymFactory" class is associeted with the "GymBuilder" class.
* The "GymFactory" class is associeted with the "PropertiesMenuBuilder" class.
* The "GymFactory" class is associeted with the "TransformBuilder" class.
* The "GymFactory" class is associeted with the "Property" class.
* The "GymFactory" class is associeted with the "Vector2D" class.
* The "GymFactory" class is associeted with the "Window" class.
* The "Parser" class is associeted with the "FavoritesController" class.
* The "Parser" class is associeted with the "FavoritesModel" class.
* The "FavoritesHandler" class is associeted with the "FavoritesBuilder" class.
* The "SceneManager" class is associeted with the "Main" class.
* The "SetupFavorites" class is associeted with the "FavoritesModel" class.
* The "SetupFavorites" class is associeted with the "FavoritesHandler" class.

#### Polymorphism
* The "property" object implements polymorphism.
* The "property" object implements polymorphism.
* The "controller" object implements polymorphism.
* The "setup" object implements polymorphism.
* The "setup" object implements polymorphism.


#### Inheritence and Implementations
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
    * Implementation of an interface found at line 15:
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
    * Inheritance found at line 18:
    * "public class PropertiesMenuView extends View{"

* Main.java:
    * Inheritance found at line 36:
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

* Property.java:
    * Implementation of an interface found at line 8:
    * "public class Property implements Serialization{"

* Transform.java:
    * Implementation of an interface found at line 11:
    * "public class Transform implements Serialization{"

* Vector2D.java:
    * Implementation of an interface found at line 12:
    * "public class Vector2D implements Serialization{"

### Secondary criteria

#### OOP Design patterns
* Builder
  * sk.stuba.fiit.martin.szabo.gymbro.city.builder
* Factory
  * sk.stuba.fiit.martin.szabo.gymbro.city.factory
* MVC
  * sk.stuba.fiit.martin.szabo.gymbro.city.model
  * sk.stuba.fiit.martin.szabo.gymbro.city.view
  * sk.stuba.fiit.martin.szabo.gymbro.city.controller
* Singleton
  * sk.stuba.fiit.martin.szabo.gymbro.city.window.Window (singleton class)