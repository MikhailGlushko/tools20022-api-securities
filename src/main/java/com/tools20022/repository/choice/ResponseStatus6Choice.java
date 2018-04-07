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
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionCounterpartyResponseV02;
import com.tools20022.repository.choice.ConsentStatus4Choice;
import com.tools20022.repository.choice.PendingStatus20Choice;
import com.tools20022.repository.choice.RejectionStatus20Choice;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of response status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus6Choice#mmConsented
 * ResponseStatus6Choice.mmConsented}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus6Choice#mmRejected
 * ResponseStatus6Choice.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ResponseStatus6Choice#mmPending
 * ResponseStatus6Choice.mmPending}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionCounterpartyResponseV02#mmResponseStatus
 * SecuritiesSettlementTransactionCounterpartyResponseV02.mmResponseStatus}</li>
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
 * "ResponseStatus6Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of response status."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ResponseStatus6Choice", propOrder = {"consented", "rejected", "pending"})
public class ResponseStatus6Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cnsntd", required = true)
	protected ConsentStatus4Choice consented;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ConsentStatus4Choice
	 * ConsentStatus4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus6Choice
	 * ResponseStatus6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cnsntd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consented"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason provided for the status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ResponseStatus6Choice, ConsentStatus4Choice> mmConsented = new MMMessageAssociationEnd<ResponseStatus6Choice, ConsentStatus4Choice>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.ResponseStatus6Choice.mmObject();
			isDerived = false;
			xmlTag = "Cnsntd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consented";
			definition = "Reason provided for the status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ConsentStatus4Choice.mmObject();
		}

		@Override
		public ConsentStatus4Choice getValue(ResponseStatus6Choice obj) {
			return obj.getConsented();
		}

		@Override
		public void setValue(ResponseStatus6Choice obj, ConsentStatus4Choice value) {
			obj.setConsented(value);
		}
	};
	@XmlElement(name = "Rjctd", required = true)
	protected RejectionStatus20Choice rejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RejectionStatus20Choice
	 * RejectionStatus20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus6Choice
	 * ResponseStatus6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rjctd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rejected status of an instruction, advice or request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ResponseStatus6Choice, RejectionStatus20Choice> mmRejected = new MMMessageAssociationEnd<ResponseStatus6Choice, RejectionStatus20Choice>() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ResponseStatus6Choice.mmObject();
			isDerived = false;
			xmlTag = "Rjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Rejected status of an instruction, advice or request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectionStatus20Choice.mmObject();
		}

		@Override
		public RejectionStatus20Choice getValue(ResponseStatus6Choice obj) {
			return obj.getRejected();
		}

		@Override
		public void setValue(ResponseStatus6Choice obj, RejectionStatus20Choice value) {
			obj.setRejected(value);
		}
	};
	@XmlElement(name = "Pdg", required = true)
	protected PendingStatus20Choice pending;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingStatus20Choice
	 * PendingStatus20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ResponseStatus6Choice
	 * ResponseStatus6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pdg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pending status of an instruction, advice or request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ResponseStatus6Choice, PendingStatus20Choice> mmPending = new MMMessageAssociationEnd<ResponseStatus6Choice, PendingStatus20Choice>() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ResponseStatus6Choice.mmObject();
			isDerived = false;
			xmlTag = "Pdg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Pending status of an instruction, advice or request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PendingStatus20Choice.mmObject();
		}

		@Override
		public PendingStatus20Choice getValue(ResponseStatus6Choice obj) {
			return obj.getPending();
		}

		@Override
		public void setValue(ResponseStatus6Choice obj, PendingStatus20Choice value) {
			obj.setPending(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ResponseStatus6Choice.mmConsented, com.tools20022.repository.choice.ResponseStatus6Choice.mmRejected,
						com.tools20022.repository.choice.ResponseStatus6Choice.mmPending);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionCounterpartyResponseV02.mmResponseStatus);
				trace_lazy = () -> Status.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResponseStatus6Choice";
				definition = "Choice of response status.";
			}
		});
		return mmObject_lazy.get();
	}

	public ConsentStatus4Choice getConsented() {
		return consented;
	}

	public ResponseStatus6Choice setConsented(ConsentStatus4Choice consented) {
		this.consented = Objects.requireNonNull(consented);
		return this;
	}

	public RejectionStatus20Choice getRejected() {
		return rejected;
	}

	public ResponseStatus6Choice setRejected(RejectionStatus20Choice rejected) {
		this.rejected = Objects.requireNonNull(rejected);
		return this;
	}

	public PendingStatus20Choice getPending() {
		return pending;
	}

	public ResponseStatus6Choice setPending(PendingStatus20Choice pending) {
		this.pending = Objects.requireNonNull(pending);
		return this;
	}
}