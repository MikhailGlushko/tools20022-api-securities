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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends a
 * SecuritiesSettlementTransactionAllegementNotification to an account owner to
 * advise the account owner that a counterparty has alleged an instruction
 * against the account owner's account at the account servicer and that the
 * account servicer could not find the corresponding instruction of the account
 * owner.<br>
 * The account servicer/owner relationship may be:<br>
 * - a central securities depository or another settlement market infrastructure
 * acting on behalf of their participants<br>
 * - an agent (sub-custodian) acting on behalf of their global custodian
 * customer, or<br>
 * - a custodian acting on behalf of an investment management institution or a
 * broker/dealer.<br>
 * <br>
 * <b>Usage</b><br>
 * The message may also be used to:<br>
 * - re-send a message previously sent,<br>
 * - provide a third party with a copy of a message for information,<br>
 * - re-send to a third party a copy of a message for information<br>
 * using the relevant elements in the Business Application Header.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07#mmTransactionIdentification
 * SecuritiesSettlementTransactionAllegementNotificationV07.
 * mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionAllegementNotificationV07.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07#mmMarketInfrastructureTransactionIdentification
 * SecuritiesSettlementTransactionAllegementNotificationV07.
 * mmMarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07#mmTradeDetails
 * SecuritiesSettlementTransactionAllegementNotificationV07.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionAllegementNotificationV07.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionAllegementNotificationV07.
 * mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionAllegementNotificationV07.
 * mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07#mmSecuritiesFinancingDetails
 * SecuritiesSettlementTransactionAllegementNotificationV07.
 * mmSecuritiesFinancingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07#mmSettlementParameters
 * SecuritiesSettlementTransactionAllegementNotificationV07.
 * mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionAllegementNotificationV07.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionAllegementNotificationV07.
 * mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07#mmCashParties
 * SecuritiesSettlementTransactionAllegementNotificationV07.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07#mmSettlementAmount
 * SecuritiesSettlementTransactionAllegementNotificationV07.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07#mmOtherAmounts
 * SecuritiesSettlementTransactionAllegementNotificationV07.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07#mmOtherBusinessParties
 * SecuritiesSettlementTransactionAllegementNotificationV07.
 * mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07#mmSupplementaryData
 * SecuritiesSettlementTransactionAllegementNotificationV07.mmSupplementaryData}
 * </li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesSttlmTxAllgmtNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementLatestVersion
 * SecuritiesSettlementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.028.001.07}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementAmountRule#for_sese_SecuritiesSettlementTransactionAllegementNotificationV07
 * ConstraintSettlementAmountRule.
 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingParty1Rule#for_sese_SecuritiesSettlementTransactionAllegementNotificationV07
 * ConstraintReceivingParty1Rule.
 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliveringParty1Rule#for_sese_SecuritiesSettlementTransactionAllegementNotificationV07
 * ConstraintDeliveringParty1Rule.
 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionAllegementNotificationV07
 * ConstraintSecuritiesMarketPracticeGroupGuideline.
 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule#for_sese_SecuritiesSettlementTransactionAllegementNotificationV07
 * ConstraintTwoLegTransactionOpeningClosing1Rule.
 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule#for_sese_SecuritiesSettlementTransactionAllegementNotificationV07
 * ConstraintTwoLegTransactionOpeningClosing2Rule.
 * for_sese_SecuritiesSettlementTransactionAllegementNotificationV07}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementTransactionAllegementNotificationV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends a SecuritiesSettlementTransactionAllegementNotification to an account owner to advise the account owner that a counterparty has alleged an instruction against the account owner's account at the account servicer and that the account servicer could not find the corresponding instruction of the account owner.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesSettlementTransactionAllegementNotificationV07", propOrder = {"transactionIdentification", "settlementTypeAndAdditionalParameters", "marketInfrastructureTransactionIdentification", "tradeDetails",
		"financialInstrumentIdentification", "financialInstrumentAttributes", "quantityAndAccountDetails", "securitiesFinancingDetails", "settlementParameters", "deliveringSettlementParties", "receivingSettlementParties", "cashParties",
		"settlementAmount", "otherAmounts", "otherBusinessParties", "supplementaryData"})
public class SecuritiesSettlementTransactionAllegementNotificationV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId", required = true)
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
	 * "Unambiguous identification of the transaction as know by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, Max35Text> mmTransactionIdentification = new MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, Max35Text>() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of the transaction as know by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj, Max35Text value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "SttlmTpAndAddtlParams", required = true)
	protected SettlementTypeAndAdditionalParameters12 settlementTypeAndAdditionalParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters12
	 * SettlementTypeAndAdditionalParameters12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTpAndAddtlParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTypeAndAdditionalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides settlement type and identification information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, SettlementTypeAndAdditionalParameters12> mmSettlementTypeAndAdditionalParameters = new MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, SettlementTypeAndAdditionalParameters12>() {
		{
			xmlTag = "SttlmTpAndAddtlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTypeAndAdditionalParameters";
			definition = "Provides settlement type and identification information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SettlementTypeAndAdditionalParameters12.mmObject();
		}

		@Override
		public SettlementTypeAndAdditionalParameters12 getValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj) {
			return obj.getSettlementTypeAndAdditionalParameters();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj, SettlementTypeAndAdditionalParameters12 value) {
			obj.setSettlementTypeAndAdditionalParameters(value);
		}
	};
	@XmlElement(name = "MktInfrstrctrTxId")
	protected Identification14 marketInfrastructureTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.Identification14
	 * Identification14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktInfrstrctrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketInfrastructureTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, Optional<Identification14>> mmMarketInfrastructureTransactionIdentification = new MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, Optional<Identification14>>() {
		{
			xmlTag = "MktInfrstrctrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketInfrastructureTransactionIdentification";
			definition = "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Identification14.mmObject();
		}

		@Override
		public Optional<Identification14> getValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj) {
			return obj.getMarketInfrastructureTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj, Optional<Identification14> value) {
			obj.setMarketInfrastructureTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TradDtls", required = true)
	protected SecuritiesTradeDetails80 tradeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails80
	 * SecuritiesTradeDetails80}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, SecuritiesTradeDetails80> mmTradeDetails = new MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, SecuritiesTradeDetails80>() {
		{
			xmlTag = "TradDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetails";
			definition = "Details of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesTradeDetails80.mmObject();
		}

		@Override
		public SecuritiesTradeDetails80 getValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj) {
			return obj.getTradeDetails();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj, SecuritiesTradeDetails80 value) {
			obj.setTradeDetails(value);
		}
	};
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification19 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, SecurityIdentification19> mmFinancialInstrumentIdentification = new MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, SecurityIdentification19>() {
		{
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instrument representing a sum of rights of the investor vis-a-vis the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification19.mmObject();
		}

		@Override
		public SecurityIdentification19 getValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj, SecurityIdentification19 value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
	protected FinancialInstrumentAttributes91 financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91
	 * FinancialInstrumentAttributes91}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Elements characterising a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, Optional<FinancialInstrumentAttributes91>> mmFinancialInstrumentAttributes = new MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, Optional<FinancialInstrumentAttributes91>>() {
		{
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Elements characterising a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentAttributes91.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentAttributes91> getValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj) {
			return obj.getFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj, Optional<FinancialInstrumentAttributes91> value) {
			obj.setFinancialInstrumentAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "QtyAndAcctDtls", required = true)
	protected QuantityAndAccount63 quantityAndAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount63
	 * QuantityAndAccount63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyAndAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityAndAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the account and quantity involved in the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, QuantityAndAccount63> mmQuantityAndAccountDetails = new MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, QuantityAndAccount63>() {
		{
			xmlTag = "QtyAndAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityAndAccountDetails";
			definition = "Details related to the account and quantity involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QuantityAndAccount63.mmObject();
		}

		@Override
		public QuantityAndAccount63 getValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj) {
			return obj.getQuantityAndAccountDetails();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj, QuantityAndAccount63 value) {
			obj.setQuantityAndAccountDetails(value);
		}
	};
	@XmlElement(name = "SctiesFincgDtls")
	protected SecuritiesFinancingTransactionDetails38 securitiesFinancingDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38
	 * SecuritiesFinancingTransactionDetails38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the closing of the securities financing transaction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, Optional<SecuritiesFinancingTransactionDetails38>> mmSecuritiesFinancingDetails = new MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, Optional<SecuritiesFinancingTransactionDetails38>>() {
		{
			xmlTag = "SctiesFincgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingDetails";
			definition = "Details of the closing of the securities financing transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesFinancingTransactionDetails38.mmObject();
		}

		@Override
		public Optional<SecuritiesFinancingTransactionDetails38> getValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj) {
			return obj.getSecuritiesFinancingDetails();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj, Optional<SecuritiesFinancingTransactionDetails38> value) {
			obj.setSecuritiesFinancingDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmParams", required = true)
	protected SettlementDetails141 settlementParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails141
	 * SettlementDetails141}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, SettlementDetails141> mmSettlementParameters = new MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, SettlementDetails141>() {
		{
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SettlementDetails141.mmObject();
		}

		@Override
		public SettlementDetails141 getValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj) {
			return obj.getSettlementParameters();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj, SettlementDetails141 value) {
			obj.setSettlementParameters(value);
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected SettlementParties62 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties62
	 * SettlementParties62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of delivering settlement parties."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, Optional<SettlementParties62>> mmDeliveringSettlementParties = new MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, Optional<SettlementParties62>>() {
		{
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties62.mmObject();
		}

		@Override
		public Optional<SettlementParties62> getValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj) {
			return obj.getDeliveringSettlementParties();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj, Optional<SettlementParties62> value) {
			obj.setDeliveringSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties62 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties62
	 * SettlementParties62}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of receiving settlement parties."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, Optional<SettlementParties62>> mmReceivingSettlementParties = new MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, Optional<SettlementParties62>>() {
		{
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties62.mmObject();
		}

		@Override
		public Optional<SettlementParties62> getValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj) {
			return obj.getReceivingSettlementParties();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj, Optional<SettlementParties62> value) {
			obj.setReceivingSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "CshPties")
	protected CashParties25 cashParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashParties25
	 * CashParties25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies cash parties in the framework of a corporate action event."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, Optional<CashParties25>> mmCashParties = new MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, Optional<CashParties25>>() {
		{
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Specifies cash parties in the framework of a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashParties25.mmObject();
		}

		@Override
		public Optional<CashParties25> getValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj) {
			return obj.getCashParties();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj, Optional<CashParties25> value) {
			obj.setCashParties(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmAmt")
	protected AmountAndDirection88 settlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection88
	 * AmountAndDirection88}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be paid or received in exchange for the securities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, Optional<AmountAndDirection88>> mmSettlementAmount = new MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, Optional<AmountAndDirection88>>() {
		{
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection88.mmObject();
		}

		@Override
		public Optional<AmountAndDirection88> getValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj) {
			return obj.getSettlementAmount();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj, Optional<AmountAndDirection88> value) {
			obj.setSettlementAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrAmts")
	protected OtherAmounts32 otherAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherAmounts32
	 * OtherAmounts32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other amounts than the settlement amount."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, Optional<OtherAmounts32>> mmOtherAmounts = new MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, Optional<OtherAmounts32>>() {
		{
			xmlTag = "OthrAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmounts";
			definition = "Other amounts than the settlement amount.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherAmounts32.mmObject();
		}

		@Override
		public Optional<OtherAmounts32> getValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj) {
			return obj.getOtherAmounts();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj, Optional<OtherAmounts32> value) {
			obj.setOtherAmounts(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrBizPties")
	protected OtherParties28 otherBusinessParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherParties28
	 * OtherParties28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrBizPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBusinessParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other business parties relevant to the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, Optional<OtherParties28>> mmOtherBusinessParties = new MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, Optional<OtherParties28>>() {
		{
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Other business parties relevant to the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherParties28.mmObject();
		}

		@Override
		public Optional<OtherParties28> getValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj) {
			return obj.getOtherBusinessParties();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj, Optional<OtherParties28> value) {
			obj.setOtherBusinessParties(value.orElse(null));
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
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<SecuritiesSettlementTransactionAllegementNotificationV07, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionAllegementNotificationV07 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementAmountRule.for_sese_SecuritiesSettlementTransactionAllegementNotificationV07,
						com.tools20022.repository.constraints.ConstraintReceivingParty1Rule.for_sese_SecuritiesSettlementTransactionAllegementNotificationV07,
						com.tools20022.repository.constraints.ConstraintDeliveringParty1Rule.for_sese_SecuritiesSettlementTransactionAllegementNotificationV07,
						com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionAllegementNotificationV07,
						com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing1Rule.for_sese_SecuritiesSettlementTransactionAllegementNotificationV07,
						com.tools20022.repository.constraints.ConstraintTwoLegTransactionOpeningClosing2Rule.for_sese_SecuritiesSettlementTransactionAllegementNotificationV07);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementTransactionAllegementNotificationV07";
				definition = "Scope\r\nAn account servicer sends a SecuritiesSettlementTransactionAllegementNotification to an account owner to advise the account owner that a counterparty has alleged an instruction against the account owner's account at the account servicer and that the account servicer could not find the corresponding instruction of the account owner.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header.";
				rootElement = "Document";
				xmlTag = "SctiesSttlmTxAllgmtNtfctn";
				businessArea_lazy = () -> SecuritiesSettlementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07.mmTransactionIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07.mmSettlementTypeAndAdditionalParameters,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07.mmMarketInfrastructureTransactionIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07.mmTradeDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07.mmFinancialInstrumentIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07.mmFinancialInstrumentAttributes,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07.mmQuantityAndAccountDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07.mmSecuritiesFinancingDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07.mmSettlementParameters,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07.mmDeliveringSettlementParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07.mmReceivingSettlementParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07.mmCashParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07.mmSettlementAmount,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07.mmOtherAmounts,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07.mmOtherBusinessParties,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotificationV07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "028";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementTransactionAllegementNotificationV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public SecuritiesSettlementTransactionAllegementNotificationV07 setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public SettlementTypeAndAdditionalParameters12 getSettlementTypeAndAdditionalParameters() {
		return settlementTypeAndAdditionalParameters;
	}

	public SecuritiesSettlementTransactionAllegementNotificationV07 setSettlementTypeAndAdditionalParameters(SettlementTypeAndAdditionalParameters12 settlementTypeAndAdditionalParameters) {
		this.settlementTypeAndAdditionalParameters = Objects.requireNonNull(settlementTypeAndAdditionalParameters);
		return this;
	}

	public Optional<Identification14> getMarketInfrastructureTransactionIdentification() {
		return marketInfrastructureTransactionIdentification == null ? Optional.empty() : Optional.of(marketInfrastructureTransactionIdentification);
	}

	public SecuritiesSettlementTransactionAllegementNotificationV07 setMarketInfrastructureTransactionIdentification(Identification14 marketInfrastructureTransactionIdentification) {
		this.marketInfrastructureTransactionIdentification = marketInfrastructureTransactionIdentification;
		return this;
	}

	public SecuritiesTradeDetails80 getTradeDetails() {
		return tradeDetails;
	}

	public SecuritiesSettlementTransactionAllegementNotificationV07 setTradeDetails(SecuritiesTradeDetails80 tradeDetails) {
		this.tradeDetails = Objects.requireNonNull(tradeDetails);
		return this;
	}

	public SecurityIdentification19 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public SecuritiesSettlementTransactionAllegementNotificationV07 setFinancialInstrumentIdentification(SecurityIdentification19 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<FinancialInstrumentAttributes91> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public SecuritiesSettlementTransactionAllegementNotificationV07 setFinancialInstrumentAttributes(FinancialInstrumentAttributes91 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public QuantityAndAccount63 getQuantityAndAccountDetails() {
		return quantityAndAccountDetails;
	}

	public SecuritiesSettlementTransactionAllegementNotificationV07 setQuantityAndAccountDetails(QuantityAndAccount63 quantityAndAccountDetails) {
		this.quantityAndAccountDetails = Objects.requireNonNull(quantityAndAccountDetails);
		return this;
	}

	public Optional<SecuritiesFinancingTransactionDetails38> getSecuritiesFinancingDetails() {
		return securitiesFinancingDetails == null ? Optional.empty() : Optional.of(securitiesFinancingDetails);
	}

	public SecuritiesSettlementTransactionAllegementNotificationV07 setSecuritiesFinancingDetails(SecuritiesFinancingTransactionDetails38 securitiesFinancingDetails) {
		this.securitiesFinancingDetails = securitiesFinancingDetails;
		return this;
	}

	public SettlementDetails141 getSettlementParameters() {
		return settlementParameters;
	}

	public SecuritiesSettlementTransactionAllegementNotificationV07 setSettlementParameters(SettlementDetails141 settlementParameters) {
		this.settlementParameters = Objects.requireNonNull(settlementParameters);
		return this;
	}

	public Optional<SettlementParties62> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public SecuritiesSettlementTransactionAllegementNotificationV07 setDeliveringSettlementParties(SettlementParties62 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}

	public Optional<SettlementParties62> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public SecuritiesSettlementTransactionAllegementNotificationV07 setReceivingSettlementParties(SettlementParties62 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public Optional<CashParties25> getCashParties() {
		return cashParties == null ? Optional.empty() : Optional.of(cashParties);
	}

	public SecuritiesSettlementTransactionAllegementNotificationV07 setCashParties(CashParties25 cashParties) {
		this.cashParties = cashParties;
		return this;
	}

	public Optional<AmountAndDirection88> getSettlementAmount() {
		return settlementAmount == null ? Optional.empty() : Optional.of(settlementAmount);
	}

	public SecuritiesSettlementTransactionAllegementNotificationV07 setSettlementAmount(AmountAndDirection88 settlementAmount) {
		this.settlementAmount = settlementAmount;
		return this;
	}

	public Optional<OtherAmounts32> getOtherAmounts() {
		return otherAmounts == null ? Optional.empty() : Optional.of(otherAmounts);
	}

	public SecuritiesSettlementTransactionAllegementNotificationV07 setOtherAmounts(OtherAmounts32 otherAmounts) {
		this.otherAmounts = otherAmounts;
		return this;
	}

	public Optional<OtherParties28> getOtherBusinessParties() {
		return otherBusinessParties == null ? Optional.empty() : Optional.of(otherBusinessParties);
	}

	public SecuritiesSettlementTransactionAllegementNotificationV07 setOtherBusinessParties(OtherParties28 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesSettlementTransactionAllegementNotificationV07 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.028.001.07")
	static public class Document {
		@XmlElement(name = "SctiesSttlmTxAllgmtNtfctn", required = true)
		public SecuritiesSettlementTransactionAllegementNotificationV07 messageBody;
	}
}