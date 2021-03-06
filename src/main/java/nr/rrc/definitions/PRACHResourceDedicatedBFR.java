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


public class PRACHResourceDedicatedBFR implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	private BFRSSBResource ssb = null;
	private BFRCSIRSResource csiRS = null;
	
	public PRACHResourceDedicatedBFR() {
	}

	public PRACHResourceDedicatedBFR(byte[] code) {
		this.code = code;
	}

	public void setSsb(BFRSSBResource ssb) {
		this.ssb = ssb;
	}

	public BFRSSBResource getSsb() {
		return ssb;
	}

	public void setCsiRS(BFRCSIRSResource csiRS) {
		this.csiRS = csiRS;
	}

	public BFRCSIRSResource getCsiRS() {
		return csiRS;
	}

	public int encode(OutputStream reverseOS) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				reverseOS.write(code[i]);
			}
			return code.length;
		}

		int codeLength = 0;
		if (csiRS != null) {
			codeLength += csiRS.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
			reverseOS.write(0xA1);
			codeLength += 1;
			return codeLength;
		}
		
		if (ssb != null) {
			codeLength += ssb.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 0
			reverseOS.write(0xA0);
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

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
			ssb = new BFRSSBResource();
			codeLength += ssb.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
			csiRS = new BFRCSIRSResource();
			codeLength += csiRS.decode(is, false);
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

		if (ssb != null) {
			sb.append("ssb: ");
			ssb.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (csiRS != null) {
			sb.append("csiRS: ");
			csiRS.appendAsString(sb, indentLevel + 1);
			return;
		}

		sb.append("<none>");
	}

}

