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
import com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.IncomePreference1Code;
import com.tools20022.repository.codeset.UKTaxGroupUnit1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Redemption leg, or switch-out, of a switch transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmLegIdentification
 * SwitchRedemptionLegOrder6.mmLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmFinancialInstrumentDetails
 * SwitchRedemptionLegOrder6.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmFinancialInstrumentQuantityChoice
 * SwitchRedemptionLegOrder6.mmFinancialInstrumentQuantityChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmInvestmentAccountDetails
 * SwitchRedemptionLegOrder6.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmIncomePreference
 * SwitchRedemptionLegOrder6.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmGroup1Or2Units
 * SwitchRedemptionLegOrder6.mmGroup1Or2Units}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmRequestedSettlementCurrency
 * SwitchRedemptionLegOrder6.mmRequestedSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmRequestedNAVCurrency
 * SwitchRedemptionLegOrder6.mmRequestedNAVCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmTransactionOverhead
 * SwitchRedemptionLegOrder6.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmSettlementAndCustodyDetails
 * SwitchRedemptionLegOrder6.mmSettlementAndCustodyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmPhysicalDeliveryIndicator
 * SwitchRedemptionLegOrder6.mmPhysicalDeliveryIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmPhysicalDeliveryDetails
 * SwitchRedemptionLegOrder6.mmPhysicalDeliveryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmNonStandardSettlementInformation
 * SwitchRedemptionLegOrder6.mmNonStandardSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6#mmEqualisation
 * SwitchRedemptionLegOrder6.mmEqualisation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SwitchRedemptionLeg
 * SwitchRedemptionLeg}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetails1Rule#forSwitchRedemptionLegOrder6
 * ConstraintPhysicalDeliveryDetails1Rule.forSwitchRedemptionLegOrder6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetails2Rule#forSwitchRedemptionLegOrder6
 * ConstraintPhysicalDeliveryDetails2Rule.forSwitchRedemptionLegOrder6}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SwitchRedemptionLegOrder6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Redemption leg, or switch-out, of a switch transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SwitchRedemptionLegOrder6", propOrder = {"legIdentification", "financialInstrumentDetails", "financialInstrumentQuantityChoice", "investmentAccountDetails", "incomePreference", "group1Or2Units",
		"requestedSettlementCurrency", "requestedNAVCurrency", "transactionOverhead", "settlementAndCustodyDetails", "physicalDeliveryIndicator", "physicalDeliveryDetails", "nonStandardSettlementInformation", "equalisation"})
public class SwitchRedemptionLegOrder6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LegId")
	protected Max35Text legIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6
	 * SwitchRedemptionLegOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique technical identifier for the instance of the leg within a switch."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchRedemptionLegOrder6, Optional<Max35Text>> mmLegIdentification = new MMMessageAttribute<SwitchRedemptionLegOrder6, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmObject();
			isDerived = false;
			xmlTag = "LegId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegIdentification";
			definition = "Unique technical identifier for the instance of the leg within a switch.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SwitchRedemptionLegOrder6 obj) {
			return obj.getLegIdentification();
		}

		@Override
		public void setValue(SwitchRedemptionLegOrder6 obj, Optional<Max35Text> value) {
			obj.setLegIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmDtls", required = true)
	protected FinancialInstrument57 financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument57
	 * FinancialInstrument57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
	 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6
	 * SwitchRedemptionLegOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund class related to the redemption leg of the order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchRedemptionLegOrder6, FinancialInstrument57> mmFinancialInstrumentDetails = new MMMessageAssociationEnd<SwitchRedemptionLegOrder6, FinancialInstrument57>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Investment fund class related to the redemption leg of the order.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrument57.mmObject();
		}

		@Override
		public FinancialInstrument57 getValue(SwitchRedemptionLegOrder6 obj) {
			return obj.getFinancialInstrumentDetails();
		}

		@Override
		public void setValue(SwitchRedemptionLegOrder6 obj, FinancialInstrument57 value) {
			obj.setFinancialInstrumentDetails(value);
		}
	};
	@XmlElement(name = "FinInstrmQtyChc")
	protected FinancialInstrumentQuantity29Choice financialInstrumentQuantityChoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice
	 * FinancialInstrumentQuantity29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmUnitsNumber
	 * InvestmentFundOrder.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6
	 * SwitchRedemptionLegOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmQtyChc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentQuantityChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money, number of units or percentage for the subscription leg of the switch order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchRedemptionLegOrder6, Optional<FinancialInstrumentQuantity29Choice>> mmFinancialInstrumentQuantityChoice = new MMMessageAssociationEnd<SwitchRedemptionLegOrder6, Optional<FinancialInstrumentQuantity29Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmUnitsNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmQtyChc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentQuantityChoice";
			definition = "Amount of money, number of units or percentage for the subscription leg of the switch order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity29Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity29Choice> getValue(SwitchRedemptionLegOrder6 obj) {
			return obj.getFinancialInstrumentQuantityChoice();
		}

		@Override
		public void setValue(SwitchRedemptionLegOrder6 obj, Optional<FinancialInstrumentQuantity29Choice> value) {
			obj.setFinancialInstrumentQuantityChoice(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtAcctDtls")
	protected InvestmentAccount58 investmentAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount58
	 * InvestmentAccount58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
	 * InvestmentFundTransaction.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6
	 * SwitchRedemptionLegOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account impacted by the investment fund order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchRedemptionLegOrder6, Optional<InvestmentAccount58>> mmInvestmentAccountDetails = new MMMessageAssociationEnd<SwitchRedemptionLegOrder6, Optional<InvestmentAccount58>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Account impacted by the investment fund order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccount58.mmObject();
		}

		@Override
		public Optional<InvestmentAccount58> getValue(SwitchRedemptionLegOrder6 obj) {
			return obj.getInvestmentAccountDetails();
		}

		@Override
		public void setValue(SwitchRedemptionLegOrder6 obj, Optional<InvestmentAccount58> value) {
			obj.setInvestmentAccountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "IncmPref")
	protected IncomePreference1Code incomePreference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IncomePreference1Code
	 * IncomePreference1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmIncomePreference
	 * InvestmentAccountService.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6
	 * SwitchRedemptionLegOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmPref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePreference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend option chosen by the account owner based on the options offered in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchRedemptionLegOrder6, Optional<IncomePreference1Code>> mmIncomePreference = new MMMessageAttribute<SwitchRedemptionLegOrder6, Optional<IncomePreference1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmObject();
			isDerived = false;
			xmlTag = "IncmPref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IncomePreference1Code.mmObject();
		}

		@Override
		public Optional<IncomePreference1Code> getValue(SwitchRedemptionLegOrder6 obj) {
			return obj.getIncomePreference();
		}

		@Override
		public void setValue(SwitchRedemptionLegOrder6 obj, Optional<IncomePreference1Code> value) {
			obj.setIncomePreference(value.orElse(null));
		}
	};
	@XmlElement(name = "Grp1Or2Units")
	protected UKTaxGroupUnit1Code group1Or2Units;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UKTaxGroupUnit1Code
	 * UKTaxGroupUnit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmGroup1Or2Units
	 * SecuritiesQuantity.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6
	 * SwitchRedemptionLegOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Grp1Or2Units"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Group1Or2Units"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax group to which the purchased investment fund units belong. The investor indicates to the intermediary operating pooled nominees, which type of unit is to be sold."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchRedemptionLegOrder6, Optional<UKTaxGroupUnit1Code>> mmGroup1Or2Units = new MMMessageAttribute<SwitchRedemptionLegOrder6, Optional<UKTaxGroupUnit1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmGroup1Or2Units;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmObject();
			isDerived = false;
			xmlTag = "Grp1Or2Units";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Group1Or2Units";
			definition = "Tax group to which the purchased investment fund units belong. The investor indicates to the intermediary operating pooled nominees, which type of unit is to be sold.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> UKTaxGroupUnit1Code.mmObject();
		}

		@Override
		public Optional<UKTaxGroupUnit1Code> getValue(SwitchRedemptionLegOrder6 obj) {
			return obj.getGroup1Or2Units();
		}

		@Override
		public void setValue(SwitchRedemptionLegOrder6 obj, Optional<UKTaxGroupUnit1Code> value) {
			obj.setGroup1Or2Units(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdSttlmCcy")
	protected ActiveCurrencyCode requestedSettlementCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRequestedSettlementCurrency
	 * InvestmentFundOrder.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6
	 * SwitchRedemptionLegOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdSttlmCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency requested for settlement of cash proceeds."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchRedemptionLegOrder6, Optional<ActiveCurrencyCode>> mmRequestedSettlementCurrency = new MMMessageAttribute<SwitchRedemptionLegOrder6, Optional<ActiveCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmRequestedSettlementCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmObject();
			isDerived = false;
			xmlTag = "ReqdSttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrency";
			definition = "Currency requested for settlement of cash proceeds.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(SwitchRedemptionLegOrder6 obj) {
			return obj.getRequestedSettlementCurrency();
		}

		@Override
		public void setValue(SwitchRedemptionLegOrder6 obj, Optional<ActiveCurrencyCode> value) {
			obj.setRequestedSettlementCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdNAVCcy")
	protected ActiveOrHistoricCurrencyCode requestedNAVCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmRequestedNAVCurrency
	 * InvestmentFundClass.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6
	 * SwitchRedemptionLegOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdNAVCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedNAVCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency to be used for pricing the fund. This currency must be among the set of currencies in which the price may be expressed, as stated in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchRedemptionLegOrder6, Optional<ActiveOrHistoricCurrencyCode>> mmRequestedNAVCurrency = new MMMessageAttribute<SwitchRedemptionLegOrder6, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmRequestedNAVCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmObject();
			isDerived = false;
			xmlTag = "ReqdNAVCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedNAVCurrency";
			definition = "Currency to be used for pricing the fund. This currency must be among the set of currencies in which the price may be expressed, as stated in the prospectus.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(SwitchRedemptionLegOrder6 obj) {
			return obj.getRequestedNAVCurrency();
		}

		@Override
		public void setValue(SwitchRedemptionLegOrder6 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setRequestedNAVCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "TxOvrhd")
	protected FeeAndTax1 transactionOverhead;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FeeAndTax1 FeeAndTax1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6
	 * SwitchRedemptionLegOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxOvrhd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionOverhead"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fees (charges/commission) and tax to be applied to the gross amount."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchRedemptionLegOrder6, Optional<FeeAndTax1>> mmTransactionOverhead = new MMMessageAssociationEnd<SwitchRedemptionLegOrder6, Optional<FeeAndTax1>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmObject();
			isDerived = false;
			xmlTag = "TxOvrhd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionOverhead";
			definition = "Fees (charges/commission) and tax to be applied to the gross amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FeeAndTax1.mmObject();
		}

		@Override
		public Optional<FeeAndTax1> getValue(SwitchRedemptionLegOrder6 obj) {
			return obj.getTransactionOverhead();
		}

		@Override
		public void setValue(SwitchRedemptionLegOrder6 obj, Optional<FeeAndTax1> value) {
			obj.setTransactionOverhead(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmAndCtdyDtls")
	protected FundSettlementParameters12 settlementAndCustodyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters12
	 * FundSettlementParameters12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmRelatedSettlement
	 * SecuritiesTransfer.mmRelatedSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6
	 * SwitchRedemptionLegOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAndCtdyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAndCustodyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters used to execute the settlement of an investment fund order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchRedemptionLegOrder6, Optional<FundSettlementParameters12>> mmSettlementAndCustodyDetails = new MMMessageAssociationEnd<SwitchRedemptionLegOrder6, Optional<FundSettlementParameters12>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmRelatedSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmObject();
			isDerived = false;
			xmlTag = "SttlmAndCtdyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAndCustodyDetails";
			definition = "Parameters used to execute the settlement of an investment fund order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FundSettlementParameters12.mmObject();
		}

		@Override
		public Optional<FundSettlementParameters12> getValue(SwitchRedemptionLegOrder6 obj) {
			return obj.getSettlementAndCustodyDetails();
		}

		@Override
		public void setValue(SwitchRedemptionLegOrder6 obj, Optional<FundSettlementParameters12> value) {
			obj.setSettlementAndCustodyDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PhysDlvryInd", required = true)
	protected YesNoIndicator physicalDeliveryIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6
	 * SwitchRedemptionLegOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysDlvryInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the financial instrument is to be physically delivered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchRedemptionLegOrder6, YesNoIndicator> mmPhysicalDeliveryIndicator = new MMMessageAttribute<SwitchRedemptionLegOrder6, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmObject();
			isDerived = false;
			xmlTag = "PhysDlvryInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryIndicator";
			definition = "Indicates whether the financial instrument is to be physically delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SwitchRedemptionLegOrder6 obj) {
			return obj.getPhysicalDeliveryIndicator();
		}

		@Override
		public void setValue(SwitchRedemptionLegOrder6 obj, YesNoIndicator value) {
			obj.setPhysicalDeliveryIndicator(value);
		}
	};
	@XmlElement(name = "PhysDlvryDtls")
	protected DeliveryParameters3 physicalDeliveryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DeliveryParameters3
	 * DeliveryParameters3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmPhysicalDelivery
	 * SecuritiesTransfer.mmPhysicalDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6
	 * SwitchRedemptionLegOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysDlvryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the physical delivery of the securities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchRedemptionLegOrder6, Optional<DeliveryParameters3>> mmPhysicalDeliveryDetails = new MMMessageAssociationEnd<SwitchRedemptionLegOrder6, Optional<DeliveryParameters3>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmPhysicalDelivery;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmObject();
			isDerived = false;
			xmlTag = "PhysDlvryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetails";
			definition = "Information related to the physical delivery of the securities.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DeliveryParameters3.mmObject();
		}

		@Override
		public Optional<DeliveryParameters3> getValue(SwitchRedemptionLegOrder6 obj) {
			return obj.getPhysicalDeliveryDetails();
		}

		@Override
		public void setValue(SwitchRedemptionLegOrder6 obj, Optional<DeliveryParameters3> value) {
			obj.setPhysicalDeliveryDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "NonStdSttlmInf")
	protected Max350Text nonStandardSettlementInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmNonStandardSettlementInformation
	 * InvestmentFundOrderExecution.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6
	 * SwitchRedemptionLegOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonStdSttlmInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardSettlementInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional specific settlement information for non-regulated traded funds."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SwitchRedemptionLegOrder6, Optional<Max350Text>> mmNonStandardSettlementInformation = new MMMessageAttribute<SwitchRedemptionLegOrder6, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmNonStandardSettlementInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmObject();
			isDerived = false;
			xmlTag = "NonStdSttlmInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardSettlementInformation";
			definition = "Additional specific settlement information for non-regulated traded funds.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(SwitchRedemptionLegOrder6 obj) {
			return obj.getNonStandardSettlementInformation();
		}

		@Override
		public void setValue(SwitchRedemptionLegOrder6 obj, Optional<Max350Text> value) {
			obj.setNonStandardSettlementInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "Equlstn")
	protected Equalisation1 equalisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Equalisation1
	 * Equalisation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmEqualisation
	 * InvestmentFundClass.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6
	 * SwitchRedemptionLegOrder6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Equlstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equalisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of an investor's retained subscription amount that is returned by the fund in order to reimburse preliminary incentive/performance fees."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SwitchRedemptionLegOrder6, Optional<Equalisation1>> mmEqualisation = new MMMessageAssociationEnd<SwitchRedemptionLegOrder6, Optional<Equalisation1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmEqualisation;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmObject();
			isDerived = false;
			xmlTag = "Equlstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equalisation";
			definition = "Part of an investor's retained subscription amount that is returned by the fund in order to reimburse preliminary incentive/performance fees.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Equalisation1.mmObject();
		}

		@Override
		public Optional<Equalisation1> getValue(SwitchRedemptionLegOrder6 obj) {
			return obj.getEqualisation();
		}

		@Override
		public void setValue(SwitchRedemptionLegOrder6 obj, Optional<Equalisation1> value) {
			obj.setEqualisation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmLegIdentification, com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmFinancialInstrumentQuantityChoice, com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmInvestmentAccountDetails,
						com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmIncomePreference, com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmGroup1Or2Units,
						com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmRequestedSettlementCurrency, com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmRequestedNAVCurrency,
						com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmTransactionOverhead, com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmSettlementAndCustodyDetails,
						com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmPhysicalDeliveryIndicator, com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmPhysicalDeliveryDetails,
						com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmNonStandardSettlementInformation, com.tools20022.repository.msg.SwitchRedemptionLegOrder6.mmEqualisation);
				trace_lazy = () -> SwitchRedemptionLeg.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetails1Rule.forSwitchRedemptionLegOrder6,
						com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetails2Rule.forSwitchRedemptionLegOrder6);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SwitchRedemptionLegOrder6";
				definition = "Redemption leg, or switch-out, of a switch transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getLegIdentification() {
		return legIdentification == null ? Optional.empty() : Optional.of(legIdentification);
	}

	public SwitchRedemptionLegOrder6 setLegIdentification(Max35Text legIdentification) {
		this.legIdentification = legIdentification;
		return this;
	}

	public FinancialInstrument57 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public SwitchRedemptionLegOrder6 setFinancialInstrumentDetails(FinancialInstrument57 financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public Optional<FinancialInstrumentQuantity29Choice> getFinancialInstrumentQuantityChoice() {
		return financialInstrumentQuantityChoice == null ? Optional.empty() : Optional.of(financialInstrumentQuantityChoice);
	}

	public SwitchRedemptionLegOrder6 setFinancialInstrumentQuantityChoice(FinancialInstrumentQuantity29Choice financialInstrumentQuantityChoice) {
		this.financialInstrumentQuantityChoice = financialInstrumentQuantityChoice;
		return this;
	}

	public Optional<InvestmentAccount58> getInvestmentAccountDetails() {
		return investmentAccountDetails == null ? Optional.empty() : Optional.of(investmentAccountDetails);
	}

	public SwitchRedemptionLegOrder6 setInvestmentAccountDetails(InvestmentAccount58 investmentAccountDetails) {
		this.investmentAccountDetails = investmentAccountDetails;
		return this;
	}

	public Optional<IncomePreference1Code> getIncomePreference() {
		return incomePreference == null ? Optional.empty() : Optional.of(incomePreference);
	}

	public SwitchRedemptionLegOrder6 setIncomePreference(IncomePreference1Code incomePreference) {
		this.incomePreference = incomePreference;
		return this;
	}

	public Optional<UKTaxGroupUnit1Code> getGroup1Or2Units() {
		return group1Or2Units == null ? Optional.empty() : Optional.of(group1Or2Units);
	}

	public SwitchRedemptionLegOrder6 setGroup1Or2Units(UKTaxGroupUnit1Code group1Or2Units) {
		this.group1Or2Units = group1Or2Units;
		return this;
	}

	public Optional<ActiveCurrencyCode> getRequestedSettlementCurrency() {
		return requestedSettlementCurrency == null ? Optional.empty() : Optional.of(requestedSettlementCurrency);
	}

	public SwitchRedemptionLegOrder6 setRequestedSettlementCurrency(ActiveCurrencyCode requestedSettlementCurrency) {
		this.requestedSettlementCurrency = requestedSettlementCurrency;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getRequestedNAVCurrency() {
		return requestedNAVCurrency == null ? Optional.empty() : Optional.of(requestedNAVCurrency);
	}

	public SwitchRedemptionLegOrder6 setRequestedNAVCurrency(ActiveOrHistoricCurrencyCode requestedNAVCurrency) {
		this.requestedNAVCurrency = requestedNAVCurrency;
		return this;
	}

	public Optional<FeeAndTax1> getTransactionOverhead() {
		return transactionOverhead == null ? Optional.empty() : Optional.of(transactionOverhead);
	}

	public SwitchRedemptionLegOrder6 setTransactionOverhead(FeeAndTax1 transactionOverhead) {
		this.transactionOverhead = transactionOverhead;
		return this;
	}

	public Optional<FundSettlementParameters12> getSettlementAndCustodyDetails() {
		return settlementAndCustodyDetails == null ? Optional.empty() : Optional.of(settlementAndCustodyDetails);
	}

	public SwitchRedemptionLegOrder6 setSettlementAndCustodyDetails(FundSettlementParameters12 settlementAndCustodyDetails) {
		this.settlementAndCustodyDetails = settlementAndCustodyDetails;
		return this;
	}

	public YesNoIndicator getPhysicalDeliveryIndicator() {
		return physicalDeliveryIndicator;
	}

	public SwitchRedemptionLegOrder6 setPhysicalDeliveryIndicator(YesNoIndicator physicalDeliveryIndicator) {
		this.physicalDeliveryIndicator = Objects.requireNonNull(physicalDeliveryIndicator);
		return this;
	}

	public Optional<DeliveryParameters3> getPhysicalDeliveryDetails() {
		return physicalDeliveryDetails == null ? Optional.empty() : Optional.of(physicalDeliveryDetails);
	}

	public SwitchRedemptionLegOrder6 setPhysicalDeliveryDetails(DeliveryParameters3 physicalDeliveryDetails) {
		this.physicalDeliveryDetails = physicalDeliveryDetails;
		return this;
	}

	public Optional<Max350Text> getNonStandardSettlementInformation() {
		return nonStandardSettlementInformation == null ? Optional.empty() : Optional.of(nonStandardSettlementInformation);
	}

	public SwitchRedemptionLegOrder6 setNonStandardSettlementInformation(Max350Text nonStandardSettlementInformation) {
		this.nonStandardSettlementInformation = nonStandardSettlementInformation;
		return this;
	}

	public Optional<Equalisation1> getEqualisation() {
		return equalisation == null ? Optional.empty() : Optional.of(equalisation);
	}

	public SwitchRedemptionLegOrder6 setEqualisation(Equalisation1 equalisation) {
		this.equalisation = equalisation;
		return this;
	}
}