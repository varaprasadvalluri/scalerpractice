package com.gof.design.pattrens.prototype.factory;

public class FactoryPattrens {
    public static void main(String[] args) {

        Person male = PersonFactory.getPerson("Robinhood", "M");
        System.out.println(male.getNameAndSalutation());
        Person female = PersonFactory.getPerson("Mary", "F");
        System.out.println(female.getNameAndSalutation());

    }

    public static class PersonFactory {
        public static Person getPerson(String name, String gender) {
            if (gender.equalsIgnoreCase("M")) {
                return new Male(name);
            } else if (gender.equalsIgnoreCase("F")) {
                return new Female(name);
            } // So on
            return null;

        }

    }

    static abstract class Person {
        Person(String name) {
            this.name = name;
        }
        private String name;
        abstract String getSalutation();
        String getNameAndSalutation() {
            return getSalutation() + ". " + this.name;
        }
    }

    static class Male extends Person {
        public Male(String name) {
            super(name);
        }
        @Override
        String getSalutation() {
            return "Mr";
        }
    }

    static class Female extends Person {
        public Female(String name) {
            super(name);
        }

        @Override
        String getSalutation() {
            return "Miss/Mrs";
        }
    }
}