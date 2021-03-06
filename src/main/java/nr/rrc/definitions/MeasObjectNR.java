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


public class MeasObjectNR implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static class BlackCellsToAddModList implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
		public byte[] code = null;
		private List<PCIRangeElement> seqOf = null;

		public BlackCellsToAddModList() {
			seqOf = new ArrayList<PCIRangeElement>();
		}

		public BlackCellsToAddModList(byte[] code) {
			this.code = code;
		}

		public List<PCIRangeElement> getPCIRangeElement() {
			if (seqOf == null) {
				seqOf = new ArrayList<PCIRangeElement>();
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
				PCIRangeElement element = new PCIRangeElement();
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
				Iterator<PCIRangeElement> it = seqOf.iterator();
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

	public static class WhiteCellsToAddModList implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
		public byte[] code = null;
		private List<PCIRangeElement> seqOf = null;

		public WhiteCellsToAddModList() {
			seqOf = new ArrayList<PCIRangeElement>();
		}

		public WhiteCellsToAddModList(byte[] code) {
			this.code = code;
		}

		public List<PCIRangeElement> getPCIRangeElement() {
			if (seqOf == null) {
				seqOf = new ArrayList<PCIRangeElement>();
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
				PCIRangeElement element = new PCIRangeElement();
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
				Iterator<PCIRangeElement> it = seqOf.iterator();
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
	private ARFCNValueNR ssbFrequency = null;
	private SubcarrierSpacing ssbSubcarrierSpacing = null;
	private SSBMTC smtc1 = null;
	private SSBMTC2 smtc2 = null;
	private ARFCNValueNR refFreqCSIRS = null;
	private ReferenceSignalConfig referenceSignalConfig = null;
	private ThresholdNR absThreshSSBlocksConsolidation = null;
	private ThresholdNR absThreshCSIRSConsolidation = null;
	private BerInteger nrofSSBlocksToAverage = null;
	private BerInteger nrofCSIRSResourcesToAverage = null;
	private BerInteger quantityConfigIndex = null;
	private QOffsetRangeList offsetMO = null;
	private PCIList cellsToRemoveList = null;
	private CellsToAddModList cellsToAddModList = null;
	private PCIRangeIndexList blackCellsToRemoveList = null;
	private BlackCellsToAddModList blackCellsToAddModList = null;
	private PCIRangeIndexList whiteCellsToRemoveList = null;
	private WhiteCellsToAddModList whiteCellsToAddModList = null;
	
	public MeasObjectNR() {
	}

	public MeasObjectNR(byte[] code) {
		this.code = code;
	}

	public void setSsbFrequency(ARFCNValueNR ssbFrequency) {
		this.ssbFrequency = ssbFrequency;
	}

	public ARFCNValueNR getSsbFrequency() {
		return ssbFrequency;
	}

	public void setSsbSubcarrierSpacing(SubcarrierSpacing ssbSubcarrierSpacing) {
		this.ssbSubcarrierSpacing = ssbSubcarrierSpacing;
	}

	public SubcarrierSpacing getSsbSubcarrierSpacing() {
		return ssbSubcarrierSpacing;
	}

	public void setSmtc1(SSBMTC smtc1) {
		this.smtc1 = smtc1;
	}

	public SSBMTC getSmtc1() {
		return smtc1;
	}

	public void setSmtc2(SSBMTC2 smtc2) {
		this.smtc2 = smtc2;
	}

	public SSBMTC2 getSmtc2() {
		return smtc2;
	}

	public void setRefFreqCSIRS(ARFCNValueNR refFreqCSIRS) {
		this.refFreqCSIRS = refFreqCSIRS;
	}

	public ARFCNValueNR getRefFreqCSIRS() {
		return refFreqCSIRS;
	}

	public void setReferenceSignalConfig(ReferenceSignalConfig referenceSignalConfig) {
		this.referenceSignalConfig = referenceSignalConfig;
	}

	public ReferenceSignalConfig getReferenceSignalConfig() {
		return referenceSignalConfig;
	}

	public void setAbsThreshSSBlocksConsolidation(ThresholdNR absThreshSSBlocksConsolidation) {
		this.absThreshSSBlocksConsolidation = absThreshSSBlocksConsolidation;
	}

	public ThresholdNR getAbsThreshSSBlocksConsolidation() {
		return absThreshSSBlocksConsolidation;
	}

	public void setAbsThreshCSIRSConsolidation(ThresholdNR absThreshCSIRSConsolidation) {
		this.absThreshCSIRSConsolidation = absThreshCSIRSConsolidation;
	}

	public ThresholdNR getAbsThreshCSIRSConsolidation() {
		return absThreshCSIRSConsolidation;
	}

	public void setNrofSSBlocksToAverage(BerInteger nrofSSBlocksToAverage) {
		this.nrofSSBlocksToAverage = nrofSSBlocksToAverage;
	}

	public BerInteger getNrofSSBlocksToAverage() {
		return nrofSSBlocksToAverage;
	}

	public void setNrofCSIRSResourcesToAverage(BerInteger nrofCSIRSResourcesToAverage) {
		this.nrofCSIRSResourcesToAverage = nrofCSIRSResourcesToAverage;
	}

	public BerInteger getNrofCSIRSResourcesToAverage() {
		return nrofCSIRSResourcesToAverage;
	}

	public void setQuantityConfigIndex(BerInteger quantityConfigIndex) {
		this.quantityConfigIndex = quantityConfigIndex;
	}

	public BerInteger getQuantityConfigIndex() {
		return quantityConfigIndex;
	}

	public void setOffsetMO(QOffsetRangeList offsetMO) {
		this.offsetMO = offsetMO;
	}

	public QOffsetRangeList getOffsetMO() {
		return offsetMO;
	}

	public void setCellsToRemoveList(PCIList cellsToRemoveList) {
		this.cellsToRemoveList = cellsToRemoveList;
	}

	public PCIList getCellsToRemoveList() {
		return cellsToRemoveList;
	}

	public void setCellsToAddModList(CellsToAddModList cellsToAddModList) {
		this.cellsToAddModList = cellsToAddModList;
	}

	public CellsToAddModList getCellsToAddModList() {
		return cellsToAddModList;
	}

	public void setBlackCellsToRemoveList(PCIRangeIndexList blackCellsToRemoveList) {
		this.blackCellsToRemoveList = blackCellsToRemoveList;
	}

	public PCIRangeIndexList getBlackCellsToRemoveList() {
		return blackCellsToRemoveList;
	}

	public void setBlackCellsToAddModList(BlackCellsToAddModList blackCellsToAddModList) {
		this.blackCellsToAddModList = blackCellsToAddModList;
	}

	public BlackCellsToAddModList getBlackCellsToAddModList() {
		return blackCellsToAddModList;
	}

	public void setWhiteCellsToRemoveList(PCIRangeIndexList whiteCellsToRemoveList) {
		this.whiteCellsToRemoveList = whiteCellsToRemoveList;
	}

	public PCIRangeIndexList getWhiteCellsToRemoveList() {
		return whiteCellsToRemoveList;
	}

	public void setWhiteCellsToAddModList(WhiteCellsToAddModList whiteCellsToAddModList) {
		this.whiteCellsToAddModList = whiteCellsToAddModList;
	}

	public WhiteCellsToAddModList getWhiteCellsToAddModList() {
		return whiteCellsToAddModList;
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
		if (whiteCellsToAddModList != null) {
			codeLength += whiteCellsToAddModList.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 17
			reverseOS.write(0xB1);
			codeLength += 1;
		}
		
		if (whiteCellsToRemoveList != null) {
			codeLength += whiteCellsToRemoveList.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 16
			reverseOS.write(0xB0);
			codeLength += 1;
		}
		
		if (blackCellsToAddModList != null) {
			codeLength += blackCellsToAddModList.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 15
			reverseOS.write(0xAF);
			codeLength += 1;
		}
		
		if (blackCellsToRemoveList != null) {
			codeLength += blackCellsToRemoveList.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 14
			reverseOS.write(0xAE);
			codeLength += 1;
		}
		
		if (cellsToAddModList != null) {
			codeLength += cellsToAddModList.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 13
			reverseOS.write(0xAD);
			codeLength += 1;
		}
		
		if (cellsToRemoveList != null) {
			codeLength += cellsToRemoveList.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 12
			reverseOS.write(0xAC);
			codeLength += 1;
		}
		
		codeLength += offsetMO.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 11
		reverseOS.write(0xAB);
		codeLength += 1;
		
		codeLength += quantityConfigIndex.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 10
		reverseOS.write(0x8A);
		codeLength += 1;
		
		if (nrofCSIRSResourcesToAverage != null) {
			codeLength += nrofCSIRSResourcesToAverage.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 9
			reverseOS.write(0x89);
			codeLength += 1;
		}
		
		if (nrofSSBlocksToAverage != null) {
			codeLength += nrofSSBlocksToAverage.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 8
			reverseOS.write(0x88);
			codeLength += 1;
		}
		
		if (absThreshCSIRSConsolidation != null) {
			codeLength += absThreshCSIRSConsolidation.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 7
			reverseOS.write(0xA7);
			codeLength += 1;
		}
		
		if (absThreshSSBlocksConsolidation != null) {
			codeLength += absThreshSSBlocksConsolidation.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 6
			reverseOS.write(0xA6);
			codeLength += 1;
		}
		
		codeLength += referenceSignalConfig.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 5
		reverseOS.write(0xA5);
		codeLength += 1;
		
		if (refFreqCSIRS != null) {
			codeLength += refFreqCSIRS.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 4
			reverseOS.write(0x84);
			codeLength += 1;
		}
		
		if (smtc2 != null) {
			codeLength += smtc2.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 3
			reverseOS.write(0xA3);
			codeLength += 1;
		}
		
		if (smtc1 != null) {
			codeLength += smtc1.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 2
			reverseOS.write(0xA2);
			codeLength += 1;
		}
		
		if (ssbSubcarrierSpacing != null) {
			codeLength += ssbSubcarrierSpacing.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
		}
		
		if (ssbFrequency != null) {
			codeLength += ssbFrequency.encode(reverseOS, false);
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
			ssbFrequency = new ARFCNValueNR();
			subCodeLength += ssbFrequency.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			ssbSubcarrierSpacing = new SubcarrierSpacing();
			subCodeLength += ssbSubcarrierSpacing.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
			smtc1 = new SSBMTC();
			subCodeLength += smtc1.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 3)) {
			smtc2 = new SSBMTC2();
			subCodeLength += smtc2.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
			refFreqCSIRS = new ARFCNValueNR();
			subCodeLength += refFreqCSIRS.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 5)) {
			referenceSignalConfig = new ReferenceSignalConfig();
			subCodeLength += referenceSignalConfig.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 6)) {
			absThreshSSBlocksConsolidation = new ThresholdNR();
			subCodeLength += absThreshSSBlocksConsolidation.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 7)) {
			absThreshCSIRSConsolidation = new ThresholdNR();
			subCodeLength += absThreshCSIRSConsolidation.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 8)) {
			nrofSSBlocksToAverage = new BerInteger();
			subCodeLength += nrofSSBlocksToAverage.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 9)) {
			nrofCSIRSResourcesToAverage = new BerInteger();
			subCodeLength += nrofCSIRSResourcesToAverage.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 10)) {
			quantityConfigIndex = new BerInteger();
			subCodeLength += quantityConfigIndex.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 11)) {
			offsetMO = new QOffsetRangeList();
			subCodeLength += offsetMO.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 12)) {
			cellsToRemoveList = new PCIList();
			subCodeLength += cellsToRemoveList.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 13)) {
			cellsToAddModList = new CellsToAddModList();
			subCodeLength += cellsToAddModList.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 14)) {
			blackCellsToRemoveList = new PCIRangeIndexList();
			subCodeLength += blackCellsToRemoveList.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 15)) {
			blackCellsToAddModList = new BlackCellsToAddModList();
			subCodeLength += blackCellsToAddModList.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 16)) {
			whiteCellsToRemoveList = new PCIRangeIndexList();
			subCodeLength += whiteCellsToRemoveList.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 17)) {
			whiteCellsToAddModList = new WhiteCellsToAddModList();
			subCodeLength += whiteCellsToAddModList.decode(is, false);
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
		if (ssbFrequency != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("ssbFrequency: ").append(ssbFrequency);
			firstSelectedElement = false;
		}
		
		if (ssbSubcarrierSpacing != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("ssbSubcarrierSpacing: ").append(ssbSubcarrierSpacing);
			firstSelectedElement = false;
		}
		
		if (smtc1 != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("smtc1: ");
			smtc1.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (smtc2 != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("smtc2: ");
			smtc2.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (refFreqCSIRS != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("refFreqCSIRS: ").append(refFreqCSIRS);
			firstSelectedElement = false;
		}
		
		if (!firstSelectedElement) {
			sb.append(",\n");
		}
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (referenceSignalConfig != null) {
			sb.append("referenceSignalConfig: ");
			referenceSignalConfig.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("referenceSignalConfig: <empty-required-field>");
		}
		
		if (absThreshSSBlocksConsolidation != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("absThreshSSBlocksConsolidation: ");
			absThreshSSBlocksConsolidation.appendAsString(sb, indentLevel + 1);
		}
		
		if (absThreshCSIRSConsolidation != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("absThreshCSIRSConsolidation: ");
			absThreshCSIRSConsolidation.appendAsString(sb, indentLevel + 1);
		}
		
		if (nrofSSBlocksToAverage != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("nrofSSBlocksToAverage: ").append(nrofSSBlocksToAverage);
		}
		
		if (nrofCSIRSResourcesToAverage != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("nrofCSIRSResourcesToAverage: ").append(nrofCSIRSResourcesToAverage);
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (quantityConfigIndex != null) {
			sb.append("quantityConfigIndex: ").append(quantityConfigIndex);
		}
		else {
			sb.append("quantityConfigIndex: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (offsetMO != null) {
			sb.append("offsetMO: ");
			offsetMO.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("offsetMO: <empty-required-field>");
		}
		
		if (cellsToRemoveList != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("cellsToRemoveList: ");
			cellsToRemoveList.appendAsString(sb, indentLevel + 1);
		}
		
		if (cellsToAddModList != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("cellsToAddModList: ");
			cellsToAddModList.appendAsString(sb, indentLevel + 1);
		}
		
		if (blackCellsToRemoveList != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("blackCellsToRemoveList: ");
			blackCellsToRemoveList.appendAsString(sb, indentLevel + 1);
		}
		
		if (blackCellsToAddModList != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("blackCellsToAddModList: ");
			blackCellsToAddModList.appendAsString(sb, indentLevel + 1);
		}
		
		if (whiteCellsToRemoveList != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("whiteCellsToRemoveList: ");
			whiteCellsToRemoveList.appendAsString(sb, indentLevel + 1);
		}
		
		if (whiteCellsToAddModList != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("whiteCellsToAddModList: ");
			whiteCellsToAddModList.appendAsString(sb, indentLevel + 1);
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

