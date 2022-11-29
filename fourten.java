// public class fourten {
//     public static void main(String args[]) {
//        try {
//           int a[] = new int[5];
//           a[5] = 30/0;
//        }
//        catch(ArithmeticException e) {
//           System.out.println("Arithmetic Exception occurs");
//        }
//        catch(ArrayIndexOutOfBoundsException e) {
//           System.out.println("ArrayIndexOutOfBounds Exception occurs");
//        }
//        catch(Exception e) {
//           System.out.println("Parent Exception occurs");
//        }
//     }
//  }

 public class fourten {
    public static void main(String[] args) {
       try {
          method1();
       } catch (Exception ex) {
          ex.printStackTrace();
       }
    }  
    static void method1() throws Exception {
       try {
          method2();
       } catch (Exception ex) {
          throw new Exception("New info added", ex);
       }
    }
    static void method2() throws Exception {
       throw new Exception("Original");
    }
 }