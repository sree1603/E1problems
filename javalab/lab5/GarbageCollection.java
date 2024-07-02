public class GarbageCollection{ 
       public static void main(String args[ ]){
        // GarbageCollection obj=new GarbageCollection();
        // obj=null;
        // System.gc();
    }
    public void finalize(){
        System.out.println("Object is Garbage collected");

    }
}