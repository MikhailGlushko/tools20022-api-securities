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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV05;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.SecuritiesTradeExecution;
import com.tools20022.repository.entity.SecuritiesTradeIdentification;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericDocumentIdentification4;
import com.tools20022.repository.msg.SettlementTypeAndIdentification18;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of reference.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References45Choice#mmSecuritiesSettlementTransactionIdentification
 * References45Choice.mmSecuritiesSettlementTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References45Choice#mmSecuritiesFinancingTransactionIdentification
 * References45Choice.mmSecuritiesFinancingTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References45Choice#mmIntraPositionMovementIdentification
 * References45Choice.mmIntraPositionMovementIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References45Choice#mmOtherTransactionIdentification
 * References45Choice.mmOtherTransactionIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
 * SecuritiesTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV05#mmAccountOwnerTransactionIdentification
 * SecuritiesTransactionCancellationRequestV05.
 * mmAccountOwnerTransactionIdentification}</li>
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
 * "References45Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of reference."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "References45Choice", propOrder = {"securitiesSettlementTransactionIdentification", "securitiesFinancingTransactionIdentification", "intraPositionMovementIdentification", "otherTransactionIdentification"})
public class References45Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesSttlmTxId", required = true)
	protected SettlementTypeAndIdentification18 securitiesSettlementTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification18
	 * SettlementTypeAndIdentification18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References45Choice
	 * References45Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSttlmTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::PREV</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the securities settlement transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<References45Choice, SettlementTypeAndIdentification18> mmSecuritiesSettlementTransactionIdentification = new MMMessageAssociationEnd<References45Choice, SettlementTypeAndIdentification18>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.choice.References45Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::PREV"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionIdentification";
			definition = "Unambiguous identification of the securities settlement transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementTypeAndIdentification18.mmObject();
		}

		@Override
		public SettlementTypeAndIdentification18 getValue(References45Choice obj) {
			return obj.getSecuritiesSettlementTransactionIdentification();
		}

		@Override
		public void setValue(References45Choice obj, SettlementTypeAndIdentification18 value) {
			obj.setSecuritiesSettlementTransactionIdentification(value);
		}
	};
	@XmlElement(name = "SctiesFincgTxId", required = true)
	protected SettlementTypeAndIdentification18 securitiesFinancingTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification18
	 * SettlementTypeAndIdentification18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References45Choice
	 * References45Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::REPO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the underlying securities financing transaction (not the underlying securities financing trade) as assigned by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<References45Choice, SettlementTypeAndIdentification18> mmSecuritiesFinancingTransactionIdentification = new MMMessageAssociationEnd<References45Choice, SettlementTypeAndIdentification18>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.choice.References45Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesFincgTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::REPO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingTransactionIdentification";
			definition = "Unambiguous identification of the underlying securities financing transaction (not the underlying securities financing trade) as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementTypeAndIdentification18.mmObject();
		}

		@Override
		public SettlementTypeAndIdentification18 getValue(References45Choice obj) {
			return obj.getSecuritiesFinancingTransactionIdentification();
		}

		@Override
		public void setValue(References45Choice obj, SettlementTypeAndIdentification18 value) {
			obj.setSecuritiesFinancingTransactionIdentification(value);
		}
	};
	@XmlElement(name = "IntraPosMvmntId", required = true)
	protected Max35Text intraPositionMovementIdentification;
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
	 * {@linkplain com.tools20022.repository.choice.References45Choice
	 * References45Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntraPosMvmntId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::PREV</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraPositionMovementIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the intra-position movement transaction requested to be cancelled as known by the account owner (or instructing party acting on its behalf)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<References45Choice, Max35Text> mmIntraPositionMovementIdentification = new MMMessageAttribute<References45Choice, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.References45Choice.mmObject();
			isDerived = false;
			xmlTag = "IntraPosMvmntId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::PREV"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraPositionMovementIdentification";
			definition = "Reference to the intra-position movement transaction requested to be cancelled as known by the account owner (or instructing party acting on its behalf).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(References45Choice obj) {
			return obj.getIntraPositionMovementIdentification();
		}

		@Override
		public void setValue(References45Choice obj, Max35Text value) {
			obj.setIntraPositionMovementIdentification(value);
		}
	};
	@XmlElement(name = "OthrTxId", required = true)
	protected GenericDocumentIdentification4 otherTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericDocumentIdentification4
	 * GenericDocumentIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References45Choice
	 * References45Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a transaction that cannot be identified using a standard reference element present in the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<References45Choice, GenericDocumentIdentification4> mmOtherTransactionIdentification = new MMMessageAssociationEnd<References45Choice, GenericDocumentIdentification4>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.References45Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherTransactionIdentification";
			definition = "Reference to a transaction that cannot be identified using a standard reference element present in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericDocumentIdentification4.mmObject();
		}

		@Override
		public GenericDocumentIdentification4 getValue(References45Choice obj) {
			return obj.getOtherTransactionIdentification();
		}

		@Override
		public void setValue(References45Choice obj, GenericDocumentIdentification4 value) {
			obj.setOtherTransactionIdentification(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.References45Choice.mmSecuritiesSettlementTransactionIdentification,
						com.tools20022.repository.choice.References45Choice.mmSecuritiesFinancingTransactionIdentification, com.tools20022.repository.choice.References45Choice.mmIntraPositionMovementIdentification,
						com.tools20022.repository.choice.References45Choice.mmOtherTransactionIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTransactionCancellationRequestV05.mmAccountOwnerTransactionIdentification);
				trace_lazy = () -> SecuritiesTradeIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "References45Choice";
				definition = "Choice of reference.";
			}
		});
		return mmObject_lazy.get();
	}

	public SettlementTypeAndIdentification18 getSecuritiesSettlementTransactionIdentification() {
		return securitiesSettlementTransactionIdentification;
	}

	public References45Choice setSecuritiesSettlementTransactionIdentification(SettlementTypeAndIdentification18 securitiesSettlementTransactionIdentification) {
		this.securitiesSettlementTransactionIdentification = Objects.requireNonNull(securitiesSettlementTransactionIdentification);
		return this;
	}

	public SettlementTypeAndIdentification18 getSecuritiesFinancingTransactionIdentification() {
		return securitiesFinancingTransactionIdentification;
	}

	public References45Choice setSecuritiesFinancingTransactionIdentification(SettlementTypeAndIdentification18 securitiesFinancingTransactionIdentification) {
		this.securitiesFinancingTransactionIdentification = Objects.requireNonNull(securitiesFinancingTransactionIdentification);
		return this;
	}

	public Max35Text getIntraPositionMovementIdentification() {
		return intraPositionMovementIdentification;
	}

	public References45Choice setIntraPositionMovementIdentification(Max35Text intraPositionMovementIdentification) {
		this.intraPositionMovementIdentification = Objects.requireNonNull(intraPositionMovementIdentification);
		return this;
	}

	public GenericDocumentIdentification4 getOtherTransactionIdentification() {
		return otherTransactionIdentification;
	}

	public References45Choice setOtherTransactionIdentification(GenericDocumentIdentification4 otherTransactionIdentification) {
		this.otherTransactionIdentification = Objects.requireNonNull(otherTransactionIdentification);
		return this;
	}
}