public class calculate {
    public static void main(String[] arg)
    {
        System.out.println("Calculate...");
        String str="";
        String[] parts=new String[2];
        double result;
        for(int i=0; i<arg.length; i++)
        {str=str+arg[i];}
        if (str.indexOf("+")>=0)
        {
        	System.out.print(str);
            parts = str.split("\\+");
            result = Double.valueOf(parts[0])+Double.valueOf(parts[1]);
            System.out.print(" = "+result);
        }
        if (str.indexOf("-")>=0)
        {
        	System.out.print(str);
            parts = str.split("-");
            result = Double.valueOf(parts[0])-Double.valueOf(parts[1]);
            System.out.print(" = "+result);
        }
        if (str.indexOf("*")>=0)
        {   
        	System.out.print(str);
            parts = str.split("\\*");
            result = Double.valueOf(parts[0])*Double.valueOf(parts[1]);
            System.out.print(" = "+result);
        }
        if (str.indexOf("/")>=0)
        {
        	System.out.print(str);
            parts = str.split("/");
            result = Double.valueOf(parts[0])/Double.valueOf(parts[1]);
            System.out.print(" = "+result);
        }
        if (str.indexOf(":")>=0)
        {
        	System.out.print(str);
            parts = str.split(":");
            result = Double.valueOf(parts[0])/Double.valueOf(parts[1]);
            System.out.print(" = "+result);
        }
        if (str.indexOf("^")>=0)
        {
        	System.out.print(str);
            parts = str.split("\\^");
            result = Math.pow(Double.valueOf(parts[0]),Double.valueOf(parts[1]));
            System.out.print(" = "+result);
        }
    }
}