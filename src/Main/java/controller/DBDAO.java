package controller;

import model.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DBDAO {

    public int insert(Person person) {
        String sql = "INSERT INTO persons (cpf, name, email, cel) VALUES (?, ?, ?, ?)";

        try (Connection conn = DBManager.getConnection();
             PreparedStatement pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            pstm.setString(1, person.getCpf());
            pstm.setString(2, person.getName());
            pstm.setString(3, person.getEmail());
            pstm.setInt(4, person.getCel());

            pstm.executeUpdate();

            // Obtém o ID gerado pelo banco de dados
            try (ResultSet generatedKeys = pstm.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1);
                } else {
                    throw new SQLException("Falha ao obter o ID gerado pelo banco de dados.");
                }
            }

        } catch (SQLException e) {
            System.out.println("Erro ao executar insert: " + e.getMessage());
            return -1; // Retorna -1 para indicar falha na operação
        }
    }

    public Person selectLastPerson() {
        // Obtém o id do último registro inserido usando o método insert
        int lastInsertedId = insert(new Person());

        // Consulta o último registro inserido
        if (lastInsertedId != -1) {
            String sql = "SELECT * FROM persons WHERE id = ?";
            Person person = new Person();

            try (Connection conn = DBManager.getConnection();
                 PreparedStatement pstm = conn.prepareStatement(sql)) {

                pstm.setInt(1, lastInsertedId);

                ResultSet resultSet = pstm.executeQuery();
                while (resultSet.next()) {
                    person.setId(resultSet.getInt("id"));
                    person.setCpf(resultSet.getString("cpf"));
                    person.setName(resultSet.getString("name"));
                    person.setCel(resultSet.getInt("cel"));
                    person.setEmail(resultSet.getString("email"));
                }
            } catch (SQLException e) {
                System.out.println("Erro ao executar SELECT: " + e.getMessage());
            }
            return person;
        } else {
            return null; // Retorna null se houver falha ao obter o id do último registro inserido
        }
    }



    /*public void insert(Person person) {
        String sql = "INSERT INTO persons (cpf, name, email, cel) VALUES (?, ?, ?, ?)";


        try (Connection conn = DBManager.getConnection()) {
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {

                pstm.setString(1, person.getCpf());
                pstm.setString(2, person.getName());
                pstm.setString(3, person.getEmail());
                pstm.setInt(4, person.getCel());

                pstm.execute();


            } catch (SQLException e) {
                System.out.println("Erro ao executar insert: " + e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco" + e.getMessage());

        }

    }

    public Person selectLastPerson() {
        var sql = "select * from persons where id = currval('id_seq')";

        var person = new Person();
        try (Connection conn = DBManager.getConnection()) {
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                ResultSet resultSet = pstm.executeQuery();
                while (resultSet.next()) {
                    person.setId(resultSet.getInt("id"));
                    person.setCpf(resultSet.getString("cpf"));
                    person.setName(resultSet.getString("name"));
                    person.setCel(resultSet.getInt("cel"));
                    person.setEmail(resultSet.getString("email"));
                }
            } catch (SQLException e) {
                System.out.println("Erro ao executar SELECT");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco");
        }
        return person;
    }*/

    public static List<Person> select(){
        List<Person> persons = new ArrayList<>();
        String sql = "SELECT * FROM persons";

        try (Connection conn = DBManager.getConnection()){
             try(PreparedStatement pstm = conn.prepareStatement(sql)) {

            ResultSet resultSet = pstm.executeQuery();
            while (resultSet.next()) {
                Person person = new Person();
                person.setId(resultSet.getInt("id"));
                person.setCpf(resultSet.getString("cpf"));
                person.setName(resultSet.getString("name"));
                person.setCel(resultSet.getInt("cel"));
                person.setEmail(resultSet.getString("email"));
                persons.add(person);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao executar SELECT");
        }
    } catch (SQLException e){
            System.out.println("Erro ao conectar ao banco");
        }
        return persons;
    }
}














