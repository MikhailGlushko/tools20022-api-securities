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
import com.tools20022.repository.codeset.CollateralType1Code;
import com.tools20022.repository.codeset.InterestComputationMethod2Code;
import com.tools20022.repository.codeset.SettlementStatus2Code;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details about the valuation of each piece of collateral that is
 * posted.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmCollateralIdentification
 * CollateralValuation5.mmCollateralIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmCollateralType
 * CollateralValuation5.mmCollateralType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmSettlementStatus
 * CollateralValuation5.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmNumberOfDaysAccrued
 * CollateralValuation5.mmNumberOfDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmValuationAmounts
 * CollateralValuation5.mmValuationAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmDayCountBasis
 * CollateralValuation5.mmDayCountBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmExchangeRate
 * CollateralValuation5.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmCurrencyHaircut
 * CollateralValuation5.mmCurrencyHaircut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmAdjustedRate
 * CollateralValuation5.mmAdjustedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmSecuritiesCollateral
 * CollateralValuation5.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmCashCollateral
 * CollateralValuation5.mmCashCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmOtherCollateral
 * CollateralValuation5.mmOtherCollateral}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralValuation
 * CollateralValuation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralValuation5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details about the valuation of each piece of collateral that is posted."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CollateralValuation5", propOrder = {"collateralIdentification", "collateralType", "settlementStatus", "numberOfDaysAccrued", "valuationAmounts", "dayCountBasis", "exchangeRate", "currencyHaircut", "adjustedRate",
		"securitiesCollateral", "cashCollateral", "otherCollateral"})
public class CollateralValuation5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text collateralIdentification;
	/**
	 * Provides the identification of the valued collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5
	 * CollateralValuation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the identification of the valued collateral."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CollateralValuation5.mmObject();
			isDerived = false;
			xmlTag = "CollId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIdentification";
			definition = "Provides the identification of the valued collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CollateralType1Code collateralType;
	/**
	 * Specifies the type of collateral used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralType1Code
	 * CollateralType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralType
	 * Collateral.mmCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5
	 * CollateralValuation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of collateral used."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralType;
			componentContext_lazy = () -> CollateralValuation5.mmObject();
			isDerived = false;
			xmlTag = "CollTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralType";
			definition = "Specifies the type of collateral used.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralType1Code.mmObject();
		}
	};
	protected SettlementStatus2Code settlementStatus;
	/**
	 * Provides the status of settlement of an instruction/financial instrument
	 * movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatus2Code
	 * SettlementStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmSettlement
	 * CollateralStatus.mmSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5
	 * CollateralValuation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of settlement of an instruction/financial instrument movement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CollateralStatus.mmSettlement;
			componentContext_lazy = () -> CollateralValuation5.mmObject();
			isDerived = false;
			xmlTag = "SttlmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatus";
			definition = "Provides the status of settlement of an instruction/financial instrument movement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementStatus2Code.mmObject();
		}
	};
	protected Number numberOfDaysAccrued;
	/**
	 * Specifies the number of days used for interest calculation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
	 * DateTimePeriod.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5
	 * CollateralValuation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfDaysAcrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDaysAccrued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of days used for interest calculation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfDaysAccrued = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> CollateralValuation5.mmObject();
			isDerived = false;
			xmlTag = "NbOfDaysAcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDaysAccrued";
			definition = "Specifies the number of days used for interest calculation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected CollateralAmount1 valuationAmounts;
	/**
	 * Provides details on the collateral valuation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralAmount1
	 * CollateralAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmCollateral
	 * CollateralValuation.mmCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5
	 * CollateralValuation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the collateral valuation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmValuationAmounts = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CollateralValuation.mmCollateral;
			componentContext_lazy = () -> CollateralValuation5.mmObject();
			isDerived = false;
			xmlTag = "ValtnAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationAmounts";
			definition = "Provides details on the collateral valuation.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CollateralAmount1.mmObject();
		}
	};
	protected InterestComputationMethod2Code dayCountBasis;
	/**
	 * Specifies the computation method of (accrued) interest of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code
	 * InterestComputationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDayCountBasis
	 * InterestCalculation.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5
	 * CollateralValuation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DayCntBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DayCountBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the computation method of (accrued) interest of the security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDayCountBasis = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmDayCountBasis;
			componentContext_lazy = () -> CollateralValuation5.mmObject();
			isDerived = false;
			xmlTag = "DayCntBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DayCountBasis";
			definition = "Specifies the computation method of (accrued) interest of the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestComputationMethod2Code.mmObject();
		}
	};
	protected BaseOneRate exchangeRate;
	/**
	 * Specifies the exchange rate between the currency of the collateral and
	 * the reporting currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmExchangeRate
	 * CurrencyExchange.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5
	 * CollateralValuation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the exchange rate between the currency of the collateral and the reporting currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> CollateralValuation5.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "Specifies the exchange rate between the currency of the collateral and the reporting currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	protected BaseOneRate currencyHaircut;
	/**
	 * Specifies the haircut or valuation factor on the currency of the
	 * collateral expressed as a percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.HaircutValuation#mmHaircut
	 * HaircutValuation.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5
	 * CollateralValuation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyHrcut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyHaircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the haircut or valuation factor on the currency of the collateral expressed as a percentage."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrencyHaircut = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> HaircutValuation.mmHaircut;
			componentContext_lazy = () -> CollateralValuation5.mmObject();
			isDerived = false;
			xmlTag = "CcyHrcut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyHaircut";
			definition = "Specifies the haircut or valuation factor on the currency of the collateral expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	protected BaseOneRate adjustedRate;
	/**
	 * Percentage by which the collateral amount needs to be adjusted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmAdjustedRate
	 * CollateralValuation.mmAdjustedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5
	 * CollateralValuation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdjstdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage by which the collateral amount needs to be adjusted."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdjustedRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CollateralValuation.mmAdjustedRate;
			componentContext_lazy = () -> CollateralValuation5.mmObject();
			isDerived = false;
			xmlTag = "AdjstdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustedRate";
			definition = "Percentage by which the collateral amount needs to be adjusted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	protected SecuritiesCollateral6 securitiesCollateral;
	/**
	 * Provides details on the securities collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6
	 * SecuritiesCollateral6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5
	 * CollateralValuation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the securities collateral."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesCollateral = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> CollateralValuation5.mmObject();
			isDerived = false;
			xmlTag = "SctiesColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCollateral";
			definition = "Provides details on the securities collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesCollateral6.mmObject();
		}
	};
	protected CashCollateral4 cashCollateral;
	/**
	 * Provides details on the cash collateral valuation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashCollateral4
	 * CashCollateral4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Money Money}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5
	 * CollateralValuation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the cash collateral valuation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashCollateral = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Money.mmObject();
			componentContext_lazy = () -> CollateralValuation5.mmObject();
			isDerived = false;
			xmlTag = "CshColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashCollateral";
			definition = "Provides details on the cash collateral valuation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashCollateral4.mmObject();
		}
	};
	protected OtherCollateral6 otherCollateral;
	/**
	 * Provides details on other collateral valuation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherCollateral6
	 * OtherCollateral6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5
	 * CollateralValuation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on other collateral valuation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherCollateral = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Asset.mmObject();
			componentContext_lazy = () -> CollateralValuation5.mmObject();
			isDerived = false;
			xmlTag = "OthrColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCollateral";
			definition = "Provides details on other collateral valuation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OtherCollateral6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CollateralValuation5.mmCollateralIdentification, CollateralValuation5.mmCollateralType, CollateralValuation5.mmSettlementStatus, CollateralValuation5.mmNumberOfDaysAccrued,
						CollateralValuation5.mmValuationAmounts, CollateralValuation5.mmDayCountBasis, CollateralValuation5.mmExchangeRate, CollateralValuation5.mmCurrencyHaircut, CollateralValuation5.mmAdjustedRate,
						CollateralValuation5.mmSecuritiesCollateral, CollateralValuation5.mmCashCollateral, CollateralValuation5.mmOtherCollateral);
				trace_lazy = () -> CollateralValuation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralValuation5";
				definition = "Provides details about the valuation of each piece of collateral that is posted.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CollId")
	public Max35Text getCollateralIdentification() {
		return collateralIdentification;
	}

	public void setCollateralIdentification(Max35Text collateralIdentification) {
		this.collateralIdentification = collateralIdentification;
	}

	@XmlElement(name = "CollTp", required = true)
	public CollateralType1Code getCollateralType() {
		return collateralType;
	}

	public void setCollateralType(CollateralType1Code collateralType) {
		this.collateralType = collateralType;
	}

	@XmlElement(name = "SttlmSts", required = true)
	public SettlementStatus2Code getSettlementStatus() {
		return settlementStatus;
	}

	public void setSettlementStatus(SettlementStatus2Code settlementStatus) {
		this.settlementStatus = settlementStatus;
	}

	@XmlElement(name = "NbOfDaysAcrd", required = true)
	public Number getNumberOfDaysAccrued() {
		return numberOfDaysAccrued;
	}

	public void setNumberOfDaysAccrued(Number numberOfDaysAccrued) {
		this.numberOfDaysAccrued = numberOfDaysAccrued;
	}

	@XmlElement(name = "ValtnAmts", required = true)
	public CollateralAmount1 getValuationAmounts() {
		return valuationAmounts;
	}

	public void setValuationAmounts(com.tools20022.repository.msg.CollateralAmount1 valuationAmounts) {
		this.valuationAmounts = valuationAmounts;
	}

	@XmlElement(name = "DayCntBsis", required = true)
	public InterestComputationMethod2Code getDayCountBasis() {
		return dayCountBasis;
	}

	public void setDayCountBasis(InterestComputationMethod2Code dayCountBasis) {
		this.dayCountBasis = dayCountBasis;
	}

	@XmlElement(name = "XchgRate")
	public BaseOneRate getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BaseOneRate exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	@XmlElement(name = "CcyHrcut")
	public BaseOneRate getCurrencyHaircut() {
		return currencyHaircut;
	}

	public void setCurrencyHaircut(BaseOneRate currencyHaircut) {
		this.currencyHaircut = currencyHaircut;
	}

	@XmlElement(name = "AdjstdRate")
	public BaseOneRate getAdjustedRate() {
		return adjustedRate;
	}

	public void setAdjustedRate(BaseOneRate adjustedRate) {
		this.adjustedRate = adjustedRate;
	}

	@XmlElement(name = "SctiesColl")
	public SecuritiesCollateral6 getSecuritiesCollateral() {
		return securitiesCollateral;
	}

	public void setSecuritiesCollateral(com.tools20022.repository.msg.SecuritiesCollateral6 securitiesCollateral) {
		this.securitiesCollateral = securitiesCollateral;
	}

	@XmlElement(name = "CshColl")
	public CashCollateral4 getCashCollateral() {
		return cashCollateral;
	}

	public void setCashCollateral(com.tools20022.repository.msg.CashCollateral4 cashCollateral) {
		this.cashCollateral = cashCollateral;
	}

	@XmlElement(name = "OthrColl")
	public OtherCollateral6 getOtherCollateral() {
		return otherCollateral;
	}

	public void setOtherCollateral(com.tools20022.repository.msg.OtherCollateral6 otherCollateral) {
		this.otherCollateral = otherCollateral;
	}
}