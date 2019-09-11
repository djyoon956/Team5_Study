package doc;

import java.io.File;

public class ex_190911_dos {
	public static void main(String[] args) {
		// args = new String[] { "C:\\SmartWeb\\IOTemp1", "mkdir", "data4" }; // 테스트용
		if (args.length != 3 && args.length != 4) {
			System.out.println("사용법 : [java파일명] [디렉토리경로] rename [파일명] [새로운 파일명]");
			System.out.println("사용법 : [java파일명] [디렉토리경로] mkdir [생성디렉토리명]");
			System.exit(0);
		}

		String cmd = args[1];
		switch (cmd) {
		case "rename":
			rename(args);
			break;
		case "mkdir":
			mkdir(args);
			break;
		default:
			break;
		}
	}

	private static void rename(String[] args) {
		if (args.length != 4) {
			System.out.println("명령어 형식이 맞지 않습니다.");
			System.out.println("사용법 : [java파일명] [디렉토리경로] rename [파일명] [새로운 파일명]");
			System.exit(0);
		}

		String root = args[0];
		String path = root + File.separator + args[2];
		String target = root + File.separator + args[3];
		File file = new File(path);
		if (file.exists()) {
			File targetPath = new File(target);
			file.renameTo(targetPath);
		} else {
			System.out.println("입력 경로가 존재하지 않습니다.");
			System.exit(0);
		}
	}

	private static void mkdir(String[] args) {
		if (args.length != 3) {
			System.out.println("명령어 형식이 맞지 않습니다.");
			System.out.println("사용법 : [java파일명] [디렉토리경로] mkdir [생성디렉토리명]");
			System.exit(0);
		}

		String path = args[0] + File.separator + args[2];
		File newfile = new File(path);
		if (newfile.exists()) {
			System.out.println("이미 존재하는 디렉토리입니다");
		} else {
			newfile.mkdir();
		}
	}
}
