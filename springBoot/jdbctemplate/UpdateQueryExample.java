public int addStudent(Student s){
String add_student_sql="insert into student(studentid,studentname,branch,pincode) values(?,?,?,?)";

int count=jdbcTemplate_object.update(add_student_sql, new Object[]{s.studentId, s.srudentName, s.branch, s.pincode});
return count;
}
