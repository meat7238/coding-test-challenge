package kakao;

/**
 * @author meat
 *	표 편집 프로그램 작성
 *	표의 크기는 50*50으로 고정되어있고 초기에 모든 셀은 비어 있습니다.
 * 각 셀은 문자열 값을 가질 수 있고, 다른셀과 병합될 수 있음.
 * 위에서 r번째,왼쪽에서 c번째 위치를 r,c라고 할때 당신은 다음 명령어에 대한 기능을 구현하고자 한다.
 * "UPDATE r c value : 
 * 		r,c 위치의 셀을 선택한다.
 * 		선택한 셀의 값을 value로 바꾼다.
 * "UPDATE value1 value2 :
 * 		value1을 값으로 가지고 있는 모든 셀을 선택한다
 * 		선택한 셀의 값을 value2로 바꾼다.
 * "MERGE r1 c1 r2 c2 :
 * 		r1,c1위치의 셀과 r2,c2위치의 셀을 선택하여 병합한다.
 * 		선택한 두 셀은 서로 인접하지 않을수도 있다.
 * 		두 셀 중 한 셀이 값을 가지고 있을 경우 병합된 셀은 그 값을 가지게 된다.
 * 		두 셀 모두 값을 가지고 있을 경우 병합된 셀은 r1,c1위치의 셀 값을 가지게 된다.
 *		이후 r1,c1와 r2,c2중 어느 위치를 선택하여도 병합된 셀로 접근합니다.
 *	"UMMERGE r c"
 *		r c 위치의 셀을 선택하여 해당 셀의 모든 병합을 해제합니다.
 * 		선택한 셀이 포함하고 있던 모든 셀은 프로그램 실행 초기의 상태로 돌아갑니다.
 * 		병합을 해제하기 전 셀이 값을 가지고 있었을경우 r,c위치의 셀이 그 값을 가지게 됩니다.
 * 	"PRINT r c"
 * 		r , c 위치의 셀을 선택하여 셀의 값을 출력합니다.
 * 		선택한 셀이 비어있을경우 EMPTY 를 출력합니다. 
 * 입력예시 : ["UPDATE 1 1 menu", "UPDATE 1 2 category", "UPDATE 2 1 bibimbap", "UPDATE 2 2 korean", "UPDATE 2 3 rice", "UPDATE 3 1 ramyeon", "UPDATE 3 2 korean", "UPDATE 3 3 noodle", "UPDATE 3 4 instant", "UPDATE 4 1 pasta", "UPDATE 4 2 italian", "UPDATE 4 3 noodle", "MERGE 1 2 1 3", "MERGE 1 3 1 4", "UPDATE korean hansik", "UPDATE 1 3 group", "UNMERGE 1 4", "PRINT 1 3", "PRINT 1 4"]
 * 출력 : ["EMPTY", "group"]
 */
public class x0924_카카오코테_test5 {

}
class Solution5 {
    public String[] solution(String[] commands) {
        String[] answer = {};
        return answer;
    }
}