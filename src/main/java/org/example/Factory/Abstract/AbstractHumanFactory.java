package org.example.Factory.Abstract;

import org.example.Factory.Interface.Human;

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
