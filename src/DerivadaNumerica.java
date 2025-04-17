public class DerivadaNumerica {
    double x = 1.2;
    double h = 0.0001;

    public static void main(String[] args) {
        DerivadaNumerica mn = new DerivadaNumerica(); // Crear instancia para acceder a métodos y variables no estáticas
        System.out.println("Metodo de Newton");
        System.out.println("La funcion evaluada en x = " + mn.x + " es f(x) = " + mn.f(mn.x));
        System.out.println("La derivada en x = " + mn.x + " es f'(x) = " + mn.derivada(mn.x, mn.h));
        System.out.println("La segunda derivada en x = " + mn.x + " es f''(x) = " + mn.segundaDerivada(mn.x, mn.h));
        System.out.println("El error -O(h^2)- es  "+mn.h* mn.h+ " con h = "+mn.h);
    }

    double f(double x) {
        // Funcion a derivar, usamos un polinomio como ejemplo
        return 2 * Math.pow(x, 3) - 5;
    }

    double derivada(double x, double h) {
        double temp = f(x + h) - f(x - h);
        return temp / (2 * h);
    }

    double segundaDerivada(double x, double h) {
        return (f(x + h) - 2 * f(x) + f(x - h)) / (h * h);
    }
}
