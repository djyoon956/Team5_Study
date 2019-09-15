package CallBook;

public class CallBook_hy {

	public static void main(String[] args) {

		Person_hy person = new Person_hy(null, 0, 0, 0, null);
		person.addPerson("이하연", 01011112222, 021232343, 26, "나");
		person.addPerson("윤다정", 01022226454, 031053434, 25, "동생");
		person.addPerson("박성호", 01016654, 0311434, 31, "가족");
		person.addPerson("오형남", 01023426454, 020223434, 24, "직장");
		person.addPerson("권태일", 01011226454, 020534434, 25, "직장");

		person.remove(0); // 사람을 고유번호를 통해 삭제할 수 있음

		for (Person_hy callbook : person.getPerson1()) {
			Object transaction = null;
			System.out.println(transaction.toString());

		}

	}

}
