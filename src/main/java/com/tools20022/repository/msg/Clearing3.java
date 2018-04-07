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
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationResponseV01;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03;
import com.tools20022.repository.choice.PartyIdentification35Choice;
import com.tools20022.repository.entity.Clearing;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentificationAndAccount78;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the clearing details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Clearing3#mmClearingMember
 * Clearing3.mmClearingMember}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Clearing3#mmClearingSegment
 * Clearing3.mmClearingSegment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Clearing Clearing}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationResponseV01#mmClearingDetails
 * SecuritiesTradeConfirmationResponseV01.mmClearingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationV03#mmClearingDetails
 * SecuritiesTradeConfirmationV03.mmClearingDetails}</li>
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
 * "Clearing3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the clearing details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Clearing3", propOrder = {"clearingMember", "clearingSegment"})
public class Clearing3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ClrMmb", required = true)
	protected List<PartyIdentificationAndAccount78> clearingMember;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount78
	 * PartyIdentificationAndAccount78}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Clearing3
	 * Clearing3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrMmb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the clearing member identification and account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Clearing3, List<PartyIdentificationAndAccount78>> mmClearingMember = new MMMessageAttribute<Clearing3, List<PartyIdentificationAndAccount78>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Clearing3.mmObject();
			isDerived = false;
			xmlTag = "ClrMmb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingMember";
			definition = "Provides details about the clearing member identification and account.";
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentificationAndAccount78.mmObject();
		}

		@Override
		public List<PartyIdentificationAndAccount78> getValue(Clearing3 obj) {
			return obj.getClearingMember();
		}

		@Override
		public void setValue(Clearing3 obj, List<PartyIdentificationAndAccount78> value) {
			obj.setClearingMember(value);
		}
	};
	@XmlElement(name = "ClrSgmt")
	protected PartyIdentification35Choice clearingSegment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification35Choice
	 * PartyIdentification35Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Clearing3
	 * Clearing3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrSgmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSegment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing organisation that will clear the trade.\r\nNote: This field allows Clearing Member Firm to segregate flows coming from clearing counterparty's clearing system. Indeed, Clearing Member Firms receive messages from the same system (same sender) and this field allows them to know if the message is related to equities or derivatives."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Clearing3, Optional<PartyIdentification35Choice>> mmClearingSegment = new MMMessageAttribute<Clearing3, Optional<PartyIdentification35Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Clearing3.mmObject();
			isDerived = false;
			xmlTag = "ClrSgmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSegment";
			definition = "Clearing organisation that will clear the trade.\r\nNote: This field allows Clearing Member Firm to segregate flows coming from clearing counterparty's clearing system. Indeed, Clearing Member Firms receive messages from the same system (same sender) and this field allows them to know if the message is related to equities or derivatives.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification35Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification35Choice> getValue(Clearing3 obj) {
			return obj.getClearingSegment();
		}

		@Override
		public void setValue(Clearing3 obj, Optional<PartyIdentification35Choice> value) {
			obj.setClearingSegment(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Clearing3.mmClearingMember, com.tools20022.repository.msg.Clearing3.mmClearingSegment);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationResponseV01.mmClearingDetails, SecuritiesTradeConfirmationV03.mmClearingDetails);
				trace_lazy = () -> Clearing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Clearing3";
				definition = "Provides the clearing details.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<PartyIdentificationAndAccount78> getClearingMember() {
		return clearingMember == null ? clearingMember = new ArrayList<>() : clearingMember;
	}

	public Clearing3 setClearingMember(List<PartyIdentificationAndAccount78> clearingMember) {
		this.clearingMember = Objects.requireNonNull(clearingMember);
		return this;
	}

	public Optional<PartyIdentification35Choice> getClearingSegment() {
		return clearingSegment == null ? Optional.empty() : Optional.of(clearingSegment);
	}

	public Clearing3 setClearingSegment(PartyIdentification35Choice clearingSegment) {
		this.clearingSegment = clearingSegment;
		return this;
	}
}