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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CollateralAccountType1Code;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification36;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the identification of the collateral account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType2Choice#mmType
 * CollateralAccountIdentificationType2Choice.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType2Choice#mmProprietary
 * CollateralAccountIdentificationType2Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = November 11, 2017</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralAccountIdentificationType2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the identification of the collateral account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType3Choice
 * CollateralAccountIdentificationType3Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralAccountIdentificationType2Choice", propOrder = {"type", "proprietary"})
public class CollateralAccountIdentificationType2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp")
	protected CollateralAccountType1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralAccountType1Code
	 * CollateralAccountType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmCollateralAccountType
	 * Account.mmCollateralAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType2Choice
	 * CollateralAccountIdentificationType2Choice}</li>
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
	 * definition} =
	 * "Indicates the type of collateral account expressed as a code."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType3Choice#mmType
	 * CollateralAccountIdentificationType3Choice.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralAccountIdentificationType2Choice, Optional<CollateralAccountType1Code>> mmType = new MMMessageAttribute<CollateralAccountIdentificationType2Choice, Optional<CollateralAccountType1Code>>() {
		{
			businessElementTrace_lazy = () -> Account.mmCollateralAccountType;
			componentContext_lazy = () -> com.tools20022.repository.choice.CollateralAccountIdentificationType2Choice.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates the type of collateral account expressed as a code.";
			nextVersions_lazy = () -> Arrays.asList(CollateralAccountIdentificationType3Choice.mmType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CollateralAccountType1Code.mmObject();
		}

		@Override
		public Optional<CollateralAccountType1Code> getValue(CollateralAccountIdentificationType2Choice obj) {
			return obj.getType();
		}

		@Override
		public void setValue(CollateralAccountIdentificationType2Choice obj, Optional<CollateralAccountType1Code> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected GenericIdentification36 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification36
	 * GenericIdentification36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmCollateralAccountType
	 * Account.mmCollateralAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType2Choice
	 * CollateralAccountIdentificationType2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the collateral account expressed as a proprietary code."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CollateralAccountIdentificationType3Choice#mmProprietary
	 * CollateralAccountIdentificationType3Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralAccountIdentificationType2Choice, GenericIdentification36> mmProprietary = new MMMessageAttribute<CollateralAccountIdentificationType2Choice, GenericIdentification36>() {
		{
			businessElementTrace_lazy = () -> Account.mmCollateralAccountType;
			componentContext_lazy = () -> com.tools20022.repository.choice.CollateralAccountIdentificationType2Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Specifies the collateral account expressed as a proprietary code.";
			nextVersions_lazy = () -> Arrays.asList(CollateralAccountIdentificationType3Choice.mmProprietary);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification36.mmObject();
		}

		@Override
		public GenericIdentification36 getValue(CollateralAccountIdentificationType2Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(CollateralAccountIdentificationType2Choice obj, GenericIdentification36 value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CollateralAccountIdentificationType2Choice.mmType, com.tools20022.repository.choice.CollateralAccountIdentificationType2Choice.mmProprietary);
				trace_lazy = () -> Account.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("November 11, 2017");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CollateralAccountIdentificationType2Choice";
				definition = "Specifies the identification of the collateral account.";
				nextVersions_lazy = () -> Arrays.asList(CollateralAccountIdentificationType3Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CollateralAccountType1Code> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public CollateralAccountIdentificationType2Choice setType(CollateralAccountType1Code type) {
		this.type = type;
		return this;
	}

	public GenericIdentification36 getProprietary() {
		return proprietary;
	}

	public CollateralAccountIdentificationType2Choice setProprietary(GenericIdentification36 proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}