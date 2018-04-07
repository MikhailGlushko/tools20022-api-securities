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
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails31#mmAdditionalTax
 * RateDetails31.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails31#mmGrossDividendRate
 * RateDetails31.mmGrossDividendRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails31#mmInterestRateUsedForPayment
 * RateDetails31.mmInterestRateUsedForPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails31#mmWithholdingTaxRate
 * RateDetails31.mmWithholdingTaxRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails31#mmSecondLevelTax
 * RateDetails31.mmSecondLevelTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails31#mmChargesFees
 * RateDetails31.mmChargesFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails31#mmEarlySolicitationFeeRate
 * RateDetails31.mmEarlySolicitationFeeRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails31#mmFiscalStamp
 * RateDetails31.mmFiscalStamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails31#mmThirdPartyIncentiveRate
 * RateDetails31.mmThirdPartyIncentiveRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails31#mmNetDividendRate
 * RateDetails31.mmNetDividendRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails31#mmApplicableRate
 * RateDetails31.mmApplicableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails31#mmSolicitationFeeRate
 * RateDetails31.mmSolicitationFeeRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails31#mmTaxCreditRate
 * RateDetails31.mmTaxCreditRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails31#mmTaxOnIncome
 * RateDetails31.mmTaxOnIncome}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails31#mmTaxOnProfits
 * RateDetails31.mmTaxOnProfits}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails31#mmTaxReclaimRate
 * RateDetails31.mmTaxReclaimRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RateDetails31#mmEqualisationRate
 * RateDetails31.mmEqualisationRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateDetails31#mmDeemedRate
 * RateDetails31.mmDeemedRate}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate1Rule#forRateDetails31
 * ConstraintNetDividendRate1Rule.forRateDetails31}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate2Rule#forRateDetails31
 * ConstraintGrossDividendRate2Rule.forRateDetails31}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule#forRateDetails31
 * ConstraintGrossDividendRate3Rule.forRateDetails31}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule#forRateDetails31
 * ConstraintNetDividendRate2Rule.forRateDetails31}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax3Rule#forRateDetails31
 * ConstraintSecondLevelTax3Rule.forRateDetails31}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule#forRateDetails31
 * ConstraintSecondLevelTax1Rule.forRateDetails31}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecondLevelTax2Rule#forRateDetails31
 * ConstraintSecondLevelTax2Rule.forRateDetails31}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintWithholdingTaxRate1Rule#forRateDetails31
 * ConstraintWithholdingTaxRate1Rule.forRateDetails31}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintWithholdingTaxRate2Rule#forRateDetails31
 * ConstraintWithholdingTaxRate2Rule.forRateDetails31}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeemedRate1Rule#forRateDetails31
 * ConstraintDeemedRate1Rule.forRateDetails31}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeemedRate2Rule#forRateDetails31
 * ConstraintDeemedRate2Rule.forRateDetails31}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RateDetails31"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the rates related to securities movement."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RateDetails31", propOrder = {"additionalTax", "grossDividendRate", "interestRateUsedForPayment", "withholdingTaxRate", "secondLevelTax", "chargesFees", "earlySolicitationFeeRate", "fiscalStamp", "thirdPartyIncentiveRate",
		"netDividendRate", "applicableRate", "solicitationFeeRate", "taxCreditRate", "taxOnIncome", "taxOnProfits", "taxReclaimRate", "equalisationRate", "deemedRate"})
public class RateDetails31 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AddtlTax")
	protected RateAndAmountFormat37Choice additionalTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat37Choice
	 * RateAndAmountFormat37Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmTaxVoucher
	 * CorporateActionDistribution.mmTaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
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
	public static final MMMessageAssociationEnd<RateDetails31, Optional<RateAndAmountFormat37Choice>> mmAdditionalTax = new MMMessageAssociationEnd<RateDetails31, Optional<RateAndAmountFormat37Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmTaxVoucher;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails31.mmObject();
			isDerived = false;
			xmlTag = "AddtlTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTax";
			definition = "Rate used for additional tax that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat37Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat37Choice> getValue(RateDetails31 obj) {
			return obj.getAdditionalTax();
		}

		@Override
		public void setValue(RateDetails31 obj, Optional<RateAndAmountFormat37Choice> value) {
			obj.setAdditionalTax(value.orElse(null));
		}
	};
	@XmlElement(name = "GrssDvddRate")
	protected List<GrossDividendRateFormat30Choice> grossDividendRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat30Choice
	 * GrossDividendRateFormat30Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmGrossDividend
	 * Dividend.mmGrossDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
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
	public static final MMMessageAssociationEnd<RateDetails31, List<GrossDividendRateFormat30Choice>> mmGrossDividendRate = new MMMessageAssociationEnd<RateDetails31, List<GrossDividendRateFormat30Choice>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmGrossDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails31.mmObject();
			isDerived = false;
			xmlTag = "GrssDvddRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividendRate";
			definition = "Cash dividend amount per equity before deductions or allowances have been made.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GrossDividendRateFormat30Choice.mmObject();
		}

		@Override
		public List<GrossDividendRateFormat30Choice> getValue(RateDetails31 obj) {
			return obj.getGrossDividendRate();
		}

		@Override
		public void setValue(RateDetails31 obj, List<GrossDividendRateFormat30Choice> value) {
			obj.setGrossDividendRate(value);
		}
	};
	@XmlElement(name = "IntrstRateUsdForPmt")
	protected List<InterestRateUsedForPaymentFormat8Choice> interestRateUsedForPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InterestRateUsedForPaymentFormat8Choice
	 * InterestRateUsedForPaymentFormat8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
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
	 * "The actual interest rate used for the payment of the interest for the specified interest period. \nUsage guideline: It is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RateDetails31, List<InterestRateUsedForPaymentFormat8Choice>> mmInterestRateUsedForPayment = new MMMessageAssociationEnd<RateDetails31, List<InterestRateUsedForPaymentFormat8Choice>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails31.mmObject();
			isDerived = false;
			xmlTag = "IntrstRateUsdForPmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRateUsedForPayment";
			definition = "The actual interest rate used for the payment of the interest for the specified interest period. \nUsage guideline: It is used to provide the applicable rate for the current payment, after all calculations have been performed, that is, application of period and method of interest computation.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InterestRateUsedForPaymentFormat8Choice.mmObject();
		}

		@Override
		public List<InterestRateUsedForPaymentFormat8Choice> getValue(RateDetails31 obj) {
			return obj.getInterestRateUsedForPayment();
		}

		@Override
		public void setValue(RateDetails31 obj, List<InterestRateUsedForPaymentFormat8Choice> value) {
			obj.setInterestRateUsedForPayment(value);
		}
	};
	@XmlElement(name = "WhldgTaxRate")
	protected List<RateAndAmountFormat41Choice> withholdingTaxRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat41Choice
	 * RateAndAmountFormat41Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
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
	public static final MMMessageAssociationEnd<RateDetails31, List<RateAndAmountFormat41Choice>> mmWithholdingTaxRate = new MMMessageAssociationEnd<RateDetails31, List<RateAndAmountFormat41Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails31.mmObject();
			isDerived = false;
			xmlTag = "WhldgTaxRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate";
			definition = "Percentage of a cash distribution that will be withheld by the tax authorities of the jurisdiction of the issuer, for which a relief at source and/or reclaim may be possible.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat41Choice.mmObject();
		}

		@Override
		public List<RateAndAmountFormat41Choice> getValue(RateDetails31 obj) {
			return obj.getWithholdingTaxRate();
		}

		@Override
		public void setValue(RateDetails31 obj, List<RateAndAmountFormat41Choice> value) {
			obj.setWithholdingTaxRate(value);
		}
	};
	@XmlElement(name = "ScndLvlTax")
	protected List<RateAndAmountFormat41Choice> secondLevelTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat41Choice
	 * RateAndAmountFormat41Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
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
	public static final MMMessageAssociationEnd<RateDetails31, List<RateAndAmountFormat41Choice>> mmSecondLevelTax = new MMMessageAssociationEnd<RateDetails31, List<RateAndAmountFormat41Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails31.mmObject();
			isDerived = false;
			xmlTag = "ScndLvlTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLevelTax";
			definition = "Rate at which the income will be withheld by a jurisdiction other than the jurisdiction of the issuer’s country of tax incorporation, for which a relief at source and/or reclaim may be possible. It is levied in complement or offset of the withholding tax rate (TAXR) levied by the jurisdiction of the issuer’s tax domicile.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat41Choice.mmObject();
		}

		@Override
		public List<RateAndAmountFormat41Choice> getValue(RateDetails31 obj) {
			return obj.getSecondLevelTax();
		}

		@Override
		public void setValue(RateDetails31 obj, List<RateAndAmountFormat41Choice> value) {
			obj.setSecondLevelTax(value);
		}
	};
	@XmlElement(name = "ChrgsFees")
	protected RateAndAmountFormat37Choice chargesFees;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat37Choice
	 * RateAndAmountFormat37Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionCharge
	 * CorporateActionEvent.mmCorporateActionCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
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
	public static final MMMessageAssociationEnd<RateDetails31, Optional<RateAndAmountFormat37Choice>> mmChargesFees = new MMMessageAssociationEnd<RateDetails31, Optional<RateAndAmountFormat37Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionCharge;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails31.mmObject();
			isDerived = false;
			xmlTag = "ChrgsFees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesFees";
			definition = "Rate used to calculate the amount of the charges/fees that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat37Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat37Choice> getValue(RateDetails31 obj) {
			return obj.getChargesFees();
		}

		@Override
		public void setValue(RateDetails31 obj, Optional<RateAndAmountFormat37Choice> value) {
			obj.setChargesFees(value.orElse(null));
		}
	};
	@XmlElement(name = "EarlySlctnFeeRate")
	protected SolicitationFeeRateFormat7Choice earlySolicitationFeeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat7Choice
	 * SolicitationFeeRateFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmEarlySolicitationFeeRate
	 * CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
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
	public static final MMMessageAssociationEnd<RateDetails31, Optional<SolicitationFeeRateFormat7Choice>> mmEarlySolicitationFeeRate = new MMMessageAssociationEnd<RateDetails31, Optional<SolicitationFeeRateFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionFeesAndCharges.mmEarlySolicitationFeeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails31.mmObject();
			isDerived = false;
			xmlTag = "EarlySlctnFeeRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlySolicitationFeeRate";
			definition = "Cash rate made available, as an incentive, in addition to the solicitation fee, in order to encourage early participation in an offer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SolicitationFeeRateFormat7Choice.mmObject();
		}

		@Override
		public Optional<SolicitationFeeRateFormat7Choice> getValue(RateDetails31 obj) {
			return obj.getEarlySolicitationFeeRate();
		}

		@Override
		public void setValue(RateDetails31 obj, Optional<SolicitationFeeRateFormat7Choice> value) {
			obj.setEarlySolicitationFeeRate(value.orElse(null));
		}
	};
	@XmlElement(name = "FsclStmp")
	protected RateFormat3Choice fiscalStamp;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat3Choice
	 * RateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
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
	public static final MMMessageAssociationEnd<RateDetails31, Optional<RateFormat3Choice>> mmFiscalStamp = new MMMessageAssociationEnd<RateDetails31, Optional<RateFormat3Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails31.mmObject();
			isDerived = false;
			xmlTag = "FsclStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalStamp";
			definition = "Percentage of fiscal tax to apply.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}

		@Override
		public Optional<RateFormat3Choice> getValue(RateDetails31 obj) {
			return obj.getFiscalStamp();
		}

		@Override
		public void setValue(RateDetails31 obj, Optional<RateFormat3Choice> value) {
			obj.setFiscalStamp(value.orElse(null));
		}
	};
	@XmlElement(name = "ThrdPtyIncntivRate")
	protected RateFormat20Choice thirdPartyIncentiveRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat20Choice
	 * RateFormat20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmCashIncentiveRate
	 * CashProceedsDefinition.mmCashIncentiveRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
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
	 * "Cash rate made available in an event in order to encourage participation in the offer. As information, payment is made to a third party who has solicited an entity to take part in the offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RateDetails31, Optional<RateFormat20Choice>> mmThirdPartyIncentiveRate = new MMMessageAssociationEnd<RateDetails31, Optional<RateFormat20Choice>>() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmCashIncentiveRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails31.mmObject();
			isDerived = false;
			xmlTag = "ThrdPtyIncntivRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdPartyIncentiveRate";
			definition = "Cash rate made available in an event in order to encourage participation in the offer. As information, payment is made to a third party who has solicited an entity to take part in the offer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat20Choice.mmObject();
		}

		@Override
		public Optional<RateFormat20Choice> getValue(RateDetails31 obj) {
			return obj.getThirdPartyIncentiveRate();
		}

		@Override
		public void setValue(RateDetails31 obj, Optional<RateFormat20Choice> value) {
			obj.setThirdPartyIncentiveRate(value.orElse(null));
		}
	};
	@XmlElement(name = "NetDvddRate")
	protected List<NetDividendRateFormat31Choice> netDividendRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat31Choice
	 * NetDividendRateFormat31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmNetDividend
	 * Dividend.mmNetDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
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
	public static final MMMessageAssociationEnd<RateDetails31, List<NetDividendRateFormat31Choice>> mmNetDividendRate = new MMMessageAssociationEnd<RateDetails31, List<NetDividendRateFormat31Choice>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmNetDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails31.mmObject();
			isDerived = false;
			xmlTag = "NetDvddRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividendRate";
			definition = "Cash dividend amount per equity after deductions or allowances have been made.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetDividendRateFormat31Choice.mmObject();
		}

		@Override
		public List<NetDividendRateFormat31Choice> getValue(RateDetails31 obj) {
			return obj.getNetDividendRate();
		}

		@Override
		public void setValue(RateDetails31 obj, List<NetDividendRateFormat31Choice> value) {
			obj.setNetDividendRate(value);
		}
	};
	@XmlElement(name = "AplblRate")
	protected RateFormat3Choice applicableRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat3Choice
	 * RateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmApplicableRate
	 * BiddingConditions.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
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
	public static final MMMessageAssociationEnd<RateDetails31, Optional<RateFormat3Choice>> mmApplicableRate = new MMMessageAssociationEnd<RateDetails31, Optional<RateFormat3Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmApplicableRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails31.mmObject();
			isDerived = false;
			xmlTag = "AplblRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicableRate";
			definition = "Rate applicable to the event announced, for example, redemption rate for a redemption event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}

		@Override
		public Optional<RateFormat3Choice> getValue(RateDetails31 obj) {
			return obj.getApplicableRate();
		}

		@Override
		public void setValue(RateDetails31 obj, Optional<RateFormat3Choice> value) {
			obj.setApplicableRate(value.orElse(null));
		}
	};
	@XmlElement(name = "SlctnFeeRate")
	protected SolicitationFeeRateFormat7Choice solicitationFeeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat7Choice
	 * SolicitationFeeRateFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmSolicitationFee
	 * CorporateActionFeesAndCharges.mmSolicitationFee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
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
	public static final MMMessageAssociationEnd<RateDetails31, Optional<SolicitationFeeRateFormat7Choice>> mmSolicitationFeeRate = new MMMessageAssociationEnd<RateDetails31, Optional<SolicitationFeeRateFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionFeesAndCharges.mmSolicitationFee;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails31.mmObject();
			isDerived = false;
			xmlTag = "SlctnFeeRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationFeeRate";
			definition = "Rate of the cash premium made available if the securities holder consents or participates to an event, for example consent fees or solicitation fee.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SolicitationFeeRateFormat7Choice.mmObject();
		}

		@Override
		public Optional<SolicitationFeeRateFormat7Choice> getValue(RateDetails31 obj) {
			return obj.getSolicitationFeeRate();
		}

		@Override
		public void setValue(RateDetails31 obj, Optional<SolicitationFeeRateFormat7Choice> value) {
			obj.setSolicitationFeeRate(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxCdtRate")
	protected RateFormat20Choice taxCreditRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat20Choice
	 * RateFormat20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCreditRate
	 * TaxVoucher.mmCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
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
	public static final MMMessageAssociationEnd<RateDetails31, Optional<RateFormat20Choice>> mmTaxCreditRate = new MMMessageAssociationEnd<RateDetails31, Optional<RateFormat20Choice>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmCreditRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails31.mmObject();
			isDerived = false;
			xmlTag = "TaxCdtRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate";
			definition = "Amount of money per equity allocated as the result of a tax credit.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat20Choice.mmObject();
		}

		@Override
		public Optional<RateFormat20Choice> getValue(RateDetails31 obj) {
			return obj.getTaxCreditRate();
		}

		@Override
		public void setValue(RateDetails31 obj, Optional<RateFormat20Choice> value) {
			obj.setTaxCreditRate(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxOnIncm")
	protected RateAndAmountFormat37Choice taxOnIncome;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat37Choice
	 * RateAndAmountFormat37Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
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
	 * "Overall tax withheld at source by fund managers prior to considering the tax obligation of each unit holder."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RateDetails31, Optional<RateAndAmountFormat37Choice>> mmTaxOnIncome = new MMMessageAssociationEnd<RateDetails31, Optional<RateAndAmountFormat37Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails31.mmObject();
			isDerived = false;
			xmlTag = "TaxOnIncm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxOnIncome";
			definition = "Overall tax withheld at source by fund managers prior to considering the tax obligation of each unit holder.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat37Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat37Choice> getValue(RateDetails31 obj) {
			return obj.getTaxOnIncome();
		}

		@Override
		public void setValue(RateDetails31 obj, Optional<RateAndAmountFormat37Choice> value) {
			obj.setTaxOnIncome(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxOnPrfts")
	protected RateFormat3Choice taxOnProfits;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat3Choice
	 * RateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
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
	public static final MMMessageAssociationEnd<RateDetails31, Optional<RateFormat3Choice>> mmTaxOnProfits = new MMMessageAssociationEnd<RateDetails31, Optional<RateFormat3Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails31.mmObject();
			isDerived = false;
			xmlTag = "TaxOnPrfts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxOnProfits";
			definition = "Taxation applied on an amount clearly identified as capital profits, capital gains.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}

		@Override
		public Optional<RateFormat3Choice> getValue(RateDetails31 obj) {
			return obj.getTaxOnProfits();
		}

		@Override
		public void setValue(RateDetails31 obj, Optional<RateFormat3Choice> value) {
			obj.setTaxOnProfits(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxRclmRate")
	protected RateFormat3Choice taxReclaimRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateFormat3Choice
	 * RateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
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
	public static final MMMessageAssociationEnd<RateDetails31, Optional<RateFormat3Choice>> mmTaxReclaimRate = new MMMessageAssociationEnd<RateDetails31, Optional<RateFormat3Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails31.mmObject();
			isDerived = false;
			xmlTag = "TaxRclmRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaimRate";
			definition = "Percentage of cash that was paid in excess of actual tax obligation and was reclaimed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateFormat3Choice.mmObject();
		}

		@Override
		public Optional<RateFormat3Choice> getValue(RateDetails31 obj) {
			return obj.getTaxReclaimRate();
		}

		@Override
		public void setValue(RateDetails31 obj, Optional<RateFormat3Choice> value) {
			obj.setTaxReclaimRate(value.orElse(null));
		}
	};
	@XmlElement(name = "EqulstnRate")
	protected RateAndAmountFormat42Choice equalisationRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat42Choice
	 * RateAndAmountFormat42Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Equalisation#mmRate
	 * Equalisation.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
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
	public static final MMMessageAttribute<RateDetails31, Optional<RateAndAmountFormat42Choice>> mmEqualisationRate = new MMMessageAttribute<RateDetails31, Optional<RateAndAmountFormat42Choice>>() {
		{
			businessElementTrace_lazy = () -> Equalisation.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails31.mmObject();
			isDerived = false;
			xmlTag = "EqulstnRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualisationRate";
			definition = "Portion of the fund distribution which represents the average accrued income included in the purchase price for units bought during the account period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat42Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat42Choice> getValue(RateDetails31 obj) {
			return obj.getEqualisationRate();
		}

		@Override
		public void setValue(RateDetails31 obj, Optional<RateAndAmountFormat42Choice> value) {
			obj.setEqualisationRate(value.orElse(null));
		}
	};
	@XmlElement(name = "DmdRate")
	protected List<RateAndAmountFormat51Choice> deemedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat51Choice
	 * RateAndAmountFormat51Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmDeemedRate
	 * Dividend.mmDeemedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RateDetails31 RateDetails31}</li>
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
	public static final MMMessageAssociationEnd<RateDetails31, List<RateAndAmountFormat51Choice>> mmDeemedRate = new MMMessageAssociationEnd<RateDetails31, List<RateAndAmountFormat51Choice>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmDeemedRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RateDetails31.mmObject();
			isDerived = false;
			xmlTag = "DmdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeemedRate";
			definition = "Rate applied for the calculation of deemed proceeds which are not paid to security holders but on which withholding tax is applicable.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateAndAmountFormat51Choice.mmObject();
		}

		@Override
		public List<RateAndAmountFormat51Choice> getValue(RateDetails31 obj) {
			return obj.getDeemedRate();
		}

		@Override
		public void setValue(RateDetails31 obj, List<RateAndAmountFormat51Choice> value) {
			obj.setDeemedRate(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RateDetails31.mmAdditionalTax, com.tools20022.repository.msg.RateDetails31.mmGrossDividendRate,
						com.tools20022.repository.msg.RateDetails31.mmInterestRateUsedForPayment, com.tools20022.repository.msg.RateDetails31.mmWithholdingTaxRate, com.tools20022.repository.msg.RateDetails31.mmSecondLevelTax,
						com.tools20022.repository.msg.RateDetails31.mmChargesFees, com.tools20022.repository.msg.RateDetails31.mmEarlySolicitationFeeRate, com.tools20022.repository.msg.RateDetails31.mmFiscalStamp,
						com.tools20022.repository.msg.RateDetails31.mmThirdPartyIncentiveRate, com.tools20022.repository.msg.RateDetails31.mmNetDividendRate, com.tools20022.repository.msg.RateDetails31.mmApplicableRate,
						com.tools20022.repository.msg.RateDetails31.mmSolicitationFeeRate, com.tools20022.repository.msg.RateDetails31.mmTaxCreditRate, com.tools20022.repository.msg.RateDetails31.mmTaxOnIncome,
						com.tools20022.repository.msg.RateDetails31.mmTaxOnProfits, com.tools20022.repository.msg.RateDetails31.mmTaxReclaimRate, com.tools20022.repository.msg.RateDetails31.mmEqualisationRate,
						com.tools20022.repository.msg.RateDetails31.mmDeemedRate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNetDividendRate1Rule.forRateDetails31, com.tools20022.repository.constraints.ConstraintGrossDividendRate2Rule.forRateDetails31,
						com.tools20022.repository.constraints.ConstraintGrossDividendRate3Rule.forRateDetails31, com.tools20022.repository.constraints.ConstraintNetDividendRate2Rule.forRateDetails31,
						com.tools20022.repository.constraints.ConstraintSecondLevelTax3Rule.forRateDetails31, com.tools20022.repository.constraints.ConstraintSecondLevelTax1Rule.forRateDetails31,
						com.tools20022.repository.constraints.ConstraintSecondLevelTax2Rule.forRateDetails31, com.tools20022.repository.constraints.ConstraintWithholdingTaxRate1Rule.forRateDetails31,
						com.tools20022.repository.constraints.ConstraintWithholdingTaxRate2Rule.forRateDetails31, com.tools20022.repository.constraints.ConstraintDeemedRate1Rule.forRateDetails31,
						com.tools20022.repository.constraints.ConstraintDeemedRate2Rule.forRateDetails31);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RateDetails31";
				definition = "Provides information about the rates related to securities movement.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RateAndAmountFormat37Choice> getAdditionalTax() {
		return additionalTax == null ? Optional.empty() : Optional.of(additionalTax);
	}

	public RateDetails31 setAdditionalTax(RateAndAmountFormat37Choice additionalTax) {
		this.additionalTax = additionalTax;
		return this;
	}

	public List<GrossDividendRateFormat30Choice> getGrossDividendRate() {
		return grossDividendRate == null ? grossDividendRate = new ArrayList<>() : grossDividendRate;
	}

	public RateDetails31 setGrossDividendRate(List<GrossDividendRateFormat30Choice> grossDividendRate) {
		this.grossDividendRate = Objects.requireNonNull(grossDividendRate);
		return this;
	}

	public List<InterestRateUsedForPaymentFormat8Choice> getInterestRateUsedForPayment() {
		return interestRateUsedForPayment == null ? interestRateUsedForPayment = new ArrayList<>() : interestRateUsedForPayment;
	}

	public RateDetails31 setInterestRateUsedForPayment(List<InterestRateUsedForPaymentFormat8Choice> interestRateUsedForPayment) {
		this.interestRateUsedForPayment = Objects.requireNonNull(interestRateUsedForPayment);
		return this;
	}

	public List<RateAndAmountFormat41Choice> getWithholdingTaxRate() {
		return withholdingTaxRate == null ? withholdingTaxRate = new ArrayList<>() : withholdingTaxRate;
	}

	public RateDetails31 setWithholdingTaxRate(List<RateAndAmountFormat41Choice> withholdingTaxRate) {
		this.withholdingTaxRate = Objects.requireNonNull(withholdingTaxRate);
		return this;
	}

	public List<RateAndAmountFormat41Choice> getSecondLevelTax() {
		return secondLevelTax == null ? secondLevelTax = new ArrayList<>() : secondLevelTax;
	}

	public RateDetails31 setSecondLevelTax(List<RateAndAmountFormat41Choice> secondLevelTax) {
		this.secondLevelTax = Objects.requireNonNull(secondLevelTax);
		return this;
	}

	public Optional<RateAndAmountFormat37Choice> getChargesFees() {
		return chargesFees == null ? Optional.empty() : Optional.of(chargesFees);
	}

	public RateDetails31 setChargesFees(RateAndAmountFormat37Choice chargesFees) {
		this.chargesFees = chargesFees;
		return this;
	}

	public Optional<SolicitationFeeRateFormat7Choice> getEarlySolicitationFeeRate() {
		return earlySolicitationFeeRate == null ? Optional.empty() : Optional.of(earlySolicitationFeeRate);
	}

	public RateDetails31 setEarlySolicitationFeeRate(SolicitationFeeRateFormat7Choice earlySolicitationFeeRate) {
		this.earlySolicitationFeeRate = earlySolicitationFeeRate;
		return this;
	}

	public Optional<RateFormat3Choice> getFiscalStamp() {
		return fiscalStamp == null ? Optional.empty() : Optional.of(fiscalStamp);
	}

	public RateDetails31 setFiscalStamp(RateFormat3Choice fiscalStamp) {
		this.fiscalStamp = fiscalStamp;
		return this;
	}

	public Optional<RateFormat20Choice> getThirdPartyIncentiveRate() {
		return thirdPartyIncentiveRate == null ? Optional.empty() : Optional.of(thirdPartyIncentiveRate);
	}

	public RateDetails31 setThirdPartyIncentiveRate(RateFormat20Choice thirdPartyIncentiveRate) {
		this.thirdPartyIncentiveRate = thirdPartyIncentiveRate;
		return this;
	}

	public List<NetDividendRateFormat31Choice> getNetDividendRate() {
		return netDividendRate == null ? netDividendRate = new ArrayList<>() : netDividendRate;
	}

	public RateDetails31 setNetDividendRate(List<NetDividendRateFormat31Choice> netDividendRate) {
		this.netDividendRate = Objects.requireNonNull(netDividendRate);
		return this;
	}

	public Optional<RateFormat3Choice> getApplicableRate() {
		return applicableRate == null ? Optional.empty() : Optional.of(applicableRate);
	}

	public RateDetails31 setApplicableRate(RateFormat3Choice applicableRate) {
		this.applicableRate = applicableRate;
		return this;
	}

	public Optional<SolicitationFeeRateFormat7Choice> getSolicitationFeeRate() {
		return solicitationFeeRate == null ? Optional.empty() : Optional.of(solicitationFeeRate);
	}

	public RateDetails31 setSolicitationFeeRate(SolicitationFeeRateFormat7Choice solicitationFeeRate) {
		this.solicitationFeeRate = solicitationFeeRate;
		return this;
	}

	public Optional<RateFormat20Choice> getTaxCreditRate() {
		return taxCreditRate == null ? Optional.empty() : Optional.of(taxCreditRate);
	}

	public RateDetails31 setTaxCreditRate(RateFormat20Choice taxCreditRate) {
		this.taxCreditRate = taxCreditRate;
		return this;
	}

	public Optional<RateAndAmountFormat37Choice> getTaxOnIncome() {
		return taxOnIncome == null ? Optional.empty() : Optional.of(taxOnIncome);
	}

	public RateDetails31 setTaxOnIncome(RateAndAmountFormat37Choice taxOnIncome) {
		this.taxOnIncome = taxOnIncome;
		return this;
	}

	public Optional<RateFormat3Choice> getTaxOnProfits() {
		return taxOnProfits == null ? Optional.empty() : Optional.of(taxOnProfits);
	}

	public RateDetails31 setTaxOnProfits(RateFormat3Choice taxOnProfits) {
		this.taxOnProfits = taxOnProfits;
		return this;
	}

	public Optional<RateFormat3Choice> getTaxReclaimRate() {
		return taxReclaimRate == null ? Optional.empty() : Optional.of(taxReclaimRate);
	}

	public RateDetails31 setTaxReclaimRate(RateFormat3Choice taxReclaimRate) {
		this.taxReclaimRate = taxReclaimRate;
		return this;
	}

	public Optional<RateAndAmountFormat42Choice> getEqualisationRate() {
		return equalisationRate == null ? Optional.empty() : Optional.of(equalisationRate);
	}

	public RateDetails31 setEqualisationRate(RateAndAmountFormat42Choice equalisationRate) {
		this.equalisationRate = equalisationRate;
		return this;
	}

	public List<RateAndAmountFormat51Choice> getDeemedRate() {
		return deemedRate == null ? deemedRate = new ArrayList<>() : deemedRate;
	}

	public RateDetails31 setDeemedRate(List<RateAndAmountFormat51Choice> deemedRate) {
		this.deemedRate = Objects.requireNonNull(deemedRate);
		return this;
	}
}