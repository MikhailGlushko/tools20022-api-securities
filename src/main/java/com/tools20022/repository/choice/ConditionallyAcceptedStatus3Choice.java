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
import com.tools20022.repository.codeset.NoReasonCode;
import com.tools20022.repository.entity.SecuritiesOrderStatus;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ConditionallyAcceptedStatusReason3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reason for a conditionally accepted status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice#mmNoSpecifiedReason
 * ConditionallyAcceptedStatus3Choice.mmNoSpecifiedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice#mmReasonDetails
 * ConditionallyAcceptedStatus3Choice.mmReasonDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus
 * SecuritiesOrderStatus}</li>
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
 * "ConditionallyAcceptedStatus3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reason for a conditionally accepted status."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ConditionallyAcceptedStatus3Choice", propOrder = {"noSpecifiedReason", "reasonDetails"})
public class ConditionallyAcceptedStatus3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NoSpcfdRsn", required = true)
	protected NoReasonCode noSpecifiedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.NoReasonCode
	 * NoReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmNoSpecifiedReason
	 * StatusReason.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice
	 * ConditionallyAcceptedStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NoSpcfdRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoSpecifiedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "No reason available or to report for the conditionally accepted status."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReason4Choice#mmNoSpecifiedReason
	 * SuspendedStatusReason4Choice.mmNoSpecifiedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InRepairStatusReason4Choice#mmNoSpecifiedReason
	 * InRepairStatusReason4Choice.mmNoSpecifiedReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ConditionallyAcceptedStatus3Choice, NoReasonCode> mmNoSpecifiedReason = new MMMessageAttribute<ConditionallyAcceptedStatus3Choice, NoReasonCode>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmNoSpecifiedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "NoSpcfdRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoSpecifiedReason";
			definition = "No reason available or to report for the conditionally accepted status.";
			nextVersions_lazy = () -> Arrays.asList(SuspendedStatusReason4Choice.mmNoSpecifiedReason, InRepairStatusReason4Choice.mmNoSpecifiedReason);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}

		@Override
		public NoReasonCode getValue(ConditionallyAcceptedStatus3Choice obj) {
			return obj.getNoSpecifiedReason();
		}

		@Override
		public void setValue(ConditionallyAcceptedStatus3Choice obj, NoReasonCode value) {
			obj.setNoSpecifiedReason(value);
		}
	};
	@XmlElement(name = "RsnDtls", required = true)
	protected List<ConditionallyAcceptedStatusReason3> reasonDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ConditionallyAcceptedStatusReason3
	 * ConditionallyAcceptedStatusReason3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConditionallyAcceptedStatus
	 * SecuritiesOrderStatus.mmConditionallyAcceptedStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice
	 * ConditionallyAcceptedStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReasonDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for the conditionally accepted status, expressed as a code."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SuspendedStatusReason4Choice#mmReasonDetails
	 * SuspendedStatusReason4Choice.mmReasonDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InRepairStatusReason4Choice#mmReasonDetails
	 * InRepairStatusReason4Choice.mmReasonDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ConditionallyAcceptedStatus3Choice, List<ConditionallyAcceptedStatusReason3>> mmReasonDetails = new MMMessageAssociationEnd<ConditionallyAcceptedStatus3Choice, List<ConditionallyAcceptedStatusReason3>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmConditionallyAcceptedStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "RsnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReasonDetails";
			definition = "Reason for the conditionally accepted status, expressed as a code.";
			nextVersions_lazy = () -> Arrays.asList(SuspendedStatusReason4Choice.mmReasonDetails, InRepairStatusReason4Choice.mmReasonDetails);
			maxOccurs = 5;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ConditionallyAcceptedStatusReason3.mmObject();
		}

		@Override
		public List<ConditionallyAcceptedStatusReason3> getValue(ConditionallyAcceptedStatus3Choice obj) {
			return obj.getReasonDetails();
		}

		@Override
		public void setValue(ConditionallyAcceptedStatus3Choice obj, List<ConditionallyAcceptedStatusReason3> value) {
			obj.setReasonDetails(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice.mmNoSpecifiedReason, com.tools20022.repository.choice.ConditionallyAcceptedStatus3Choice.mmReasonDetails);
				trace_lazy = () -> SecuritiesOrderStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ConditionallyAcceptedStatus3Choice";
				definition = "Reason for a conditionally accepted status.";
			}
		});
		return mmObject_lazy.get();
	}

	public NoReasonCode getNoSpecifiedReason() {
		return noSpecifiedReason;
	}

	public ConditionallyAcceptedStatus3Choice setNoSpecifiedReason(NoReasonCode noSpecifiedReason) {
		this.noSpecifiedReason = Objects.requireNonNull(noSpecifiedReason);
		return this;
	}

	public List<ConditionallyAcceptedStatusReason3> getReasonDetails() {
		return reasonDetails == null ? reasonDetails = new ArrayList<>() : reasonDetails;
	}

	public ConditionallyAcceptedStatus3Choice setReasonDetails(List<ConditionallyAcceptedStatusReason3> reasonDetails) {
		this.reasonDetails = Objects.requireNonNull(reasonDetails);
		return this;
	}
}