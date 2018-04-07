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
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV08;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV09;
import com.tools20022.repository.choice.ProcessingPosition9Choice;
import com.tools20022.repository.datatype.Max35Text;
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
 * Information related to a linked transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Linkages41#mmProcessingPosition
 * Linkages41.mmProcessingPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Linkages41#mmSecuritiesSettlementTransactionIdentification
 * Linkages41.mmSecuritiesSettlementTransactionIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV08#mmLinkages
 * SecuritiesSettlementTransactionConfirmationV08.mmLinkages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV09#mmLinkages
 * SecuritiesSettlementTransactionStatusAdviceV09.mmLinkages}</li>
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
 * "Linkages41"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to a linked transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Linkages41", propOrder = {"processingPosition", "securitiesSettlementTransactionIdentification"})
public class Linkages41 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrcgPos")
	protected ProcessingPosition9Choice processingPosition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition9Choice
	 * ProcessingPosition9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Linkages41
	 * Linkages41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgPos"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When the transaction is to be executed relative to a linked transaction - for information only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Linkages41, Optional<ProcessingPosition9Choice>> mmProcessingPosition = new MMMessageAssociationEnd<Linkages41, Optional<ProcessingPosition9Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Linkages41.mmObject();
			isDerived = false;
			xmlTag = "PrcgPos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingPosition";
			definition = "When the transaction is to be executed relative to a linked transaction - for information only.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingPosition9Choice.mmObject();
		}

		@Override
		public Optional<ProcessingPosition9Choice> getValue(Linkages41 obj) {
			return obj.getProcessingPosition();
		}

		@Override
		public void setValue(Linkages41 obj, Optional<ProcessingPosition9Choice> value) {
			obj.setProcessingPosition(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesSttlmTxId", required = true)
	protected Max35Text securitiesSettlementTransactionIdentification;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Linkages41
	 * Linkages41}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSttlmTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of a securities settlement transaction as known by the account owner (or instructing party acting on its behalf)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Linkages41, Max35Text> mmSecuritiesSettlementTransactionIdentification = new MMMessageAttribute<Linkages41, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Linkages41.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionIdentification";
			definition = "Unambiguous identification of a securities settlement transaction as known by the account owner (or instructing party acting on its behalf).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Linkages41 obj) {
			return obj.getSecuritiesSettlementTransactionIdentification();
		}

		@Override
		public void setValue(Linkages41 obj, Max35Text value) {
			obj.setSecuritiesSettlementTransactionIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Linkages41.mmProcessingPosition, com.tools20022.repository.msg.Linkages41.mmSecuritiesSettlementTransactionIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionConfirmationV08.mmLinkages, SecuritiesSettlementTransactionStatusAdviceV09.mmLinkages);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Linkages41";
				definition = "Information related to a linked transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ProcessingPosition9Choice> getProcessingPosition() {
		return processingPosition == null ? Optional.empty() : Optional.of(processingPosition);
	}

	public Linkages41 setProcessingPosition(ProcessingPosition9Choice processingPosition) {
		this.processingPosition = processingPosition;
		return this;
	}

	public Max35Text getSecuritiesSettlementTransactionIdentification() {
		return securitiesSettlementTransactionIdentification;
	}

	public Linkages41 setSecuritiesSettlementTransactionIdentification(Max35Text securitiesSettlementTransactionIdentification) {
		this.securitiesSettlementTransactionIdentification = Objects.requireNonNull(securitiesSettlementTransactionIdentification);
		return this;
	}
}