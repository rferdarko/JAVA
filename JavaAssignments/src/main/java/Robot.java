public class Robot {

    private int maxSpeed;   // maxSpeed variable

    public Robot() {  // Constructor takes no parameters
        this.maxSpeed =1; // and sets the objects initial state
    }
    public Robot(int maxSpeed){ // overloaded constructor accepts a maxSpeed argument
        this.maxSpeed = maxSpeed;  // refers to the objects instance variable maxSpeed
    }

    public int getMaxSpeed() {   // getter
        return maxSpeed;
    }
        public void setMaxSpeed(int maxSpeed) {//setter
        if (maxSpeed >= 0)  // if maxSpeed is greater than or equal to zero
            this.maxSpeed = maxSpeed; // this instance variable is equal to the maxSpeed
        else this.maxSpeed = 0; // otherwise this instance variable is equal to zero
    }

        public void travel() {  // travel method prints statement and maxSpeed units
                System.out.println("The robot moves a distance of "+ maxSpeed + " units.");
        }

}
