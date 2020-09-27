package lsc.tests;

public class AppBuilder {

    private App object = new App();

    public App build() {
        return object;
    }

    public AppBuilder setMsg(java.lang.String value) {
        object.setMsg(value);
        return this;
    }

}
