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


public class CSIRSResourceMapping implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static class FrequencyDomainAllocation implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public byte[] code = null;
		private BerBitString row1 = null;
		private BerBitString row2 = null;
		private BerBitString row4 = null;
		private BerBitString other = null;
		
		public FrequencyDomainAllocation() {
		}

		public FrequencyDomainAllocation(byte[] code) {
			this.code = code;
		}

		public void setRow1(BerBitString row1) {
			this.row1 = row1;
		}

		public BerBitString getRow1() {
			return row1;
		}

		public void setRow2(BerBitString row2) {
			this.row2 = row2;
		}

		public BerBitString getRow2() {
			return row2;
		}

		public void setRow4(BerBitString row4) {
			this.row4 = row4;
		}

		public BerBitString getRow4() {
			return row4;
		}

		public void setOther(BerBitString other) {
			this.other = other;
		}

		public BerBitString getOther() {
			return other;
		}

		public int encode(OutputStream reverseOS) throws IOException {

			if (code != null) {
				for (int i = code.length - 1; i >= 0; i--) {
					reverseOS.write(code[i]);
				}
				return code.length;
			}

			int codeLength = 0;
			if (other != null) {
				codeLength += other.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 3
				reverseOS.write(0x83);
				codeLength += 1;
				return codeLength;
			}
			
			if (row4 != null) {
				codeLength += row4.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 2
				reverseOS.write(0x82);
				codeLength += 1;
				return codeLength;
			}
			
			if (row2 != null) {
				codeLength += row2.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 1
				reverseOS.write(0x81);
				codeLength += 1;
				return codeLength;
			}
			
			if (row1 != null) {
				codeLength += row1.encode(reverseOS, false);
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
				row1 = new BerBitString();
				codeLength += row1.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
				row2 = new BerBitString();
				codeLength += row2.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
				row4 = new BerBitString();
				codeLength += row4.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
				other = new BerBitString();
				codeLength += other.decode(is, false);
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

			if (row1 != null) {
				sb.append("row1: ").append(row1);
				return;
			}

			if (row2 != null) {
				sb.append("row2: ").append(row2);
				return;
			}

			if (row4 != null) {
				sb.append("row4: ").append(row4);
				return;
			}

			if (other != null) {
				sb.append("other: ").append(other);
				return;
			}

			sb.append("<none>");
		}

	}

	public static class Density implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public byte[] code = null;
		private BerEnum dot5 = null;
		private BerNull one = null;
		private BerNull three = null;
		private BerNull spare = null;
		
		public Density() {
		}

		public Density(byte[] code) {
			this.code = code;
		}

		public void setDot5(BerEnum dot5) {
			this.dot5 = dot5;
		}

		public BerEnum getDot5() {
			return dot5;
		}

		public void setOne(BerNull one) {
			this.one = one;
		}

		public BerNull getOne() {
			return one;
		}

		public void setThree(BerNull three) {
			this.three = three;
		}

		public BerNull getThree() {
			return three;
		}

		public void setSpare(BerNull spare) {
			this.spare = spare;
		}

		public BerNull getSpare() {
			return spare;
		}

		public int encode(OutputStream reverseOS) throws IOException {

			if (code != null) {
				for (int i = code.length - 1; i >= 0; i--) {
					reverseOS.write(code[i]);
				}
				return code.length;
			}

			int codeLength = 0;
			if (spare != null) {
				codeLength += spare.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 3
				reverseOS.write(0x83);
				codeLength += 1;
				return codeLength;
			}
			
			if (three != null) {
				codeLength += three.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 2
				reverseOS.write(0x82);
				codeLength += 1;
				return codeLength;
			}
			
			if (one != null) {
				codeLength += one.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 1
				reverseOS.write(0x81);
				codeLength += 1;
				return codeLength;
			}
			
			if (dot5 != null) {
				codeLength += dot5.encode(reverseOS, false);
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
				dot5 = new BerEnum();
				codeLength += dot5.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
				one = new BerNull();
				codeLength += one.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
				three = new BerNull();
				codeLength += three.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
				spare = new BerNull();
				codeLength += spare.decode(is, false);
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

			if (dot5 != null) {
				sb.append("dot5: ").append(dot5);
				return;
			}

			if (one != null) {
				sb.append("one: ").append(one);
				return;
			}

			if (three != null) {
				sb.append("three: ").append(three);
				return;
			}

			if (spare != null) {
				sb.append("spare: ").append(spare);
				return;
			}

			sb.append("<none>");
		}

	}

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private FrequencyDomainAllocation frequencyDomainAllocation = null;
	private BerEnum nrofPorts = null;
	private BerInteger firstOFDMSymbolInTimeDomain = null;
	private BerInteger firstOFDMSymbolInTimeDomain2 = null;
	private BerEnum cdmType = null;
	private Density density = null;
	private CSIFrequencyOccupation freqBand = null;
	
	public CSIRSResourceMapping() {
	}

	public CSIRSResourceMapping(byte[] code) {
		this.code = code;
	}

	public void setFrequencyDomainAllocation(FrequencyDomainAllocation frequencyDomainAllocation) {
		this.frequencyDomainAllocation = frequencyDomainAllocation;
	}

	public FrequencyDomainAllocation getFrequencyDomainAllocation() {
		return frequencyDomainAllocation;
	}

	public void setNrofPorts(BerEnum nrofPorts) {
		this.nrofPorts = nrofPorts;
	}

	public BerEnum getNrofPorts() {
		return nrofPorts;
	}

	public void setFirstOFDMSymbolInTimeDomain(BerInteger firstOFDMSymbolInTimeDomain) {
		this.firstOFDMSymbolInTimeDomain = firstOFDMSymbolInTimeDomain;
	}

	public BerInteger getFirstOFDMSymbolInTimeDomain() {
		return firstOFDMSymbolInTimeDomain;
	}

	public void setFirstOFDMSymbolInTimeDomain2(BerInteger firstOFDMSymbolInTimeDomain2) {
		this.firstOFDMSymbolInTimeDomain2 = firstOFDMSymbolInTimeDomain2;
	}

	public BerInteger getFirstOFDMSymbolInTimeDomain2() {
		return firstOFDMSymbolInTimeDomain2;
	}

	public void setCdmType(BerEnum cdmType) {
		this.cdmType = cdmType;
	}

	public BerEnum getCdmType() {
		return cdmType;
	}

	public void setDensity(Density density) {
		this.density = density;
	}

	public Density getDensity() {
		return density;
	}

	public void setFreqBand(CSIFrequencyOccupation freqBand) {
		this.freqBand = freqBand;
	}

	public CSIFrequencyOccupation getFreqBand() {
		return freqBand;
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

		codeLength += freqBand.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 6
		reverseOS.write(0xA6);
		codeLength += 1;
		
		sublength = density.encode(reverseOS);
		codeLength += sublength;
		codeLength += BerLength.encodeLength(reverseOS, sublength);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 5
		reverseOS.write(0xA5);
		codeLength += 1;
		
		codeLength += cdmType.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 4
		reverseOS.write(0x84);
		codeLength += 1;
		
		if (firstOFDMSymbolInTimeDomain2 != null) {
			codeLength += firstOFDMSymbolInTimeDomain2.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 3
			reverseOS.write(0x83);
			codeLength += 1;
		}
		
		codeLength += firstOFDMSymbolInTimeDomain.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 2
		reverseOS.write(0x82);
		codeLength += 1;
		
		codeLength += nrofPorts.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 1
		reverseOS.write(0x81);
		codeLength += 1;
		
		sublength = frequencyDomainAllocation.encode(reverseOS);
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
			frequencyDomainAllocation = new FrequencyDomainAllocation();
			subCodeLength += frequencyDomainAllocation.decode(is, null);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			nrofPorts = new BerEnum();
			subCodeLength += nrofPorts.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			firstOFDMSymbolInTimeDomain = new BerInteger();
			subCodeLength += firstOFDMSymbolInTimeDomain.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
			firstOFDMSymbolInTimeDomain2 = new BerInteger();
			subCodeLength += firstOFDMSymbolInTimeDomain2.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
			cdmType = new BerEnum();
			subCodeLength += cdmType.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 5)) {
			subCodeLength += length.decode(is);
			density = new Density();
			subCodeLength += density.decode(is, null);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 6)) {
			freqBand = new CSIFrequencyOccupation();
			subCodeLength += freqBand.decode(is, false);
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
		if (frequencyDomainAllocation != null) {
			sb.append("frequencyDomainAllocation: ");
			frequencyDomainAllocation.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("frequencyDomainAllocation: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (nrofPorts != null) {
			sb.append("nrofPorts: ").append(nrofPorts);
		}
		else {
			sb.append("nrofPorts: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (firstOFDMSymbolInTimeDomain != null) {
			sb.append("firstOFDMSymbolInTimeDomain: ").append(firstOFDMSymbolInTimeDomain);
		}
		else {
			sb.append("firstOFDMSymbolInTimeDomain: <empty-required-field>");
		}
		
		if (firstOFDMSymbolInTimeDomain2 != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("firstOFDMSymbolInTimeDomain2: ").append(firstOFDMSymbolInTimeDomain2);
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (cdmType != null) {
			sb.append("cdmType: ").append(cdmType);
		}
		else {
			sb.append("cdmType: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (density != null) {
			sb.append("density: ");
			density.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("density: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (freqBand != null) {
			sb.append("freqBand: ");
			freqBand.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("freqBand: <empty-required-field>");
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

