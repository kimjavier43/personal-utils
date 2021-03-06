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


public class PUCCHFormatConfig implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private BerEnum interslotFrequencyHopping = null;
	private BerEnum additionalDMRS = null;
	private PUCCHMaxCodeRate maxCodeRate = null;
	private BerEnum nrofSlots = null;
	private BerEnum pi2BPSK = null;
	private BerEnum simultaneousHARQACKCSI = null;
	
	public PUCCHFormatConfig() {
	}

	public PUCCHFormatConfig(byte[] code) {
		this.code = code;
	}

	public void setInterslotFrequencyHopping(BerEnum interslotFrequencyHopping) {
		this.interslotFrequencyHopping = interslotFrequencyHopping;
	}

	public BerEnum getInterslotFrequencyHopping() {
		return interslotFrequencyHopping;
	}

	public void setAdditionalDMRS(BerEnum additionalDMRS) {
		this.additionalDMRS = additionalDMRS;
	}

	public BerEnum getAdditionalDMRS() {
		return additionalDMRS;
	}

	public void setMaxCodeRate(PUCCHMaxCodeRate maxCodeRate) {
		this.maxCodeRate = maxCodeRate;
	}

	public PUCCHMaxCodeRate getMaxCodeRate() {
		return maxCodeRate;
	}

	public void setNrofSlots(BerEnum nrofSlots) {
		this.nrofSlots = nrofSlots;
	}

	public BerEnum getNrofSlots() {
		return nrofSlots;
	}

	public void setPi2BPSK(BerEnum pi2BPSK) {
		this.pi2BPSK = pi2BPSK;
	}

	public BerEnum getPi2BPSK() {
		return pi2BPSK;
	}

	public void setSimultaneousHARQACKCSI(BerEnum simultaneousHARQACKCSI) {
		this.simultaneousHARQACKCSI = simultaneousHARQACKCSI;
	}

	public BerEnum getSimultaneousHARQACKCSI() {
		return simultaneousHARQACKCSI;
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
		if (simultaneousHARQACKCSI != null) {
			codeLength += simultaneousHARQACKCSI.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 5
			reverseOS.write(0x85);
			codeLength += 1;
		}
		
		if (pi2BPSK != null) {
			codeLength += pi2BPSK.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 4
			reverseOS.write(0x84);
			codeLength += 1;
		}
		
		if (nrofSlots != null) {
			codeLength += nrofSlots.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 3
			reverseOS.write(0x83);
			codeLength += 1;
		}
		
		if (maxCodeRate != null) {
			codeLength += maxCodeRate.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
		}
		
		if (additionalDMRS != null) {
			codeLength += additionalDMRS.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
		}
		
		if (interslotFrequencyHopping != null) {
			codeLength += interslotFrequencyHopping.encode(reverseOS, false);
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
			interslotFrequencyHopping = new BerEnum();
			subCodeLength += interslotFrequencyHopping.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			additionalDMRS = new BerEnum();
			subCodeLength += additionalDMRS.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			maxCodeRate = new PUCCHMaxCodeRate();
			subCodeLength += maxCodeRate.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
			nrofSlots = new BerEnum();
			subCodeLength += nrofSlots.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
			pi2BPSK = new BerEnum();
			subCodeLength += pi2BPSK.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 5)) {
			simultaneousHARQACKCSI = new BerEnum();
			subCodeLength += simultaneousHARQACKCSI.decode(is, false);
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
		if (interslotFrequencyHopping != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("interslotFrequencyHopping: ").append(interslotFrequencyHopping);
			firstSelectedElement = false;
		}
		
		if (additionalDMRS != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("additionalDMRS: ").append(additionalDMRS);
			firstSelectedElement = false;
		}
		
		if (maxCodeRate != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("maxCodeRate: ").append(maxCodeRate);
			firstSelectedElement = false;
		}
		
		if (nrofSlots != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("nrofSlots: ").append(nrofSlots);
			firstSelectedElement = false;
		}
		
		if (pi2BPSK != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("pi2BPSK: ").append(pi2BPSK);
			firstSelectedElement = false;
		}
		
		if (simultaneousHARQACKCSI != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("simultaneousHARQACKCSI: ").append(simultaneousHARQACKCSI);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

