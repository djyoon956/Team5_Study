package weight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Weight_Manager_hy {
	public Scanner keyboard = new Scanner(System.in);// keyboard 입력값 받기
	public String str_name = "기본값"; // str_name 변수를 초기화
	public String str_weight = "기본값"; // str_weight 변수를 초기화
	public String str_password = "기본값"; // str_password 변수를 초기화
	String[] txt_data = null; // String타입의 배열 txt_data를 null로 초기화
	File f; // 파일 타입의 변수f 선언
	File fd = new File("C://WeightMgData/"); // 파일이 생성될곳

	public static void main(String[] args) {
		Weight_Manager_hy wm = new Weight_Manager_hy(); // Weight_Manager객체 생성
		int choiceInt; // keyboard 입력값 담을 choiceInt 변수 생성

		while (true) { // 무한반복해주는 while문

			try {
				wm.showMenu(); // Weight_Manager객체의 wm의 showMenu()메소드 실행
				choiceInt = wm.keyboard.nextInt(); // 입력받은 정수를 choiceInt에 담음
				wm.keyboard.nextLine(); // ?다음 입력을 위해 날림
				System.out.println(); // 출력

				if (choiceInt < 1 || choiceInt > 5) // 주어진 메뉴의 범위를 벗어나면
					throw new MenuChoiceException(choiceInt); // 정의해놓은 Exception발생

				switch (choiceInt) { // 1~5까지 입력한 정수에 따라 알맞은 메소드를 실행
				case 1:
					wm.inputWeight();
					break;
				case 2:
					wm.searchWeight();
					break;
				case 3:
					wm.changeWeight();
					break;
				case 4:
					wm.changePassword();
					break;
				case 5:
					System.out.println("프로그램을 종료합니다.");
					return; // 종료
				// System.exit(0);
				}// switch문 닫기
			} catch (MenuChoiceException e) { // 정의해놓은 Exception발생시에
				e.showWrongChoice(); // showWrongChoice()메소드 실행
				System.out.println("메뉴 선택을 처음부터 다시 진행합니다.");
				System.out.println();

			} catch (IOException e) {
				System.out.println(e + "오류발생");

			} catch (Exception e) {
				String temp = wm.keyboard.nextLine(); // 재입력을 위해 키보드로 입력받은 값을 문자로 다시 받음
				System.out.println("입력하신 " + temp + "는 숫자가 아닙니다.");
				System.out.println("메뉴 선택을 처음부터 다시 진행합니다.");
				System.out.println();
			} // catch문닫기

		} // while문 닫기
	}

	// ===========================================메뉴를 보여주는 메서드
	public void showMenu() {

		str_name = "기본값";
		str_weight = "기본값";
		str_password = "기본값";

		System.out.println("\n다음 사항에 맞게 입력하여 주십시요");
		System.out.println("======> 몸무게 입력은  1번");
		System.out.println("======> 몸무게 검색은  2번");
		System.out.println("======> 몸무게 변경은  3번");
		System.out.println("======> 비밀번호변경은 4번");
		System.out.println("======> 프로그램종료는 5번");
		System.out.println("을 입력한후 Enter을 눌러주십시요");
		System.out.print("메뉴 선택 : ");
	}
	// ==============================================================

	// ===============================================//몸무게 입력하기
	public void inputWeight() throws IOException { // 예외처리
		boolean fileExist; // 파일이 존재하는지의 여부 확인

		System.out.println("이름을 입력하여 주십시요.");
		System.out.print("이름 : ");
		this.str_name = keyboard.nextLine(); // 입력받은 문자열(이름)을 인스턴스변수 str_name에 넣음
		System.out.println();

		File f = new File("C://WeightMgData/" + this.str_name + ".txt"); // 기록할 파일객체 생성. 파일명은 입력받은 이름으로 한다.
		if (!f.exists()) { // 만약 파일이 존재하지 않는다면

			System.out.println("몸무게를 입력하여 주십시요.");
			System.out.print("몸무게 : ");
			this.str_weight = keyboard.nextLine(); // 입력받은 문자열(몸무게)을 인스턴스변수 str_weight에 넣음
			System.out.println();
			System.out.println("비밀번호를 입력하여 주십시요.");
			System.out.print("비밀번호 : ");
			this.str_password = keyboard.nextLine(); // 입력받은 문자열(비밀번호)을 인스턴스변수str_password에 넣음
			System.out.println();

			showResult(); // 입력한 값을 보여주는 showResult()메소드 실행

			// File fd= new File("C://WeightMgData/");
			// File f= new File("C://WeightMgData/"+this.str_name+".txt"); //파일생성
			if (!fd.exists())
				fd.mkdir(); // 만약 fd가 존재하지 않는다면 fd디렉토리 생성
			FileWriter fw = new FileWriter(f); // 텍스트 데이터를 파일에 저장하기 위해 FileWriter 객체 fw생성
			BufferedWriter bw = new BufferedWriter(fw); // 문자 출력 스트림에 연결되어 버퍼를 제공해주기 위해 BufferedWriter 객체 bw생성
			bw.write(this.str_weight + ":"); // 생성한 파일에 쓰기
			bw.write(this.str_password);

			bw.close(); // 객체 bw를 더이상 사용하지 않으므로 close()메소드를 호출
			System.out.println("___입력이 완료되어_..[ C://WeightMgData/" + this.str_name + ".txt ]._가(이) 생성되었습니다.");
		} else {
			System.out.println("현재 [" + this.str_name + "] 사용자가 존재합니다.");
			System.out.println("메뉴 선택을 처음부터 다시 진행합니다.");
			System.out.println();
		}

	}// inputWeight닫기

	// ===============================================//몸무게 검색하기
	public void searchWeight() throws IOException {

		boolean passcheck = fileCheck(); // 파일 존재 여부를 확인해주는 fileCheck()메소드 실행

		if (passcheck) { // fileCheck가 true(파일이 존재)이면
			System.out.println("*****************************************************************");
			System.out.println("\t\t" + this.str_name + "님의 몸무게는 " + txt_data[0] + " kg 입니다.");
			System.out.println("*****************************************************************");
			System.out.println();

		} else { // fileCheck가 false(파일이 존재하지 않음)이면 종료
			return;
		}
		System.out.println();
	}// searchWeight() 닫기

	// ===============================================//몸무게 변경하기
	public void changeWeight() throws IOException { // 예외처리

		boolean passcheck = fileCheck(); // 파일 존재 여부를 확인해주는 fileCheck()메소드 실행

		if (passcheck) { // fileCheck가 true(파일이 존재)이면
			System.out.println("*****************************************************************");
			System.out.println("\t\t" + this.str_name + "님의 몸무게는 " + this.txt_data[0] + " kg 입니다.");
			System.out.println("*****************************************************************");
			System.out.println("\t\t변경할 몸무게를 입력하여 주십시요.");
			System.out.print("\t\t변경할 몸무게 : ");
			this.str_weight = keyboard.nextLine(); // 입력받은 문자열(몸무게)을 str_weight에 넣음

			FileWriter fw = new FileWriter(f); // 텍스트 데이터를 파일에 저장하기 위해 FileWriter 객체 fw생성
			BufferedWriter bw = new BufferedWriter(fw); // 문자 출력 스트림에 연결되어 버퍼를 제공해주기 위해(성능을 좋게 해줌) BufferedWriter 객체
														// bw생성
			// int str_num = txt_data[1].length();
			// System.out.println(str_num);
			bw.write(this.str_weight + ":"); // 생성한 파일에 쓰기
			// bw.write(this.str_weight, 1, str_num-1);
			bw.write(this.str_password);

			bw.close(); // 객체 bw를 더이상 사용하지 않으므로 close()메소드를 호출
		} else { // fileCheck가 false(파일이 존재하지 않음)이면 종료
			return;
		}

		showResult(); // showResult()메소드 호출

	}// changeWeight() 닫기

	// ===============================================//패스워드 변경하기
	public void changePassword() throws IOException { // 예외처리

		boolean passcheck = fileCheck(); // fileCheck()메소드로 파일 존재 여부 확인

		if (passcheck) { // true이면(파일이 존재하면)
			System.out.println("*****************************************************************");
			System.out.println("\t\t" + this.str_name + "님의 비밀번호는는 " + this.str_password + " 입니다.");
			System.out.println("*****************************************************************");
			System.out.println("\t\t변경할 패스워드를 입력하여 주십시요.");
			System.out.print("\t\t변경할 패스워드 : ");
			this.str_password = keyboard.nextLine();

			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(this.str_weight + ":");
			bw.write(this.str_password);
			bw.close();

		} else { // False이면(파일이 존재하지 않으면)
			return;
		}

		showResult();

	}// changePassword()닫기

	public boolean fileCheck() throws IOException { // 예외 처리
		// 검색, 몸무게 변경, 패스워드 변경시 입력받은 이름에 대한 파일존재여부체크 ,입력받은 패스워드에 대한 체크
		FileReader fr = null; // FileReader타입의 변수 fr을 null값으로 초기화
		BufferedReader br = null; // BufferedReader타입의 변수 br을 null값으로 초기화
		String cmp_data; // txt파일에서 한줄 읽어오기
		boolean boo = false; // 상태 체크

		System.out.println("검색할 이름을 입력하여 주십시요.");
		System.out.print("이름 : ");
		this.str_name = keyboard.nextLine();
		System.out.println();

		f = new File(fd.getAbsolutePath() + "/" + this.str_name + ".txt"); // 입력받은이름으로 파일경로 생성

		if (f.exists()) { // 파일이 존재하면
			fr = new FileReader(f); // 파일 읽을 준비
			br = new BufferedReader(fr);
			cmp_data = br.readLine(); // 읽어온 파일에서 한줄을 cmp_data에 저장한다.
			txt_data = cmp_data.split(":"); // ':' 로 쪼개 txt_data배열에 저장
			// System.out.println(txt_data.length); //txt_data배열 크기 보기
			br.close(); // 닫기

			// int cnt = 2; //비밀번호 체크를 3회만 한다.
			// while(cnt>0){
			for (int cnt = 3; cnt > 0; cnt--) { // 비밀번호 체크를 3회 할 수 있다.

				System.out.println("비밀번호를 입력하여 주십시요.");
				System.out.print("비밀번호 : ");
				this.str_password = keyboard.nextLine();
				System.out.println();

				if (txt_data[1].equals(this.str_password)) { // txt_data[1]의 문자열과 입력받은 str_password가 같으면
					this.str_weight = txt_data[0]; // 파일에 있는 값을 그대로 입력해준다. //모르겠음ㅠ
					boo = true; // 모르겠음ㅠ boo가 뭐야?
					break; // if문 종료
				} else { // txt_data[1]의 문자열과 입력받은 str_password가 같지 않으면

					if (cnt > 1) { // 비밀번호 입력 가능한 횟수가 3or2회 남아 있으면
						System.out.println("입력하신 비밀번호가 일치하지 않습니다.");
						System.out.print((cnt - 1) + "번의 기회가 남았습니다. 올바른 ");
					} else { // 비밀번호 입력 가능한 횟수가 1회였던 경우

						System.out.println("입력하신 비밀번호가 일치하지 않습니다.");
						System.out.println("메뉴 선택을 처음부터 다시 진행합니다.");
						System.out.println("======================================");
						System.out.println();

					}

					/*
					 * System.out.print("비밀번호 : "); this.str_password = keyboard.nextLine(); --cnt;
					 */
				}
			}
		} else {// f.getName()
			System.out.println(str_name + "님 이(가) 존재하지 않습니다.");
			boo = false;
		}
		return boo;
	}

	public void showResult() { // 입력받은 값을 보여주기
		System.out.println();
		System.out.println("*****************************************************************");
		System.out.println(
				"\t이름 : " + this.str_name + ", \t몸무게 : " + this.str_weight + ",\t 비밀번호 : " + this.str_password);
		System.out.println("*****************************************************************");
		System.out.println();
	}

}// WeightManagExam000 class닫기

class MenuChoiceException extends Exception { // 잘못된 선택을 하게되면 생성될 Exception
	int wrongChoice; // 잘못된 입력값저장하기 위한 변수

	public MenuChoiceException(int choice) // 입력값을 받는 생성자
	{
		super("잘못된 선택이 이뤄졌습니다.");
		// Exception(String message)
		wrongChoice = choice; // 전달 받은 인자값을 전역변수 wrongChoice에 저장
	}

	public void showWrongChoice() {
		System.out.println(wrongChoice + "에 해당하는 선택은 존재하지 않습니다.");
	}

}// class MenuChoiceException 닫기
