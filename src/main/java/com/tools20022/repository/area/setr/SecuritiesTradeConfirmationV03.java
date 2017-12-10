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
import com.tools20022.repository.choice.NumberCount1Choice;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * SCOPE<br>
 * Sent by an executing party to an instructing party directly or through
 * Central Matching Utility (CMU) to provide trade confirmation on a per-account
 * basis based on instructions provided by the instructing party in the
 * SecuritiesAllocationInstruction message.<br>
 * <br>
 * It may also be used to provide trade confirmation on the trade level from an
 * executing party or an instructing party to the custodian or an affirming
 * party directly or through CMU.<br>
 * <br>
 * The instructing party is typically the investment manager or an intermediary
 * system/vendor communicating on behalf of the investment manager or of other
 * categories of investors.<br>
 * The executing party is typically the broker/dealer or an intermediary
 * system/vendor communicating on behalf of the broker/dealer.<br>
 * The custodian or the affirming party is typically the custodian, trustee,
 * financial institution, intermediary system/vendor communicating on behalf of
 * them, or their agent.<br>
 * <br>
 * USAGE<br>
 * Initiator: In local matching, the initiator of this message is always the
 * executing party. In central matching the initiator may be either the
 * executing party or instructing party.<br>
 * Respondent: instructing party, a custodian or an affirming party responds
 * with SecuritiesTradeConfirmationResponse (accept or reject) message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmIdentification
 * SecuritiesTradeConfirmationV03.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmNumberCount
 * SecuritiesTradeConfirmationV03.mmNumberCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmReferences
 * SecuritiesTradeConfirmationV03.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmTradeDetails
 * SecuritiesTradeConfirmationV03.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmFinancialInstrumentIdentification
 * SecuritiesTradeConfirmationV03.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmFinancialInstrumentAttributes
 * SecuritiesTradeConfirmationV03.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmUnderlyingFinancialInstrument
 * SecuritiesTradeConfirmationV03.mmUnderlyingFinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmStipulations
 * SecuritiesTradeConfirmationV03.mmStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmConfirmationParties
 * SecuritiesTradeConfirmationV03.mmConfirmationParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmSettlementParameters
 * SecuritiesTradeConfirmationV03.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmStandingSettlementInstruction
 * SecuritiesTradeConfirmationV03.mmStandingSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmDeliveringSettlementParties
 * SecuritiesTradeConfirmationV03.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmReceivingSettlementParties
 * SecuritiesTradeConfirmationV03.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmCashParties
 * SecuritiesTradeConfirmationV03.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmClearingDetails
 * SecuritiesTradeConfirmationV03.mmClearingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmSettlementAmount
 * SecuritiesTradeConfirmationV03.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmOtherAmounts
 * SecuritiesTradeConfirmationV03.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmOtherPrices
 * SecuritiesTradeConfirmationV03.mmOtherPrices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmOtherBusinessParties
 * SecuritiesTradeConfirmationV03.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmTwoLegTransactionDetails
 * SecuritiesTradeConfirmationV03.mmTwoLegTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmRegulatoryStipulations
 * SecuritiesTradeConfirmationV03.mmRegulatoryStipulations}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmSupplementaryData
 * SecuritiesTradeConfirmationV03.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesTradConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradeLatestVersion
 * SecuritiesTradeLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.027.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTradeConfirmationV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "SCOPE\r\nSent by an executing party to an instructing party directly or through Central Matching Utility (CMU) to provide trade confirmation on a per-account basis based on instructions provided by the instructing party in the SecuritiesAllocationInstruction message.\r\n\r\nIt may also be used to provide trade confirmation on the trade level from an executing party or an instructing party to the custodian or an affirming party directly or through CMU.\r\n\r\nThe instructing party is typically the investment manager or an intermediary system/vendor communicating on behalf of the investment manager or of other categories of investors.\r\nThe executing party is typically the broker/dealer or an intermediary system/vendor communicating on behalf of the broker/dealer.\r\nThe custodian or the affirming party is typically the custodian, trustee, financial institution, intermediary system/vendor communicating on behalf of them, or their agent.\r\n\r\nUSAGE\r\nInitiator:  In local matching, the initiator of this message is always the executing party.  In central matching the initiator may be either the executing party or instructing party.\r\nRespondent: instructing party, a custodian or an affirming party responds with SecuritiesTradeConfirmationResponse (accept or reject) message. "
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesTradeConfirmationV03", propOrder = {"identification", "numberCount", "references", "tradeDetails", "financialInstrumentIdentification", "financialInstrumentAttributes", "underlyingFinancialInstrument",
		"stipulations", "confirmationParties", "settlementParameters", "standingSettlementInstruction", "deliveringSettlementParties", "receivingSettlementParties", "cashParties", "clearingDetails", "settlementAmount", "otherAmounts",
		"otherPrices", "otherBusinessParties", "twoLegTransactionDetails", "regulatoryStipulations", "supplementaryData"})
public class SecuritiesTradeConfirmationV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected TransactiontIdentification4 identification;
	/**
	 * Information that unambiguously identifies an SecuritiesTradeConfirmation
	 * message as known by the account owner (or the instructing party acting on
	 * its behalf).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactiontIdentification4
	 * TransactiontIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that unambiguously identifies an SecuritiesTradeConfirmation message as known by the account owner (or the instructing party acting on its behalf)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Information that unambiguously identifies an SecuritiesTradeConfirmation message as known by the account owner (or the instructing party acting on its behalf).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactiontIdentification4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationV03.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected NumberCount1Choice numberCount;
	/**
	 * Count of the number of transactions linked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.NumberCount1Choice
	 * NumberCount1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbCnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberCount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Count of the number of transactions linked."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNumberCount = new MMMessageBuildingBlock() {
		{
			xmlTag = "NbCnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberCount";
			definition = "Count of the number of transactions linked.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NumberCount1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationV03.class.getMethod("getNumberCount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<Linkages15> references;
	/**
	 * Reference to the transaction identifier issued by a business party and/or
	 * market infrastructure. It may also be used to reference a previous
	 * transaction, for example, a block/allocation instruction, or tie a set of
	 * messages together.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Linkages15
	 * Linkages15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Refs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the transaction identifier issued by a business party and/or market infrastructure. It may also be used to reference a previous transaction, for example, a block/allocation instruction, or tie a set of messages together. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReferences = new MMMessageBuildingBlock() {
		{
			xmlTag = "Refs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Reference to the transaction identifier issued by a business party and/or market infrastructure. It may also be used to reference a previous transaction, for example, a block/allocation instruction, or tie a set of messages together. ";
			minOccurs = 0;
			complexType_lazy = () -> Linkages15.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationV03.class.getMethod("getReferences", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Order17 tradeDetails;
	/**
	 * Details of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Order17 Order17}
	 * </li>
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
	public static final MMMessageBuildingBlock mmTradeDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetails";
			definition = "Details of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Order17.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationV03.class.getMethod("getTradeDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * Unique and unambiguous identifier of a financial instrument, assigned
	 * under a formal or proprietary identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
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
	 * "Unique and unambiguous identifier of a financial instrument, assigned under a formal or proprietary identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFinancialInstrumentIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Unique and unambiguous identifier of a financial instrument, assigned under a formal or proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification14.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationV03.class.getMethod("getFinancialInstrumentIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FinancialInstrumentAttributes44 financialInstrumentAttributes;
	/**
	 * Elements characterising a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44
	 * FinancialInstrumentAttributes44}</li>
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
	public static final MMMessageBuildingBlock mmFinancialInstrumentAttributes = new MMMessageBuildingBlock() {
		{
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Elements characterising a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentAttributes44.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationV03.class.getMethod("getFinancialInstrumentAttributes", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<UnderlyingFinancialInstrument2> underlyingFinancialInstrument;
	/**
	 * Underlying financial instrument to which an trade confirmation is
	 * related.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingFinancialInstrument2
	 * UnderlyingFinancialInstrument2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygFinInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingFinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying financial instrument to which an trade confirmation is related."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmUnderlyingFinancialInstrument = new MMMessageBuildingBlock() {
		{
			xmlTag = "UndrlygFinInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingFinancialInstrument";
			definition = "Underlying financial instrument to which an trade confirmation is related.";
			minOccurs = 0;
			complexType_lazy = () -> UnderlyingFinancialInstrument2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationV03.class.getMethod("getUnderlyingFinancialInstrument", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FinancialInstrumentStipulations2 stipulations;
	/**
	 * Additional restrictions on the financial instrument, related to the
	 * stipulation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2
	 * FinancialInstrumentStipulations2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Stiptns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Stipulations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional restrictions on the financial instrument, related to the stipulation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStipulations = new MMMessageBuildingBlock() {
		{
			xmlTag = "Stiptns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Stipulations";
			definition = "Additional restrictions on the financial instrument, related to the stipulation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentStipulations2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationV03.class.getMethod("getStipulations", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<ConfirmationParties2> confirmationParties;
	/**
	 * Parties involved in the confirmation of the details of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2
	 * ConfirmationParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parties involved in the confirmation of the details of a trade."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmConfirmationParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "ConfPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationParties";
			definition = "Parties involved in the confirmation of the details of a trade.";
			minOccurs = 1;
			complexType_lazy = () -> ConfirmationParties2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationV03.class.getMethod("getConfirmationParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementDetails43 settlementParameters;
	/**
	 * Parameters which explicitly state the conditions that must be fulfilled
	 * before a particular transaction of a financial instrument can be settled.
	 * These parameters are defined by the instructing party in compliance with
	 * settlement rules in the market the transaction will settle in.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43
	 * SettlementDetails43}</li>
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
	 * "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled.  These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettlementParameters = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled.  These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementDetails43.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationV03.class.getMethod("getSettlementParameters", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected StandingSettlementInstruction9 standingSettlementInstruction;
	/**
	 * Specifies what settlement standing instruction database is to be used to
	 * derive the settlement parties involved in the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction9
	 * StandingSettlementInstruction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgSttlmInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStandingSettlementInstruction = new MMMessageBuildingBlock() {
		{
			xmlTag = "StgSttlmInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstruction";
			definition = "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StandingSettlementInstruction9.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationV03.class.getMethod("getStandingSettlementInstruction", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementParties23 deliveringSettlementParties;
	/**
	 * Identifies the chain of delivering settlement parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties23
	 * SettlementParties23}</li>
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
	public static final MMMessageBuildingBlock mmDeliveringSettlementParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties23.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationV03.class.getMethod("getDeliveringSettlementParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementParties23 receivingSettlementParties;
	/**
	 * Identifies the chain of receiving settlement parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties23
	 * SettlementParties23}</li>
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
	public static final MMMessageBuildingBlock mmReceivingSettlementParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementParties23.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationV03.class.getMethod("getReceivingSettlementParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CashParties18 cashParties;
	/**
	 * Cash parties involved in the specific transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashParties18
	 * CashParties18}</li>
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
	 * definition} = "Cash parties involved in the specific transaction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCashParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Cash parties involved in the specific transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashParties18.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationV03.class.getMethod("getCashParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Clearing3 clearingDetails;
	/**
	 * Provides clearing member information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Clearing3
	 * Clearing3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides clearing member information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmClearingDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "ClrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingDetails";
			definition = "Provides clearing member information.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Clearing3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationV03.class.getMethod("getClearingDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AmountAndDirection28 settlementAmount;
	/**
	 * Total amount of money to be paid or received in exchange for the
	 * securities. The amount includes the principal with any commissions and
	 * fees or accrued interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection28
	 * AmountAndDirection28}</li>
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
	 * "Total amount of money to be paid or received in exchange for the securities.  The amount includes the principal with any commissions and fees or accrued interest."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettlementAmount = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities.  The amount includes the principal with any commissions and fees or accrued interest.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection28.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationV03.class.getMethod("getSettlementAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<OtherAmounts16> otherAmounts;
	/**
	 * Other amounts than the settlement amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherAmounts16
	 * OtherAmounts16}</li>
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
	public static final MMMessageBuildingBlock mmOtherAmounts = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmounts";
			definition = "Other amounts than the settlement amount.";
			minOccurs = 0;
			complexType_lazy = () -> OtherAmounts16.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationV03.class.getMethod("getOtherAmounts", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<OtherPrices2> otherPrices;
	/**
	 * Other prices than the deal price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherPrices2
	 * OtherPrices2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrPrics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherPrices"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other prices than the deal price."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherPrices = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrPrics";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherPrices";
			definition = "Other prices than the deal price.";
			minOccurs = 0;
			complexType_lazy = () -> OtherPrices2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationV03.class.getMethod("getOtherPrices", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected OtherParties18 otherBusinessParties;
	/**
	 * Other business parties relevant to the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.OtherParties18
	 * OtherParties18}</li>
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
	public static final MMMessageBuildingBlock mmOtherBusinessParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Other business parties relevant to the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OtherParties18.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationV03.class.getMethod("getOtherBusinessParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TwoLegTransactionDetails1 twoLegTransactionDetails;
	/**
	 * Identifies a transaction that the trading parties are agreeing to
	 * repurchase, sell back or return the same or similar securities at a later
	 * time. <br>
	 * The two leg transaction details defines the closing leg conditions of a
	 * two leg transaction. It is also used to define the anticipated closing
	 * leg conditions at the time of opening the closed-end transaction. <br>
	 * <br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TwoLegTransactionDetails1
	 * TwoLegTransactionDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TwoLegTxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoLegTransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a transaction that the trading parties are agreeing to repurchase, sell back or return the same or similar securities at a later time. \r\nThe two leg transaction details defines the closing leg conditions of a two leg transaction. It is also used to define the anticipated closing leg conditions at the time of opening the closed-end transaction. \r\n\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTwoLegTransactionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TwoLegTxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoLegTransactionDetails";
			definition = "Identifies a transaction that the trading parties are agreeing to repurchase, sell back or return the same or similar securities at a later time. \r\nThe two leg transaction details defines the closing leg conditions of a two leg transaction. It is also used to define the anticipated closing leg conditions at the time of opening the closed-end transaction. \r\n\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TwoLegTransactionDetails1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationV03.class.getMethod("getTwoLegTransactionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RegulatoryStipulations1 regulatoryStipulations;
	/**
	 * Specifies regulatory stipulations that financial institutions must be
	 * compliant with in the country, region, and/or area they conduct business.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryStipulations1
	 * RegulatoryStipulations1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgltryStiptns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryStipulations"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies regulatory stipulations that financial institutions must be compliant with in the country, region, and/or area they conduct business."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRegulatoryStipulations = new MMMessageBuildingBlock() {
		{
			xmlTag = "RgltryStiptns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryStipulations";
			definition = "Specifies regulatory stipulations that financial institutions must be compliant with in the country, region, and/or area they conduct business.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RegulatoryStipulations1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationV03.class.getMethod("getRegulatoryStipulations", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
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
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeConfirmationV03.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeConfirmationV03";
				definition = "SCOPE\r\nSent by an executing party to an instructing party directly or through Central Matching Utility (CMU) to provide trade confirmation on a per-account basis based on instructions provided by the instructing party in the SecuritiesAllocationInstruction message.\r\n\r\nIt may also be used to provide trade confirmation on the trade level from an executing party or an instructing party to the custodian or an affirming party directly or through CMU.\r\n\r\nThe instructing party is typically the investment manager or an intermediary system/vendor communicating on behalf of the investment manager or of other categories of investors.\r\nThe executing party is typically the broker/dealer or an intermediary system/vendor communicating on behalf of the broker/dealer.\r\nThe custodian or the affirming party is typically the custodian, trustee, financial institution, intermediary system/vendor communicating on behalf of them, or their agent.\r\n\r\nUSAGE\r\nInitiator:  In local matching, the initiator of this message is always the executing party.  In central matching the initiator may be either the executing party or instructing party.\r\nRespondent: instructing party, a custodian or an affirming party responds with SecuritiesTradeConfirmationResponse (accept or reject) message. ";
				rootElement = "Document";
				xmlTag = "SctiesTradConf";
				businessArea_lazy = () -> SecuritiesTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.mmIdentification, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.mmNumberCount,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.mmReferences, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.mmTradeDetails,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.mmFinancialInstrumentIdentification, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.mmFinancialInstrumentAttributes,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.mmUnderlyingFinancialInstrument, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.mmStipulations,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.mmConfirmationParties, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.mmSettlementParameters,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.mmStandingSettlementInstruction, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.mmDeliveringSettlementParties,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.mmReceivingSettlementParties, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.mmCashParties,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.mmClearingDetails, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.mmSettlementAmount,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.mmOtherAmounts, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.mmOtherPrices,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.mmOtherBusinessParties, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.mmTwoLegTransactionDetails,
						com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.mmRegulatoryStipulations, com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "027";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTradeConfirmationV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public TransactiontIdentification4 getIdentification() {
		return identification;
	}

	public void setIdentification(TransactiontIdentification4 identification) {
		this.identification = identification;
	}

	@XmlElement(name = "NbCnt")
	public NumberCount1Choice getNumberCount() {
		return numberCount;
	}

	public void setNumberCount(NumberCount1Choice numberCount) {
		this.numberCount = numberCount;
	}

	@XmlElement(name = "Refs")
	public List<Linkages15> getReferences() {
		return references;
	}

	public void setReferences(List<Linkages15> references) {
		this.references = references;
	}

	@XmlElement(name = "TradDtls", required = true)
	public Order17 getTradeDetails() {
		return tradeDetails;
	}

	public void setTradeDetails(Order17 tradeDetails) {
		this.tradeDetails = tradeDetails;
	}

	@XmlElement(name = "FinInstrmId", required = true)
	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
	}

	@XmlElement(name = "FinInstrmAttrbts")
	public FinancialInstrumentAttributes44 getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes;
	}

	public void setFinancialInstrumentAttributes(FinancialInstrumentAttributes44 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
	}

	@XmlElement(name = "UndrlygFinInstrm")
	public List<UnderlyingFinancialInstrument2> getUnderlyingFinancialInstrument() {
		return underlyingFinancialInstrument;
	}

	public void setUnderlyingFinancialInstrument(List<UnderlyingFinancialInstrument2> underlyingFinancialInstrument) {
		this.underlyingFinancialInstrument = underlyingFinancialInstrument;
	}

	@XmlElement(name = "Stiptns")
	public FinancialInstrumentStipulations2 getStipulations() {
		return stipulations;
	}

	public void setStipulations(FinancialInstrumentStipulations2 stipulations) {
		this.stipulations = stipulations;
	}

	@XmlElement(name = "ConfPties", required = true)
	public List<ConfirmationParties2> getConfirmationParties() {
		return confirmationParties;
	}

	public void setConfirmationParties(List<ConfirmationParties2> confirmationParties) {
		this.confirmationParties = confirmationParties;
	}

	@XmlElement(name = "SttlmParams")
	public SettlementDetails43 getSettlementParameters() {
		return settlementParameters;
	}

	public void setSettlementParameters(SettlementDetails43 settlementParameters) {
		this.settlementParameters = settlementParameters;
	}

	@XmlElement(name = "StgSttlmInstr")
	public StandingSettlementInstruction9 getStandingSettlementInstruction() {
		return standingSettlementInstruction;
	}

	public void setStandingSettlementInstruction(StandingSettlementInstruction9 standingSettlementInstruction) {
		this.standingSettlementInstruction = standingSettlementInstruction;
	}

	@XmlElement(name = "DlvrgSttlmPties")
	public SettlementParties23 getDeliveringSettlementParties() {
		return deliveringSettlementParties;
	}

	public void setDeliveringSettlementParties(SettlementParties23 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
	}

	@XmlElement(name = "RcvgSttlmPties")
	public SettlementParties23 getReceivingSettlementParties() {
		return receivingSettlementParties;
	}

	public void setReceivingSettlementParties(SettlementParties23 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
	}

	@XmlElement(name = "CshPties")
	public CashParties18 getCashParties() {
		return cashParties;
	}

	public void setCashParties(CashParties18 cashParties) {
		this.cashParties = cashParties;
	}

	@XmlElement(name = "ClrDtls")
	public Clearing3 getClearingDetails() {
		return clearingDetails;
	}

	public void setClearingDetails(Clearing3 clearingDetails) {
		this.clearingDetails = clearingDetails;
	}

	@XmlElement(name = "SttlmAmt")
	public AmountAndDirection28 getSettlementAmount() {
		return settlementAmount;
	}

	public void setSettlementAmount(AmountAndDirection28 settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	@XmlElement(name = "OthrAmts")
	public List<OtherAmounts16> getOtherAmounts() {
		return otherAmounts;
	}

	public void setOtherAmounts(List<OtherAmounts16> otherAmounts) {
		this.otherAmounts = otherAmounts;
	}

	@XmlElement(name = "OthrPrics")
	public List<OtherPrices2> getOtherPrices() {
		return otherPrices;
	}

	public void setOtherPrices(List<OtherPrices2> otherPrices) {
		this.otherPrices = otherPrices;
	}

	@XmlElement(name = "OthrBizPties")
	public OtherParties18 getOtherBusinessParties() {
		return otherBusinessParties;
	}

	public void setOtherBusinessParties(OtherParties18 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
	}

	@XmlElement(name = "TwoLegTxDtls")
	public TwoLegTransactionDetails1 getTwoLegTransactionDetails() {
		return twoLegTransactionDetails;
	}

	public void setTwoLegTransactionDetails(TwoLegTransactionDetails1 twoLegTransactionDetails) {
		this.twoLegTransactionDetails = twoLegTransactionDetails;
	}

	@XmlElement(name = "RgltryStiptns")
	public RegulatoryStipulations1 getRegulatoryStipulations() {
		return regulatoryStipulations;
	}

	public void setRegulatoryStipulations(RegulatoryStipulations1 regulatoryStipulations) {
		this.regulatoryStipulations = regulatoryStipulations;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:setr.027.03.03")
	static public class Document {
		@XmlElement(name = "SctiesTradConf", required = true)
		public SecuritiesTradeConfirmationV03 messageBody;
	}
}