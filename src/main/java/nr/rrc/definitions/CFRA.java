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


public class CFRA implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static class Occasions implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

		public byte[] code = null;
		private RACHConfigGeneric rachConfigGeneric = null;
		private BerEnum ssbPerRACHOccasion = null;
		
		public Occasions() {
		}

		public Occasions(byte[] code) {
			this.code = code;
		}

		public void setRachConfigGeneric(RACHConfigGeneric rachConfigGeneric) {
			this.rachConfigGeneric = rachConfigGeneric;
		}

		public RACHConfigGeneric getRachConfigGeneric() {
			return rachConfigGeneric;
		}

		public void setSsbPerRACHOccasion(BerEnum ssbPerRACHOccasion) {
			this.ssbPerRACHOccasion = ssbPerRACHOccasion;
		}

		public BerEnum getSsbPerRACHOccasion() {
			return ssbPerRACHOccasion;
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
			if (ssbPerRACHOccasion != null) {
				codeLength += ssbPerRACHOccasion.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 1
				reverseOS.write(0x81);
				codeLength += 1;
			}
			
			codeLength += rachConfigGeneric.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 0
			reverseOS.write(0xA0);
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
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
				rachConfigGeneric = new RACHConfigGeneric();
				subCodeLength += rachConfigGeneric.decode(is, false);
				if (subCodeLength == totalLength) {
					return codeLength;
				}
				subCodeLength += berTag.decode(is);
			}
			else {
				throw new IOException("Tag does not match the mandatory sequence element tag.");
			}
			
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
				ssbPerRACHOccasion = new BerEnum();
				subCodeLength += ssbPerRACHOccasion.decode(is, false);
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
			if (rachConfigGeneric != null) {
				sb.append("rachConfigGeneric: ");
				rachConfigGeneric.appendAsString(sb, indentLevel + 1);
			}
			else {
				sb.append("rachConfigGeneric: <empty-required-field>");
			}
			
			if (ssbPerRACHOccasion != null) {
				sb.append(",\n");
				for (int i = 0; i < indentLevel + 1; i++) {
					sb.append("\t");
				}
				sb.append("ssbPerRACHOccasion: ").append(ssbPerRACHOccasion);
			}
			
			sb.append("\n");
			for (int i = 0; i < indentLevel; i++) {
				sb.append("\t");
			}
			sb.append("}");
		}

	}

	public static class Resources implements BerType, Serializable {

		private static final long serialVersionUID = 1L;

		public byte[] code = null;
		public static class Ssb implements BerType, Serializable {

			private static final long serialVersionUID = 1L;

			public static class SsbResourceList implements BerType, Serializable {

				private static final long serialVersionUID = 1L;

				public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
				public byte[] code = null;
				private List<CFRASSBResource> seqOf = null;

				public SsbResourceList() {
					seqOf = new ArrayList<CFRASSBResource>();
				}

				public SsbResourceList(byte[] code) {
					this.code = code;
				}

				public List<CFRASSBResource> getCFRASSBResource() {
					if (seqOf == null) {
						seqOf = new ArrayList<CFRASSBResource>();
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
						CFRASSBResource element = new CFRASSBResource();
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
						Iterator<CFRASSBResource> it = seqOf.iterator();
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
			private SsbResourceList ssbResourceList = null;
			private BerInteger raSsbOccasionMaskIndex = null;
			
			public Ssb() {
			}

			public Ssb(byte[] code) {
				this.code = code;
			}

			public void setSsbResourceList(SsbResourceList ssbResourceList) {
				this.ssbResourceList = ssbResourceList;
			}

			public SsbResourceList getSsbResourceList() {
				return ssbResourceList;
			}

			public void setRaSsbOccasionMaskIndex(BerInteger raSsbOccasionMaskIndex) {
				this.raSsbOccasionMaskIndex = raSsbOccasionMaskIndex;
			}

			public BerInteger getRaSsbOccasionMaskIndex() {
				return raSsbOccasionMaskIndex;
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
				codeLength += raSsbOccasionMaskIndex.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 1
				reverseOS.write(0x81);
				codeLength += 1;
				
				codeLength += ssbResourceList.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, CONSTRUCTED, 0
				reverseOS.write(0xA0);
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
				if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
					ssbResourceList = new SsbResourceList();
					subCodeLength += ssbResourceList.decode(is, false);
					subCodeLength += berTag.decode(is);
				}
				else {
					throw new IOException("Tag does not match the mandatory sequence element tag.");
				}
				
				if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
					raSsbOccasionMaskIndex = new BerInteger();
					subCodeLength += raSsbOccasionMaskIndex.decode(is, false);
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
				if (ssbResourceList != null) {
					sb.append("ssbResourceList: ");
					ssbResourceList.appendAsString(sb, indentLevel + 1);
				}
				else {
					sb.append("ssbResourceList: <empty-required-field>");
				}
				
				sb.append(",\n");
				for (int i = 0; i < indentLevel + 1; i++) {
					sb.append("\t");
				}
				if (raSsbOccasionMaskIndex != null) {
					sb.append("raSsbOccasionMaskIndex: ").append(raSsbOccasionMaskIndex);
				}
				else {
					sb.append("raSsbOccasionMaskIndex: <empty-required-field>");
				}
				
				sb.append("\n");
				for (int i = 0; i < indentLevel; i++) {
					sb.append("\t");
				}
				sb.append("}");
			}

		}

		public static class Csirs implements BerType, Serializable {

			private static final long serialVersionUID = 1L;

			public static class CsirsResourceList implements BerType, Serializable {

				private static final long serialVersionUID = 1L;

				public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
				public byte[] code = null;
				private List<CFRACSIRSResource> seqOf = null;

				public CsirsResourceList() {
					seqOf = new ArrayList<CFRACSIRSResource>();
				}

				public CsirsResourceList(byte[] code) {
					this.code = code;
				}

				public List<CFRACSIRSResource> getCFRACSIRSResource() {
					if (seqOf == null) {
						seqOf = new ArrayList<CFRACSIRSResource>();
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
						CFRACSIRSResource element = new CFRACSIRSResource();
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
						Iterator<CFRACSIRSResource> it = seqOf.iterator();
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
			private CsirsResourceList csirsResourceList = null;
			private RSRPRange rsrpThresholdCSIRS = null;
			
			public Csirs() {
			}

			public Csirs(byte[] code) {
				this.code = code;
			}

			public void setCsirsResourceList(CsirsResourceList csirsResourceList) {
				this.csirsResourceList = csirsResourceList;
			}

			public CsirsResourceList getCsirsResourceList() {
				return csirsResourceList;
			}

			public void setRsrpThresholdCSIRS(RSRPRange rsrpThresholdCSIRS) {
				this.rsrpThresholdCSIRS = rsrpThresholdCSIRS;
			}

			public RSRPRange getRsrpThresholdCSIRS() {
				return rsrpThresholdCSIRS;
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
				codeLength += rsrpThresholdCSIRS.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 1
				reverseOS.write(0x81);
				codeLength += 1;
				
				codeLength += csirsResourceList.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, CONSTRUCTED, 0
				reverseOS.write(0xA0);
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
				if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
					csirsResourceList = new CsirsResourceList();
					subCodeLength += csirsResourceList.decode(is, false);
					subCodeLength += berTag.decode(is);
				}
				else {
					throw new IOException("Tag does not match the mandatory sequence element tag.");
				}
				
				if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
					rsrpThresholdCSIRS = new RSRPRange();
					subCodeLength += rsrpThresholdCSIRS.decode(is, false);
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
				if (csirsResourceList != null) {
					sb.append("csirsResourceList: ");
					csirsResourceList.appendAsString(sb, indentLevel + 1);
				}
				else {
					sb.append("csirsResourceList: <empty-required-field>");
				}
				
				sb.append(",\n");
				for (int i = 0; i < indentLevel + 1; i++) {
					sb.append("\t");
				}
				if (rsrpThresholdCSIRS != null) {
					sb.append("rsrpThresholdCSIRS: ").append(rsrpThresholdCSIRS);
				}
				else {
					sb.append("rsrpThresholdCSIRS: <empty-required-field>");
				}
				
				sb.append("\n");
				for (int i = 0; i < indentLevel; i++) {
					sb.append("\t");
				}
				sb.append("}");
			}

		}

		private Ssb ssb = null;
		private Csirs csirs = null;
		
		public Resources() {
		}

		public Resources(byte[] code) {
			this.code = code;
		}

		public void setSsb(Ssb ssb) {
			this.ssb = ssb;
		}

		public Ssb getSsb() {
			return ssb;
		}

		public void setCsirs(Csirs csirs) {
			this.csirs = csirs;
		}

		public Csirs getCsirs() {
			return csirs;
		}

		public int encode(OutputStream reverseOS) throws IOException {

			if (code != null) {
				for (int i = code.length - 1; i >= 0; i--) {
					reverseOS.write(code[i]);
				}
				return code.length;
			}

			int codeLength = 0;
			if (csirs != null) {
				codeLength += csirs.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
				reverseOS.write(0xA1);
				codeLength += 1;
				return codeLength;
			}
			
			if (ssb != null) {
				codeLength += ssb.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, CONSTRUCTED, 0
				reverseOS.write(0xA0);
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

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
				ssb = new Ssb();
				codeLength += ssb.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
				csirs = new Csirs();
				codeLength += csirs.decode(is, false);
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

			if (ssb != null) {
				sb.append("ssb: ");
				ssb.appendAsString(sb, indentLevel + 1);
				return;
			}

			if (csirs != null) {
				sb.append("csirs: ");
				csirs.appendAsString(sb, indentLevel + 1);
				return;
			}

			sb.append("<none>");
		}

	}

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private Occasions occasions = null;
	private Resources resources = null;
	
	public CFRA() {
	}

	public CFRA(byte[] code) {
		this.code = code;
	}

	public void setOccasions(Occasions occasions) {
		this.occasions = occasions;
	}

	public Occasions getOccasions() {
		return occasions;
	}

	public void setResources(Resources resources) {
		this.resources = resources;
	}

	public Resources getResources() {
		return resources;
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

		sublength = resources.encode(reverseOS);
		codeLength += sublength;
		codeLength += BerLength.encodeLength(reverseOS, sublength);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
		reverseOS.write(0xA1);
		codeLength += 1;
		
		if (occasions != null) {
			codeLength += occasions.encode(reverseOS, false);
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

		subCodeLength += berTag.decode(is);
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
			occasions = new Occasions();
			subCodeLength += occasions.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
			subCodeLength += length.decode(is);
			resources = new Resources();
			subCodeLength += resources.decode(is, null);
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
		if (occasions != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("occasions: ");
			occasions.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (!firstSelectedElement) {
			sb.append(",\n");
		}
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (resources != null) {
			sb.append("resources: ");
			resources.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("resources: <empty-required-field>");
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

