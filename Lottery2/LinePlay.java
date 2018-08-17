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
		
		int[] a1 = new int[6];
        int[] a2 = new int[49];
        for(int i = 0; i < 49; i++) {
        	a2[i] = i+1;
        }
        
        
        int counter  = 0;
        while(counter < 6){
            int index = (int)(Math.random()*49);
            if(a2[index] != 0){
                a1[counter++] = a2[index];
                a2[index] = 0;
            }
        }
        this.numbers = a1;
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