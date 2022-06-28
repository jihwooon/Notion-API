# Notion API For 테크 스펙
작성자: 안지환  
마지막 수정일: 2022년 6월 28일


## 요약 (Summary)
노션 API Request 시 관계형 데이터베이스에 저장합니다. 

## 배경 (Background)
노션 서비스를 이용하면서 기록 하던 내용을 내 개인 블로그에 실시간으로 연동이 되었으면 좋겠다는 아이디어가 떠올라서 진행하게 되었습니다.   

노션의 기록 하던 내용을 데이터베이스에 저장을 해서 추후에 다른 서비스에 사용 할 때 이용하고 싶어서 RDMS(관계형 데이터베이스)에 따로 저장 할 수 있게 저장소도 만들고 싶었습니다.   

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
* 22.06.28 : notion api 계정하기 - 완료 
* 22.06.29 : Spring 환경 셋팅, MairaDB 셋팅
* 22.06.30 : Notion api


## Reference
* [Notion API](https://developers.notion.com/)
* [YouTube](https://www.youtube.com/watch?v=4yHYrQ7_gKM&t=1662s)
* [notion-talks/TalkController.java at master · danvega/notion-talks · GitHub](https://github.com/danvega/notion-talks/blob/master/src/main/java/dev/danvega/talks/controller/TalkController.java)
* [뱅크샐러드의 특별한 스펙, '테크 스펙' | 뱅크샐러드](https://blog.banksalad.com/tech/we-work-by-tech-spec/)
