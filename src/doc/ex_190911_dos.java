package doc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

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

	private static void move(String[] args) {
		if (args.length != 4) {
			System.out.println("명령어 형식이 맞지 않습니다.");
			System.out.println("사용법 : [java파일명] [디렉토리경로] move [파일명] [옮길 경로]");
			System.exit(0);
		}

		String root = args[0];
		String newRoot = args[3];
		String oldFile = root + File.separator + args[2];
		String newFile = newRoot + File.separator + args[2];
		File file = new File(oldFile);
		if (file.exists()) {
			try {

				// 파일을 읽어서
				FileInputStream fi = new FileInputStream(oldFile);
				// 파일로 복사합니다.
				FileOutputStream fo = new FileOutputStream(newFile);

				int data = 0;
				while ((data = fi.read()) != -1) {
					fo.write(data);
				}
				fi.close();
				fo.close();

				// 복사가 완료되면 원본파일 old_name 을 삭제합니다.
				File del = new File(oldFile);
				del.delete();

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("존재하지않는 파일입니다.");
		}

//			Path file = Paths.get("C:\\IOTemp\\data\\result.txt");
//
//			Path movePath = Paths.get("C:\\IOTemp");
//
//			 
//			try {
//				Files.move(file , movePath .resolve(file .getFileName()));
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
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

	public static void delete(String[] args) {

		String path = "C:\\IOTemp"; // 만들 폴더 경로
		File deletefile = new File(path);

		if (deletefile.exists()) {
			try {
				deletefile.delete(); // 파일삭제
				System.out.println("파일이 삭제되었습니다.");
			} catch (Exception e) {
				e.getStackTrace(); // 예외의 내용을 String으로 리턴받음
			}
		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}
	
	public static void fileList(String[] args) {
		
	    if(args.length != 3 && args.length != 4) {
            System.out.println("사용법 : [java파일명] [디렉토리경로] DIR");
            System.exit(0);
        }
	    
	    if(args[2].equals("DIR")) {
	    	File f = new File(args[1]); 
			if(!f.exists() || !f.isDirectory()) {
				System.out.println("유효하지 않은 디렉토리 입니다.");
				System.exit(0); 
			}
		    
			//위 if 문을 다 통과하면 정상적인 IOTemp 폴더임
			//정상적인 경로...
			printFileList(f);
			System.out.println("누적 총 파일수 : "  + totalfiles);
			System.out.println("누적 총 폴더 수 : " + totaldirs);
	    	
	    }
	      
	}
	
	static int totalfiles=0;
	static int totaldirs=0;
	
	static void printFileList(File dir) {
		
		
		System.out.println("[Full path :"  + dir.getAbsolutePath()+ "]");
		ArrayList<Integer> subdir = new ArrayList<Integer>();
		File[] files = dir.listFiles();
		
		for(int i = 0 ; i < files.length; i++) {
			String filename = files[i].getName();  //파일명 또는 폴더명
			if(files[i].isDirectory()) {
				filename = "<DIR> [" + filename + "]"; 
				subdir.add(i); // ? 
			}else {
				filename = filename + "/" + files[i].length() + "Byte"; 	
			}
			System.out.println("   " + filename);		
		}
		int dirnum = subdir.size();   //폴더개수 
		int filenum = files.length - dirnum; // 파일개수    전체개수에서 - 폴더개수를 빼면 남은게 파일개수가된다. 
		
		//누적값: 
		totaldirs += dirnum;  //총누적폴더갯수
		totalfiles +=filenum; //파일누적개수
		
		System.out.println("[Current dirNum] : " + dirnum);
		System.out.println("[Current fileNum] : " + filenum);
		System.out.println("*******************************");
		
		//POINT
		
		for(int j=0 ;  j < subdir.size(); j++) {
			int index = subdir.get(j);
			printFileList(files[index]);
			
		}
			
	}

}
