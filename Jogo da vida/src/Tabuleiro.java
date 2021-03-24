
public class Tabuleiro {

	public int[][]  tabuleiro = new int[10][10];
	public String posiçõesParaCélulasNascerem = "";
	public String posiçõesParaCélulasMorrerem = "";

	
	public void incluiCélula(int i, int j) {
		tabuleiro[i][j] = (tabuleiro[i][j] == 0)? 1: 0;
	}

	public int quantidadeDeVizinhos(int i, int j) {
		int quantidadeDeVizinhos = 0;
		for(int x = -1; x<=1; x++) {
			for (int y= -1; y<=1; y++) {
				if(x==0 && y==0)
					continue;
				try {
					quantidadeDeVizinhos += tabuleiro[i+x][j+y];
				}catch(ArrayIndexOutOfBoundsException e) {
					
				}
			}
		}
		return quantidadeDeVizinhos;
	}

	public void nascerCélulas(int i, int j) {
		if(quantidadeDeVizinhos(i,j) > 2) posiçõesParaCélulasNascerem += i+" "+j+" ";
	}
	public void matarCélulas(int i, int j) {
		if(quantidadeDeVizinhos(i,j) < 2 || quantidadeDeVizinhos(i,j) > 3) posiçõesParaCélulasMorrerem += i+" "+j+" ";
	}

	public void converterCélulasVivas() {
		String[] stringArray = posiçõesParaCélulasNascerem.split(" ");
		
		for(int x=0; x<stringArray.length; x+=2) {
			int i = Integer.parseInt(stringArray[x]);
			int j = Integer.parseInt(stringArray[x+1]);
			tabuleiro[i][j] = 1;
		}
		
	}

	public void converterCélulasMortas() {
		String[] stringArray = posiçõesParaCélulasMorrerem.split(" ");
		
		for(int x=0; x<stringArray.length; x+=2) {
			int i = Integer.parseInt(stringArray[x]);
			int j = Integer.parseInt(stringArray[x+1]);
			tabuleiro[i][j] = 0;
		}
		
	}
}
