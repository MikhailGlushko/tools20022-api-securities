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
import com.tools20022.repository.choice.SecurityIdentification25Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.LocalName;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BlockedHoldingDetails2;
import com.tools20022.repository.msg.ThirdPartyRights1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Security that is a sub-set of an investment fund, and is governed by the same
 * investment fund policy, for example, dividend option or valuation currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmIdentification
 * FinancialInstrument56.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmName
 * FinancialInstrument56.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmShortName
 * FinancialInstrument56.mmShortName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmSupplementaryIdentification
 * FinancialInstrument56.mmSupplementaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmClassType
 * FinancialInstrument56.mmClassType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmSecuritiesForm
 * FinancialInstrument56.mmSecuritiesForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmDistributionPolicy
 * FinancialInstrument56.mmDistributionPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmProductGroup
 * FinancialInstrument56.mmProductGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmBlockedHoldingDetails
 * FinancialInstrument56.mmBlockedHoldingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmPledging
 * FinancialInstrument56.mmPledging}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmCollateral
 * FinancialInstrument56.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmThirdPartyRights
 * FinancialInstrument56.mmThirdPartyRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmFundOwnership
 * FinancialInstrument56.mmFundOwnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmFundIntention
 * FinancialInstrument56.mmFundIntention}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmOperationalStatus
 * FinancialInstrument56.mmOperationalStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
 * InvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIdentificationGuideline#forFinancialInstrument56
 * ConstraintIdentificationGuideline.forFinancialInstrument56}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrument56"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, dividend option or valuation currency."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrument56", propOrder = {"identification", "name", "shortName", "supplementaryIdentification", "classType", "securitiesForm", "distributionPolicy", "productGroup", "blockedHoldingDetails", "pledging",
		"collateral", "thirdPartyRights", "fundOwnership", "fundIntention", "operationalStatus"})
public class FinancialInstrument56 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected SecurityIdentification25Choice identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice
	 * SecurityIdentification25Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56
	 * FinancialInstrument56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the security by an ISIN."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument56, SecurityIdentification25Choice> mmIdentification = new MMMessageAttribute<FinancialInstrument56, SecurityIdentification25Choice>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument56.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the security by an ISIN.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification25Choice.mmObject();
		}

		@Override
		public SecurityIdentification25Choice getValue(FinancialInstrument56 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(FinancialInstrument56 obj, SecurityIdentification25Choice value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Nm")
	protected Max350Text name;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LocalName#mmFullName
	 * LocalName.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56
	 * FinancialInstrument56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70a::FIAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the financial instrument in free format text."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument56, Optional<Max350Text>> mmName = new MMMessageAttribute<FinancialInstrument56, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> LocalName.mmFullName;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument56.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70a::FIAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the financial instrument in free format text.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(FinancialInstrument56 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(FinancialInstrument56 obj, Optional<Max350Text> value) {
			obj.setName(value.orElse(null));
		}
	};
	@XmlElement(name = "ShrtNm")
	protected Max35Text shortName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LocalName#mmShortName
	 * LocalName.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56
	 * FinancialInstrument56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial Instrument Short Name (FISN) expressed in conformance with the ISO 18774 standard."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument56, Optional<Max35Text>> mmShortName = new MMMessageAttribute<FinancialInstrument56, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> LocalName.mmShortName;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument56.mmObject();
			isDerived = false;
			xmlTag = "ShrtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortName";
			definition = "Financial Instrument Short Name (FISN) expressed in conformance with the ISO 18774 standard.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(FinancialInstrument56 obj) {
			return obj.getShortName();
		}

		@Override
		public void setValue(FinancialInstrument56 obj, Optional<Max35Text> value) {
			obj.setShortName(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryId")
	protected Max35Text supplementaryIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56
	 * FinancialInstrument56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information about the financial instrument to help identify the instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument56, Optional<Max35Text>> mmSupplementaryIdentification = new MMMessageAttribute<FinancialInstrument56, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument56.mmObject();
			isDerived = false;
			xmlTag = "SplmtryId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryIdentification";
			definition = "Additional information about the financial instrument to help identify the instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(FinancialInstrument56 obj) {
			return obj.getSupplementaryIdentification();
		}

		@Override
		public void setValue(FinancialInstrument56 obj, Optional<Max35Text> value) {
			obj.setSupplementaryIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ClssTp")
	protected Max35Text classType;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmClassType
	 * InvestmentFundClass.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56
	 * FinancialInstrument56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClssTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Features of units offered by the fund. For example, a unit may have a specific load structure, for example, front end or back end, an income policy, for example, pay out or accumulate, or a trailer policy, for example, with or without. Fund classes are typically denoted by a single character, for example, 'Class A', 'Class 2'."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument56, Optional<Max35Text>> mmClassType = new MMMessageAttribute<FinancialInstrument56, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmClassType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument56.mmObject();
			isDerived = false;
			xmlTag = "ClssTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassType";
			definition = "Features of units offered by the fund. For example, a unit may have a specific load structure, for example, front end or back end, an income policy, for example, pay out or accumulate, or a trailer policy, for example, with or without. Fund classes are typically denoted by a single character, for example, 'Class A', 'Class 2'.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(FinancialInstrument56 obj) {
			return obj.getClassType();
		}

		@Override
		public void setValue(FinancialInstrument56 obj, Optional<Max35Text> value) {
			obj.setClassType(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesForm")
	protected FormOfSecurity1Code securitiesForm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FormOfSecurity1Code
	 * FormOfSecurity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistrationForm
	 * Security.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56
	 * FinancialInstrument56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::FORM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Form of ownership, that is registered or bearer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument56, Optional<FormOfSecurity1Code>> mmSecuritiesForm = new MMMessageAttribute<FinancialInstrument56, Optional<FormOfSecurity1Code>>() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistrationForm;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument56.mmObject();
			isDerived = false;
			xmlTag = "SctiesForm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::FORM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesForm";
			definition = "Form of ownership, that is registered or bearer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FormOfSecurity1Code.mmObject();
		}

		@Override
		public Optional<FormOfSecurity1Code> getValue(FinancialInstrument56 obj) {
			return obj.getSecuritiesForm();
		}

		@Override
		public void setValue(FinancialInstrument56 obj, Optional<FormOfSecurity1Code> value) {
			obj.setSecuritiesForm(value.orElse(null));
		}
	};
	@XmlElement(name = "DstrbtnPlcy")
	protected DistributionPolicy1Code distributionPolicy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionPolicy1Code
	 * DistributionPolicy1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDistributionPolicy
	 * InvestmentFundClass.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56
	 * FinancialInstrument56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DstrbtnPlcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributionPolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Income policy relating to the class type, that is, if income is paid out or retained in the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument56, Optional<DistributionPolicy1Code>> mmDistributionPolicy = new MMMessageAttribute<FinancialInstrument56, Optional<DistributionPolicy1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmDistributionPolicy;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument56.mmObject();
			isDerived = false;
			xmlTag = "DstrbtnPlcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributionPolicy";
			definition = "Income policy relating to the class type, that is, if income is paid out or retained in the fund.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DistributionPolicy1Code.mmObject();
		}

		@Override
		public Optional<DistributionPolicy1Code> getValue(FinancialInstrument56 obj) {
			return obj.getDistributionPolicy();
		}

		@Override
		public void setValue(FinancialInstrument56 obj, Optional<DistributionPolicy1Code> value) {
			obj.setDistributionPolicy(value.orElse(null));
		}
	};
	@XmlElement(name = "PdctGrp")
	protected Max140Text productGroup;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmProductGroup
	 * InvestmentFundClass.mmProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56
	 * FinancialInstrument56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctGrp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductGroup"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Company specific description of a group of funds."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument56, Optional<Max140Text>> mmProductGroup = new MMMessageAttribute<FinancialInstrument56, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmProductGroup;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument56.mmObject();
			isDerived = false;
			xmlTag = "PdctGrp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductGroup";
			definition = "Company specific description of a group of funds.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(FinancialInstrument56 obj) {
			return obj.getProductGroup();
		}

		@Override
		public void setValue(FinancialInstrument56 obj, Optional<Max140Text> value) {
			obj.setProductGroup(value.orElse(null));
		}
	};
	@XmlElement(name = "BlckdHldgDtls")
	protected BlockedHoldingDetails2 blockedHoldingDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails2
	 * BlockedHoldingDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56
	 * FinancialInstrument56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckdHldgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedHoldingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When an account at fund or security level is blocked, this specifies details on how the holding is blocked."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument56, Optional<BlockedHoldingDetails2>> mmBlockedHoldingDetails = new MMMessageAttribute<FinancialInstrument56, Optional<BlockedHoldingDetails2>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument56.mmObject();
			isDerived = false;
			xmlTag = "BlckdHldgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedHoldingDetails";
			definition = "When an account at fund or security level is blocked, this specifies details on how the holding is blocked.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BlockedHoldingDetails2.mmObject();
		}

		@Override
		public Optional<BlockedHoldingDetails2> getValue(FinancialInstrument56 obj) {
			return obj.getBlockedHoldingDetails();
		}

		@Override
		public void setValue(FinancialInstrument56 obj, Optional<BlockedHoldingDetails2> value) {
			obj.setBlockedHoldingDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "Pldgg")
	protected Eligible1Code pledging;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Eligible1Code
	 * Eligible1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56
	 * FinancialInstrument56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pldgg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pledging"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the holdings in the account are eligible for pledging."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument56, Optional<Eligible1Code>> mmPledging = new MMMessageAttribute<FinancialInstrument56, Optional<Eligible1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument56.mmObject();
			isDerived = false;
			xmlTag = "Pldgg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledging";
			definition = "Specifies whether the holdings in the account are eligible for pledging.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Eligible1Code.mmObject();
		}

		@Override
		public Optional<Eligible1Code> getValue(FinancialInstrument56 obj) {
			return obj.getPledging();
		}

		@Override
		public void setValue(FinancialInstrument56 obj, Optional<Eligible1Code> value) {
			obj.setPledging(value.orElse(null));
		}
	};
	@XmlElement(name = "Coll")
	protected Collateral1Code collateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Collateral1Code
	 * Collateral1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56
	 * FinancialInstrument56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Coll"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the holdings in the account are used as collateral."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument56, Optional<Collateral1Code>> mmCollateral = new MMMessageAttribute<FinancialInstrument56, Optional<Collateral1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument56.mmObject();
			isDerived = false;
			xmlTag = "Coll";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateral";
			definition = "Specifies whether the holdings in the account are used as collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Collateral1Code.mmObject();
		}

		@Override
		public Optional<Collateral1Code> getValue(FinancialInstrument56 obj) {
			return obj.getCollateral();
		}

		@Override
		public void setValue(FinancialInstrument56 obj, Optional<Collateral1Code> value) {
			obj.setCollateral(value.orElse(null));
		}
	};
	@XmlElement(name = "ThrdPtyRghts")
	protected ThirdPartyRights1 thirdPartyRights;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ThirdPartyRights1
	 * ThirdPartyRights1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56
	 * FinancialInstrument56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ThrdPtyRghts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdPartyRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of third party rights."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrument56, Optional<ThirdPartyRights1>> mmThirdPartyRights = new MMMessageAssociationEnd<FinancialInstrument56, Optional<ThirdPartyRights1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument56.mmObject();
			isDerived = false;
			xmlTag = "ThrdPtyRghts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdPartyRights";
			definition = "Details of third party rights.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ThirdPartyRights1.mmObject();
		}

		@Override
		public Optional<ThirdPartyRights1> getValue(FinancialInstrument56 obj) {
			return obj.getThirdPartyRights();
		}

		@Override
		public void setValue(FinancialInstrument56 obj, Optional<ThirdPartyRights1> value) {
			obj.setThirdPartyRights(value.orElse(null));
		}
	};
	@XmlElement(name = "FndOwnrsh")
	protected FundOwnership1Code fundOwnership;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FundOwnership1Code
	 * FundOwnership1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56
	 * FinancialInstrument56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndOwnrsh"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundOwnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if all the shares are owned exclusively by the fund company."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument56, Optional<FundOwnership1Code>> mmFundOwnership = new MMMessageAttribute<FinancialInstrument56, Optional<FundOwnership1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument56.mmObject();
			isDerived = false;
			xmlTag = "FndOwnrsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundOwnership";
			definition = "Specifies if all the shares are owned exclusively by the fund company.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FundOwnership1Code.mmObject();
		}

		@Override
		public Optional<FundOwnership1Code> getValue(FinancialInstrument56 obj) {
			return obj.getFundOwnership();
		}

		@Override
		public void setValue(FinancialInstrument56 obj, Optional<FundOwnership1Code> value) {
			obj.setFundOwnership(value.orElse(null));
		}
	};
	@XmlElement(name = "FndIntntn")
	protected FundIntention1Code fundIntention;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FundIntention1Code
	 * FundIntention1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56
	 * FinancialInstrument56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndIntntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundIntention"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the fund is intended for qualified investors."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument56, Optional<FundIntention1Code>> mmFundIntention = new MMMessageAttribute<FinancialInstrument56, Optional<FundIntention1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument56.mmObject();
			isDerived = false;
			xmlTag = "FndIntntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundIntention";
			definition = "Specifies if the fund is intended for qualified investors.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FundIntention1Code.mmObject();
		}

		@Override
		public Optional<FundIntention1Code> getValue(FinancialInstrument56 obj) {
			return obj.getFundIntention();
		}

		@Override
		public void setValue(FinancialInstrument56 obj, Optional<FundIntention1Code> value) {
			obj.setFundIntention(value.orElse(null));
		}
	};
	@XmlElement(name = "OprlSts")
	protected OperationalStatus1Code operationalStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OperationalStatus1Code
	 * OperationalStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56
	 * FinancialInstrument56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OprlSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperationalStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Operational status of the fund."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument56, Optional<OperationalStatus1Code>> mmOperationalStatus = new MMMessageAttribute<FinancialInstrument56, Optional<OperationalStatus1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument56.mmObject();
			isDerived = false;
			xmlTag = "OprlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationalStatus";
			definition = "Operational status of the fund.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OperationalStatus1Code.mmObject();
		}

		@Override
		public Optional<OperationalStatus1Code> getValue(FinancialInstrument56 obj) {
			return obj.getOperationalStatus();
		}

		@Override
		public void setValue(FinancialInstrument56 obj, Optional<OperationalStatus1Code> value) {
			obj.setOperationalStatus(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument56.mmIdentification, com.tools20022.repository.msg.FinancialInstrument56.mmName,
						com.tools20022.repository.msg.FinancialInstrument56.mmShortName, com.tools20022.repository.msg.FinancialInstrument56.mmSupplementaryIdentification, com.tools20022.repository.msg.FinancialInstrument56.mmClassType,
						com.tools20022.repository.msg.FinancialInstrument56.mmSecuritiesForm, com.tools20022.repository.msg.FinancialInstrument56.mmDistributionPolicy, com.tools20022.repository.msg.FinancialInstrument56.mmProductGroup,
						com.tools20022.repository.msg.FinancialInstrument56.mmBlockedHoldingDetails, com.tools20022.repository.msg.FinancialInstrument56.mmPledging, com.tools20022.repository.msg.FinancialInstrument56.mmCollateral,
						com.tools20022.repository.msg.FinancialInstrument56.mmThirdPartyRights, com.tools20022.repository.msg.FinancialInstrument56.mmFundOwnership, com.tools20022.repository.msg.FinancialInstrument56.mmFundIntention,
						com.tools20022.repository.msg.FinancialInstrument56.mmOperationalStatus);
				trace_lazy = () -> InvestmentFundClass.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIdentificationGuideline.forFinancialInstrument56);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrument56";
				definition = "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, dividend option or valuation currency.";
			}
		});
		return mmObject_lazy.get();
	}

	public SecurityIdentification25Choice getIdentification() {
		return identification;
	}

	public FinancialInstrument56 setIdentification(SecurityIdentification25Choice identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max350Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public FinancialInstrument56 setName(Max350Text name) {
		this.name = name;
		return this;
	}

	public Optional<Max35Text> getShortName() {
		return shortName == null ? Optional.empty() : Optional.of(shortName);
	}

	public FinancialInstrument56 setShortName(Max35Text shortName) {
		this.shortName = shortName;
		return this;
	}

	public Optional<Max35Text> getSupplementaryIdentification() {
		return supplementaryIdentification == null ? Optional.empty() : Optional.of(supplementaryIdentification);
	}

	public FinancialInstrument56 setSupplementaryIdentification(Max35Text supplementaryIdentification) {
		this.supplementaryIdentification = supplementaryIdentification;
		return this;
	}

	public Optional<Max35Text> getClassType() {
		return classType == null ? Optional.empty() : Optional.of(classType);
	}

	public FinancialInstrument56 setClassType(Max35Text classType) {
		this.classType = classType;
		return this;
	}

	public Optional<FormOfSecurity1Code> getSecuritiesForm() {
		return securitiesForm == null ? Optional.empty() : Optional.of(securitiesForm);
	}

	public FinancialInstrument56 setSecuritiesForm(FormOfSecurity1Code securitiesForm) {
		this.securitiesForm = securitiesForm;
		return this;
	}

	public Optional<DistributionPolicy1Code> getDistributionPolicy() {
		return distributionPolicy == null ? Optional.empty() : Optional.of(distributionPolicy);
	}

	public FinancialInstrument56 setDistributionPolicy(DistributionPolicy1Code distributionPolicy) {
		this.distributionPolicy = distributionPolicy;
		return this;
	}

	public Optional<Max140Text> getProductGroup() {
		return productGroup == null ? Optional.empty() : Optional.of(productGroup);
	}

	public FinancialInstrument56 setProductGroup(Max140Text productGroup) {
		this.productGroup = productGroup;
		return this;
	}

	public Optional<BlockedHoldingDetails2> getBlockedHoldingDetails() {
		return blockedHoldingDetails == null ? Optional.empty() : Optional.of(blockedHoldingDetails);
	}

	public FinancialInstrument56 setBlockedHoldingDetails(BlockedHoldingDetails2 blockedHoldingDetails) {
		this.blockedHoldingDetails = blockedHoldingDetails;
		return this;
	}

	public Optional<Eligible1Code> getPledging() {
		return pledging == null ? Optional.empty() : Optional.of(pledging);
	}

	public FinancialInstrument56 setPledging(Eligible1Code pledging) {
		this.pledging = pledging;
		return this;
	}

	public Optional<Collateral1Code> getCollateral() {
		return collateral == null ? Optional.empty() : Optional.of(collateral);
	}

	public FinancialInstrument56 setCollateral(Collateral1Code collateral) {
		this.collateral = collateral;
		return this;
	}

	public Optional<ThirdPartyRights1> getThirdPartyRights() {
		return thirdPartyRights == null ? Optional.empty() : Optional.of(thirdPartyRights);
	}

	public FinancialInstrument56 setThirdPartyRights(ThirdPartyRights1 thirdPartyRights) {
		this.thirdPartyRights = thirdPartyRights;
		return this;
	}

	public Optional<FundOwnership1Code> getFundOwnership() {
		return fundOwnership == null ? Optional.empty() : Optional.of(fundOwnership);
	}

	public FinancialInstrument56 setFundOwnership(FundOwnership1Code fundOwnership) {
		this.fundOwnership = fundOwnership;
		return this;
	}

	public Optional<FundIntention1Code> getFundIntention() {
		return fundIntention == null ? Optional.empty() : Optional.of(fundIntention);
	}

	public FinancialInstrument56 setFundIntention(FundIntention1Code fundIntention) {
		this.fundIntention = fundIntention;
		return this;
	}

	public Optional<OperationalStatus1Code> getOperationalStatus() {
		return operationalStatus == null ? Optional.empty() : Optional.of(operationalStatus);
	}

	public FinancialInstrument56 setOperationalStatus(OperationalStatus1Code operationalStatus) {
		this.operationalStatus = operationalStatus;
		return this;
	}
}