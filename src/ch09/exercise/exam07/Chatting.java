package ch09.exercise.exam07;

public class Chatting {
	class Chat {
		void start() {
		};

		void sendMessage(String message) {
		};
	}

	void startChat(String ChatId) {
		// 사실상 final 이 아니게 됨.
		// 한번 사용한 변수를 다시 바꿈
		String nickName = null;
		nickName = ChatId;

		Chat chat = new Chat() {
			void start() {
				while (true) {
					String inputData = ":안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
}
