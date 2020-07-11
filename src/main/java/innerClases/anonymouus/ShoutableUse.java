package innerClases.anonymouus;

public class ShoutableUse {

    void shoutOnSomebody(){

        //klasa anonimowa, nie można się odwoływać do jej metody
        Shoutable shoutable = new Shoutable() {
            @Override
            public String shout() {
                return "Yelling at somebody!!";
            }
        };
    }
}
