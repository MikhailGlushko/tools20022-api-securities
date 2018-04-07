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
import com.tools20022.repository.choice.ConfirmationRejectedReason1Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.SecuritiesOrderStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Rejection of a confirmation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus2#mmReason
 * ConfirmationRejectedStatus2.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus2#mmAdditionalInformation
 * ConfirmationRejectedStatus2.mmAdditionalInformation}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReasonElementRule#forConfirmationRejectedStatus2
 * ConstraintReasonElementRule.forConfirmationRejectedStatus2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ConfirmationRejectedStatus2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Rejection of a confirmation."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ConfirmationRejectedReason1Choice
 * ConfirmationRejectedReason1Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ConfirmationRejectedStatus2", propOrder = {"reason", "additionalInformation"})
public class ConfirmationRejectedStatus2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rsn")
	protected ConfirmationRejectedReason1Choice reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ConfirmationRejectedReason1Choice
	 * ConfirmationRejectedReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderStatus#mmConfirmationRejectedStatusReason
	 * SecuritiesOrderStatus.mmConfirmationRejectedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus2
	 * ConfirmationRejectedStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the rejected status."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ConfirmationRejectedReason1Choice#mmCode
	 * ConfirmationRejectedReason1Choice.mmCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ConfirmationRejectedStatus2, Optional<ConfirmationRejectedReason1Choice>> mmReason = new MMMessageAttribute<ConfirmationRejectedStatus2, Optional<ConfirmationRejectedReason1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrderStatus.mmConfirmationRejectedStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationRejectedStatus2.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason for the rejected status.";
			nextVersions_lazy = () -> Arrays.asList(ConfirmationRejectedReason1Choice.mmCode);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ConfirmationRejectedReason1Choice.mmObject();
		}

		@Override
		public Optional<ConfirmationRejectedReason1Choice> getValue(ConfirmationRejectedStatus2 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(ConfirmationRejectedStatus2 obj, Optional<ConfirmationRejectedReason1Choice> value) {
			obj.setReason(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected Max350Text additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConfirmationRejectedStatus2
	 * ConfirmationRejectedStatus2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information about the rejected reason."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ConfirmationRejectedStatus2, Optional<Max350Text>> mmAdditionalInformation = new MMMessageAttribute<ConfirmationRejectedStatus2, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ConfirmationRejectedStatus2.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information about the rejected reason.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(ConfirmationRejectedStatus2 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(ConfirmationRejectedStatus2 obj, Optional<Max350Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ConfirmationRejectedStatus2.mmReason, com.tools20022.repository.msg.ConfirmationRejectedStatus2.mmAdditionalInformation);
				trace_lazy = () -> SecuritiesOrderStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReasonElementRule.forConfirmationRejectedStatus2);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ConfirmationRejectedStatus2";
				definition = "Rejection of a confirmation.";
				nextVersions_lazy = () -> Arrays.asList(ConfirmationRejectedReason1Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ConfirmationRejectedReason1Choice> getReason() {
		return reason == null ? Optional.empty() : Optional.of(reason);
	}

	public ConfirmationRejectedStatus2 setReason(ConfirmationRejectedReason1Choice reason) {
		this.reason = reason;
		return this;
	}

	public Optional<Max350Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public ConfirmationRejectedStatus2 setAdditionalInformation(Max350Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}
}