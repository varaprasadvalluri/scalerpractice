package com.gof.design.pattrens.prototype.factory;

import java.io.*;
import java.lang.reflect.Constructor;

public class SingletonDesignPattrens implements Cloneable, Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        SingletonDesignPattrens instance1 = SingletonDesignPattrens.getSingletonInstance();
//        SingletonDesignPattrens instance2 = null;
//        try {
//            Constructor[] constructors = SingletonDesignPattrens.class.getDeclaredConstructors();
//            for (Constructor constructor : constructors) {
//                constructor.setAccessible(true);
//                instance2 = (SingletonDesignPattrens) constructor.newInstance();
//                break;
//            }
//        } catch (Exception e) {
//            System.out.println("Exception is --" + e.getLocalizedMessage());
//        }
        SingletonDesignPattrens instance1 = SingletonDesignPattrens.getSingletonInstance();
        ObjectOutput out
                = new ObjectOutputStream(new FileOutputStream("file.text"));
        out.writeObject(instance1);
        out.close();
        // deserialize from file to object
        ObjectInput in
                = new ObjectInputStream(new FileInputStream("file.text"));
        SingletonDesignPattrens instance2 = (SingletonDesignPattrens) in.readObject();
        in.close();
        System.out.println("instance1.hashCode():- " + instance1.hashCode());
        System.out.println("instance2.hashCode():- " + instance2.hashCode());
    }

    public static SingletonDesignPattrens singleton = null;

    private SingletonDesignPattrens() {
    }

    public static SingletonDesignPattrens getSingletonInstance() {
        if (singleton == null) {
            synchronized (SingletonDesignPattrens.class) {
                if (singleton == null)
                    singleton = new SingletonDesignPattrens();
            }
        }
        return singleton;
    }

    protected Object readResolve() {
        return singleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return singleton;
    }
}
