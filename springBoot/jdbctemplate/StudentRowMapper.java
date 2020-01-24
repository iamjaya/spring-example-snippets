public class StudentRowMapper implements RowMapper<Student>
{
@Override

public Student mapRow(ResultSet rs, int rowNum) throws SQLException{

Student s= new Student();
s.setStudentId(rs.getInt("studentId"));
s.setStudnetName(rs.getString("studentName"));
s.setBranch(rs.getString("branch"));
s.setPincode(rs.getInt("pincode"));
return s;

}

}
