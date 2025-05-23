package justin.java17.exercises.CH07.Exercise1.src.cc.openhome;

public interface CashCardDAO {
    void save(CashCard cashCard);
    CashCard load(String number);
}
