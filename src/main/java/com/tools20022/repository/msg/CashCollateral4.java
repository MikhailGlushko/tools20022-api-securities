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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DepositType1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details about the cash posted as collateral.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral4#mmAssetNumber
 * CashCollateral4.mmAssetNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashCollateral4#mmDepositAmount
 * CashCollateral4.mmDepositAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral4#mmDepositType
 * CashCollateral4.mmDepositType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashCollateral4#mmBlockedAmount
 * CashCollateral4.mmBlockedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral4#mmMaturityDate
 * CashCollateral4.mmMaturityDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral4#mmValueDate
 * CashCollateral4.mmValueDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral4#mmExchangeRate
 * CashCollateral4.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashCollateral4#mmCollateralValue
 * CashCollateral4.mmCollateralValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashCollateral4#mmHaircut
 * CashCollateral4.mmHaircut}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Money Money}</li>
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
 * "CashCollateral4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details about the cash posted as collateral."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashCollateral4", propOrder = {"assetNumber", "depositAmount", "depositType", "blockedAmount", "maturityDate", "valueDate", "exchangeRate", "collateralValue", "haircut"})
public class CashCollateral4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AsstNb")
	protected Max35Text assetNumber;
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
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4
	 * CashCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AsstNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the register number of the collateral deposit assigned by the central counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashCollateral4, Optional<Max35Text>> mmAssetNumber = new MMMessageAttribute<CashCollateral4, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashCollateral4.mmObject();
			isDerived = false;
			xmlTag = "AsstNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetNumber";
			definition = "Identifies the register number of the collateral deposit assigned by the central counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CashCollateral4 obj) {
			return obj.getAssetNumber();
		}

		@Override
		public void setValue(CashCollateral4 obj, Optional<Max35Text> value) {
			obj.setAssetNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "DpstAmt")
	protected ActiveCurrencyAndAmount depositAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Money#mmCashAmount
	 * Money.mmCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4
	 * CashCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the deposit."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashCollateral4, Optional<ActiveCurrencyAndAmount>> mmDepositAmount = new MMMessageAttribute<CashCollateral4, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Money.mmCashAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashCollateral4.mmObject();
			isDerived = false;
			xmlTag = "DpstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositAmount";
			definition = "Amount of the deposit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CashCollateral4 obj) {
			return obj.getDepositAmount();
		}

		@Override
		public void setValue(CashCollateral4 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setDepositAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "DpstTp")
	protected DepositType1Code depositType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DepositType1Code
	 * DepositType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deposit#mmDepositType
	 * Deposit.mmDepositType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4
	 * CashCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the deposit is fixed term or call/notice."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashCollateral4, Optional<DepositType1Code>> mmDepositType = new MMMessageAttribute<CashCollateral4, Optional<DepositType1Code>>() {
		{
			businessElementTrace_lazy = () -> Deposit.mmDepositType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashCollateral4.mmObject();
			isDerived = false;
			xmlTag = "DpstTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositType";
			definition = "Specifies whether the deposit is fixed term or call/notice.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DepositType1Code.mmObject();
		}

		@Override
		public Optional<DepositType1Code> getValue(CashCollateral4 obj) {
			return obj.getDepositType();
		}

		@Override
		public void setValue(CashCollateral4 obj, Optional<DepositType1Code> value) {
			obj.setDepositType(value.orElse(null));
		}
	};
	@XmlElement(name = "BlckdAmt")
	protected ActiveCurrencyAndAmount blockedAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Money#mmCashAmount
	 * Money.mmCashAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4
	 * CashCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount blocked by the central counterparty for any reasonable reason ( for example for judicial reasons). In this case the investor can not withdraw or distribute this collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashCollateral4, Optional<ActiveCurrencyAndAmount>> mmBlockedAmount = new MMMessageAttribute<CashCollateral4, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Money.mmCashAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashCollateral4.mmObject();
			isDerived = false;
			xmlTag = "BlckdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedAmount";
			definition = "Amount blocked by the central counterparty for any reasonable reason ( for example for judicial reasons). In this case the investor can not withdraw or distribute this collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CashCollateral4 obj) {
			return obj.getBlockedAmount();
		}

		@Override
		public void setValue(CashCollateral4 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setBlockedAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "MtrtyDt")
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
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4
	 * CashCollateral4}</li>
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
	 * definition} = "Planned final repayment date at the time of issuance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashCollateral4, Optional<ISODate>> mmMaturityDate = new MMMessageAttribute<CashCollateral4, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashCollateral4.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Planned final repayment date at the time of issuance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CashCollateral4 obj) {
			return obj.getMaturityDate();
		}

		@Override
		public void setValue(CashCollateral4 obj, Optional<ISODate> value) {
			obj.setMaturityDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ValDt")
	protected ISODate valueDate;
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
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmCollateralValuationDate
	 * CollateralValuation.mmCollateralValuationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4
	 * CashCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Valuation date of the cash taken as collateral."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashCollateral4, Optional<ISODate>> mmValueDate = new MMMessageAttribute<CashCollateral4, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> CollateralValuation.mmCollateralValuationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashCollateral4.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Valuation date of the cash taken as collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(CashCollateral4 obj) {
			return obj.getValueDate();
		}

		@Override
		public void setValue(CashCollateral4 obj, Optional<ISODate> value) {
			obj.setValueDate(value.orElse(null));
		}
	};
	@XmlElement(name = "XchgRate")
	protected BaseOneRate exchangeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmExchangeRate
	 * AssetHolding.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4
	 * CashCollateral4}</li>
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
	 * definition} = "Exchange rate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashCollateral4, Optional<BaseOneRate>> mmExchangeRate = new MMMessageAttribute<CashCollateral4, Optional<BaseOneRate>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashCollateral4.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "Exchange rate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public Optional<BaseOneRate> getValue(CashCollateral4 obj) {
			return obj.getExchangeRate();
		}

		@Override
		public void setValue(CashCollateral4 obj, Optional<BaseOneRate> value) {
			obj.setExchangeRate(value.orElse(null));
		}
	};
	@XmlElement(name = "CollVal", required = true)
	protected ActiveCurrencyAndAmount collateralValue;
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmRiskAdjustedValue
	 * AssetHolding.mmRiskAdjustedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4
	 * CashCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the collateral after taking into account the haircut."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashCollateral4, ActiveCurrencyAndAmount> mmCollateralValue = new MMMessageAttribute<CashCollateral4, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmRiskAdjustedValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashCollateral4.mmObject();
			isDerived = false;
			xmlTag = "CollVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralValue";
			definition = "Value of the collateral after taking into account the haircut.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(CashCollateral4 obj) {
			return obj.getCollateralValue();
		}

		@Override
		public void setValue(CashCollateral4 obj, ActiveCurrencyAndAmount value) {
			obj.setCollateralValue(value);
		}
	};
	@XmlElement(name = "Hrcut")
	protected PercentageRate haircut;
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
	 * {@linkplain com.tools20022.repository.entity.HaircutValuation#mmHaircut
	 * HaircutValuation.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashCollateral4
	 * CashCollateral4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hrcut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Haircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Haircut or valuation factor on the collateral expressed as a percentage."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashCollateral4, Optional<PercentageRate>> mmHaircut = new MMMessageAttribute<CashCollateral4, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> HaircutValuation.mmHaircut;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashCollateral4.mmObject();
			isDerived = false;
			xmlTag = "Hrcut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Haircut";
			definition = "Haircut or valuation factor on the collateral expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(CashCollateral4 obj) {
			return obj.getHaircut();
		}

		@Override
		public void setValue(CashCollateral4 obj, Optional<PercentageRate> value) {
			obj.setHaircut(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashCollateral4.mmAssetNumber, com.tools20022.repository.msg.CashCollateral4.mmDepositAmount,
						com.tools20022.repository.msg.CashCollateral4.mmDepositType, com.tools20022.repository.msg.CashCollateral4.mmBlockedAmount, com.tools20022.repository.msg.CashCollateral4.mmMaturityDate,
						com.tools20022.repository.msg.CashCollateral4.mmValueDate, com.tools20022.repository.msg.CashCollateral4.mmExchangeRate, com.tools20022.repository.msg.CashCollateral4.mmCollateralValue,
						com.tools20022.repository.msg.CashCollateral4.mmHaircut);
				trace_lazy = () -> Money.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashCollateral4";
				definition = "Provides details about the cash posted as collateral.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getAssetNumber() {
		return assetNumber == null ? Optional.empty() : Optional.of(assetNumber);
	}

	public CashCollateral4 setAssetNumber(Max35Text assetNumber) {
		this.assetNumber = assetNumber;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getDepositAmount() {
		return depositAmount == null ? Optional.empty() : Optional.of(depositAmount);
	}

	public CashCollateral4 setDepositAmount(ActiveCurrencyAndAmount depositAmount) {
		this.depositAmount = depositAmount;
		return this;
	}

	public Optional<DepositType1Code> getDepositType() {
		return depositType == null ? Optional.empty() : Optional.of(depositType);
	}

	public CashCollateral4 setDepositType(DepositType1Code depositType) {
		this.depositType = depositType;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getBlockedAmount() {
		return blockedAmount == null ? Optional.empty() : Optional.of(blockedAmount);
	}

	public CashCollateral4 setBlockedAmount(ActiveCurrencyAndAmount blockedAmount) {
		this.blockedAmount = blockedAmount;
		return this;
	}

	public Optional<ISODate> getMaturityDate() {
		return maturityDate == null ? Optional.empty() : Optional.of(maturityDate);
	}

	public CashCollateral4 setMaturityDate(ISODate maturityDate) {
		this.maturityDate = maturityDate;
		return this;
	}

	public Optional<ISODate> getValueDate() {
		return valueDate == null ? Optional.empty() : Optional.of(valueDate);
	}

	public CashCollateral4 setValueDate(ISODate valueDate) {
		this.valueDate = valueDate;
		return this;
	}

	public Optional<BaseOneRate> getExchangeRate() {
		return exchangeRate == null ? Optional.empty() : Optional.of(exchangeRate);
	}

	public CashCollateral4 setExchangeRate(BaseOneRate exchangeRate) {
		this.exchangeRate = exchangeRate;
		return this;
	}

	public ActiveCurrencyAndAmount getCollateralValue() {
		return collateralValue;
	}

	public CashCollateral4 setCollateralValue(ActiveCurrencyAndAmount collateralValue) {
		this.collateralValue = Objects.requireNonNull(collateralValue);
		return this;
	}

	public Optional<PercentageRate> getHaircut() {
		return haircut == null ? Optional.empty() : Optional.of(haircut);
	}

	public CashCollateral4 setHaircut(PercentageRate haircut) {
		this.haircut = haircut;
		return this;
	}
}