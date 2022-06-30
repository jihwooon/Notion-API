# Notion API For 테크 스펙
작성자: 안지환  
마지막 수정일: 2022년 6월 28일  

## 요약 (Summary)
Notion에 작업한 내용을 개인 블로그에서도 실시간으로 연동 할 수 있는 개인 블로그 서비스를 제공합니다.  
Notion에서 제공하는 API을 호출 받아서 SpringBoot 통해서 개인 블로그 페이지에 전달 됩니다.

## 배경 (Background)
Notion 이용하면서 기록 하던 내용을 내 개인 블로그에 실시간으로 연동이 되었으면 좋겠다는 아이디어가 떠올라서 진행하게 되었습니다.  
Notion 뿐만 아니라 Conference, Jira, Trello 등 비슷한 서비스도 블로그에서 실시간 연동 할 수 있게 추후에 개발 할 예정입니다.

## 목표 (Goals)
1. Notion 외부 API 이용해 실시간으로 가져와야 합니다.
2. 객체지향설계를 따르고 테스트 코드를 작성합니다.
3. 외부 API 처리, 에러핸들링등 스프링으로 구현합니다.
4. 화면 구성은 React, Vue.js 중 사용해서 구현합니다.
5. Docker 을 통해 CI/CD 를 구성하여 빌드/테스트/배포를 자동화합니다.

## 목표가 아닌 것 (Non-goals)
1. 페이징, 순서 정렬 기능을 추가 하지 않습니다.
2. 로그인 기능은 추가 하지 않습니다.
3. RDBMS 와 같은 데이터 테이블은 저장하지 않습니다.

## 계획 (Plan)



## 마일스톤 (Milestones)
* 22.06.28 : [Notion api integration](https://developers.notion.com/)
* 22.06.29 : [#2 Spring 환경 설정](https://github.com/jihwooon/Notion-API/issues/2#issue-1287130706)
* 22.06.30 : [#7 ConfigurationProperties](https://github.com/jihwooon/Notion-API/issues/7)

## Reference
* [Notion API](https://developers.notion.com/)
* [뱅크샐러드의 특별한 스펙, '테크 스펙' | 뱅크샐러드](https://blog.banksalad.com/tech/we-work-by-tech-spec/)
