package entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Position", catalog = "TestingSystem")
public class Position implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name = "PositionID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short positionID;
	@Column(name = "PositionName", nullable = false, unique = true)
	@Enumerated(EnumType.STRING)
	private PositionName positionName;
//	@OneToMany(mappedBy = "position")
	@OneToMany(mappedBy = "position", fetch = FetchType.EAGER)
	@Cascade(value = { CascadeType.REMOVE, CascadeType.SAVE_UPDATE })
	private List<Account> accounts;

	@Override
	public String toString() {
		return "Position [positionID=" + positionID + ", positionName=" + positionName + "]";
	}

}
