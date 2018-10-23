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


public class FeatureSetDownlinkPerCC implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private SubcarrierSpacing supportedSubcarrierSpacingDL = null;
	private SupportedBandwidth supportedBandwidthDL = null;
	private BerEnum channelBW90mhz = null;
	private MIMOLayersDL maxNumberMIMOLayersPDSCH = null;
	private ModulationOrder supportedModulationOrderDL = null;
	
	public FeatureSetDownlinkPerCC() {
	}

	public FeatureSetDownlinkPerCC(byte[] code) {
		this.code = code;
	}

	public void setSupportedSubcarrierSpacingDL(SubcarrierSpacing supportedSubcarrierSpacingDL) {
		this.supportedSubcarrierSpacingDL = supportedSubcarrierSpacingDL;
	}

	public SubcarrierSpacing getSupportedSubcarrierSpacingDL() {
		return supportedSubcarrierSpacingDL;
	}

	public void setSupportedBandwidthDL(SupportedBandwidth supportedBandwidthDL) {
		this.supportedBandwidthDL = supportedBandwidthDL;
	}

	public SupportedBandwidth getSupportedBandwidthDL() {
		return supportedBandwidthDL;
	}

	public void setChannelBW90mhz(BerEnum channelBW90mhz) {
		this.channelBW90mhz = channelBW90mhz;
	}

	public BerEnum getChannelBW90mhz() {
		return channelBW90mhz;
	}

	public void setMaxNumberMIMOLayersPDSCH(MIMOLayersDL maxNumberMIMOLayersPDSCH) {
		this.maxNumberMIMOLayersPDSCH = maxNumberMIMOLayersPDSCH;
	}

	public MIMOLayersDL getMaxNumberMIMOLayersPDSCH() {
		return maxNumberMIMOLayersPDSCH;
	}

	public void setSupportedModulationOrderDL(ModulationOrder supportedModulationOrderDL) {
		this.supportedModulationOrderDL = supportedModulationOrderDL;
	}

	public ModulationOrder getSupportedModulationOrderDL() {
		return supportedModulationOrderDL;
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

		if (supportedModulationOrderDL != null) {
			codeLength += supportedModulationOrderDL.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 4
			reverseOS.write(0x84);
			codeLength += 1;
		}
		
		if (maxNumberMIMOLayersPDSCH != null) {
			codeLength += maxNumberMIMOLayersPDSCH.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 3
			reverseOS.write(0x83);
			codeLength += 1;
		}
		
		if (channelBW90mhz != null) {
			codeLength += channelBW90mhz.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
		}
		
		sublength = supportedBandwidthDL.encode(reverseOS);
		codeLength += sublength;
		codeLength += BerLength.encodeLength(reverseOS, sublength);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
		reverseOS.write(0xA1);
		codeLength += 1;
		
		codeLength += supportedSubcarrierSpacingDL.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 0
		reverseOS.write(0x80);
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
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
			supportedSubcarrierSpacingDL = new SubcarrierSpacing();
			subCodeLength += supportedSubcarrierSpacingDL.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
			subCodeLength += length.decode(is);
			supportedBandwidthDL = new SupportedBandwidth();
			subCodeLength += supportedBandwidthDL.decode(is, null);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			channelBW90mhz = new BerEnum();
			subCodeLength += channelBW90mhz.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
			maxNumberMIMOLayersPDSCH = new MIMOLayersDL();
			subCodeLength += maxNumberMIMOLayersPDSCH.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
			supportedModulationOrderDL = new ModulationOrder();
			subCodeLength += supportedModulationOrderDL.decode(is, false);
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
		if (supportedSubcarrierSpacingDL != null) {
			sb.append("supportedSubcarrierSpacingDL: ").append(supportedSubcarrierSpacingDL);
		}
		else {
			sb.append("supportedSubcarrierSpacingDL: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (supportedBandwidthDL != null) {
			sb.append("supportedBandwidthDL: ");
			supportedBandwidthDL.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("supportedBandwidthDL: <empty-required-field>");
		}
		
		if (channelBW90mhz != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("channelBW90mhz: ").append(channelBW90mhz);
		}
		
		if (maxNumberMIMOLayersPDSCH != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("maxNumberMIMOLayersPDSCH: ").append(maxNumberMIMOLayersPDSCH);
		}
		
		if (supportedModulationOrderDL != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("supportedModulationOrderDL: ").append(supportedModulationOrderDL);
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}
