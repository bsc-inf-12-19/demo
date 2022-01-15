package com.example.demo.tourism;


import javax.persistence.*;

@Entity
@Table
public class Tourism
{
    @Id
    @SequenceGenerator(
            name = "tourism_sequence",
            sequenceName = "tourism_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "tourism_sequence"
    )
    private Long id;
    //these are requirement to register/ login to tourism website no password needed
    private String email;
    private String name;

    public Tourism()
    {
    }

    public Tourism(Long id,
                   String email,
                   String name)
    {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public Tourism(String email,
                   String name)
    {
        this.email = email;
        this.name = name;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return "Tourism{" +
                "id=" +id +
                ", email='" + email + '\'' +
                ",name='" + name +
                '}';

    }
}
