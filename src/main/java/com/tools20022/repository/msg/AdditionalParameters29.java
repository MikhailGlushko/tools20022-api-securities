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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV08;
import com.tools20022.repository.codeset.PartialSettlement2Code;
import com.tools20022.repository.codeset.PreConfirmation1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies additional parameters to the message or transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#mmPreConfirmation
 * AdditionalParameters29.mmPreConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#mmPartialSettlement
 * AdditionalParameters29.mmPartialSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#mmPreviousPartialConfirmationIdentification
 * AdditionalParameters29.mmPreviousPartialConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#mmTripartyAgentServiceProviderCollateralTransactionIdentification
 * AdditionalParameters29.
 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#mmClientTripartyCollateralTransactionIdentification
 * AdditionalParameters29.mmClientTripartyCollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#mmClientCollateralInstructionIdentification
 * AdditionalParameters29.mmClientCollateralInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#mmTripartyAgentServiceProviderCollateralInstructionIdentification
 * AdditionalParameters29.
 * mmTripartyAgentServiceProviderCollateralInstructionIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmationV08#mmAdditionalParameters
 * SecuritiesSettlementTransactionConfirmationV08.mmAdditionalParameters}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline#forAdditionalParameters29
 * ConstraintPartialSettlementGuideline.forAdditionalParameters29}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalParameters29"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies additional parameters to the message or transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AdditionalParameters29", propOrder = {"preConfirmation", "partialSettlement", "previousPartialConfirmationIdentification", "tripartyAgentServiceProviderCollateralTransactionIdentification",
		"clientTripartyCollateralTransactionIdentification", "clientCollateralInstructionIdentification", "tripartyAgentServiceProviderCollateralInstructionIdentification"})
public class AdditionalParameters29 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PreConf")
	protected PreConfirmation1Code preConfirmation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PreConfirmation1Code
	 * PreConfirmation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPreConfirmation
	 * SecuritiesSettlement.mmPreConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29
	 * AdditionalParameters29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PreConf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22H::PREC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether there exists a pre-confirmation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalParameters29, Optional<PreConfirmation1Code>> mmPreConfirmation = new MMMessageAttribute<AdditionalParameters29, Optional<PreConfirmation1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmPreConfirmation;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalParameters29.mmObject();
			isDerived = false;
			xmlTag = "PreConf";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::PREC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreConfirmation";
			definition = "Specifies whether there exists a pre-confirmation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PreConfirmation1Code.mmObject();
		}

		@Override
		public Optional<PreConfirmation1Code> getValue(AdditionalParameters29 obj) {
			return obj.getPreConfirmation();
		}

		@Override
		public void setValue(AdditionalParameters29 obj, Optional<PreConfirmation1Code> value) {
			obj.setPreConfirmation(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtlSttlm")
	protected PartialSettlement2Code partialSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PartialSettlement2Code
	 * PartialSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmPartialSettlementType
	 * SecuritiesTransfer.mmPartialSettlementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29
	 * AdditionalParameters29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlSttlm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PARS</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies partial settlement information."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalParameters29, Optional<PartialSettlement2Code>> mmPartialSettlement = new MMMessageAttribute<AdditionalParameters29, Optional<PartialSettlement2Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmPartialSettlementType;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalParameters29.mmObject();
			isDerived = false;
			xmlTag = "PrtlSttlm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PARS"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlement";
			definition = "Specifies partial settlement information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PartialSettlement2Code.mmObject();
		}

		@Override
		public Optional<PartialSettlement2Code> getValue(AdditionalParameters29 obj) {
			return obj.getPartialSettlement();
		}

		@Override
		public void setValue(AdditionalParameters29 obj, Optional<PartialSettlement2Code> value) {
			obj.setPartialSettlement(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsPrtlConfId")
	protected Max35Text previousPartialConfirmationIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29
	 * AdditionalParameters29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsPrtlConfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::PREV</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousPartialConfirmationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the confirmation previously sent to confirm the partial settlement of a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalParameters29, Optional<Max35Text>> mmPreviousPartialConfirmationIdentification = new MMMessageAttribute<AdditionalParameters29, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalParameters29.mmObject();
			isDerived = false;
			xmlTag = "PrvsPrtlConfId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::PREV"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousPartialConfirmationIdentification";
			definition = "Identification of the confirmation previously sent to confirm the partial settlement of a transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AdditionalParameters29 obj) {
			return obj.getPreviousPartialConfirmationIdentification();
		}

		@Override
		public void setValue(AdditionalParameters29 obj, Optional<Max35Text> value) {
			obj.setPreviousPartialConfirmationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TrptyAgtSvcPrvdrCollTxId")
	protected Max35Text tripartyAgentServiceProviderCollateralTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmTripartyAgentCollateralTransactionIdentification
	 * SecuritiesTradeIdentification.
	 * mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29
	 * AdditionalParameters29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrptyAgtSvcPrvdrCollTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::TCTR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyAgentServiceProviderCollateralTransactionIdentification"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification identifying the triparty collateral management transaction from the triparty-agent's/service-provider's point of view."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalParameters29, Optional<Max35Text>> mmTripartyAgentServiceProviderCollateralTransactionIdentification = new MMMessageAttribute<AdditionalParameters29, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmTripartyAgentCollateralTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalParameters29.mmObject();
			isDerived = false;
			xmlTag = "TrptyAgtSvcPrvdrCollTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::TCTR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyAgentServiceProviderCollateralTransactionIdentification";
			definition = "Unique identification identifying the triparty collateral management transaction from the triparty-agent's/service-provider's point of view.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AdditionalParameters29 obj) {
			return obj.getTripartyAgentServiceProviderCollateralTransactionIdentification();
		}

		@Override
		public void setValue(AdditionalParameters29 obj, Optional<Max35Text> value) {
			obj.setTripartyAgentServiceProviderCollateralTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ClntTrptyCollTxId")
	protected Max35Text clientTripartyCollateralTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmClientTripartyCollateralTransactionIdentification
	 * SecuritiesTradeIdentification.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29
	 * AdditionalParameters29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntTrptyCollTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::CLTR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientTripartyCollateralTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference identifying the triparty collateral management transaction from the client's point of view."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalParameters29, Optional<Max35Text>> mmClientTripartyCollateralTransactionIdentification = new MMMessageAttribute<AdditionalParameters29, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmClientTripartyCollateralTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalParameters29.mmObject();
			isDerived = false;
			xmlTag = "ClntTrptyCollTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::CLTR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientTripartyCollateralTransactionIdentification";
			definition = "Unique reference identifying the triparty collateral management transaction from the client's point of view.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AdditionalParameters29 obj) {
			return obj.getClientTripartyCollateralTransactionIdentification();
		}

		@Override
		public void setValue(AdditionalParameters29 obj, Optional<Max35Text> value) {
			obj.setClientTripartyCollateralTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ClntCollInstrId")
	protected Max35Text clientCollateralInstructionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmClientTripartyCollateralTransactionIdentification
	 * SecuritiesTradeIdentification.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29
	 * AdditionalParameters29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntCollInstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientCollateralInstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned to the instruction by the client."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalParameters29, Optional<Max35Text>> mmClientCollateralInstructionIdentification = new MMMessageAttribute<AdditionalParameters29, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmClientTripartyCollateralTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalParameters29.mmObject();
			isDerived = false;
			xmlTag = "ClntCollInstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientCollateralInstructionIdentification";
			definition = "Unique identification assigned to the instruction by the client.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AdditionalParameters29 obj) {
			return obj.getClientCollateralInstructionIdentification();
		}

		@Override
		public void setValue(AdditionalParameters29 obj, Optional<Max35Text> value) {
			obj.setClientCollateralInstructionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TrptyAgtSvcPrvdrCollInstrId")
	protected Max35Text tripartyAgentServiceProviderCollateralInstructionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmTripartyAgentCollateralTransactionIdentification
	 * SecuritiesTradeIdentification.
	 * mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29
	 * AdditionalParameters29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrptyAgtSvcPrvdrCollInstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyAgentServiceProviderCollateralInstructionIdentification"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned to the instruction by the triparty-agent/service-provider."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalParameters29, Optional<Max35Text>> mmTripartyAgentServiceProviderCollateralInstructionIdentification = new MMMessageAttribute<AdditionalParameters29, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmTripartyAgentCollateralTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalParameters29.mmObject();
			isDerived = false;
			xmlTag = "TrptyAgtSvcPrvdrCollInstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyAgentServiceProviderCollateralInstructionIdentification";
			definition = "Unique identification assigned to the instruction by the triparty-agent/service-provider.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AdditionalParameters29 obj) {
			return obj.getTripartyAgentServiceProviderCollateralInstructionIdentification();
		}

		@Override
		public void setValue(AdditionalParameters29 obj, Optional<Max35Text> value) {
			obj.setTripartyAgentServiceProviderCollateralInstructionIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalParameters29.mmPreConfirmation, com.tools20022.repository.msg.AdditionalParameters29.mmPartialSettlement,
						com.tools20022.repository.msg.AdditionalParameters29.mmPreviousPartialConfirmationIdentification,
						com.tools20022.repository.msg.AdditionalParameters29.mmTripartyAgentServiceProviderCollateralTransactionIdentification,
						com.tools20022.repository.msg.AdditionalParameters29.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters29.mmClientCollateralInstructionIdentification,
						com.tools20022.repository.msg.AdditionalParameters29.mmTripartyAgentServiceProviderCollateralInstructionIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionConfirmationV08.mmAdditionalParameters);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPartialSettlementGuideline.forAdditionalParameters29);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalParameters29";
				definition = "Specifies additional parameters to the message or transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PreConfirmation1Code> getPreConfirmation() {
		return preConfirmation == null ? Optional.empty() : Optional.of(preConfirmation);
	}

	public AdditionalParameters29 setPreConfirmation(PreConfirmation1Code preConfirmation) {
		this.preConfirmation = preConfirmation;
		return this;
	}

	public Optional<PartialSettlement2Code> getPartialSettlement() {
		return partialSettlement == null ? Optional.empty() : Optional.of(partialSettlement);
	}

	public AdditionalParameters29 setPartialSettlement(PartialSettlement2Code partialSettlement) {
		this.partialSettlement = partialSettlement;
		return this;
	}

	public Optional<Max35Text> getPreviousPartialConfirmationIdentification() {
		return previousPartialConfirmationIdentification == null ? Optional.empty() : Optional.of(previousPartialConfirmationIdentification);
	}

	public AdditionalParameters29 setPreviousPartialConfirmationIdentification(Max35Text previousPartialConfirmationIdentification) {
		this.previousPartialConfirmationIdentification = previousPartialConfirmationIdentification;
		return this;
	}

	public Optional<Max35Text> getTripartyAgentServiceProviderCollateralTransactionIdentification() {
		return tripartyAgentServiceProviderCollateralTransactionIdentification == null ? Optional.empty() : Optional.of(tripartyAgentServiceProviderCollateralTransactionIdentification);
	}

	public AdditionalParameters29 setTripartyAgentServiceProviderCollateralTransactionIdentification(Max35Text tripartyAgentServiceProviderCollateralTransactionIdentification) {
		this.tripartyAgentServiceProviderCollateralTransactionIdentification = tripartyAgentServiceProviderCollateralTransactionIdentification;
		return this;
	}

	public Optional<Max35Text> getClientTripartyCollateralTransactionIdentification() {
		return clientTripartyCollateralTransactionIdentification == null ? Optional.empty() : Optional.of(clientTripartyCollateralTransactionIdentification);
	}

	public AdditionalParameters29 setClientTripartyCollateralTransactionIdentification(Max35Text clientTripartyCollateralTransactionIdentification) {
		this.clientTripartyCollateralTransactionIdentification = clientTripartyCollateralTransactionIdentification;
		return this;
	}

	public Optional<Max35Text> getClientCollateralInstructionIdentification() {
		return clientCollateralInstructionIdentification == null ? Optional.empty() : Optional.of(clientCollateralInstructionIdentification);
	}

	public AdditionalParameters29 setClientCollateralInstructionIdentification(Max35Text clientCollateralInstructionIdentification) {
		this.clientCollateralInstructionIdentification = clientCollateralInstructionIdentification;
		return this;
	}

	public Optional<Max35Text> getTripartyAgentServiceProviderCollateralInstructionIdentification() {
		return tripartyAgentServiceProviderCollateralInstructionIdentification == null ? Optional.empty() : Optional.of(tripartyAgentServiceProviderCollateralInstructionIdentification);
	}

	public AdditionalParameters29 setTripartyAgentServiceProviderCollateralInstructionIdentification(Max35Text tripartyAgentServiceProviderCollateralInstructionIdentification) {
		this.tripartyAgentServiceProviderCollateralInstructionIdentification = tripartyAgentServiceProviderCollateralInstructionIdentification;
		return this;
	}
}