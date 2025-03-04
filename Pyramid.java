class Pyramid extends Shape {
    double base, height;

    Pyramid(double base, double height) {
        this.shapeName = "Pyramid"; // Manually setting shape name
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        double slantHeight = Math.sqrt((base / 2) * (base / 2) + height * height);
        return (base * base) + (2 * base * slantHeight);
    }

    double calculatePerimeter() {
        return 4 * base;
    }

    double calculateVolume() {
        return (1.0 / 3) * base * base * height;
    }
}