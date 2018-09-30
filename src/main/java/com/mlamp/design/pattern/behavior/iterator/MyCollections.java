package com.mlamp.design.pattern.behavior.iterator;

public class MyCollections implements Collection {

    public String coutries[] = {
            "China",
            "America",
            "Russia",
            "Europe"
    };

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

    @Override
    public Object get(int index) {
        return coutries[index];
    }

    @Override
    public int size() {
        return coutries.length;
    }

    private class MyIterator implements Iterator {

        int index;

        @Override
        public Object next() {
            if (hasNext()) {
                return coutries[index++];
            } else {
                return coutries[index];
            }

        }

        @Override
        public boolean hasNext() {
            return index < coutries.length ? true : false;
        }

        public boolean hasPrevious() {
            return index > 0 ? true : false;
        }

        @Override
        public int size() {
            return coutries.length;
        }

        @Override
        public Object previous() {
            if (hasPrevious()) {
                return coutries[index--];
            } else {
                return coutries[index];
            }
        }
    }
}
