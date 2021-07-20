package LILAC.LILACspring.domain;

public class Member {
    
    // 식별자
    private Long id;
    // 이름
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
