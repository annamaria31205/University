public class ExceptionUtil {
    public static boolean checkAge(int age){

            try {
                if (age < 18 || age > 58) {
                    throw new AgeException("Teacher is retired, check this age");
                }
                System.out.println("Work age");
            }   catch (AgeException e) {
                e.printStackTrace();
            }
        return false;
    }
    }

