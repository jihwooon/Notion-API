# Notion API For 테크 스펙
작성자: 안지환
마지막 수정일: 2022년 6월 28일


## 요약 (Summary)
노션 API Request 시 관계형 데이터베이스에 저장합니다. 

## 배경 (Background)
노션 서비스를 이용하면서 기록 하던 내용을 다른 플랫폼에 실시간으로 연동이 되었으면 좋겠다는 아이디어가 떠올라서 진행하게 되었습니다. 
노션의 기록 하던 내용을 데이터베이스에 저장을 해서 추후에 다른 서비스에 사용 할 때 이용하고 싶어서 RDMS(관계형 데이터베이스)에 따로 저장 할 수 있게 저장소도 만들고 싶었습니다. 
추후 기획자와 개발자 간의 API 만들 때 노션 플랫폼으로만으로도 API 만들 수 있게 개발 할 예정 입니다.

## 목표 (Goals)
1. 노션 API 호출 시 JSON 형태로 원하는 API를 호출 받아야 합니다.
2. JSON 형태의 API는 데이터베이스에 호출 된 API가 저장이 되어야 합니다.

## 목표가 아닌 것 (Non-goals)
1. 동영상이나 사진 같은 파일 저장 기능에 추가 하지 않습니다.
2. 페이징, 순서 정렬 같은 Sort 기능은 추가 하지 않습니다.

## 계획 (Plan)
테크 문서에서 가장 긴 파트입니다. 당신이 준비한 모든 리서치, 준비 내용들을 씁니다. 여기에 **어떻게 기술적, 엔지니어링적으로 접근할지 상세히 묘사**하세요. 만약 어떤 부분을 **어떻게 할지 확실히 결정하지 못한 상태라면, 어떤 것들을 고려하고 있는지 다 목록화해서 적으세요**. 그러면 이 문서 **리뷰어들이 당신의 올바른 결정에 도움**을 주게 됩니다. 얼마나 기술적으로 깊게 써야 하는지는 이 테크 스펙의 목적과 독자들에 따라 정합니다. 생산적인 제안을 받을 수 있도록 충분히 상세하게 적으세요.
여기는 어떻게 프로젝트가 다른 시스템들과 상호작용하는지 그림이나 다이어그램을 포함하기 좋은 지점입니다. 사용자와 시스템 간의 시퀀스 다이어그램, 서비스와 API 간의 데이터 흐름 다이어그램, 데이터베이스 ERD 등 다 좋습니다.
이 테크 스펙이 로우 레벨까지 다뤄야 한다면 HTTP 응답 코드, JSON 요청 / 응답 포맷, 에러 명세 등까지 모두 다뤄져야 합니다.

간략하게 계획 정리

Notion api 호출 시 -> Spring -> MariaDB


## 마일스톤 (Milestones)
* 22.06.28 : notion api 계정하기 - 완료 
* 22.06.29 : Spring 환경 셋팅, MairaDB 셋팅
* 22.06.30 : Notion api


## Reference
* [Notion API](https://developers.notion.com/)
* [YouTube](https://www.youtube.com/watch?v=4yHYrQ7_gKM&t=1662s)
* [notion-talks/TalkController.java at master · danvega/notion-talks · GitHub](https://github.com/danvega/notion-talks/blob/master/src/main/java/dev/danvega/talks/controller/TalkController.java)
* [뱅크샐러드의 특별한 스펙, '테크 스펙' | 뱅크샐러드](https://blog.banksalad.com/tech/we-work-by-tech-spec/)
