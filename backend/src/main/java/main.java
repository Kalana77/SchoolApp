import controller.StudentController;
import dto.StudentDto;

public class main {
    public static void main(String[] args) {

        StudentController studentController = new StudentController();

        StudentDto studentDto = new StudentDto();
        studentDto.setFname("kalana");
        studentDto.setLname("Maleesha");
        studentDto.setAddress("Matara");
        studentDto.setEmail("kalana@gamil.com");
        studentDto.setIndexNo("1816");
        studentDto.setMobileNum("0711111111");

        studentController.createStudent(studentDto);

    }
}
