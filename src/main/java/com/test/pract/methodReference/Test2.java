package com.test.pract.methodReference;

public class Test2 {

    public static void main(String[] args) throws Exception {

       String name = createAnyInstance(String.class.getName());
    }
    public static <T> T createInstance(Supplier<T> s) throws Exception{
      return s.get();
    }

    public static <T> T createAnyInstance(String name) throws Exception{
        T newObj = (T) Class.forName(name).newInstance();
        return newObj;
    }
}