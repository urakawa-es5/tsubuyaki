package jp.kobe_u.cs.daikibo.tsubuyaki.repository;



import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jp.kobe_u.cs.daikibo.tsubuyaki.entity.Tsubuyaki;

@Repository

  
public interface TsubuyakiRepository extends CrudRepository<Tsubuyaki, Long>{

    //"comment"フィールドに指定した文字列を含むつぶやきを検索する
    List<Tsubuyaki> findByCommentContaining(String comment);
  
}
