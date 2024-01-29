package Array.OneDimArray;

public class ArrayOfObjectSize {
    public static void main(String[] args) {
        Car[] cars = new Car[5]; // {null, null ,null, null, null}
        cars[0] = new Car(200, "BMW");  // { (car: speed:200, name:BMW), null ,null, null, null}
        cars[3] = new Car(220, "AUDI");  // { (car: speed:200, name:BMW), null ,null,  (car: speed:220, name:AUDI), null}

        // write code to count the cars in the array!
        int counter = 0;
        for(int i = 0 ; i<cars.length; i++){
            if(cars[i] != null){
                counter++;
            }
        }

        System.out.println("Number of cars in the array = " + counter);
    }
}

class Car {
    int speed;
    String name;

    public Car(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }
}
