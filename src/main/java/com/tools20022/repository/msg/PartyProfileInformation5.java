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
import com.tools20022.repository.choice.CertificationType1Choice;
import com.tools20022.repository.choice.CustomerConductClassification1Choice;
import com.tools20022.repository.choice.KYCCheckType1Choice;
import com.tools20022.repository.choice.RiskLevel2Choice;
import com.tools20022.repository.codeset.EventFrequency1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.PersonProfile;
import com.tools20022.repository.entity.PrivateCertificate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DataBaseCheck1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information to support the Know Your Customer (KYC) processes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmCertificationIndicator
 * PartyProfileInformation5.mmCertificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmValidatingParty
 * PartyProfileInformation5.mmValidatingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmCheckingParty
 * PartyProfileInformation5.mmCheckingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmResponsibleParty
 * PartyProfileInformation5.mmResponsibleParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmCertificateType
 * PartyProfileInformation5.mmCertificateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmCheckingDate
 * PartyProfileInformation5.mmCheckingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmCheckingFrequency
 * PartyProfileInformation5.mmCheckingFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmNextRevisionDate
 * PartyProfileInformation5.mmNextRevisionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmSalaryRange
 * PartyProfileInformation5.mmSalaryRange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmSourceOfWealth
 * PartyProfileInformation5.mmSourceOfWealth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmCustomerConductClassification
 * PartyProfileInformation5.mmCustomerConductClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmRiskLevel
 * PartyProfileInformation5.mmRiskLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmKnowYourCustomerCheckType
 * PartyProfileInformation5.mmKnowYourCustomerCheckType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmKnowYourCustomerDatabaseCheck
 * PartyProfileInformation5.mmKnowYourCustomerDatabaseCheck}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PrivateCertificate
 * PrivateCertificate}</li>
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
 * "PartyProfileInformation5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information to support the Know Your Customer (KYC) processes."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyProfileInformation5", propOrder = {"certificationIndicator", "validatingParty", "checkingParty", "responsibleParty", "certificateType", "checkingDate", "checkingFrequency", "nextRevisionDate", "salaryRange",
		"sourceOfWealth", "customerConductClassification", "riskLevel", "knowYourCustomerCheckType", "knowYourCustomerDatabaseCheck"})
public class PartyProfileInformation5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CertfctnInd")
	protected YesNoIndicator certificationIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmCertificationIndicator
	 * PrivateCertificate.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5
	 * PartyProfileInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the certificate type has been obtained and verified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation5, Optional<YesNoIndicator>> mmCertificationIndicator = new MMMessageAttribute<PartyProfileInformation5, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> PrivateCertificate.mmCertificationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation5.mmObject();
			isDerived = false;
			xmlTag = "CertfctnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationIndicator";
			definition = "Indicates whether the certificate type has been obtained and verified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(PartyProfileInformation5 obj) {
			return obj.getCertificationIndicator();
		}

		@Override
		public void setValue(PartyProfileInformation5 obj, Optional<YesNoIndicator> value) {
			obj.setCertificationIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "VldtngPty")
	protected Max140Text validatingParty;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5
	 * PartyProfileInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtngPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidatingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the person who validated the document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation5, Optional<Max140Text>> mmValidatingParty = new MMMessageAttribute<PartyProfileInformation5, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation5.mmObject();
			isDerived = false;
			xmlTag = "VldtngPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidatingParty";
			definition = "Identification of the person who validated the document.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(PartyProfileInformation5 obj) {
			return obj.getValidatingParty();
		}

		@Override
		public void setValue(PartyProfileInformation5 obj, Optional<Max140Text> value) {
			obj.setValidatingParty(value.orElse(null));
		}
	};
	@XmlElement(name = "ChckngPty")
	protected Max140Text checkingParty;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5
	 * PartyProfileInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChckngPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CheckingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the person who checked the document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation5, Optional<Max140Text>> mmCheckingParty = new MMMessageAttribute<PartyProfileInformation5, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation5.mmObject();
			isDerived = false;
			xmlTag = "ChckngPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckingParty";
			definition = "Identification of the person who checked the document.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(PartyProfileInformation5 obj) {
			return obj.getCheckingParty();
		}

		@Override
		public void setValue(PartyProfileInformation5 obj, Optional<Max140Text> value) {
			obj.setCheckingParty(value.orElse(null));
		}
	};
	@XmlElement(name = "RspnsblPty")
	protected Max140Text responsibleParty;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5
	 * PartyProfileInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnsblPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponsibleParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the person who is responsible for the document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation5, Optional<Max140Text>> mmResponsibleParty = new MMMessageAttribute<PartyProfileInformation5, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation5.mmObject();
			isDerived = false;
			xmlTag = "RspnsblPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponsibleParty";
			definition = "Identification of the person who is responsible for the document.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(PartyProfileInformation5 obj) {
			return obj.getResponsibleParty();
		}

		@Override
		public void setValue(PartyProfileInformation5 obj, Optional<Max140Text> value) {
			obj.setResponsibleParty(value.orElse(null));
		}
	};
	@XmlElement(name = "CertTp")
	protected CertificationType1Choice certificateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CertificationType1Choice
	 * CertificationType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate
	 * PrivateCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5
	 * PartyProfileInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of certificate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation5, Optional<CertificationType1Choice>> mmCertificateType = new MMMessageAttribute<PartyProfileInformation5, Optional<CertificationType1Choice>>() {
		{
			businessComponentTrace_lazy = () -> PrivateCertificate.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation5.mmObject();
			isDerived = false;
			xmlTag = "CertTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateType";
			definition = "Type of certificate.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CertificationType1Choice.mmObject();
		}

		@Override
		public Optional<CertificationType1Choice> getValue(PartyProfileInformation5 obj) {
			return obj.getCertificateType();
		}

		@Override
		public void setValue(PartyProfileInformation5 obj, Optional<CertificationType1Choice> value) {
			obj.setCertificateType(value.orElse(null));
		}
	};
	@XmlElement(name = "ChckngDt")
	protected ISODate checkingDate;
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
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmCheckingDate
	 * PrivateCertificate.mmCheckingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5
	 * PartyProfileInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChckngDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CheckingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the certification check has been performed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation5, Optional<ISODate>> mmCheckingDate = new MMMessageAttribute<PartyProfileInformation5, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> PrivateCertificate.mmCheckingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation5.mmObject();
			isDerived = false;
			xmlTag = "ChckngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckingDate";
			definition = "Date at which the certification check has been performed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(PartyProfileInformation5 obj) {
			return obj.getCheckingDate();
		}

		@Override
		public void setValue(PartyProfileInformation5 obj, Optional<ISODate> value) {
			obj.setCheckingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ChckngFrqcy")
	protected EventFrequency1Code checkingFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequency1Code
	 * EventFrequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmCheckingFrequency
	 * PrivateCertificate.mmCheckingFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5
	 * PartyProfileInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChckngFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CheckingFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies how frequently the check is performed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation5, Optional<EventFrequency1Code>> mmCheckingFrequency = new MMMessageAttribute<PartyProfileInformation5, Optional<EventFrequency1Code>>() {
		{
			businessElementTrace_lazy = () -> PrivateCertificate.mmCheckingFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation5.mmObject();
			isDerived = false;
			xmlTag = "ChckngFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CheckingFrequency";
			definition = "Specifies how frequently the check is performed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EventFrequency1Code.mmObject();
		}

		@Override
		public Optional<EventFrequency1Code> getValue(PartyProfileInformation5 obj) {
			return obj.getCheckingFrequency();
		}

		@Override
		public void setValue(PartyProfileInformation5 obj, Optional<EventFrequency1Code> value) {
			obj.setCheckingFrequency(value.orElse(null));
		}
	};
	@XmlElement(name = "NxtRvsnDt")
	protected ISODate nextRevisionDate;
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
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmNextRevisionDate
	 * PrivateCertificate.mmNextRevisionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5
	 * PartyProfileInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NxtRvsnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextRevisionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date at which the next certification check will be performed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation5, Optional<ISODate>> mmNextRevisionDate = new MMMessageAttribute<PartyProfileInformation5, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> PrivateCertificate.mmNextRevisionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation5.mmObject();
			isDerived = false;
			xmlTag = "NxtRvsnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NextRevisionDate";
			definition = "Specifies the date at which the next certification check will be performed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(PartyProfileInformation5 obj) {
			return obj.getNextRevisionDate();
		}

		@Override
		public void setValue(PartyProfileInformation5 obj, Optional<ISODate> value) {
			obj.setNextRevisionDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SlryRg")
	protected Max35Text salaryRange;
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
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmSalaryRange
	 * PersonProfile.mmSalaryRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5
	 * PartyProfileInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlryRg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SalaryRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limits between which a person's salary is estimated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation5, Optional<Max35Text>> mmSalaryRange = new MMMessageAttribute<PartyProfileInformation5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PersonProfile.mmSalaryRange;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation5.mmObject();
			isDerived = false;
			xmlTag = "SlryRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SalaryRange";
			definition = "Limits between which a person's salary is estimated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PartyProfileInformation5 obj) {
			return obj.getSalaryRange();
		}

		@Override
		public void setValue(PartyProfileInformation5 obj, Optional<Max35Text> value) {
			obj.setSalaryRange(value.orElse(null));
		}
	};
	@XmlElement(name = "SrcOfWlth")
	protected Max140Text sourceOfWealth;
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
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmSourceOfWealth
	 * PersonProfile.mmSourceOfWealth}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5
	 * PartyProfileInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrcOfWlth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceOfWealth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the main source of revenue."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation5, Optional<Max140Text>> mmSourceOfWealth = new MMMessageAttribute<PartyProfileInformation5, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> PersonProfile.mmSourceOfWealth;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation5.mmObject();
			isDerived = false;
			xmlTag = "SrcOfWlth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceOfWealth";
			definition = "Indicates the main source of revenue.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(PartyProfileInformation5 obj) {
			return obj.getSourceOfWealth();
		}

		@Override
		public void setValue(PartyProfileInformation5 obj, Optional<Max140Text> value) {
			obj.setSourceOfWealth(value.orElse(null));
		}
	};
	@XmlElement(name = "CstmrCndctClssfctn")
	protected CustomerConductClassification1Choice customerConductClassification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CustomerConductClassification1Choice
	 * CustomerConductClassification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5
	 * PartyProfileInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrCndctClssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerConductClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies an assessment of the customer’s behaviour at the time of the account opening application."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation5, Optional<CustomerConductClassification1Choice>> mmCustomerConductClassification = new MMMessageAttribute<PartyProfileInformation5, Optional<CustomerConductClassification1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation5.mmObject();
			isDerived = false;
			xmlTag = "CstmrCndctClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerConductClassification";
			definition = "Specifies an assessment of the customer’s behaviour at the time of the account opening application.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CustomerConductClassification1Choice.mmObject();
		}

		@Override
		public Optional<CustomerConductClassification1Choice> getValue(PartyProfileInformation5 obj) {
			return obj.getCustomerConductClassification();
		}

		@Override
		public void setValue(PartyProfileInformation5 obj, Optional<CustomerConductClassification1Choice> value) {
			obj.setCustomerConductClassification(value.orElse(null));
		}
	};
	@XmlElement(name = "RskLvl")
	protected RiskLevel2Choice riskLevel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RiskLevel2Choice
	 * RiskLevel2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5
	 * PartyProfileInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RskLvl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the customer’s money laundering risk."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyProfileInformation5, Optional<RiskLevel2Choice>> mmRiskLevel = new MMMessageAttribute<PartyProfileInformation5, Optional<RiskLevel2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation5.mmObject();
			isDerived = false;
			xmlTag = "RskLvl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RiskLevel";
			definition = "Specifies the customer’s money laundering risk.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RiskLevel2Choice.mmObject();
		}

		@Override
		public Optional<RiskLevel2Choice> getValue(PartyProfileInformation5 obj) {
			return obj.getRiskLevel();
		}

		@Override
		public void setValue(PartyProfileInformation5 obj, Optional<RiskLevel2Choice> value) {
			obj.setRiskLevel(value.orElse(null));
		}
	};
	@XmlElement(name = "KnowYourCstmrChckTp")
	protected KYCCheckType1Choice knowYourCustomerCheckType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.KYCCheckType1Choice
	 * KYCCheckType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmKnowYourCustomerCheckType
	 * PersonProfile.mmKnowYourCustomerCheckType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5
	 * PartyProfileInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KnowYourCstmrChckTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KnowYourCustomerCheckType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of due diligence checks carried out on the investor or account owner. For definitions of ordinary, simple and enhanced know your customer checks, local market regulations should be consulted."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyProfileInformation5, Optional<KYCCheckType1Choice>> mmKnowYourCustomerCheckType = new MMMessageAssociationEnd<PartyProfileInformation5, Optional<KYCCheckType1Choice>>() {
		{
			businessElementTrace_lazy = () -> PersonProfile.mmKnowYourCustomerCheckType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation5.mmObject();
			isDerived = false;
			xmlTag = "KnowYourCstmrChckTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KnowYourCustomerCheckType";
			definition = "Specifies the type of due diligence checks carried out on the investor or account owner. For definitions of ordinary, simple and enhanced know your customer checks, local market regulations should be consulted.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> KYCCheckType1Choice.mmObject();
		}

		@Override
		public Optional<KYCCheckType1Choice> getValue(PartyProfileInformation5 obj) {
			return obj.getKnowYourCustomerCheckType();
		}

		@Override
		public void setValue(PartyProfileInformation5 obj, Optional<KYCCheckType1Choice> value) {
			obj.setKnowYourCustomerCheckType(value.orElse(null));
		}
	};
	@XmlElement(name = "KnowYourCstmrDBChck")
	protected DataBaseCheck1 knowYourCustomerDatabaseCheck;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DataBaseCheck1
	 * DataBaseCheck1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5
	 * PartyProfileInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KnowYourCstmrDBChck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KnowYourCustomerDatabaseCheck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether a customer has been checked in a Know Your Customer (KYC) database."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyProfileInformation5, Optional<DataBaseCheck1>> mmKnowYourCustomerDatabaseCheck = new MMMessageAssociationEnd<PartyProfileInformation5, Optional<DataBaseCheck1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation5.mmObject();
			isDerived = false;
			xmlTag = "KnowYourCstmrDBChck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KnowYourCustomerDatabaseCheck";
			definition = "Specifies whether a customer has been checked in a Know Your Customer (KYC) database.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DataBaseCheck1.mmObject();
		}

		@Override
		public Optional<DataBaseCheck1> getValue(PartyProfileInformation5 obj) {
			return obj.getKnowYourCustomerDatabaseCheck();
		}

		@Override
		public void setValue(PartyProfileInformation5 obj, Optional<DataBaseCheck1> value) {
			obj.setKnowYourCustomerDatabaseCheck(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyProfileInformation5.mmCertificationIndicator, com.tools20022.repository.msg.PartyProfileInformation5.mmValidatingParty,
						com.tools20022.repository.msg.PartyProfileInformation5.mmCheckingParty, com.tools20022.repository.msg.PartyProfileInformation5.mmResponsibleParty,
						com.tools20022.repository.msg.PartyProfileInformation5.mmCertificateType, com.tools20022.repository.msg.PartyProfileInformation5.mmCheckingDate,
						com.tools20022.repository.msg.PartyProfileInformation5.mmCheckingFrequency, com.tools20022.repository.msg.PartyProfileInformation5.mmNextRevisionDate,
						com.tools20022.repository.msg.PartyProfileInformation5.mmSalaryRange, com.tools20022.repository.msg.PartyProfileInformation5.mmSourceOfWealth,
						com.tools20022.repository.msg.PartyProfileInformation5.mmCustomerConductClassification, com.tools20022.repository.msg.PartyProfileInformation5.mmRiskLevel,
						com.tools20022.repository.msg.PartyProfileInformation5.mmKnowYourCustomerCheckType, com.tools20022.repository.msg.PartyProfileInformation5.mmKnowYourCustomerDatabaseCheck);
				trace_lazy = () -> PrivateCertificate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyProfileInformation5";
				definition = "Information to support the Know Your Customer (KYC) processes.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<YesNoIndicator> getCertificationIndicator() {
		return certificationIndicator == null ? Optional.empty() : Optional.of(certificationIndicator);
	}

	public PartyProfileInformation5 setCertificationIndicator(YesNoIndicator certificationIndicator) {
		this.certificationIndicator = certificationIndicator;
		return this;
	}

	public Optional<Max140Text> getValidatingParty() {
		return validatingParty == null ? Optional.empty() : Optional.of(validatingParty);
	}

	public PartyProfileInformation5 setValidatingParty(Max140Text validatingParty) {
		this.validatingParty = validatingParty;
		return this;
	}

	public Optional<Max140Text> getCheckingParty() {
		return checkingParty == null ? Optional.empty() : Optional.of(checkingParty);
	}

	public PartyProfileInformation5 setCheckingParty(Max140Text checkingParty) {
		this.checkingParty = checkingParty;
		return this;
	}

	public Optional<Max140Text> getResponsibleParty() {
		return responsibleParty == null ? Optional.empty() : Optional.of(responsibleParty);
	}

	public PartyProfileInformation5 setResponsibleParty(Max140Text responsibleParty) {
		this.responsibleParty = responsibleParty;
		return this;
	}

	public Optional<CertificationType1Choice> getCertificateType() {
		return certificateType == null ? Optional.empty() : Optional.of(certificateType);
	}

	public PartyProfileInformation5 setCertificateType(CertificationType1Choice certificateType) {
		this.certificateType = certificateType;
		return this;
	}

	public Optional<ISODate> getCheckingDate() {
		return checkingDate == null ? Optional.empty() : Optional.of(checkingDate);
	}

	public PartyProfileInformation5 setCheckingDate(ISODate checkingDate) {
		this.checkingDate = checkingDate;
		return this;
	}

	public Optional<EventFrequency1Code> getCheckingFrequency() {
		return checkingFrequency == null ? Optional.empty() : Optional.of(checkingFrequency);
	}

	public PartyProfileInformation5 setCheckingFrequency(EventFrequency1Code checkingFrequency) {
		this.checkingFrequency = checkingFrequency;
		return this;
	}

	public Optional<ISODate> getNextRevisionDate() {
		return nextRevisionDate == null ? Optional.empty() : Optional.of(nextRevisionDate);
	}

	public PartyProfileInformation5 setNextRevisionDate(ISODate nextRevisionDate) {
		this.nextRevisionDate = nextRevisionDate;
		return this;
	}

	public Optional<Max35Text> getSalaryRange() {
		return salaryRange == null ? Optional.empty() : Optional.of(salaryRange);
	}

	public PartyProfileInformation5 setSalaryRange(Max35Text salaryRange) {
		this.salaryRange = salaryRange;
		return this;
	}

	public Optional<Max140Text> getSourceOfWealth() {
		return sourceOfWealth == null ? Optional.empty() : Optional.of(sourceOfWealth);
	}

	public PartyProfileInformation5 setSourceOfWealth(Max140Text sourceOfWealth) {
		this.sourceOfWealth = sourceOfWealth;
		return this;
	}

	public Optional<CustomerConductClassification1Choice> getCustomerConductClassification() {
		return customerConductClassification == null ? Optional.empty() : Optional.of(customerConductClassification);
	}

	public PartyProfileInformation5 setCustomerConductClassification(CustomerConductClassification1Choice customerConductClassification) {
		this.customerConductClassification = customerConductClassification;
		return this;
	}

	public Optional<RiskLevel2Choice> getRiskLevel() {
		return riskLevel == null ? Optional.empty() : Optional.of(riskLevel);
	}

	public PartyProfileInformation5 setRiskLevel(RiskLevel2Choice riskLevel) {
		this.riskLevel = riskLevel;
		return this;
	}

	public Optional<KYCCheckType1Choice> getKnowYourCustomerCheckType() {
		return knowYourCustomerCheckType == null ? Optional.empty() : Optional.of(knowYourCustomerCheckType);
	}

	public PartyProfileInformation5 setKnowYourCustomerCheckType(KYCCheckType1Choice knowYourCustomerCheckType) {
		this.knowYourCustomerCheckType = knowYourCustomerCheckType;
		return this;
	}

	public Optional<DataBaseCheck1> getKnowYourCustomerDatabaseCheck() {
		return knowYourCustomerDatabaseCheck == null ? Optional.empty() : Optional.of(knowYourCustomerDatabaseCheck);
	}

	public PartyProfileInformation5 setKnowYourCustomerDatabaseCheck(DataBaseCheck1 knowYourCustomerDatabaseCheck) {
		this.knowYourCustomerDatabaseCheck = knowYourCustomerDatabaseCheck;
		return this;
	}
}