package com.pcwk.ed01;

import java.awt.event.MouseAdapter;

public class EX02_Switch01 {

	public static void main(String[] args) {
		int rank = 2;
		char medalColor = ' ';

		switch (rank) {
		case 1:
			medalColor = 'G';
			break;
		case 2:
			medalColor = 'S';
			break;
		case 3:
			medalColor = 'B';
			break;
		default:
			medalColor = ' ';
			break;

		}// --switch------------------------

		System.out.println("RanKing:" + rank);
		System.out.println("meadlColor:" + medalColor);

	}

}