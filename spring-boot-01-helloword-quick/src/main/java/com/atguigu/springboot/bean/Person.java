package com.atguigu.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 *
 * @ConfigurationProperties: 告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定
 * prefix = "person" ；配置文件中哪个下面的所有属性进行一一映射
 * <p>
 * 只有这个组件是容器中的组件，才能使用容器提供的功能；
 */
//@PropertySource(value = {"classpath:person.properties"})
@PropertySource(value={"classpath:person.properties"}) //读取指定配置文件  classpath表示类路径下，也就是resource目录下。
@Component //将Person(这个组件)加入到容器中
//@ConfigurationProperties(prefix = "person") //第一种方式
//@Validated  这个是用于校验的(注解版的校验)
public class Person {

    /**
     * <bean class="Person">
     * <prpoerties name="lastName" value="字面量/${key}从环境变量、配置文件中获取值/#{spEL}"></prpoerties>
     * </bean>
     */
    //@Value是第二种方式
    //lastName必须是邮箱格式 1
    @Email
    @Value("${person.last-name}")
    private String lastName;
    @Value("#{11*12}")
    private Integer age;
    @Value("true")
    private Boolean boss;
    private Date birth;

    //@Value("${person.map}") //这个会报错，因为@Value不支持复杂类型
    private Map<String, Object> map;
    private List<Object> lists;
    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", map=" + map +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
