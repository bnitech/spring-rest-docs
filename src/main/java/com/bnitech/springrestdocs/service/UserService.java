package com.bnitech.springrestdocs.service;

import com.bnitech.springrestdocs.dto.UserInfo;
import java.util.List;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@Service
public class UserService {

  public List<UserInfo> getUserInfoList() {
    return userList;
  }

  /**
   * 임시 데이터
   */
  static final List<UserInfo> userList = List.of(
      UserInfo.builder().id(1L).name("AAA").country("qqq").age(11).build(),
      UserInfo.builder().id(2L).name("BBB").country("www").age(22).build(),
      UserInfo.builder().id(3L).name("CCC").country("eee").age(33).build(),
      UserInfo.builder().id(4L).name("DDD").country("rrr").age(44).build(),
      UserInfo.builder().id(5L).name("EEE").country("ttt").age(55).build()
  );
}
