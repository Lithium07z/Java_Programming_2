class Rectangle extends ShapeDraw {
	@Override  // ShapeDraw�� draw �޼ҵ带 ������ ��
	void draw(int x, char ch) {
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < x; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
