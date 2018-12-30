
public class Kalkulator {
	
	private String operator;
	private int nilai1;
	private int nilai2;
	
	public Kalkulator(String op, int n1, int n2)
	{
		operator = op;
		nilai1 = n1;
		nilai2 = n2;
	}

	public int tambah()
    { return nilai1 + nilai2; }

    public int kali()
    { return nilai1 * nilai2; }

    public int kurang()
    { return nilai1 - nilai2; }
    
    public int bagi()
    { return nilai1 / nilai2; }

    public static void main(String[] args){
    	String op = args[0];
		int n1 = Integer.parseInt(args[1]);
		int n2 = Integer.parseInt(args[2]);

		Kalkulator hitung = new Kalkulator(op, n1, n2);

		switch(op)
        {
            case "tambah":
                System.out.println(n1 +" + "+ n2 +" = "+ hitung.tambah());
                break;

            case "kurang":
                System.out.println(n1 +" - "+ n2 +" = "+ hitung.kurang());
                break;

            case "kali":
                System.out.println(n1 +" X "+ n2 +" = "+ hitung.kali());
                break;

            case "bagi":
                System.out.println(n1 +" : "+ n2 +" = "+ hitung.bagi());
                break;

            default:
                System.out.println("Error! operator "+ op +" tidak ada");
                return;
        }
	}
}