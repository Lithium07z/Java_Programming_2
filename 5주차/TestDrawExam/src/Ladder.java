class Ladder extends ShapeDraw {
	@Override // ShapeDraw�� draw �޼ҵ带 ������ ��
	void draw(int x, char ch) {
		for(int i = 0; i < x; i++) {
			for (int j = 0; j < x - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + x; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
