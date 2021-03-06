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


public class PhyParameters implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private PhyParametersCommon phyParametersCommon = null;
	private PhyParametersXDDDiff phyParametersXDDDiff = null;
	private PhyParametersFRXDiff phyParametersFRXDiff = null;
	private PhyParametersFR1 phyParametersFR1 = null;
	private PhyParametersFR2 phyParametersFR2 = null;
	
	public PhyParameters() {
	}

	public PhyParameters(byte[] code) {
		this.code = code;
	}

	public void setPhyParametersCommon(PhyParametersCommon phyParametersCommon) {
		this.phyParametersCommon = phyParametersCommon;
	}

	public PhyParametersCommon getPhyParametersCommon() {
		return phyParametersCommon;
	}

	public void setPhyParametersXDDDiff(PhyParametersXDDDiff phyParametersXDDDiff) {
		this.phyParametersXDDDiff = phyParametersXDDDiff;
	}

	public PhyParametersXDDDiff getPhyParametersXDDDiff() {
		return phyParametersXDDDiff;
	}

	public void setPhyParametersFRXDiff(PhyParametersFRXDiff phyParametersFRXDiff) {
		this.phyParametersFRXDiff = phyParametersFRXDiff;
	}

	public PhyParametersFRXDiff getPhyParametersFRXDiff() {
		return phyParametersFRXDiff;
	}

	public void setPhyParametersFR1(PhyParametersFR1 phyParametersFR1) {
		this.phyParametersFR1 = phyParametersFR1;
	}

	public PhyParametersFR1 getPhyParametersFR1() {
		return phyParametersFR1;
	}

	public void setPhyParametersFR2(PhyParametersFR2 phyParametersFR2) {
		this.phyParametersFR2 = phyParametersFR2;
	}

	public PhyParametersFR2 getPhyParametersFR2() {
		return phyParametersFR2;
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
		if (phyParametersFR2 != null) {
			codeLength += phyParametersFR2.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 4
			reverseOS.write(0xA4);
			codeLength += 1;
		}
		
		if (phyParametersFR1 != null) {
			codeLength += phyParametersFR1.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 3
			reverseOS.write(0xA3);
			codeLength += 1;
		}
		
		if (phyParametersFRXDiff != null) {
			codeLength += phyParametersFRXDiff.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 2
			reverseOS.write(0xA2);
			codeLength += 1;
		}
		
		if (phyParametersXDDDiff != null) {
			codeLength += phyParametersXDDDiff.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
			reverseOS.write(0xA1);
			codeLength += 1;
		}
		
		if (phyParametersCommon != null) {
			codeLength += phyParametersCommon.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 0
			reverseOS.write(0xA0);
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

		if (totalLength == 0) {
			return codeLength;
		}
		subCodeLength += berTag.decode(is);
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
			phyParametersCommon = new PhyParametersCommon();
			subCodeLength += phyParametersCommon.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
			phyParametersXDDDiff = new PhyParametersXDDDiff();
			subCodeLength += phyParametersXDDDiff.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
			phyParametersFRXDiff = new PhyParametersFRXDiff();
			subCodeLength += phyParametersFRXDiff.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 3)) {
			phyParametersFR1 = new PhyParametersFR1();
			subCodeLength += phyParametersFR1.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 4)) {
			phyParametersFR2 = new PhyParametersFR2();
			subCodeLength += phyParametersFR2.decode(is, false);
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
		if (phyParametersCommon != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("phyParametersCommon: ");
			phyParametersCommon.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (phyParametersXDDDiff != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("phyParametersXDDDiff: ");
			phyParametersXDDDiff.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (phyParametersFRXDiff != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("phyParametersFRXDiff: ");
			phyParametersFRXDiff.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (phyParametersFR1 != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("phyParametersFR1: ");
			phyParametersFR1.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (phyParametersFR2 != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("phyParametersFR2: ");
			phyParametersFR2.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

