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


public class MeasTriggerQuantity implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	private RSRPRange rsrp = null;
	private RSRQRange rsrq = null;
	private SINRRange sinr = null;
	
	public MeasTriggerQuantity() {
	}

	public MeasTriggerQuantity(byte[] code) {
		this.code = code;
	}

	public void setRsrp(RSRPRange rsrp) {
		this.rsrp = rsrp;
	}

	public RSRPRange getRsrp() {
		return rsrp;
	}

	public void setRsrq(RSRQRange rsrq) {
		this.rsrq = rsrq;
	}

	public RSRQRange getRsrq() {
		return rsrq;
	}

	public void setSinr(SINRRange sinr) {
		this.sinr = sinr;
	}

	public SINRRange getSinr() {
		return sinr;
	}

	public int encode(OutputStream reverseOS) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				reverseOS.write(code[i]);
			}
			return code.length;
		}

		int codeLength = 0;
		if (sinr != null) {
			codeLength += sinr.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
			return codeLength;
		}
		
		if (rsrq != null) {
			codeLength += rsrq.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
			return codeLength;
		}
		
		if (rsrp != null) {
			codeLength += rsrp.encode(reverseOS, false);
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
			rsrp = new RSRPRange();
			codeLength += rsrp.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			rsrq = new RSRQRange();
			codeLength += rsrq.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			sinr = new SINRRange();
			codeLength += sinr.decode(is, false);
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

		if (rsrp != null) {
			sb.append("rsrp: ").append(rsrp);
			return;
		}

		if (rsrq != null) {
			sb.append("rsrq: ").append(rsrq);
			return;
		}

		if (sinr != null) {
			sb.append("sinr: ").append(sinr);
			return;
		}

		sb.append("<none>");
	}

}

