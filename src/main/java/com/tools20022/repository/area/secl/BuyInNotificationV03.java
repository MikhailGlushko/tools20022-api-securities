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

package com.tools20022.repository.area.secl;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesClearingLatestVersion;
import com.tools20022.repository.choice.PartyIdentification35Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.BuyIn4;
import com.tools20022.repository.msg.SettlementObligation7;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The BuyInNotification message is sent by the central counterparty (CCP) to a
 * clearing member to notify the start of the buy in process.<br>
 * <br>
 * The message definition is intended for use with the ISO 20022 Business
 * Application Header.<br>
 * <br>
 * <b>Usage</b><br>
 * The buy in process is a process by which the CCP buys in stocks to cover
 * failed transactions; the clearing member is notified that this process has
 * started. Depending on each CCP internal rules, this message can also be sent,
 * as a warning, by the central counterparty to the clearing member some days
 * before the buy in process starts.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.BuyInNotificationV03#mmTransactionIdentification
 * BuyInNotificationV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.BuyInNotificationV03#mmClearingMember
 * BuyInNotificationV03.mmClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.BuyInNotificationV03#mmNotificationDetails
 * BuyInNotificationV03.mmNotificationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.BuyInNotificationV03#mmOriginalSettlementObligation
 * BuyInNotificationV03.mmOriginalSettlementObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.BuyInNotificationV03#mmSupplementaryData
 * BuyInNotificationV03.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "BuyInNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesClearingLatestVersion
 * SecuritiesClearingLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code secl.007.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionIdentificationPresenceRule#for_secl_BuyInNotificationV03
 * ConstraintTransactionIdentificationPresenceRule.for_secl_BuyInNotificationV03
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BuyInNotificationV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe BuyInNotification message is sent by the central counterparty (CCP) to a clearing member to notify the start of the buy in process.\r\n\r\nThe message definition is intended for use with the ISO 20022 Business Application Header.\r\n\r\nUsage\r\nThe buy in process is a process by which the CCP buys in stocks to cover failed transactions; the clearing member is notified that this process has started. Depending on each CCP internal rules, this message can also be sent, as a warning, by the central counterparty to the clearing member some days before the buy in process starts."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BuyInNotificationV03", propOrder = {"transactionIdentification", "clearingMember", "notificationDetails", "originalSettlementObligation", "supplementaryData"})
public class BuyInNotificationV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId")
	protected Max35Text transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as known by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BuyInNotificationV03, Optional<Max35Text>> mmTransactionIdentification = new MMMessageBuildingBlock<BuyInNotificationV03, Optional<Max35Text>>() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the instructing party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(BuyInNotificationV03 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(BuyInNotificationV03 obj, Optional<Max35Text> value) {
			obj.setTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrMmb", required = true)
	protected PartyIdentification35Choice clearingMember;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification35Choice
	 * PartyIdentification35Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrMmb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the identification of the clearing member (individual clearing member or general clearing member)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BuyInNotificationV03, PartyIdentification35Choice> mmClearingMember = new MMMessageBuildingBlock<BuyInNotificationV03, PartyIdentification35Choice>() {
		{
			xmlTag = "ClrMmb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingMember";
			definition = "Provides the identification of the clearing member (individual clearing member or general clearing member).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification35Choice.mmObject();
		}

		@Override
		public PartyIdentification35Choice getValue(BuyInNotificationV03 obj) {
			return obj.getClearingMember();
		}

		@Override
		public void setValue(BuyInNotificationV03 obj, PartyIdentification35Choice value) {
			obj.setClearingMember(value);
		}
	};
	@XmlElement(name = "NtfctnDtls")
	protected BuyIn4 notificationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.BuyIn4 BuyIn4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the message is a notification or a warning and gives the option to specify the buy in date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BuyInNotificationV03, Optional<BuyIn4>> mmNotificationDetails = new MMMessageBuildingBlock<BuyInNotificationV03, Optional<BuyIn4>>() {
		{
			xmlTag = "NtfctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationDetails";
			definition = "Indicates if the message is a notification or a warning and gives the option to specify the buy in date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BuyIn4.mmObject();
		}

		@Override
		public Optional<BuyIn4> getValue(BuyInNotificationV03 obj) {
			return obj.getNotificationDetails();
		}

		@Override
		public void setValue(BuyInNotificationV03 obj, Optional<BuyIn4> value) {
			obj.setNotificationDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlSttlmOblgtn", required = true)
	protected SettlementObligation7 originalSettlementObligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7
	 * SettlementObligation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlSttlmOblgtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalSettlementObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the original settlement obligation that did not settle and for which the buy in process will be launched."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<BuyInNotificationV03, SettlementObligation7> mmOriginalSettlementObligation = new MMMessageBuildingBlock<BuyInNotificationV03, SettlementObligation7>() {
		{
			xmlTag = "OrgnlSttlmOblgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalSettlementObligation";
			definition = "Provides details about the original settlement obligation that did not settle and for which the buy in process will be launched.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SettlementObligation7.mmObject();
		}

		@Override
		public SettlementObligation7 getValue(BuyInNotificationV03 obj) {
			return obj.getOriginalSettlementObligation();
		}

		@Override
		public void setValue(BuyInNotificationV03 obj, SettlementObligation7 value) {
			obj.setOriginalSettlementObligation(value);
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
	public static final MMMessageBuildingBlock<BuyInNotificationV03, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<BuyInNotificationV03, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(BuyInNotificationV03 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(BuyInNotificationV03 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTransactionIdentificationPresenceRule.for_secl_BuyInNotificationV03);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BuyInNotificationV03";
				definition = "Scope\r\nThe BuyInNotification message is sent by the central counterparty (CCP) to a clearing member to notify the start of the buy in process.\r\n\r\nThe message definition is intended for use with the ISO 20022 Business Application Header.\r\n\r\nUsage\r\nThe buy in process is a process by which the CCP buys in stocks to cover failed transactions; the clearing member is notified that this process has started. Depending on each CCP internal rules, this message can also be sent, as a warning, by the central counterparty to the clearing member some days before the buy in process starts.";
				rootElement = "Document";
				xmlTag = "BuyInNtfctn";
				businessArea_lazy = () -> SecuritiesClearingLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.secl.BuyInNotificationV03.mmTransactionIdentification, com.tools20022.repository.area.secl.BuyInNotificationV03.mmClearingMember,
						com.tools20022.repository.area.secl.BuyInNotificationV03.mmNotificationDetails, com.tools20022.repository.area.secl.BuyInNotificationV03.mmOriginalSettlementObligation,
						com.tools20022.repository.area.secl.BuyInNotificationV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "secl";
						messageFunctionality = "007";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return BuyInNotificationV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getTransactionIdentification() {
		return transactionIdentification == null ? Optional.empty() : Optional.of(transactionIdentification);
	}

	public BuyInNotificationV03 setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
		return this;
	}

	public PartyIdentification35Choice getClearingMember() {
		return clearingMember;
	}

	public BuyInNotificationV03 setClearingMember(PartyIdentification35Choice clearingMember) {
		this.clearingMember = Objects.requireNonNull(clearingMember);
		return this;
	}

	public Optional<BuyIn4> getNotificationDetails() {
		return notificationDetails == null ? Optional.empty() : Optional.of(notificationDetails);
	}

	public BuyInNotificationV03 setNotificationDetails(BuyIn4 notificationDetails) {
		this.notificationDetails = notificationDetails;
		return this;
	}

	public SettlementObligation7 getOriginalSettlementObligation() {
		return originalSettlementObligation;
	}

	public BuyInNotificationV03 setOriginalSettlementObligation(SettlementObligation7 originalSettlementObligation) {
		this.originalSettlementObligation = Objects.requireNonNull(originalSettlementObligation);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public BuyInNotificationV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:secl.007.001.03")
	static public class Document {
		@XmlElement(name = "BuyInNtfctn", required = true)
		public BuyInNotificationV03 messageBody;
	}
}