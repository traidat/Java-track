class SpaceAge {

    double spaceAge ;

    SpaceAge(double seconds) {
        this.spaceAge = seconds;
    }

    double getSeconds() {
        return this.spaceAge;
    }

    double onEarth() {
        return this.spaceAge / 31557600;
    }

    double onMercury() {
        return this.spaceAge / 31557600 / 0.2408467;
    }

    double onVenus() {
        return this.spaceAge / 31557600 / 0.61519726;
    }

    double onMars() {
        return this.spaceAge / 31557600 / 1.8808158;
    }

    double onJupiter() {
        return this.spaceAge / 31557600 / 11.862615;
    }

    double onSaturn() {
        return this.spaceAge / 31557600 / 29.447498;
    }

    double onUranus() {
        return this.spaceAge / 31557600 / 84.016846;
    }

    double onNeptune() {
        return this.spaceAge / 31557600 / 164.79132;
    }

}
