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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NameAndLocation1;
import com.tools20022.repository.msg.SectorAndLocation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the identification of the reporting agent counterparty.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification3Choice#mmLEI
 * CounterpartyIdentification3Choice.mmLEI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification3Choice#mmSectorAndLocation
 * CounterpartyIdentification3Choice.mmSectorAndLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification3Choice#mmNameAndLocation
 * CounterpartyIdentification3Choice.mmNameAndLocation}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInterbankReportingRule#forCounterpartyIdentification3Choice
 * ConstraintInterbankReportingRule.forCounterpartyIdentification3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNonInterbankReportingRule#forCounterpartyIdentification3Choice
 * ConstraintNonInterbankReportingRule.forCounterpartyIdentification3Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CounterpartyIdentification3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the identification of the reporting agent counterparty."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CounterpartyIdentification3Choice", propOrder = {"lEI", "sectorAndLocation", "nameAndLocation"})
public class CounterpartyIdentification3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LEI", required = true)
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
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification3Choice
	 * CounterpartyIdentification3Choice}</li>
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
	 * "Legal entity identifier code used to recognise the counterparty of the reporting agent for the reported transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CounterpartyIdentification3Choice, LEIIdentifier> mmLEI = new MMMessageAttribute<CounterpartyIdentification3Choice, LEIIdentifier>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmLEI;
			componentContext_lazy = () -> com.tools20022.repository.choice.CounterpartyIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "LEI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LEI";
			definition = "Legal entity identifier code used to recognise the counterparty of the reporting agent for the reported transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}

		@Override
		public LEIIdentifier getValue(CounterpartyIdentification3Choice obj) {
			return obj.getLEI();
		}

		@Override
		public void setValue(CounterpartyIdentification3Choice obj, LEIIdentifier value) {
			obj.setLEI(value);
		}
	};
	@XmlElement(name = "SctrAndLctn", required = true)
	protected SectorAndLocation1 sectorAndLocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SectorAndLocation1
	 * SectorAndLocation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification3Choice
	 * CounterpartyIdentification3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctrAndLctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SectorAndLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the counterparty through the sector and the location."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CounterpartyIdentification3Choice, SectorAndLocation1> mmSectorAndLocation = new MMMessageAssociationEnd<CounterpartyIdentification3Choice, SectorAndLocation1>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.CounterpartyIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "SctrAndLctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SectorAndLocation";
			definition = "Identification of the counterparty through the sector and the location.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SectorAndLocation1.mmObject();
		}

		@Override
		public SectorAndLocation1 getValue(CounterpartyIdentification3Choice obj) {
			return obj.getSectorAndLocation();
		}

		@Override
		public void setValue(CounterpartyIdentification3Choice obj, SectorAndLocation1 value) {
			obj.setSectorAndLocation(value);
		}
	};
	@XmlElement(name = "NmAndLctn", required = true)
	protected NameAndLocation1 nameAndLocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NameAndLocation1
	 * NameAndLocation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification3Choice
	 * CounterpartyIdentification3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmAndLctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameAndLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the counterparty through the name and the location."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CounterpartyIdentification3Choice, NameAndLocation1> mmNameAndLocation = new MMMessageAssociationEnd<CounterpartyIdentification3Choice, NameAndLocation1>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.CounterpartyIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "NmAndLctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameAndLocation";
			definition = "Identification of the counterparty through the name and the location.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NameAndLocation1.mmObject();
		}

		@Override
		public NameAndLocation1 getValue(CounterpartyIdentification3Choice obj) {
			return obj.getNameAndLocation();
		}

		@Override
		public void setValue(CounterpartyIdentification3Choice obj, NameAndLocation1 value) {
			obj.setNameAndLocation(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CounterpartyIdentification3Choice.mmLEI, com.tools20022.repository.choice.CounterpartyIdentification3Choice.mmSectorAndLocation,
						com.tools20022.repository.choice.CounterpartyIdentification3Choice.mmNameAndLocation);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInterbankReportingRule.forCounterpartyIdentification3Choice,
						com.tools20022.repository.constraints.ConstraintNonInterbankReportingRule.forCounterpartyIdentification3Choice);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CounterpartyIdentification3Choice";
				definition = "Provides the identification of the reporting agent counterparty.";
			}
		});
		return mmObject_lazy.get();
	}

	public LEIIdentifier getLEI() {
		return lEI;
	}

	public CounterpartyIdentification3Choice setLEI(LEIIdentifier lEI) {
		this.lEI = Objects.requireNonNull(lEI);
		return this;
	}

	public SectorAndLocation1 getSectorAndLocation() {
		return sectorAndLocation;
	}

	public CounterpartyIdentification3Choice setSectorAndLocation(SectorAndLocation1 sectorAndLocation) {
		this.sectorAndLocation = Objects.requireNonNull(sectorAndLocation);
		return this;
	}

	public NameAndLocation1 getNameAndLocation() {
		return nameAndLocation;
	}

	public CounterpartyIdentification3Choice setNameAndLocation(NameAndLocation1 nameAndLocation) {
		this.nameAndLocation = Objects.requireNonNull(nameAndLocation);
		return this;
	}
}