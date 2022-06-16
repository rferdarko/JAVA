public class RobotTester {
    public static void main(String[] args) {
        // create a new instance of Robot and
        // calls the constructor method to initialize the object
        // assigns a reference type variable to call Robots methods
        Robot robot = new Robot(60); // with the overloaded constructor we can provide a maxSpeed int value
        robot.travel();  // calls the travel method from the Robot class via the reverence variable robot
        // this method will print a statement along with the maxSpeed parameter set above


    }
}
