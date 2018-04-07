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
import com.tools20022.repository.codeset.DistributionPolicy1Code;
import com.tools20022.repository.codeset.FormOfSecurity1Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.LocalName;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Series1;
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
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmIdentification
 * FinancialInstrument57.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmName
 * FinancialInstrument57.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmShortName
 * FinancialInstrument57.mmShortName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmSupplementaryIdentification
 * FinancialInstrument57.mmSupplementaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmClassType
 * FinancialInstrument57.mmClassType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmSecuritiesForm
 * FinancialInstrument57.mmSecuritiesForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmDistributionPolicy
 * FinancialInstrument57.mmDistributionPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmProductGroup
 * FinancialInstrument57.mmProductGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmSeriesIdentification
 * FinancialInstrument57.mmSeriesIdentification}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintIdentificationGuideline#forFinancialInstrument57
 * ConstraintIdentificationGuideline.forFinancialInstrument57}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrument57"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, dividend option or valuation currency."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrument57", propOrder = {"identification", "name", "shortName", "supplementaryIdentification", "classType", "securitiesForm", "distributionPolicy", "productGroup", "seriesIdentification"})
public class FinancialInstrument57 {

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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57
	 * FinancialInstrument57}</li>
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
	public static final MMMessageAttribute<FinancialInstrument57, SecurityIdentification25Choice> mmIdentification = new MMMessageAttribute<FinancialInstrument57, SecurityIdentification25Choice>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument57.mmObject();
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
		public SecurityIdentification25Choice getValue(FinancialInstrument57 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(FinancialInstrument57 obj, SecurityIdentification25Choice value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57
	 * FinancialInstrument57}</li>
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
	public static final MMMessageAttribute<FinancialInstrument57, Optional<Max350Text>> mmName = new MMMessageAttribute<FinancialInstrument57, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> LocalName.mmFullName;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument57.mmObject();
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
		public Optional<Max350Text> getValue(FinancialInstrument57 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(FinancialInstrument57 obj, Optional<Max350Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57
	 * FinancialInstrument57}</li>
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
	public static final MMMessageAttribute<FinancialInstrument57, Optional<Max35Text>> mmShortName = new MMMessageAttribute<FinancialInstrument57, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> LocalName.mmShortName;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument57.mmObject();
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
		public Optional<Max35Text> getValue(FinancialInstrument57 obj) {
			return obj.getShortName();
		}

		@Override
		public void setValue(FinancialInstrument57 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57
	 * FinancialInstrument57}</li>
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
	public static final MMMessageAttribute<FinancialInstrument57, Optional<Max35Text>> mmSupplementaryIdentification = new MMMessageAttribute<FinancialInstrument57, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument57.mmObject();
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
		public Optional<Max35Text> getValue(FinancialInstrument57 obj) {
			return obj.getSupplementaryIdentification();
		}

		@Override
		public void setValue(FinancialInstrument57 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57
	 * FinancialInstrument57}</li>
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
	public static final MMMessageAttribute<FinancialInstrument57, Optional<Max35Text>> mmClassType = new MMMessageAttribute<FinancialInstrument57, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmClassType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument57.mmObject();
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
		public Optional<Max35Text> getValue(FinancialInstrument57 obj) {
			return obj.getClassType();
		}

		@Override
		public void setValue(FinancialInstrument57 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57
	 * FinancialInstrument57}</li>
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
	 * definition} =
	 * "Form, that is, ownership, of the security, for example, registered or bearer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument57, Optional<FormOfSecurity1Code>> mmSecuritiesForm = new MMMessageAttribute<FinancialInstrument57, Optional<FormOfSecurity1Code>>() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistrationForm;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument57.mmObject();
			isDerived = false;
			xmlTag = "SctiesForm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::FORM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesForm";
			definition = "Form, that is, ownership, of the security, for example, registered or bearer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FormOfSecurity1Code.mmObject();
		}

		@Override
		public Optional<FormOfSecurity1Code> getValue(FinancialInstrument57 obj) {
			return obj.getSecuritiesForm();
		}

		@Override
		public void setValue(FinancialInstrument57 obj, Optional<FormOfSecurity1Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57
	 * FinancialInstrument57}</li>
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
	 * "Income policy relating to a class type, that is, if income is paid out or retained in the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrument57, Optional<DistributionPolicy1Code>> mmDistributionPolicy = new MMMessageAttribute<FinancialInstrument57, Optional<DistributionPolicy1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmDistributionPolicy;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument57.mmObject();
			isDerived = false;
			xmlTag = "DstrbtnPlcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributionPolicy";
			definition = "Income policy relating to a class type, that is, if income is paid out or retained in the fund.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DistributionPolicy1Code.mmObject();
		}

		@Override
		public Optional<DistributionPolicy1Code> getValue(FinancialInstrument57 obj) {
			return obj.getDistributionPolicy();
		}

		@Override
		public void setValue(FinancialInstrument57 obj, Optional<DistributionPolicy1Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57
	 * FinancialInstrument57}</li>
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
	public static final MMMessageAttribute<FinancialInstrument57, Optional<Max140Text>> mmProductGroup = new MMMessageAttribute<FinancialInstrument57, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmProductGroup;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument57.mmObject();
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
		public Optional<Max140Text> getValue(FinancialInstrument57 obj) {
			return obj.getProductGroup();
		}

		@Override
		public void setValue(FinancialInstrument57 obj, Optional<Max140Text> value) {
			obj.setProductGroup(value.orElse(null));
		}
	};
	@XmlElement(name = "SrsId")
	protected Series1 seriesIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Series1 Series1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmSeriesName
	 * InvestmentFundClass.mmSeriesName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57
	 * FinancialInstrument57}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrsId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeriesIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Choice of formats for the identification of a series."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrument57, Optional<Series1>> mmSeriesIdentification = new MMMessageAssociationEnd<FinancialInstrument57, Optional<Series1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmSeriesName;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument57.mmObject();
			isDerived = false;
			xmlTag = "SrsId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SeriesIdentification";
			definition = "Choice of formats for the identification of a series.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Series1.mmObject();
		}

		@Override
		public Optional<Series1> getValue(FinancialInstrument57 obj) {
			return obj.getSeriesIdentification();
		}

		@Override
		public void setValue(FinancialInstrument57 obj, Optional<Series1> value) {
			obj.setSeriesIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument57.mmIdentification, com.tools20022.repository.msg.FinancialInstrument57.mmName,
						com.tools20022.repository.msg.FinancialInstrument57.mmShortName, com.tools20022.repository.msg.FinancialInstrument57.mmSupplementaryIdentification, com.tools20022.repository.msg.FinancialInstrument57.mmClassType,
						com.tools20022.repository.msg.FinancialInstrument57.mmSecuritiesForm, com.tools20022.repository.msg.FinancialInstrument57.mmDistributionPolicy, com.tools20022.repository.msg.FinancialInstrument57.mmProductGroup,
						com.tools20022.repository.msg.FinancialInstrument57.mmSeriesIdentification);
				trace_lazy = () -> InvestmentFundClass.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIdentificationGuideline.forFinancialInstrument57);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrument57";
				definition = "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, dividend option or valuation currency.";
			}
		});
		return mmObject_lazy.get();
	}

	public SecurityIdentification25Choice getIdentification() {
		return identification;
	}

	public FinancialInstrument57 setIdentification(SecurityIdentification25Choice identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max350Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public FinancialInstrument57 setName(Max350Text name) {
		this.name = name;
		return this;
	}

	public Optional<Max35Text> getShortName() {
		return shortName == null ? Optional.empty() : Optional.of(shortName);
	}

	public FinancialInstrument57 setShortName(Max35Text shortName) {
		this.shortName = shortName;
		return this;
	}

	public Optional<Max35Text> getSupplementaryIdentification() {
		return supplementaryIdentification == null ? Optional.empty() : Optional.of(supplementaryIdentification);
	}

	public FinancialInstrument57 setSupplementaryIdentification(Max35Text supplementaryIdentification) {
		this.supplementaryIdentification = supplementaryIdentification;
		return this;
	}

	public Optional<Max35Text> getClassType() {
		return classType == null ? Optional.empty() : Optional.of(classType);
	}

	public FinancialInstrument57 setClassType(Max35Text classType) {
		this.classType = classType;
		return this;
	}

	public Optional<FormOfSecurity1Code> getSecuritiesForm() {
		return securitiesForm == null ? Optional.empty() : Optional.of(securitiesForm);
	}

	public FinancialInstrument57 setSecuritiesForm(FormOfSecurity1Code securitiesForm) {
		this.securitiesForm = securitiesForm;
		return this;
	}

	public Optional<DistributionPolicy1Code> getDistributionPolicy() {
		return distributionPolicy == null ? Optional.empty() : Optional.of(distributionPolicy);
	}

	public FinancialInstrument57 setDistributionPolicy(DistributionPolicy1Code distributionPolicy) {
		this.distributionPolicy = distributionPolicy;
		return this;
	}

	public Optional<Max140Text> getProductGroup() {
		return productGroup == null ? Optional.empty() : Optional.of(productGroup);
	}

	public FinancialInstrument57 setProductGroup(Max140Text productGroup) {
		this.productGroup = productGroup;
		return this;
	}

	public Optional<Series1> getSeriesIdentification() {
		return seriesIdentification == null ? Optional.empty() : Optional.of(seriesIdentification);
	}

	public FinancialInstrument57 setSeriesIdentification(Series1 seriesIdentification) {
		this.seriesIdentification = seriesIdentification;
		return this;
	}
}