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


public class PDSCHServingCellConfig implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private SetupRelease codeBlockGroupTransmission = null;
	private BerEnum xOverhead = null;
	private BerEnum nrofHARQProcessesForPDSCH = null;
	private ServCellIndex pucchCell = null;
	
	public PDSCHServingCellConfig() {
	}

	public PDSCHServingCellConfig(byte[] code) {
		this.code = code;
	}

	public void setCodeBlockGroupTransmission(SetupRelease codeBlockGroupTransmission) {
		this.codeBlockGroupTransmission = codeBlockGroupTransmission;
	}

	public SetupRelease getCodeBlockGroupTransmission() {
		return codeBlockGroupTransmission;
	}

	public void setXOverhead(BerEnum xOverhead) {
		this.xOverhead = xOverhead;
	}

	public BerEnum getXOverhead() {
		return xOverhead;
	}

	public void setNrofHARQProcessesForPDSCH(BerEnum nrofHARQProcessesForPDSCH) {
		this.nrofHARQProcessesForPDSCH = nrofHARQProcessesForPDSCH;
	}

	public BerEnum getNrofHARQProcessesForPDSCH() {
		return nrofHARQProcessesForPDSCH;
	}

	public void setPucchCell(ServCellIndex pucchCell) {
		this.pucchCell = pucchCell;
	}

	public ServCellIndex getPucchCell() {
		return pucchCell;
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

		if (pucchCell != null) {
			codeLength += pucchCell.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 3
			reverseOS.write(0x83);
			codeLength += 1;
		}
		
		if (nrofHARQProcessesForPDSCH != null) {
			codeLength += nrofHARQProcessesForPDSCH.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
		}
		
		if (xOverhead != null) {
			codeLength += xOverhead.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
		}
		
		if (codeBlockGroupTransmission != null) {
			sublength = codeBlockGroupTransmission.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
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
			subCodeLength += length.decode(is);
			codeBlockGroupTransmission = new SetupRelease();
			subCodeLength += codeBlockGroupTransmission.decode(is, null);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			xOverhead = new BerEnum();
			subCodeLength += xOverhead.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			nrofHARQProcessesForPDSCH = new BerEnum();
			subCodeLength += nrofHARQProcessesForPDSCH.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
			pucchCell = new ServCellIndex();
			subCodeLength += pucchCell.decode(is, false);
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
		if (codeBlockGroupTransmission != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("codeBlockGroupTransmission: ");
			codeBlockGroupTransmission.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (xOverhead != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("xOverhead: ").append(xOverhead);
			firstSelectedElement = false;
		}
		
		if (nrofHARQProcessesForPDSCH != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("nrofHARQProcessesForPDSCH: ").append(nrofHARQProcessesForPDSCH);
			firstSelectedElement = false;
		}
		
		if (pucchCell != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("pucchCell: ").append(pucchCell);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

