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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the rates related to securities movement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails32#mmAdditionalTax
 * RateDetails32.mmAdditionalTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails32#mmChargesFees
 * RateDetails32.mmChargesFees}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails32#mmFiscalStamp
 * RateDetails32.mmFiscalStamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails32#mmGrossDividendRate
 * RateDetails32.mmGrossDividendRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails32#mmEarlySolicitationFeeRate
 * RateDetails32.mmEarlySolicitationFeeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails32#mmThirdPartyIncentiveRate
 * RateDetails32.mmThirdPartyIncentiveRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails32#mmInterestRateUsedForPayment
 * RateDetails32.mmInterestRateUsedForPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails32#mmNetDividendRate
 * RateDetails32.mmNetDividendRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails32#mmApplicableRate
 * RateDetails32.mmApplicableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails32#mmSolicitationFeeRate
 * RateDetails32.mmSolicitationFeeRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails32#mmTaxCreditRate
 * RateDetails32.mmTaxCreditRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails32#mmWithholdingTaxRate
 * RateDetails32.mmWithholdingTaxRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails32#mmSecondLevelTax
 * RateDetails32.mmSecondLevelTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails32#mmTaxOnIncome
 * RateDetails32.mmTaxOnIncome}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails32#mmTaxOnProfits
 * RateDetails32.mmTaxOnProfits}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails32#mmTaxReclaimRate
 * RateDetails32.mmTaxReclaimRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails32#mmEqualisationRate
 * RateDetails32.mmEqualisationRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails32#mmDeemedRate
 * RateDetails32.mmDeemedRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate2Rule#forRateDetails32
 * ConstraintGrossDividendRate2Rule.forRateDetails32}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate1Rule#forRateDetails32
 * ConstraintNetDividendRate1Rule.forRateDetails32}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forRateDetails32
 * ConstraintGrossDividendRate3Rule.forRateDetails32}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forRateDetails32
 * ConstraintNetDividendRate2Rule.forRateDetails32}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax3Rule#forRateDetails32
 * ConstraintSecondLevelTax3Rule.forRateDetails32}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule#forRateDetails32
 * ConstraintSecondLevelTax1Rule.forRateDetails32}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax2Rule#forRateDetails32
 * ConstraintSecondLevelTax2Rule.forRateDetails32}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintWithholdingTaxRate1Rule#forRateDetails32
 * ConstraintWithholdingTaxRate1Rule.forRateDetails32}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintWithholdingTaxRate2Rule#forRateDetails32
 * ConstraintWithholdingTaxRate2Rule.forRateDetails32}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeemedRate1Rule#forRateDetails32
 * ConstraintDeemedRate1Rule.forRateDetails32}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeemedRate2Rule#forRateDetails32
 * ConstraintDeemedRate2Rule.forRateDetails32}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RateDetails32"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the rates related to securities movement."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RateDetails32", propOrder = {"additionalTax", "chargesFees", "fiscalStamp", "grossDividendRate", "earlySolicitationFeeRate", "thirdPartyIncentiveRate", "interestRateUsedForPayment", "netDividendRate", "applicableRate",
		"solicitationFeeRate", "taxCreditRate", "withholdingTaxRate", "secondLevelTax", "taxOnIncome", "taxOnProfits", "taxReclaimRate", "equalisationRate", "deemedRate"})
public class RateDetails32 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AddtlTax")
	protected RateAndAmountFormat39Choice additionalTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat39Choice
	 * RateAndAmountFormat39Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmTaxVoucher
	 * CorporateActionDistribution.mmTaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate used for additional tax that cannot be categorised."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RateDetails32, Optional<RateAndAmountFormat39Choice>> mmAdditionalTax = new MMMessageAssociationEnd<RateDetails32, Optional<RateAndAmountFormat39Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmTaxVoucher;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails32.mmObject();
			isDerived = false;
			xmlTag = "AddtlTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTax";
			definition = "Rate used for additional tax that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat39Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat39Choice> getValue(RateDetails32 obj) {
			return obj.getAdditionalTax();
		}

		@Override
		public void setValue(RateDetails32 obj, Optional<RateAndAmountFormat39Choice> value) {
			obj.setAdditionalTax(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgsFees")
	protected RateAndAmountFormat39Choice chargesFees;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat39Choice
	 * RateAndAmountFormat39Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionCharge
	 * CorporateActionEvent.mmCorporateActionCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to calculate the amount of the charges/fees that cannot be categorised."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RateDetails32, Optional<RateAndAmountFormat39Choice>> mmChargesFees = new MMMessageAssociationEnd<RateDetails32, Optional<RateAndAmountFormat39Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionCharge;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails32.mmObject();
			isDerived = false;
			xmlTag = "ChrgsFees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesFees";
			definition = "Rate used to calculate the amount of the charges/fees that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat39Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat39Choice> getValue(RateDetails32 obj) {
			return obj.getChargesFees();
		}

		@Override
		public void setValue(RateDetails32 obj, Optional<RateAndAmountFormat39Choice> value) {
			obj.setChargesFees(value.orElse(null));
		}
	};
	@XmlElement(name = "FsclStmp")
	protected PercentageRate fiscalStamp;
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FsclStmp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiscalStamp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of fiscal tax to apply."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RateDetails32, Optional<PercentageRate>> mmFiscalStamp = new MMMessageAttribute<RateDetails32, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails32.mmObject();
			isDerived = false;
			xmlTag = "FsclStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalStamp";
			definition = "Percentage of fiscal tax to apply.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(RateDetails32 obj) {
			return obj.getFiscalStamp();
		}

		@Override
		public void setValue(RateDetails32 obj, Optional<PercentageRate> value) {
			obj.setFiscalStamp(value.orElse(null));
		}
	};
	@XmlElement(name = "GrssDvddRate")
	protected List<GrossDividendRateFormat29Choice> grossDividendRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat29Choice
	 * GrossDividendRateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmGrossDividend
	 * Dividend.mmGrossDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssDvddRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash dividend amount per equity before deductions or allowances have been made."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RateDetails32, List<GrossDividendRateFormat29Choice>> mmGrossDividendRate = new MMMessageAssociationEnd<RateDetails32, List<GrossDividendRateFormat29Choice>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmGrossDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails32.mmObject();
			isDerived = false;
			xmlTag = "GrssDvddRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate";
			definition = "Cash dividend amount per equity before deductions or allowances have been made.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GrossDividendRateFormat29Choice.mmObject();
		}

		@Override
		public List<GrossDividendRateFormat29Choice> getValue(RateDetails32 obj) {
			return obj.getGrossDividendRate();
		}

		@Override
		public void setValue(RateDetails32 obj, List<GrossDividendRateFormat29Choice> value) {
			obj.setGrossDividendRate(value);
		}
	};
	@XmlElement(name = "EarlySlctnFeeRate")
	protected SolicitationFeeRateFormat8Choice earlySolicitationFeeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat8Choice
	 * SolicitationFeeRateFormat8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmEarlySolicitationFeeRate
	 * CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlySlctnFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlySolicitationFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash rate made available, as an incentive, in addition to the solicitation fee, in order to encourage early participation in an offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RateDetails32, Optional<SolicitationFeeRateFormat8Choice>> mmEarlySolicitationFeeRate = new MMMessageAttribute<RateDetails32, Optional<SolicitationFeeRateFormat8Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails32.mmObject();
			isDerived = false;
			xmlTag = "EarlySlctnFeeRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlySolicitationFeeRate";
			definition = "Cash rate made available, as an incentive, in addition to the solicitation fee, in order to encourage early participation in an offer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SolicitationFeeRateFormat8Choice.mmObject();
		}

		@Override
		public Optional<SolicitationFeeRateFormat8Choice> getValue(RateDetails32 obj) {
			return obj.getEarlySolicitationFeeRate();
		}

		@Override
		public void setValue(RateDetails32 obj, Optional<SolicitationFeeRateFormat8Choice> value) {
			obj.setEarlySolicitationFeeRate(value.orElse(null));
		}
	};
	@XmlElement(name = "ThrdPtyIncntivRate")
	protected RateAndAmountFormat39Choice thirdPartyIncentiveRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat39Choice
	 * RateAndAmountFormat39Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmCashIncentiveRate
	 * CashProceedsDefinition.mmCashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ThrdPtyIncntivRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdPartyIncentiveRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash rate made available in an event in order to encourage participation in the offer. As information, Payment is made to a third party who has solicited an entity to take part in the offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RateDetails32, Optional<RateAndAmountFormat39Choice>> mmThirdPartyIncentiveRate = new MMMessageAttribute<RateDetails32, Optional<RateAndAmountFormat39Choice>>() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmCashIncentiveRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails32.mmObject();
			isDerived = false;
			xmlTag = "ThrdPtyIncntivRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdPartyIncentiveRate";
			definition = "Cash rate made available in an event in order to encourage participation in the offer. As information, Payment is made to a third party who has solicited an entity to take part in the offer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat39Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat39Choice> getValue(RateDetails32 obj) {
			return obj.getThirdPartyIncentiveRate();
		}

		@Override
		public void setValue(RateDetails32 obj, Optional<RateAndAmountFormat39Choice> value) {
			obj.setThirdPartyIncentiveRate(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstRateUsdForPmt")
	protected List<InterestRateUsedForPaymentFormat7Choice> interestRateUsedForPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat7Choice
	 * InterestRateUsedForPaymentFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRateUsdForPmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRateUsedForPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Actual interest rate used for the payment of the interest for the specified interest period."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RateDetails32, List<InterestRateUsedForPaymentFormat7Choice>> mmInterestRateUsedForPayment = new MMMessageAssociationEnd<RateDetails32, List<InterestRateUsedForPaymentFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails32.mmObject();
			isDerived = false;
			xmlTag = "IntrstRateUsdForPmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRateUsedForPayment";
			definition = "Actual interest rate used for the payment of the interest for the specified interest period.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InterestRateUsedForPaymentFormat7Choice.mmObject();
		}

		@Override
		public List<InterestRateUsedForPaymentFormat7Choice> getValue(RateDetails32 obj) {
			return obj.getInterestRateUsedForPayment();
		}

		@Override
		public void setValue(RateDetails32 obj, List<InterestRateUsedForPaymentFormat7Choice> value) {
			obj.setInterestRateUsedForPayment(value);
		}
	};
	@XmlElement(name = "NetDvddRate")
	protected List<NetDividendRateFormat32Choice> netDividendRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat32Choice
	 * NetDividendRateFormat32Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmNetDividend
	 * Dividend.mmNetDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetDvddRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetDividendRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash dividend amount per equity after deductions or allowances have been made."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RateDetails32, List<NetDividendRateFormat32Choice>> mmNetDividendRate = new MMMessageAssociationEnd<RateDetails32, List<NetDividendRateFormat32Choice>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmNetDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails32.mmObject();
			isDerived = false;
			xmlTag = "NetDvddRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate";
			definition = "Cash dividend amount per equity after deductions or allowances have been made.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetDividendRateFormat32Choice.mmObject();
		}

		@Override
		public List<NetDividendRateFormat32Choice> getValue(RateDetails32 obj) {
			return obj.getNetDividendRate();
		}

		@Override
		public void setValue(RateDetails32 obj, List<NetDividendRateFormat32Choice> value) {
			obj.setNetDividendRate(value);
		}
	};
	@XmlElement(name = "AplblRate")
	protected PercentageRate applicableRate;
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
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmApplicableRate
	 * BiddingConditions.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AplblRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicableRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate applicable to the event announced, for example, redemption rate for a redemption event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RateDetails32, Optional<PercentageRate>> mmApplicableRate = new MMMessageAttribute<RateDetails32, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmApplicableRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails32.mmObject();
			isDerived = false;
			xmlTag = "AplblRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicableRate";
			definition = "Rate applicable to the event announced, for example, redemption rate for a redemption event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(RateDetails32 obj) {
			return obj.getApplicableRate();
		}

		@Override
		public void setValue(RateDetails32 obj, Optional<PercentageRate> value) {
			obj.setApplicableRate(value.orElse(null));
		}
	};
	@XmlElement(name = "SlctnFeeRate")
	protected SolicitationFeeRateFormat8Choice solicitationFeeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat8Choice
	 * SolicitationFeeRateFormat8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmSolicitationFee
	 * CorporateActionFeesAndCharges.mmSolicitationFee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlctnFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationFeeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of the cash premium made available if the securities holder consents or participates to an event, for example consent fees or solicitation fee."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RateDetails32, Optional<SolicitationFeeRateFormat8Choice>> mmSolicitationFeeRate = new MMMessageAttribute<RateDetails32, Optional<SolicitationFeeRateFormat8Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionFeesAndCharges.mmSolicitationFee;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails32.mmObject();
			isDerived = false;
			xmlTag = "SlctnFeeRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationFeeRate";
			definition = "Rate of the cash premium made available if the securities holder consents or participates to an event, for example consent fees or solicitation fee.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SolicitationFeeRateFormat8Choice.mmObject();
		}

		@Override
		public Optional<SolicitationFeeRateFormat8Choice> getValue(RateDetails32 obj) {
			return obj.getSolicitationFeeRate();
		}

		@Override
		public void setValue(RateDetails32 obj, Optional<SolicitationFeeRateFormat8Choice> value) {
			obj.setSolicitationFeeRate(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxCdtRate")
	protected RateFormat22Choice taxCreditRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat22Choice
	 * RateFormat22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCreditRate
	 * TaxVoucher.mmCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxCdtRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money per equity allocated as the result of a tax credit."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RateDetails32, Optional<RateFormat22Choice>> mmTaxCreditRate = new MMMessageAssociationEnd<RateDetails32, Optional<RateFormat22Choice>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmCreditRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails32.mmObject();
			isDerived = false;
			xmlTag = "TaxCdtRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate";
			definition = "Amount of money per equity allocated as the result of a tax credit.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat22Choice.mmObject();
		}

		@Override
		public Optional<RateFormat22Choice> getValue(RateDetails32 obj) {
			return obj.getTaxCreditRate();
		}

		@Override
		public void setValue(RateDetails32 obj, Optional<RateFormat22Choice> value) {
			obj.setTaxCreditRate(value.orElse(null));
		}
	};
	@XmlElement(name = "WhldgTaxRate")
	protected List<RateAndAmountFormat40Choice> withholdingTaxRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat40Choice
	 * RateAndAmountFormat40Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgTaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of a cash distribution that will be withheld by the tax authorities of the jurisdiction of the issuer, for which a relief at source and/or reclaim may be possible."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RateDetails32, List<RateAndAmountFormat40Choice>> mmWithholdingTaxRate = new MMMessageAttribute<RateDetails32, List<RateAndAmountFormat40Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails32.mmObject();
			isDerived = false;
			xmlTag = "WhldgTaxRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate";
			definition = "Percentage of a cash distribution that will be withheld by the tax authorities of the jurisdiction of the issuer, for which a relief at source and/or reclaim may be possible.";
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat40Choice.mmObject();
		}

		@Override
		public List<RateAndAmountFormat40Choice> getValue(RateDetails32 obj) {
			return obj.getWithholdingTaxRate();
		}

		@Override
		public void setValue(RateDetails32 obj, List<RateAndAmountFormat40Choice> value) {
			obj.setWithholdingTaxRate(value);
		}
	};
	@XmlElement(name = "ScndLvlTax")
	protected List<RateAndAmountFormat40Choice> secondLevelTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat40Choice
	 * RateAndAmountFormat40Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndLvlTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLevelTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate at which the income will be withheld by a jurisdiction other than the jurisdiction of the issuer’s country of tax incorporation, for which a relief at source and/or reclaim may be possible. It is levied in complement or offset of the withholding tax rate (TAXR) levied by the jurisdiction of the issuer’s tax domicile."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RateDetails32, List<RateAndAmountFormat40Choice>> mmSecondLevelTax = new MMMessageAssociationEnd<RateDetails32, List<RateAndAmountFormat40Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails32.mmObject();
			isDerived = false;
			xmlTag = "ScndLvlTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax";
			definition = "Rate at which the income will be withheld by a jurisdiction other than the jurisdiction of the issuer’s country of tax incorporation, for which a relief at source and/or reclaim may be possible. It is levied in complement or offset of the withholding tax rate (TAXR) levied by the jurisdiction of the issuer’s tax domicile.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat40Choice.mmObject();
		}

		@Override
		public List<RateAndAmountFormat40Choice> getValue(RateDetails32 obj) {
			return obj.getSecondLevelTax();
		}

		@Override
		public void setValue(RateDetails32 obj, List<RateAndAmountFormat40Choice> value) {
			obj.setSecondLevelTax(value);
		}
	};
	@XmlElement(name = "TaxOnIncm")
	protected RateAndAmountFormat39Choice taxOnIncome;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat39Choice
	 * RateAndAmountFormat39Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxOnIncm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxOnIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Taxation applied on an amount clearly identified as an income."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RateDetails32, Optional<RateAndAmountFormat39Choice>> mmTaxOnIncome = new MMMessageAttribute<RateDetails32, Optional<RateAndAmountFormat39Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails32.mmObject();
			isDerived = false;
			xmlTag = "TaxOnIncm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxOnIncome";
			definition = "Taxation applied on an amount clearly identified as an income.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat39Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat39Choice> getValue(RateDetails32 obj) {
			return obj.getTaxOnIncome();
		}

		@Override
		public void setValue(RateDetails32 obj, Optional<RateAndAmountFormat39Choice> value) {
			obj.setTaxOnIncome(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxOnPrfts")
	protected PercentageRate taxOnProfits;
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxOnPrfts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxOnProfits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Taxation applied on an amount clearly identified as capital profits, capital gains."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RateDetails32, Optional<PercentageRate>> mmTaxOnProfits = new MMMessageAttribute<RateDetails32, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails32.mmObject();
			isDerived = false;
			xmlTag = "TaxOnPrfts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxOnProfits";
			definition = "Taxation applied on an amount clearly identified as capital profits, capital gains.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(RateDetails32 obj) {
			return obj.getTaxOnProfits();
		}

		@Override
		public void setValue(RateDetails32 obj, Optional<PercentageRate> value) {
			obj.setTaxOnProfits(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxRclmRate")
	protected PercentageRate taxReclaimRate;
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRclmRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReclaimRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of cash that was paid in excess of actual tax obligation and was reclaimed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RateDetails32, Optional<PercentageRate>> mmTaxReclaimRate = new MMMessageAttribute<RateDetails32, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails32.mmObject();
			isDerived = false;
			xmlTag = "TaxRclmRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaimRate";
			definition = "Percentage of cash that was paid in excess of actual tax obligation and was reclaimed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(RateDetails32 obj) {
			return obj.getTaxReclaimRate();
		}

		@Override
		public void setValue(RateDetails32 obj, Optional<PercentageRate> value) {
			obj.setTaxReclaimRate(value.orElse(null));
		}
	};
	@XmlElement(name = "EqulstnRate")
	protected ActiveCurrencyAnd13DecimalAmount equalisationRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Equalisation#mmAmount
	 * Equalisation.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EqulstnRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EqualisationRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the fund distribution which represents the average accrued income included in the purchase price for units bought during the account period."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RateDetails32, Optional<ActiveCurrencyAnd13DecimalAmount>> mmEqualisationRate = new MMMessageAttribute<RateDetails32, Optional<ActiveCurrencyAnd13DecimalAmount>>() {
		{
			businessElementTrace_lazy = () -> Equalisation.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails32.mmObject();
			isDerived = false;
			xmlTag = "EqulstnRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualisationRate";
			definition = "Portion of the fund distribution which represents the average accrued income included in the purchase price for units bought during the account period.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAnd13DecimalAmount> getValue(RateDetails32 obj) {
			return obj.getEqualisationRate();
		}

		@Override
		public void setValue(RateDetails32 obj, Optional<ActiveCurrencyAnd13DecimalAmount> value) {
			obj.setEqualisationRate(value.orElse(null));
		}
	};
	@XmlElement(name = "DmdRate")
	protected List<RateAndAmountFormat52Choice> deemedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat52Choice
	 * RateAndAmountFormat52Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmDeemedRate
	 * Dividend.mmDeemedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails32 RateDetails32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DmdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeemedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate applied for the calculation of deemed proceeds which are not paid to security holders but on which withholding tax is applicable."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RateDetails32, List<RateAndAmountFormat52Choice>> mmDeemedRate = new MMMessageAssociationEnd<RateDetails32, List<RateAndAmountFormat52Choice>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmDeemedRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails32.mmObject();
			isDerived = false;
			xmlTag = "DmdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeemedRate";
			definition = "Rate applied for the calculation of deemed proceeds which are not paid to security holders but on which withholding tax is applicable.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat52Choice.mmObject();
		}

		@Override
		public List<RateAndAmountFormat52Choice> getValue(RateDetails32 obj) {
			return obj.getDeemedRate();
		}

		@Override
		public void setValue(RateDetails32 obj, List<RateAndAmountFormat52Choice> value) {
			obj.setDeemedRate(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RateDetails32.mmAdditionalTax, com.tools20022.repository.msg.RateDetails32.mmChargesFees, com.tools20022.repository.msg.RateDetails32.mmFiscalStamp,
						com.tools20022.repository.msg.RateDetails32.mmGrossDividendRate, com.tools20022.repository.msg.RateDetails32.mmEarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails32.mmThirdPartyIncentiveRate,
						com.tools20022.repository.msg.RateDetails32.mmInterestRateUsedForPayment, com.tools20022.repository.msg.RateDetails32.mmNetDividendRate, com.tools20022.repository.msg.RateDetails32.mmApplicableRate,
						com.tools20022.repository.msg.RateDetails32.mmSolicitationFeeRate, com.tools20022.repository.msg.RateDetails32.mmTaxCreditRate, com.tools20022.repository.msg.RateDetails32.mmWithholdingTaxRate,
						com.tools20022.repository.msg.RateDetails32.mmSecondLevelTax, com.tools20022.repository.msg.RateDetails32.mmTaxOnIncome, com.tools20022.repository.msg.RateDetails32.mmTaxOnProfits,
						com.tools20022.repository.msg.RateDetails32.mmTaxReclaimRate, com.tools20022.repository.msg.RateDetails32.mmEqualisationRate, com.tools20022.repository.msg.RateDetails32.mmDeemedRate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrossDividendRate2Rule.forRateDetails32, com.tools20022.repository.constraints.ConstraintNetDividendRate1Rule.forRateDetails32,
						com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails32, com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forRateDetails32,
						com.tools20022.repository.constraints.ConstraintSecondLevelTax3Rule.forRateDetails32, com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule.forRateDetails32,
						com.tools20022.repository.constraints.ConstraintSecondLevelTax2Rule.forRateDetails32, com.tools20022.repository.constraints.ConstraintWithholdingTaxRate1Rule.forRateDetails32,
						com.tools20022.repository.constraints.ConstraintWithholdingTaxRate2Rule.forRateDetails32, com.tools20022.repository.constraints.ConstraintDeemedRate1Rule.forRateDetails32,
						com.tools20022.repository.constraints.ConstraintDeemedRate2Rule.forRateDetails32);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RateDetails32";
				definition = "Provides information about the rates related to securities movement.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RateAndAmountFormat39Choice> getAdditionalTax() {
		return additionalTax == null ? Optional.empty() : Optional.of(additionalTax);
	}

	public RateDetails32 setAdditionalTax(RateAndAmountFormat39Choice additionalTax) {
		this.additionalTax = additionalTax;
		return this;
	}

	public Optional<RateAndAmountFormat39Choice> getChargesFees() {
		return chargesFees == null ? Optional.empty() : Optional.of(chargesFees);
	}

	public RateDetails32 setChargesFees(RateAndAmountFormat39Choice chargesFees) {
		this.chargesFees = chargesFees;
		return this;
	}

	public Optional<PercentageRate> getFiscalStamp() {
		return fiscalStamp == null ? Optional.empty() : Optional.of(fiscalStamp);
	}

	public RateDetails32 setFiscalStamp(PercentageRate fiscalStamp) {
		this.fiscalStamp = fiscalStamp;
		return this;
	}

	public List<GrossDividendRateFormat29Choice> getGrossDividendRate() {
		return grossDividendRate == null ? grossDividendRate = new ArrayList<>() : grossDividendRate;
	}

	public RateDetails32 setGrossDividendRate(List<GrossDividendRateFormat29Choice> grossDividendRate) {
		this.grossDividendRate = Objects.requireNonNull(grossDividendRate);
		return this;
	}

	public Optional<SolicitationFeeRateFormat8Choice> getEarlySolicitationFeeRate() {
		return earlySolicitationFeeRate == null ? Optional.empty() : Optional.of(earlySolicitationFeeRate);
	}

	public RateDetails32 setEarlySolicitationFeeRate(SolicitationFeeRateFormat8Choice earlySolicitationFeeRate) {
		this.earlySolicitationFeeRate = earlySolicitationFeeRate;
		return this;
	}

	public Optional<RateAndAmountFormat39Choice> getThirdPartyIncentiveRate() {
		return thirdPartyIncentiveRate == null ? Optional.empty() : Optional.of(thirdPartyIncentiveRate);
	}

	public RateDetails32 setThirdPartyIncentiveRate(RateAndAmountFormat39Choice thirdPartyIncentiveRate) {
		this.thirdPartyIncentiveRate = thirdPartyIncentiveRate;
		return this;
	}

	public List<InterestRateUsedForPaymentFormat7Choice> getInterestRateUsedForPayment() {
		return interestRateUsedForPayment == null ? interestRateUsedForPayment = new ArrayList<>() : interestRateUsedForPayment;
	}

	public RateDetails32 setInterestRateUsedForPayment(List<InterestRateUsedForPaymentFormat7Choice> interestRateUsedForPayment) {
		this.interestRateUsedForPayment = Objects.requireNonNull(interestRateUsedForPayment);
		return this;
	}

	public List<NetDividendRateFormat32Choice> getNetDividendRate() {
		return netDividendRate == null ? netDividendRate = new ArrayList<>() : netDividendRate;
	}

	public RateDetails32 setNetDividendRate(List<NetDividendRateFormat32Choice> netDividendRate) {
		this.netDividendRate = Objects.requireNonNull(netDividendRate);
		return this;
	}

	public Optional<PercentageRate> getApplicableRate() {
		return applicableRate == null ? Optional.empty() : Optional.of(applicableRate);
	}

	public RateDetails32 setApplicableRate(PercentageRate applicableRate) {
		this.applicableRate = applicableRate;
		return this;
	}

	public Optional<SolicitationFeeRateFormat8Choice> getSolicitationFeeRate() {
		return solicitationFeeRate == null ? Optional.empty() : Optional.of(solicitationFeeRate);
	}

	public RateDetails32 setSolicitationFeeRate(SolicitationFeeRateFormat8Choice solicitationFeeRate) {
		this.solicitationFeeRate = solicitationFeeRate;
		return this;
	}

	public Optional<RateFormat22Choice> getTaxCreditRate() {
		return taxCreditRate == null ? Optional.empty() : Optional.of(taxCreditRate);
	}

	public RateDetails32 setTaxCreditRate(RateFormat22Choice taxCreditRate) {
		this.taxCreditRate = taxCreditRate;
		return this;
	}

	public List<RateAndAmountFormat40Choice> getWithholdingTaxRate() {
		return withholdingTaxRate == null ? withholdingTaxRate = new ArrayList<>() : withholdingTaxRate;
	}

	public RateDetails32 setWithholdingTaxRate(List<RateAndAmountFormat40Choice> withholdingTaxRate) {
		this.withholdingTaxRate = Objects.requireNonNull(withholdingTaxRate);
		return this;
	}

	public List<RateAndAmountFormat40Choice> getSecondLevelTax() {
		return secondLevelTax == null ? secondLevelTax = new ArrayList<>() : secondLevelTax;
	}

	public RateDetails32 setSecondLevelTax(List<RateAndAmountFormat40Choice> secondLevelTax) {
		this.secondLevelTax = Objects.requireNonNull(secondLevelTax);
		return this;
	}

	public Optional<RateAndAmountFormat39Choice> getTaxOnIncome() {
		return taxOnIncome == null ? Optional.empty() : Optional.of(taxOnIncome);
	}

	public RateDetails32 setTaxOnIncome(RateAndAmountFormat39Choice taxOnIncome) {
		this.taxOnIncome = taxOnIncome;
		return this;
	}

	public Optional<PercentageRate> getTaxOnProfits() {
		return taxOnProfits == null ? Optional.empty() : Optional.of(taxOnProfits);
	}

	public RateDetails32 setTaxOnProfits(PercentageRate taxOnProfits) {
		this.taxOnProfits = taxOnProfits;
		return this;
	}

	public Optional<PercentageRate> getTaxReclaimRate() {
		return taxReclaimRate == null ? Optional.empty() : Optional.of(taxReclaimRate);
	}

	public RateDetails32 setTaxReclaimRate(PercentageRate taxReclaimRate) {
		this.taxReclaimRate = taxReclaimRate;
		return this;
	}

	public Optional<ActiveCurrencyAnd13DecimalAmount> getEqualisationRate() {
		return equalisationRate == null ? Optional.empty() : Optional.of(equalisationRate);
	}

	public RateDetails32 setEqualisationRate(ActiveCurrencyAnd13DecimalAmount equalisationRate) {
		this.equalisationRate = equalisationRate;
		return this;
	}

	public List<RateAndAmountFormat52Choice> getDeemedRate() {
		return deemedRate == null ? deemedRate = new ArrayList<>() : deemedRate;
	}

	public RateDetails32 setDeemedRate(List<RateAndAmountFormat52Choice> deemedRate) {
		this.deemedRate = Objects.requireNonNull(deemedRate);
		return this;
	}
}