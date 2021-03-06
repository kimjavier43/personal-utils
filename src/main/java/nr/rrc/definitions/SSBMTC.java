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


public class SSBMTC implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static class PeriodicityAndOffset implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public byte[] code = null;
		private BerInteger sf5 = null;
		private BerInteger sf10 = null;
		private BerInteger sf20 = null;
		private BerInteger sf40 = null;
		private BerInteger sf80 = null;
		private BerInteger sf160 = null;
		
		public PeriodicityAndOffset() {
		}

		public PeriodicityAndOffset(byte[] code) {
			this.code = code;
		}

		public void setSf5(BerInteger sf5) {
			this.sf5 = sf5;
		}

		public BerInteger getSf5() {
			return sf5;
		}

		public void setSf10(BerInteger sf10) {
			this.sf10 = sf10;
		}

		public BerInteger getSf10() {
			return sf10;
		}

		public void setSf20(BerInteger sf20) {
			this.sf20 = sf20;
		}

		public BerInteger getSf20() {
			return sf20;
		}

		public void setSf40(BerInteger sf40) {
			this.sf40 = sf40;
		}

		public BerInteger getSf40() {
			return sf40;
		}

		public void setSf80(BerInteger sf80) {
			this.sf80 = sf80;
		}

		public BerInteger getSf80() {
			return sf80;
		}

		public void setSf160(BerInteger sf160) {
			this.sf160 = sf160;
		}

		public BerInteger getSf160() {
			return sf160;
		}

		public int encode(OutputStream reverseOS) throws IOException {

			if (code != null) {
				for (int i = code.length - 1; i >= 0; i--) {
					reverseOS.write(code[i]);
				}
				return code.length;
			}

			int codeLength = 0;
			if (sf160 != null) {
				codeLength += sf160.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 5
				reverseOS.write(0x85);
				codeLength += 1;
				return codeLength;
			}
			
			if (sf80 != null) {
				codeLength += sf80.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 4
				reverseOS.write(0x84);
				codeLength += 1;
				return codeLength;
			}
			
			if (sf40 != null) {
				codeLength += sf40.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 3
				reverseOS.write(0x83);
				codeLength += 1;
				return codeLength;
			}
			
			if (sf20 != null) {
				codeLength += sf20.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 2
				reverseOS.write(0x82);
				codeLength += 1;
				return codeLength;
			}
			
			if (sf10 != null) {
				codeLength += sf10.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 1
				reverseOS.write(0x81);
				codeLength += 1;
				return codeLength;
			}
			
			if (sf5 != null) {
				codeLength += sf5.encode(reverseOS, false);
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
				sf5 = new BerInteger();
				codeLength += sf5.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
				sf10 = new BerInteger();
				codeLength += sf10.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
				sf20 = new BerInteger();
				codeLength += sf20.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
				sf40 = new BerInteger();
				codeLength += sf40.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
				sf80 = new BerInteger();
				codeLength += sf80.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 5)) {
				sf160 = new BerInteger();
				codeLength += sf160.decode(is, false);
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

			if (sf5 != null) {
				sb.append("sf5: ").append(sf5);
				return;
			}

			if (sf10 != null) {
				sb.append("sf10: ").append(sf10);
				return;
			}

			if (sf20 != null) {
				sb.append("sf20: ").append(sf20);
				return;
			}

			if (sf40 != null) {
				sb.append("sf40: ").append(sf40);
				return;
			}

			if (sf80 != null) {
				sb.append("sf80: ").append(sf80);
				return;
			}

			if (sf160 != null) {
				sb.append("sf160: ").append(sf160);
				return;
			}

			sb.append("<none>");
		}

	}

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private PeriodicityAndOffset periodicityAndOffset = null;
	private BerEnum duration = null;
	
	public SSBMTC() {
	}

	public SSBMTC(byte[] code) {
		this.code = code;
	}

	public void setPeriodicityAndOffset(PeriodicityAndOffset periodicityAndOffset) {
		this.periodicityAndOffset = periodicityAndOffset;
	}

	public PeriodicityAndOffset getPeriodicityAndOffset() {
		return periodicityAndOffset;
	}

	public void setDuration(BerEnum duration) {
		this.duration = duration;
	}

	public BerEnum getDuration() {
		return duration;
	}

	public int encode(OutputStream reverseOS) throws IOException {
		return encode(reverseOS, true);
	}

	public int encode(OutputStream reverseOS, boolean withTag) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				reverseOS.write(code[i]);
			}
			if (withTag) {
				return tag.encode(reverseOS) + code.length;
			}
			return code.length;
		}

		int codeLength = 0;
		int sublength;

		codeLength += duration.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 1
		reverseOS.write(0x81);
		codeLength += 1;
		
		sublength = periodicityAndOffset.encode(reverseOS);
		codeLength += sublength;
		codeLength += BerLength.encodeLength(reverseOS, sublength);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 0
		reverseOS.write(0xA0);
		codeLength += 1;
		
		codeLength += BerLength.encodeLength(reverseOS, codeLength);

		if (withTag) {
			codeLength += tag.encode(reverseOS);
		}

		return codeLength;

	}

	public int decode(InputStream is) throws IOException {
		return decode(is, true);
	}

	public int decode(InputStream is, boolean withTag) throws IOException {
		int codeLength = 0;
		int subCodeLength = 0;
		BerTag berTag = new BerTag();

		if (withTag) {
			codeLength += tag.decodeAndCheck(is);
		}

		BerLength length = new BerLength();
		codeLength += length.decode(is);

		int totalLength = length.val;
		codeLength += totalLength;

		subCodeLength += berTag.decode(is);
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
			subCodeLength += length.decode(is);
			periodicityAndOffset = new PeriodicityAndOffset();
			subCodeLength += periodicityAndOffset.decode(is, null);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			duration = new BerEnum();
			subCodeLength += duration.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
		}
		throw new IOException("Unexpected end of sequence, length tag: " + totalLength + ", actual sequence length: " + subCodeLength);

		
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
		encode(reverseOS, false);
		code = reverseOS.getArray();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		sb.append("{");
		sb.append("\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (periodicityAndOffset != null) {
			sb.append("periodicityAndOffset: ");
			periodicityAndOffset.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("periodicityAndOffset: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (duration != null) {
			sb.append("duration: ").append(duration);
		}
		else {
			sb.append("duration: <empty-required-field>");
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

