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


public class PhyParametersXDDDiff implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private BerEnum dynamicSFI = null;
	private BerEnum twoPUCCHF02ConsecSymbols = null;
	private BerEnum twoDifferentTPCLoopPUSCH = null;
	private BerEnum twoDifferentTPCLoopPUCCH = null;
	
	public PhyParametersXDDDiff() {
	}

	public PhyParametersXDDDiff(byte[] code) {
		this.code = code;
	}

	public void setDynamicSFI(BerEnum dynamicSFI) {
		this.dynamicSFI = dynamicSFI;
	}

	public BerEnum getDynamicSFI() {
		return dynamicSFI;
	}

	public void setTwoPUCCHF02ConsecSymbols(BerEnum twoPUCCHF02ConsecSymbols) {
		this.twoPUCCHF02ConsecSymbols = twoPUCCHF02ConsecSymbols;
	}

	public BerEnum getTwoPUCCHF02ConsecSymbols() {
		return twoPUCCHF02ConsecSymbols;
	}

	public void setTwoDifferentTPCLoopPUSCH(BerEnum twoDifferentTPCLoopPUSCH) {
		this.twoDifferentTPCLoopPUSCH = twoDifferentTPCLoopPUSCH;
	}

	public BerEnum getTwoDifferentTPCLoopPUSCH() {
		return twoDifferentTPCLoopPUSCH;
	}

	public void setTwoDifferentTPCLoopPUCCH(BerEnum twoDifferentTPCLoopPUCCH) {
		this.twoDifferentTPCLoopPUCCH = twoDifferentTPCLoopPUCCH;
	}

	public BerEnum getTwoDifferentTPCLoopPUCCH() {
		return twoDifferentTPCLoopPUCCH;
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
		if (twoDifferentTPCLoopPUCCH != null) {
			codeLength += twoDifferentTPCLoopPUCCH.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 3
			reverseOS.write(0x83);
			codeLength += 1;
		}
		
		if (twoDifferentTPCLoopPUSCH != null) {
			codeLength += twoDifferentTPCLoopPUSCH.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
		}
		
		if (twoPUCCHF02ConsecSymbols != null) {
			codeLength += twoPUCCHF02ConsecSymbols.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
		}
		
		if (dynamicSFI != null) {
			codeLength += dynamicSFI.encode(reverseOS, false);
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

		if (totalLength == 0) {
			return codeLength;
		}
		subCodeLength += berTag.decode(is);
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
			dynamicSFI = new BerEnum();
			subCodeLength += dynamicSFI.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			twoPUCCHF02ConsecSymbols = new BerEnum();
			subCodeLength += twoPUCCHF02ConsecSymbols.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			twoDifferentTPCLoopPUSCH = new BerEnum();
			subCodeLength += twoDifferentTPCLoopPUSCH.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
			twoDifferentTPCLoopPUCCH = new BerEnum();
			subCodeLength += twoDifferentTPCLoopPUCCH.decode(is, false);
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
		if (dynamicSFI != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("dynamicSFI: ").append(dynamicSFI);
			firstSelectedElement = false;
		}
		
		if (twoPUCCHF02ConsecSymbols != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("twoPUCCHF02ConsecSymbols: ").append(twoPUCCHF02ConsecSymbols);
			firstSelectedElement = false;
		}
		
		if (twoDifferentTPCLoopPUSCH != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("twoDifferentTPCLoopPUSCH: ").append(twoDifferentTPCLoopPUSCH);
			firstSelectedElement = false;
		}
		
		if (twoDifferentTPCLoopPUCCH != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("twoDifferentTPCLoopPUCCH: ").append(twoDifferentTPCLoopPUCCH);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

