import java.io.File;
class nerw
  {
   public static void main(String args[])
{
  File ob = new File("hello.txt");
 System.out.println("getName::"+ ob.getName());
 System.out.println("getDirectory::"+ob.isDirectory());
   System.out.println("getAbsolutePath"+ob.getAbsolutePath());
   System.out.println("exists::"+ob.exists());
      System.out.println("isFile::"+ob.isFile());
     System.out.println("LastModified::"+ob.lastModified());
     System.out.println("canread::"+ob.canRead());
 System.out.println("canwrite::"+ob.canWrite());
 System.out.println("length::"+ob.length());
 System.out.println(ob.renameTo(hai));
 System.out.println(ob.getParent());
 System.out.println(ob.compareTo());
}
}
