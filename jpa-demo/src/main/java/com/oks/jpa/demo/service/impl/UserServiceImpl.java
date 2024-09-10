package com.oks.jpa.demo.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oks.jpa.demo.dao.PostDao;
import com.oks.jpa.demo.dao.UserDao;
import com.oks.jpa.demo.dao.mapper.PostMapper;
import com.oks.jpa.demo.dao.mapper.UserMapper;
import com.oks.jpa.demo.entity.Post;
import com.oks.jpa.demo.entity.User;
import com.oks.jpa.demo.service.UserService;
import com.oks.jpa.demo.vo.PostVo;
import com.oks.jpa.demo.vo.UserVo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	PostDao postDao;
	


	@Override
	public UserVo saveUser(UserVo userVo) {
		User user=UserMapper.INSTANCE.convertVOtoDOForUser(userVo);
		User userSaved=userDao.saveUser(user);				
		UserVo userVoSaved=UserMapper.INSTANCE.convertDOtoVOForUser(userSaved);		
		return userVoSaved;
	}
	
	//@Override
	public UserVo saveUserTemp(UserVo userVo) {
	/*	
		User u=new User();
		//u.setId(null);
		u.setName("Omkar");
		u.setMailId("a@bcom");
		u.setPassword("1233");
		*/
	/*	
		Post p1=new Post();
		p1.setTitle("java");
		p1.setContents("Java Language");
		Post p2=new Post();
		p2.setTitle("Spring");
		p2.setContents("Framework");
		
		Set<Post> posts=new HashSet<>();
		posts.add(p1);
		posts.add(p2);
		
		u.setPosts(posts);
	*/	
		    Set<Post> s1=new HashSet<Post>();
	        s1.add(new Post("First Post","It is Dummy Post"));
	        s1.add(new Post("Second Post","It is Another Dummy Post"));
	        
	        Set<Post> s2=new HashSet<Post>();
	        s2.add(new Post("P1","It is an imp post"));
	        s2.add(new Post("p2","It is temp Post"));
	        s2.add(new Post("p3","It is Third post"));
	        
	      //User u1=new User("Omkar","oks@.gmail.com","123", s1);
	      //User u2=new User("Ramu","ramu@gmail.com","ramu", s2);
	        User u1=userDao.findUserById(6l).get();
	       u1.setPosts(s2);
	        
		
		User userSaved=userDao.saveUser(u1);
		//userSaved=userDao.saveUser(u2);
		
				
		UserVo userVoSaved=UserMapper.INSTANCE.convertDOtoVOForUser(userSaved);
		//Set<PostVo> postVoSet=PostMapper.INSTANCE.convertDOtoVOForAllPost(userSaved.getPosts());
		//userVoSaved.setPostVo(postVoSet);
		
		return userVoSaved;
	}

	

	
	
	@Override
	public Optional<UserVo> findUserById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<UserVo> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVo updateUser(UserVo e) {
		// TODO Auto-generated method stub
		return null;
	}
}
