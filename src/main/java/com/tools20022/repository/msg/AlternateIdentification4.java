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
import com.tools20022.repository.choice.OtherIdentification4Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.IdentificationIssuerRole;
import com.tools20022.repository.entity.PersonIdentification;
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
 * Information related to the identification of an individual person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4#mmIdentification
 * AlternateIdentification4.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4#mmType
 * AlternateIdentification4.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4#mmIssuer
 * AlternateIdentification4.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4#mmIssueDate
 * AlternateIdentification4.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4#mmExpiryDate
 * AlternateIdentification4.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4#mmIssuerCountry
 * AlternateIdentification4.mmIssuerCountry}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.GenericIdentification
 * GenericIdentification}</li>
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
 * "AlternateIdentification4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the identification of an individual person."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AlternateIdentification4", propOrder = {"identification", "type", "issuer", "issueDate", "expiryDate", "issuerCountry"})
public class AlternateIdentification4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4
	 * AlternateIdentification4}</li>
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
	 * definition} =
	 * "Name or number assigned by an entity to enable recognition of that entity, for example, account identifier."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AlternateIdentification4, Max35Text> mmIdentification = new MMMessageAttribute<AlternateIdentification4, Max35Text>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AlternateIdentification4.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Name or number assigned by an entity to enable recognition of that entity, for example, account identifier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AlternateIdentification4 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(AlternateIdentification4 obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected OtherIdentification4Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.OtherIdentification4Choice
	 * OtherIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification
	 * PersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4
	 * AlternateIdentification4}</li>
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
	 * definition} = "Specifies the nature of the identification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AlternateIdentification4, OtherIdentification4Choice> mmType = new MMMessageAttribute<AlternateIdentification4, OtherIdentification4Choice>() {
		{
			businessComponentTrace_lazy = () -> PersonIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AlternateIdentification4.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the nature of the identification.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OtherIdentification4Choice.mmObject();
		}

		@Override
		public OtherIdentification4Choice getValue(AlternateIdentification4 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(AlternateIdentification4 obj, OtherIdentification4Choice value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Issr")
	protected Max35Text issuer;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole
	 * IdentificationIssuerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4
	 * AlternateIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity that assigns the identifier."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AlternateIdentification4, Optional<Max35Text>> mmIssuer = new MMMessageAttribute<AlternateIdentification4, Optional<Max35Text>>() {
		{
			businessComponentTrace_lazy = () -> IdentificationIssuerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AlternateIdentification4.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Entity that assigns the identifier.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AlternateIdentification4 obj) {
			return obj.getIssuer();
		}

		@Override
		public void setValue(AlternateIdentification4 obj, Optional<Max35Text> value) {
			obj.setIssuer(value.orElse(null));
		}
	};
	@XmlElement(name = "IsseDt")
	protected ISODate issueDate;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIssueDate
	 * GenericIdentification.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4
	 * AlternateIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the identification was issued."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AlternateIdentification4, Optional<ISODate>> mmIssueDate = new MMMessageAttribute<AlternateIdentification4, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AlternateIdentification4.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Date at which the identification was issued.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(AlternateIdentification4 obj) {
			return obj.getIssueDate();
		}

		@Override
		public void setValue(AlternateIdentification4 obj, Optional<ISODate> value) {
			obj.setIssueDate(value.orElse(null));
		}
	};
	@XmlElement(name = "XpryDt")
	protected ISODate expiryDate;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmExpiryDate
	 * GenericIdentification.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4
	 * AlternateIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the identification expires."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AlternateIdentification4, Optional<ISODate>> mmExpiryDate = new MMMessageAttribute<AlternateIdentification4, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmExpiryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AlternateIdentification4.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date at which the identification expires.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(AlternateIdentification4 obj) {
			return obj.getExpiryDate();
		}

		@Override
		public void setValue(AlternateIdentification4 obj, Optional<ISODate> value) {
			obj.setExpiryDate(value.orElse(null));
		}
	};
	@XmlElement(name = "IssrCtry")
	protected CountryCode issuerCountry;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4
	 * AlternateIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country that issued the identification document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AlternateIdentification4, Optional<CountryCode>> mmIssuerCountry = new MMMessageAttribute<AlternateIdentification4, Optional<CountryCode>>() {
		{
			businessComponentTrace_lazy = () -> GenericIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AlternateIdentification4.mmObject();
			isDerived = false;
			xmlTag = "IssrCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerCountry";
			definition = "Country that issued the identification document.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(AlternateIdentification4 obj) {
			return obj.getIssuerCountry();
		}

		@Override
		public void setValue(AlternateIdentification4 obj, Optional<CountryCode> value) {
			obj.setIssuerCountry(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AlternateIdentification4.mmIdentification, com.tools20022.repository.msg.AlternateIdentification4.mmType,
						com.tools20022.repository.msg.AlternateIdentification4.mmIssuer, com.tools20022.repository.msg.AlternateIdentification4.mmIssueDate, com.tools20022.repository.msg.AlternateIdentification4.mmExpiryDate,
						com.tools20022.repository.msg.AlternateIdentification4.mmIssuerCountry);
				trace_lazy = () -> GenericIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AlternateIdentification4";
				definition = "Information related to the identification of an individual person.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public AlternateIdentification4 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public OtherIdentification4Choice getType() {
		return type;
	}

	public AlternateIdentification4 setType(OtherIdentification4Choice type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<Max35Text> getIssuer() {
		return issuer == null ? Optional.empty() : Optional.of(issuer);
	}

	public AlternateIdentification4 setIssuer(Max35Text issuer) {
		this.issuer = issuer;
		return this;
	}

	public Optional<ISODate> getIssueDate() {
		return issueDate == null ? Optional.empty() : Optional.of(issueDate);
	}

	public AlternateIdentification4 setIssueDate(ISODate issueDate) {
		this.issueDate = issueDate;
		return this;
	}

	public Optional<ISODate> getExpiryDate() {
		return expiryDate == null ? Optional.empty() : Optional.of(expiryDate);
	}

	public AlternateIdentification4 setExpiryDate(ISODate expiryDate) {
		this.expiryDate = expiryDate;
		return this;
	}

	public Optional<CountryCode> getIssuerCountry() {
		return issuerCountry == null ? Optional.empty() : Optional.of(issuerCountry);
	}

	public AlternateIdentification4 setIssuerCountry(CountryCode issuerCountry) {
		this.issuerCountry = issuerCountry;
		return this;
	}
}