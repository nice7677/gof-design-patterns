package kr.springboot.gofdesignpatterns._01_singleton.ex6;

/**
 * 권장 방법임.
 * 기존의 예제들은 리플렉션, 직렬, 역직렬화에서 뚫릴수있음.
 * enum 클래스는 Enum 클래스를 상속받고 Serializable를 구현하고잇다.
 * 직렬, 역직렬화는 막을수있지만 리플렉션은 뚫림 하지만 이건 뚫을수없음.
 * 이 방법은 뚫리지않고 안전하면서 쉬움.
 * 단점, 미리만드는것, 상속을 할수없음.
 */
public enum SpringbootKR {

    INSTANCE;

}
