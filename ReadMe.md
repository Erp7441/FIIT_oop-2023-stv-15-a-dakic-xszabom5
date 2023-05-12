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
* [BuilderMVC](Project/gymbro/src/main/java/com/gymbro/city/builder/BuilderMVC.java)
  * [FavoritesBuilder](Project/gymbro/src/main/java/com/gymbro/city/builder/FavoritesBuilder.java)
  * [GymBuilder](Project/gymbro/src/main/java/com/gymbro/city/builder/GymBuilder.java)
  * [MapBuilder](Project/gymbro/src/main/java/com/gymbro/city/builder/MapBuilder.java)
  * [PropertiesMenuBuilder](Project/gymbro/src/main/java/com/gymbro/city/builder/PropertiesMenuBuilder.java)

---Inheritance hierarchy 2---
* [Controller](Project/gymbro/src/main/java/com/gymbro/city/controller/Controller.java)
  * [FavoritesController](Project/gymbro/src/main/java/com/gymbro/city/controller/FavoritesController.java)
  * [GymController](Project/gymbro/src/main/java/com/gymbro/city/controller/GymController.java)
  * [MapController](Project/gymbro/src/main/java/com/gymbro/city/controller/MapController.java)
  * [PropertiesMenuController](Project/gymbro/src/main/java/com/gymbro/city/controller/PropertiesMenuController.java)

---Inheritance hierarchy 3---
* [View](Project/gymbro/src/main/java/com/gymbro/city/view/View.java)
  * [FavoritesView](Project/gymbro/src/main/java/com/gymbro/city/view/FavoritesView.java)
  * [GymView](Project/gymbro/src/main/java/com/gymbro/city/view/GymView.java)
  * [MapView](Project/gymbro/src/main/java/com/gymbro/city/view/MapView.java)
  * [PropertiesMenuView](Project/gymbro/src/main/java/com/gymbro/city/view/PropertiesMenuView.java)

---Inheritance hierarchy 4---
* [Setup](Project/gymbro/src/main/java/com/gymbro/setups/Setup.java)
  * [SetupFavorites](Project/gymbro/src/main/java/com/gymbro/setups/SetupFavorites.java)

---Inheritance hierarchy 5---
* [Model](Project/gymbro/src/main/java/com/gymbro/city/model/Model.java)
  * [FavoritesModel](Project/gymbro/src/main/java/com/gymbro/city/model/FavoritesModel.java)
  * [GymModel](Project/gymbro/src/main/java/com/gymbro/city/model/GymModel.java)
  * [MapModel](Project/gymbro/src/main/java/com/gymbro/city/model/MapModel.java)
  * [PropertiesMenuModel](Project/gymbro/src/main/java/com/gymbro/city/model/PropertiesMenuModel.java)

---Inheritance hierarchy 6---
* Application
  * [Main](Project/gymbro/src/main/java/com/gymbro/Main.java)

---Inheritance hierarchy 7---
* Event
  * [EventEntry](Project/gymbro/src/main/java/com/gymbro/managers/event/EventEntry.java)
  * [EventManager](Project/gymbro/src/main/java/com/gymbro/managers/event/EventManager.java)

---Inheritance hierarchy 8---
* Exception
  * [FileNameException](Project/gymbro/src/main/java/com/gymbro/utils/FileNameException.java)

---Inheritance hierarchy 9---
* RuntimeException
  * [UnknownGymException](Project/gymbro/src/main/java/com/gymbro/utils/UnknownGymException.java)
  * [WriteFileException](Project/gymbro/src/main/java/com/gymbro/utils/WriteFileException.java)

---Interface hierarchy 1---
* [Serialization](Project/gymbro/src/main/java/com/gymbro/file/Serialization.java)
  * [Model](Project/gymbro/src/main/java/com/gymbro/city/model/Model.java)
  * [Property](Project/gymbro/src/main/java/com/gymbro/utils/Property.java)
  * [Transform](Project/gymbro/src/main/java/com/gymbro/utils/Transform.java)
  * [Vector2D](Project/gymbro/src/main/java/com/gymbro/utils/Vector2D.java)

### Main criteria

* application of object-oriented mechanisms in the program (See section [OOP Principles](#oop-principles) and [Fulfillment of criteria](#fulfillment-of-criteria))
* an appropriate use of inheritance, encapsulation, and aggregation (See section [OOP Principles](#oop-principles) and [Fulfillment of criteria](#fulfillment-of-criteria))
* code organization, and documentation quality. (See [project documentation](Documentation/KB3/GymBro_Documentation.pdf))


#### OOP Principles

##### Encapsulation
* ["BuilderMVC" class](Project/gymbro/src/main/java/com/gymbro/city/builder/BuilderMVC.java) encapsulates the "model" attribute.
* ["BuilderMVC class"](Project/gymbro/src/main/java/com/gymbro/city/builder/BuilderMVC.java) encapsulates the "view" attribute.
* ["BuilderMVC class"](Project/gymbro/src/main/java/com/gymbro/city/builder/BuilderMVC.java) encapsulates the "controller" attribute.
* ["TransformBuilder" class](Project/gymbro/src/main/java/com/gymbro/city/builder/TransformBuilder.java) encapsulates the "transform" attribute.
* ["Controller" class](Project/gymbro/src/main/java/com/gymbro/city/controller/Controller.java) encapsulates the "model" attribute.
* ["Controller" class](Project/gymbro/src/main/java/com/gymbro/city/controller/Controller.java) encapsulates the "view" attribute.
* ["FavoritesModel" class](Project/gymbro/src/main/java/com/gymbro/city/model/FavoritesModel.java) encapsulates the "favorites" attribute.
* ["GymModel" class](Project/gymbro/src/main/java/com/gymbro/city/model/GymModel.java) encapsulates the "propertiesMenu" attribute.
* ["MapModel" class](Project/gymbro/src/main/java/com/gymbro/city/model/MapModel.java) encapsulates the "gyms" attribute.
* ["PropertiesMenuModel" class](Project/gymbro/src/main/java/com/gymbro/city/model/PropertiesMenuModel.java) encapsulates the "properties" attribute.
* ["PropertiesMenuModel" class](Project/gymbro/src/main/java/com/gymbro/city/model/PropertiesMenuModel.java) encapsulates the "owner" attribute.
* ["Parser" class](Project/gymbro/src/main/java/com/gymbro/file/Parser.java) encapsulates the "bytes" attribute.
* ["Parser" class](Project/gymbro/src/main/java/com/gymbro/file/Parser.java) encapsulates the "offset" attribute.
* ["Parser" class](Project/gymbro/src/main/java/com/gymbro/file/Parser.java) encapsulates the "line" attribute.
* ["FavoritesHandler" class](Project/gymbro/src/main/java/com/gymbro/handlers/FavoritesHandler.java) encapsulates the "favorites" attribute.
* ["ImageViewHandler" class](Project/gymbro/src/main/java/com/gymbro/handlers/ImageViewHandler.java) encapsulates the "view" attribute.
* ["Launcher" class](Project/gymbro/src/main/java/com/gymbro/Launcher.java) encapsulates the "mainThread" attribute.
* ["EventEntry" class](Project/gymbro/src/main/java/com/gymbro/managers/event/EventEntry.java) encapsulates the "event" attribute.
* ["EventEntry" class](Project/gymbro/src/main/java/com/gymbro/managers/event/EventEntry.java) encapsulates the "handler" attribute.
* ["EventManager" class](Project/gymbro/src/main/java/com/gymbro/managers/event/EventManager.java) encapsulates the "handlers" attribute.
* ["EventManager" class](Project/gymbro/src/main/java/com/gymbro/managers/event/EventManager.java) encapsulates the "owner" attribute.
* ["EventManager" class](Project/gymbro/src/main/java/com/gymbro/managers/event/EventManager.java) encapsulates the "EventEntry" attribute.
* ["SceneEventManager" class](Project/gymbro/src/main/java/com/gymbro/managers/event/SceneEventManager.java) encapsulates the "owner" attribute.
* ["SceneEventManager" class](Project/gymbro/src/main/java/com/gymbro/managers/event/SceneEventManager.java) encapsulates the "keyEventManager" attribute.
* ["SceneEventManager" class](Project/gymbro/src/main/java/com/gymbro/managers/event/SceneEventManager.java) encapsulates the "mouseEventManager" attribute.
* ["SceneManager" class](Project/gymbro/src/main/java/com/gymbro/managers/scene/SceneManager.java) encapsulates the "scene" attribute.
* ["SceneManager" class](Project/gymbro/src/main/java/com/gymbro/managers/scene/SceneManager.java) encapsulates the "paneMap" attribute.
* ["SceneManager" class](Project/gymbro/src/main/java/com/gymbro/managers/scene/SceneManager.java) encapsulates the "stage" attribute.
* ["Setup" class](Project/gymbro/src/main/java/com/gymbro/setups/Setup.java) encapsulates the "map" attribute.
* ["Property" class](Project/gymbro/src/main/java/com/gymbro/utils/Property.java) encapsulates the "name" attribute.
* ["Property" class](Project/gymbro/src/main/java/com/gymbro/utils/Property.java) encapsulates the "value" attribute.
* ["Transform" class](Project/gymbro/src/main/java/com/gymbro/utils/Transform.java) encapsulates the "position" attribute.
* ["Transform" class](Project/gymbro/src/main/java/com/gymbro/utils/Transform.java) encapsulates the "rotation" attribute.
* ["Transform" class](Project/gymbro/src/main/java/com/gymbro/utils/Transform.java) encapsulates the "scale" attribute.
* ["Vector2D" class](Project/gymbro/src/main/java/com/gymbro/utils/Vector2D.java) encapsulates the "x" attribute.
* ["Vector2D" class](Project/gymbro/src/main/java/com/gymbro/utils/Vector2D.java) encapsulates the "y" attribute.
* ["Window" class](Project/gymbro/src/main/java/com/gymbro/window/Window.java) encapsulates the "transform" attribute.
* ["Window" class](Project/gymbro/src/main/java/com/gymbro/window/Window.java) encapsulates the "sceneManager" attribute.
* ["Window" class](Project/gymbro/src/main/java/com/gymbro/window/Window.java) encapsulates the "eventManager" attribute.
* ["Window" class](Project/gymbro/src/main/java/com/gymbro/window/Window.java) encapsulates the "focusedGym" attribute.
* ["Window" class](Project/gymbro/src/main/java/com/gymbro/window/Window.java) encapsulates the "instance" attribute.
* ["Window" class](Project/gymbro/src/main/java/com/gymbro/window/Window.java) encapsulates the "windowSetup" attribute.

##### Composition
* The ["FavoritesBuilder" type](Project/gymbro/src/main/java/com/gymbro/city/builder/[FavoritesBuilder.java](Project/gymbro/src/main/java/com/gymbro/city/builder/FavoritesBuilder.java)) composites the ["FavoritesModel" type](Project/gymbro/src/main/java/com/gymbro/city/model/FavoritesModel.java).
* The ["FavoritesBuilder" type](Project/gymbro/src/main/java/com/gymbro/city/builder/[FavoritesBuilder.java](Project/gymbro/src/main/java/com/gymbro/city/builder/FavoritesBuilder.java)) composites the ["FavoritesView" type](Project/gymbro/src/main/java/com/gymbro/city/view/FavoritesView.java).
* The ["FavoritesBuilder" type](Project/gymbro/src/main/java/com/gymbro/city/builder/[FavoritesBuilder.java](Project/gymbro/src/main/java/com/gymbro/city/builder/FavoritesBuilder.java)) composites the ["FavoritesController" type](Project/gymbro/src/main/java/com/gymbro/city/controller/FavoritesController.java).
* The ["GymBuilder" type](Project/gymbro/src/main/java/com/gymbro/city/builder/GymBuilder.java) composites the ["GymModel" type](Project/gymbro/src/main/java/com/gymbro/city/model/GymModel.java).
* The ["GymBuilder" type](Project/gymbro/src/main/java/com/gymbro/city/builder/GymBuilder.java) composites the ["GymView" type](Project/gymbro/src/main/java/com/gymbro/city/view/GymView.java).
* The ["GymBuilder" type](Project/gymbro/src/main/java/com/gymbro/city/builder/GymBuilder.java) composites the ["GymController" type](Project/gymbro/src/main/java/com/gymbro/city/controller/GymController.java).
* The ["MapBuilder" type](Project/gymbro/src/main/java/com/gymbro/city/builder/MapBuilder.java) composites the ["MapModel" type](Project/gymbro/src/main/java/com/gymbro/city/model/MapModel.java).
* The ["MapBuilder" type](Project/gymbro/src/main/java/com/gymbro/city/builder/MapBuilder.java) composites the ["MapView" type](Project/gymbro/src/main/java/com/gymbro/city/view/MapView.java).
* The ["MapBuilder" type](Project/gymbro/src/main/java/com/gymbro/city/builder/MapBuilder.java) composites the ["MapController" type](Project/gymbro/src/main/java/com/gymbro/city/controller/MapController.java).
* The ["PropertiesMenuBuilder" type](Project/gymbro/src/main/java/com/gymbro/city/builder/PropertiesMenuBuilder.java) composites the ["PropertiesMenuModel" type](Project/gymbro/src/main/java/com/gymbro/city/model/PropertiesMenuModel.java).
* The ["PropertiesMenuBuilder" type](Project/gymbro/src/main/java/com/gymbro/city/builder/PropertiesMenuBuilder.java) composites the ["PropertiesMenuView" type](Project/gymbro/src/main/java/com/gymbro/city/view/PropertiesMenuView.java).
* The ["PropertiesMenuBuilder" type](Project/gymbro/src/main/java/com/gymbro/city/builder/PropertiesMenuBuilder.java) composites the ["PropertiesMenuController" type](Project/gymbro/src/main/java/com/gymbro/city/controller/PropertiesMenuController.java).
* The ["TransformBuilder" type](Project/gymbro/src/main/java/com/gymbro/city/builder/TransformBuilder.java) composites the ["Transform" type](Project/gymbro/src/main/java/com/gymbro/utils/Transform.java).
* The ["FavoritesController" type](Project/gymbro/src/main/java/com/gymbro/city/controller/FavoritesController.java) composites the ["FavoritesView" type](Project/gymbro/src/main/java/com/gymbro/city/view/FavoritesView.java).
* The ["GymController" type](Project/gymbro/src/main/java/com/gymbro/city/controller/GymController.java) composites the ["GymView" type](Project/gymbro/src/main/java/com/gymbro/city/view/GymView.java).
* The ["PropertiesMenuController" type](Project/gymbro/src/main/java/com/gymbro/city/controller/PropertiesMenuController.java) composites the ["PropertiesMenuView" type](Project/gymbro/src/main/java/com/gymbro/city/view/PropertiesMenuView.java).
* The ["FavoritesView" type](Project/gymbro/src/main/java/com/gymbro/city/view/FavoritesView.java) composites the ["FavoritesModel" type](Project/gymbro/src/main/java/com/gymbro/city/model/FavoritesModel.java).
* The ["GymView" type](Project/gymbro/src/main/java/com/gymbro/city/view/GymView.java) composites the ["GymModel" type](Project/gymbro/src/main/java/com/gymbro/city/model/GymModel.java).
* The ["MapView" type](Project/gymbro/src/main/java/com/gymbro/city/view/MapView.java) composites the ["MapModel" type](Project/gymbro/src/main/java/com/gymbro/city/model/MapModel.java).
* The ["PropertiesMenuView" type](Project/gymbro/src/main/java/com/gymbro/city/view/PropertiesMenuView.java) composites the ["PropertiesMenuModel" type](Project/gymbro/src/main/java/com/gymbro/city/model/PropertiesMenuModel.java).
* The ["Parser" type](Project/gymbro/src/main/java/com/gymbro/file/Parser.java) composites the ["GymModel" type](Project/gymbro/src/main/java/com/gymbro/city/model/GymModel.java).
* The ["Parser" type](Project/gymbro/src/main/java/com/gymbro/file/Parser.java) composites the ["PropertiesMenuController" type](Project/gymbro/src/main/java/com/gymbro/city/controller/PropertiesMenuController.java).
* The ["Parser" type](Project/gymbro/src/main/java/com/gymbro/file/Parser.java) composites the ["GymController" type](Project/gymbro/src/main/java/com/gymbro/city/controller/GymController.java).
* The ["Parser" type](Project/gymbro/src/main/java/com/gymbro/file/Parser.java) composites the ["Property" type](Project/gymbro/src/main/java/com/gymbro/utils/Property.java).
* The ["SceneEventManager" type](Project/gymbro/src/main/java/com/gymbro/managers/event/SceneEventManager.java) composites the ["EventManager" type](Project/gymbro/src/main/java/com/gymbro/managers/event/EventManager.java).
* The ["Transform" type](Project/gymbro/src/main/java/com/gymbro/utils/Transform.java) composites the ["Vector2D" type](Project/gymbro/src/main/java/com/gymbro/utils/Vector2D.java).
* The ["Window" type](Project/gymbro/src/main/java/com/gymbro/window/Window.java) composites the ["Transform" type](Project/gymbro/src/main/java/com/gymbro/utils/Transform.java).
* The ["Window" type](Project/gymbro/src/main/java/com/gymbro/window/Window.java) composites the ["Vector2D" type](Project/gymbro/src/main/java/com/gymbro/utils/Vector2D.java).

##### Aggregation
* The ["BuilderMVC" type](Project/gymbro/src/main/java/com/gymbro/city/builder/[BuilderMVC](Project/gymbro/src/main/java/com/gymbro/city/builder/BuilderMVC.java).java) aggregates the ["Controller" type](Project/gymbro/src/main/java/com/gymbro/city/controller/Controller.java).
* The ["BuilderMVC" type](Project/gymbro/src/main/java/com/gymbro/city/builder/[BuilderMVC](Project/gymbro/src/main/java/com/gymbro/city/builder/BuilderMVC.java).java) aggregates the ["View" type](Project/gymbro/src/main/java/com/gymbro/city/view/View.java).
* The ["BuilderMVC" type](Project/gymbro/src/main/java/com/gymbro/city/builder/[BuilderMVC](Project/gymbro/src/main/java/com/gymbro/city/builder/BuilderMVC.java).java) aggregates the ["Model" type](Project/gymbro/src/main/java/com/gymbro/city/model/Model.java).
* The ["Controller" type](Project/gymbro/src/main/java/com/gymbro/city/controller/Controller.java) aggregates the ["Model" type](Project/gymbro/src/main/java/com/gymbro/city/model/Model.java).
* The ["Controller" type](Project/gymbro/src/main/java/com/gymbro/city/controller/Controller.java) aggregates the ["View" type](Project/gymbro/src/main/java/com/gymbro/city/view/View.java).
* The ["FavoritesModel" type](Project/gymbro/src/main/java/com/gymbro/city/model/FavoritesModel.java) aggregates the ["GymController" type](Project/gymbro/src/main/java/com/gymbro/city/controller/GymController.java).
* The ["GymModel" type](Project/gymbro/src/main/java/com/gymbro/city/model/GymModel.java) aggregates the ["PropertiesMenuController" type](Project/gymbro/src/main/java/com/gymbro/city/controller/PropertiesMenuController.java).
* The ["MapModel" type](Project/gymbro/src/main/java/com/gymbro/city/model/MapModel.java) aggregates the ["GymController" type](Project/gymbro/src/main/java/com/gymbro/city/controller/GymController.java).
* The ["Model" type](Project/gymbro/src/main/java/com/gymbro/city/model/Model.java) aggregates the ["Transform" type](Project/gymbro/src/main/java/com/gymbro/utils/Transform.java).
* The ["PropertiesMenuModel" type](Project/gymbro/src/main/java/com/gymbro/city/model/PropertiesMenuModel.java) aggregates the ["Property" type](Project/gymbro/src/main/java/com/gymbro/utils/Property.java).
* The ["PropertiesMenuModel" type](Project/gymbro/src/main/java/com/gymbro/city/model/PropertiesMenuModel.java) aggregates the ["GymController" type](Project/gymbro/src/main/java/com/gymbro/city/controller/GymController.java).
* The ["View" type](Project/gymbro/src/main/java/com/gymbro/city/view/View.java) aggregates the ["Model" type](Project/gymbro/src/main/java/com/gymbro/city/model/Model.java).
* The ["FavoritesHandler" type](Project/gymbro/src/main/java/com/gymbro/handlers/FavoritesHandler.java) aggregates the ["FavoritesController" type](Project/gymbro/src/main/java/com/gymbro/city/controller/FavoritesController.java).
* The ["EventManager" type](Project/gymbro/src/main/java/com/gymbro/managers/event/EventManager.java) aggregates the ["EventEntry" type](Project/gymbro/src/main/java/com/gymbro/managers/event/EventEntry.java).
* The ["Setup" type](Project/gymbro/src/main/java/com/gymbro/setups/Setup.java) aggregates the ["MapController" type](Project/gymbro/src/main/java/com/gymbro/city/controller/MapController.java).
* The ["Transform" type](Project/gymbro/src/main/java/com/gymbro/utils/Transform.java) aggregates the ["Vector2D" type](Project/gymbro/src/main/java/com/gymbro/utils/Vector2D.java).
* The ["Window" type](Project/gymbro/src/main/java/com/gymbro/window/Window.java) aggregates the ["SceneManager" type](Project/gymbro/src/main/java/com/gymbro/managers/scene/SceneManager.java).
* The ["Window" type](Project/gymbro/src/main/java/com/gymbro/window/Window.java) aggregates the ["SceneEventManager" type](Project/gymbro/src/main/java/com/gymbro/managers/event/SceneEventManager.java).
* The ["Window" type](Project/gymbro/src/main/java/com/gymbro/window/Window.java) aggregates the ["Setup" type](Project/gymbro/src/main/java/com/gymbro/setups/Setup.java).
* The ["Window" type](Project/gymbro/src/main/java/com/gymbro/window/Window.java) aggregates the ["GymController" type](Project/gymbro/src/main/java/com/gymbro/city/controller/GymController.java).

##### Associations
* The ["GymView" type](Project/gymbro/src/main/java/com/gymbro/city/view/GymView.java) is associated with the ["Window" type](Project/gymbro/src/main/java/com/gymbro/window/Window.java).
* The ["PropertiesMenuView" type](Project/gymbro/src/main/java/com/gymbro/city/view/PropertiesMenuView.java) is associated with the ["Window" type](Project/gymbro/src/main/java/com/gymbro/window/Window.java).
* The ["View" type](Project/gymbro/src/main/java/com/gymbro/city/view/View.java) is associated with the ["Window" type](Project/gymbro/src/main/java/com/gymbro/window/Window.java).
* The ["Main" type](Project/gymbro/src/main/java/com/gymbro/Main.java) is associated with the ["Window" type](Project/gymbro/src/main/java/com/gymbro/window/Window.java).
* The ["Setup" type](Project/gymbro/src/main/java/com/gymbro/setups/Setup.java) is associated with the ["Window" type](Project/gymbro/src/main/java/com/gymbro/window/Window.java).
* The ["FavoritesMenuFxmlController" type](Project/gymbro/src/main/java/com/gymbro/window/fxml/FavoritesMenuFxmlController.java) is associated with the ["Window" type](Project/gymbro/src/main/java/com/gymbro/window/Window.java).
* The ["MainMenuFxmlController" type](Project/gymbro/src/main/java/com/gymbro/window/fxml/MainMenuFxmlController.java) is associated with the ["Window" type](Project/gymbro/src/main/java/com/gymbro/window/Window.java).
* The ["MapFxmlController" type](Project/gymbro/src/main/java/com/gymbro/window/fxml/MapFxmlController.java) is associated with the ["Window" type](Project/gymbro/src/main/java/com/gymbro/window/Window.java).
* The ["PropertiesMenuFxmlController"](Project/gymbro/src/main/java/com/gymbro/window/fxml/PropertiesMenuFxmlController.java) type is associated with the ["Window" type](Project/gymbro/src/main/java/com/gymbro/window/Window.java).

##### Polymorphism
* [Class FavoritesModel](Project/gymbro/src/main/java/com/gymbro/city/model/FavoritesModel.java):
  * The "model" object implements polymorphism.
* [Class PropertiesMenuModel](Project/gymbro/src/main/java/com/gymbro/city/model/PropertiesMenuModel.java):
  * The "property" object implements polymorphism.
  * The "model" object implements polymorphism.
* [Class PropertiesMenuView](Project/gymbro/src/main/java/com/gymbro/city/view/PropertiesMenuView.java):
  * The "property" object implements polymorphism.
* [Class Parser](Project/gymbro/src/main/java/com/gymbro/file/Parser.java):
  * The "model" object implements polymorphism.
  * The "model" object implements polymorphism.
  * The "model" object implements polymorphism.
* [Class FavoritesMenuFxmlController](Project/gymbro/src/main/java/com/gymbro/window/fxml/FavoritesMenuFxmlController.java):
  * The "controller" object implements polymorphism.
* [[Class Main](Project/gymbro/src/main/java/com/gymbro/Main.java)MenuFxmlController](Project/gymbro/src/main/java/com/gymbro/window/fxml/MainMenuFxmlController.java):
  * The "controller" object implements polymorphism.
  * The "controller" object implements polymorphism.
* [Class MapFxmlController](Project/gymbro/src/main/java/com/gymbro/window/fxml/MapFxmlController.java):
  * The "setup" object implements polymorphism.
  * The "setup" object implements polymorphism.



##### Inheritence and Implementations
* [FavoritesBuilder.java](Project/gymbro/src/main/java/com/gymbro/city/builder/FavoritesBuilder.java):
  * Inheritance found at line 17:
  * "public [class FavoritesBuilder](Project/gymbro/src/main/java/com/gymbro/city/builder/FavoritesBuilder.java) extends [BuilderMVC](Project/gymbro/src/main/java/com/gymbro/city/builder/BuilderMVC.java){"

* [GymBuilder.java](Project/gymbro/src/main/java/com/gymbro/city/builder/GymBuilder.java):
  * Inheritance found at line 16:
  * "public [class GymBuilder](Project/gymbro/src/main/java/com/gymbro/city/builder/GymBuilder.java) extends [BuilderMVC](Project/gymbro/src/main/java/com/gymbro/city/builder/BuilderMVC.java){"

* [MapBuilder.java](Project/gymbro/src/main/java/com/gymbro/city/builder/MapBuilder.java):
  * Inheritance found at line 19:
  * "public [class MapBuilder](Project/gymbro/src/main/java/com/gymbro/city/builder/MapBuilder.java) extends [BuilderMVC](Project/gymbro/src/main/java/com/gymbro/city/builder/BuilderMVC.java){"

* [PropertiesMenuBuilder.java](Project/gymbro/src/main/java/com/gymbro/city/builder/PropertiesMenuBuilder.java):
  * Inheritance found at line 19:
  * "public [class PropertiesMenuBuilder](Project/gymbro/src/main/java/com/gymbro/city/builder/PropertiesMenuBuilder.java) extends [BuilderMVC](Project/gymbro/src/main/java/com/gymbro/city/builder/BuilderMVC.java){"

* [FavoritesController.java](Project/gymbro/src/main/java/com/gymbro/city/controller/FavoritesController.java):
  * Inheritance found at line 9:
  * "public [class FavoritesController](Project/gymbro/src/main/java/com/gymbro/city/controller/FavoritesController.java) extends [Controller](Project/gymbro/src/main/java/com/gymbro/city/controller/Controller.java){"

* [GymController.java](Project/gymbro/src/main/java/com/gymbro/city/controller/GymController.java):
  * Inheritance found at line 13:
  * "public [class GymController](Project/gymbro/src/main/java/com/gymbro/city/controller/GymController.java) extends [Controller](Project/gymbro/src/main/java/com/gymbro/city/controller/Controller.java){"

* [MapController.java](Project/gymbro/src/main/java/com/gymbro/city/controller/MapController.java):
  * Inheritance found at line 13:
  * "public [class MapController](Project/gymbro/src/main/java/com/gymbro/city/controller/MapController.java) extends [Controller](Project/gymbro/src/main/java/com/gymbro/city/controller/Controller.java){"

* [PropertiesMenuController.java](Project/gymbro/src/main/java/com/gymbro/city/controller/PropertiesMenuController.java):
  * Inheritance found at line 12:
  * "public [class PropertiesMenuController](Project/gymbro/src/main/java/com/gymbro/city/controller/PropertiesMenuController.java) extends [Controller](Project/gymbro/src/main/java/com/gymbro/city/controller/Controller.java){"

* [FavoritesModel.java](Project/gymbro/src/main/java/com/gymbro/city/model/FavoritesModel.java):
  * Inheritance found at line 13:
  * "public [class FavoritesModel](Project/gymbro/src/main/java/com/gymbro/city/model/FavoritesModel.java) extends [Model](Project/gymbro/src/main/java/com/gymbro/city/model/Model.java){"

* [GymModel.java](Project/gymbro/src/main/java/com/gymbro/city/model/GymModel.java):
  * Inheritance found at line 11:
  * "public [class GymModel](Project/gymbro/src/main/java/com/gymbro/city/model/GymModel.java) extends [Model](Project/gymbro/src/main/java/com/gymbro/city/model/Model.java){"

* [MapModel.java](Project/gymbro/src/main/java/com/gymbro/city/model/MapModel.java):
  * Inheritance found at line 14:
  * "public [class MapModel](Project/gymbro/src/main/java/com/gymbro/city/model/MapModel.java) extends [Model](Project/gymbro/src/main/java/com/gymbro/city/model/Model.java){"

* [Model.java](Project/gymbro/src/main/java/com/gymbro/city/model/Model.java):
  * Implementation of an interface found at line 16:
  * "public [abstract class Model](Project/gymbro/src/main/java/com/gymbro/city/model/Model.java) implements [Serialization](Project/gymbro/src/main/java/com/gymbro/file/Serialization.java){"

* [PropertiesMenuModel.java](Project/gymbro/src/main/java/com/gymbro/city/model/PropertiesMenuModel.java):
  * Inheritance found at line 14:
  * "public [class PropertiesMenuModel](Project/gymbro/src/main/java/com/gymbro/city/model/PropertiesMenuModel.java) extends [Model](Project/gymbro/src/main/java/com/gymbro/city/model/Model.java){"

* [FavoritesView.java](Project/gymbro/src/main/java/com/gymbro/):
  * Inheritance found at line 8:
  * "public [class FavoritesView](Project/gymbro/src/main/java/com/gymbro/city/view/FavoritesView.java) extends [View](Project/gymbro/src/main/java/com/gymbro/city/view/View.java){"

* [GymView.java](Project/gymbro/src/main/java/com/gymbro/):
  * Inheritance found at line 12:
  * "public [class GymView](Project/gymbro/src/main/java/com/gymbro/city/view/GymView.java) extends [View](Project/gymbro/src/main/java/com/gymbro/city/view/View.java){"

* [MapView.java](Project/gymbro/src/main/java/com/gymbro/):
  * Inheritance found at line 8:
  * "public [class MapView](Project/gymbro/src/main/java/com/gymbro/city/view/MapView.java) extends [View](Project/gymbro/src/main/java/com/gymbro/city/view/View.java){"

* [PropertiesMenuView.java](Project/gymbro/src/main/java/com/gymbro/):
  * Inheritance found at line 17:
  * "public [class PropertiesMenuView](Project/gymbro/src/main/java/com/gymbro/city/view/PropertiesMenuView.java) extends [View](Project/gymbro/src/main/java/com/gymbro/city/view/View.java){"

* [Main.java](Project/gymbro/src/main/java/com/gymbro/):
  * Inheritance found at line 25:
  * "public [class Main](Project/gymbro/src/main/java/com/gymbro/Main.java) extends Application{"

* [EventEntry.java](Project/gymbro/src/main/java/com/gymbro/):
  * Inheritance found at line 12:
  * "public [class EventEntry](Project/gymbro/src/main/java/com/gymbro/managers/event/EventEntry.java)\<T extends Event>{"

* [EventManager.java](Project/gymbro/src/main/java/com/gymbro/):
  * Inheritance found at line 16:
  * "public [class EventManager](Project/gymbro/src/main/java/com/gymbro/managers/event/EventManager.java)\<T extends Event>{"

* [SetupFavorites.java](Project/gymbro/src/main/java/com/gymbro/):
  * Inheritance found at line 14:
  * "public [class SetupFavorites](Project/gymbro/src/main/java/com/gymbro/setups/SetupFavorites.java) extends [Setup](Project/gymbro/src/main/java/com/gymbro/setups/Setup.java){"

* [FileNameException.java](Project/gymbro/src/main/java/com/gymbro/):
  * Inheritance found at line 6:
  * "public [class FileNameException](Project/gymbro/src/main/java/com/gymbro/utils/FileNameException.java) extends Exception{"

* [Property.java](Project/gymbro/src/main/java/com/gymbro/):
  * Implementation of an interface found at line 8:
  * "public [class Property](Project/gymbro/src/main/java/com/gymbro/utils/Property.java) implements [Serialization](Project/gymbro/src/main/java/com/gymbro/file/Serialization.java){"

* [Transform.java](Project/gymbro/src/main/java/com/gymbro/):
  * Implementation of an interface found at line 11:
  * "public [class Transform](Project/gymbro/src/main/java/com/gymbro/utils/Transform.java) implements [Serialization](Project/gymbro/src/main/java/com/gymbro/file/Serialization.java){"

* [UnknownGymException.java](Project/gymbro/src/main/java/com/gymbro/):
  * Inheritance found at line 6:
  * "public [class UnknownGymException](Project/gymbro/src/main/java/com/gymbro/utils/UnknownGymException.java) extends RuntimeException{"

* [Vector2D.java](Project/gymbro/src/main/java/com/gymbro/):
  * Implementation of an interface found at line 12:
  * "public [class Vector2D](Project/gymbro/src/main/java/com/gymbro/utils/Vector2D.java) implements [Serialization](Project/gymbro/src/main/java/com/gymbro/file/Serialization.java){"

* [WriteFileException.java](Project/gymbro/src/main/java/com/gymbro/):
  * Inheritance found at line 6:
  * "public [class WriteFileException](Project/gymbro/src/main/java/com/gymbro/utils/WriteFileException.java) extends RuntimeException {"

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
* [Builder](Project/gymbro/src/main/java/com/gymbro/city/builder/)
  * [com.gymbro.city.builder](Project/gymbro/src/main/java/com/gymbro/city/builder/)
* [Factory](Project/gymbro/src/main/java/com/gymbro/city/factory/)
  * [com.gymbro.city.factory](Project/gymbro/src/main/java/com/gymbro/city/factory/)
* [MVC](Project/gymbro/src/main/java/com/gymbro/city)
  * [com.gymbro.city.model](Project/gymbro/src/main/java/com/gymbro/city/model/)
  * [com.gymbro.city.view](Project/gymbro/src/main/java/com/gymbro/city/view/)
  * [com.gymbro.city.controller](Project/gymbro/src/main/java/com/gymbro/city/controller/)
* [Singleton](Project/gymbro/src/main/java/com/gymbro/window/Window.java)
  * [com.gymbro.city.window.Window](Project/gymbro/src/main/java/com/gymbro/window/Window.java) (singleton class)

### Final words
All of the OOP principles, design patterns and other details about the project are thoroughly described in [project documentation](Documentation/KB3/GymBro_Documentation.pdf).