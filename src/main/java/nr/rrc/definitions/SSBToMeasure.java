/**
 * This class file was automatically generated by jASN1 v1.10.0 (http://www.openmuc.org)
 */

package nr.rrc.definitions;

import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.io.Serializable;
import org.openmuc.jasn1.ber.*;
import org.openmuc.jasn1.ber.types.*;
import org.openmuc.jasn1.ber.types.string.*;


public class SSBToMeasure implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	private BerBitString shortBitmap = null;
	private BerBitString mediumBitmap = null;
	private BerBitString longBitmap = null;
	
	public SSBToMeasure() {
	}

	public SSBToMeasure(byte[] code) {
		this.code = code;
	}

	public void setShortBitmap(BerBitString shortBitmap) {
		this.shortBitmap = shortBitmap;
	}

	public BerBitString getShortBitmap() {
		return shortBitmap;
	}

	public void setMediumBitmap(BerBitString mediumBitmap) {
		this.mediumBitmap = mediumBitmap;
	}

	public BerBitString getMediumBitmap() {
		return mediumBitmap;
	}

	public void setLongBitmap(BerBitString longBitmap) {
		this.longBitmap = longBitmap;
	}

	public BerBitString getLongBitmap() {
		return longBitmap;
	}

	public int encode(OutputStream reverseOS) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				reverseOS.write(code[i]);
			}
			return code.length;
		}

		int codeLength = 0;
		if (longBitmap != null) {
			codeLength += longBitmap.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
			return codeLength;
		}
		
		if (mediumBitmap != null) {
			codeLength += mediumBitmap.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
			return codeLength;
		}
		
		if (shortBitmap != null) {
			codeLength += shortBitmap.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 0
			reverseOS.write(0x80);
			codeLength += 1;
			return codeLength;
		}
		
		throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
	}

	public int decode(InputStream is) throws IOException {
		return decode(is, null);
	}

	public int decode(InputStream is, BerTag berTag) throws IOException {

		int codeLength = 0;
		BerTag passedTag = berTag;

		if (berTag == null) {
			berTag = new BerTag();
			codeLength += berTag.decode(is);
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
			shortBitmap = new BerBitString();
			codeLength += shortBitmap.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			mediumBitmap = new BerBitString();
			codeLength += mediumBitmap.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			longBitmap = new BerBitString();
			codeLength += longBitmap.decode(is, false);
			return codeLength;
		}

		if (passedTag != null) {
			return 0;
		}

		throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
		encode(reverseOS);
		code = reverseOS.getArray();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		if (shortBitmap != null) {
			sb.append("shortBitmap: ").append(shortBitmap);
			return;
		}

		if (mediumBitmap != null) {
			sb.append("mediumBitmap: ").append(mediumBitmap);
			return;
		}

		if (longBitmap != null) {
			sb.append("longBitmap: ").append(longBitmap);
			return;
		}

		sb.append("<none>");
	}

}

