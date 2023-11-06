import java.util.Scanner;

public class Test {


    public static void main(String[] args)

    {

        String str, Newstring=" ";

        System.out.print("Enter your password: ");

        try {

            Scanner in=new Scanner(System.in);

            str=in.nextLine();

            char [] strArr = str.trim().toCharArray();

            for (int i = 0; i < strArr.length; i++){

                if(strArr[i] >= 'a' && strArr[i] <= 'z'){

                    if(strArr[i] <= 'm'){

                        strArr[i] += 13;

                    }else if(strArr[i] <= 'z'){

                        strArr[i] -= 13;

                    }

                }else if(strArr[i] >= 'A' && strArr[i] <= 'Z'){

                    if(strArr[i] <= 'M'){

                        strArr[i] += 13;

                    }else{

                        strArr[i] -= 13;

                    }

                }

            }

            str = new String(strArr);

            for (int i=0;i
            {

                char ch=Character.toLowerCase(str.charAt(i));

                switch (ch)

                {

                    case 'a':

                        Newstring=Newstring+"}";

                        break;

                    case 'b':

                        Newstring=Newstring+"{";

                        break;

                    case 'c':

                        Newstring=Newstring+"#";

                        break;

                    case 'd':

                        Newstring=Newstring+"~";

                        break;

                    case 'e':

                        Newstring=Newstring+"+";

                        break;

                    case 'f':

                        Newstring=Newstring+"-";

                        break;

                    case 'g':

                        Newstring=Newstring+"*";

                        break;

                    case 'h':

                        Newstring=Newstring+"@";

                        break;

                    case 'i':

                        Newstring=Newstring+"/";

                        break;

                    case 'j':

                        Newstring=Newstring+"%";

                        break;

                    case 'k':

                        Newstring=Newstring+"?";

                        break;

                    case 'l':

                        Newstring=Newstring+"$";

                        break;

                    case 'm':

                        Newstring=Newstring+"!";

                        break;

                    case 'n':

                        Newstring=Newstring+"^";

                        break;

                    case 'o':

                        Newstring=Newstring+"(";

                        break;

                    case 'p':

                        Newstring=Newstring+")";

                        break;

                    case 'q':

                        Newstring=Newstring+"<";

                        break;

                    case 'r':

                        Newstring=Newstring+">";

                        break;

                    case 's' :

                        Newstring=Newstring+"=";

                        break;

                    case 't':

                        Newstring=Newstring+";";

                        break;

                    case 'u':

                        Newstring=Newstring+",";

                        break;

                    case 'v' :

                        Newstring=Newstring+"_";

                        break;

                    case 'w':

                        Newstring=Newstring+"[";

                        break;

                    case 'x' :

                        Newstring=Newstring+"]";

                        break;

                    case 'y':

                        Newstring=Newstring+":";

                        break;

                    case 'z' :

                        Newstring=Newstring+""";

                        break;

                    case '{':

                        Newstring=Newstring+"A";

                        break;

                    case '}':

                        Newstring=Newstring+"B";

                        break;

                    case ''':

                        Newstring=Newstring+"C";

                        break;

                    case '_':

                        Newstring=Newstring+"D";

                        break;

                    case '@':

                        Newstring=Newstring+"E";

                        break;

                    case '-':

                        Newstring=Newstring+"F";

                        break;

                    case '1':

                        Newstring=Newstring+"H";

                        break;

                    case '2':

                        Newstring=Newstring+"I";

                        break;

                    case '3':

                        Newstring=Newstring+"J";

                        break;

                    case '4':

                        Newstring = Newstring+"K";

                        break;

                    case '5':

                        Newstring = Newstring+"L";

                        break;

                    case '6':

                        Newstring = Newstring+"M";

                        break;

                    case '7':

                        Newstring = Newstring+"N";

                        break;

                    case '8' :

                        Newstring= Newstring+"O";

                        break;

                    case '9':

                        Newstring = Newstring+"P";

                        break;

                    case '0':

                        Newstring = Newstring+"Q";

                        break;

                    default:

                        Newstring=Newstring+"0";

                        break;

                }

            }

        }

        catch(Exception ioe)

        {

            ioe.printStackTrace();

        }

        System.out.println("Your encrypted password is: " +Newstring);

    }

}
    

