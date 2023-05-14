package OtherProject.Garbage;

class GarbageCreator {
    int id;
    GarbageCreator(int id){
        this.id = id;
    }
    public void garbageCreator(){
        System.out.println("Objects created");
    }
    
}

class CreateGarbage{
    public static void main(String [] args){
        final int MAX_OBJECTS = 200000;
        for(int i = 0; i < MAX_OBJECTS; i++){
            new GarbageCreator(i).garbageCreator();;
        }
    }
}