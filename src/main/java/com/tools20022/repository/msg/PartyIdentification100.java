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
import com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09;
import com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV09;
import com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01;
import com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02;
import com.tools20022.repository.choice.PartyIdentification71Choice;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.entity.PartyIdentificationInformation;
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
 * Identification of the party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyIdentification100#mmIdentification
 * PartyIdentification100.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyIdentification100#mmLEI
 * PartyIdentification100.mmLEI}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
 * PartyIdentificationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01#mmSenderIdentification
 * SecuritiesBalanceTransparencyReportStatusAdviceV01.mmSenderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01#mmReceiverIdentification
 * SecuritiesBalanceTransparencyReportStatusAdviceV01.mmReceiverIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV09#mmAccountServicer
 * SecuritiesBalanceCustodyReportV09.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09#mmAccountServicer
 * SecuritiesBalanceAccountingReportV09.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02#mmSenderIdentification
 * SecuritiesBalanceTransparencyReportV02.mmSenderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02#mmReceiverIdentification
 * SecuritiesBalanceTransparencyReportV02.mmReceiverIdentification}</li>
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
 * "PartyIdentification100"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of the party."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyIdentification100", propOrder = {"identification", "lEI"})
public class PartyIdentification100 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected PartyIdentification71Choice identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification71Choice
	 * PartyIdentification71Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation
	 * PartyIdentificationInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification100
	 * PartyIdentification100}</li>
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
	 * definition} = "Unique identification of the party."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentification100, PartyIdentification71Choice> mmIdentification = new MMMessageAssociationEnd<PartyIdentification100, PartyIdentification71Choice>() {
		{
			businessComponentTrace_lazy = () -> PartyIdentificationInformation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification100.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identification of the party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification71Choice.mmObject();
		}

		@Override
		public PartyIdentification71Choice getValue(PartyIdentification100 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(PartyIdentification100 obj, PartyIdentification71Choice value) {
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification100
	 * PartyIdentification100}</li>
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
	public static final MMMessageAttribute<PartyIdentification100, Optional<LEIIdentifier>> mmLEI = new MMMessageAttribute<PartyIdentification100, Optional<LEIIdentifier>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyIdentification100.mmObject();
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
		public Optional<LEIIdentifier> getValue(PartyIdentification100 obj) {
			return obj.getLEI();
		}

		@Override
		public void setValue(PartyIdentification100 obj, Optional<LEIIdentifier> value) {
			obj.setLEI(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyIdentification100.mmIdentification, com.tools20022.repository.msg.PartyIdentification100.mmLEI);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesBalanceTransparencyReportStatusAdviceV01.mmSenderIdentification, SecuritiesBalanceTransparencyReportStatusAdviceV01.mmReceiverIdentification,
						SecuritiesBalanceCustodyReportV09.mmAccountServicer, SecuritiesBalanceAccountingReportV09.mmAccountServicer, SecuritiesBalanceTransparencyReportV02.mmSenderIdentification,
						SecuritiesBalanceTransparencyReportV02.mmReceiverIdentification);
				trace_lazy = () -> PartyIdentificationInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentification100";
				definition = "Identification of the party.";
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification71Choice getIdentification() {
		return identification;
	}

	public PartyIdentification100 setIdentification(PartyIdentification71Choice identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<LEIIdentifier> getLEI() {
		return lEI == null ? Optional.empty() : Optional.of(lEI);
	}

	public PartyIdentification100 setLEI(LEIIdentifier lEI) {
		this.lEI = lEI;
		return this;
	}
}