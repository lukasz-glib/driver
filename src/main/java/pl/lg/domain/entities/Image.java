package pl.lg.domain.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import pl.lg.domain.entities.base.BaseEntity;

import javax.persistence.*;

@Getter
@Setter
@ToString(exclude = "image")
@Inheritance(strategy = InheritanceType.JOINED)

@Entity
@Table(name="images")
public class Image extends BaseEntity {

    @Column(nullable = false)
    private String fileName;

    @Column(nullable = false)
    private String contentType;

    @Lob
    @Basic(fetch = FetchType.LAZY, optional = false)
    @Column(nullable = false, columnDefinition = "MEDIUMBLOB")
    private byte[] image;
}
