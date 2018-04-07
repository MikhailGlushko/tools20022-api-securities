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
import com.tools20022.repository.choice.InstructionProcessingStatus22Choice;
import com.tools20022.repository.choice.MatchingStatus24Choice;
import com.tools20022.repository.choice.SettlementStatus17Choice;
import com.tools20022.repository.entity.SecuritiesTradeStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ProprietaryStatusAndReason6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status18Choice#mmProprietary
 * Status18Choice.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status18Choice#mmMatchingStatus
 * Status18Choice.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status18Choice#mmInferredMatchingStatus
 * Status18Choice.mmInferredMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status18Choice#mmSettlementStatus
 * Status18Choice.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Status18Choice#mmInstructionProcessingStatus
 * Status18Choice.mmInstructionProcessingStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPendingToFailingRule#forStatus18Choice
 * ConstraintPendingToFailingRule.forStatus18Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#forStatus18Choice
 * ConstraintSettlementStatusAndMatchedRule.forStatus18Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Status18Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of status."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Status18Choice", propOrder = {"proprietary", "matchingStatus", "inferredMatchingStatus", "settlementStatus", "instructionProcessingStatus"})
public class Status18Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Prtry", required = true)
	protected ProprietaryStatusAndReason6 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason6
	 * ProprietaryStatusAndReason6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status18Choice
	 * Status18Choice}</li>
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
	 * definition} = "Proprietary status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status18Choice, ProprietaryStatusAndReason6> mmProprietary = new MMMessageAssociationEnd<Status18Choice, ProprietaryStatusAndReason6>() {
		{
			businessComponentTrace_lazy = () -> Status.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.Status18Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason6.mmObject();
		}

		@Override
		public ProprietaryStatusAndReason6 getValue(Status18Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(Status18Choice obj, ProprietaryStatusAndReason6 value) {
			obj.setProprietary(value);
		}
	};
	@XmlElement(name = "MtchgSts", required = true)
	protected MatchingStatus24Choice matchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus24Choice
	 * MatchingStatus24Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
	 * SecuritiesTradeStatus.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status18Choice
	 * Status18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the matching status of the instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status18Choice, MatchingStatus24Choice> mmMatchingStatus = new MMMessageAssociationEnd<Status18Choice, MatchingStatus24Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status18Choice.mmObject();
			isDerived = false;
			xmlTag = "MtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingStatus";
			definition = "Provides the matching status of the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MatchingStatus24Choice.mmObject();
		}

		@Override
		public MatchingStatus24Choice getValue(Status18Choice obj) {
			return obj.getMatchingStatus();
		}

		@Override
		public void setValue(Status18Choice obj, MatchingStatus24Choice value) {
			obj.setMatchingStatus(value);
		}
	};
	@XmlElement(name = "IfrrdMtchgSts", required = true)
	protected MatchingStatus24Choice inferredMatchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus24Choice
	 * MatchingStatus24Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
	 * SecuritiesTradeStatus.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status18Choice
	 * Status18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IfrrdMtchgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InferredMatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the matching status of an instruction as known by the account servicer based on an allegement. At this time no matching took place on the market (at the CSD/ICSD)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status18Choice, MatchingStatus24Choice> mmInferredMatchingStatus = new MMMessageAssociationEnd<Status18Choice, MatchingStatus24Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status18Choice.mmObject();
			isDerived = false;
			xmlTag = "IfrrdMtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatus";
			definition = "Provides the matching status of an instruction as known by the account servicer based on an allegement. At this time no matching took place on the market (at the CSD/ICSD).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MatchingStatus24Choice.mmObject();
		}

		@Override
		public MatchingStatus24Choice getValue(Status18Choice obj) {
			return obj.getInferredMatchingStatus();
		}

		@Override
		public void setValue(Status18Choice obj, MatchingStatus24Choice value) {
			obj.setInferredMatchingStatus(value);
		}
	};
	@XmlElement(name = "SttlmSts", required = true)
	protected SettlementStatus17Choice settlementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus17Choice
	 * SettlementStatus17Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmSettlementStatus
	 * Status.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status18Choice
	 * Status18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of settlement of a transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status18Choice, SettlementStatus17Choice> mmSettlementStatus = new MMMessageAssociationEnd<Status18Choice, SettlementStatus17Choice>() {
		{
			businessElementTrace_lazy = () -> Status.mmSettlementStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status18Choice.mmObject();
			isDerived = false;
			xmlTag = "SttlmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatus";
			definition = "Provides the status of settlement of a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementStatus17Choice.mmObject();
		}

		@Override
		public SettlementStatus17Choice getValue(Status18Choice obj) {
			return obj.getSettlementStatus();
		}

		@Override
		public void setValue(Status18Choice obj, SettlementStatus17Choice value) {
			obj.setSettlementStatus(value);
		}
	};
	@XmlElement(name = "InstrPrcgSts", required = true)
	protected InstructionProcessingStatus22Choice instructionProcessingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InstructionProcessingStatus22Choice
	 * InstructionProcessingStatus22Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmTransactionProcessingStatus
	 * Status.mmTransactionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Status18Choice
	 * Status18Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrPrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of an instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Status18Choice, InstructionProcessingStatus22Choice> mmInstructionProcessingStatus = new MMMessageAssociationEnd<Status18Choice, InstructionProcessingStatus22Choice>() {
		{
			businessElementTrace_lazy = () -> Status.mmTransactionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.Status18Choice.mmObject();
			isDerived = false;
			xmlTag = "InstrPrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionProcessingStatus";
			definition = "Provides the status of an instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InstructionProcessingStatus22Choice.mmObject();
		}

		@Override
		public InstructionProcessingStatus22Choice getValue(Status18Choice obj) {
			return obj.getInstructionProcessingStatus();
		}

		@Override
		public void setValue(Status18Choice obj, InstructionProcessingStatus22Choice value) {
			obj.setInstructionProcessingStatus(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Status18Choice.mmProprietary, com.tools20022.repository.choice.Status18Choice.mmMatchingStatus,
						com.tools20022.repository.choice.Status18Choice.mmInferredMatchingStatus, com.tools20022.repository.choice.Status18Choice.mmSettlementStatus,
						com.tools20022.repository.choice.Status18Choice.mmInstructionProcessingStatus);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPendingToFailingRule.forStatus18Choice, com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.forStatus18Choice);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Status18Choice";
				definition = "Choice of status.";
			}
		});
		return mmObject_lazy.get();
	}

	public ProprietaryStatusAndReason6 getProprietary() {
		return proprietary;
	}

	public Status18Choice setProprietary(ProprietaryStatusAndReason6 proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}

	public MatchingStatus24Choice getMatchingStatus() {
		return matchingStatus;
	}

	public Status18Choice setMatchingStatus(MatchingStatus24Choice matchingStatus) {
		this.matchingStatus = Objects.requireNonNull(matchingStatus);
		return this;
	}

	public MatchingStatus24Choice getInferredMatchingStatus() {
		return inferredMatchingStatus;
	}

	public Status18Choice setInferredMatchingStatus(MatchingStatus24Choice inferredMatchingStatus) {
		this.inferredMatchingStatus = Objects.requireNonNull(inferredMatchingStatus);
		return this;
	}

	public SettlementStatus17Choice getSettlementStatus() {
		return settlementStatus;
	}

	public Status18Choice setSettlementStatus(SettlementStatus17Choice settlementStatus) {
		this.settlementStatus = Objects.requireNonNull(settlementStatus);
		return this;
	}

	public InstructionProcessingStatus22Choice getInstructionProcessingStatus() {
		return instructionProcessingStatus;
	}

	public Status18Choice setInstructionProcessingStatus(InstructionProcessingStatus22Choice instructionProcessingStatus) {
		this.instructionProcessingStatus = Objects.requireNonNull(instructionProcessingStatus);
		return this;
	}
}