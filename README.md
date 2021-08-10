# FastCampus_Android_Kotlin
FastCampus Kotlin 강의 수강

## Part2 Chapter01 BMI 계산기
###
1. Layout 그리는 법 (LinearLayout, EditText, TextView, Button)

### Kotlin 문법
1. When 분기문
2. 람다함수

### 기능
1. 공식 = 몸무게(kg) / {키(m) * 키(m)}
2. 18.5 이하면 저체중, 18.5 ~ 23은 정상체중, 23 ~ 25는 과체중, 25 ~ 30은 경도 비만, 30 ~ 35는 중정도비만, 35 이상은 고도 비만

## Screenshot
<p align="center">
<img src="https://user-images.githubusercontent.com/60072190/128840556-282c89f0-95c4-4163-97ce-746947c817e5.jpg"  width="300" height="600">
<img src="https://user-images.githubusercontent.com/60072190/128840656-1e9adb77-fef3-4f13-a03c-5796d673f10a.jpg"  width="300" height="600">
</p>

## Part2 Chapter02 로또 번호 추첨기
###
1. Layout 그리는 법 (constraintLayout, NumberPicker, TextView, Button)
2. Shape Drawble 사용하기

### Kotlin 문법
1. apply
2. When
3. Random
4. Collection - Set,List
5. 람다함수

### 기능
1. 0~5개까지 수동 선택 가능하도록 구현하기
2. 수동선택한 번호를 제외한 나머지 번호는 랜덤으로 표시하기

## Part2 Chapter03 비밀 다이어리
###
1. Layout 그리는 법 (constraintLayout, Custom Font)
2. Handler 사용하기
3. SharedPreference의 속성들과 사용하는 법
4. Theme 사용하기
5. AlertDialog 사용하기

### Kotlin 문법
1. android-ktx 로 SharedPreference의 사용하기(Kotlin Android Extension)

### 기능
1. 다이어리 처럼 UI 꾸며보기
2. 비밀번호를 저장하는 기능, 변경하는 기능
3. 다이어리 내용을 앱이 종료되더라도 기기에 저장하는 기능


## Part2 Chapter04 계산기
###
1. Layout 그리는 법 (TableLayout, ConstraintLayout, LayoutInflator)
2. Thread 사용하기 (타 스레드, runOnUiThread)
3. Room 사용하기

### Kotlin 문법
1. 확장 함수 사용하기
2. data class 사용하기

### 기능
1. 계산기 기능 수행
2. 계산 기록 저장하기
3. 계산 기록 삭제하기
4. 단 시간관계 상 정수형으로 한정하고, 몇가지 기능을 배제하고, 연산자는 1회만 사용할 수 있음

## Part2 Chapter05 전자액자
###
1. Layout 그리는 법 (가로 화면으로 그리기)
2. Android Permission 사용하기
3. View Animation 사용하기
4. Activity Lifecycle 알아보기
5. Content Provider (SAF : Storage Access Framework)

### 기능
1. 저장소 접근 권한을 이용하여 로컬 사진을 로드 할 수 있음
2. 추가한 사진들을 일정한 간격으로 전환하여 보여줄 수 있음

## Part2 Chapter06 뽀모도로 타이머
###
1. ConstraintLayout
2. CountDownTimer
3. SoundPool

### 기능
1. 1 ~ 60분까지 타이머를 설정할 수 있음
2. 1초마다 화면을 갱신함
3. 타이머 효과음을 들을 수 있음
