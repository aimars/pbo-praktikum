package minggu6;
import java.util.*;

public class AggregationMain {
	public static void main(String[] args) {
		MataPelajaran mapel1 = new MataPelajaran("Bahasa Sunda", "ML001BS");
		
		List<MataPelajaran> mapelPakJajang = new ArrayList<MataPelajaran>();
		mapelPakJajang.add(mapel1);
		
		Guru jajang = new Guru("Jajang", "1098990765123", "Jamika", mapelPakJajang);
		
		jajang.printGuru(mapel1);
		
	}
}