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
import com.tools20022.repository.choice.InstructionStatus6Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.AccountIdentification;
import com.tools20022.repository.entity.MeetingStatus;
import com.tools20022.repository.entity.Status;
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
 * Status applying to individual instructions of a MeetingInstruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11#mmInstructionIdentification
 * DetailedInstructionStatus11.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11#mmAccountIdentification
 * DetailedInstructionStatus11.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11#mmSubAccountIdentification
 * DetailedInstructionStatus11.mmSubAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11#mmInstructionStatus
 * DetailedInstructionStatus11.mmInstructionStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MeetingStatus
 * MeetingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSubAccount1Rule#forDetailedInstructionStatus11
 * ConstraintSubAccount1Rule.forDetailedInstructionStatus11}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DetailedInstructionStatus11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status applying to individual instructions of a MeetingInstruction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DetailedInstructionStatus11", propOrder = {"instructionIdentification", "accountIdentification", "subAccountIdentification", "instructionStatus"})
public class DetailedInstructionStatus11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InstrId", required = true)
	protected Max35Text instructionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11
	 * DetailedInstructionStatus11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the detailed instruction within an instruction message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DetailedInstructionStatus11, Max35Text> mmInstructionIdentification = new MMMessageAttribute<DetailedInstructionStatus11, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedInstructionStatus11.mmObject();
			isDerived = false;
			xmlTag = "InstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIdentification";
			definition = "Identifies the detailed instruction within an instruction message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(DetailedInstructionStatus11 obj) {
			return obj.getInstructionIdentification();
		}

		@Override
		public void setValue(DetailedInstructionStatus11 obj, Max35Text value) {
			obj.setInstructionIdentification(value);
		}
	};
	@XmlElement(name = "AcctId")
	protected Max35Text accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmNumber
	 * AccountIdentification.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11
	 * DetailedInstructionStatus11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the safekeeping account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DetailedInstructionStatus11, Optional<Max35Text>> mmAccountIdentification = new MMMessageAttribute<DetailedInstructionStatus11, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedInstructionStatus11.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Identifies the safekeeping account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(DetailedInstructionStatus11 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(DetailedInstructionStatus11 obj, Optional<Max35Text> value) {
			obj.setAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "SubAcctId")
	protected Max35Text subAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmNumber
	 * AccountIdentification.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11
	 * DetailedInstructionStatus11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the subaccount of the safekeeping account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DetailedInstructionStatus11, Optional<Max35Text>> mmSubAccountIdentification = new MMMessageAttribute<DetailedInstructionStatus11, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedInstructionStatus11.mmObject();
			isDerived = false;
			xmlTag = "SubAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountIdentification";
			definition = "Identifies the subaccount of the safekeeping account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(DetailedInstructionStatus11 obj) {
			return obj.getSubAccountIdentification();
		}

		@Override
		public void setValue(DetailedInstructionStatus11 obj, Optional<Max35Text> value) {
			obj.setSubAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrSts", required = true)
	protected InstructionStatus6Choice instructionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus6Choice
	 * InstructionStatus6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmInstructionProcessingStatus
	 * Status.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11
	 * DetailedInstructionStatus11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status applying to individual instructions of a MeetingInstruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DetailedInstructionStatus11, InstructionStatus6Choice> mmInstructionStatus = new MMMessageAssociationEnd<DetailedInstructionStatus11, InstructionStatus6Choice>() {
		{
			businessElementTrace_lazy = () -> Status.mmInstructionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedInstructionStatus11.mmObject();
			isDerived = false;
			xmlTag = "InstrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionStatus";
			definition = "Status applying to individual instructions of a MeetingInstruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InstructionStatus6Choice.mmObject();
		}

		@Override
		public InstructionStatus6Choice getValue(DetailedInstructionStatus11 obj) {
			return obj.getInstructionStatus();
		}

		@Override
		public void setValue(DetailedInstructionStatus11 obj, InstructionStatus6Choice value) {
			obj.setInstructionStatus(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DetailedInstructionStatus11.mmInstructionIdentification, com.tools20022.repository.msg.DetailedInstructionStatus11.mmAccountIdentification,
						com.tools20022.repository.msg.DetailedInstructionStatus11.mmSubAccountIdentification, com.tools20022.repository.msg.DetailedInstructionStatus11.mmInstructionStatus);
				trace_lazy = () -> MeetingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSubAccount1Rule.forDetailedInstructionStatus11);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DetailedInstructionStatus11";
				definition = "Status applying to individual instructions of a MeetingInstruction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getInstructionIdentification() {
		return instructionIdentification;
	}

	public DetailedInstructionStatus11 setInstructionIdentification(Max35Text instructionIdentification) {
		this.instructionIdentification = Objects.requireNonNull(instructionIdentification);
		return this;
	}

	public Optional<Max35Text> getAccountIdentification() {
		return accountIdentification == null ? Optional.empty() : Optional.of(accountIdentification);
	}

	public DetailedInstructionStatus11 setAccountIdentification(Max35Text accountIdentification) {
		this.accountIdentification = accountIdentification;
		return this;
	}

	public Optional<Max35Text> getSubAccountIdentification() {
		return subAccountIdentification == null ? Optional.empty() : Optional.of(subAccountIdentification);
	}

	public DetailedInstructionStatus11 setSubAccountIdentification(Max35Text subAccountIdentification) {
		this.subAccountIdentification = subAccountIdentification;
		return this;
	}

	public InstructionStatus6Choice getInstructionStatus() {
		return instructionStatus;
	}

	public DetailedInstructionStatus11 setInstructionStatus(InstructionStatus6Choice instructionStatus) {
		this.instructionStatus = Objects.requireNonNull(instructionStatus);
		return this;
	}
}