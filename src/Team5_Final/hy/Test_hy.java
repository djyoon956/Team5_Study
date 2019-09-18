package Team5_Final.hy;

	import java.awt.List;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.ArrayList;

	public class Test_hy {
		public static void main(String[] args) {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			ArrayList<Member> list = new ArrayList<Member>();

			Member member = new Member();
			System.out.println("<<회원가입 양식>>");
			System.out.println("차례대로 모두 입력해주세요.");
			System.out.println("이름 입력 : ");
			System.out.println("아이디 입력 : ");
			System.out.println("비밀번호 입력 : ");
			System.out.println("핸드폰 입력 : ");
			System.out.println("주민번호 입력 : ");

			try {
				member.setName(br.readLine());
				member.setId(br.readLine());
				member.setPassword(br.readLine());
				member.setPhoneNumber(br.readLine());
				member.setSecuritNumber(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println("회원가입이 완료되었습니다.");
			}
		}

