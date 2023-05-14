package OtherProject.Garbage;

class NoGarbage {
    int id;
    NoGarbage(int id){
        this.id = id;
    }
    public void noGarbageCreator(){
        System.out.println("Objects created");
    }
    protected void finalize() throws Throwable {
        System.out.println("Object" + this.id + " Successfully collected");
     }
}

class Garbage{
    public static void main(String [] args){
        final int MAX_OBJECTS = 200000;
        for(int i = 1; i <= MAX_OBJECTS; i++){
            new NoGarbage(i).noGarbageCreator();
            System.gc();
        }    
    }
}