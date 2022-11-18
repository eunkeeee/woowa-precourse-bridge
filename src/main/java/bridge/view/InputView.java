package bridge.view;

import static bridge.util.Util.convertStringToInt;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    // InputView의 메서드의 시그니처(인자, 이름)와 반환 타입은 변경할 수 있다.
    // 사용자 값 입력을 위해 필요한 메서드를 추가할 수 있다.

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        String input = Console.readLine();
        return convertStringToInt(input);
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        String input = Console.readLine();
        // validation
        return input;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }
}
