package site.metacoding.seongyung.domain.user;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EntityListeners(AuditingEntityListener.class)
@Entity
public class User {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK 생성을 DB에 위임하는 전략 
    private Integer id;

    @Column(length = 20, nullable = false, unique = true)
    private String username;

    // 1234 -> SHA256(해시 알고리즘) 사용해서 암호화 -> AB4524GDUF3AE -> 이렇게 안 하면 시큐리티가 거부
    @Column(length = 20, nullable = false)
    private String password;

    private String address;

    @CreatedDate
    private LocalDateTime createDate;
    @LastModifiedDate
    private LocalDateTime updateDate;
}
