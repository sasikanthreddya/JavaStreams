import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ComparableExampel implements Comparable{
   int id;
   String name;

    public ComparableExampel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ComparableExampel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        ComparableExampel o1= (ComparableExampel) o;
        int id=o1.getId();
        int id2= this.id;
        if(id>id2){
            return 1;
        }
        else if (id<id2){
            return  -1;
        }
        else
            return 0;
    }

    public static void main(String[] args) {
        ComparableExampel exampel=new ComparableExampel(1,"sas");
        ComparableExampel e2=new ComparableExampel(6,"dd");
        ComparableExampel e3=new ComparableExampel(9,"gg");
        List<ComparableExampel>l2=new ArrayList<>();
        l2.add(exampel);
        l2.add(e2);
        l2.add(e3);
        System.out.println("natural sorting"+l2);
        TreeSet t2=new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                ComparableExampel s= (ComparableExampel) o1;
                ComparableExampel s2= (ComparableExampel) o2;
                return s.getName().compareTo(s2.getName());
            }
        });

        t2.add(exampel);
        t2.add(e2);
        t2.add(e3);
        //System.out.println(t2);

        List<ComparableExampel>l1=new ArrayList<>();
        l1.add(exampel);
        l1.add(e2);
        l1.add(e3);
        l1.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println("custom sorting"+l1);


    }
}
