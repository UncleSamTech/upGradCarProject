package Model;

public class CarBrakeModel {

    private double PeakForce;
    private double Power;
    private double Weight;
    private double ContinousPowerDissipation;
    private double Fade;
    private double Drag;

    public double getPeakForce() {
        return PeakForce;
    }

    public void setPeakForce(double peakForce) {
        PeakForce = peakForce;
    }

    public double getPower() {
        return Power;
    }

    public void setPower(double power) {
        Power = power;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    public double getContinousPowerDissipation() {
        return ContinousPowerDissipation;
    }

    public void setContinousPowerDissipation(double continousPowerDissipation) {
        ContinousPowerDissipation = continousPowerDissipation;
    }

    public double getFade() {
        return Fade;
    }

    public void setFade(double fade) {
        Fade = fade;
    }

    public double getDrag() {
        return Drag;
    }

    public void setDrag(double drag) {
        Drag = drag;
    }
}
