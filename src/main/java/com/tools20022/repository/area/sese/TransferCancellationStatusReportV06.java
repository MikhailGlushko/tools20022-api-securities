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

package com.tools20022.repository.area.sese;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesSettlementLatestVersion;
import com.tools20022.repository.choice.References61Choice;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The TransferCancellationStatusReport message is sent by an executing party,
 * for example, a transfer agent, to the instructing party, for example, an
 * investment manager or one of its authorised representatives to provide the
 * status of a previously received transfer cancellation instruction.<br>
 * <b>Usage</b><br>
 * The TransferCancellationStatusReport message is used to report on the status
 * of a transfer in or transfer out cancellation request.<br>
 * The reference of the transfer instruction for which the cancellation status
 * is reported is identified in TransferReference. The message identification of
 * the transfer cancellation request message in which the transfer instruction
 * was conveyed may also be quoted in RelatedReference.<br>
 * The message identification of the transfer instruction request message in
 * which the transfer instruction was conveyed may also be quoted in
 * RelatedReference.<br>
 * One of the following statuses can be reported:<br>
 * - the transfer cancellation is accepted, or,<br>
 * - the transfer cancellation has been sent to the next party, or,<br>
 * - the transfer cancellation is complete and the reason for the status,<br>
 * - the transfer cancellation pending and the reason for the status,<br>
 * - the transfer cancellation is rejected and the reason for the status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06#mmMessageIdentification
 * TransferCancellationStatusReportV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06#mmCounterpartyReference
 * TransferCancellationStatusReportV06.mmCounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06#mmReference
 * TransferCancellationStatusReportV06.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06#mmStatusReport
 * TransferCancellationStatusReportV06.mmStatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06#mmMarketPracticeVersion
 * TransferCancellationStatusReportV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06#mmExtension
 * TransferCancellationStatusReportV06.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "TrfCxlStsRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementLatestVersion
 * SecuritiesSettlementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.010.001.06}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceRule#for_sese_TransferCancellationStatusReportV06
 * ConstraintOtherReferenceRule.for_sese_TransferCancellationStatusReportV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceRule#for_sese_TransferCancellationStatusReportV06
 * ConstraintRelatedReferenceRule.for_sese_TransferCancellationStatusReportV06}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransferCancellationStatusReportV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe TransferCancellationStatusReport message is sent by an executing party, for example, a transfer agent, to the instructing party, for example, an investment manager or one of its authorised representatives to provide the status of a previously received transfer cancellation instruction.\r\nUsage\r\nThe TransferCancellationStatusReport message is used to report on the status of a transfer in or transfer out cancellation request.\r\nThe reference of the transfer instruction for which the cancellation status is reported is identified in TransferReference. The message identification of the transfer cancellation request message in which the transfer instruction was conveyed may also be quoted in RelatedReference.\r\nThe message identification of the transfer instruction request message in which the transfer instruction was conveyed may also be quoted in RelatedReference.\r\nOne of the following statuses can be reported:\r\n- the transfer cancellation is accepted, or,\r\n- the transfer cancellation has been sent to the next party, or,\r\n- the transfer cancellation is complete and the reason for the status,\r\n- the transfer cancellation pending and the reason for the status,\r\n- the transfer cancellation is rejected and the reason for the status."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransferCancellationStatusReportV06", propOrder = {"messageIdentification", "counterpartyReference", "reference", "statusReport", "marketPracticeVersion", "extension"})
public class TransferCancellationStatusReportV06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected MessageIdentification1 messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference that uniquely identifies the message from a business application standpoint."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferCancellationStatusReportV06, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<TransferCancellationStatusReportV06, MessageIdentification1>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies the message from a business application standpoint.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(TransferCancellationStatusReportV06 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(TransferCancellationStatusReportV06 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "CtrPtyRef")
	protected AdditionalReference8 counterpartyReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8
	 * AdditionalReference8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transfer allocated by the counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferCancellationStatusReportV06, Optional<AdditionalReference8>> mmCounterpartyReference = new MMMessageBuildingBlock<TransferCancellationStatusReportV06, Optional<AdditionalReference8>>() {
		{
			xmlTag = "CtrPtyRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyReference";
			definition = "Unambiguous identification of the transfer allocated by the counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference8.mmObject();
		}

		@Override
		public Optional<AdditionalReference8> getValue(TransferCancellationStatusReportV06 obj) {
			return obj.getCounterpartyReference();
		}

		@Override
		public void setValue(TransferCancellationStatusReportV06 obj, Optional<AdditionalReference8> value) {
			obj.setCounterpartyReference(value.orElse(null));
		}
	};
	@XmlElement(name = "Ref")
	protected References61Choice reference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.References61Choice
	 * References61Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the message or communication that was previously received."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferCancellationStatusReportV06, Optional<References61Choice>> mmReference = new MMMessageBuildingBlock<TransferCancellationStatusReportV06, Optional<References61Choice>>() {
		{
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Reference to the message or communication that was previously received.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> References61Choice.mmObject();
		}

		@Override
		public Optional<References61Choice> getValue(TransferCancellationStatusReportV06 obj) {
			return obj.getReference();
		}

		@Override
		public void setValue(TransferCancellationStatusReportV06 obj, Optional<References61Choice> value) {
			obj.setReference(value.orElse(null));
		}
	};
	@XmlElement(name = "StsRpt", required = true)
	protected CancellationStatusAndReason4 statusReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CancellationStatusAndReason4
	 * CancellationStatusAndReason4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the transfer cancellation instruction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferCancellationStatusReportV06, CancellationStatusAndReason4> mmStatusReport = new MMMessageBuildingBlock<TransferCancellationStatusReportV06, CancellationStatusAndReason4>() {
		{
			xmlTag = "StsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReport";
			definition = "Status of the transfer cancellation instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CancellationStatusAndReason4.mmObject();
		}

		@Override
		public CancellationStatusAndReason4 getValue(TransferCancellationStatusReportV06 obj) {
			return obj.getStatusReport();
		}

		@Override
		public void setValue(TransferCancellationStatusReportV06 obj, CancellationStatusAndReason4 value) {
			obj.setStatusReport(value);
		}
	};
	@XmlElement(name = "MktPrctcVrsn")
	protected MarketPracticeVersion1 marketPracticeVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktPrctcVrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPracticeVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the market practice to which the message conforms."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferCancellationStatusReportV06, Optional<MarketPracticeVersion1>> mmMarketPracticeVersion = new MMMessageBuildingBlock<TransferCancellationStatusReportV06, Optional<MarketPracticeVersion1>>() {
		{
			xmlTag = "MktPrctcVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeVersion";
			definition = "Identifies the market practice to which the message conforms.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketPracticeVersion1.mmObject();
		}

		@Override
		public Optional<MarketPracticeVersion1> getValue(TransferCancellationStatusReportV06 obj) {
			return obj.getMarketPracticeVersion();
		}

		@Override
		public void setValue(TransferCancellationStatusReportV06 obj, Optional<MarketPracticeVersion1> value) {
			obj.setMarketPracticeVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension1> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<TransferCancellationStatusReportV06, List<Extension1>> mmExtension = new MMMessageBuildingBlock<TransferCancellationStatusReportV06, List<Extension1>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(TransferCancellationStatusReportV06 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(TransferCancellationStatusReportV06 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceRule.for_sese_TransferCancellationStatusReportV06,
						com.tools20022.repository.constraints.ConstraintRelatedReferenceRule.for_sese_TransferCancellationStatusReportV06);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransferCancellationStatusReportV06";
				definition = "Scope\r\nThe TransferCancellationStatusReport message is sent by an executing party, for example, a transfer agent, to the instructing party, for example, an investment manager or one of its authorised representatives to provide the status of a previously received transfer cancellation instruction.\r\nUsage\r\nThe TransferCancellationStatusReport message is used to report on the status of a transfer in or transfer out cancellation request.\r\nThe reference of the transfer instruction for which the cancellation status is reported is identified in TransferReference. The message identification of the transfer cancellation request message in which the transfer instruction was conveyed may also be quoted in RelatedReference.\r\nThe message identification of the transfer instruction request message in which the transfer instruction was conveyed may also be quoted in RelatedReference.\r\nOne of the following statuses can be reported:\r\n- the transfer cancellation is accepted, or,\r\n- the transfer cancellation has been sent to the next party, or,\r\n- the transfer cancellation is complete and the reason for the status,\r\n- the transfer cancellation pending and the reason for the status,\r\n- the transfer cancellation is rejected and the reason for the status.";
				rootElement = "Document";
				xmlTag = "TrfCxlStsRpt";
				businessArea_lazy = () -> SecuritiesSettlementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.TransferCancellationStatusReportV06.mmMessageIdentification,
						com.tools20022.repository.area.sese.TransferCancellationStatusReportV06.mmCounterpartyReference, com.tools20022.repository.area.sese.TransferCancellationStatusReportV06.mmReference,
						com.tools20022.repository.area.sese.TransferCancellationStatusReportV06.mmStatusReport, com.tools20022.repository.area.sese.TransferCancellationStatusReportV06.mmMarketPracticeVersion,
						com.tools20022.repository.area.sese.TransferCancellationStatusReportV06.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "010";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return TransferCancellationStatusReportV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public TransferCancellationStatusReportV06 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<AdditionalReference8> getCounterpartyReference() {
		return counterpartyReference == null ? Optional.empty() : Optional.of(counterpartyReference);
	}

	public TransferCancellationStatusReportV06 setCounterpartyReference(AdditionalReference8 counterpartyReference) {
		this.counterpartyReference = counterpartyReference;
		return this;
	}

	public Optional<References61Choice> getReference() {
		return reference == null ? Optional.empty() : Optional.of(reference);
	}

	public TransferCancellationStatusReportV06 setReference(References61Choice reference) {
		this.reference = reference;
		return this;
	}

	public CancellationStatusAndReason4 getStatusReport() {
		return statusReport;
	}

	public TransferCancellationStatusReportV06 setStatusReport(CancellationStatusAndReason4 statusReport) {
		this.statusReport = Objects.requireNonNull(statusReport);
		return this;
	}

	public Optional<MarketPracticeVersion1> getMarketPracticeVersion() {
		return marketPracticeVersion == null ? Optional.empty() : Optional.of(marketPracticeVersion);
	}

	public TransferCancellationStatusReportV06 setMarketPracticeVersion(MarketPracticeVersion1 marketPracticeVersion) {
		this.marketPracticeVersion = marketPracticeVersion;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public TransferCancellationStatusReportV06 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.010.001.06")
	static public class Document {
		@XmlElement(name = "TrfCxlStsRpt", required = true)
		public TransferCancellationStatusReportV06 messageBody;
	}
}