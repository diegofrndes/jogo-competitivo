package com.jogocompetitivo.domain;

public enum EloType implements Comparable<EloType>{
	FERRO(1), BRONZE(2), PRATA(3), OURO(4), PLATINA(5), DIAMANTE(6);
	
    private final int ordem;

	EloType(int ordem) {
		this.ordem = ordem;
	}

	public int getOrdem() {
		return ordem;
	}
	
	
}
