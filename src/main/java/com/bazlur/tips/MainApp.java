package com.bazlur.tips;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/2/15.
 */
public class MainApp {
    public static void main(String[] args) {
        //Files.walkFileTree(Paths.get("."), );

        //FileSystem aDefault = FileSystems.getDefault();
        //System.out.println(aDefault.provider().toString());

        //new LinuxFileSystemProvider();
//        Map<Object, Object> map = new WeakHashMap<>();
//        for (int i = 0; i < 1000; i++) {
//            map.put(i, new Object());
//            System.gc();
//            System.out.println("Map Size: " + map.size());
//        }
//
//
//        final int low = -128;
//        int high = 127;
//
//        System.out.println((high - low) + 1);
//
//        long sum = IntStream.range(0, 127).count();
//        System.out.println(sum);
//
//        String integerCacheHighPropValue =
//                sun.misc.VM.getSavedProperty("java.lang.Integer.IntegerCache.high");
//        System.out.println(integerCacheHighPropValue);
//
//        List list;

       // test();/**/

        System.out.println("_MAIN");
        new MainApp();

    }

    {
        System.out.println("_INIT");
    }

    static {
        System.out.println("_STATIC");
    }

    public MainApp() {
        System.out.println("_CONST");
    }

    public static void test(){

        try {
            System.out.println("-try");
            return;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            System.out.println("-finally");
        }
    }
}
