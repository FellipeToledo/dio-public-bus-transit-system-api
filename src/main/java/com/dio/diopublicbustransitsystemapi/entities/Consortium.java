package com.dio.diopublicbustransitsystemapi.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Consortium {

      @Id
      @Column
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

      @Column
      private String name;

      @Column
      private String orderType;

      @Override
      public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
            Consortium that = (Consortium) o;
            return Objects.equals(id, that.id);
      }

      @Override
      public int hashCode() {
            return 0;
      }
}
