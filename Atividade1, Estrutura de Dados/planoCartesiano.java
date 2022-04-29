public class planoCartesiano {
    private float y;
    private float x;

    public planoCartesiano(float y, float x) {
        this.y = y;
        this.x = x;
    }

    public float yGet() {
        return y;
    }

    public void ySet(float y_) {
        y = y_;
    }

    public float xGet() {
        return x;
    }

    public void xSet(float x_) {
        x = x_;
    }

    public void calcularDistancia(float aX, float aY, float bX, float bY) {
        float distanciaAB;
        float R1 = (bX - aX);
        float R2 = (bY - aY);
        R2 = R2 * R2;
        R1 = R1 * R1;
        distanciaAB = R1 + R2;
        distanciaAB = (float) Math.sqrt(distanciaAB);
        System.out.println(distanciaAB);

    }
}
