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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.CashAccountIdentification5Choice;
import com.tools20022.repository.choice.PartyIdentification94Choice;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AlternatePartyIdentification7;
import com.tools20022.repository.msg.PartyTextInformation2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Party and account details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#mmIdentification
 * PartyIdentificationAndAccount112.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#mmLEI
 * PartyIdentificationAndAccount112.mmLEI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#mmAlternateIdentification
 * PartyIdentificationAndAccount112.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#mmCashAccount
 * PartyIdentificationAndAccount112.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#mmChargesAccount
 * PartyIdentificationAndAccount112.mmChargesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#mmCommissionAccount
 * PartyIdentificationAndAccount112.mmCommissionAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#mmTaxAccount
 * PartyIdentificationAndAccount112.mmTaxAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112#mmAdditionalInformation
 * PartyIdentificationAndAccount112.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
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
 * "PartyIdentificationAndAccount112"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party and account details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyIdentificationAndAccount112", propOrder = {"identification", "lEI", "alternateIdentification", "cashAccount", "chargesAccount", "commissionAccount", "taxAccount", "additionalInformation"})
public class PartyIdentificationAndAccount112 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected PartyIdentification94Choice identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification94Choice
	 * PartyIdentification94Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112
	 * PartyIdentificationAndAccount112}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the party."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentificationAndAccount112, PartyIdentification94Choice> mmIdentification = new MMMessageAssociationEnd<PartyIdentificationAndAccount112, PartyIdentification94Choice>() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount112.mmObject();
			isDerived = false;
			xmlTag = "Id";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification94Choice.mmObject();
		}

		@Override
		public PartyIdentification94Choice getValue(PartyIdentificationAndAccount112 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(PartyIdentificationAndAccount112 obj, PartyIdentification94Choice value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "LEI")
	protected LEIIdentifier lEI;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmLEI
	 * PartyIdentificationInformation.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112
	 * PartyIdentificationAndAccount112}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LEI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal entity identification as an alternate identification for a party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentificationAndAccount112, Optional<LEIIdentifier>> mmLEI = new MMMessageAttribute<PartyIdentificationAndAccount112, Optional<LEIIdentifier>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmLEI;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount112.mmObject();
			isDerived = false;
			xmlTag = "LEI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LEI";
			definition = "Legal entity identification as an alternate identification for a party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}

		@Override
		public Optional<LEIIdentifier> getValue(PartyIdentificationAndAccount112 obj) {
			return obj.getLEI();
		}

		@Override
		public void setValue(PartyIdentificationAndAccount112 obj, Optional<LEIIdentifier> value) {
			obj.setLEI(value.orElse(null));
		}
	};
	@XmlElement(name = "AltrnId")
	protected AlternatePartyIdentification7 alternateIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AlternatePartyIdentification7
	 * AlternatePartyIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112
	 * PartyIdentificationAndAccount112}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AltrnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95S::ALTE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Alternate identification for a party."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentificationAndAccount112, Optional<AlternatePartyIdentification7>> mmAlternateIdentification = new MMMessageAssociationEnd<PartyIdentificationAndAccount112, Optional<AlternatePartyIdentification7>>() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount112.mmObject();
			isDerived = false;
			xmlTag = "AltrnId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95S::ALTE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternateIdentification";
			definition = "Alternate identification for a party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AlternatePartyIdentification7.mmObject();
		}

		@Override
		public Optional<AlternatePartyIdentification7> getValue(PartyIdentificationAndAccount112 obj) {
			return obj.getAlternateIdentification();
		}

		@Override
		public void setValue(PartyIdentificationAndAccount112 obj, Optional<AlternatePartyIdentification7> value) {
			obj.setAlternateIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CshAcct")
	protected CashAccountIdentification5Choice cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification5Choice
	 * CashAccountIdentification5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112
	 * PartyIdentificationAndAccount112}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :97a::CASH</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a cash entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentificationAndAccount112, Optional<CashAccountIdentification5Choice>> mmCashAccount = new MMMessageAssociationEnd<PartyIdentificationAndAccount112, Optional<CashAccountIdentification5Choice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount112.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97a::CASH"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Account to or from which a cash entry is made.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccountIdentification5Choice.mmObject();
		}

		@Override
		public Optional<CashAccountIdentification5Choice> getValue(PartyIdentificationAndAccount112 obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(PartyIdentificationAndAccount112 obj, Optional<CashAccountIdentification5Choice> value) {
			obj.setCashAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgsAcct")
	protected CashAccountIdentification5Choice chargesAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification5Choice
	 * CashAccountIdentification5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112
	 * PartyIdentificationAndAccount112}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :97a::CHAR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account to be used for charges/fees if different from the account for payment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentificationAndAccount112, Optional<CashAccountIdentification5Choice>> mmChargesAccount = new MMMessageAssociationEnd<PartyIdentificationAndAccount112, Optional<CashAccountIdentification5Choice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount112.mmObject();
			isDerived = false;
			xmlTag = "ChrgsAcct";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97a::CHAR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAccount";
			definition = "Account to be used for charges/fees if different from the account for payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccountIdentification5Choice.mmObject();
		}

		@Override
		public Optional<CashAccountIdentification5Choice> getValue(PartyIdentificationAndAccount112 obj) {
			return obj.getChargesAccount();
		}

		@Override
		public void setValue(PartyIdentificationAndAccount112 obj, Optional<CashAccountIdentification5Choice> value) {
			obj.setChargesAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "ComssnAcct")
	protected CashAccountIdentification5Choice commissionAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification5Choice
	 * CashAccountIdentification5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112
	 * PartyIdentificationAndAccount112}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComssnAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :97a::COMM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account to be used for commission if different from the account for payment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentificationAndAccount112, Optional<CashAccountIdentification5Choice>> mmCommissionAccount = new MMMessageAssociationEnd<PartyIdentificationAndAccount112, Optional<CashAccountIdentification5Choice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount112.mmObject();
			isDerived = false;
			xmlTag = "ComssnAcct";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97a::COMM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionAccount";
			definition = "Account to be used for commission if different from the account for payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccountIdentification5Choice.mmObject();
		}

		@Override
		public Optional<CashAccountIdentification5Choice> getValue(PartyIdentificationAndAccount112 obj) {
			return obj.getCommissionAccount();
		}

		@Override
		public void setValue(PartyIdentificationAndAccount112 obj, Optional<CashAccountIdentification5Choice> value) {
			obj.setCommissionAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxAcct")
	protected CashAccountIdentification5Choice taxAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification5Choice
	 * CashAccountIdentification5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112
	 * PartyIdentificationAndAccount112}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :97a::TAXE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account to be used for taxes if different from the account for payment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentificationAndAccount112, Optional<CashAccountIdentification5Choice>> mmTaxAccount = new MMMessageAssociationEnd<PartyIdentificationAndAccount112, Optional<CashAccountIdentification5Choice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount112.mmObject();
			isDerived = false;
			xmlTag = "TaxAcct";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97a::TAXE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAccount";
			definition = "Account to be used for taxes if different from the account for payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccountIdentification5Choice.mmObject();
		}

		@Override
		public Optional<CashAccountIdentification5Choice> getValue(PartyIdentificationAndAccount112 obj) {
			return obj.getTaxAccount();
		}

		@Override
		public void setValue(PartyIdentificationAndAccount112 obj, Optional<CashAccountIdentification5Choice> value) {
			obj.setTaxAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected PartyTextInformation2 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyTextInformation2
	 * PartyTextInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount112
	 * PartyIdentificationAndAccount112}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information to a party identification."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentificationAndAccount112, Optional<PartyTextInformation2>> mmAdditionalInformation = new MMMessageAssociationEnd<PartyIdentificationAndAccount112, Optional<PartyTextInformation2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount112.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information to a party identification.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyTextInformation2.mmObject();
		}

		@Override
		public Optional<PartyTextInformation2> getValue(PartyIdentificationAndAccount112 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(PartyIdentificationAndAccount112 obj, Optional<PartyTextInformation2> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentificationAndAccount112.mmIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount112.mmLEI,
						com.tools20022.repository.msg.PartyIdentificationAndAccount112.mmAlternateIdentification, com.tools20022.repository.msg.PartyIdentificationAndAccount112.mmCashAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount112.mmChargesAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount112.mmCommissionAccount,
						com.tools20022.repository.msg.PartyIdentificationAndAccount112.mmTaxAccount, com.tools20022.repository.msg.PartyIdentificationAndAccount112.mmAdditionalInformation);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentificationAndAccount112";
				definition = "Party and account details.";
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification94Choice getIdentification() {
		return identification;
	}

	public PartyIdentificationAndAccount112 setIdentification(PartyIdentification94Choice identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<LEIIdentifier> getLEI() {
		return lEI == null ? Optional.empty() : Optional.of(lEI);
	}

	public PartyIdentificationAndAccount112 setLEI(LEIIdentifier lEI) {
		this.lEI = lEI;
		return this;
	}

	public Optional<AlternatePartyIdentification7> getAlternateIdentification() {
		return alternateIdentification == null ? Optional.empty() : Optional.of(alternateIdentification);
	}

	public PartyIdentificationAndAccount112 setAlternateIdentification(AlternatePartyIdentification7 alternateIdentification) {
		this.alternateIdentification = alternateIdentification;
		return this;
	}

	public Optional<CashAccountIdentification5Choice> getCashAccount() {
		return cashAccount == null ? Optional.empty() : Optional.of(cashAccount);
	}

	public PartyIdentificationAndAccount112 setCashAccount(CashAccountIdentification5Choice cashAccount) {
		this.cashAccount = cashAccount;
		return this;
	}

	public Optional<CashAccountIdentification5Choice> getChargesAccount() {
		return chargesAccount == null ? Optional.empty() : Optional.of(chargesAccount);
	}

	public PartyIdentificationAndAccount112 setChargesAccount(CashAccountIdentification5Choice chargesAccount) {
		this.chargesAccount = chargesAccount;
		return this;
	}

	public Optional<CashAccountIdentification5Choice> getCommissionAccount() {
		return commissionAccount == null ? Optional.empty() : Optional.of(commissionAccount);
	}

	public PartyIdentificationAndAccount112 setCommissionAccount(CashAccountIdentification5Choice commissionAccount) {
		this.commissionAccount = commissionAccount;
		return this;
	}

	public Optional<CashAccountIdentification5Choice> getTaxAccount() {
		return taxAccount == null ? Optional.empty() : Optional.of(taxAccount);
	}

	public PartyIdentificationAndAccount112 setTaxAccount(CashAccountIdentification5Choice taxAccount) {
		this.taxAccount = taxAccount;
		return this;
	}

	public Optional<PartyTextInformation2> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public PartyIdentificationAndAccount112 setAdditionalInformation(PartyTextInformation2 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}
}