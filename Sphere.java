class Sphere extends Shape {
    double radius;

    Sphere(double radius) {
        this.shapeName = "Sphere"; // Manually setting shape name
        this.radius = radius;
    }

    double calculateArea() {
        return 4 * 3.14 * radius * radius;
    }

    double calculatePerimeter() {
        return 0; // Spheres don't have perimeters
    }

    double calculateVolume() {
        return (4.0 / 3) * 3.14 * radius * radius * radius;
    }
}