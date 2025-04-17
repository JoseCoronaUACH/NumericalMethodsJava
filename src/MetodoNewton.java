public class MetodoNewton {
    double tol = 1e-6;
    double x = 51.3;
    double h = 0.0001;
    int maxIter = 100;

    double metodoNewton() {
        DerivadaNumerica dn = new DerivadaNumerica();
        double x_old = x;
        double x_new = x_old;

        for (int i = 0; i < maxIter; i++) {
            double f_val = dn.f(x_old);
            double df_val = dn.derivada(x_old, h);

            if (Math.abs(df_val) < 1e-12) {
                System.out.println("La derivada es muy pequeña, posible división por cero.");
                break;
            }

            x_new = x_old - f_val / df_val;

            if (Math.abs(x_new - x_old) < tol) {
                System.out.println("Convergió en " + (i + 1) + " iteraciones.");
                break;
            }

            x_old = x_new;
        }

        return x_new;
    }

    public static void main(String[] args) {
        MetodoNewton mn = new MetodoNewton();
        double raiz = mn.metodoNewton();
        System.out.println("Raíz aproximada: " + raiz);
    }
}
