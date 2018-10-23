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


public class PhysicalCellGroupConfig implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private BerEnum harqACKSpatialBundlingPUCCH = null;
	private BerEnum harqACKSpatialBundlingPUSCH = null;
	private PMax pNR = null;
	private BerEnum pdschHARQACKCodebook = null;
	private RNTIValue tpcSRSRNTI = null;
	private RNTIValue tpcPUCCHRNTI = null;
	private RNTIValue tpcPUSCHRNTI = null;
	private RNTIValue spCSIRNTI = null;
	private SetupRelease csRNTI = null;
	
	public PhysicalCellGroupConfig() {
	}

	public PhysicalCellGroupConfig(byte[] code) {
		this.code = code;
	}

	public void setHarqACKSpatialBundlingPUCCH(BerEnum harqACKSpatialBundlingPUCCH) {
		this.harqACKSpatialBundlingPUCCH = harqACKSpatialBundlingPUCCH;
	}

	public BerEnum getHarqACKSpatialBundlingPUCCH() {
		return harqACKSpatialBundlingPUCCH;
	}

	public void setHarqACKSpatialBundlingPUSCH(BerEnum harqACKSpatialBundlingPUSCH) {
		this.harqACKSpatialBundlingPUSCH = harqACKSpatialBundlingPUSCH;
	}

	public BerEnum getHarqACKSpatialBundlingPUSCH() {
		return harqACKSpatialBundlingPUSCH;
	}

	public void setPNR(PMax pNR) {
		this.pNR = pNR;
	}

	public PMax getPNR() {
		return pNR;
	}

	public void setPdschHARQACKCodebook(BerEnum pdschHARQACKCodebook) {
		this.pdschHARQACKCodebook = pdschHARQACKCodebook;
	}

	public BerEnum getPdschHARQACKCodebook() {
		return pdschHARQACKCodebook;
	}

	public void setTpcSRSRNTI(RNTIValue tpcSRSRNTI) {
		this.tpcSRSRNTI = tpcSRSRNTI;
	}

	public RNTIValue getTpcSRSRNTI() {
		return tpcSRSRNTI;
	}

	public void setTpcPUCCHRNTI(RNTIValue tpcPUCCHRNTI) {
		this.tpcPUCCHRNTI = tpcPUCCHRNTI;
	}

	public RNTIValue getTpcPUCCHRNTI() {
		return tpcPUCCHRNTI;
	}

	public void setTpcPUSCHRNTI(RNTIValue tpcPUSCHRNTI) {
		this.tpcPUSCHRNTI = tpcPUSCHRNTI;
	}

	public RNTIValue getTpcPUSCHRNTI() {
		return tpcPUSCHRNTI;
	}

	public void setSpCSIRNTI(RNTIValue spCSIRNTI) {
		this.spCSIRNTI = spCSIRNTI;
	}

	public RNTIValue getSpCSIRNTI() {
		return spCSIRNTI;
	}

	public void setCsRNTI(SetupRelease csRNTI) {
		this.csRNTI = csRNTI;
	}

	public SetupRelease getCsRNTI() {
		return csRNTI;
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

		if (csRNTI != null) {
			sublength = csRNTI.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 8
			reverseOS.write(0xA8);
			codeLength += 1;
		}
		
		if (spCSIRNTI != null) {
			codeLength += spCSIRNTI.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 7
			reverseOS.write(0x87);
			codeLength += 1;
		}
		
		if (tpcPUSCHRNTI != null) {
			codeLength += tpcPUSCHRNTI.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 6
			reverseOS.write(0x86);
			codeLength += 1;
		}
		
		if (tpcPUCCHRNTI != null) {
			codeLength += tpcPUCCHRNTI.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 5
			reverseOS.write(0x85);
			codeLength += 1;
		}
		
		if (tpcSRSRNTI != null) {
			codeLength += tpcSRSRNTI.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 4
			reverseOS.write(0x84);
			codeLength += 1;
		}
		
		codeLength += pdschHARQACKCodebook.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 3
		reverseOS.write(0x83);
		codeLength += 1;
		
		if (pNR != null) {
			codeLength += pNR.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
		}
		
		if (harqACKSpatialBundlingPUSCH != null) {
			codeLength += harqACKSpatialBundlingPUSCH.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
		}
		
		if (harqACKSpatialBundlingPUCCH != null) {
			codeLength += harqACKSpatialBundlingPUCCH.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 0
			reverseOS.write(0x80);
			codeLength += 1;
		}
		
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
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
			harqACKSpatialBundlingPUCCH = new BerEnum();
			subCodeLength += harqACKSpatialBundlingPUCCH.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			harqACKSpatialBundlingPUSCH = new BerEnum();
			subCodeLength += harqACKSpatialBundlingPUSCH.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			pNR = new PMax();
			subCodeLength += pNR.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
			pdschHARQACKCodebook = new BerEnum();
			subCodeLength += pdschHARQACKCodebook.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
			tpcSRSRNTI = new RNTIValue();
			subCodeLength += tpcSRSRNTI.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 5)) {
			tpcPUCCHRNTI = new RNTIValue();
			subCodeLength += tpcPUCCHRNTI.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 6)) {
			tpcPUSCHRNTI = new RNTIValue();
			subCodeLength += tpcPUSCHRNTI.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 7)) {
			spCSIRNTI = new RNTIValue();
			subCodeLength += spCSIRNTI.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 8)) {
			subCodeLength += length.decode(is);
			csRNTI = new SetupRelease();
			subCodeLength += csRNTI.decode(is, null);
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
		boolean firstSelectedElement = true;
		if (harqACKSpatialBundlingPUCCH != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("harqACKSpatialBundlingPUCCH: ").append(harqACKSpatialBundlingPUCCH);
			firstSelectedElement = false;
		}
		
		if (harqACKSpatialBundlingPUSCH != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("harqACKSpatialBundlingPUSCH: ").append(harqACKSpatialBundlingPUSCH);
			firstSelectedElement = false;
		}
		
		if (pNR != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("pNR: ").append(pNR);
			firstSelectedElement = false;
		}
		
		if (!firstSelectedElement) {
			sb.append(",\n");
		}
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (pdschHARQACKCodebook != null) {
			sb.append("pdschHARQACKCodebook: ").append(pdschHARQACKCodebook);
		}
		else {
			sb.append("pdschHARQACKCodebook: <empty-required-field>");
		}
		
		if (tpcSRSRNTI != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("tpcSRSRNTI: ").append(tpcSRSRNTI);
		}
		
		if (tpcPUCCHRNTI != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("tpcPUCCHRNTI: ").append(tpcPUCCHRNTI);
		}
		
		if (tpcPUSCHRNTI != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("tpcPUSCHRNTI: ").append(tpcPUSCHRNTI);
		}
		
		if (spCSIRNTI != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("spCSIRNTI: ").append(spCSIRNTI);
		}
		
		if (csRNTI != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("csRNTI: ");
			csRNTI.appendAsString(sb, indentLevel + 1);
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

