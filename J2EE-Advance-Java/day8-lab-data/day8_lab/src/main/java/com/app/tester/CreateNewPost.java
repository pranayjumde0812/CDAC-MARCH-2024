package com.app.tester;

import static com.app.utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.BlogPostDao;
import com.app.dao.BlogPostDaoImpl;
import com.app.dao.CategoryDao;
import com.app.dao.CategoryDaoImpl;
import com.app.entities.BlogPost;
import com.app.entities.Category;

public class CreateNewPost {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create post dao instance
			BlogPostDao dao = new BlogPostDaoImpl();
			System.out.println("Enter post details -title ");
			String title = sc.nextLine();
			System.out.println("Enter desc");
			String desc = sc.nextLine();
			System.out.println("Enter content");
			String content = sc.nextLine();
			System.out.println("Enter category id n author id");
			BlogPost post = new BlogPost(title, desc, content);
			System.out.println(dao.createNewBlog(post, sc.nextLong(), sc.nextLong()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
