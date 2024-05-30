package com.blogs.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tags")
public class Tag extends BaseEntity {
	@Column(length = 20, unique = true)
	private String name;

	public Tag() {
		// TODO Auto-generated constructor stub
	}

	public Tag(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tag [name=" + name + "]";
	}

	// contract for overriding equals n hashcode
	@Override
	public boolean equals(Object o) {
		System.out.println("in tag's equals");
		if (o instanceof Tag) {
			Tag tag = (Tag) o;
			return this.name.equals(tag.name);
		}
		return false;
	}
	@Override
	public int hashCode()
	{
		System.out.println("in tag's hashCode");
		return name.hashCode();
	}

}
