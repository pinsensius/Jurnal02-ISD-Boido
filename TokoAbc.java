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
        System.out.println("Sebuah data telah diubah pada indeks ke-"+index);
        System.out.println();
        System.out.println("Dengan data berikut ("+elements+")");
        System.out.println();


    }

    public void removeData(int entry){
        list.remove(entry);
        System.out.println("Sebuah data telah dihapus pada indeks ke-"+entry);
    }

    public void display(){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i) + " ");
        }

        System.out.println();
    }
}