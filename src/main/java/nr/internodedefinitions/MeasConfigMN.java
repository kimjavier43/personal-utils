/**
 * This class file was automatically generated by jASN1 v1.10.0 (http://www.openmuc.org)
 */

package nr.internodedefinitions;

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

import nr.rrc.definitions.ARFCNValueNR;
import nr.rrc.definitions.CSIRSIndex;
import nr.rrc.definitions.CellIdentity;
import nr.rrc.definitions.GapConfig;
import nr.rrc.definitions.MeasQuantityResults;
import nr.rrc.definitions.MeasResultCellListSFTD;
import nr.rrc.definitions.MeasResultList2NR;
import nr.rrc.definitions.MeasResultSCGFailure;
import nr.rrc.definitions.PMax;
import nr.rrc.definitions.PhysCellId;
import nr.rrc.definitions.RRCReconfiguration;
import nr.rrc.definitions.RadioBearerConfig;
import nr.rrc.definitions.SSBIndex;
import nr.rrc.definitions.SSBMTC;
import nr.rrc.definitions.ServCellIndex;
import nr.rrc.definitions.SetupRelease;
import nr.rrc.definitions.ShortMACI;
import nr.rrc.definitions.UECapabilityRATContainerList;

public class MeasConfigMN implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static class MeasuredFrequenciesMN implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
		public byte[] code = null;
		private List<NRFreqInfo> seqOf = null;

		public MeasuredFrequenciesMN() {
			seqOf = new ArrayList<NRFreqInfo>();
		}

		public MeasuredFrequenciesMN(byte[] code) {
			this.code = code;
		}

		public List<NRFreqInfo> getNRFreqInfo() {
			if (seqOf == null) {
				seqOf = new ArrayList<NRFreqInfo>();
			}
			return seqOf;
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
			for (int i = (seqOf.size() - 1); i >= 0; i--) {
				codeLength += seqOf.get(i).encode(reverseOS, true);
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
			if (withTag) {
				codeLength += tag.decodeAndCheck(is);
			}

			BerLength length = new BerLength();
			codeLength += length.decode(is);
			int totalLength = length.val;

			while (subCodeLength < totalLength) {
				NRFreqInfo element = new NRFreqInfo();
				subCodeLength += element.decode(is, true);
				seqOf.add(element);
			}
			if (subCodeLength != totalLength) {
				throw new IOException("Decoded SequenceOf or SetOf has wrong length. Expected " + totalLength + " but has " + subCodeLength);

			}
			codeLength += subCodeLength;

			return codeLength;
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

			sb.append("{\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			if (seqOf == null) {
				sb.append("null");
			}
			else {
				Iterator<NRFreqInfo> it = seqOf.iterator();
				if (it.hasNext()) {
					it.next().appendAsString(sb, indentLevel + 1);
					while (it.hasNext()) {
						sb.append(",\n");
						for (int i = 0; i < indentLevel + 1; i++) {
							sb.append("\t");
						}
						it.next().appendAsString(sb, indentLevel + 1);
					}
				}
			}

			sb.append("\n");
			for (int i = 0; i < indentLevel; i++) {
				sb.append("\t");
			}
			sb.append("}");
		}

	}

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private MeasuredFrequenciesMN measuredFrequenciesMN = null;
	private SetupRelease measGapConfig = null;
	private BerEnum gapPurpose = null;
	
	public MeasConfigMN() {
	}

	public MeasConfigMN(byte[] code) {
		this.code = code;
	}

	public void setMeasuredFrequenciesMN(MeasuredFrequenciesMN measuredFrequenciesMN) {
		this.measuredFrequenciesMN = measuredFrequenciesMN;
	}

	public MeasuredFrequenciesMN getMeasuredFrequenciesMN() {
		return measuredFrequenciesMN;
	}

	public void setMeasGapConfig(SetupRelease measGapConfig) {
		this.measGapConfig = measGapConfig;
	}

	public SetupRelease getMeasGapConfig() {
		return measGapConfig;
	}

	public void setGapPurpose(BerEnum gapPurpose) {
		this.gapPurpose = gapPurpose;
	}

	public BerEnum getGapPurpose() {
		return gapPurpose;
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

		if (gapPurpose != null) {
			codeLength += gapPurpose.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
		}
		
		if (measGapConfig != null) {
			sublength = measGapConfig.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
			reverseOS.write(0xA1);
			codeLength += 1;
		}
		
		if (measuredFrequenciesMN != null) {
			codeLength += measuredFrequenciesMN.encode(reverseOS, false);
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
			measuredFrequenciesMN = new MeasuredFrequenciesMN();
			subCodeLength += measuredFrequenciesMN.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
			subCodeLength += length.decode(is);
			measGapConfig = new SetupRelease();
			subCodeLength += measGapConfig.decode(is, null);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			gapPurpose = new BerEnum();
			subCodeLength += gapPurpose.decode(is, false);
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
		if (measuredFrequenciesMN != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("measuredFrequenciesMN: ");
			measuredFrequenciesMN.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (measGapConfig != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("measGapConfig: ");
			measGapConfig.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (gapPurpose != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("gapPurpose: ").append(gapPurpose);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

