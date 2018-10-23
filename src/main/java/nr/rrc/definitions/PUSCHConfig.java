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


public class PUSCHConfig implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static class FrequencyHoppingOffsetLists implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
		public byte[] code = null;
		private List<BerInteger> seqOf = null;

		public FrequencyHoppingOffsetLists() {
			seqOf = new ArrayList<BerInteger>();
		}

		public FrequencyHoppingOffsetLists(byte[] code) {
			this.code = code;
		}

		public List<BerInteger> getBerInteger() {
			if (seqOf == null) {
				seqOf = new ArrayList<BerInteger>();
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
				BerInteger element = new BerInteger();
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
				Iterator<BerInteger> it = seqOf.iterator();
				if (it.hasNext()) {
					sb.append(it.next());
					while (it.hasNext()) {
						sb.append(",\n");
						for (int i = 0; i < indentLevel + 1; i++) {
							sb.append("\t");
						}
						sb.append(it.next());
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
	private BerInteger dataScramblingIdentityPUSCH = null;
	private BerEnum txConfig = null;
	private SetupRelease dmrsUplinkForPUSCHMappingTypeA = null;
	private SetupRelease dmrsUplinkForPUSCHMappingTypeB = null;
	private PUSCHPowerControl puschPowerControl = null;
	private BerEnum frequencyHopping = null;
	private FrequencyHoppingOffsetLists frequencyHoppingOffsetLists = null;
	private BerEnum resourceAllocation = null;
	private SetupRelease puschTimeDomainAllocationList = null;
	private BerEnum puschAggregationFactor = null;
	private BerEnum mcsTable = null;
	private BerEnum mcsTableTransformPrecoder = null;
	private BerEnum transformPrecoder = null;
	private BerEnum codebookSubset = null;
	private BerInteger maxRank = null;
	private BerEnum rbgSize = null;
	private SetupRelease uciOnPUSCH = null;
	private BerEnum tpPi2BPSK = null;
	
	public PUSCHConfig() {
	}

	public PUSCHConfig(byte[] code) {
		this.code = code;
	}

	public void setDataScramblingIdentityPUSCH(BerInteger dataScramblingIdentityPUSCH) {
		this.dataScramblingIdentityPUSCH = dataScramblingIdentityPUSCH;
	}

	public BerInteger getDataScramblingIdentityPUSCH() {
		return dataScramblingIdentityPUSCH;
	}

	public void setTxConfig(BerEnum txConfig) {
		this.txConfig = txConfig;
	}

	public BerEnum getTxConfig() {
		return txConfig;
	}

	public void setDmrsUplinkForPUSCHMappingTypeA(SetupRelease dmrsUplinkForPUSCHMappingTypeA) {
		this.dmrsUplinkForPUSCHMappingTypeA = dmrsUplinkForPUSCHMappingTypeA;
	}

	public SetupRelease getDmrsUplinkForPUSCHMappingTypeA() {
		return dmrsUplinkForPUSCHMappingTypeA;
	}

	public void setDmrsUplinkForPUSCHMappingTypeB(SetupRelease dmrsUplinkForPUSCHMappingTypeB) {
		this.dmrsUplinkForPUSCHMappingTypeB = dmrsUplinkForPUSCHMappingTypeB;
	}

	public SetupRelease getDmrsUplinkForPUSCHMappingTypeB() {
		return dmrsUplinkForPUSCHMappingTypeB;
	}

	public void setPuschPowerControl(PUSCHPowerControl puschPowerControl) {
		this.puschPowerControl = puschPowerControl;
	}

	public PUSCHPowerControl getPuschPowerControl() {
		return puschPowerControl;
	}

	public void setFrequencyHopping(BerEnum frequencyHopping) {
		this.frequencyHopping = frequencyHopping;
	}

	public BerEnum getFrequencyHopping() {
		return frequencyHopping;
	}

	public void setFrequencyHoppingOffsetLists(FrequencyHoppingOffsetLists frequencyHoppingOffsetLists) {
		this.frequencyHoppingOffsetLists = frequencyHoppingOffsetLists;
	}

	public FrequencyHoppingOffsetLists getFrequencyHoppingOffsetLists() {
		return frequencyHoppingOffsetLists;
	}

	public void setResourceAllocation(BerEnum resourceAllocation) {
		this.resourceAllocation = resourceAllocation;
	}

	public BerEnum getResourceAllocation() {
		return resourceAllocation;
	}

	public void setPuschTimeDomainAllocationList(SetupRelease puschTimeDomainAllocationList) {
		this.puschTimeDomainAllocationList = puschTimeDomainAllocationList;
	}

	public SetupRelease getPuschTimeDomainAllocationList() {
		return puschTimeDomainAllocationList;
	}

	public void setPuschAggregationFactor(BerEnum puschAggregationFactor) {
		this.puschAggregationFactor = puschAggregationFactor;
	}

	public BerEnum getPuschAggregationFactor() {
		return puschAggregationFactor;
	}

	public void setMcsTable(BerEnum mcsTable) {
		this.mcsTable = mcsTable;
	}

	public BerEnum getMcsTable() {
		return mcsTable;
	}

	public void setMcsTableTransformPrecoder(BerEnum mcsTableTransformPrecoder) {
		this.mcsTableTransformPrecoder = mcsTableTransformPrecoder;
	}

	public BerEnum getMcsTableTransformPrecoder() {
		return mcsTableTransformPrecoder;
	}

	public void setTransformPrecoder(BerEnum transformPrecoder) {
		this.transformPrecoder = transformPrecoder;
	}

	public BerEnum getTransformPrecoder() {
		return transformPrecoder;
	}

	public void setCodebookSubset(BerEnum codebookSubset) {
		this.codebookSubset = codebookSubset;
	}

	public BerEnum getCodebookSubset() {
		return codebookSubset;
	}

	public void setMaxRank(BerInteger maxRank) {
		this.maxRank = maxRank;
	}

	public BerInteger getMaxRank() {
		return maxRank;
	}

	public void setRbgSize(BerEnum rbgSize) {
		this.rbgSize = rbgSize;
	}

	public BerEnum getRbgSize() {
		return rbgSize;
	}

	public void setUciOnPUSCH(SetupRelease uciOnPUSCH) {
		this.uciOnPUSCH = uciOnPUSCH;
	}

	public SetupRelease getUciOnPUSCH() {
		return uciOnPUSCH;
	}

	public void setTpPi2BPSK(BerEnum tpPi2BPSK) {
		this.tpPi2BPSK = tpPi2BPSK;
	}

	public BerEnum getTpPi2BPSK() {
		return tpPi2BPSK;
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

		if (tpPi2BPSK != null) {
			codeLength += tpPi2BPSK.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 17
			reverseOS.write(0x91);
			codeLength += 1;
		}
		
		if (uciOnPUSCH != null) {
			sublength = uciOnPUSCH.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 16
			reverseOS.write(0xB0);
			codeLength += 1;
		}
		
		if (rbgSize != null) {
			codeLength += rbgSize.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 15
			reverseOS.write(0x8F);
			codeLength += 1;
		}
		
		if (maxRank != null) {
			codeLength += maxRank.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 14
			reverseOS.write(0x8E);
			codeLength += 1;
		}
		
		if (codebookSubset != null) {
			codeLength += codebookSubset.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 13
			reverseOS.write(0x8D);
			codeLength += 1;
		}
		
		if (transformPrecoder != null) {
			codeLength += transformPrecoder.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 12
			reverseOS.write(0x8C);
			codeLength += 1;
		}
		
		if (mcsTableTransformPrecoder != null) {
			codeLength += mcsTableTransformPrecoder.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 11
			reverseOS.write(0x8B);
			codeLength += 1;
		}
		
		if (mcsTable != null) {
			codeLength += mcsTable.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 10
			reverseOS.write(0x8A);
			codeLength += 1;
		}
		
		if (puschAggregationFactor != null) {
			codeLength += puschAggregationFactor.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 9
			reverseOS.write(0x89);
			codeLength += 1;
		}
		
		if (puschTimeDomainAllocationList != null) {
			sublength = puschTimeDomainAllocationList.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 8
			reverseOS.write(0xA8);
			codeLength += 1;
		}
		
		codeLength += resourceAllocation.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 7
		reverseOS.write(0x87);
		codeLength += 1;
		
		if (frequencyHoppingOffsetLists != null) {
			codeLength += frequencyHoppingOffsetLists.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 6
			reverseOS.write(0xA6);
			codeLength += 1;
		}
		
		if (frequencyHopping != null) {
			codeLength += frequencyHopping.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 5
			reverseOS.write(0x85);
			codeLength += 1;
		}
		
		if (puschPowerControl != null) {
			codeLength += puschPowerControl.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 4
			reverseOS.write(0xA4);
			codeLength += 1;
		}
		
		if (dmrsUplinkForPUSCHMappingTypeB != null) {
			sublength = dmrsUplinkForPUSCHMappingTypeB.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 3
			reverseOS.write(0xA3);
			codeLength += 1;
		}
		
		if (dmrsUplinkForPUSCHMappingTypeA != null) {
			sublength = dmrsUplinkForPUSCHMappingTypeA.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 2
			reverseOS.write(0xA2);
			codeLength += 1;
		}
		
		if (txConfig != null) {
			codeLength += txConfig.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
		}
		
		if (dataScramblingIdentityPUSCH != null) {
			codeLength += dataScramblingIdentityPUSCH.encode(reverseOS, false);
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
			dataScramblingIdentityPUSCH = new BerInteger();
			subCodeLength += dataScramblingIdentityPUSCH.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			txConfig = new BerEnum();
			subCodeLength += txConfig.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
			subCodeLength += length.decode(is);
			dmrsUplinkForPUSCHMappingTypeA = new SetupRelease();
			subCodeLength += dmrsUplinkForPUSCHMappingTypeA.decode(is, null);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 3)) {
			subCodeLength += length.decode(is);
			dmrsUplinkForPUSCHMappingTypeB = new SetupRelease();
			subCodeLength += dmrsUplinkForPUSCHMappingTypeB.decode(is, null);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 4)) {
			puschPowerControl = new PUSCHPowerControl();
			subCodeLength += puschPowerControl.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 5)) {
			frequencyHopping = new BerEnum();
			subCodeLength += frequencyHopping.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 6)) {
			frequencyHoppingOffsetLists = new FrequencyHoppingOffsetLists();
			subCodeLength += frequencyHoppingOffsetLists.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 7)) {
			resourceAllocation = new BerEnum();
			subCodeLength += resourceAllocation.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 8)) {
			subCodeLength += length.decode(is);
			puschTimeDomainAllocationList = new SetupRelease();
			subCodeLength += puschTimeDomainAllocationList.decode(is, null);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 9)) {
			puschAggregationFactor = new BerEnum();
			subCodeLength += puschAggregationFactor.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 10)) {
			mcsTable = new BerEnum();
			subCodeLength += mcsTable.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 11)) {
			mcsTableTransformPrecoder = new BerEnum();
			subCodeLength += mcsTableTransformPrecoder.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 12)) {
			transformPrecoder = new BerEnum();
			subCodeLength += transformPrecoder.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 13)) {
			codebookSubset = new BerEnum();
			subCodeLength += codebookSubset.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 14)) {
			maxRank = new BerInteger();
			subCodeLength += maxRank.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 15)) {
			rbgSize = new BerEnum();
			subCodeLength += rbgSize.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 16)) {
			subCodeLength += length.decode(is);
			uciOnPUSCH = new SetupRelease();
			subCodeLength += uciOnPUSCH.decode(is, null);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 17)) {
			tpPi2BPSK = new BerEnum();
			subCodeLength += tpPi2BPSK.decode(is, false);
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
		if (dataScramblingIdentityPUSCH != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("dataScramblingIdentityPUSCH: ").append(dataScramblingIdentityPUSCH);
			firstSelectedElement = false;
		}
		
		if (txConfig != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("txConfig: ").append(txConfig);
			firstSelectedElement = false;
		}
		
		if (dmrsUplinkForPUSCHMappingTypeA != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("dmrsUplinkForPUSCHMappingTypeA: ");
			dmrsUplinkForPUSCHMappingTypeA.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (dmrsUplinkForPUSCHMappingTypeB != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("dmrsUplinkForPUSCHMappingTypeB: ");
			dmrsUplinkForPUSCHMappingTypeB.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (puschPowerControl != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("puschPowerControl: ");
			puschPowerControl.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (frequencyHopping != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("frequencyHopping: ").append(frequencyHopping);
			firstSelectedElement = false;
		}
		
		if (frequencyHoppingOffsetLists != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("frequencyHoppingOffsetLists: ");
			frequencyHoppingOffsetLists.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (!firstSelectedElement) {
			sb.append(",\n");
		}
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (resourceAllocation != null) {
			sb.append("resourceAllocation: ").append(resourceAllocation);
		}
		else {
			sb.append("resourceAllocation: <empty-required-field>");
		}
		
		if (puschTimeDomainAllocationList != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("puschTimeDomainAllocationList: ");
			puschTimeDomainAllocationList.appendAsString(sb, indentLevel + 1);
		}
		
		if (puschAggregationFactor != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("puschAggregationFactor: ").append(puschAggregationFactor);
		}
		
		if (mcsTable != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("mcsTable: ").append(mcsTable);
		}
		
		if (mcsTableTransformPrecoder != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("mcsTableTransformPrecoder: ").append(mcsTableTransformPrecoder);
		}
		
		if (transformPrecoder != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("transformPrecoder: ").append(transformPrecoder);
		}
		
		if (codebookSubset != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("codebookSubset: ").append(codebookSubset);
		}
		
		if (maxRank != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("maxRank: ").append(maxRank);
		}
		
		if (rbgSize != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("rbgSize: ").append(rbgSize);
		}
		
		if (uciOnPUSCH != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("uciOnPUSCH: ");
			uciOnPUSCH.appendAsString(sb, indentLevel + 1);
		}
		
		if (tpPi2BPSK != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("tpPi2BPSK: ").append(tpPi2BPSK);
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

