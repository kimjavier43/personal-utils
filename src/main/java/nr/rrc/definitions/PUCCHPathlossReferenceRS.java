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


public class PUCCHPathlossReferenceRS implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static class ReferenceSignal implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public byte[] code = null;
		private SSBIndex ssbIndex = null;
		private NZPCSIRSResourceId csiRSIndex = null;
		
		public ReferenceSignal() {
		}

		public ReferenceSignal(byte[] code) {
			this.code = code;
		}

		public void setSsbIndex(SSBIndex ssbIndex) {
			this.ssbIndex = ssbIndex;
		}

		public SSBIndex getSsbIndex() {
			return ssbIndex;
		}

		public void setCsiRSIndex(NZPCSIRSResourceId csiRSIndex) {
			this.csiRSIndex = csiRSIndex;
		}

		public NZPCSIRSResourceId getCsiRSIndex() {
			return csiRSIndex;
		}

		public int encode(OutputStream reverseOS) throws IOException {

			if (code != null) {
				for (int i = code.length - 1; i >= 0; i--) {
					reverseOS.write(code[i]);
				}
				return code.length;
			}

			int codeLength = 0;
			if (csiRSIndex != null) {
				codeLength += csiRSIndex.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 1
				reverseOS.write(0x81);
				codeLength += 1;
				return codeLength;
			}
			
			if (ssbIndex != null) {
				codeLength += ssbIndex.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 0
				reverseOS.write(0x80);
				codeLength += 1;
				return codeLength;
			}
			
			throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
		}

		public int decode(InputStream is) throws IOException {
			return decode(is, null);
		}

		public int decode(InputStream is, BerTag berTag) throws IOException {

			int codeLength = 0;
			BerTag passedTag = berTag;

			if (berTag == null) {
				berTag = new BerTag();
				codeLength += berTag.decode(is);
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
				ssbIndex = new SSBIndex();
				codeLength += ssbIndex.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
				csiRSIndex = new NZPCSIRSResourceId();
				codeLength += csiRSIndex.decode(is, false);
				return codeLength;
			}

			if (passedTag != null) {
				return 0;
			}

			throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
		}

		public void encodeAndSave(int encodingSizeGuess) throws IOException {
			ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
			encode(reverseOS);
			code = reverseOS.getArray();
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();
			appendAsString(sb, 0);
			return sb.toString();
		}

		public void appendAsString(StringBuilder sb, int indentLevel) {

			if (ssbIndex != null) {
				sb.append("ssbIndex: ").append(ssbIndex);
				return;
			}

			if (csiRSIndex != null) {
				sb.append("csiRSIndex: ").append(csiRSIndex);
				return;
			}

			sb.append("<none>");
		}

	}

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private PUCCHPathlossReferenceRSId pucchPathlossReferenceRSId = null;
	private ReferenceSignal referenceSignal = null;
	
	public PUCCHPathlossReferenceRS() {
	}

	public PUCCHPathlossReferenceRS(byte[] code) {
		this.code = code;
	}

	public void setPucchPathlossReferenceRSId(PUCCHPathlossReferenceRSId pucchPathlossReferenceRSId) {
		this.pucchPathlossReferenceRSId = pucchPathlossReferenceRSId;
	}

	public PUCCHPathlossReferenceRSId getPucchPathlossReferenceRSId() {
		return pucchPathlossReferenceRSId;
	}

	public void setReferenceSignal(ReferenceSignal referenceSignal) {
		this.referenceSignal = referenceSignal;
	}

	public ReferenceSignal getReferenceSignal() {
		return referenceSignal;
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

		sublength = referenceSignal.encode(reverseOS);
		codeLength += sublength;
		codeLength += BerLength.encodeLength(reverseOS, sublength);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
		reverseOS.write(0xA1);
		codeLength += 1;
		
		codeLength += pucchPathlossReferenceRSId.encode(reverseOS, false);
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
			pucchPathlossReferenceRSId = new PUCCHPathlossReferenceRSId();
			subCodeLength += pucchPathlossReferenceRSId.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
			subCodeLength += length.decode(is);
			referenceSignal = new ReferenceSignal();
			subCodeLength += referenceSignal.decode(is, null);
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
		if (pucchPathlossReferenceRSId != null) {
			sb.append("pucchPathlossReferenceRSId: ").append(pucchPathlossReferenceRSId);
		}
		else {
			sb.append("pucchPathlossReferenceRSId: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (referenceSignal != null) {
			sb.append("referenceSignal: ");
			referenceSignal.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("referenceSignal: <empty-required-field>");
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}
