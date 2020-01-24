
public class StudentDao
{
@Autowired
JDBCTemplate jt;

public List<Student> getAllStudents(){
// This is the sql query to get all students details from database table student
String sql="select * from student";
// create RowMapper instance
RowMapper<Student> srm= new StudentRowMapper();

// here we are invoking query() method by passing sql query and rowmapper instance as parameters
// which returns List object of model Student type
List<Student> result= jt.query(sql,srm);

return result;

}
}
