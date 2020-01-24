public class StudentDAO implements StudentDAO_I
{
@Autowired
JDBCTempalte jt;

public int addStudent(Student s){

String query="insert into student(studentid,studentname,branch,pincode) values (?,?,?,?)";
int count = jt.update(query,new Object[]{s.studentId, s.studentName, s.branch, s.pincode});
return count;
}


}
