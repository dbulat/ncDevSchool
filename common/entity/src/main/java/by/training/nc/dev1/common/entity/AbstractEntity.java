package by.training.nc.dev1.common.entity;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dmbu0616 on 4/3/2017.
 */
abstract public class AbstractEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
