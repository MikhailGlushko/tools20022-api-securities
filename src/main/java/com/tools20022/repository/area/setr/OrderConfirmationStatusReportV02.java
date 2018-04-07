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

package com.tools20022.repository.area.setr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesTradeLatestVersion;
import com.tools20022.repository.choice.References61Choice;
import com.tools20022.repository.msg.Extension1;
import com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2;
import com.tools20022.repository.msg.MessageIdentification1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The OrderConfirmationStatusReport message is sent by an instructing party,
 * for example, an investment manager or its authorised representative, to the
 * executing party, for example, a transfer agent, to report the status of an
 * order confirmation or an order confirmation amendment.<br>
 * <b>Usage</b><br>
 * The OrderConfirmationStatusReport message is used to report on the status of
 * one or more individual:<br>
 * - subscription confirmations,<br>
 * - subscription confirmation amendments,<br>
 * - redemption confirmations,<br>
 * - redemption confirmation amendments,<br>
 * - switch order confirmations,<br>
 * - switch order confirmation amendments.<br>
 * One of the following statuses can be reported:<br>
 * - confirmation rejected, or,<br>
 * - amendment rejected, or,<br>
 * - sent to next party, or,<br>
 * - communication problem with next party, or,<br>
 * - confirmation accepted, or,<br>
 * - confirmation received.<br>
 * It is likely that the OrderConfirmationStatusReport is only sent by the order
 * instructing party to the order executing party to reject an order
 * confirmation or to reject an order confirmation amendment, although if an
 * intermediary party is used, the statuses sent to next party and communication
 * problem with next party are also likely be used. The statuses confirmation
 * accepted and confirmation received would only be used in the event the order
 * executing party sends a RequestForOrderConfirmationStatusReport message and
 * one of the other statuses does not apply.<br>
 * If the status being reported is either confirmation rejected or amendment
 * rejected, then a reason for the rejection must be given.<br>
 * The individual order confirmation or confirmation amendment for which the
 * status is given is identified with its order reference. The message
 * identification of the message in which the individual order confirmation or
 * confirmation amendment was conveyed may also be quoted in RelatedReference,
 * but this is not recommended.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02#mmMessageIdentification
 * OrderConfirmationStatusReportV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02#mmReference
 * OrderConfirmationStatusReportV02.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02#mmIndividualOrderConfirmationDetailsReport
 * OrderConfirmationStatusReportV02.mmIndividualOrderConfirmationDetailsReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02#mmExtension
 * OrderConfirmationStatusReportV02.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "OrdrConfStsRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradeLatestVersion
 * SecuritiesTradeLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.057.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageNameAndReferenceGuideline#for_setr_OrderConfirmationStatusReportV02
 * ConstraintMessageNameAndReferenceGuideline.
 * for_setr_OrderConfirmationStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline#for_setr_OrderConfirmationStatusReportV02
 * ConstraintOtherReferenceGuideline.for_setr_OrderConfirmationStatusReportV02}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderConfirmationStatusReportV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe OrderConfirmationStatusReport message is sent by an instructing party, for example, an investment manager or its authorised representative, to the executing party, for example, a transfer agent, to report the status of an order confirmation or an order confirmation amendment.\r\nUsage\r\nThe OrderConfirmationStatusReport message is used to report on the status of one or more individual:\r\n- subscription confirmations,\r\n- subscription confirmation amendments,\r\n- redemption confirmations,\r\n- redemption confirmation amendments,\r\n- switch order confirmations,\r\n- switch order confirmation amendments.\r\nOne of the following statuses can be reported:\r\n- confirmation rejected, or,\r\n- amendment rejected, or,\r\n- sent to next party, or,\r\n- communication problem with next party, or,\r\n- confirmation accepted, or,\r\n- confirmation received.\r\nIt is likely that the OrderConfirmationStatusReport is only sent by the order instructing party to the order executing party to reject an order confirmation or to reject an order confirmation amendment, although if an intermediary party is used, the statuses sent to next party and communication problem with next party are also likely be used. The statuses confirmation accepted and confirmation received would only be used in the event the order executing party sends a RequestForOrderConfirmationStatusReport message and one of the other statuses does not apply.\r\nIf the status being reported is either confirmation rejected or amendment rejected, then a reason for the rejection must be given.\r\nThe individual order confirmation or confirmation amendment for which the status is given is identified with its order reference. The message identification of the message in which the individual order confirmation or confirmation amendment was conveyed may also be quoted in RelatedReference, but this is not recommended."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OrderConfirmationStatusReportV02", propOrder = {"messageIdentification", "reference", "individualOrderConfirmationDetailsReport", "extension"})
public class OrderConfirmationStatusReportV02 {

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
	public static final MMMessageBuildingBlock<OrderConfirmationStatusReportV02, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<OrderConfirmationStatusReportV02, MessageIdentification1>() {
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
		public MessageIdentification1 getValue(OrderConfirmationStatusReportV02 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(OrderConfirmationStatusReportV02 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
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
	public static final MMMessageBuildingBlock<OrderConfirmationStatusReportV02, Optional<References61Choice>> mmReference = new MMMessageBuildingBlock<OrderConfirmationStatusReportV02, Optional<References61Choice>>() {
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
		public Optional<References61Choice> getValue(OrderConfirmationStatusReportV02 obj) {
			return obj.getReference();
		}

		@Override
		public void setValue(OrderConfirmationStatusReportV02 obj, Optional<References61Choice> value) {
			obj.setReference(value.orElse(null));
		}
	};
	@XmlElement(name = "IndvOrdrConfDtlsRpt", required = true)
	protected List<IndividualOrderConfirmationStatusAndReason2> individualOrderConfirmationDetailsReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2
	 * IndividualOrderConfirmationStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvOrdrConfDtlsRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualOrderConfirmationDetailsReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status report details of an individual order confirmation."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<OrderConfirmationStatusReportV02, List<IndividualOrderConfirmationStatusAndReason2>> mmIndividualOrderConfirmationDetailsReport = new MMMessageBuildingBlock<OrderConfirmationStatusReportV02, List<IndividualOrderConfirmationStatusAndReason2>>() {
		{
			xmlTag = "IndvOrdrConfDtlsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualOrderConfirmationDetailsReport";
			definition = "Status report details of an individual order confirmation.";
			minOccurs = 1;
			complexType_lazy = () -> IndividualOrderConfirmationStatusAndReason2.mmObject();
		}

		@Override
		public List<IndividualOrderConfirmationStatusAndReason2> getValue(OrderConfirmationStatusReportV02 obj) {
			return obj.getIndividualOrderConfirmationDetailsReport();
		}

		@Override
		public void setValue(OrderConfirmationStatusReportV02 obj, List<IndividualOrderConfirmationStatusAndReason2> value) {
			obj.setIndividualOrderConfirmationDetailsReport(value);
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
	public static final MMMessageBuildingBlock<OrderConfirmationStatusReportV02, List<Extension1>> mmExtension = new MMMessageBuildingBlock<OrderConfirmationStatusReportV02, List<Extension1>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(OrderConfirmationStatusReportV02 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(OrderConfirmationStatusReportV02 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageNameAndReferenceGuideline.for_setr_OrderConfirmationStatusReportV02,
						com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline.for_setr_OrderConfirmationStatusReportV02);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderConfirmationStatusReportV02";
				definition = "Scope\r\nThe OrderConfirmationStatusReport message is sent by an instructing party, for example, an investment manager or its authorised representative, to the executing party, for example, a transfer agent, to report the status of an order confirmation or an order confirmation amendment.\r\nUsage\r\nThe OrderConfirmationStatusReport message is used to report on the status of one or more individual:\r\n- subscription confirmations,\r\n- subscription confirmation amendments,\r\n- redemption confirmations,\r\n- redemption confirmation amendments,\r\n- switch order confirmations,\r\n- switch order confirmation amendments.\r\nOne of the following statuses can be reported:\r\n- confirmation rejected, or,\r\n- amendment rejected, or,\r\n- sent to next party, or,\r\n- communication problem with next party, or,\r\n- confirmation accepted, or,\r\n- confirmation received.\r\nIt is likely that the OrderConfirmationStatusReport is only sent by the order instructing party to the order executing party to reject an order confirmation or to reject an order confirmation amendment, although if an intermediary party is used, the statuses sent to next party and communication problem with next party are also likely be used. The statuses confirmation accepted and confirmation received would only be used in the event the order executing party sends a RequestForOrderConfirmationStatusReport message and one of the other statuses does not apply.\r\nIf the status being reported is either confirmation rejected or amendment rejected, then a reason for the rejection must be given.\r\nThe individual order confirmation or confirmation amendment for which the status is given is identified with its order reference. The message identification of the message in which the individual order confirmation or confirmation amendment was conveyed may also be quoted in RelatedReference, but this is not recommended.";
				rootElement = "Document";
				xmlTag = "OrdrConfStsRpt";
				businessArea_lazy = () -> SecuritiesTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02.mmMessageIdentification, com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02.mmReference,
						com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02.mmIndividualOrderConfirmationDetailsReport, com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "057";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return OrderConfirmationStatusReportV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public OrderConfirmationStatusReportV02 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<References61Choice> getReference() {
		return reference == null ? Optional.empty() : Optional.of(reference);
	}

	public OrderConfirmationStatusReportV02 setReference(References61Choice reference) {
		this.reference = reference;
		return this;
	}

	public List<IndividualOrderConfirmationStatusAndReason2> getIndividualOrderConfirmationDetailsReport() {
		return individualOrderConfirmationDetailsReport == null ? individualOrderConfirmationDetailsReport = new ArrayList<>() : individualOrderConfirmationDetailsReport;
	}

	public OrderConfirmationStatusReportV02 setIndividualOrderConfirmationDetailsReport(List<IndividualOrderConfirmationStatusAndReason2> individualOrderConfirmationDetailsReport) {
		this.individualOrderConfirmationDetailsReport = Objects.requireNonNull(individualOrderConfirmationDetailsReport);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public OrderConfirmationStatusReportV02 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.057.001.02")
	static public class Document {
		@XmlElement(name = "OrdrConfStsRpt", required = true)
		public OrderConfirmationStatusReportV02 messageBody;
	}
}