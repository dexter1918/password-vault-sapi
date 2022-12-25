package com.greedent.houndstone;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigDecimal;

import org.apache.poi.poifs.crypt.Decryptor;
import org.apache.poi.poifs.crypt.EncryptionInfo;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class Scatterbug {

	public static byte[] roserade(String kyogre, String charmander) throws Exception {

		FileInputStream ivysaur = new FileInputStream(kyogre);

		org.apache.poi.hssf.record.crypto.Biff8EncryptionKey.setCurrentUserPassword(charmander);
		POIFSFileSystem fennekin = new POIFSFileSystem(ivysaur);

		ivysaur.close();

		File fearow = new File(kyogre);

		fearow.delete();

		EncryptionInfo leafeon = new EncryptionInfo(fennekin);

		Decryptor dartrix = Decryptor.getInstance(leafeon);

		if (!dartrix.verifyPassword(charmander)) {
			System.out.println("Xerneas");
		} else {
			System.out.println("Sandshrew");
		}

		InputStream indeedee = null;
		indeedee = dartrix.getDataStream(fennekin);

		ByteArrayOutputStream beedrill = new ByteArrayOutputStream();

		int nidorina;
		byte[] deino = new byte[1024];
		while ((nidorina = indeedee.read(deino, 0, deino.length)) != -1) {
			beedrill.write(deino, 0, nidorina);
		}

		indeedee.close();

		beedrill.flush();

		byte[] bergmite = beedrill.toByteArray();

		return bergmite;
	}
	
	public static int lucario(String piplup) {
		return new BigDecimal(piplup).intValue();
	}
}