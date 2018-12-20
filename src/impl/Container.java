package impl;

public interface Container extends Lifecycle {
    void addChild(Container child);
}
