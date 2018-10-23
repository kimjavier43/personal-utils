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


public class ULDCCHMessageType implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	public static class C1 implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public byte[] code = null;
		private MeasurementReport measurementReport = null;
		private BerNull spare14 = null;
		private BerNull spare13 = null;
		private BerNull spare12 = null;
		private BerNull spare11 = null;
		private BerNull spare10 = null;
		private BerNull spare9 = null;
		private BerNull spare8 = null;
		private BerNull spare7 = null;
		private BerNull spare6 = null;
		private BerNull spare5 = null;
		private BerNull spare4 = null;
		private BerNull spare3 = null;
		private BerNull spare2 = null;
		private BerNull spare1 = null;
		
		public C1() {
		}

		public C1(byte[] code) {
			this.code = code;
		}

		public void setMeasurementReport(MeasurementReport measurementReport) {
			this.measurementReport = measurementReport;
		}

		public MeasurementReport getMeasurementReport() {
			return measurementReport;
		}

		public void setSpare14(BerNull spare14) {
			this.spare14 = spare14;
		}

		public BerNull getSpare14() {
			return spare14;
		}

		public void setSpare13(BerNull spare13) {
			this.spare13 = spare13;
		}

		public BerNull getSpare13() {
			return spare13;
		}

		public void setSpare12(BerNull spare12) {
			this.spare12 = spare12;
		}

		public BerNull getSpare12() {
			return spare12;
		}

		public void setSpare11(BerNull spare11) {
			this.spare11 = spare11;
		}

		public BerNull getSpare11() {
			return spare11;
		}

		public void setSpare10(BerNull spare10) {
			this.spare10 = spare10;
		}

		public BerNull getSpare10() {
			return spare10;
		}

		public void setSpare9(BerNull spare9) {
			this.spare9 = spare9;
		}

		public BerNull getSpare9() {
			return spare9;
		}

		public void setSpare8(BerNull spare8) {
			this.spare8 = spare8;
		}

		public BerNull getSpare8() {
			return spare8;
		}

		public void setSpare7(BerNull spare7) {
			this.spare7 = spare7;
		}

		public BerNull getSpare7() {
			return spare7;
		}

		public void setSpare6(BerNull spare6) {
			this.spare6 = spare6;
		}

		public BerNull getSpare6() {
			return spare6;
		}

		public void setSpare5(BerNull spare5) {
			this.spare5 = spare5;
		}

		public BerNull getSpare5() {
			return spare5;
		}

		public void setSpare4(BerNull spare4) {
			this.spare4 = spare4;
		}

		public BerNull getSpare4() {
			return spare4;
		}

		public void setSpare3(BerNull spare3) {
			this.spare3 = spare3;
		}

		public BerNull getSpare3() {
			return spare3;
		}

		public void setSpare2(BerNull spare2) {
			this.spare2 = spare2;
		}

		public BerNull getSpare2() {
			return spare2;
		}

		public void setSpare1(BerNull spare1) {
			this.spare1 = spare1;
		}

		public BerNull getSpare1() {
			return spare1;
		}

		public int encode(OutputStream reverseOS) throws IOException {

			if (code != null) {
				for (int i = code.length - 1; i >= 0; i--) {
					reverseOS.write(code[i]);
				}
				return code.length;
			}

			int codeLength = 0;
			if (spare1 != null) {
				codeLength += spare1.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 14
				reverseOS.write(0x8E);
				codeLength += 1;
				return codeLength;
			}
			
			if (spare2 != null) {
				codeLength += spare2.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 13
				reverseOS.write(0x8D);
				codeLength += 1;
				return codeLength;
			}
			
			if (spare3 != null) {
				codeLength += spare3.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 12
				reverseOS.write(0x8C);
				codeLength += 1;
				return codeLength;
			}
			
			if (spare4 != null) {
				codeLength += spare4.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 11
				reverseOS.write(0x8B);
				codeLength += 1;
				return codeLength;
			}
			
			if (spare5 != null) {
				codeLength += spare5.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 10
				reverseOS.write(0x8A);
				codeLength += 1;
				return codeLength;
			}
			
			if (spare6 != null) {
				codeLength += spare6.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 9
				reverseOS.write(0x89);
				codeLength += 1;
				return codeLength;
			}
			
			if (spare7 != null) {
				codeLength += spare7.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 8
				reverseOS.write(0x88);
				codeLength += 1;
				return codeLength;
			}
			
			if (spare8 != null) {
				codeLength += spare8.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 7
				reverseOS.write(0x87);
				codeLength += 1;
				return codeLength;
			}
			
			if (spare9 != null) {
				codeLength += spare9.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 6
				reverseOS.write(0x86);
				codeLength += 1;
				return codeLength;
			}
			
			if (spare10 != null) {
				codeLength += spare10.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 5
				reverseOS.write(0x85);
				codeLength += 1;
				return codeLength;
			}
			
			if (spare11 != null) {
				codeLength += spare11.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 4
				reverseOS.write(0x84);
				codeLength += 1;
				return codeLength;
			}
			
			if (spare12 != null) {
				codeLength += spare12.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 3
				reverseOS.write(0x83);
				codeLength += 1;
				return codeLength;
			}
			
			if (spare13 != null) {
				codeLength += spare13.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 2
				reverseOS.write(0x82);
				codeLength += 1;
				return codeLength;
			}
			
			if (spare14 != null) {
				codeLength += spare14.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 1
				reverseOS.write(0x81);
				codeLength += 1;
				return codeLength;
			}
			
			if (measurementReport != null) {
				codeLength += measurementReport.encode(reverseOS, false);
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
				measurementReport = new MeasurementReport();
				codeLength += measurementReport.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
				spare14 = new BerNull();
				codeLength += spare14.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
				spare13 = new BerNull();
				codeLength += spare13.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
				spare12 = new BerNull();
				codeLength += spare12.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
				spare11 = new BerNull();
				codeLength += spare11.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 5)) {
				spare10 = new BerNull();
				codeLength += spare10.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 6)) {
				spare9 = new BerNull();
				codeLength += spare9.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 7)) {
				spare8 = new BerNull();
				codeLength += spare8.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 8)) {
				spare7 = new BerNull();
				codeLength += spare7.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 9)) {
				spare6 = new BerNull();
				codeLength += spare6.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 10)) {
				spare5 = new BerNull();
				codeLength += spare5.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 11)) {
				spare4 = new BerNull();
				codeLength += spare4.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 12)) {
				spare3 = new BerNull();
				codeLength += spare3.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 13)) {
				spare2 = new BerNull();
				codeLength += spare2.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 14)) {
				spare1 = new BerNull();
				codeLength += spare1.decode(is, false);
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

			if (measurementReport != null) {
				sb.append("measurementReport: ");
				measurementReport.appendAsString(sb, indentLevel + 1);
				return;
			}

			if (spare14 != null) {
				sb.append("spare14: ").append(spare14);
				return;
			}

			if (spare13 != null) {
				sb.append("spare13: ").append(spare13);
				return;
			}

			if (spare12 != null) {
				sb.append("spare12: ").append(spare12);
				return;
			}

			if (spare11 != null) {
				sb.append("spare11: ").append(spare11);
				return;
			}

			if (spare10 != null) {
				sb.append("spare10: ").append(spare10);
				return;
			}

			if (spare9 != null) {
				sb.append("spare9: ").append(spare9);
				return;
			}

			if (spare8 != null) {
				sb.append("spare8: ").append(spare8);
				return;
			}

			if (spare7 != null) {
				sb.append("spare7: ").append(spare7);
				return;
			}

			if (spare6 != null) {
				sb.append("spare6: ").append(spare6);
				return;
			}

			if (spare5 != null) {
				sb.append("spare5: ").append(spare5);
				return;
			}

			if (spare4 != null) {
				sb.append("spare4: ").append(spare4);
				return;
			}

			if (spare3 != null) {
				sb.append("spare3: ").append(spare3);
				return;
			}

			if (spare2 != null) {
				sb.append("spare2: ").append(spare2);
				return;
			}

			if (spare1 != null) {
				sb.append("spare1: ").append(spare1);
				return;
			}

			sb.append("<none>");
		}

	}

	public static class MessageClassExtension implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

		public byte[] code = null;
		
		public MessageClassExtension() {
		}

		public MessageClassExtension(byte[] code) {
			this.code = code;
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

			if (totalLength == 0) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
			return subCodeLength;
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
			for (int i = 0; i < indentLevel; i++) {
				sb.append("\t");
			}
			sb.append("}");
		}

	}

	private C1 c1 = null;
	private MessageClassExtension messageClassExtension = null;
	
	public ULDCCHMessageType() {
	}

	public ULDCCHMessageType(byte[] code) {
		this.code = code;
	}

	public void setC1(C1 c1) {
		this.c1 = c1;
	}

	public C1 getC1() {
		return c1;
	}

	public void setMessageClassExtension(MessageClassExtension messageClassExtension) {
		this.messageClassExtension = messageClassExtension;
	}

	public MessageClassExtension getMessageClassExtension() {
		return messageClassExtension;
	}

	public int encode(OutputStream reverseOS) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				reverseOS.write(code[i]);
			}
			return code.length;
		}

		int codeLength = 0;
		int sublength;

		if (messageClassExtension != null) {
			codeLength += messageClassExtension.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
			reverseOS.write(0xA1);
			codeLength += 1;
			return codeLength;
		}
		
		if (c1 != null) {
			sublength = c1.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
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
			codeLength += BerLength.skip(is);
			c1 = new C1();
			codeLength += c1.decode(is, null);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
			messageClassExtension = new MessageClassExtension();
			codeLength += messageClassExtension.decode(is, false);
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

		if (c1 != null) {
			sb.append("c1: ");
			c1.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (messageClassExtension != null) {
			sb.append("messageClassExtension: ");
			messageClassExtension.appendAsString(sb, indentLevel + 1);
			return;
		}

		sb.append("<none>");
	}

}
