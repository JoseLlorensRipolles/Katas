package katapotter;

/**
 * Created by josellorens on 1/07/16.
 */
public class KataPotter {

    int[] sets;
    int[] books;
    int booksToSet;

    public double calculePrice(int[] b) {
        sets = new int[5];
        books = b;
        initVars();
        while(booksToSet>0){
            sets[makeSet(books)-1]++;
        }
        optimize();
        return calculatePrice(sets);
    }

    private void optimize() {
        while(sets[4]>0 && sets [2]>0){
            sets[4]--;
            sets[2]--;
            sets[3]=sets[3] + 2;
        }
    }

    private double calculatePrice(int[] sets) {
        double price = 0.0;
        price += sets[0]*8;
        price += sets[1]*2*8*0.95;
        price += sets[2]*3*8*0.90;
        price += sets[3]*4*8*0.80;
        price += sets[4]*5*8*0.75;
        return price;
    }

    private void initVars() {
        for(int i = 0; i<sets.length;i++){
            sets[i] = 0;
        }
        booksToSet = 0;
        for(int i = 0 ; i<books.length;i++){
            booksToSet += books[i];
        }
    }

    private int makeSet(int[] books) {
        int maxSetPossible = 0;
        for (int i = 0;i<books.length;i++){
            if(books[i]!=0){
                maxSetPossible++;
                books[i]--;
                booksToSet--;
            }
        }
        return maxSetPossible;
    }
}
