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
import com.tools20022.repository.choice.CounterpartyIdentification3Choice;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.codeset.NovationStatus1Code;
import com.tools20022.repository.codeset.OvernightIndexSwapType1Code;
import com.tools20022.repository.codeset.TransactionOperationType1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the details of each individual overnight index swap transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmReportedTransactionStatus
 * OvernightIndexSwapTransaction4.mmReportedTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmNovationStatus
 * OvernightIndexSwapTransaction4.mmNovationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmBranchIdentification
 * OvernightIndexSwapTransaction4.mmBranchIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmUniqueTransactionIdentifier
 * OvernightIndexSwapTransaction4.mmUniqueTransactionIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmProprietaryTransactionIdentification
 * OvernightIndexSwapTransaction4.mmProprietaryTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmRelatedProprietaryTransactionIdentification
 * OvernightIndexSwapTransaction4.mmRelatedProprietaryTransactionIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmCounterpartyProprietaryTransactionIdentification
 * OvernightIndexSwapTransaction4.
 * mmCounterpartyProprietaryTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmCounterpartyIdentification
 * OvernightIndexSwapTransaction4.mmCounterpartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmTradeDate
 * OvernightIndexSwapTransaction4.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmStartDate
 * OvernightIndexSwapTransaction4.mmStartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmMaturityDate
 * OvernightIndexSwapTransaction4.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmFixedInterestRate
 * OvernightIndexSwapTransaction4.mmFixedInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmTransactionType
 * OvernightIndexSwapTransaction4.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmTransactionNominalAmount
 * OvernightIndexSwapTransaction4.mmTransactionNominalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmSupplementaryData
 * OvernightIndexSwapTransaction4.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ForeignExchangeSwap
 * ForeignExchangeSwap}</li>
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
 * "OvernightIndexSwapTransaction4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details of each individual overnight index swap transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OvernightIndexSwapTransaction4", propOrder = {"reportedTransactionStatus", "novationStatus", "branchIdentification", "uniqueTransactionIdentifier", "proprietaryTransactionIdentification",
		"relatedProprietaryTransactionIdentification", "counterpartyProprietaryTransactionIdentification", "counterpartyIdentification", "tradeDate", "startDate", "maturityDate", "fixedInterestRate", "transactionType",
		"transactionNominalAmount", "supplementaryData"})
public class OvernightIndexSwapTransaction4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptdTxSts", required = true)
	protected TransactionOperationType1Code reportedTransactionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType1Code
	 * TransactionOperationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4
	 * OvernightIndexSwapTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptdTxSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedTransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the status of the reported transaction, that is details on whether the transaction is a new transaction, an amendment of a previously reported transaction, a cancellation of a previously reported transaction or a correction to a previously reported and rejected transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OvernightIndexSwapTransaction4, TransactionOperationType1Code> mmReportedTransactionStatus = new MMMessageAttribute<OvernightIndexSwapTransaction4, TransactionOperationType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmObject();
			isDerived = false;
			xmlTag = "RptdTxSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedTransactionStatus";
			definition = "Defines the status of the reported transaction, that is details on whether the transaction is a new transaction, an amendment of a previously reported transaction, a cancellation of a previously reported transaction or a correction to a previously reported and rejected transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionOperationType1Code.mmObject();
		}

		@Override
		public TransactionOperationType1Code getValue(OvernightIndexSwapTransaction4 obj) {
			return obj.getReportedTransactionStatus();
		}

		@Override
		public void setValue(OvernightIndexSwapTransaction4 obj, TransactionOperationType1Code value) {
			obj.setReportedTransactionStatus(value);
		}
	};
	@XmlElement(name = "NvtnSts")
	protected NovationStatus1Code novationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NovationStatus1Code
	 * NovationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Novation#mmNovationStatus
	 * Novation.mmNovationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4
	 * OvernightIndexSwapTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NvtnSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NovationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the novation status for the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OvernightIndexSwapTransaction4, Optional<NovationStatus1Code>> mmNovationStatus = new MMMessageAttribute<OvernightIndexSwapTransaction4, Optional<NovationStatus1Code>>() {
		{
			businessElementTrace_lazy = () -> Novation.mmNovationStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmObject();
			isDerived = false;
			xmlTag = "NvtnSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NovationStatus";
			definition = "Provides the novation status for the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NovationStatus1Code.mmObject();
		}

		@Override
		public Optional<NovationStatus1Code> getValue(OvernightIndexSwapTransaction4 obj) {
			return obj.getNovationStatus();
		}

		@Override
		public void setValue(OvernightIndexSwapTransaction4 obj, Optional<NovationStatus1Code> value) {
			obj.setNovationStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "BrnchId")
	protected LEIIdentifier branchIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmLEI
	 * PartyIdentificationInformation.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4
	 * OvernightIndexSwapTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrnchId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BranchIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous legal entity identification of the branch of the reporting agent in which the transaction has been booked.\r\n\r\nUsage: This field must only be provided if the transaction has been conducted and booked by a branch of the reporting agent and only if this branch has its own LEI that the reporting agent can clearly identify. \r\nWhere the transaction has been booked by the head office or the reporting agent cannot be identified by a unique branch-specific LEI, the reporting agent must provide the LEI of the head office."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OvernightIndexSwapTransaction4, Optional<LEIIdentifier>> mmBranchIdentification = new MMMessageAttribute<OvernightIndexSwapTransaction4, Optional<LEIIdentifier>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmLEI;
			componentContext_lazy = () -> com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmObject();
			isDerived = false;
			xmlTag = "BrnchId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BranchIdentification";
			definition = "Unique and unambiguous legal entity identification of the branch of the reporting agent in which the transaction has been booked.\r\n\r\nUsage: This field must only be provided if the transaction has been conducted and booked by a branch of the reporting agent and only if this branch has its own LEI that the reporting agent can clearly identify. \r\nWhere the transaction has been booked by the head office or the reporting agent cannot be identified by a unique branch-specific LEI, the reporting agent must provide the LEI of the head office.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}

		@Override
		public Optional<LEIIdentifier> getValue(OvernightIndexSwapTransaction4 obj) {
			return obj.getBranchIdentification();
		}

		@Override
		public void setValue(OvernightIndexSwapTransaction4 obj, Optional<LEIIdentifier> value) {
			obj.setBranchIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "UnqTxIdr")
	protected Max105Text uniqueTransactionIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmUniqueTradeIdentifier
	 * TradeIdentification.mmUniqueTradeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4
	 * OvernightIndexSwapTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnqTxIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniqueTransactionIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique transaction identifier will be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction during its lifetime."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OvernightIndexSwapTransaction4, Optional<Max105Text>> mmUniqueTransactionIdentifier = new MMMessageAttribute<OvernightIndexSwapTransaction4, Optional<Max105Text>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmUniqueTradeIdentifier;
			componentContext_lazy = () -> com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmObject();
			isDerived = false;
			xmlTag = "UnqTxIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniqueTransactionIdentifier";
			definition = "Unique transaction identifier will be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction during its lifetime.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}

		@Override
		public Optional<Max105Text> getValue(OvernightIndexSwapTransaction4 obj) {
			return obj.getUniqueTransactionIdentifier();
		}

		@Override
		public void setValue(OvernightIndexSwapTransaction4 obj, Optional<Max105Text> value) {
			obj.setUniqueTransactionIdentifier(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtryTxId", required = true)
	protected Max105Text proprietaryTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4
	 * OvernightIndexSwapTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Internal unique transaction identifier used by the reporting agent for each transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OvernightIndexSwapTransaction4, Max105Text> mmProprietaryTransactionIdentification = new MMMessageAttribute<OvernightIndexSwapTransaction4, Max105Text>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmObject();
			isDerived = false;
			xmlTag = "PrtryTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryTransactionIdentification";
			definition = "Internal unique transaction identifier used by the reporting agent for each transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max105Text.mmObject();
		}

		@Override
		public Max105Text getValue(OvernightIndexSwapTransaction4 obj) {
			return obj.getProprietaryTransactionIdentification();
		}

		@Override
		public void setValue(OvernightIndexSwapTransaction4 obj, Max105Text value) {
			obj.setProprietaryTransactionIdentification(value);
		}
	};
	@XmlElement(name = "RltdPrtryTxId")
	protected Max105Text relatedProprietaryTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4
	 * OvernightIndexSwapTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPrtryTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedProprietaryTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original proprietary transaction identifier used by the reporting agent to indicate the proprietary transaction identification of the transaction which is novated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OvernightIndexSwapTransaction4, Optional<Max105Text>> mmRelatedProprietaryTransactionIdentification = new MMMessageAttribute<OvernightIndexSwapTransaction4, Optional<Max105Text>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmObject();
			isDerived = false;
			xmlTag = "RltdPrtryTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedProprietaryTransactionIdentification";
			definition = "Original proprietary transaction identifier used by the reporting agent to indicate the proprietary transaction identification of the transaction which is novated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}

		@Override
		public Optional<Max105Text> getValue(OvernightIndexSwapTransaction4 obj) {
			return obj.getRelatedProprietaryTransactionIdentification();
		}

		@Override
		public void setValue(OvernightIndexSwapTransaction4 obj, Optional<Max105Text> value) {
			obj.setRelatedProprietaryTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrPtyPrtryTxId")
	protected Max105Text counterpartyProprietaryTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCounterpartyReference
	 * TradeIdentification.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4
	 * OvernightIndexSwapTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyPrtryTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyProprietaryTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Internal unique proprietary transaction identifier as assigned by the counterparty of the reporting agent for each transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OvernightIndexSwapTransaction4, Optional<Max105Text>> mmCounterpartyProprietaryTransactionIdentification = new MMMessageAttribute<OvernightIndexSwapTransaction4, Optional<Max105Text>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCounterpartyReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyPrtryTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyProprietaryTransactionIdentification";
			definition = "Internal unique proprietary transaction identifier as assigned by the counterparty of the reporting agent for each transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}

		@Override
		public Optional<Max105Text> getValue(OvernightIndexSwapTransaction4 obj) {
			return obj.getCounterpartyProprietaryTransactionIdentification();
		}

		@Override
		public void setValue(OvernightIndexSwapTransaction4 obj, Optional<Max105Text> value) {
			obj.setCounterpartyProprietaryTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrPtyId", required = true)
	protected CounterpartyIdentification3Choice counterpartyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification3Choice
	 * CounterpartyIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CounterpartyRisk#mmParty
	 * CounterpartyRisk.mmParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4
	 * OvernightIndexSwapTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the counterparty of the reporting agent for the reported transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OvernightIndexSwapTransaction4, CounterpartyIdentification3Choice> mmCounterpartyIdentification = new MMMessageAssociationEnd<OvernightIndexSwapTransaction4, CounterpartyIdentification3Choice>() {
		{
			businessElementTrace_lazy = () -> CounterpartyRisk.mmParty;
			componentContext_lazy = () -> com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyIdentification";
			definition = "Identification of the counterparty of the reporting agent for the reported transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CounterpartyIdentification3Choice.mmObject();
		}

		@Override
		public CounterpartyIdentification3Choice getValue(OvernightIndexSwapTransaction4 obj) {
			return obj.getCounterpartyIdentification();
		}

		@Override
		public void setValue(OvernightIndexSwapTransaction4 obj, CounterpartyIdentification3Choice value) {
			obj.setCounterpartyIdentification(value);
		}
	};
	@XmlElement(name = "TradDt", required = true)
	protected DateAndDateTimeChoice tradeDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4
	 * OvernightIndexSwapTransaction4}</li>
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
	 * definition} =
	 * "Date and time on which the parties entered into the reported transaction.\r\n\r\nUsage: when time is available, it must be reported.\r\n\r\nIt is to be reported with only the date when the time of the transaction is not available. \r\n\r\nThe reported time is the execution time when available or otherwise the time at which the transaction entered the trading system of the reporting agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OvernightIndexSwapTransaction4, DateAndDateTimeChoice> mmTradeDate = new MMMessageAssociationEnd<OvernightIndexSwapTransaction4, DateAndDateTimeChoice>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Date and time on which the parties entered into the reported transaction.\r\n\r\nUsage: when time is available, it must be reported.\r\n\r\nIt is to be reported with only the date when the time of the transaction is not available. \r\n\r\nThe reported time is the execution time when available or otherwise the time at which the transaction entered the trading system of the reporting agent.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(OvernightIndexSwapTransaction4 obj) {
			return obj.getTradeDate();
		}

		@Override
		public void setValue(OvernightIndexSwapTransaction4 obj, DateAndDateTimeChoice value) {
			obj.setTradeDate(value);
		}
	};
	@XmlElement(name = "StartDt", required = true)
	protected ISODate startDate;
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
	 * {@linkplain com.tools20022.repository.entity.Trade#mmStartDate
	 * Trade.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4
	 * OvernightIndexSwapTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StartDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Represents the date as of which the overnight rate of the floating leg is computed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OvernightIndexSwapTransaction4, ISODate> mmStartDate = new MMMessageAttribute<OvernightIndexSwapTransaction4, ISODate>() {
		{
			businessElementTrace_lazy = () -> Trade.mmStartDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmObject();
			isDerived = false;
			xmlTag = "StartDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartDate";
			definition = "Represents the date as of which the overnight rate of the floating leg is computed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(OvernightIndexSwapTransaction4 obj) {
			return obj.getStartDate();
		}

		@Override
		public void setValue(OvernightIndexSwapTransaction4 obj, ISODate value) {
			obj.setStartDate(value);
		}
	};
	@XmlElement(name = "MtrtyDt", required = true)
	protected ISODate maturityDate;
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
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4
	 * OvernightIndexSwapTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date of the term over which the compounded overnight rate is calculated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OvernightIndexSwapTransaction4, ISODate> mmMaturityDate = new MMMessageAttribute<OvernightIndexSwapTransaction4, ISODate>() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Last date of the term over which the compounded overnight rate is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(OvernightIndexSwapTransaction4 obj) {
			return obj.getMaturityDate();
		}

		@Override
		public void setValue(OvernightIndexSwapTransaction4 obj, ISODate value) {
			obj.setMaturityDate(value);
		}
	};
	@XmlElement(name = "FxdIntrstRate", required = true)
	protected PercentageRate fixedInterestRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4
	 * OvernightIndexSwapTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FxdIntrstRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixedInterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fixed rate used for the calculation of the overnight index swap pay out."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OvernightIndexSwapTransaction4, PercentageRate> mmFixedInterestRate = new MMMessageAttribute<OvernightIndexSwapTransaction4, PercentageRate>() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmObject();
			isDerived = false;
			xmlTag = "FxdIntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedInterestRate";
			definition = "Fixed rate used for the calculation of the overnight index swap pay out.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(OvernightIndexSwapTransaction4 obj) {
			return obj.getFixedInterestRate();
		}

		@Override
		public void setValue(OvernightIndexSwapTransaction4 obj, PercentageRate value) {
			obj.setFixedInterestRate(value);
		}
	};
	@XmlElement(name = "TxTp", required = true)
	protected OvernightIndexSwapType1Code transactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OvernightIndexSwapType1Code
	 * OvernightIndexSwapType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTransactionType
	 * SecuritiesTrade.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4
	 * OvernightIndexSwapTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines whether the fixed interest rate is paid or received by the reporting agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OvernightIndexSwapTransaction4, OvernightIndexSwapType1Code> mmTransactionType = new MMMessageAttribute<OvernightIndexSwapTransaction4, OvernightIndexSwapType1Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTransactionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmObject();
			isDerived = false;
			xmlTag = "TxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionType";
			definition = "Defines whether the fixed interest rate is paid or received by the reporting agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OvernightIndexSwapType1Code.mmObject();
		}

		@Override
		public OvernightIndexSwapType1Code getValue(OvernightIndexSwapTransaction4 obj) {
			return obj.getTransactionType();
		}

		@Override
		public void setValue(OvernightIndexSwapTransaction4 obj, OvernightIndexSwapType1Code value) {
			obj.setTransactionType(value);
		}
	};
	@XmlElement(name = "TxNmnlAmt", required = true)
	protected ActiveCurrencyAndAmount transactionNominalAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAmount
	 * PaymentObligation.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4
	 * OvernightIndexSwapTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxNmnlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionNominalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notional amount of the overnight index swap."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OvernightIndexSwapTransaction4, ActiveCurrencyAndAmount> mmTransactionNominalAmount = new MMMessageAttribute<OvernightIndexSwapTransaction4, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmObject();
			isDerived = false;
			xmlTag = "TxNmnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionNominalAmount";
			definition = "Notional amount of the overnight index swap.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(OvernightIndexSwapTransaction4 obj) {
			return obj.getTransactionNominalAmount();
		}

		@Override
		public void setValue(OvernightIndexSwapTransaction4 obj, ActiveCurrencyAndAmount value) {
			obj.setTransactionNominalAmount(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4
	 * OvernightIndexSwapTransaction4}</li>
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
	public static final MMMessageAssociationEnd<OvernightIndexSwapTransaction4, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<OvernightIndexSwapTransaction4, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(OvernightIndexSwapTransaction4 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(OvernightIndexSwapTransaction4 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmReportedTransactionStatus, com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmNovationStatus,
						com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmBranchIdentification, com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmUniqueTransactionIdentifier,
						com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmProprietaryTransactionIdentification, com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmRelatedProprietaryTransactionIdentification,
						com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmCounterpartyProprietaryTransactionIdentification, com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmCounterpartyIdentification,
						com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmTradeDate, com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmStartDate,
						com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmMaturityDate, com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmFixedInterestRate,
						com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmTransactionType, com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmTransactionNominalAmount,
						com.tools20022.repository.msg.OvernightIndexSwapTransaction4.mmSupplementaryData);
				trace_lazy = () -> ForeignExchangeSwap.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OvernightIndexSwapTransaction4";
				definition = "Provides the details of each individual overnight index swap transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionOperationType1Code getReportedTransactionStatus() {
		return reportedTransactionStatus;
	}

	public OvernightIndexSwapTransaction4 setReportedTransactionStatus(TransactionOperationType1Code reportedTransactionStatus) {
		this.reportedTransactionStatus = Objects.requireNonNull(reportedTransactionStatus);
		return this;
	}

	public Optional<NovationStatus1Code> getNovationStatus() {
		return novationStatus == null ? Optional.empty() : Optional.of(novationStatus);
	}

	public OvernightIndexSwapTransaction4 setNovationStatus(NovationStatus1Code novationStatus) {
		this.novationStatus = novationStatus;
		return this;
	}

	public Optional<LEIIdentifier> getBranchIdentification() {
		return branchIdentification == null ? Optional.empty() : Optional.of(branchIdentification);
	}

	public OvernightIndexSwapTransaction4 setBranchIdentification(LEIIdentifier branchIdentification) {
		this.branchIdentification = branchIdentification;
		return this;
	}

	public Optional<Max105Text> getUniqueTransactionIdentifier() {
		return uniqueTransactionIdentifier == null ? Optional.empty() : Optional.of(uniqueTransactionIdentifier);
	}

	public OvernightIndexSwapTransaction4 setUniqueTransactionIdentifier(Max105Text uniqueTransactionIdentifier) {
		this.uniqueTransactionIdentifier = uniqueTransactionIdentifier;
		return this;
	}

	public Max105Text getProprietaryTransactionIdentification() {
		return proprietaryTransactionIdentification;
	}

	public OvernightIndexSwapTransaction4 setProprietaryTransactionIdentification(Max105Text proprietaryTransactionIdentification) {
		this.proprietaryTransactionIdentification = Objects.requireNonNull(proprietaryTransactionIdentification);
		return this;
	}

	public Optional<Max105Text> getRelatedProprietaryTransactionIdentification() {
		return relatedProprietaryTransactionIdentification == null ? Optional.empty() : Optional.of(relatedProprietaryTransactionIdentification);
	}

	public OvernightIndexSwapTransaction4 setRelatedProprietaryTransactionIdentification(Max105Text relatedProprietaryTransactionIdentification) {
		this.relatedProprietaryTransactionIdentification = relatedProprietaryTransactionIdentification;
		return this;
	}

	public Optional<Max105Text> getCounterpartyProprietaryTransactionIdentification() {
		return counterpartyProprietaryTransactionIdentification == null ? Optional.empty() : Optional.of(counterpartyProprietaryTransactionIdentification);
	}

	public OvernightIndexSwapTransaction4 setCounterpartyProprietaryTransactionIdentification(Max105Text counterpartyProprietaryTransactionIdentification) {
		this.counterpartyProprietaryTransactionIdentification = counterpartyProprietaryTransactionIdentification;
		return this;
	}

	public CounterpartyIdentification3Choice getCounterpartyIdentification() {
		return counterpartyIdentification;
	}

	public OvernightIndexSwapTransaction4 setCounterpartyIdentification(CounterpartyIdentification3Choice counterpartyIdentification) {
		this.counterpartyIdentification = Objects.requireNonNull(counterpartyIdentification);
		return this;
	}

	public DateAndDateTimeChoice getTradeDate() {
		return tradeDate;
	}

	public OvernightIndexSwapTransaction4 setTradeDate(DateAndDateTimeChoice tradeDate) {
		this.tradeDate = Objects.requireNonNull(tradeDate);
		return this;
	}

	public ISODate getStartDate() {
		return startDate;
	}

	public OvernightIndexSwapTransaction4 setStartDate(ISODate startDate) {
		this.startDate = Objects.requireNonNull(startDate);
		return this;
	}

	public ISODate getMaturityDate() {
		return maturityDate;
	}

	public OvernightIndexSwapTransaction4 setMaturityDate(ISODate maturityDate) {
		this.maturityDate = Objects.requireNonNull(maturityDate);
		return this;
	}

	public PercentageRate getFixedInterestRate() {
		return fixedInterestRate;
	}

	public OvernightIndexSwapTransaction4 setFixedInterestRate(PercentageRate fixedInterestRate) {
		this.fixedInterestRate = Objects.requireNonNull(fixedInterestRate);
		return this;
	}

	public OvernightIndexSwapType1Code getTransactionType() {
		return transactionType;
	}

	public OvernightIndexSwapTransaction4 setTransactionType(OvernightIndexSwapType1Code transactionType) {
		this.transactionType = Objects.requireNonNull(transactionType);
		return this;
	}

	public ActiveCurrencyAndAmount getTransactionNominalAmount() {
		return transactionNominalAmount;
	}

	public OvernightIndexSwapTransaction4 setTransactionNominalAmount(ActiveCurrencyAndAmount transactionNominalAmount) {
		this.transactionNominalAmount = Objects.requireNonNull(transactionNominalAmount);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public OvernightIndexSwapTransaction4 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}