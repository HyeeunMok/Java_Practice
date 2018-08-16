package exercise07;

public class LinePlay {
	private int[] numbers;
	
	public LinePlay() {
		setNumbers();
	}
	
	public LinePlay(int[] numbers) {
		this.numbers = numbers;
	}
	
	public void setNumbers(){
		
		int[] array = new int[6];
		for (int i = 0; i < array.length; i++) {
			boolean flag = true;
			int temp = 0;
			
			while (flag) {
				temp = (int)(Math.random() * 49 + 1);
				for(int y = 0; y <= i; y++) {
					if(array[y] == temp) {
						flag = true;
						break;
					}else {
						flag = false;
					}
				}
			}
			array[i] = temp;
		}
		this.numbers = array;
	}
	
	public int[] getNumbers() {
        return numbers;
    }
	
	
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
           if (i > 0) {
              sb.append(", ");
           }
           sb.append(numbers[i]);
        }
        return sb.toString();
    }
}