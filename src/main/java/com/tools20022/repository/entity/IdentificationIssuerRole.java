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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.IdentificationSource1Choice;
import com.tools20022.repository.choice.IdentificationSource3Choice;
import com.tools20022.repository.choice.IdentificationSource5Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InformationPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Entity that assigns the identification.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="IdentificationIssuerRole"
 * src="doc-files/IdentificationIssuerRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
 * InformationPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole#mmCountry
 * IdentificationIssuerRole.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole#mmEntityName
 * IdentificationIssuerRole.mmEntityName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole#mmOwnerCode
 * IdentificationIssuerRole.mmOwnerCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification1#mmIssuer
 * GenericIdentification1.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification7#mmIssuer
 * GenericIdentification7.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification13#mmIssuer
 * GenericIdentification13.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification20#mmIssuer
 * GenericIdentification20.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification47#mmIssuer
 * GenericIdentification47.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericFinancialIdentification1#mmIssuer
 * GenericFinancialIdentification1.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericAccountIdentification1#mmIssuer
 * GenericAccountIdentification1.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification1#mmIssuer
 * GenericOrganisationIdentification1.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericPersonIdentification1#mmIssuer
 * GenericPersonIdentification1.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification19#mmIssuer
 * GenericIdentification19.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification37#mmIssuer
 * GenericIdentification37.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification27#mmIssuer
 * GenericIdentification27.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification6#mmIssuer
 * GenericIdentification6.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification5#mmIssuer
 * GenericIdentification5.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification38#mmIssuer
 * GenericIdentification38.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification29#mmIssuer
 * GenericIdentification29.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification36#mmIssuer
 * GenericIdentification36.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification16#mmIssuer
 * GenericIdentification16.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification30#mmIssuer
 * GenericIdentification30.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification40#mmIssuer
 * GenericIdentification40.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification56#mmIssuer
 * GenericIdentification56.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4#mmIssuer
 * AlternateIdentification4.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification82#mmIssuer
 * GenericIdentification82.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification164#mmIssuer
 * GenericIdentification164.mmIssuer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationSource1Choice
 * IdentificationSource1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationSource3Choice
 * IdentificationSource3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationSource5Choice
 * IdentificationSource5Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IdentificationIssuerRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity that assigns the identification."</li>
 * </ul>
 */
public class IdentificationIssuerRole extends InformationPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CountryCode country;
	/**
	 * Country of the proprietary identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification3#mmDomesticIdentificationSource
	 * AlternateSecurityIdentification3.mmDomesticIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1#mmDomesticIdentificationSource
	 * AlternateSecurityIdentification1.mmDomesticIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource1Choice#mmDomestic
	 * IdentificationSource1Choice.mmDomestic}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole
	 * IdentificationIssuerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the proprietary identification scheme."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCountry = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AlternateSecurityIdentification3.mmDomesticIdentificationSource, AlternateSecurityIdentification1.mmDomesticIdentificationSource, IdentificationSource1Choice.mmDomestic);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IdentificationIssuerRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country of the proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return IdentificationIssuerRole.class.getMethod("getCountry", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text entityName;
	/**
	 * Entity that issues the proprietary identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification3#mmProprietaryIdentificationSource
	 * AlternateSecurityIdentification3.mmProprietaryIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1#mmProprietaryIdentificationSource
	 * AlternateSecurityIdentification1.mmProprietaryIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate3#mmIssuer
	 * SecuritiesCertificate3.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate4#mmIssuer
	 * SecuritiesCertificate4.mmIssuer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole
	 * IdentificationIssuerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntityName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity that issues the proprietary identification."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEntityName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AlternateSecurityIdentification3.mmProprietaryIdentificationSource, AlternateSecurityIdentification1.mmProprietaryIdentificationSource, SecuritiesCertificate3.mmIssuer,
					SecuritiesCertificate4.mmIssuer);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IdentificationIssuerRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EntityName";
			definition = "Entity that issues the proprietary identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return IdentificationIssuerRole.class.getMethod("getEntityName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text ownerCode;
	/**
	 * Code representing the organisation that owns and is responsible of an
	 * enumerated code list, for example ISO.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole
	 * IdentificationIssuerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnerCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code representing the organisation that owns and is responsible of an enumerated code list, for example ISO."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOwnerCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IdentificationIssuerRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OwnerCode";
			definition = "Code representing the organisation that owns and is responsible of an enumerated code list, for example ISO.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return IdentificationIssuerRole.class.getMethod("getOwnerCode", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IdentificationIssuerRole";
				definition = "Entity that assigns the identification.";
				derivationElement_lazy = () -> Arrays.asList(GenericIdentification1.mmIssuer, GenericIdentification7.mmIssuer, GenericIdentification13.mmIssuer, GenericIdentification20.mmIssuer, GenericIdentification47.mmIssuer,
						GenericFinancialIdentification1.mmIssuer, GenericAccountIdentification1.mmIssuer, GenericOrganisationIdentification1.mmIssuer, GenericPersonIdentification1.mmIssuer, GenericIdentification19.mmIssuer,
						GenericIdentification37.mmIssuer, GenericIdentification27.mmIssuer, GenericIdentification6.mmIssuer, GenericIdentification5.mmIssuer, GenericIdentification38.mmIssuer, GenericIdentification29.mmIssuer,
						GenericIdentification36.mmIssuer, GenericIdentification16.mmIssuer, GenericIdentification30.mmIssuer, GenericIdentification40.mmIssuer, GenericIdentification56.mmIssuer, AlternateIdentification4.mmIssuer,
						GenericIdentification82.mmIssuer, GenericIdentification164.mmIssuer);
				superType_lazy = () -> InformationPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.IdentificationIssuerRole.mmCountry, com.tools20022.repository.entity.IdentificationIssuerRole.mmEntityName,
						com.tools20022.repository.entity.IdentificationIssuerRole.mmOwnerCode);
				derivationComponent_lazy = () -> Arrays.asList(IdentificationSource1Choice.mmObject(), IdentificationSource3Choice.mmObject(), IdentificationSource5Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return IdentificationIssuerRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CountryCode getCountry() {
		return country;
	}

	public void setCountry(CountryCode country) {
		this.country = country;
	}

	public Max35Text getEntityName() {
		return entityName;
	}

	public void setEntityName(Max35Text entityName) {
		this.entityName = entityName;
	}

	public Max35Text getOwnerCode() {
		return ownerCode;
	}

	public void setOwnerCode(Max35Text ownerCode) {
		this.ownerCode = ownerCode;
	}
}