package com.it.java.ssg;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	System.out.println("== 프로그램 시작 ==");
	
	Scanner sc = new Scanner(System.in);
	int listnumber = 0;
	while(true){
		System.out.printf("명령어를 입력하세요 : ");
		String command = sc.nextLine();
		command = command.trim();
		if(command.length()==0) {
			continue;
		}
		if(command.equals("exit")) {
			break;
		}
		else if(command.equals("article write")){
			listnumber +=1;
			System.out.printf("제목 : ");
			String title = sc.nextLine();
			System.out.printf("내용 : ");
			String body = sc.nextLine();
			System.out.printf("%d 번째 글이 생성되었습니다.\n",listnumber);
			new Article(title,body,listnumber);
		}
		else if(command.equals("article list")){
			if(listnumber == 0) {
				System.out.println("게시글이 없습니다.");
			}
			else {
				for(int i = 1;i<listnumber;i++) {
					Article.list(i);
				}
			}
			
		}
		else {
			System.out.println("존재하지 않는 명령어입니다.");
		}
	}
	sc.close();
	System.out.println("== 프로그램 끝 ==");
	}
}
class Article{
	String title;
	String body;
	int number;
	Article(String title, String body, int number){
		this.title = title;
		this.body = body;
		this.number = number;
	}
	static void list(int number) {
		System.out.printf("%d 번글 \n");
	}
}
