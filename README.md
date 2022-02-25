# upGradCarProject
## An upGrad project to demonstrate encapsulation and Abstraction

> upGradCarProject is reshaping the way automobile companies will produce cars in the future. This will serve as a regulatory model to enable Car manufacturers churn out and implement each of the various features of their cars. Think about what happens when each car manufacture has a common ground to automate most of their car features like acceleration, reverse, horn, stopping and every other feature that goes in a car. With upGradCar project, every Car manufacture has the leverage to produce and easily implement features best suited for its car process.

# The project uses the MVC pattern where we have the Model View Controller

upGradCarProject
 └── idea
    └── libraries
        └── KotlinJavaRuntime.xml
    └── .gitignore
    └── misc.xml
    └── modules.xml
    └── runConfigurations.xml
    └── uiDesigner.xml
    └── vcs.xml
    └── workspace.xml
 └── out
    └── production
      └── upGradCarProject
        └── Controllers
        └── Interfaces
        └── Model
        └── upGradCarMainProject
 └── src
    └── Controllers
      └── Utils # This is package where we can add our Utils class for specific generic actions
      └── AudiCarControllerClass.java # This is the controller class for wiring the various components of Audi
      └── BMWCarControllerClass.java # This is the controller class for wiring the various components of BMW
      └── MercedesCarControllerClass.java # This is the controller class for wiring the various components of Mercedes
      └── TeslaCarControllerClass.java # This is the controller class for wiring the various components of Tesla
      └── ToyotaCarControllerClass.java # This is the controller class for wiring the various components of Toyota
    └── Interfaces
      └── CarUpgradAbstractClass.java # This is the abstract class that will contain some unimplemented methods that are statutory for all car manufatures for safety purposes
      └── CarUpgradInterface.java # This is the interface that contains unimplemented methods like ## implementBrake(), ## implementHorn() and more which every car will use
    └── Model
      └── AudiCarModelClass.java # This is the class where you add attributes and methods unique to only Audi cars
      └── BMWCarModelClass.java # This is the class where you add attributes and methods unique to only BMW cars
      └── CarBrakeModel.java # This is the class created to demonstrate CarBrake components
      └── MercedesCarModel.java # This is the class where you add attributes and methods unique to only Mercedes cars
      └── TeslaCarModel.java # This is the class where you add attributes and methods unique to only Tesla cars
      └── ToyotaCarModel.java # This is the class where you add attributes and methods unique to only Toyota cars
    └── upGradCarProject.java   # This is the entry point or the main class of the project. Here you can have the public static void main method that displays result to users
 └── .gitignore
 └── README.md
 └── upGradCarProject.iml
 └── External Libraries
 └── Scratch and Consoles
 
 # Steps
 
 > Visit the repository https://github.com/UncleSamTech/upGradCarProject
 > Download Git if you don't have it installed here => https://git-scm.com/downloads
 > Clone the project from as-is >> git clone https://github.com/UncleSamTech/upGradCarProject.git
 > Once cloned..checkout to your branch >> git checkout -b feature/SinghGroup
 > Update with the latest resource for your branch >> git pull origin [branch_name] i.e feature/SinghGroup (git pull origin feature/SinghGroup)
 > Code along by choosing the carManufaturer assigned to you
 
 ## SinghGroup >> Work on Toyota
 ## RaoGroup >> Work on BMW
 ## SahilGroup >> work on Mercedes
 ## DangGroup >> work on Audi
 ## Samuel will work on Tesla
 
 
 >> You are expected to research a bit on how this cars implement or design some of their cars and see how you can automate the process via code Goodluck..Have any questions email me at samueloel3486@gmail.com
