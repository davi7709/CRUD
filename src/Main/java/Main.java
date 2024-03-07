import controller.DBDAO;
import model.Person;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Testando o método insert
        Insert();

        // Testando o método selectLastPerson
        SelectLastPerson();

        // Testando o método select
        Select();
    }

        private static void Insert() {
            DBDAO dbdao = new DBDAO();
            Person person = new Person("123456789", "John Doe", 987654321, "john@example.com");

            int insertedId = dbdao.insert(person);

            if (insertedId != -1) {
                System.out.println("Inserção bem-sucedida. ID gerado: " + insertedId);
            } else {
                System.out.println("Falha na inserção.");
            }
        }

        private static void SelectLastPerson() {
            DBDAO dbdao = new DBDAO();
            Person lastPerson = dbdao.selectLastPerson();

            if (null != lastPerson) {
                System.out.println("Última pessoa inserida: " + lastPerson);
            } else {
                System.out.println("Não foi possível obter a última pessoa.");
            }
        }

        private static void Select() {
            DBDAO dbdao = new DBDAO();
            List<Person> persons = dbdao.select();

            if (!persons.isEmpty()) {
                System.out.println("Pessoas no banco de dados:");
                for (Person person : persons) {
                    System.out.println(person);
                }
            } else {
                System.out.println("Nenhuma pessoa encontrada no banco de dados.");
            }
        }

          /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonView().setVisible(true);
            }
        });
       var dbdao = new DBDAO();
       var persontoInsert = new Person("687954566", "joao Alves", 12658567, "joao@gmail.com");

        dbdao.insert(persontoInsert);



        List<Person> persons = dbdao.select();

        for (Person person : persons) {
            System.out.println("" + person);
        }*/


    }





