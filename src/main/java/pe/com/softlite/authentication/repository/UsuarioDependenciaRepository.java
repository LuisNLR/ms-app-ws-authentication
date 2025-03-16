package pe.com.softlite.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.com.softlite.authentication.model.UsuarioDependencia;

@Repository
public interface UsuarioDependenciaRepository extends JpaRepository<UsuarioDependencia, Long> {

	@Query(value = " SELECT ud FROM UsuarioDependencia ud  " 
	             + "  WHERE ud.usuario.userUsuario=:userUsuario "
			     //+ "    AND ud.usuario.passwordUsuario=:passUsuario "
	             )
	UsuarioDependencia findByUsuario(@Param("userUsuario") String user
									//,@Param("passUsuario") String password
									);
	
}
