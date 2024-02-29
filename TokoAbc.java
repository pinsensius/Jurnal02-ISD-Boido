import java.util.ArrayList;

public class TokoAbc <E>{
    private final ArrayList<E> list;

    public TokoAbc(int kapasitas){
        int kapasitasToko = kapasitas > 0? kapasitas : 0;
        list = new ArrayList<>(kapasitasToko);
    }

    public void addItem(E values){
        list.add(values);
    }

    public void setData(int index, E elements){
        list.set(index, elements);

    }

    public void removeData(int entry){
        list.remove(entry);
    }

    public void display(){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i) + " ");
        }

        System.out.println();
    }
}