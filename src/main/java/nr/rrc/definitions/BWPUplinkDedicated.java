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


public class BWPUplinkDedicated implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private SetupRelease pucchConfig = null;
	private SetupRelease puschConfig = null;
	private SetupRelease configuredGrantConfig = null;
	private SetupRelease srsConfig = null;
	private SetupRelease beamFailureRecoveryConfig = null;
	
	public BWPUplinkDedicated() {
	}

	public BWPUplinkDedicated(byte[] code) {
		this.code = code;
	}

	public void setPucchConfig(SetupRelease pucchConfig) {
		this.pucchConfig = pucchConfig;
	}

	public SetupRelease getPucchConfig() {
		return pucchConfig;
	}

	public void setPuschConfig(SetupRelease puschConfig) {
		this.puschConfig = puschConfig;
	}

	public SetupRelease getPuschConfig() {
		return puschConfig;
	}

	public void setConfiguredGrantConfig(SetupRelease configuredGrantConfig) {
		this.configuredGrantConfig = configuredGrantConfig;
	}

	public SetupRelease getConfiguredGrantConfig() {
		return configuredGrantConfig;
	}

	public void setSrsConfig(SetupRelease srsConfig) {
		this.srsConfig = srsConfig;
	}

	public SetupRelease getSrsConfig() {
		return srsConfig;
	}

	public void setBeamFailureRecoveryConfig(SetupRelease beamFailureRecoveryConfig) {
		this.beamFailureRecoveryConfig = beamFailureRecoveryConfig;
	}

	public SetupRelease getBeamFailureRecoveryConfig() {
		return beamFailureRecoveryConfig;
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

		if (beamFailureRecoveryConfig != null) {
			sublength = beamFailureRecoveryConfig.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 4
			reverseOS.write(0xA4);
			codeLength += 1;
		}
		
		if (srsConfig != null) {
			sublength = srsConfig.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 3
			reverseOS.write(0xA3);
			codeLength += 1;
		}
		
		if (configuredGrantConfig != null) {
			sublength = configuredGrantConfig.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 2
			reverseOS.write(0xA2);
			codeLength += 1;
		}
		
		if (puschConfig != null) {
			sublength = puschConfig.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
			reverseOS.write(0xA1);
			codeLength += 1;
		}
		
		if (pucchConfig != null) {
			sublength = pucchConfig.encode(reverseOS);
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
			pucchConfig = new SetupRelease();
			subCodeLength += pucchConfig.decode(is, null);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
			subCodeLength += length.decode(is);
			puschConfig = new SetupRelease();
			subCodeLength += puschConfig.decode(is, null);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
			subCodeLength += length.decode(is);
			configuredGrantConfig = new SetupRelease();
			subCodeLength += configuredGrantConfig.decode(is, null);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 3)) {
			subCodeLength += length.decode(is);
			srsConfig = new SetupRelease();
			subCodeLength += srsConfig.decode(is, null);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 4)) {
			subCodeLength += length.decode(is);
			beamFailureRecoveryConfig = new SetupRelease();
			subCodeLength += beamFailureRecoveryConfig.decode(is, null);
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
		if (pucchConfig != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("pucchConfig: ");
			pucchConfig.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (puschConfig != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("puschConfig: ");
			puschConfig.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (configuredGrantConfig != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("configuredGrantConfig: ");
			configuredGrantConfig.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (srsConfig != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("srsConfig: ");
			srsConfig.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (beamFailureRecoveryConfig != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("beamFailureRecoveryConfig: ");
			beamFailureRecoveryConfig.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

