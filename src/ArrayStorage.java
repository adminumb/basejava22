/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    private Resume[] storage = new Resume[10000];
    private int size = 0;
    void clear() {
        for(int i=0; i<size;i++){
            storage[i]=null;
        }
    }

    public void update(Resume r){
        //+
        int index = getIndex(r.getUuid());
        if(index ==-1) {
            System.out.println("Error resume update");
        }
        else {
            storage[index]=r;
        }
    }

    public void save(Resume r) {
        //-
        int index = getIndex(r.getUuid());
        if(index !=-1) {
            System.out.println("Error save");
        } else if (size==storage.length) {
            System.out.println("Storage overflow");
        } else {
            storage[size]=r;
            size++;
        }
    }
    public Resume get(String uuid){
        //+
        int index = getIndex(uuid);
        if(index ==-1) {
            System.out.println("Error resume get");
            return null;
        }
        return storage[index];
    }



    public void delete(String uuid) {
        // +
        int index = getIndex(uuid);
        if(index ==-1) {
            System.out.println("Error delete");
        }
        else {
            storage[index] = storage[size - 1];
            storage[size - 1] = null;
            size--;
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    public Resume[] getAll() {
        Resume[] result =new Resume[size];
        for(int i=0; i<size;i++){
            result[i] = storage[i];
        }
        return result;
    }

    public int size() {
        return size;
    }
    private int getIndex(String uuid){
        for(int i=0; i<size;i++){
            if(uuid==storage[i].getUuid()){
                return i;
            }
        }
        return -1;
    }
}
