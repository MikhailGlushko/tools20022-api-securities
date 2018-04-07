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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Name of the security.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="LocalName" src="doc-files/LocalName.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.LocalName#mmFullName
 * LocalName.mmFullName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LocalName#mmRelatedSecurity
 * LocalName.mmRelatedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LocalName#mmShortName
 * LocalName.mmShortName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LocalName#mmLanguage
 * LocalName.mmLanguage}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmName
 * SecuritiesIdentification.mmName}</li>
 * </ul>
 * </li>
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
 * "LocalName"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Name of the security."</li>
 * </ul>
 */
public class LocalName {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text fullName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification1#mmName
	 * SecurityIdentification1.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument17#mmName
	 * FinancialInstrument17.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument8#mmName
	 * FinancialInstrument8.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument13#mmName
	 * FinancialInstrument13.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument9#mmName
	 * FinancialInstrument9.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund2#mmName Fund2.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund1#mmName Fund1.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund3#mmName Fund3.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund4#mmName Fund4.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#mmFullName
	 * SecurityInstrumentDescription9.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11#mmFullName
	 * SecurityInstrumentDescription11.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmName
	 * FinancialInstrument57.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmName
	 * FinancialInstrument56.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#mmFinancialInstrumentName
	 * HoldBackInformation2.mmFinancialInstrumentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument55#mmName
	 * FinancialInstrument55.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmFullName
	 * TransparencyDataReport11.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12#mmFullName
	 * TransparencyDataReport12.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmFullName
	 * TransparencyDataReport10.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14#mmFullName
	 * TransparencyDataReport14.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3#mmFinancialInstrumentName
	 * HoldBackInformation3.mmFinancialInstrumentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60#mmName
	 * FinancialInstrument60.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument64#mmName
	 * FinancialInstrument64.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument63#mmName
	 * FinancialInstrument63.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument61#mmName
	 * FinancialInstrument61.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument65#mmName
	 * FinancialInstrument65.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LocalName
	 * LocalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<LocalName, Max350Text> mmFullName = new MMBusinessAttribute<LocalName, Max350Text>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityIdentification1.mmName, FinancialInstrument17.mmName, FinancialInstrument8.mmName, FinancialInstrument13.mmName, FinancialInstrument9.mmName, Fund2.mmName, Fund1.mmName,
					Fund3.mmName, Fund4.mmName, SecurityInstrumentDescription9.mmFullName, SecurityInstrumentDescription11.mmFullName, FinancialInstrument57.mmName, FinancialInstrument56.mmName,
					HoldBackInformation2.mmFinancialInstrumentName, FinancialInstrument55.mmName, TransparencyDataReport11.mmFullName, TransparencyDataReport12.mmFullName, TransparencyDataReport10.mmFullName,
					TransparencyDataReport14.mmFullName, HoldBackInformation3.mmFinancialInstrumentName, FinancialInstrument60.mmName, FinancialInstrument64.mmName, FinancialInstrument63.mmName, FinancialInstrument61.mmName,
					FinancialInstrument65.mmName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LocalName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FullName";
			definition = "Name of the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(LocalName obj) {
			return obj.getFullName();
		}

		@Override
		public void setValue(LocalName obj, Max350Text value) {
			obj.setFullName(value);
		}
	};
	protected SecuritiesIdentification relatedSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmName
	 * SecuritiesIdentification.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LocalName
	 * LocalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification which contains a name."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<LocalName, Optional<SecuritiesIdentification>> mmRelatedSecurity = new MMBusinessAssociationEnd<LocalName, Optional<SecuritiesIdentification>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LocalName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecurity";
			definition = "Identification which contains a name.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesIdentification.mmName;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesIdentification.mmObject();
		}

		@Override
		public Optional<SecuritiesIdentification> getValue(LocalName obj) {
			return obj.getRelatedSecurity();
		}

		@Override
		public void setValue(LocalName obj, Optional<SecuritiesIdentification> value) {
			obj.setRelatedSecurity(value.orElse(null));
		}
	};
	protected Max35Text shortName;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#mmShortName
	 * SecurityInstrumentDescription9.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmShortName
	 * FinancialInstrument57.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmShortName
	 * FinancialInstrument56.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument55#mmShortName
	 * FinancialInstrument55.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument60#mmShortName
	 * FinancialInstrument60.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument64#mmShortName
	 * FinancialInstrument64.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument63#mmShortName
	 * FinancialInstrument63.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument61#mmShortName
	 * FinancialInstrument61.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument65#mmShortName
	 * FinancialInstrument65.mmShortName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LocalName
	 * LocalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Short name of the security"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<LocalName, Max35Text> mmShortName = new MMBusinessAttribute<LocalName, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityInstrumentDescription9.mmShortName, FinancialInstrument57.mmShortName, FinancialInstrument56.mmShortName, FinancialInstrument55.mmShortName, FinancialInstrument60.mmShortName,
					FinancialInstrument64.mmShortName, FinancialInstrument63.mmShortName, FinancialInstrument61.mmShortName, FinancialInstrument65.mmShortName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LocalName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ShortName";
			definition = "Short name of the security";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(LocalName obj) {
			return obj.getShortName();
		}

		@Override
		public void setValue(LocalName obj, Max35Text value) {
			obj.setShortName(value);
		}
	};
	protected LanguageCode language;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LocalName
	 * LocalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Language"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language in which the security name is expressed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<LocalName, LanguageCode> mmLanguage = new MMBusinessAttribute<LocalName, LanguageCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LocalName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language in which the security name is expressed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		@Override
		public LanguageCode getValue(LocalName obj) {
			return obj.getLanguage();
		}

		@Override
		public void setValue(LocalName obj, LanguageCode value) {
			obj.setLanguage(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LocalName";
				definition = "Name of the security.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesIdentification.mmName);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.LocalName.mmFullName, com.tools20022.repository.entity.LocalName.mmRelatedSecurity, com.tools20022.repository.entity.LocalName.mmShortName,
						com.tools20022.repository.entity.LocalName.mmLanguage);
			}

			@Override
			public Class<?> getInstanceClass() {
				return LocalName.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getFullName() {
		return fullName;
	}

	public LocalName setFullName(Max350Text fullName) {
		this.fullName = Objects.requireNonNull(fullName);
		return this;
	}

	public Optional<SecuritiesIdentification> getRelatedSecurity() {
		return relatedSecurity == null ? Optional.empty() : Optional.of(relatedSecurity);
	}

	public LocalName setRelatedSecurity(SecuritiesIdentification relatedSecurity) {
		this.relatedSecurity = relatedSecurity;
		return this;
	}

	public Max35Text getShortName() {
		return shortName;
	}

	public LocalName setShortName(Max35Text shortName) {
		this.shortName = Objects.requireNonNull(shortName);
		return this;
	}

	public LanguageCode getLanguage() {
		return language;
	}

	public LocalName setLanguage(LanguageCode language) {
		this.language = Objects.requireNonNull(language);
		return this;
	}
}