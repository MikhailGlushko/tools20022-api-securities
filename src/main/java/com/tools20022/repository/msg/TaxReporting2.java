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
import com.tools20022.repository.choice.PartyIdentification70Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.entity.TaxPayer;
import com.tools20022.repository.entity.TaxRecipient;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashAccount33;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information for tax reporting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxReporting2#mmTaxationCountry
 * TaxReporting2.mmTaxationCountry}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReporting2#mmTaxRate
 * TaxReporting2.mmTaxRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReporting2#mmTaxPayer
 * TaxReporting2.mmTaxPayer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReporting2#mmTaxRecipient
 * TaxReporting2.mmTaxRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxReporting2#mmCashAccountDetails
 * TaxReporting2.mmCashAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReporting2#mmDescription
 * TaxReporting2.mmDescription}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
 * "TaxReporting2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information for tax reporting."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TaxReporting2", propOrder = {"taxationCountry", "taxRate", "taxPayer", "taxRecipient", "cashAccountDetails", "description"})
public class TaxReporting2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TaxtnCtry", required = true)
	protected CountryCode taxationCountry;
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmCountry Tax.mmCountry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxReporting2 TaxReporting2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxtnCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country of taxation of the organisation or individual person."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxReporting2, CountryCode> mmTaxationCountry = new MMMessageAttribute<TaxReporting2, CountryCode>() {
		{
			businessElementTrace_lazy = () -> Tax.mmCountry;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxReporting2.mmObject();
			isDerived = false;
			xmlTag = "TaxtnCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxationCountry";
			definition = "Country of taxation of the organisation or individual person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public CountryCode getValue(TaxReporting2 obj) {
			return obj.getTaxationCountry();
		}

		@Override
		public void setValue(TaxReporting2 obj, CountryCode value) {
			obj.setTaxationCountry(value);
		}
	};
	@XmlElement(name = "TaxRate")
	protected PercentageRate taxRate;
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
	 * {@linkplain com.tools20022.repository.msg.TaxReporting2 TaxReporting2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax rate to be applied."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxReporting2, Optional<PercentageRate>> mmTaxRate = new MMMessageAttribute<TaxReporting2, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxReporting2.mmObject();
			isDerived = false;
			xmlTag = "TaxRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRate";
			definition = "Tax rate to be applied.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(TaxReporting2 obj) {
			return obj.getTaxRate();
		}

		@Override
		public void setValue(TaxReporting2 obj, Optional<PercentageRate> value) {
			obj.setTaxRate(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxPyer")
	protected PartyIdentification70Choice taxPayer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
	 * PartyIdentification70Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxPayer TaxPayer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxReporting2 TaxReporting2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxPyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxPayer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that pays the tax."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxReporting2, Optional<PartyIdentification70Choice>> mmTaxPayer = new MMMessageAssociationEnd<TaxReporting2, Optional<PartyIdentification70Choice>>() {
		{
			businessComponentTrace_lazy = () -> TaxPayer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxReporting2.mmObject();
			isDerived = false;
			xmlTag = "TaxPyer";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxPayer";
			definition = "Party that pays the tax.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification70Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification70Choice> getValue(TaxReporting2 obj) {
			return obj.getTaxPayer();
		}

		@Override
		public void setValue(TaxReporting2 obj, Optional<PartyIdentification70Choice> value) {
			obj.setTaxPayer(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxRcpt")
	protected PartyIdentification70Choice taxRecipient;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
	 * PartyIdentification70Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxRecipient TaxRecipient}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxReporting2 TaxReporting2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRcpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRecipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that receives the tax."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxReporting2, Optional<PartyIdentification70Choice>> mmTaxRecipient = new MMMessageAssociationEnd<TaxReporting2, Optional<PartyIdentification70Choice>>() {
		{
			businessComponentTrace_lazy = () -> TaxRecipient.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxReporting2.mmObject();
			isDerived = false;
			xmlTag = "TaxRcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRecipient";
			definition = "Party that receives the tax.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification70Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification70Choice> getValue(TaxReporting2 obj) {
			return obj.getTaxRecipient();
		}

		@Override
		public void setValue(TaxReporting2 obj, Optional<PartyIdentification70Choice> value) {
			obj.setTaxRecipient(value.orElse(null));
		}
	};
	@XmlElement(name = "CshAcctDtls")
	protected CashAccount33 cashAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount33
	 * CashAccount33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxAccount
	 * Tax.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxReporting2 TaxReporting2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account information for the payment of tax."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxReporting2, Optional<CashAccount33>> mmCashAccountDetails = new MMMessageAssociationEnd<TaxReporting2, Optional<CashAccount33>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmTaxAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxReporting2.mmObject();
			isDerived = false;
			xmlTag = "CshAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountDetails";
			definition = "Cash account information for the payment of tax.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount33.mmObject();
		}

		@Override
		public Optional<CashAccount33> getValue(TaxReporting2 obj) {
			return obj.getCashAccountDetails();
		}

		@Override
		public void setValue(TaxReporting2 obj, Optional<CashAccount33> value) {
			obj.setCashAccountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "Desc")
	protected Max350Text description;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxReporting2 TaxReporting2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information for the reporting of tax."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxReporting2, Optional<Max350Text>> mmDescription = new MMMessageAttribute<TaxReporting2, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxReporting2.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Additional information for the reporting of tax.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(TaxReporting2 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(TaxReporting2 obj, Optional<Max350Text> value) {
			obj.setDescription(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxReporting2.mmTaxationCountry, com.tools20022.repository.msg.TaxReporting2.mmTaxRate, com.tools20022.repository.msg.TaxReporting2.mmTaxPayer,
						com.tools20022.repository.msg.TaxReporting2.mmTaxRecipient, com.tools20022.repository.msg.TaxReporting2.mmCashAccountDetails, com.tools20022.repository.msg.TaxReporting2.mmDescription);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxReporting2";
				definition = "Information for tax reporting.";
			}
		});
		return mmObject_lazy.get();
	}

	public CountryCode getTaxationCountry() {
		return taxationCountry;
	}

	public TaxReporting2 setTaxationCountry(CountryCode taxationCountry) {
		this.taxationCountry = Objects.requireNonNull(taxationCountry);
		return this;
	}

	public Optional<PercentageRate> getTaxRate() {
		return taxRate == null ? Optional.empty() : Optional.of(taxRate);
	}

	public TaxReporting2 setTaxRate(PercentageRate taxRate) {
		this.taxRate = taxRate;
		return this;
	}

	public Optional<PartyIdentification70Choice> getTaxPayer() {
		return taxPayer == null ? Optional.empty() : Optional.of(taxPayer);
	}

	public TaxReporting2 setTaxPayer(PartyIdentification70Choice taxPayer) {
		this.taxPayer = taxPayer;
		return this;
	}

	public Optional<PartyIdentification70Choice> getTaxRecipient() {
		return taxRecipient == null ? Optional.empty() : Optional.of(taxRecipient);
	}

	public TaxReporting2 setTaxRecipient(PartyIdentification70Choice taxRecipient) {
		this.taxRecipient = taxRecipient;
		return this;
	}

	public Optional<CashAccount33> getCashAccountDetails() {
		return cashAccountDetails == null ? Optional.empty() : Optional.of(cashAccountDetails);
	}

	public TaxReporting2 setCashAccountDetails(CashAccount33 cashAccountDetails) {
		this.cashAccountDetails = cashAccountDetails;
		return this;
	}

	public Optional<Max350Text> getDescription() {
		return description == null ? Optional.empty() : Optional.of(description);
	}

	public TaxReporting2 setDescription(Max350Text description) {
		this.description = description;
		return this;
	}
}