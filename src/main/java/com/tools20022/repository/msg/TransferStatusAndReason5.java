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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.TransferInstructionStatusReportV06;
import com.tools20022.repository.choice.TransferStatus2Choice;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AdditionalReference7;
import com.tools20022.repository.msg.PartyIdentification113;
import com.tools20022.repository.msg.Unit8;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the status of a transfer instruction and its reason.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5#mmMasterReference
 * TransferStatusAndReason5.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5#mmTransferReference
 * TransferStatusAndReason5.mmTransferReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5#mmClientReference
 * TransferStatusAndReason5.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5#mmCancellationReference
 * TransferStatusAndReason5.mmCancellationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5#mmTransferStatus
 * TransferStatusAndReason5.mmTransferStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5#mmTradeDate
 * TransferStatusAndReason5.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5#mmSendOutDate
 * TransferStatusAndReason5.mmSendOutDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5#mmTotalUnitsNumber
 * TransferStatusAndReason5.mmTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5#mmAveragePrice
 * TransferStatusAndReason5.mmAveragePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5#mmUnitsDetails
 * TransferStatusAndReason5.mmUnitsDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5#mmStatusInitiator
 * TransferStatusAndReason5.mmStatusInitiator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
 * SecuritiesTradeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV06#mmStatusReport
 * TransferInstructionStatusReportV06.mmStatusReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransferStatusAndReason5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the status of a transfer instruction and its reason."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransferStatusAndReason5", propOrder = {"masterReference", "transferReference", "clientReference", "cancellationReference", "transferStatus", "tradeDate", "sendOutDate", "totalUnitsNumber", "averagePrice", "unitsDetails",
		"statusInitiator"})
public class TransferStatusAndReason5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MstrRef")
	protected Max35Text masterReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Order#mmMasterIdentification
	 * Order.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5
	 * TransferStatusAndReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a group of individual transfers as assigned by the instructing party. This identifier links the individual transfers together."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransferStatusAndReason5, Optional<Max35Text>> mmMasterReference = new MMMessageAttribute<TransferStatusAndReason5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason5.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual transfers as assigned by the instructing party. This identifier links the individual transfers together.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TransferStatusAndReason5 obj) {
			return obj.getMasterReference();
		}

		@Override
		public void setValue(TransferStatusAndReason5 obj, Optional<Max35Text> value) {
			obj.setMasterReference(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfRef", required = true)
	protected Max35Text transferReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmIdentification
	 * SecuritiesTransfer.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5
	 * TransferStatusAndReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the transfer, as assigned by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransferStatusAndReason5, Max35Text> mmTransferReference = new MMMessageAttribute<TransferStatusAndReason5, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason5.mmObject();
			isDerived = false;
			xmlTag = "TrfRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferReference";
			definition = "Unique and unambiguous identification of the transfer, as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TransferStatusAndReason5 obj) {
			return obj.getTransferReference();
		}

		@Override
		public void setValue(TransferStatusAndReason5 obj, Max35Text value) {
			obj.setTransferReference(value);
		}
	};
	@XmlElement(name = "ClntRef")
	protected AdditionalReference7 clientReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference7
	 * AdditionalReference7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmClientOrderIdentification
	 * SecuritiesOrder.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5
	 * TransferStatusAndReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous investor's identification of the transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransferStatusAndReason5, Optional<AdditionalReference7>> mmClientReference = new MMMessageAttribute<TransferStatusAndReason5, Optional<AdditionalReference7>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmClientOrderIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason5.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of the transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference7.mmObject();
		}

		@Override
		public Optional<AdditionalReference7> getValue(TransferStatusAndReason5 obj) {
			return obj.getClientReference();
		}

		@Override
		public void setValue(TransferStatusAndReason5 obj, Optional<AdditionalReference7> value) {
			obj.setClientReference(value.orElse(null));
		}
	};
	@XmlElement(name = "CxlRef")
	protected Max35Text cancellationReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5
	 * TransferStatusAndReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a transfer cancellation, as assigned by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransferStatusAndReason5, Optional<Max35Text>> mmCancellationReference = new MMMessageAttribute<TransferStatusAndReason5, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason5.mmObject();
			isDerived = false;
			xmlTag = "CxlRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReference";
			definition = "Unique and unambiguous identifier for a transfer cancellation, as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TransferStatusAndReason5 obj) {
			return obj.getCancellationReference();
		}

		@Override
		public void setValue(TransferStatusAndReason5 obj, Optional<Max35Text> value) {
			obj.setCancellationReference(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfSts", required = true)
	protected TransferStatus2Choice transferStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransferStatus2Choice
	 * TransferStatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmTransferStatus
	 * SecuritiesTradeStatus.mmTransferStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5
	 * TransferStatusAndReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the transfer instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatusAndReason5, TransferStatus2Choice> mmTransferStatus = new MMMessageAssociationEnd<TransferStatusAndReason5, TransferStatus2Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmTransferStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason5.mmObject();
			isDerived = false;
			xmlTag = "TrfSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferStatus";
			definition = "Status of the transfer instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransferStatus2Choice.mmObject();
		}

		@Override
		public TransferStatus2Choice getValue(TransferStatusAndReason5 obj) {
			return obj.getTransferStatus();
		}

		@Override
		public void setValue(TransferStatusAndReason5 obj, TransferStatus2Choice value) {
			obj.setTransferStatus(value);
		}
	};
	@XmlElement(name = "TradDt")
	protected ISODate tradeDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5
	 * TransferStatusAndReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the transfer was executed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransferStatusAndReason5, Optional<ISODate>> mmTradeDate = new MMMessageAttribute<TransferStatusAndReason5, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason5.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Date and time at which the transfer was executed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(TransferStatusAndReason5 obj) {
			return obj.getTradeDate();
		}

		@Override
		public void setValue(TransferStatusAndReason5 obj, Optional<ISODate> value) {
			obj.setTradeDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SndOutDt")
	protected ISODate sendOutDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5
	 * TransferStatusAndReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndOutDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SendOutDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the document, for example, the application form, was sent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransferStatusAndReason5, Optional<ISODate>> mmSendOutDate = new MMMessageAttribute<TransferStatusAndReason5, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason5.mmObject();
			isDerived = false;
			xmlTag = "SndOutDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendOutDate";
			definition = "Date on which the document, for example, the application form, was sent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(TransferStatusAndReason5 obj) {
			return obj.getSendOutDate();
		}

		@Override
		public void setValue(TransferStatusAndReason5 obj, Optional<ISODate> value) {
			obj.setSendOutDate(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlUnitsNb")
	protected DecimalNumber totalUnitsNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5
	 * TransferStatusAndReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlUnitsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of units to be transferred."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransferStatusAndReason5, Optional<DecimalNumber>> mmTotalUnitsNumber = new MMMessageAttribute<TransferStatusAndReason5, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason5.mmObject();
			isDerived = false;
			xmlTag = "TtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumber";
			definition = "Number of units to be transferred.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(TransferStatusAndReason5 obj) {
			return obj.getTotalUnitsNumber();
		}

		@Override
		public void setValue(TransferStatusAndReason5 obj, Optional<DecimalNumber> value) {
			obj.setTotalUnitsNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "AvrgPric")
	protected ActiveOrHistoricCurrencyAnd13DecimalAmount averagePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd13DecimalAmount
	 * ActiveOrHistoricCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
	 * AssetHolding.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5
	 * TransferStatusAndReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AveragePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Weighted average price of the units in the account. The AveragePrice may also be known as the average acquisition price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransferStatusAndReason5, Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount>> mmAveragePrice = new MMMessageAttribute<TransferStatusAndReason5, Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason5.mmObject();
			isDerived = false;
			xmlTag = "AvrgPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AveragePrice";
			definition = "Weighted average price of the units in the account. The AveragePrice may also be known as the average acquisition price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount> getValue(TransferStatusAndReason5 obj) {
			return obj.getAveragePrice();
		}

		@Override
		public void setValue(TransferStatusAndReason5 obj, Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount> value) {
			obj.setAveragePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "UnitsDtls")
	protected List<Unit8> unitsDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Unit8 Unit8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmUnit
	 * SecuritiesQuantity.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5
	 * TransferStatusAndReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitsDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Breakdown of units to be transferred."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatusAndReason5, List<Unit8>> mmUnitsDetails = new MMMessageAssociationEnd<TransferStatusAndReason5, List<Unit8>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmUnit;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason5.mmObject();
			isDerived = false;
			xmlTag = "UnitsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsDetails";
			definition = "Breakdown of units to be transferred.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Unit8.mmObject();
		}

		@Override
		public List<Unit8> getValue(TransferStatusAndReason5 obj) {
			return obj.getUnitsDetails();
		}

		@Override
		public void setValue(TransferStatusAndReason5 obj, List<Unit8> value) {
			obj.setUnitsDetails(value);
		}
	};
	@XmlElement(name = "StsInitr")
	protected PartyIdentification113 statusInitiator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification113
	 * PartyIdentification113}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransferStatusAndReason5
	 * TransferStatusAndReason5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsInitr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusInitiator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that initiates the status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransferStatusAndReason5, Optional<PartyIdentification113>> mmStatusInitiator = new MMMessageAssociationEnd<TransferStatusAndReason5, Optional<PartyIdentification113>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransferStatusAndReason5.mmObject();
			isDerived = false;
			xmlTag = "StsInitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusInitiator";
			definition = "Party that initiates the status.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification113.mmObject();
		}

		@Override
		public Optional<PartyIdentification113> getValue(TransferStatusAndReason5 obj) {
			return obj.getStatusInitiator();
		}

		@Override
		public void setValue(TransferStatusAndReason5 obj, Optional<PartyIdentification113> value) {
			obj.setStatusInitiator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransferStatusAndReason5.mmMasterReference, com.tools20022.repository.msg.TransferStatusAndReason5.mmTransferReference,
						com.tools20022.repository.msg.TransferStatusAndReason5.mmClientReference, com.tools20022.repository.msg.TransferStatusAndReason5.mmCancellationReference,
						com.tools20022.repository.msg.TransferStatusAndReason5.mmTransferStatus, com.tools20022.repository.msg.TransferStatusAndReason5.mmTradeDate, com.tools20022.repository.msg.TransferStatusAndReason5.mmSendOutDate,
						com.tools20022.repository.msg.TransferStatusAndReason5.mmTotalUnitsNumber, com.tools20022.repository.msg.TransferStatusAndReason5.mmAveragePrice,
						com.tools20022.repository.msg.TransferStatusAndReason5.mmUnitsDetails, com.tools20022.repository.msg.TransferStatusAndReason5.mmStatusInitiator);
				messageBuildingBlock_lazy = () -> Arrays.asList(TransferInstructionStatusReportV06.mmStatusReport);
				trace_lazy = () -> SecuritiesTradeStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransferStatusAndReason5";
				definition = "Information about the status of a transfer instruction and its reason.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public TransferStatusAndReason5 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public Max35Text getTransferReference() {
		return transferReference;
	}

	public TransferStatusAndReason5 setTransferReference(Max35Text transferReference) {
		this.transferReference = Objects.requireNonNull(transferReference);
		return this;
	}

	public Optional<AdditionalReference7> getClientReference() {
		return clientReference == null ? Optional.empty() : Optional.of(clientReference);
	}

	public TransferStatusAndReason5 setClientReference(AdditionalReference7 clientReference) {
		this.clientReference = clientReference;
		return this;
	}

	public Optional<Max35Text> getCancellationReference() {
		return cancellationReference == null ? Optional.empty() : Optional.of(cancellationReference);
	}

	public TransferStatusAndReason5 setCancellationReference(Max35Text cancellationReference) {
		this.cancellationReference = cancellationReference;
		return this;
	}

	public TransferStatus2Choice getTransferStatus() {
		return transferStatus;
	}

	public TransferStatusAndReason5 setTransferStatus(TransferStatus2Choice transferStatus) {
		this.transferStatus = Objects.requireNonNull(transferStatus);
		return this;
	}

	public Optional<ISODate> getTradeDate() {
		return tradeDate == null ? Optional.empty() : Optional.of(tradeDate);
	}

	public TransferStatusAndReason5 setTradeDate(ISODate tradeDate) {
		this.tradeDate = tradeDate;
		return this;
	}

	public Optional<ISODate> getSendOutDate() {
		return sendOutDate == null ? Optional.empty() : Optional.of(sendOutDate);
	}

	public TransferStatusAndReason5 setSendOutDate(ISODate sendOutDate) {
		this.sendOutDate = sendOutDate;
		return this;
	}

	public Optional<DecimalNumber> getTotalUnitsNumber() {
		return totalUnitsNumber == null ? Optional.empty() : Optional.of(totalUnitsNumber);
	}

	public TransferStatusAndReason5 setTotalUnitsNumber(DecimalNumber totalUnitsNumber) {
		this.totalUnitsNumber = totalUnitsNumber;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount> getAveragePrice() {
		return averagePrice == null ? Optional.empty() : Optional.of(averagePrice);
	}

	public TransferStatusAndReason5 setAveragePrice(ActiveOrHistoricCurrencyAnd13DecimalAmount averagePrice) {
		this.averagePrice = averagePrice;
		return this;
	}

	public List<Unit8> getUnitsDetails() {
		return unitsDetails == null ? unitsDetails = new ArrayList<>() : unitsDetails;
	}

	public TransferStatusAndReason5 setUnitsDetails(List<Unit8> unitsDetails) {
		this.unitsDetails = Objects.requireNonNull(unitsDetails);
		return this;
	}

	public Optional<PartyIdentification113> getStatusInitiator() {
		return statusInitiator == null ? Optional.empty() : Optional.of(statusInitiator);
	}

	public TransferStatusAndReason5 setStatusInitiator(PartyIdentification113 statusInitiator) {
		this.statusInitiator = statusInitiator;
		return this;
	}
}