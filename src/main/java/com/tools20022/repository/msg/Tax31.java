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
import com.tools20022.repository.choice.TaxAmountOrRate4Choice;
import com.tools20022.repository.choice.TaxType3Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.InvestmentFundTax;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification113;
import com.tools20022.repository.msg.TaxCalculationInformation10;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Tax related to an investment fund order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Tax31#mmType Tax31.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax31#mmAppliedAmount
 * Tax31.mmAppliedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax31#mmAppliedRate
 * Tax31.mmAppliedRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax31#mmCountry
 * Tax31.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Tax31#mmRecipientIdentification
 * Tax31.mmRecipientIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax31#mmTaxCalculationDetails
 * Tax31.mmTaxCalculationDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundTax
 * InvestmentFundTax}</li>
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
 * "Tax31"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Tax related to an investment fund order."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Tax32 Tax32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax30 Tax30}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Tax31", propOrder = {"type", "appliedAmount", "appliedRate", "country", "recipientIdentification", "taxCalculationDetails"})
public class Tax31 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected TaxType3Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TaxType3Choice
	 * TaxType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmType Tax.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax31
	 * Tax31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of tax."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax32#mmType Tax32.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax30#mmType Tax30.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Tax31, TaxType3Choice> mmType = new MMMessageAttribute<Tax31, TaxType3Choice>() {
		{
			businessElementTrace_lazy = () -> Tax.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax31.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of tax.";
			nextVersions_lazy = () -> Arrays.asList(Tax32.mmType, Tax30.mmType);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TaxType3Choice.mmObject();
		}

		@Override
		public TaxType3Choice getValue(Tax31 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Tax31 obj, TaxType3Choice value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "ApldAmt", required = true)
	protected ActiveCurrencyAndAmount appliedAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax31
	 * Tax31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApldAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money resulting from the calculation of the tax."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax32#mmInformativeAmount
	 * Tax32.mmInformativeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxAmountOrRate4Choice#mmAmount
	 * TaxAmountOrRate4Choice.mmAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Tax31, ActiveCurrencyAndAmount> mmAppliedAmount = new MMMessageAttribute<Tax31, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax31.mmObject();
			isDerived = false;
			xmlTag = "ApldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedAmount";
			definition = "Amount of money resulting from the calculation of the tax.";
			nextVersions_lazy = () -> Arrays.asList(Tax32.mmInformativeAmount, TaxAmountOrRate4Choice.mmAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(Tax31 obj) {
			return obj.getAppliedAmount();
		}

		@Override
		public void setValue(Tax31 obj, ActiveCurrencyAndAmount value) {
			obj.setAppliedAmount(value);
		}
	};
	@XmlElement(name = "ApldRate")
	protected PercentageRate appliedRate;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax31
	 * Tax31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApldRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate used to calculate the tax."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax32#mmInformativeRate
	 * Tax32.mmInformativeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxAmountOrRate4Choice#mmRate
	 * TaxAmountOrRate4Choice.mmRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Tax31, Optional<PercentageRate>> mmAppliedRate = new MMMessageAttribute<Tax31, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax31.mmObject();
			isDerived = false;
			xmlTag = "ApldRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedRate";
			definition = "Rate used to calculate the tax.";
			nextVersions_lazy = () -> Arrays.asList(Tax32.mmInformativeRate, TaxAmountOrRate4Choice.mmRate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(Tax31 obj) {
			return obj.getAppliedRate();
		}

		@Override
		public void setValue(Tax31 obj, Optional<PercentageRate> value) {
			obj.setAppliedRate(value.orElse(null));
		}
	};
	@XmlElement(name = "Ctry")
	protected CountryCode country;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmTaxationConditions
	 * Party.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax31
	 * Tax31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country where the tax is due."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax32#mmCountry
	 * Tax32.mmCountry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax30#mmCountry
	 * Tax30.mmCountry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Tax31, Optional<CountryCode>> mmCountry = new MMMessageAttribute<Tax31, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> Party.mmTaxationConditions;
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax31.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Country where the tax is due.";
			nextVersions_lazy = () -> Arrays.asList(Tax32.mmCountry, Tax30.mmCountry);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(Tax31 obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(Tax31 obj, Optional<CountryCode> value) {
			obj.setCountry(value.orElse(null));
		}
	};
	@XmlElement(name = "RcptId")
	protected PartyIdentification113 recipientIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification113
	 * PartyIdentification113}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax31
	 * Tax31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives the tax. The recipient of, and the party entitled to, the tax may be two different parties."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Tax30#mmRecipientIdentification
	 * Tax30.mmRecipientIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Tax31, Optional<PartyIdentification113>> mmRecipientIdentification = new MMMessageAttribute<Tax31, Optional<PartyIdentification113>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax31.mmObject();
			isDerived = false;
			xmlTag = "RcptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientIdentification";
			definition = "Party that receives the tax. The recipient of, and the party entitled to, the tax may be two different parties.";
			nextVersions_lazy = () -> Arrays.asList(Tax30.mmRecipientIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification113.mmObject();
		}

		@Override
		public Optional<PartyIdentification113> getValue(Tax31 obj) {
			return obj.getRecipientIdentification();
		}

		@Override
		public void setValue(Tax31 obj, Optional<PartyIdentification113> value) {
			obj.setRecipientIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxClctnDtls")
	protected TaxCalculationInformation10 taxCalculationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation10
	 * TaxCalculationInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax31
	 * Tax31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxClctnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCalculationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information used to calculate the tax."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Tax30#mmTaxCalculationDetails
	 * Tax30.mmTaxCalculationDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Tax31, Optional<TaxCalculationInformation10>> mmTaxCalculationDetails = new MMMessageAssociationEnd<Tax31, Optional<TaxCalculationInformation10>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Tax31.mmObject();
			isDerived = false;
			xmlTag = "TaxClctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCalculationDetails";
			definition = "Information used to calculate the tax.";
			nextVersions_lazy = () -> Arrays.asList(Tax30.mmTaxCalculationDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxCalculationInformation10.mmObject();
		}

		@Override
		public Optional<TaxCalculationInformation10> getValue(Tax31 obj) {
			return obj.getTaxCalculationDetails();
		}

		@Override
		public void setValue(Tax31 obj, Optional<TaxCalculationInformation10> value) {
			obj.setTaxCalculationDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax31.mmType, com.tools20022.repository.msg.Tax31.mmAppliedAmount, com.tools20022.repository.msg.Tax31.mmAppliedRate,
						com.tools20022.repository.msg.Tax31.mmCountry, com.tools20022.repository.msg.Tax31.mmRecipientIdentification, com.tools20022.repository.msg.Tax31.mmTaxCalculationDetails);
				trace_lazy = () -> InvestmentFundTax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Tax31";
				definition = "Tax related to an investment fund order.";
				nextVersions_lazy = () -> Arrays.asList(Tax32.mmObject(), Tax30.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public TaxType3Choice getType() {
		return type;
	}

	public Tax31 setType(TaxType3Choice type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public ActiveCurrencyAndAmount getAppliedAmount() {
		return appliedAmount;
	}

	public Tax31 setAppliedAmount(ActiveCurrencyAndAmount appliedAmount) {
		this.appliedAmount = Objects.requireNonNull(appliedAmount);
		return this;
	}

	public Optional<PercentageRate> getAppliedRate() {
		return appliedRate == null ? Optional.empty() : Optional.of(appliedRate);
	}

	public Tax31 setAppliedRate(PercentageRate appliedRate) {
		this.appliedRate = appliedRate;
		return this;
	}

	public Optional<CountryCode> getCountry() {
		return country == null ? Optional.empty() : Optional.of(country);
	}

	public Tax31 setCountry(CountryCode country) {
		this.country = country;
		return this;
	}

	public Optional<PartyIdentification113> getRecipientIdentification() {
		return recipientIdentification == null ? Optional.empty() : Optional.of(recipientIdentification);
	}

	public Tax31 setRecipientIdentification(PartyIdentification113 recipientIdentification) {
		this.recipientIdentification = recipientIdentification;
		return this;
	}

	public Optional<TaxCalculationInformation10> getTaxCalculationDetails() {
		return taxCalculationDetails == null ? Optional.empty() : Optional.of(taxCalculationDetails);
	}

	public Tax31 setTaxCalculationDetails(TaxCalculationInformation10 taxCalculationDetails) {
		this.taxCalculationDetails = taxCalculationDetails;
		return this;
	}
}