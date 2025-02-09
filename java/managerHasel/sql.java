/** aSzymon - gtihub */

package managerHasel;

public class sql {

   String[] zapytaniaSQL = {
           "INSERT INTO dane(login,password) VALUES(?,?)",
           "DELETE FROM dane WHERE login = ?",
           "DELETE FROM dane WHERE password = ?",
           "SELECT id,login,password,linkURL FROM dane WHERE login like ?",
           "SELECT id,login,password,linkURL FROM dane WHERE linkURL like ?"
   };

}

