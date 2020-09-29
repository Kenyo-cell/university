import java.util.ArrayList;

public class Main {
    public static final int BIGGER = 1;
    public static final int LESSER = -1;

    public static ArrayList<Student> sortArray(ArrayList<Student> arrayA, int bigOrLess) {

        if (arrayA.equals(null)) {
            return null;
        }

        if (arrayA.size() < 2) {
            return arrayA;
        }

        ArrayList<Student> arrayB = new ArrayList<Student>();
        for (int i = 0; i < arrayA.size() / 2; i++) {
            arrayB.add(arrayA.get(i));
        }

        ArrayList<Student> arrayC = new ArrayList<Student>(); 
        for (int i = arrayA.size() / 2; i < arrayA.size(); i++) {
            arrayC.add(arrayA.get(i));
        }

        arrayB = sortArray(arrayB, bigOrLess);
        arrayC = sortArray(arrayC, bigOrLess);
        return mergeArray(arrayB, arrayC, bigOrLess);
    }

    public static ArrayList<Student> mergeArray(ArrayList<Student> arrayА, ArrayList<Student> arrayB, int bigOrLess) {

        ArrayList<Student> arrayC = new ArrayList<Student>();
        int positionA = 0, positionB = 0;
        int length = arrayА.size() + arrayB.size();
        
        for (int i = 0; i < length; i++) {
            if (positionB == arrayА.size()){
                arrayC.add(arrayB.get(i - positionB));
                positionA++;
            } else if (positionA == arrayB.size()) {
                arrayC.add(arrayА.get(i - positionA));
                positionB++;
            } else if (arrayА.get(i - positionA).compareTo(arrayB.get(i - positionB)) == bigOrLess) {
                arrayC.add(arrayА.get(i - positionA));
                positionB++;
            } else {
                arrayC.add(arrayB.get(i - positionB));;
                positionA++;
            }
        }
        return arrayC;
    }

    public static Student searchByName(ArrayList<Student> s, String name) throws StudentNotFoundException {
        Student res = null;
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).getName().equals(name)) {
                res = s.get(i);
            }
        }
        
        if (res == null) {
            throw new StudentNotFoundException("Student " + name + " not found");
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();

        s.add(new Student("Vasya", 18, 5.5));
        s.add(new Student("Vova", 18, 6));
        s.add(new Student("Vitya", 18, 4.4));
        s.add(new Student("Vanya", 18, 6.3));

        try {
            System.out.println(searchByName(s, "Vasya"));
            System.out.println(searchByName(s, "Vovya"));
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}