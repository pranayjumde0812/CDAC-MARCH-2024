package com.app.dao;

import com.app.entities.BlogPost;
import com.app.entities.Comment;
import com.app.entities.User;

import static com.app.utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CommentDaoImpl implements CommentDao {

	@Override
	public String postNewComment(Comment newComment, Long commenterId, Long postId) {
		String mesg="adding comment failed ....";
		// 1. get session from SF (getCurrentSession)
				Session session=getFactory().getCurrentSession();
				//2. Begin a Tx
				Transaction tx=session.beginTransaction();
				try {
					//3 get user from id
					User user=session.get(User.class, commenterId);
					//4. get post from the id
					BlogPost post=session.get(BlogPost.class, postId);
					if(user != null && post != null)
					{
						//user n post - persistent
						//establish uni dir asso comment--> user 
						newComment.setCommenter(user);
						//comment --> post
						newComment.setPost(post);
						//save the comment
						session.persist(newComment);
						mesg="commented on the post ";
					}
					tx.commit();
				} catch (RuntimeException e) {
					if(tx != null)
						tx.rollback();
					//re throw the exc to the caller
					throw e;
				}
		return mesg;
	}

}
