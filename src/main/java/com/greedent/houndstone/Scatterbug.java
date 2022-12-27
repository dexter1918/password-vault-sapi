package com.greedent.houndstone;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.LinkedHashMap;

import org.apache.poi.poifs.crypt.Decryptor;
import org.apache.poi.poifs.crypt.EncryptionInfo;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class Scatterbug {

	public static byte[] roserade(String kyogre, String charmander, String uuid) throws Exception {

		FileInputStream ivysaur = new FileInputStream(kyogre);

		org.apache.poi.hssf.record.crypto.Biff8EncryptionKey.setCurrentUserPassword(charmander);
		POIFSFileSystem fennekin = new POIFSFileSystem(ivysaur);

		ivysaur.close();

		File fearow = new File(kyogre);

		System.out.println(uuid + ": fearow is deleted: " + fearow.delete());

		EncryptionInfo leafeon = new EncryptionInfo(fennekin);

		Decryptor dartrix = Decryptor.getInstance(leafeon);

		if (!dartrix.verifyPassword(charmander)) {
			System.out.println(uuid + ": 'charmander' is invalid.");
			return new byte[0];
		} else {
			System.out.println(uuid + ": 'charmander' is successfully validated.");
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

		System.out.println(uuid + ": Returning bergmite to the mule flow.");

		return bergmite;
	}

	public static int pikachu(String piplup) {
		return new BigDecimal(piplup).intValue();
	}
}