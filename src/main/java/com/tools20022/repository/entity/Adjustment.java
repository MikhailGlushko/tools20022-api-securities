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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.AmountOrRate3Choice;
import com.tools20022.repository.choice.ChargeBasis2Choice;
import com.tools20022.repository.choice.ChargeTaxBasisType1Choice;
import com.tools20022.repository.codeset.AdjustmentDirectionCode;
import com.tools20022.repository.codeset.AdjustmentTypeCode;
import com.tools20022.repository.codeset.TaxationBasisCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Modification on the value of goods and / or services. For example: rebate,
 * discount.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Adjustment" src="doc-files/Adjustment.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
 * Adjustment.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmChargeRate
 * Adjustment.mmChargeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmCalculationMethod
 * Adjustment.mmCalculationMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmPayment
 * Adjustment.mmPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmDirection
 * Adjustment.mmDirection}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmReason
 * Adjustment.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmRelatedLineItem
 * Adjustment.mmRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAllowanceChargeIndicator
 * Adjustment.mmAllowanceChargeIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmPrice
 * Adjustment.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmChargeIndicator
 * Adjustment.mmChargeIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmType
 * Adjustment.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmCollateralManagement
 * Adjustment.mmCollateralManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAdjustedBalance
 * Adjustment.mmAdjustedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmChargesPartyRole
 * Adjustment.mmChargesPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmEffectivePeriod
 * Adjustment.mmEffectivePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmCurrencyExchange
 * Adjustment.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmSecuritiesOrder
 * Adjustment.mmSecuritiesOrder}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmTax
 * Adjustment.mmTax}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedAdjustment
 * DateTimePeriod.mmRelatedAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmAdjustment
 * Tax.mmAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmAdjustments
 * Payment.mmAdjustments}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmAdjustment
 * Balance.mmAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmPriceAdjustment
 * Price.mmPriceAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmAdjustment
 * CurrencyExchange.mmAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmAdjustments
 * SecuritiesOrder.mmAdjustments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ChargePartyRole#mmAdjustment
 * ChargePartyRole.mmAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#mmFinancialAdjustment
 * LineItem.mmFinancialAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmFeesAndCommissions
 * CollateralManagement.mmFeesAndCommissions}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Commission Commission}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges Charges}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ChargeTaxBasisType1Choice
 * ChargeTaxBasisType1Choice}</li>
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
 * "Adjustment"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Modification on the value of goods and / or services. For example: rebate, discount."
 * </li>
 * </ul>
 */
public class Adjustment {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge15#mmAmount
	 * Charge15.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission16#mmTotalCommission
	 * Commission16.mmTotalCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmChargesFees
	 * OtherAmounts16.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmExecutingBrokerAmount
	 * OtherAmounts16.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmLocalBrokerCommission
	 * OtherAmounts16.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmSharedBrokerageAmount
	 * OtherAmounts16.mmSharedBrokerageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmClearingBrokerCommission
	 * OtherAmounts16.mmClearingBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmExecutingBrokerAmount
	 * CorporateActionAmounts1.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts1.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts1.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmChargesAmount
	 * CorporateActionAmounts1.mmChargesAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charges1#mmAmount
	 * Charges1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#mmChargeAmount
	 * TaxVoucher1.mmChargeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmCommissionAmount
	 * TaxVoucher1.mmCommissionAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge26#mmChargeApplied
	 * Charge26.mmChargeApplied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountOrRate3Choice#mmAmount
	 * AmountOrRate3Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Commission21#mmCommissionApplied
	 * Commission21.mmCommissionApplied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts32#mmChargesFees
	 * OtherAmounts32.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts32#mmExecutingBrokerAmount
	 * OtherAmounts32.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts32#mmLocalBrokerCommission
	 * OtherAmounts32.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmChargesFees
	 * OtherAmounts29.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#mmTotalOverheadApplied
	 * TotalFeesAndTaxes40.mmTotalOverheadApplied}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fee3#mmRepairedStandardAmount
	 * Fee3.mmRepairedStandardAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fee3#mmRepairedDiscountAmount
	 * Fee3.mmRepairedDiscountAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fee3#mmRepairedRequestedAmount
	 * Fee3.mmRepairedRequestedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee2#mmStandardAmount
	 * Fee2.mmStandardAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee2#mmAppliedAmount
	 * Fee2.mmAppliedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee1#mmStandardAmount
	 * Fee1.mmStandardAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee1#mmRequestedAmount
	 * Fee1.mmRequestedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee4#mmAmount
	 * Fee4.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts41#mmChargesFees
	 * OtherAmounts41.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts41#mmExecutingBrokerAmount
	 * OtherAmounts41.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts41#mmLocalBrokerCommission
	 * OtherAmounts41.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts39#mmChargesFees
	 * OtherAmounts39.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts39#mmExecutingBrokerAmount
	 * OtherAmounts39.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts39#mmLocalBrokerCommission
	 * OtherAmounts39.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts40#mmChargesFees
	 * OtherAmounts40.mmChargesFees}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts40#mmExecutingBrokerAmount
	 * OtherAmounts40.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts40#mmLocalBrokerCommission
	 * OtherAmounts40.mmLocalBrokerCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmExecutingBrokerAmount
	 * CorporateActionAmounts42.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts42.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts42.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmChargesAmount
	 * CorporateActionAmounts42.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmExecutingBrokerAmount
	 * CorporateActionAmounts43.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts43.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts43.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmChargesAmount
	 * CorporateActionAmounts43.mmChargesAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmExecutingBrokerAmount
	 * CorporateActionAmounts44.mmExecutingBrokerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmPayingAgentCommissionAmount
	 * CorporateActionAmounts44.mmPayingAgentCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmLocalBrokerCommissionAmount
	 * CorporateActionAmounts44.mmLocalBrokerCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmChargesAmount
	 * CorporateActionAmounts44.mmChargesAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money that results from the application of an adjustment (charges. fees, discount or allowance) to the amount due."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Adjustment, CurrencyAndAmount> mmAmount = new MMBusinessAttribute<Adjustment, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(Charge15.mmAmount, Commission16.mmTotalCommission, OtherAmounts16.mmChargesFees, OtherAmounts16.mmExecutingBrokerAmount, OtherAmounts16.mmLocalBrokerCommission,
					OtherAmounts16.mmSharedBrokerageAmount, OtherAmounts16.mmClearingBrokerCommission, CorporateActionAmounts1.mmExecutingBrokerAmount, CorporateActionAmounts1.mmPayingAgentCommissionAmount,
					CorporateActionAmounts1.mmLocalBrokerCommissionAmount, CorporateActionAmounts1.mmChargesAmount, Charges1.mmAmount, TaxVoucher1.mmChargeAmount, TaxVoucher1.mmCommissionAmount, Charge26.mmChargeApplied,
					AmountOrRate3Choice.mmAmount, Commission21.mmCommissionApplied, OtherAmounts32.mmChargesFees, OtherAmounts32.mmExecutingBrokerAmount, OtherAmounts32.mmLocalBrokerCommission, OtherAmounts29.mmChargesFees,
					TotalFeesAndTaxes40.mmTotalOverheadApplied, Fee3.mmRepairedStandardAmount, Fee3.mmRepairedDiscountAmount, Fee3.mmRepairedRequestedAmount, Fee2.mmStandardAmount, Fee2.mmAppliedAmount, Fee1.mmStandardAmount,
					Fee1.mmRequestedAmount, Fee4.mmAmount, OtherAmounts41.mmChargesFees, OtherAmounts41.mmExecutingBrokerAmount, OtherAmounts41.mmLocalBrokerCommission, OtherAmounts39.mmChargesFees, OtherAmounts39.mmExecutingBrokerAmount,
					OtherAmounts39.mmLocalBrokerCommission, OtherAmounts40.mmChargesFees, OtherAmounts40.mmExecutingBrokerAmount, OtherAmounts40.mmLocalBrokerCommission, CorporateActionAmounts42.mmExecutingBrokerAmount,
					CorporateActionAmounts42.mmPayingAgentCommissionAmount, CorporateActionAmounts42.mmLocalBrokerCommissionAmount, CorporateActionAmounts42.mmChargesAmount, CorporateActionAmounts43.mmExecutingBrokerAmount,
					CorporateActionAmounts43.mmPayingAgentCommissionAmount, CorporateActionAmounts43.mmLocalBrokerCommissionAmount, CorporateActionAmounts43.mmChargesAmount, CorporateActionAmounts44.mmExecutingBrokerAmount,
					CorporateActionAmounts44.mmPayingAgentCommissionAmount, CorporateActionAmounts44.mmLocalBrokerCommissionAmount, CorporateActionAmounts44.mmChargesAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money that results from the application of an adjustment (charges. fees, discount or allowance) to the amount due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Adjustment obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(Adjustment obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected PercentageRate chargeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge15#mmRate
	 * Charge15.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountOrRate3Choice#mmRate
	 * AmountOrRate3Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fee3#mmRepairedStandardRate
	 * Fee3.mmRepairedStandardRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fee3#mmRepairedDiscountRate
	 * Fee3.mmRepairedDiscountRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fee3#mmRepairedRequestedRate
	 * Fee3.mmRepairedRequestedRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee2#mmStandardRate
	 * Fee2.mmStandardRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee2#mmAppliedRate
	 * Fee2.mmAppliedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargeOrCommissionDiscount1#mmRate
	 * ChargeOrCommissionDiscount1.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee1#mmStandardRate
	 * Fee1.mmStandardRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee1#mmRequestedRate
	 * Fee1.mmRequestedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ChargeOrCommissionDiscount2#mmRate
	 * ChargeOrCommissionDiscount2.mmRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to calculate the amount of the adjustment, allowance, charge or fee."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Adjustment, PercentageRate> mmChargeRate = new MMBusinessAttribute<Adjustment, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(Charge15.mmRate, AmountOrRate3Choice.mmRate, Fee3.mmRepairedStandardRate, Fee3.mmRepairedDiscountRate, Fee3.mmRepairedRequestedRate, Fee2.mmStandardRate, Fee2.mmAppliedRate,
					ChargeOrCommissionDiscount1.mmRate, Fee1.mmStandardRate, Fee1.mmRequestedRate, ChargeOrCommissionDiscount2.mmRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargeRate";
			definition = "Rate used to calculate the amount of the adjustment, allowance, charge or fee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Adjustment obj) {
			return obj.getChargeRate();
		}

		@Override
		public void setValue(Adjustment obj, PercentageRate value) {
			obj.setChargeRate(value);
		}
	};
	protected TaxationBasisCode calculationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode
	 * TaxationBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeBasis2Choice#mmCode
	 * ChargeBasis2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeBasis2Choice#mmProprietary
	 * ChargeBasis2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee2#mmBasis Fee2.mmBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee1#mmBasis Fee1.mmBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fee4#mmBasis Fee4.mmBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22a::CATB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used to calculate an adjustment (financial adjustment, charge or allowance)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Adjustment, TaxationBasisCode> mmCalculationMethod = new MMBusinessAttribute<Adjustment, TaxationBasisCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ChargeBasis2Choice.mmCode, ChargeBasis2Choice.mmProprietary, Fee2.mmBasis, Fee1.mmBasis, Fee4.mmBasis);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::CATB"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationMethod";
			definition = "Method used to calculate an adjustment (financial adjustment, charge or allowance).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxationBasisCode.mmObject();
		}

		@Override
		public TaxationBasisCode getValue(Adjustment obj) {
			return obj.getCalculationMethod();
		}

		@Override
		public void setValue(Adjustment obj, TaxationBasisCode value) {
			obj.setCalculationMethod(value);
		}
	};
	protected List<Payment> payment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAdjustments
	 * Payment.mmAdjustments}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the payment resulting from charges due by one party to another or the payment to which adjustements (for instance charges) are applied."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Adjustment, List<Payment>> mmPayment = new MMBusinessAssociationEnd<Adjustment, List<Payment>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Specifies the payment resulting from charges due by one party to another or the payment to which adjustements (for instance charges) are applied.";
			minOccurs = 0;
			opposite_lazy = () -> Payment.mmAdjustments;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Payment.mmObject();
		}

		@Override
		public List<Payment> getValue(Adjustment obj) {
			return obj.getPayment();
		}

		@Override
		public void setValue(Adjustment obj, List<Payment> value) {
			obj.setPayment(value);
		}
	};
	protected AdjustmentDirectionCode direction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AdjustmentDirectionCode
	 * AdjustmentDirectionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Direction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the adjustment must be subtracted or added to the total amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Adjustment, AdjustmentDirectionCode> mmDirection = new MMBusinessAttribute<Adjustment, AdjustmentDirectionCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Direction";
			definition = "Specifies whether the adjustment must be subtracted or added to the total amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AdjustmentDirectionCode.mmObject();
		}

		@Override
		public AdjustmentDirectionCode getValue(Adjustment obj) {
			return obj.getDirection();
		}

		@Override
		public void setValue(Adjustment obj, AdjustmentDirectionCode value) {
			obj.setDirection(value);
		}
	};
	protected Max4AlphaNumericText reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the amount adjustment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Adjustment, Max4AlphaNumericText> mmReason = new MMBusinessAttribute<Adjustment, Max4AlphaNumericText>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reason";
			definition = "Reason for the amount adjustment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		@Override
		public Max4AlphaNumericText getValue(Adjustment obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(Adjustment obj, Max4AlphaNumericText value) {
			obj.setReason(value);
		}
	};
	protected LineItem relatedLineItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmFinancialAdjustment
	 * LineItem.mmFinancialAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the line item on which a financial adjustment took place."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Adjustment, Optional<LineItem>> mmRelatedLineItem = new MMBusinessAssociationEnd<Adjustment, Optional<LineItem>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedLineItem";
			definition = "Specifies the line item on which a financial adjustment took place.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> LineItem.mmFinancialAdjustment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> LineItem.mmObject();
		}

		@Override
		public Optional<LineItem> getValue(Adjustment obj) {
			return obj.getRelatedLineItem();
		}

		@Override
		public void setValue(Adjustment obj, Optional<LineItem> value) {
			obj.setRelatedLineItem(value.orElse(null));
		}
	};
	protected YesNoIndicator allowanceChargeIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowanceChargeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of whether or not this allowance charge is a charge (Indicator is Yes) that should be added or an allowance that should be subtracted (Indicator is No)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Adjustment, YesNoIndicator> mmAllowanceChargeIndicator = new MMBusinessAttribute<Adjustment, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllowanceChargeIndicator";
			definition = "Indication of whether or not this allowance charge is a charge (Indicator is Yes) that should be added or an allowance that should be subtracted (Indicator is No).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Adjustment obj) {
			return obj.getAllowanceChargeIndicator();
		}

		@Override
		public void setValue(Adjustment obj, YesNoIndicator value) {
			obj.setAllowanceChargeIndicator(value);
		}
	};
	protected Price price;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmPriceAdjustment
	 * Price.mmPriceAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmMarketBrokerCommission
	 * OtherPrices2.mmMarketBrokerCommission}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the price which is adjusted."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Adjustment, Optional<Price>> mmPrice = new MMBusinessAssociationEnd<Adjustment, Optional<Price>>() {
		{
			derivation_lazy = () -> Arrays.asList(OtherPrices2.mmMarketBrokerCommission);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Specifies the price which is adjusted.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Price.mmPriceAdjustment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Price.mmObject();
		}

		@Override
		public Optional<Price> getValue(Adjustment obj) {
			return obj.getPrice();
		}

		@Override
		public void setValue(Adjustment obj, Optional<Price> value) {
			obj.setPrice(value.orElse(null));
		}
	};
	protected YesNoIndicator chargeIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indication of whether or not this allowance charge is a charge."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Adjustment, Optional<YesNoIndicator>> mmChargeIndicator = new MMBusinessAttribute<Adjustment, Optional<YesNoIndicator>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargeIndicator";
			definition = "Indication of whether or not this allowance charge is a charge.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Adjustment obj) {
			return obj.getChargeIndicator();
		}

		@Override
		public void setValue(Adjustment obj, Optional<YesNoIndicator> value) {
			obj.setChargeIndicator(value.orElse(null));
		}
	};
	protected AdjustmentTypeCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AdjustmentTypeCode
	 * AdjustmentTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of adjustment applied to the amount of goods/services by means of a code."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Adjustment, AdjustmentTypeCode> mmType = new MMBusinessAttribute<Adjustment, AdjustmentTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of adjustment applied to the amount of goods/services by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AdjustmentTypeCode.mmObject();
		}

		@Override
		public AdjustmentTypeCode getValue(Adjustment obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Adjustment obj, AdjustmentTypeCode value) {
			obj.setType(value);
		}
	};
	protected CollateralManagement collateralManagement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmFeesAndCommissions
	 * CollateralManagement.mmFeesAndCommissions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Adjustment, CollateralManagement> mmCollateralManagement = new MMBusinessAssociationEnd<Adjustment, CollateralManagement>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Process which groups the activities related to collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CollateralManagement.mmFeesAndCommissions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CollateralManagement.mmObject();
		}

		@Override
		public CollateralManagement getValue(Adjustment obj) {
			return obj.getCollateralManagement();
		}

		@Override
		public void setValue(Adjustment obj, CollateralManagement value) {
			obj.setCollateralManagement(value);
		}
	};
	protected Balance adjustedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmAdjustment
	 * Balance.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance for which adjustments are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Adjustment, Balance> mmAdjustedBalance = new MMBusinessAssociationEnd<Adjustment, Balance>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdjustedBalance";
			definition = "Balance for which adjustments are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Balance.mmAdjustment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Balance.mmObject();
		}

		@Override
		public Balance getValue(Adjustment obj) {
			return obj.getAdjustedBalance();
		}

		@Override
		public void setValue(Adjustment obj, Balance value) {
			obj.setAdjustedBalance(value);
		}
	};
	protected List<ChargePartyRole> chargesPartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ChargePartyRole#mmAdjustment
	 * ChargePartyRole.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ChargePartyRole
	 * ChargePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role played by a party in the context of charges due."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Adjustment, List<ChargePartyRole>> mmChargesPartyRole = new MMBusinessAssociationEnd<Adjustment, List<ChargePartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ChargesPartyRole";
			definition = "Role played by a party in the context of charges due.";
			minOccurs = 0;
			opposite_lazy = () -> ChargePartyRole.mmAdjustment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ChargePartyRole.mmObject();
		}

		@Override
		public List<ChargePartyRole> getValue(Adjustment obj) {
			return obj.getChargesPartyRole();
		}

		@Override
		public void setValue(Adjustment obj, List<ChargePartyRole> value) {
			obj.setChargesPartyRole(value);
		}
	};
	protected DateTimePeriod effectivePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedAdjustment
	 * DateTimePeriod.mmRelatedAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectivePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the adjustment is applicable."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Adjustment, DateTimePeriod> mmEffectivePeriod = new MMBusinessAssociationEnd<Adjustment, DateTimePeriod>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the adjustment is applicable.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> DateTimePeriod.mmRelatedAdjustment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public DateTimePeriod getValue(Adjustment obj) {
			return obj.getEffectivePeriod();
		}

		@Override
		public void setValue(Adjustment obj, DateTimePeriod value) {
			obj.setEffectivePeriod(value);
		}
	};
	protected CurrencyExchange currencyExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmAdjustment
	 * CurrencyExchange.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency exchange for which adjustments such as fees or commissions are applied."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Adjustment, CurrencyExchange> mmCurrencyExchange = new MMBusinessAssociationEnd<Adjustment, CurrencyExchange>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Currency exchange for which adjustments such as fees or commissions are applied.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CurrencyExchange.mmAdjustment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CurrencyExchange.mmObject();
		}

		@Override
		public CurrencyExchange getValue(Adjustment obj) {
			return obj.getCurrencyExchange();
		}

		@Override
		public void setValue(Adjustment obj, CurrencyExchange value) {
			obj.setCurrencyExchange(value);
		}
	};
	protected SecuritiesOrder securitiesOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmAdjustments
	 * SecuritiesOrder.mmAdjustments}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which adjustments are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Adjustment, SecuritiesOrder> mmSecuritiesOrder = new MMBusinessAssociationEnd<Adjustment, SecuritiesOrder>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesOrder";
			definition = "Order for which adjustments are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesOrder.mmAdjustments;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrder.mmObject();
		}

		@Override
		public SecuritiesOrder getValue(Adjustment obj) {
			return obj.getSecuritiesOrder();
		}

		@Override
		public void setValue(Adjustment obj, SecuritiesOrder value) {
			obj.setSecuritiesOrder(value);
		}
	};
	protected Tax tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAdjustment
	 * Tax.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the calculation method resulting in the tax amount included in the charge transfer. The tax is expressed as a fixed amount, or as a percentage of the charge amount, upon which the tax is applied."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Adjustment, Optional<Tax>> mmTax = new MMBusinessAssociationEnd<Adjustment, Optional<Tax>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Information on the calculation method resulting in the tax amount included in the charge transfer. The tax is expressed as a fixed amount, or as a percentage of the charge amount, upon which the tax is applied.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Tax.mmAdjustment;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Tax.mmObject();
		}

		@Override
		public Optional<Tax> getValue(Adjustment obj) {
			return obj.getTax();
		}

		@Override
		public void setValue(Adjustment obj, Optional<Tax> value) {
			obj.setTax(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Adjustment";
				definition = "Modification on the value of goods and / or services. For example: rebate, discount.";
				associationDomain_lazy = () -> Arrays.asList(DateTimePeriod.mmRelatedAdjustment, Tax.mmAdjustment, Payment.mmAdjustments, Balance.mmAdjustment, Price.mmPriceAdjustment, CurrencyExchange.mmAdjustment,
						SecuritiesOrder.mmAdjustments, ChargePartyRole.mmAdjustment, LineItem.mmFinancialAdjustment, CollateralManagement.mmFeesAndCommissions);
				subType_lazy = () -> Arrays.asList(Commission.mmObject(), Charges.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Adjustment.mmAmount, com.tools20022.repository.entity.Adjustment.mmChargeRate, com.tools20022.repository.entity.Adjustment.mmCalculationMethod,
						com.tools20022.repository.entity.Adjustment.mmPayment, com.tools20022.repository.entity.Adjustment.mmDirection, com.tools20022.repository.entity.Adjustment.mmReason,
						com.tools20022.repository.entity.Adjustment.mmRelatedLineItem, com.tools20022.repository.entity.Adjustment.mmAllowanceChargeIndicator, com.tools20022.repository.entity.Adjustment.mmPrice,
						com.tools20022.repository.entity.Adjustment.mmChargeIndicator, com.tools20022.repository.entity.Adjustment.mmType, com.tools20022.repository.entity.Adjustment.mmCollateralManagement,
						com.tools20022.repository.entity.Adjustment.mmAdjustedBalance, com.tools20022.repository.entity.Adjustment.mmChargesPartyRole, com.tools20022.repository.entity.Adjustment.mmEffectivePeriod,
						com.tools20022.repository.entity.Adjustment.mmCurrencyExchange, com.tools20022.repository.entity.Adjustment.mmSecuritiesOrder, com.tools20022.repository.entity.Adjustment.mmTax);
				derivationComponent_lazy = () -> Arrays.asList(ChargeTaxBasisType1Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Adjustment.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public Adjustment setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public PercentageRate getChargeRate() {
		return chargeRate;
	}

	public Adjustment setChargeRate(PercentageRate chargeRate) {
		this.chargeRate = Objects.requireNonNull(chargeRate);
		return this;
	}

	public TaxationBasisCode getCalculationMethod() {
		return calculationMethod;
	}

	public Adjustment setCalculationMethod(TaxationBasisCode calculationMethod) {
		this.calculationMethod = Objects.requireNonNull(calculationMethod);
		return this;
	}

	public List<Payment> getPayment() {
		return payment == null ? payment = new ArrayList<>() : payment;
	}

	public Adjustment setPayment(List<Payment> payment) {
		this.payment = Objects.requireNonNull(payment);
		return this;
	}

	public AdjustmentDirectionCode getDirection() {
		return direction;
	}

	public Adjustment setDirection(AdjustmentDirectionCode direction) {
		this.direction = Objects.requireNonNull(direction);
		return this;
	}

	public Max4AlphaNumericText getReason() {
		return reason;
	}

	public Adjustment setReason(Max4AlphaNumericText reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}

	public Optional<LineItem> getRelatedLineItem() {
		return relatedLineItem == null ? Optional.empty() : Optional.of(relatedLineItem);
	}

	public Adjustment setRelatedLineItem(LineItem relatedLineItem) {
		this.relatedLineItem = relatedLineItem;
		return this;
	}

	public YesNoIndicator getAllowanceChargeIndicator() {
		return allowanceChargeIndicator;
	}

	public Adjustment setAllowanceChargeIndicator(YesNoIndicator allowanceChargeIndicator) {
		this.allowanceChargeIndicator = Objects.requireNonNull(allowanceChargeIndicator);
		return this;
	}

	public Optional<Price> getPrice() {
		return price == null ? Optional.empty() : Optional.of(price);
	}

	public Adjustment setPrice(Price price) {
		this.price = price;
		return this;
	}

	public Optional<YesNoIndicator> getChargeIndicator() {
		return chargeIndicator == null ? Optional.empty() : Optional.of(chargeIndicator);
	}

	public Adjustment setChargeIndicator(YesNoIndicator chargeIndicator) {
		this.chargeIndicator = chargeIndicator;
		return this;
	}

	public AdjustmentTypeCode getType() {
		return type;
	}

	public Adjustment setType(AdjustmentTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public CollateralManagement getCollateralManagement() {
		return collateralManagement;
	}

	public Adjustment setCollateralManagement(CollateralManagement collateralManagement) {
		this.collateralManagement = Objects.requireNonNull(collateralManagement);
		return this;
	}

	public Balance getAdjustedBalance() {
		return adjustedBalance;
	}

	public Adjustment setAdjustedBalance(Balance adjustedBalance) {
		this.adjustedBalance = Objects.requireNonNull(adjustedBalance);
		return this;
	}

	public List<ChargePartyRole> getChargesPartyRole() {
		return chargesPartyRole == null ? chargesPartyRole = new ArrayList<>() : chargesPartyRole;
	}

	public Adjustment setChargesPartyRole(List<ChargePartyRole> chargesPartyRole) {
		this.chargesPartyRole = Objects.requireNonNull(chargesPartyRole);
		return this;
	}

	public DateTimePeriod getEffectivePeriod() {
		return effectivePeriod;
	}

	public Adjustment setEffectivePeriod(DateTimePeriod effectivePeriod) {
		this.effectivePeriod = Objects.requireNonNull(effectivePeriod);
		return this;
	}

	public CurrencyExchange getCurrencyExchange() {
		return currencyExchange;
	}

	public Adjustment setCurrencyExchange(CurrencyExchange currencyExchange) {
		this.currencyExchange = Objects.requireNonNull(currencyExchange);
		return this;
	}

	public SecuritiesOrder getSecuritiesOrder() {
		return securitiesOrder;
	}

	public Adjustment setSecuritiesOrder(SecuritiesOrder securitiesOrder) {
		this.securitiesOrder = Objects.requireNonNull(securitiesOrder);
		return this;
	}

	public Optional<Tax> getTax() {
		return tax == null ? Optional.empty() : Optional.of(tax);
	}

	public Adjustment setTax(Tax tax) {
		this.tax = tax;
		return this;
	}
}