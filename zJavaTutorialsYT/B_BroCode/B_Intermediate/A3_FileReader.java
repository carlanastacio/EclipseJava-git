package B_Intermediate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A3_FileReader {

	// FileReader = read the contents of a file as a stream of characters.
	// 			    read() returns an int value which contains the byte value
	//				when read() returns -1, there is no more data to be read

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("ASCII Art.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(""
				+ "       :                              :      ED.                              \n"
				+ "      t#,                      .,    t#,     E#Wi                 ,;         .\n"
				+ "     ;##W.           .Gt      ,Wt   ;##W.    E###G.             f#i         ;W\n"
				+ "    :#L:WE          j#W:     i#D.  :#L:WE    E#fD#W;          .E#t         f#E\n"
				+ "   .KG  ,#D       ;K#f      f#f   .KG  ,#D   E#t t##L        i#W,        .E#f \n"
				+ "   EE    ;#f    .G#D.     .D#i    EE    ;#f  E#t  .E#K,     L#D.        iWW;  \n"
				+ "  f#.     t#i  j#K;      :KW,    f#.     t#i E#t    j##f  :K#Wfff;     L##Lffi\n"
				+ "  :#G     GK ,K#f   ,GD; t#f     :#G     GK  E#t    :E#K: i##WLLLLt   tLLG##L \n"
				+ "   ;#L   LW.  j#Wi   E#t  ;#G     ;#L   LW.  E#t   t##L    .E#L         ,W#i  \n"
				+ "    t#f f#:    .G#D: E#t   :KE.    t#f f#:   E#t .D#W;       f#E:      j#E.   \n"
				+ "     f#D#;       ,K#fK#t    .DW:    f#D#;    E#tiW#G.         ,WW;   .D#j     \n"
				+ "      G#t          j###t      L#,    G#t     E#K##i            .D#; ,WK,      \n"
				+ "       t            .G#t       jt     t      E##D.               tt EG.       \n"
				+ "                      ;;                     E#t                    ,         \n"
				+ "                                             L:                               \n");
	}
}
