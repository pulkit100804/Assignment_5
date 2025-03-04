class Cylinder extends Shape {
    double radius, height;

    Cylinder(double radius, double height) {
        this.shapeName = "Cylinder"; // Manually setting shape name
        this.radius = radius;
        this.height = height;
    }

    double calculateArea() {
        return 2 * 3.14 * radius * (radius + height);
    }

    double calculatePerimeter() {
        return 0; // Cylinders don't have perimeters
    }

    double calculateVolume() {
        return 3.14 * radius * radius * height;
    }
}