package com.app.tester;

import static com.app.utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.BlogPostDao;
import com.app.dao.BlogPostDaoImpl;
import com.app.entities.BlogPost;

public class CreateNewPost {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); 
				Scanner sc = new Scanner(System.in)) {
			// create post dao instance
			BlogPostDao dao = new BlogPostDaoImpl();
			// for testing - do not add any white space
			System.out.println("Enter post details -title , desc , contents , category id ,  author id ");
			BlogPost post = new BlogPost(sc.next(), sc.next(), sc.next());
			System.out.println(dao.createNewBlog(post, sc.nextLong(), sc.nextLong()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
