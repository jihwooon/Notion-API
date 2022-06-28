# Notion API For 테크 스펙
작성자: 안지환  
마지막 수정일: 2022년 6월 28일  



## 요약 (Summary)
노션 API Request 시 관계형 데이터베이스에 저장합니다. 

## 배경 (Background)
Notion 이용하면서 기록 하던 내용을 내 개인 블로그에 실시간으로 연동이 되었으면 좋겠다는 아이디어가 떠올라서 진행하게 되었습니다.   
Notion 뿐만 아니라 Conference, Jira, Trello 등 비슷한 서비스도 블로그에서 실시간 연동 할 수 있게 추후에 개발 할 예정입니다.
   

## 목표 (Goals)
1. 노션 API 호출 시 JSON 형태로 원하는 API를 호출 받아야 합니다.
2. JSON 형태의 API는 데이터베이스에 호출 된 API가 저장이 되어야 합니다.
3. CI/CD 를 구성하여 빌드/테스트/배포를 자동화합니다.
4. 객체지향설계를 따르고 테스트 코드를 작성합니다.

## 목표가 아닌 것 (Non-goals)
1. 페이징, 순서 정렬 기능을 추가 하지 않습니다.
2. 로그인 기능은 추가 하지 않습니다.

## 계획 (Plan)

**기술 스텍**
* Java 11
* SpringBoot
* JPA
* MariaDB
* Docker
* React - 추후 변경 가능


## 마일스톤 (Milestones)
* 22.06.28 : notion api 계정 활성화하기 
* 22.06.29 : Spring 환경 설정 [Spring library #2](https://github.com/jihwooon/Notion-API/issues/2#issue-1287130706)
* 22.06.30 : Docker MairaDB 설정  
* 22.07.01 : Notion api 연동 작업


## Reference
* [Notion API](https://developers.notion.com/)
* [뱅크샐러드의 특별한 스펙, '테크 스펙' | 뱅크샐러드](https://blog.banksalad.com/tech/we-work-by-tech-spec/)
