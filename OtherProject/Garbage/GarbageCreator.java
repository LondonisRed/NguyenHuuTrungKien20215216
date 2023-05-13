package OtherProject.Garbage;

class GarbageCreator {
    GarbageCreator(){
        System.out.println("Objects created");
    }
    protected void finalize(){
        System.out.println("Objects destroyed.");
    }
}

class CreateGarbage{
    public static void main(String [] args){
        final int MAX_OBJECTS = 20000000;
        
    }
}


