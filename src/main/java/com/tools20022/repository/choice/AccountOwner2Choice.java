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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.IndividualPersonIdentification3Choice;
import com.tools20022.repository.entity.AccountOwnerRole;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.Person;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification96;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between an organisation and an individual person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountOwner2Choice#mmIndividualOwnerIdentification
 * AccountOwner2Choice.mmIndividualOwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountOwner2Choice#mmOrganisationOwnerIdentification
 * AccountOwner2Choice.mmOrganisationOwnerIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AccountOwnerRole
 * AccountOwnerRole}</li>
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
 * "AccountOwner2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between an organisation and an individual person."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountOwner2Choice", propOrder = {"individualOwnerIdentification", "organisationOwnerIdentification"})
public class AccountOwner2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IndvOwnrId", required = true)
	protected IndividualPersonIdentification3Choice individualOwnerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification3Choice
	 * IndividualPersonIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmPersonIdentification
	 * Person.mmPersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountOwner2Choice
	 * AccountOwner2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvOwnrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualOwnerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the individual person that legally owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountOwner2Choice, IndividualPersonIdentification3Choice> mmIndividualOwnerIdentification = new MMMessageAssociationEnd<AccountOwner2Choice, IndividualPersonIdentification3Choice>() {
		{
			businessElementTrace_lazy = () -> Person.mmPersonIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountOwner2Choice.mmObject();
			isDerived = false;
			xmlTag = "IndvOwnrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualOwnerIdentification";
			definition = "Identification of the individual person that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IndividualPersonIdentification3Choice.mmObject();
		}

		@Override
		public IndividualPersonIdentification3Choice getValue(AccountOwner2Choice obj) {
			return obj.getIndividualOwnerIdentification();
		}

		@Override
		public void setValue(AccountOwner2Choice obj, IndividualPersonIdentification3Choice value) {
			obj.setIndividualOwnerIdentification(value);
		}
	};
	@XmlElement(name = "OrgOwnrId", required = true)
	protected PartyIdentification96 organisationOwnerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification96
	 * PartyIdentification96}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountOwner2Choice
	 * AccountOwner2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgOwnrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationOwnerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the organisation that legally owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountOwner2Choice, PartyIdentification96> mmOrganisationOwnerIdentification = new MMMessageAssociationEnd<AccountOwner2Choice, PartyIdentification96>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.AccountOwner2Choice.mmObject();
			isDerived = false;
			xmlTag = "OrgOwnrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisationOwnerIdentification";
			definition = "Identification of the organisation that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification96.mmObject();
		}

		@Override
		public PartyIdentification96 getValue(AccountOwner2Choice obj) {
			return obj.getOrganisationOwnerIdentification();
		}

		@Override
		public void setValue(AccountOwner2Choice obj, PartyIdentification96 value) {
			obj.setOrganisationOwnerIdentification(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountOwner2Choice.mmIndividualOwnerIdentification, com.tools20022.repository.choice.AccountOwner2Choice.mmOrganisationOwnerIdentification);
				trace_lazy = () -> AccountOwnerRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountOwner2Choice";
				definition = "Choice between an organisation and an individual person.";
			}
		});
		return mmObject_lazy.get();
	}

	public IndividualPersonIdentification3Choice getIndividualOwnerIdentification() {
		return individualOwnerIdentification;
	}

	public AccountOwner2Choice setIndividualOwnerIdentification(IndividualPersonIdentification3Choice individualOwnerIdentification) {
		this.individualOwnerIdentification = Objects.requireNonNull(individualOwnerIdentification);
		return this;
	}

	public PartyIdentification96 getOrganisationOwnerIdentification() {
		return organisationOwnerIdentification;
	}

	public AccountOwner2Choice setOrganisationOwnerIdentification(PartyIdentification96 organisationOwnerIdentification) {
		this.organisationOwnerIdentification = Objects.requireNonNull(organisationOwnerIdentification);
		return this;
	}
}