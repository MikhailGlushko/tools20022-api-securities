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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.InterestTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Consideration, such as amount of money, paid or received in exchange for an
 * asset that has been invested, loaned or borrowed for a certain period. The
 * interest is expressed as a fixed amount or percentage of the amount upon
 * which the interest is applied.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Interest" src="doc-files/Interest.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
 * Interest.mmAccruedInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
 * Interest.mmInterestCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmAmount
 * Interest.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmRate
 * Interest.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedCashProceedsDefinition
 * Interest.mmRelatedCashProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmSecuritiesFinancing
 * Interest.mmSecuritiesFinancing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmInterestTax
 * Interest.mmInterestTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmCreditDebitIndicator
 * Interest.mmCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmCashEntry
 * Interest.mmCashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmPaymentDate
 * Interest.mmPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedInterestManagement
 * Interest.mmRelatedInterestManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedUndertakingAmount
 * Interest.mmRelatedUndertakingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedDebitCreditFacility
 * Interest.mmRelatedDebitCreditFacility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmSecuritiesSettlement
 * Interest.mmSecuritiesSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmInterestName
 * Interest.mmInterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedAssetHolding
 * Interest.mmRelatedAssetHolding}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmDeposit
 * Interest.mmDeposit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmAccountBalance
 * Interest.mmAccountBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedAccountContract
 * Interest.mmRelatedAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedNetAssetValueCalculation
 * Interest.mmRelatedNetAssetValueCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmTypeOfInterest
 * Interest.mmTypeOfInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedPaymentCard
 * Interest.mmRelatedPaymentCard}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForInterestName
 * GenericIdentification.mmIdentificationForInterestName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmInterest
 * NetAssetValueCalculation.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmInterest
 * Tax.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountContract#mmInterest
 * AccountContract.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentCard#mmInterest
 * PaymentCard.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmInterest
 * CashEntry.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmInterest
 * AssetHolding.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Balance#mmInterest
 * Balance.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAccruedInterest
 * SecuritiesSettlement.mmAccruedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterest
 * InterestCalculation.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmInterest
 * SecuritiesFinancing.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmInterest
 * CashProceedsDefinition.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#mmCashAccountInterest
 * DebitCreditFacility.mmCashAccountInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.UndertakingAmount#mmInterest
 * UndertakingAmount.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Deposit#mmInterest
 * Deposit.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmInterest
 * InterestManagement.mmInterest}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice#mmRateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat8Choice.mmRateTypeAndAmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat7Choice#mmRateTypeAndAmountAndRateStatus
 * InterestRateUsedForPaymentFormat7Choice.mmRateTypeAndAmountAndRateStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.RateOrName1Choice
 * RateOrName1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InterestRate1Choice
 * InterestRate1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestAmount1
 * InterestAmount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestResult1
 * InterestResult1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestAmount2
 * InterestAmount2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice
 * InterestRateUsedForPaymentFormat8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus24
 * RateTypeAndAmountAndStatus24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus26
 * RateTypeAndAmountAndStatus26}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat7Choice
 * InterestRateUsedForPaymentFormat7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestStatement4
 * InterestStatement4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestRateContractTerm2
 * InterestRateContractTerm2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InterestRate6Choice
 * InterestRate6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.InterestRate8Choice
 * InterestRate8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus38
 * RateTypeAndAmountAndStatus38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus37
 * RateTypeAndAmountAndStatus37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus41
 * RateTypeAndAmountAndStatus41}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus40
 * RateTypeAndAmountAndStatus40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus39
 * RateTypeAndAmountAndStatus39}</li>
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
 * "Interest"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Consideration, such as amount of money,  paid or received in exchange for an asset that has been invested, loaned or borrowed for a certain period. The interest is expressed as a fixed amount or percentage of the amount upon which the interest is applied."
 * </li>
 * </ul>
 */
public class Interest {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount accruedInterestAmount;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts1#mmAccruedInterestAmount
	 * BalanceAmounts1.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#mmAccruedInterestAmount
	 * AggregateBalancePerSafekeepingPlace4.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmAccruedInterestAmount
	 * AggregateBalanceInformation3.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAmounts3#mmAccruedInterestAmount
	 * BalanceAmounts3.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmAccruedInterestAmount
	 * AggregateBalancePerSafekeepingPlace3.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmAccruedInterestAmount
	 * AggregateBalanceInformation4.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmAccruedInterestAmount
	 * SecuritiesFinancing10.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmAccruedInterestAmount
	 * InterestAmount1.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmAccruedInterestAmount
	 * InterestAmount2.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmTotalAccruedInterestAmount
	 * SummaryAmounts1.mmTotalAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralAmount1#mmAccruedInterestAmount
	 * CollateralAmount1.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmAccruedInterestAmount
	 * Order17.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmAccruedInterestAmount
	 * Order18.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmAccruedInterestAmount
	 * TradeLeg8.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmAccruedInterestAmount
	 * TradeLeg9.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails27.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts32#mmAccruedInterestAmount
	 * OtherAmounts32.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts29#mmAccruedInterestAmount
	 * OtherAmounts29.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmAccruedInterestAmount
	 * InterestCalculation4.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice23#mmAccruedInterestNAV
	 * UnitPrice23.mmAccruedInterestNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts41#mmAccruedInterestAmount
	 * OtherAmounts41.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts39#mmAccruedInterestAmount
	 * OtherAmounts39.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts40#mmAccruedInterestAmount
	 * OtherAmounts40.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails103#mmAccruedInterestAmount
	 * TransactionDetails103.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails37#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails37.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails38#mmAccruedInterestAmount
	 * SecuritiesFinancingTransactionDetails38.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmAccruedInterestAmount
	 * CorporateActionAmounts42.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmAccruedInterestAmount
	 * CorporateActionAmounts43.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmAccruedInterestAmount
	 * CorporateActionAmounts44.mmAccruedInterestAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ACRU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest amount that has accrued in between coupon payment periods."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Interest, CurrencyAndAmount> mmAccruedInterestAmount = new MMBusinessAttribute<Interest, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(BalanceAmounts1.mmAccruedInterestAmount, AggregateBalancePerSafekeepingPlace4.mmAccruedInterestAmount, AggregateBalanceInformation3.mmAccruedInterestAmount,
					BalanceAmounts3.mmAccruedInterestAmount, AggregateBalancePerSafekeepingPlace3.mmAccruedInterestAmount, AggregateBalanceInformation4.mmAccruedInterestAmount, SecuritiesFinancing10.mmAccruedInterestAmount,
					InterestAmount1.mmAccruedInterestAmount, InterestAmount2.mmAccruedInterestAmount, SummaryAmounts1.mmTotalAccruedInterestAmount, CollateralAmount1.mmAccruedInterestAmount, Order17.mmAccruedInterestAmount,
					Order18.mmAccruedInterestAmount, TradeLeg8.mmAccruedInterestAmount, TradeLeg9.mmAccruedInterestAmount, SecuritiesFinancingTransactionDetails27.mmAccruedInterestAmount, OtherAmounts32.mmAccruedInterestAmount,
					OtherAmounts29.mmAccruedInterestAmount, InterestCalculation4.mmAccruedInterestAmount, UnitPrice23.mmAccruedInterestNAV, OtherAmounts41.mmAccruedInterestAmount, OtherAmounts39.mmAccruedInterestAmount,
					OtherAmounts40.mmAccruedInterestAmount, TransactionDetails103.mmAccruedInterestAmount, SecuritiesFinancingTransactionDetails37.mmAccruedInterestAmount, SecuritiesFinancingTransactionDetails38.mmAccruedInterestAmount,
					CorporateActionAmounts42.mmAccruedInterestAmount, CorporateActionAmounts43.mmAccruedInterestAmount, CorporateActionAmounts44.mmAccruedInterestAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ACRU"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between coupon payment periods.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Interest obj) {
			return obj.getAccruedInterestAmount();
		}

		@Override
		public void setValue(Interest obj, CurrencyAndAmount value) {
			obj.setAccruedInterestAmount(value);
		}
	};
	protected List<InterestCalculation> interestCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterest
	 * InterestCalculation.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestCalculation
	 * InterestCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmChargesRate
	 * SecuritiesFinancingTransactionDetails27.mmChargesRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus24#mmRateType
	 * RateTypeAndAmountAndStatus24.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus26#mmRateType
	 * RateTypeAndAmountAndStatus26.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#mmInterestCalculation
	 * InterestStatement4.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails37#mmChargesRate
	 * SecuritiesFinancingTransactionDetails37.mmChargesRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus38#mmRateType
	 * RateTypeAndAmountAndStatus38.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus37#mmRateType
	 * RateTypeAndAmountAndStatus37.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus41#mmRateType
	 * RateTypeAndAmountAndStatus41.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus40#mmRateType
	 * RateTypeAndAmountAndStatus40.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus39#mmRateType
	 * RateTypeAndAmountAndStatus39.mmRateType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Calculation parameters used to obtain the interest amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Interest, List<InterestCalculation>> mmInterestCalculation = new MMBusinessAssociationEnd<Interest, List<InterestCalculation>>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmChargesRate, RateTypeAndAmountAndStatus24.mmRateType, RateTypeAndAmountAndStatus26.mmRateType, InterestStatement4.mmInterestCalculation,
					SecuritiesFinancingTransactionDetails37.mmChargesRate, RateTypeAndAmountAndStatus38.mmRateType, RateTypeAndAmountAndStatus37.mmRateType, RateTypeAndAmountAndStatus41.mmRateType, RateTypeAndAmountAndStatus40.mmRateType,
					RateTypeAndAmountAndStatus39.mmRateType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestCalculation";
			definition = "Calculation parameters used to obtain the interest amount.";
			minOccurs = 0;
			opposite_lazy = () -> InterestCalculation.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InterestCalculation.mmObject();
		}

		@Override
		public List<InterestCalculation> getValue(Interest obj) {
			return obj.getInterestCalculation();
		}

		@Override
		public void setValue(Interest obj, List<InterestCalculation> value) {
			obj.setInterestCalculation(value);
		}
	};
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmBorrowingInterestAmount
	 * OtherAmounts16.mmBorrowingInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmInterestAmount
	 * CorporateActionAmounts1.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResult1#mmInterestDueToA
	 * InterestResult1.mmInterestDueToA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResult1#mmInterestDueToB
	 * InterestResult1.mmInterestDueToB}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetPosition3#mmAccruedInterestAmount
	 * NetPosition3.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice#mmAmount
	 * InterestRateUsedForPaymentFormat8Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus24#mmAmount
	 * RateTypeAndAmountAndStatus24.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus26#mmAmount
	 * RateTypeAndAmountAndStatus26.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat7Choice#mmAmount
	 * InterestRateUsedForPaymentFormat7Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#mmTotalInterestAmountDueToA
	 * InterestStatement4.mmTotalInterestAmountDueToA}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#mmTotalInterestAmountDueToB
	 * InterestStatement4.mmTotalInterestAmountDueToB}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmAggregatedInterestAmount
	 * InterestCalculation4.mmAggregatedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmInterestAmount
	 * CorporateActionAmounts42.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus38#mmAmount
	 * RateTypeAndAmountAndStatus38.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmInterestAmount
	 * CorporateActionAmounts43.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus37#mmAmount
	 * RateTypeAndAmountAndStatus37.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus41#mmAmount
	 * RateTypeAndAmountAndStatus41.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmInterestAmount
	 * CorporateActionAmounts44.mmInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus40#mmAmount
	 * RateTypeAndAmountAndStatus40.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndAmountAndStatus39#mmAmount
	 * RateTypeAndAmountAndStatus39.mmAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money representing interest payments."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Interest, CurrencyAndAmount> mmAmount = new MMBusinessAttribute<Interest, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(OtherAmounts16.mmBorrowingInterestAmount, CorporateActionAmounts1.mmInterestAmount, InterestResult1.mmInterestDueToA, InterestResult1.mmInterestDueToB, NetPosition3.mmAccruedInterestAmount,
					InterestRateUsedForPaymentFormat8Choice.mmAmount, RateTypeAndAmountAndStatus24.mmAmount, RateTypeAndAmountAndStatus26.mmAmount, InterestRateUsedForPaymentFormat7Choice.mmAmount,
					InterestStatement4.mmTotalInterestAmountDueToA, InterestStatement4.mmTotalInterestAmountDueToB, InterestCalculation4.mmAggregatedInterestAmount, CorporateActionAmounts42.mmInterestAmount,
					RateTypeAndAmountAndStatus38.mmAmount, CorporateActionAmounts43.mmInterestAmount, RateTypeAndAmountAndStatus37.mmAmount, RateTypeAndAmountAndStatus41.mmAmount, CorporateActionAmounts44.mmInterestAmount,
					RateTypeAndAmountAndStatus40.mmAmount, RateTypeAndAmountAndStatus39.mmAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money representing interest payments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Interest obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(Interest obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected PercentageRate rate;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateOrName1Choice#mmRate
	 * RateOrName1Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmAccruedInterestPercentage
	 * SecuritiesFinancing10.mmAccruedInterestPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmInterestRate
	 * SecuritiesFinancing10.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmInterestForUsedPayment
	 * CorporateActionRate2.mmInterestForUsedPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRate1Choice#mmFixedInterestRate
	 * InterestRate1Choice.mmFixedInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmInterestRate
	 * InterestAmount1.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmInterestRate
	 * InterestAmount2.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmAccruedInterestPercentage
	 * Order17.mmAccruedInterestPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmAccruedInterestPercentage
	 * Order18.mmAccruedInterestPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebtInstrument2#mmInterestRate
	 * DebtInstrument2.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice#mmRate
	 * InterestRateUsedForPaymentFormat8Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat7Choice#mmRate
	 * InterestRateUsedForPaymentFormat7Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestCalculation4#mmEffectiveRate
	 * InterestCalculation4.mmEffectiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRate6Choice#mmFixed
	 * InterestRate6Choice.mmFixed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3#mmInterestRate
	 * DerivativeInterest3.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3#mmFirstLegInterestRate
	 * DerivativeInterest3.mmFirstLegInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3#mmOtherLegInterestRate
	 * DerivativeInterest3.mmOtherLegInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InterestRate8Choice#mmFixed
	 * InterestRate8Choice.mmFixed}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5#mmInterestRateReference
	 * InterestRateDerivative5.mmInterestRateReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmDealRate
	 * SecuredMarketTransaction4.mmDealRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OvernightIndexSwapTransaction4#mmFixedInterestRate
	 * OvernightIndexSwapTransaction4.mmFixedInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmDealRate
	 * UnsecuredMarketTransaction4.mmDealRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails31#mmInterestRateUsedForPayment
	 * RateDetails31.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate86#mmInterestRateUsedForPayment
	 * CorporateActionRate86.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails32#mmInterestRateUsedForPayment
	 * RateDetails32.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87#mmInterestRateUsedForPayment
	 * CorporateActionRate87.mmInterestRateUsedForPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate88#mmInterestRateUsedForPayment
	 * CorporateActionRate88.mmInterestRateUsedForPayment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The actual interest rate used for the payment of the interest for the specified interest period."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Interest, PercentageRate> mmRate = new MMBusinessAttribute<Interest, PercentageRate>() {
		{
			derivation_lazy = () -> Arrays.asList(RateOrName1Choice.mmRate, SecuritiesFinancing10.mmAccruedInterestPercentage, SecuritiesFinancing10.mmInterestRate, CorporateActionRate2.mmInterestForUsedPayment,
					InterestRate1Choice.mmFixedInterestRate, InterestAmount1.mmInterestRate, InterestAmount2.mmInterestRate, Order17.mmAccruedInterestPercentage, Order18.mmAccruedInterestPercentage, DebtInstrument2.mmInterestRate,
					InterestRateUsedForPaymentFormat8Choice.mmRate, InterestRateUsedForPaymentFormat7Choice.mmRate, InterestCalculation4.mmEffectiveRate, InterestRate6Choice.mmFixed, DerivativeInterest3.mmInterestRate,
					DerivativeInterest3.mmFirstLegInterestRate, DerivativeInterest3.mmOtherLegInterestRate, InterestRate8Choice.mmFixed, InterestRateDerivative5.mmInterestRateReference, SecuredMarketTransaction4.mmDealRate,
					OvernightIndexSwapTransaction4.mmFixedInterestRate, UnsecuredMarketTransaction4.mmDealRate, RateDetails31.mmInterestRateUsedForPayment, CorporateActionRate86.mmInterestRateUsedForPayment,
					RateDetails32.mmInterestRateUsedForPayment, CorporateActionRate87.mmInterestRateUsedForPayment, CorporateActionRate88.mmInterestRateUsedForPayment);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "The actual interest rate used for the payment of the interest for the specified interest period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(Interest obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(Interest obj, PercentageRate value) {
			obj.setRate(value);
		}
	};
	protected List<CashProceedsDefinition> relatedCashProceedsDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmInterest
	 * CashProceedsDefinition.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCashProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash proceeds definition for which an interest is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Interest, List<CashProceedsDefinition>> mmRelatedCashProceedsDefinition = new MMBusinessAssociationEnd<Interest, List<CashProceedsDefinition>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCashProceedsDefinition";
			definition = "Cash proceeds definition for which an interest is provided.";
			minOccurs = 0;
			opposite_lazy = () -> CashProceedsDefinition.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashProceedsDefinition.mmObject();
		}

		@Override
		public List<CashProceedsDefinition> getValue(Interest obj) {
			return obj.getRelatedCashProceedsDefinition();
		}

		@Override
		public void setValue(Interest obj, List<CashProceedsDefinition> value) {
			obj.setRelatedCashProceedsDefinition(value);
		}
	};
	protected List<SecuritiesFinancing> securitiesFinancing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmInterest
	 * SecuritiesFinancing.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the financing trade on which this interest apply."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Interest, List<SecuritiesFinancing>> mmSecuritiesFinancing = new MMBusinessAssociationEnd<Interest, List<SecuritiesFinancing>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesFinancing";
			definition = "Specifies the financing trade on which this interest apply.";
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesFinancing.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesFinancing.mmObject();
		}

		@Override
		public List<SecuritiesFinancing> getValue(Interest obj) {
			return obj.getSecuritiesFinancing();
		}

		@Override
		public void setValue(Interest obj, List<SecuritiesFinancing> value) {
			obj.setSecuritiesFinancing(value);
		}
	};
	protected Tax interestTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#mmInterest
	 * Tax.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmAccruedInterestTax
	 * SecuritiesFinancing10.mmAccruedInterestTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmAppliedWithholdingTax
	 * InterestAmount1.mmAppliedWithholdingTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmAppliedWithholdingTax
	 * InterestAmount2.mmAppliedWithholdingTax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the tax on interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Interest, Optional<Tax>> mmInterestTax = new MMBusinessAssociationEnd<Interest, Optional<Tax>>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesFinancing10.mmAccruedInterestTax, InterestAmount1.mmAppliedWithholdingTax, InterestAmount2.mmAppliedWithholdingTax);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestTax";
			definition = "Specifies the tax on interest.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Tax.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Tax.mmObject();
		}

		@Override
		public Optional<Tax> getValue(Interest obj) {
			return obj.getInterestTax();
		}

		@Override
		public void setValue(Interest obj, Optional<Tax> value) {
			obj.setInterestTax(value.orElse(null));
		}
	};
	protected DebitCreditCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the interest is a debit or credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Interest, DebitCreditCode> mmCreditDebitIndicator = new MMBusinessAttribute<Interest, DebitCreditCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the interest is a debit or credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		@Override
		public DebitCreditCode getValue(Interest obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(Interest obj, DebitCreditCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	protected CashEntry cashEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmInterest
	 * CashEntry.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry which contains the interest."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Interest, CashEntry> mmCashEntry = new MMBusinessAssociationEnd<Interest, CashEntry>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashEntry";
			definition = "Entry which contains the interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CashEntry.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashEntry.mmObject();
		}

		@Override
		public CashEntry getValue(Interest obj) {
			return obj.getCashEntry();
		}

		@Override
		public void setValue(Interest obj, CashEntry value) {
			obj.setCashEntry(value);
		}
	};
	protected ISODate paymentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmValueDate
	 * InterestAmount1.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestResult1#mmValueDate
	 * InterestResult1.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestAmount2#mmValueDate
	 * InterestAmount2.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestStatement4#mmValueDate
	 * InterestStatement4.mmValueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the next interest payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Interest, ISODate> mmPaymentDate = new MMBusinessAttribute<Interest, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(InterestAmount1.mmValueDate, InterestResult1.mmValueDate, InterestAmount2.mmValueDate, InterestStatement4.mmValueDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentDate";
			definition = "Date of the next interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Interest obj) {
			return obj.getPaymentDate();
		}

		@Override
		public void setValue(Interest obj, ISODate value) {
			obj.setPaymentDate(value);
		}
	};
	protected InterestManagement relatedInterestManagement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestManagement#mmInterest
	 * InterestManagement.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestManagement
	 * InterestManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInterestManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Management of interest which consists into calculating the interest, requesting its payment or distributing the interest proceeds."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Interest, InterestManagement> mmRelatedInterestManagement = new MMBusinessAssociationEnd<Interest, InterestManagement>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInterestManagement";
			definition = "Management of interest which consists into calculating the interest, requesting its payment or distributing the interest proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InterestManagement.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InterestManagement.mmObject();
		}

		@Override
		public InterestManagement getValue(Interest obj) {
			return obj.getRelatedInterestManagement();
		}

		@Override
		public void setValue(Interest obj, InterestManagement value) {
			obj.setRelatedInterestManagement(value);
		}
	};
	protected UndertakingAmount relatedUndertakingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingAmount#mmInterest
	 * UndertakingAmount.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UndertakingAmount
	 * UndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedUndertakingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking amount for which an interest is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Interest, UndertakingAmount> mmRelatedUndertakingAmount = new MMBusinessAssociationEnd<Interest, UndertakingAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedUndertakingAmount";
			definition = "Undertaking amount for which an interest is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> UndertakingAmount.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> UndertakingAmount.mmObject();
		}

		@Override
		public UndertakingAmount getValue(Interest obj) {
			return obj.getRelatedUndertakingAmount();
		}

		@Override
		public void setValue(Interest obj, UndertakingAmount value) {
			obj.setRelatedUndertakingAmount(value);
		}
	};
	protected DebitCreditFacility relatedDebitCreditFacility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DebitCreditFacility#mmCashAccountInterest
	 * DebitCreditFacility.mmCashAccountInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DebitCreditFacility
	 * DebitCreditFacility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDebitCreditFacility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Debit and credit facilities on which the interest applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Interest, Optional<DebitCreditFacility>> mmRelatedDebitCreditFacility = new MMBusinessAssociationEnd<Interest, Optional<DebitCreditFacility>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedDebitCreditFacility";
			definition = "Debit and credit facilities on which the interest applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> DebitCreditFacility.mmCashAccountInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DebitCreditFacility.mmObject();
		}

		@Override
		public Optional<DebitCreditFacility> getValue(Interest obj) {
			return obj.getRelatedDebitCreditFacility();
		}

		@Override
		public void setValue(Interest obj, Optional<DebitCreditFacility> value) {
			obj.setRelatedDebitCreditFacility(value.orElse(null));
		}
	};
	protected SecuritiesSettlement securitiesSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAccruedInterest
	 * SecuritiesSettlement.mmAccruedInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities settlement process for which an accrued interest is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Interest, Optional<SecuritiesSettlement>> mmSecuritiesSettlement = new MMBusinessAssociationEnd<Interest, Optional<SecuritiesSettlement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Securities settlement process for which an accrued interest is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesSettlement.mmAccruedInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesSettlement.mmObject();
		}

		@Override
		public Optional<SecuritiesSettlement> getValue(Interest obj) {
			return obj.getSecuritiesSettlement();
		}

		@Override
		public void setValue(Interest obj, Optional<SecuritiesSettlement> value) {
			obj.setSecuritiesSettlement(value.orElse(null));
		}
	};
	protected GenericIdentification interestName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentificationForInterestName
	 * GenericIdentification.mmIdentificationForInterestName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest rate expressed as a rate name."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Interest, GenericIdentification> mmInterestName = new MMBusinessAssociationEnd<Interest, GenericIdentification>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestName";
			definition = "Interest rate expressed as a rate name.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> GenericIdentification.mmIdentificationForInterestName;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> GenericIdentification.mmObject();
		}

		@Override
		public GenericIdentification getValue(Interest obj) {
			return obj.getInterestName();
		}

		@Override
		public void setValue(Interest obj, GenericIdentification value) {
			obj.setInterestName(value);
		}
	};
	protected AssetHolding relatedAssetHolding;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmInterest
	 * AssetHolding.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetHolding
	 * AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAssetHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset holding on which interest is paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Interest, AssetHolding> mmRelatedAssetHolding = new MMBusinessAssociationEnd<Interest, AssetHolding>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAssetHolding";
			definition = "Asset holding on which interest is paid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AssetHolding.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AssetHolding.mmObject();
		}

		@Override
		public AssetHolding getValue(Interest obj) {
			return obj.getRelatedAssetHolding();
		}

		@Override
		public void setValue(Interest obj, AssetHolding value) {
			obj.setRelatedAssetHolding(value);
		}
	};
	protected Deposit deposit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Deposit#mmInterest
	 * Deposit.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Deposit Deposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deposit for which an interest is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Interest, Deposit> mmDeposit = new MMBusinessAssociationEnd<Interest, Deposit>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Deposit";
			definition = "Deposit for which an interest is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Deposit.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Deposit.mmObject();
		}

		@Override
		public Deposit getValue(Interest obj) {
			return obj.getDeposit();
		}

		@Override
		public void setValue(Interest obj, Deposit value) {
			obj.setDeposit(value);
		}
	};
	protected Balance accountBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Balance#mmInterest
	 * Balance.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance for which an interest is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Interest, Optional<Balance>> mmAccountBalance = new MMBusinessAssociationEnd<Interest, Optional<Balance>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountBalance";
			definition = "Balance for which an interest is calculated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Balance.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Balance.mmObject();
		}

		@Override
		public Optional<Balance> getValue(Interest obj) {
			return obj.getAccountBalance();
		}

		@Override
		public void setValue(Interest obj, Optional<Balance> value) {
			obj.setAccountBalance(value.orElse(null));
		}
	};
	protected AccountContract relatedAccountContract;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmInterest
	 * AccountContract.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AccountContract
	 * AccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account contract for which interest parameters are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Interest, AccountContract> mmRelatedAccountContract = new MMBusinessAssociationEnd<Interest, AccountContract>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedAccountContract";
			definition = "Account contract for which interest parameters are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> AccountContract.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> AccountContract.mmObject();
		}

		@Override
		public AccountContract getValue(Interest obj) {
			return obj.getRelatedAccountContract();
		}

		@Override
		public void setValue(Interest obj, AccountContract value) {
			obj.setRelatedAccountContract(value);
		}
	};
	protected NetAssetValueCalculation relatedNetAssetValueCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmInterest
	 * NetAssetValueCalculation.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedNetAssetValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset value calculation for which an accrued interest is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Interest, NetAssetValueCalculation> mmRelatedNetAssetValueCalculation = new MMBusinessAssociationEnd<Interest, NetAssetValueCalculation>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedNetAssetValueCalculation";
			definition = "Net asset value calculation for which an accrued interest is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> NetAssetValueCalculation.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> NetAssetValueCalculation.mmObject();
		}

		@Override
		public NetAssetValueCalculation getValue(Interest obj) {
			return obj.getRelatedNetAssetValueCalculation();
		}

		@Override
		public void setValue(Interest obj, NetAssetValueCalculation value) {
			obj.setRelatedNetAssetValueCalculation(value);
		}
	};
	protected InterestTypeCode typeOfInterest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestTypeCode
	 * InterestTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmInterestType
	 * Order17.mmInterestType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmInterestType
	 * Order18.mmInterestType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmRateType
	 * SecuredMarketTransaction4.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmRateType
	 * UnsecuredMarketTransaction4.mmRateType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of interest associated with a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Interest, InterestTypeCode> mmTypeOfInterest = new MMBusinessAttribute<Interest, InterestTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(Order17.mmInterestType, Order18.mmInterestType, SecuredMarketTransaction4.mmRateType, UnsecuredMarketTransaction4.mmRateType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TypeOfInterest";
			definition = "Specifies the type of interest associated with a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestTypeCode.mmObject();
		}

		@Override
		public InterestTypeCode getValue(Interest obj) {
			return obj.getTypeOfInterest();
		}

		@Override
		public void setValue(Interest obj, InterestTypeCode value) {
			obj.setTypeOfInterest(value);
		}
	};
	protected PaymentCard relatedPaymentCard;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentCard#mmInterest
	 * PaymentCard.mmInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentCard
	 * PaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Interest
	 * Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment card for which interest on due amounts is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Interest, PaymentCard> mmRelatedPaymentCard = new MMBusinessAssociationEnd<Interest, PaymentCard>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPaymentCard";
			definition = "Payment card for which interest on due amounts is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> PaymentCard.mmInterest;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> PaymentCard.mmObject();
		}

		@Override
		public PaymentCard getValue(Interest obj) {
			return obj.getRelatedPaymentCard();
		}

		@Override
		public void setValue(Interest obj, PaymentCard value) {
			obj.setRelatedPaymentCard(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Interest";
				definition = "Consideration, such as amount of money,  paid or received in exchange for an asset that has been invested, loaned or borrowed for a certain period. The interest is expressed as a fixed amount or percentage of the amount upon which the interest is applied.";
				associationDomain_lazy = () -> Arrays.asList(GenericIdentification.mmIdentificationForInterestName, NetAssetValueCalculation.mmInterest, Tax.mmInterest, AccountContract.mmInterest, PaymentCard.mmInterest,
						CashEntry.mmInterest, AssetHolding.mmInterest, Balance.mmInterest, SecuritiesSettlement.mmAccruedInterest, InterestCalculation.mmInterest, SecuritiesFinancing.mmInterest, CashProceedsDefinition.mmInterest,
						DebitCreditFacility.mmCashAccountInterest, UndertakingAmount.mmInterest, Deposit.mmInterest, InterestManagement.mmInterest);
				derivationElement_lazy = () -> Arrays.asList(InterestRateUsedForPaymentFormat8Choice.mmRateTypeAndAmountAndRateStatus, InterestRateUsedForPaymentFormat7Choice.mmRateTypeAndAmountAndRateStatus);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Interest.mmAccruedInterestAmount, com.tools20022.repository.entity.Interest.mmInterestCalculation, com.tools20022.repository.entity.Interest.mmAmount,
						com.tools20022.repository.entity.Interest.mmRate, com.tools20022.repository.entity.Interest.mmRelatedCashProceedsDefinition, com.tools20022.repository.entity.Interest.mmSecuritiesFinancing,
						com.tools20022.repository.entity.Interest.mmInterestTax, com.tools20022.repository.entity.Interest.mmCreditDebitIndicator, com.tools20022.repository.entity.Interest.mmCashEntry,
						com.tools20022.repository.entity.Interest.mmPaymentDate, com.tools20022.repository.entity.Interest.mmRelatedInterestManagement, com.tools20022.repository.entity.Interest.mmRelatedUndertakingAmount,
						com.tools20022.repository.entity.Interest.mmRelatedDebitCreditFacility, com.tools20022.repository.entity.Interest.mmSecuritiesSettlement, com.tools20022.repository.entity.Interest.mmInterestName,
						com.tools20022.repository.entity.Interest.mmRelatedAssetHolding, com.tools20022.repository.entity.Interest.mmDeposit, com.tools20022.repository.entity.Interest.mmAccountBalance,
						com.tools20022.repository.entity.Interest.mmRelatedAccountContract, com.tools20022.repository.entity.Interest.mmRelatedNetAssetValueCalculation, com.tools20022.repository.entity.Interest.mmTypeOfInterest,
						com.tools20022.repository.entity.Interest.mmRelatedPaymentCard);
				derivationComponent_lazy = () -> Arrays.asList(RateOrName1Choice.mmObject(), InterestRate1Choice.mmObject(), InterestAmount1.mmObject(), InterestResult1.mmObject(), InterestAmount2.mmObject(),
						InterestRateUsedForPaymentFormat8Choice.mmObject(), RateTypeAndAmountAndStatus24.mmObject(), RateTypeAndAmountAndStatus26.mmObject(), InterestRateUsedForPaymentFormat7Choice.mmObject(),
						InterestStatement4.mmObject(), InterestRateContractTerm2.mmObject(), InterestRate6Choice.mmObject(), InterestRate8Choice.mmObject(), RateTypeAndAmountAndStatus38.mmObject(), RateTypeAndAmountAndStatus37.mmObject(),
						RateTypeAndAmountAndStatus41.mmObject(), RateTypeAndAmountAndStatus40.mmObject(), RateTypeAndAmountAndStatus39.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Interest.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getAccruedInterestAmount() {
		return accruedInterestAmount;
	}

	public Interest setAccruedInterestAmount(CurrencyAndAmount accruedInterestAmount) {
		this.accruedInterestAmount = Objects.requireNonNull(accruedInterestAmount);
		return this;
	}

	public List<InterestCalculation> getInterestCalculation() {
		return interestCalculation == null ? interestCalculation = new ArrayList<>() : interestCalculation;
	}

	public Interest setInterestCalculation(List<InterestCalculation> interestCalculation) {
		this.interestCalculation = Objects.requireNonNull(interestCalculation);
		return this;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public Interest setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public Interest setRate(PercentageRate rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}

	public List<CashProceedsDefinition> getRelatedCashProceedsDefinition() {
		return relatedCashProceedsDefinition == null ? relatedCashProceedsDefinition = new ArrayList<>() : relatedCashProceedsDefinition;
	}

	public Interest setRelatedCashProceedsDefinition(List<CashProceedsDefinition> relatedCashProceedsDefinition) {
		this.relatedCashProceedsDefinition = Objects.requireNonNull(relatedCashProceedsDefinition);
		return this;
	}

	public List<SecuritiesFinancing> getSecuritiesFinancing() {
		return securitiesFinancing == null ? securitiesFinancing = new ArrayList<>() : securitiesFinancing;
	}

	public Interest setSecuritiesFinancing(List<SecuritiesFinancing> securitiesFinancing) {
		this.securitiesFinancing = Objects.requireNonNull(securitiesFinancing);
		return this;
	}

	public Optional<Tax> getInterestTax() {
		return interestTax == null ? Optional.empty() : Optional.of(interestTax);
	}

	public Interest setInterestTax(Tax interestTax) {
		this.interestTax = interestTax;
		return this;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public Interest setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public CashEntry getCashEntry() {
		return cashEntry;
	}

	public Interest setCashEntry(CashEntry cashEntry) {
		this.cashEntry = Objects.requireNonNull(cashEntry);
		return this;
	}

	public ISODate getPaymentDate() {
		return paymentDate;
	}

	public Interest setPaymentDate(ISODate paymentDate) {
		this.paymentDate = Objects.requireNonNull(paymentDate);
		return this;
	}

	public InterestManagement getRelatedInterestManagement() {
		return relatedInterestManagement;
	}

	public Interest setRelatedInterestManagement(InterestManagement relatedInterestManagement) {
		this.relatedInterestManagement = Objects.requireNonNull(relatedInterestManagement);
		return this;
	}

	public UndertakingAmount getRelatedUndertakingAmount() {
		return relatedUndertakingAmount;
	}

	public Interest setRelatedUndertakingAmount(UndertakingAmount relatedUndertakingAmount) {
		this.relatedUndertakingAmount = Objects.requireNonNull(relatedUndertakingAmount);
		return this;
	}

	public Optional<DebitCreditFacility> getRelatedDebitCreditFacility() {
		return relatedDebitCreditFacility == null ? Optional.empty() : Optional.of(relatedDebitCreditFacility);
	}

	public Interest setRelatedDebitCreditFacility(DebitCreditFacility relatedDebitCreditFacility) {
		this.relatedDebitCreditFacility = relatedDebitCreditFacility;
		return this;
	}

	public Optional<SecuritiesSettlement> getSecuritiesSettlement() {
		return securitiesSettlement == null ? Optional.empty() : Optional.of(securitiesSettlement);
	}

	public Interest setSecuritiesSettlement(SecuritiesSettlement securitiesSettlement) {
		this.securitiesSettlement = securitiesSettlement;
		return this;
	}

	public GenericIdentification getInterestName() {
		return interestName;
	}

	public Interest setInterestName(GenericIdentification interestName) {
		this.interestName = Objects.requireNonNull(interestName);
		return this;
	}

	public AssetHolding getRelatedAssetHolding() {
		return relatedAssetHolding;
	}

	public Interest setRelatedAssetHolding(AssetHolding relatedAssetHolding) {
		this.relatedAssetHolding = Objects.requireNonNull(relatedAssetHolding);
		return this;
	}

	public Deposit getDeposit() {
		return deposit;
	}

	public Interest setDeposit(Deposit deposit) {
		this.deposit = Objects.requireNonNull(deposit);
		return this;
	}

	public Optional<Balance> getAccountBalance() {
		return accountBalance == null ? Optional.empty() : Optional.of(accountBalance);
	}

	public Interest setAccountBalance(Balance accountBalance) {
		this.accountBalance = accountBalance;
		return this;
	}

	public AccountContract getRelatedAccountContract() {
		return relatedAccountContract;
	}

	public Interest setRelatedAccountContract(AccountContract relatedAccountContract) {
		this.relatedAccountContract = Objects.requireNonNull(relatedAccountContract);
		return this;
	}

	public NetAssetValueCalculation getRelatedNetAssetValueCalculation() {
		return relatedNetAssetValueCalculation;
	}

	public Interest setRelatedNetAssetValueCalculation(NetAssetValueCalculation relatedNetAssetValueCalculation) {
		this.relatedNetAssetValueCalculation = Objects.requireNonNull(relatedNetAssetValueCalculation);
		return this;
	}

	public InterestTypeCode getTypeOfInterest() {
		return typeOfInterest;
	}

	public Interest setTypeOfInterest(InterestTypeCode typeOfInterest) {
		this.typeOfInterest = Objects.requireNonNull(typeOfInterest);
		return this;
	}

	public PaymentCard getRelatedPaymentCard() {
		return relatedPaymentCard;
	}

	public Interest setRelatedPaymentCard(PaymentCard relatedPaymentCard) {
		this.relatedPaymentCard = Objects.requireNonNull(relatedPaymentCard);
		return this;
	}
}