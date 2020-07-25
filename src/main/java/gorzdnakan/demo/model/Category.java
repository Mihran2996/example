package gorzdnakan.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "category")
public class Category implements Comparable<Category> {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int count;


    @Override
    public int compareTo(Category o) {
        return this.count - o.count;
    }
}
