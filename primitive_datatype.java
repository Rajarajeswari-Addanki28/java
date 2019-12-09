import java.io.*;
class take
{
  public static void main(String args[]) throws IOException
{
   
   OutputStream ob1=new FileOutputStream("www.txt");
  DataOutputStream ob2=new DataOutputStream(ob1);

  
  
ob2.write(65);

ob2.writeBoolean(true);
ob2.writeByte(89);
ob2.writeShort(78);
ob2.writeChar('a');
ob2.writeInt(78);
ob2.writeLong(799728033);
ob2.writeDouble(2.9765788980212);
ob2.writeBytes("rajarajeswari");
ob2.writeChars("anitha");


ob1.close();
ob2.close();
   
   InputStream ob3=new FileInputStream("www.txt");
  DataInputStream ob4=new DataInputStream(ob3);


ob4.read();

ob4.readBoolean();
ob4.readByte();
ob4.readShort();
ob4.readChar();
ob4.readInt();
ob4.readLong();
ob4.readDouble();
ob4.readByte();
ob4.readChar();


ob3.close();
ob4.close();
}
}