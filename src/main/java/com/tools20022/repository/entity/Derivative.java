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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.AssetClassAttributes1Choice;
import com.tools20022.repository.choice.CommodityDerivate2Choice;
import com.tools20022.repository.choice.Derivative2Choice;
import com.tools20022.repository.choice.EquityDerivative3Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Specifies the parameters of a derivative instrument based on a specific
 * asset.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Derivative" src="doc-files/Derivative.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Derivative#mmUnderlyingAsset
 * Derivative.mmUnderlyingAsset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Derivative#mmNotionalCurrencyAndAmount
 * Derivative.mmNotionalCurrencyAndAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Derivative#mmDerivativeCovered
 * Derivative.mmDerivativeCovered}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#mmExerciseDate
 * Derivative.mmExerciseDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Derivative#mmInterestIncludedInPrice
 * Derivative.mmInterestIncludedInPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#mmTick
 * Derivative.mmTick}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#mmExercisePrice
 * Derivative.mmExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Derivative#mmNotionalCurrency
 * Derivative.mmNotionalCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#mmVersionNumber
 * Derivative.mmVersionNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmDerivative
 * Asset.mmDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmDerivative
 * SecuritiesPricing.mmDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedFuture
 * SecuritiesPricing.mmRelatedFuture}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassAttributes1Choice#mmBoth
 * AssetClassAttributes1Choice.mmBoth}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AssetClass2#mmCommodity
 * AssetClass2.mmCommodity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AssetClass2#mmInterest
 * AssetClass2.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AssetClass2#mmForeignExchange
 * AssetClass2.mmForeignExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmAssetClassSpecificAttributes
 * DerivativeInstrument6.mmAssetClassSpecificAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Derivative2Choice#mmEmissionAllowance
 * Derivative2Choice.mmEmissionAllowance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Option Option}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Future Future}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Swaps Swaps}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeBasicAttributes1
 * DerivativeBasicAttributes1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FutureOrOptionDetails1
 * FutureOrOptionDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AssetClassAttributes1Choice
 * AssetClassAttributes1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeInterest2
 * DerivativeInterest2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AssetClassAttributes1
 * AssetClassAttributes1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeForeignExchange2
 * DerivativeForeignExchange2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeInterest3
 * DerivativeInterest3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeForeignExchange3
 * DerivativeForeignExchange3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeInstrument5
 * DerivativeInstrument5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EquityDerivative2
 * EquityDerivative2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.EquityDerivative3Choice
 * EquityDerivative3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeDerivative2
 * ForeignExchangeDerivative2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContractForDifference2
 * ContractForDifference2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestRateDerivative5
 * InterestRateDerivative5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BondDerivative2
 * BondDerivative2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommodityDerivate4
 * CommodityDerivate4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CommodityDerivate2Choice
 * CommodityDerivate2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeInstrument6
 * DerivativeInstrument6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Derivative2Choice
 * Derivative2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4
 * UnsecuredMarketTransaction4}</li>
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
 * "Derivative"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the parameters of a derivative instrument based on a specific asset."
 * </li>
 * </ul>
 */
public class Derivative extends Asset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Asset> underlyingAsset;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmDerivative
	 * Asset.mmDerivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmUnderlyingInstrumentAssetClass
	 * TransparencyDataReport10.mmUnderlyingInstrumentAssetClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#mmUnderlyingInstrument
	 * DerivativeInstrument5.mmUnderlyingInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EquityDerivative2#mmUnderlyingType
	 * EquityDerivative2.mmUnderlyingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractForDifference2#mmUnderlyingType
	 * ContractForDifference2.mmUnderlyingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InterestRateDerivative5#mmUnderlyingType
	 * InterestRateDerivative5.mmUnderlyingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmUnderlyingInstrument
	 * DerivativeInstrument6.mmUnderlyingInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Derivative2Choice#mmCommodity
	 * Derivative2Choice.mmCommodity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Derivative2Choice#mmInterestRate
	 * Derivative2Choice.mmInterestRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Derivative2Choice#mmForeignExchange
	 * Derivative2Choice.mmForeignExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Derivative2Choice#mmEquity
	 * Derivative2Choice.mmEquity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingAsset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the underlying asset of the derivative."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Derivative, List<Asset>> mmUnderlyingAsset = new MMBusinessAssociationEnd<Derivative, List<Asset>>() {
		{
			derivation_lazy = () -> Arrays.asList(TransparencyDataReport10.mmUnderlyingInstrumentAssetClass, DerivativeInstrument5.mmUnderlyingInstrument, EquityDerivative2.mmUnderlyingType, ContractForDifference2.mmUnderlyingType,
					InterestRateDerivative5.mmUnderlyingType, DerivativeInstrument6.mmUnderlyingInstrument, Derivative2Choice.mmCommodity, Derivative2Choice.mmInterestRate, Derivative2Choice.mmForeignExchange, Derivative2Choice.mmEquity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnderlyingAsset";
			definition = "Specifies the underlying asset of the derivative.";
			minOccurs = 0;
			opposite_lazy = () -> Asset.mmDerivative;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Asset.mmObject();
		}

		@Override
		public List<Asset> getValue(Derivative obj) {
			return obj.getUnderlyingAsset();
		}

		@Override
		public void setValue(Derivative obj, List<Asset> value) {
			obj.setUnderlyingAsset(value);
		}
	};
	protected CurrencyAndAmount notionalCurrencyAndAmount;
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
	 * {@linkplain com.tools20022.repository.msg.DerivativeBasicAttributes1#mmNotionalCurrencyAndAmount
	 * DerivativeBasicAttributes1.mmNotionalCurrencyAndAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalCurrencyAndAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount underlying a financial derivatives contract necessary for calculating payments or receipts."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Derivative, CurrencyAndAmount> mmNotionalCurrencyAndAmount = new MMBusinessAttribute<Derivative, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(DerivativeBasicAttributes1.mmNotionalCurrencyAndAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotionalCurrencyAndAmount";
			definition = "Amount underlying a financial derivatives contract necessary for calculating payments or receipts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Derivative obj) {
			return obj.getNotionalCurrencyAndAmount();
		}

		@Override
		public void setValue(Derivative obj, CurrencyAndAmount value) {
			obj.setNotionalCurrencyAndAmount(value);
		}
	};
	protected YesNoIndicator derivativeCovered;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmDerivativeCovered
	 * Order17.mmDerivativeCovered}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmDerivativeCovered
	 * Order18.mmDerivativeCovered}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 203</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativeCovered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the derivative product is covered or not by an underlying financial instrument position."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Derivative, YesNoIndicator> mmDerivativeCovered = new MMBusinessAttribute<Derivative, YesNoIndicator>() {
		{
			derivation_lazy = () -> Arrays.asList(Order17.mmDerivativeCovered, Order18.mmDerivativeCovered);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "203"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DerivativeCovered";
			definition = "Indicates whether the derivative product is covered or not by an underlying financial instrument position.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Derivative obj) {
			return obj.getDerivativeCovered();
		}

		@Override
		public void setValue(Derivative obj, YesNoIndicator value) {
			obj.setDerivativeCovered(value);
		}
	};
	protected ISODateTime exerciseDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument5#mmExpiryDate
	 * DerivativeInstrument5.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInstrument6#mmExpiryDate
	 * DerivativeInstrument6.mmExpiryDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExerciseDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the derivative is exercised."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Derivative, ISODateTime> mmExerciseDate = new MMBusinessAttribute<Derivative, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(DerivativeInstrument5.mmExpiryDate, DerivativeInstrument6.mmExpiryDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExerciseDate";
			definition = "Date on which the derivative is exercised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(Derivative obj) {
			return obj.getExerciseDate();
		}

		@Override
		public void setValue(Derivative obj, ISODateTime value) {
			obj.setExerciseDate(value);
		}
	};
	protected YesNoIndicator interestIncludedInPrice;
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
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestIncludedInPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the given derivative price includes a prorated accrued interest component."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Derivative, YesNoIndicator> mmInterestIncludedInPrice = new MMBusinessAttribute<Derivative, YesNoIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterestIncludedInPrice";
			definition = "Indicates whether the given derivative price includes a prorated accrued interest component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Derivative obj) {
			return obj.getInterestIncludedInPrice();
		}

		@Override
		public void setValue(Derivative obj, YesNoIndicator value) {
			obj.setInterestIncludedInPrice(value);
		}
	};
	protected SecuritiesPricing tick;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedFuture
	 * SecuritiesPricing.mmRelatedFuture}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tick"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum price increment with which the contract may be traded."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Derivative, SecuritiesPricing> mmTick = new MMBusinessAssociationEnd<Derivative, SecuritiesPricing>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tick";
			definition = "Minimum price increment with which the contract may be traded.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmRelatedFuture;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(Derivative obj) {
			return obj.getTick();
		}

		@Override
		public void setValue(Derivative obj, SecuritiesPricing value) {
			obj.setTick(value);
		}
	};
	protected SecuritiesPricing exercisePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmDerivative
	 * SecuritiesPricing.mmDerivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmExercisePrice
	 * FinancialInstrumentAttributes44.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmExercisePrice
	 * FinancialInstrumentAttributes63.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmExercisePrice
	 * FinancialInstrumentAttributes64.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmExercisePrice
	 * FinancialInstrumentAttributes91.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmExercisePrice
	 * FinancialInstrumentAttributes92.mmExercisePrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExercisePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Predetermined price at which the holder of a derivative will have to buy or sell the underlying instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Derivative, SecuritiesPricing> mmExercisePrice = new MMBusinessAssociationEnd<Derivative, SecuritiesPricing>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes44.mmExercisePrice, FinancialInstrumentAttributes63.mmExercisePrice, FinancialInstrumentAttributes64.mmExercisePrice,
					FinancialInstrumentAttributes91.mmExercisePrice, FinancialInstrumentAttributes92.mmExercisePrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExercisePrice";
			definition = "Predetermined price at which the holder of a derivative will have to buy or sell the underlying instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPricing.mmDerivative;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPricing.mmObject();
		}

		@Override
		public SecuritiesPricing getValue(Derivative obj) {
			return obj.getExercisePrice();
		}

		@Override
		public void setValue(Derivative obj, SecuritiesPricing value) {
			obj.setExercisePrice(value);
		}
	};
	protected CurrencyCode notionalCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#mmNotionalCurrency
	 * SecurityInstrumentDescription9.mmNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInterest2#mmOtherNotionalCurrency
	 * DerivativeInterest2.mmOtherNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11#mmNotionalCurrency
	 * SecurityInstrumentDescription11.mmNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeForeignExchange2#mmOtherNotionalCurrency
	 * DerivativeForeignExchange2.mmOtherNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeInterest3#mmOtherNotionalCurrency
	 * DerivativeInterest3.mmOtherNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeForeignExchange3#mmOtherNotionalCurrency
	 * DerivativeForeignExchange3.mmOtherNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapSingleName2#mmNotionalCurrency
	 * CreditDefaultSwapSingleName2.mmNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2#mmNotionalCurrency
	 * CreditDefaultSwapIndex2.mmNotionalCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommodityDerivate4#mmNotionalCurrency
	 * CommodityDerivate4.mmNotionalCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency of the underlying a financial derivatives contract necessary for calculating payments or receipts."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Derivative, CurrencyCode> mmNotionalCurrency = new MMBusinessAttribute<Derivative, CurrencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityInstrumentDescription9.mmNotionalCurrency, DerivativeInterest2.mmOtherNotionalCurrency, SecurityInstrumentDescription11.mmNotionalCurrency,
					DerivativeForeignExchange2.mmOtherNotionalCurrency, DerivativeInterest3.mmOtherNotionalCurrency, DerivativeForeignExchange3.mmOtherNotionalCurrency, CreditDefaultSwapSingleName2.mmNotionalCurrency,
					CreditDefaultSwapIndex2.mmNotionalCurrency, CommodityDerivate4.mmNotionalCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotionalCurrency";
			definition = "Currency of the underlying a financial derivatives contract necessary for calculating payments or receipts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(Derivative obj) {
			return obj.getNotionalCurrency();
		}

		@Override
		public void setValue(Derivative obj, CurrencyCode value) {
			obj.setNotionalCurrency(value);
		}
	};
	protected Number versionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmVersionNumber
	 * FinancialInstrumentAttributes44.mmVersionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditDefaultSwapIndex2#mmVersion
	 * CreditDefaultSwapIndex2.mmVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VersionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number allocated by options exchanges to record that an option has undergone a change in its contract specifications (particularly adjustment of the strike price)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Derivative, Number> mmVersionNumber = new MMBusinessAttribute<Derivative, Number>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes44.mmVersionNumber, CreditDefaultSwapIndex2.mmVersion);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VersionNumber";
			definition = "Number allocated by options exchanges to record that an option has undergone a change in its contract specifications (particularly adjustment of the strike price)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Derivative obj) {
			return obj.getVersionNumber();
		}

		@Override
		public void setValue(Derivative obj, Number value) {
			obj.setVersionNumber(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Derivative";
				definition = "Specifies the parameters of a derivative instrument based on a specific asset.";
				associationDomain_lazy = () -> Arrays.asList(Asset.mmDerivative, SecuritiesPricing.mmDerivative, SecuritiesPricing.mmRelatedFuture);
				derivationElement_lazy = () -> Arrays.asList(AssetClassAttributes1Choice.mmBoth, AssetClass2.mmCommodity, AssetClass2.mmInterest, AssetClass2.mmForeignExchange, DerivativeInstrument6.mmAssetClassSpecificAttributes,
						Derivative2Choice.mmEmissionAllowance);
				subType_lazy = () -> Arrays.asList(Option.mmObject(), Future.mmObject(), Swaps.mmObject());
				superType_lazy = () -> Asset.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Derivative.mmUnderlyingAsset, com.tools20022.repository.entity.Derivative.mmNotionalCurrencyAndAmount,
						com.tools20022.repository.entity.Derivative.mmDerivativeCovered, com.tools20022.repository.entity.Derivative.mmExerciseDate, com.tools20022.repository.entity.Derivative.mmInterestIncludedInPrice,
						com.tools20022.repository.entity.Derivative.mmTick, com.tools20022.repository.entity.Derivative.mmExercisePrice, com.tools20022.repository.entity.Derivative.mmNotionalCurrency,
						com.tools20022.repository.entity.Derivative.mmVersionNumber);
				derivationComponent_lazy = () -> Arrays.asList(DerivativeBasicAttributes1.mmObject(), FutureOrOptionDetails1.mmObject(), AssetClassAttributes1Choice.mmObject(), DerivativeInterest2.mmObject(),
						AssetClassAttributes1.mmObject(), DerivativeForeignExchange2.mmObject(), DerivativeInterest3.mmObject(), DerivativeForeignExchange3.mmObject(), DerivativeInstrument5.mmObject(), EquityDerivative2.mmObject(),
						EquityDerivative3Choice.mmObject(), ForeignExchangeDerivative2.mmObject(), ContractForDifference2.mmObject(), InterestRateDerivative5.mmObject(), BondDerivative2.mmObject(), CommodityDerivate4.mmObject(),
						CommodityDerivate2Choice.mmObject(), DerivativeInstrument6.mmObject(), Derivative2Choice.mmObject(), UnsecuredMarketTransaction4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Derivative.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Asset> getUnderlyingAsset() {
		return underlyingAsset == null ? underlyingAsset = new ArrayList<>() : underlyingAsset;
	}

	public Derivative setUnderlyingAsset(List<Asset> underlyingAsset) {
		this.underlyingAsset = Objects.requireNonNull(underlyingAsset);
		return this;
	}

	public CurrencyAndAmount getNotionalCurrencyAndAmount() {
		return notionalCurrencyAndAmount;
	}

	public Derivative setNotionalCurrencyAndAmount(CurrencyAndAmount notionalCurrencyAndAmount) {
		this.notionalCurrencyAndAmount = Objects.requireNonNull(notionalCurrencyAndAmount);
		return this;
	}

	public YesNoIndicator getDerivativeCovered() {
		return derivativeCovered;
	}

	public Derivative setDerivativeCovered(YesNoIndicator derivativeCovered) {
		this.derivativeCovered = Objects.requireNonNull(derivativeCovered);
		return this;
	}

	public ISODateTime getExerciseDate() {
		return exerciseDate;
	}

	public Derivative setExerciseDate(ISODateTime exerciseDate) {
		this.exerciseDate = Objects.requireNonNull(exerciseDate);
		return this;
	}

	public YesNoIndicator getInterestIncludedInPrice() {
		return interestIncludedInPrice;
	}

	public Derivative setInterestIncludedInPrice(YesNoIndicator interestIncludedInPrice) {
		this.interestIncludedInPrice = Objects.requireNonNull(interestIncludedInPrice);
		return this;
	}

	public SecuritiesPricing getTick() {
		return tick;
	}

	public Derivative setTick(SecuritiesPricing tick) {
		this.tick = Objects.requireNonNull(tick);
		return this;
	}

	public SecuritiesPricing getExercisePrice() {
		return exercisePrice;
	}

	public Derivative setExercisePrice(SecuritiesPricing exercisePrice) {
		this.exercisePrice = Objects.requireNonNull(exercisePrice);
		return this;
	}

	public CurrencyCode getNotionalCurrency() {
		return notionalCurrency;
	}

	public Derivative setNotionalCurrency(CurrencyCode notionalCurrency) {
		this.notionalCurrency = Objects.requireNonNull(notionalCurrency);
		return this;
	}

	public Number getVersionNumber() {
		return versionNumber;
	}

	public Derivative setVersionNumber(Number versionNumber) {
		this.versionNumber = Objects.requireNonNull(versionNumber);
		return this;
	}
}