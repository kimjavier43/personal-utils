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


public class CSIResourcePeriodicityAndOffset implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	private BerInteger slots4 = null;
	private BerInteger slots5 = null;
	private BerInteger slots8 = null;
	private BerInteger slots10 = null;
	private BerInteger slots16 = null;
	private BerInteger slots20 = null;
	private BerInteger slots32 = null;
	private BerInteger slots40 = null;
	private BerInteger slots64 = null;
	private BerInteger slots80 = null;
	private BerInteger slots160 = null;
	private BerInteger slots320 = null;
	private BerInteger slots640 = null;
	
	public CSIResourcePeriodicityAndOffset() {
	}

	public CSIResourcePeriodicityAndOffset(byte[] code) {
		this.code = code;
	}

	public void setSlots4(BerInteger slots4) {
		this.slots4 = slots4;
	}

	public BerInteger getSlots4() {
		return slots4;
	}

	public void setSlots5(BerInteger slots5) {
		this.slots5 = slots5;
	}

	public BerInteger getSlots5() {
		return slots5;
	}

	public void setSlots8(BerInteger slots8) {
		this.slots8 = slots8;
	}

	public BerInteger getSlots8() {
		return slots8;
	}

	public void setSlots10(BerInteger slots10) {
		this.slots10 = slots10;
	}

	public BerInteger getSlots10() {
		return slots10;
	}

	public void setSlots16(BerInteger slots16) {
		this.slots16 = slots16;
	}

	public BerInteger getSlots16() {
		return slots16;
	}

	public void setSlots20(BerInteger slots20) {
		this.slots20 = slots20;
	}

	public BerInteger getSlots20() {
		return slots20;
	}

	public void setSlots32(BerInteger slots32) {
		this.slots32 = slots32;
	}

	public BerInteger getSlots32() {
		return slots32;
	}

	public void setSlots40(BerInteger slots40) {
		this.slots40 = slots40;
	}

	public BerInteger getSlots40() {
		return slots40;
	}

	public void setSlots64(BerInteger slots64) {
		this.slots64 = slots64;
	}

	public BerInteger getSlots64() {
		return slots64;
	}

	public void setSlots80(BerInteger slots80) {
		this.slots80 = slots80;
	}

	public BerInteger getSlots80() {
		return slots80;
	}

	public void setSlots160(BerInteger slots160) {
		this.slots160 = slots160;
	}

	public BerInteger getSlots160() {
		return slots160;
	}

	public void setSlots320(BerInteger slots320) {
		this.slots320 = slots320;
	}

	public BerInteger getSlots320() {
		return slots320;
	}

	public void setSlots640(BerInteger slots640) {
		this.slots640 = slots640;
	}

	public BerInteger getSlots640() {
		return slots640;
	}

	public int encode(OutputStream reverseOS) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				reverseOS.write(code[i]);
			}
			return code.length;
		}

		int codeLength = 0;
		if (slots640 != null) {
			codeLength += slots640.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 12
			reverseOS.write(0x8C);
			codeLength += 1;
			return codeLength;
		}
		
		if (slots320 != null) {
			codeLength += slots320.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 11
			reverseOS.write(0x8B);
			codeLength += 1;
			return codeLength;
		}
		
		if (slots160 != null) {
			codeLength += slots160.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 10
			reverseOS.write(0x8A);
			codeLength += 1;
			return codeLength;
		}
		
		if (slots80 != null) {
			codeLength += slots80.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 9
			reverseOS.write(0x89);
			codeLength += 1;
			return codeLength;
		}
		
		if (slots64 != null) {
			codeLength += slots64.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 8
			reverseOS.write(0x88);
			codeLength += 1;
			return codeLength;
		}
		
		if (slots40 != null) {
			codeLength += slots40.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 7
			reverseOS.write(0x87);
			codeLength += 1;
			return codeLength;
		}
		
		if (slots32 != null) {
			codeLength += slots32.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 6
			reverseOS.write(0x86);
			codeLength += 1;
			return codeLength;
		}
		
		if (slots20 != null) {
			codeLength += slots20.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 5
			reverseOS.write(0x85);
			codeLength += 1;
			return codeLength;
		}
		
		if (slots16 != null) {
			codeLength += slots16.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 4
			reverseOS.write(0x84);
			codeLength += 1;
			return codeLength;
		}
		
		if (slots10 != null) {
			codeLength += slots10.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 3
			reverseOS.write(0x83);
			codeLength += 1;
			return codeLength;
		}
		
		if (slots8 != null) {
			codeLength += slots8.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
			return codeLength;
		}
		
		if (slots5 != null) {
			codeLength += slots5.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
			return codeLength;
		}
		
		if (slots4 != null) {
			codeLength += slots4.encode(reverseOS, false);
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
			slots4 = new BerInteger();
			codeLength += slots4.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			slots5 = new BerInteger();
			codeLength += slots5.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			slots8 = new BerInteger();
			codeLength += slots8.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
			slots10 = new BerInteger();
			codeLength += slots10.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
			slots16 = new BerInteger();
			codeLength += slots16.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 5)) {
			slots20 = new BerInteger();
			codeLength += slots20.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 6)) {
			slots32 = new BerInteger();
			codeLength += slots32.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 7)) {
			slots40 = new BerInteger();
			codeLength += slots40.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 8)) {
			slots64 = new BerInteger();
			codeLength += slots64.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 9)) {
			slots80 = new BerInteger();
			codeLength += slots80.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 10)) {
			slots160 = new BerInteger();
			codeLength += slots160.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 11)) {
			slots320 = new BerInteger();
			codeLength += slots320.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 12)) {
			slots640 = new BerInteger();
			codeLength += slots640.decode(is, false);
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

		if (slots4 != null) {
			sb.append("slots4: ").append(slots4);
			return;
		}

		if (slots5 != null) {
			sb.append("slots5: ").append(slots5);
			return;
		}

		if (slots8 != null) {
			sb.append("slots8: ").append(slots8);
			return;
		}

		if (slots10 != null) {
			sb.append("slots10: ").append(slots10);
			return;
		}

		if (slots16 != null) {
			sb.append("slots16: ").append(slots16);
			return;
		}

		if (slots20 != null) {
			sb.append("slots20: ").append(slots20);
			return;
		}

		if (slots32 != null) {
			sb.append("slots32: ").append(slots32);
			return;
		}

		if (slots40 != null) {
			sb.append("slots40: ").append(slots40);
			return;
		}

		if (slots64 != null) {
			sb.append("slots64: ").append(slots64);
			return;
		}

		if (slots80 != null) {
			sb.append("slots80: ").append(slots80);
			return;
		}

		if (slots160 != null) {
			sb.append("slots160: ").append(slots160);
			return;
		}

		if (slots320 != null) {
			sb.append("slots320: ").append(slots320);
			return;
		}

		if (slots640 != null) {
			sb.append("slots640: ").append(slots640);
			return;
		}

		sb.append("<none>");
	}

}

