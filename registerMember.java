import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class registerMember {

    public static boolean registerMember(adherent adherent) {
        String sql = "INSERT INTO adherent (nom, prenom, adr, num_ins) VALUES (?, ?, ?, ?)";

        try (Connection connection = DataBaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            // Set the values for each placeholder in the SQL statement
            statement.setString(1, adherent.getnom());
            statement.setString(2, adherent.getprenom());
            statement.setString(3, adherent.getadr());
            statement.setString(4, adherent.getnum_ins());

            // Execute the insert
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Member registered successfully!");
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Failed to register member.");
            e.printStackTrace();
        }
        return false;
    }

   
    
}
