package ch10.hyungnam;

class TestMain{
	public static void main(String[] args) {
		Test55 test55 =new Test55("�귣��", "����", 10000);
		Test55 test6 =new Test55("�귣��", "����", 10000);
		Test55 test7 =new Test55("�귣��", "����", 10000);
		Test55 test8 =new Test55("�귣��", "����", 10000);
		Test55 test9 =new Test55("�귣��", "����", 10000);
		
		test55.showAsset();
		test55.showSales();
		test55.showSalesnumber();
		test55.showStack();
		
	}
}
class Test55 {

	    private static int asset = 1000000;// �ʱ��ڻ� 100����
	    private String mk;// �귣��
	    private String type;// ����
	    private int sprice;// �Ǹűݾ�
	    private static int sales;// �Ѹ���
	    private static int stack;// ���
	    private static int salesnumber;// �Ǹŷ�
	    private boolean already;// �Ǹſ��� ���Ǹ�:true �Ǹ�: false
	 
	    public Test55(String mk, String type, int sprice) {
	        // ���� ���۰� ���ÿ� �귣��� ������ �Ǹűݾ��� ������ �˴ϴ�.
	        ++stack;// �������
	        already = true;// �Ǹſ��� ���Ǹ�
	        this.sprice = sprice;
	        this.mk = mk;
	        this.type = type;
	        asset -= 10000;// ������ �ڻ� ����
	    }
	 
	    public void setSprice(int sprice) {
	        // Ư�� �޼ҵ带 ���� ���������� �����մϴ�
	        this.sprice = sprice;
	    }
	 
	    public void selling() {// �Ǹ� �Լ�
	        if (already == true) {// �Ǹſ��� Ȯ��
	            already = false;// �Ǹſ��� ����
	            stack--;// �� ��� 1����
	 
	            asset += sprice;// �ڻ��� �Ǹ� �ݾ׸�ŭ ��������
	            sales += sprice;// ������� �Ǹ� �ݾ׸�ŭ ��������
	 
	            salesnumber++;// �Ǹŷ� 1 ����
	        } else {// ���ǸŻ�ǰ�ΰ��
	            System.out.println("�̹� �Ǹŵ� ��ǰ�Դϴ�");
	        }
	    }
	 
	    public void showAsset() {// ȸ��� ��������� �ڻ��� Ȯ���� �� �ֽ��ϴ�.
	        System.out.println("���� �� �ڻ� : " + asset);
	    }
	 
	    public void showSales() {// ȸ��� ��������� �� ������� �� �� �ֽ��ϴ�.
	        System.out.println("���� �� ���� :" + sales);
	    }
	 
	    public void showStack() {// ȸ��� �������� �� ������ Ȯ �� �� �ֽ��ϴ�.
	        System.out.println("���� ��� : " + stack);
	    }
	 
	    public void showSalesnumber() {// ȸ��� ��������� ���� �Ǹŷ��� �� �� �ֽ��ϴ�.
	        System.out.println("���� �Ǹŷ� : " + salesnumber);
	    }
	 
	}
