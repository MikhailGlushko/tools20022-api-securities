/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.area.seev;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesEventsLatestVersion;
import com.tools20022.repository.choice.InstructionProcessingStatus29Choice;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends the CorporateActionInstructionStatusAdvice message
 * to an account owner or its designated agent, to report status of a received
 * corporate action election instruction. <br>
 * This message is used to advise the status, or a change in status, of a
 * corporate action-related transaction previously instructed by, or executed on
 * behalf of, the account owner. This will include the acknowledgement/rejection
 * of a corporate action instruction.<br>
 * <b>Usage</b><br>
 * The message may also be used to:<br>
 * - re-send a message previously sent (the sub-function of the message is
 * Duplicate),<br>
 * - provide a third party with a copy of a message for information (the
 * sub-function of the message is Copy),<br>
 * - re-send to a third party a copy of a message for information (the
 * sub-function of the message is Copy Duplicate),<br>
 * using the relevant elements in the business application header (BAH).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV09#mmInstructionIdentification
 * CorporateActionInstructionStatusAdviceV09.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV09#mmOtherDocumentIdentification
 * CorporateActionInstructionStatusAdviceV09.mmOtherDocumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV09#mmCorporateActionGeneralInformation
 * CorporateActionInstructionStatusAdviceV09.mmCorporateActionGeneralInformation
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV09#mmInstructionProcessingStatus
 * CorporateActionInstructionStatusAdviceV09.mmInstructionProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV09#mmCorporateActionInstruction
 * CorporateActionInstructionStatusAdviceV09.mmCorporateActionInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV09#mmAdditionalInformation
 * CorporateActionInstructionStatusAdviceV09.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV09#mmSupplementaryData
 * CorporateActionInstructionStatusAdviceV09.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CorpActnInstrStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.034.001.09}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalInformationRule#for_seev_CorporateActionInstructionStatusAdviceV09
 * ConstraintAdditionalInformationRule.
 * for_seev_CorporateActionInstructionStatusAdviceV09}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionInstructionStatusAdviceV09"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends the CorporateActionInstructionStatusAdvice message to an account owner or its designated agent, to report status of a received corporate action election instruction.\r\r\nThis message is used to advise the status, or a change in status, of a corporate action-related transaction previously instructed by, or executed on behalf of, the account owner. This will include the acknowledgement/rejection of a corporate action instruction.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionInstructionStatusAdviceV09", propOrder = {"instructionIdentification", "otherDocumentIdentification", "corporateActionGeneralInformation", "instructionProcessingStatus", "corporateActionInstruction",
		"additionalInformation", "supplementaryData"})
public class CorporateActionInstructionStatusAdviceV09 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InstrId")
	protected DocumentIdentification9 instructionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification9
	 * DocumentIdentification9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a related instruction document."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionInstructionStatusAdviceV09, Optional<DocumentIdentification9>> mmInstructionIdentification = new MMMessageBuildingBlock<CorporateActionInstructionStatusAdviceV09, Optional<DocumentIdentification9>>() {
		{
			xmlTag = "InstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIdentification";
			definition = "Identification of a related instruction document.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification9.mmObject();
		}

		@Override
		public Optional<DocumentIdentification9> getValue(CorporateActionInstructionStatusAdviceV09 obj) {
			return obj.getInstructionIdentification();
		}

		@Override
		public void setValue(CorporateActionInstructionStatusAdviceV09 obj, Optional<DocumentIdentification9> value) {
			obj.setInstructionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrDocId")
	protected List<DocumentIdentification33> otherDocumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification33
	 * DocumentIdentification33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrDocId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDocumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of other documents as well as the document number."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionInstructionStatusAdviceV09, List<DocumentIdentification33>> mmOtherDocumentIdentification = new MMMessageBuildingBlock<CorporateActionInstructionStatusAdviceV09, List<DocumentIdentification33>>() {
		{
			xmlTag = "OthrDocId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentIdentification";
			definition = "Identification of other documents as well as the document number.";
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification33.mmObject();
		}

		@Override
		public List<DocumentIdentification33> getValue(CorporateActionInstructionStatusAdviceV09 obj) {
			return obj.getOtherDocumentIdentification();
		}

		@Override
		public void setValue(CorporateActionInstructionStatusAdviceV09 obj, List<DocumentIdentification33> value) {
			obj.setOtherDocumentIdentification(value);
		}
	};
	@XmlElement(name = "CorpActnGnlInf", required = true)
	protected CorporateActionGeneralInformation109 corporateActionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109
	 * CorporateActionGeneralInformation109}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnGnlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information about the corporate action event."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionInstructionStatusAdviceV09, CorporateActionGeneralInformation109> mmCorporateActionGeneralInformation = new MMMessageBuildingBlock<CorporateActionInstructionStatusAdviceV09, CorporateActionGeneralInformation109>() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionGeneralInformation109.mmObject();
		}

		@Override
		public CorporateActionGeneralInformation109 getValue(CorporateActionInstructionStatusAdviceV09 obj) {
			return obj.getCorporateActionGeneralInformation();
		}

		@Override
		public void setValue(CorporateActionInstructionStatusAdviceV09 obj, CorporateActionGeneralInformation109 value) {
			obj.setCorporateActionGeneralInformation(value);
		}
	};
	@XmlElement(name = "InstrPrcgSts", required = true)
	protected List<InstructionProcessingStatus29Choice> instructionProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus29Choice
	 * InstructionProcessingStatus29Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrPrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the processing status of the instruction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionInstructionStatusAdviceV09, List<InstructionProcessingStatus29Choice>> mmInstructionProcessingStatus = new MMMessageBuildingBlock<CorporateActionInstructionStatusAdviceV09, List<InstructionProcessingStatus29Choice>>() {
		{
			xmlTag = "InstrPrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionProcessingStatus";
			definition = "Provides information about the processing status of the instruction.";
			minOccurs = 1;
			complexType_lazy = () -> InstructionProcessingStatus29Choice.mmObject();
		}

		@Override
		public List<InstructionProcessingStatus29Choice> getValue(CorporateActionInstructionStatusAdviceV09 obj) {
			return obj.getInstructionProcessingStatus();
		}

		@Override
		public void setValue(CorporateActionInstructionStatusAdviceV09 obj, List<InstructionProcessingStatus29Choice> value) {
			obj.setInstructionProcessingStatus(value);
		}
	};
	@XmlElement(name = "CorpActnInstr")
	protected CorporateActionOption141 corporateActionInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption141
	 * CorporateActionOption141}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the corporate action instruction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionInstructionStatusAdviceV09, Optional<CorporateActionOption141>> mmCorporateActionInstruction = new MMMessageBuildingBlock<CorporateActionInstructionStatusAdviceV09, Optional<CorporateActionOption141>>() {
		{
			xmlTag = "CorpActnInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionInstruction";
			definition = "Information about the corporate action instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionOption141.mmObject();
		}

		@Override
		public Optional<CorporateActionOption141> getValue(CorporateActionInstructionStatusAdviceV09 obj) {
			return obj.getCorporateActionInstruction();
		}

		@Override
		public void setValue(CorporateActionInstructionStatusAdviceV09 obj, Optional<CorporateActionOption141> value) {
			obj.setCorporateActionInstruction(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CorporateActionNarrative10 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative10
	 * CorporateActionNarrative10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides additional information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionInstructionStatusAdviceV09, Optional<CorporateActionNarrative10>> mmAdditionalInformation = new MMMessageBuildingBlock<CorporateActionInstructionStatusAdviceV09, Optional<CorporateActionNarrative10>>() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionNarrative10.mmObject();
		}

		@Override
		public Optional<CorporateActionNarrative10> getValue(CorporateActionInstructionStatusAdviceV09 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(CorporateActionInstructionStatusAdviceV09 obj, Optional<CorporateActionNarrative10> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionInstructionStatusAdviceV09, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CorporateActionInstructionStatusAdviceV09, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CorporateActionInstructionStatusAdviceV09 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CorporateActionInstructionStatusAdviceV09 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalInformationRule.for_seev_CorporateActionInstructionStatusAdviceV09);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionInstructionStatusAdviceV09";
				definition = "Scope\r\nAn account servicer sends the CorporateActionInstructionStatusAdvice message to an account owner or its designated agent, to report status of a received corporate action election instruction.\r\r\nThis message is used to advise the status, or a change in status, of a corporate action-related transaction previously instructed by, or executed on behalf of, the account owner. This will include the acknowledgement/rejection of a corporate action instruction.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH).";
				rootElement = "Document";
				xmlTag = "CorpActnInstrStsAdvc";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV09.mmInstructionIdentification,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV09.mmOtherDocumentIdentification,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV09.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV09.mmInstructionProcessingStatus,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV09.mmCorporateActionInstruction, com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV09.mmAdditionalInformation,
						com.tools20022.repository.area.seev.CorporateActionInstructionStatusAdviceV09.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "034";
						version = "09";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionInstructionStatusAdviceV09.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DocumentIdentification9> getInstructionIdentification() {
		return instructionIdentification == null ? Optional.empty() : Optional.of(instructionIdentification);
	}

	public CorporateActionInstructionStatusAdviceV09 setInstructionIdentification(DocumentIdentification9 instructionIdentification) {
		this.instructionIdentification = instructionIdentification;
		return this;
	}

	public List<DocumentIdentification33> getOtherDocumentIdentification() {
		return otherDocumentIdentification == null ? otherDocumentIdentification = new ArrayList<>() : otherDocumentIdentification;
	}

	public CorporateActionInstructionStatusAdviceV09 setOtherDocumentIdentification(List<DocumentIdentification33> otherDocumentIdentification) {
		this.otherDocumentIdentification = Objects.requireNonNull(otherDocumentIdentification);
		return this;
	}

	public CorporateActionGeneralInformation109 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public CorporateActionInstructionStatusAdviceV09 setCorporateActionGeneralInformation(CorporateActionGeneralInformation109 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public List<InstructionProcessingStatus29Choice> getInstructionProcessingStatus() {
		return instructionProcessingStatus == null ? instructionProcessingStatus = new ArrayList<>() : instructionProcessingStatus;
	}

	public CorporateActionInstructionStatusAdviceV09 setInstructionProcessingStatus(List<InstructionProcessingStatus29Choice> instructionProcessingStatus) {
		this.instructionProcessingStatus = Objects.requireNonNull(instructionProcessingStatus);
		return this;
	}

	public Optional<CorporateActionOption141> getCorporateActionInstruction() {
		return corporateActionInstruction == null ? Optional.empty() : Optional.of(corporateActionInstruction);
	}

	public CorporateActionInstructionStatusAdviceV09 setCorporateActionInstruction(CorporateActionOption141 corporateActionInstruction) {
		this.corporateActionInstruction = corporateActionInstruction;
		return this;
	}

	public Optional<CorporateActionNarrative10> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public CorporateActionInstructionStatusAdviceV09 setAdditionalInformation(CorporateActionNarrative10 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CorporateActionInstructionStatusAdviceV09 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.034.001.09")
	static public class Document {
		@XmlElement(name = "CorpActnInstrStsAdvc", required = true)
		public CorporateActionInstructionStatusAdviceV09 messageBody;
	}
}