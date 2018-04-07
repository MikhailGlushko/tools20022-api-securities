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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionNotificationV08;
import com.tools20022.repository.choice.BalanceFormat5Choice;
import com.tools20022.repository.choice.DateFormat30Choice;
import com.tools20022.repository.choice.FractionDispositionType25Choice;
import com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat3Choice;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountPrice2;
import com.tools20022.repository.msg.Period11;
import com.tools20022.repository.msg.QuantityToQuantityRatio1;
import com.tools20022.repository.msg.SecurityIdentification19;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Description of the financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93#mmSecurityIdentification
 * FinancialInstrumentAttributes93.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93#mmQuantity
 * FinancialInstrumentAttributes93.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93#mmRenounceableEntitlementStatusType
 * FinancialInstrumentAttributes93.mmRenounceableEntitlementStatusType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93#mmFractionDisposition
 * FinancialInstrumentAttributes93.mmFractionDisposition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93#mmIntermediateSecuritiesToUnderlyingRatio
 * FinancialInstrumentAttributes93.mmIntermediateSecuritiesToUnderlyingRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93#mmMarketPrice
 * FinancialInstrumentAttributes93.mmMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93#mmExpiryDate
 * FinancialInstrumentAttributes93.mmExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93#mmPostingDate
 * FinancialInstrumentAttributes93.mmPostingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93#mmTradingPeriod
 * FinancialInstrumentAttributes93.mmTradingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93#mmUninstructedBalance
 * FinancialInstrumentAttributes93.mmUninstructedBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93#mmInstructedBalance
 * FinancialInstrumentAttributes93.mmInstructedBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNotificationV08#mmIntermediateSecurity
 * CorporateActionNotificationV08.mmIntermediateSecurity}</li>
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
 * "FinancialInstrumentAttributes93"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Description of the financial instrument."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentAttributes93", propOrder = {"securityIdentification", "quantity", "renounceableEntitlementStatusType", "fractionDisposition", "intermediateSecuritiesToUnderlyingRatio", "marketPrice", "expiryDate",
		"postingDate", "tradingPeriod", "uninstructedBalance", "instructedBalance"})
public class FinancialInstrumentAttributes93 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctyId", required = true)
	protected SecurityIdentification19 securityIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93
	 * FinancialInstrumentAttributes93}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :35B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes93, SecurityIdentification19> mmSecurityIdentification = new MMMessageAssociationEnd<FinancialInstrumentAttributes93, SecurityIdentification19>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes93.mmObject();
			isDerived = false;
			xmlTag = "SctyId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":35B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Identifies the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityIdentification19.mmObject();
		}

		@Override
		public SecurityIdentification19 getValue(FinancialInstrumentAttributes93 obj) {
			return obj.getSecurityIdentification();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes93 obj, SecurityIdentification19 value) {
			obj.setSecurityIdentification(value);
		}
	};
	@XmlElement(name = "Qty")
	protected DecimalNumber quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
	 * Security.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93
	 * FinancialInstrumentAttributes93}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36a::QINT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of entitled intermediate securities based on the balance of underlying securities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentAttributes93, Optional<DecimalNumber>> mmQuantity = new MMMessageAttribute<FinancialInstrumentAttributes93, Optional<DecimalNumber>>() {
		{
			businessElementTrace_lazy = () -> Security.mmSecuritiesQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes93.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36a::QINT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Quantity of entitled intermediate securities based on the balance of underlying securities.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(FinancialInstrumentAttributes93 obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes93 obj, Optional<DecimalNumber> value) {
			obj.setQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "RnncblEntitlmntStsTp")
	protected RenounceableEntitlementStatusTypeFormat3Choice renounceableEntitlementStatusType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RenounceableEntitlementStatusTypeFormat3Choice
	 * RenounceableEntitlementStatusTypeFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionSecuritiesEntitlement#mmRenounceableEntitlementStatusType
	 * CorporateActionSecuritiesEntitlement.mmRenounceableEntitlementStatusType}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93
	 * FinancialInstrumentAttributes93}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RnncblEntitlmntStsTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::SELL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RenounceableEntitlementStatusType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether terms of the event allow resale of the rights."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes93, Optional<RenounceableEntitlementStatusTypeFormat3Choice>> mmRenounceableEntitlementStatusType = new MMMessageAssociationEnd<FinancialInstrumentAttributes93, Optional<RenounceableEntitlementStatusTypeFormat3Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionSecuritiesEntitlement.mmRenounceableEntitlementStatusType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes93.mmObject();
			isDerived = false;
			xmlTag = "RnncblEntitlmntStsTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::SELL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RenounceableEntitlementStatusType";
			definition = "Specifies whether terms of the event allow resale of the rights.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RenounceableEntitlementStatusTypeFormat3Choice.mmObject();
		}

		@Override
		public Optional<RenounceableEntitlementStatusTypeFormat3Choice> getValue(FinancialInstrumentAttributes93 obj) {
			return obj.getRenounceableEntitlementStatusType();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes93 obj, Optional<RenounceableEntitlementStatusTypeFormat3Choice> value) {
			obj.setRenounceableEntitlementStatusType(value.orElse(null));
		}
	};
	@XmlElement(name = "FrctnDspstn")
	protected FractionDispositionType25Choice fractionDisposition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FractionDispositionType25Choice
	 * FractionDispositionType25Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmFractionDisposition
	 * CorporateActionOption.mmFractionDisposition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93
	 * FinancialInstrumentAttributes93}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrctnDspstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::DISF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionDisposition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes93, Optional<FractionDispositionType25Choice>> mmFractionDisposition = new MMMessageAssociationEnd<FinancialInstrumentAttributes93, Optional<FractionDispositionType25Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionOption.mmFractionDisposition;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes93.mmObject();
			isDerived = false;
			xmlTag = "FrctnDspstn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::DISF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionDisposition";
			definition = "Specifies how fractions resulting from derived securities will be processed or how prorated decisions will be rounding, if provided with a pro ration rate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FractionDispositionType25Choice.mmObject();
		}

		@Override
		public Optional<FractionDispositionType25Choice> getValue(FinancialInstrumentAttributes93 obj) {
			return obj.getFractionDisposition();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes93 obj, Optional<FractionDispositionType25Choice> value) {
			obj.setFractionDisposition(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmdtSctiesToUndrlygRatio")
	protected QuantityToQuantityRatio1 intermediateSecuritiesToUnderlyingRatio;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QuantityToQuantityRatio1
	 * QuantityToQuantityRatio1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmIntermediateSecuritiesToUnderlyingRatio
	 * SecuritiesProceedsDefinition.mmIntermediateSecuritiesToUnderlyingRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93
	 * FinancialInstrumentAttributes93}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmdtSctiesToUndrlygRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92D::RTUN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesToUnderlyingRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of intermediate securities awarded for a given quantity of underlying security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes93, Optional<QuantityToQuantityRatio1>> mmIntermediateSecuritiesToUnderlyingRatio = new MMMessageAssociationEnd<FinancialInstrumentAttributes93, Optional<QuantityToQuantityRatio1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmIntermediateSecuritiesToUnderlyingRatio;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes93.mmObject();
			isDerived = false;
			xmlTag = "IntrmdtSctiesToUndrlygRatio";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92D::RTUN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesToUnderlyingRatio";
			definition = "Quantity of intermediate securities awarded for a given quantity of underlying security.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> QuantityToQuantityRatio1.mmObject();
		}

		@Override
		public Optional<QuantityToQuantityRatio1> getValue(FinancialInstrumentAttributes93 obj) {
			return obj.getIntermediateSecuritiesToUnderlyingRatio();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes93 obj, Optional<QuantityToQuantityRatio1> value) {
			obj.setIntermediateSecuritiesToUnderlyingRatio(value.orElse(null));
		}
	};
	@XmlElement(name = "MktPric")
	protected AmountPrice2 marketPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountPrice2
	 * AmountPrice2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmMarketValue
	 * AssetHolding.mmMarketValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93
	 * FinancialInstrumentAttributes93}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::MRKT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last reported/known price of a financial instrument in a market."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes93, Optional<AmountPrice2>> mmMarketPrice = new MMMessageAssociationEnd<FinancialInstrumentAttributes93, Optional<AmountPrice2>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmMarketValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes93.mmObject();
			isDerived = false;
			xmlTag = "MktPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::MRKT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPrice";
			definition = "Last reported/known price of a financial instrument in a market.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountPrice2.mmObject();
		}

		@Override
		public Optional<AmountPrice2> getValue(FinancialInstrumentAttributes93 obj) {
			return obj.getMarketPrice();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes93 obj, Optional<AmountPrice2> value) {
			obj.setMarketPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "XpryDt", required = true)
	protected DateFormat30Choice expiryDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat30Choice
	 * DateFormat30Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmExpiryDate
	 * Asset.mmExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93
	 * FinancialInstrumentAttributes93}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::EXPI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which an order expires or at which a privilege or offer terminates."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes93, DateFormat30Choice> mmExpiryDate = new MMMessageAssociationEnd<FinancialInstrumentAttributes93, DateFormat30Choice>() {
		{
			businessElementTrace_lazy = () -> Asset.mmExpiryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes93.mmObject();
			isDerived = false;
			xmlTag = "XpryDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::EXPI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiryDate";
			definition = "Date on which an order expires or at which a privilege or offer terminates.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateFormat30Choice.mmObject();
		}

		@Override
		public DateFormat30Choice getValue(FinancialInstrumentAttributes93 obj) {
			return obj.getExpiryDate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes93 obj, DateFormat30Choice value) {
			obj.setExpiryDate(value);
		}
	};
	@XmlElement(name = "PstngDt", required = true)
	protected DateFormat30Choice postingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat30Choice
	 * DateFormat30Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmPostingDateTime
	 * CorporateActionDistribution.mmPostingDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93
	 * FinancialInstrumentAttributes93}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstngDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::POST</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the posting (credit or debit) to the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes93, DateFormat30Choice> mmPostingDate = new MMMessageAssociationEnd<FinancialInstrumentAttributes93, DateFormat30Choice>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmPostingDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes93.mmObject();
			isDerived = false;
			xmlTag = "PstngDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::POST"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostingDate";
			definition = "Date of the posting (credit or debit) to the account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateFormat30Choice.mmObject();
		}

		@Override
		public DateFormat30Choice getValue(FinancialInstrumentAttributes93 obj) {
			return obj.getPostingDate();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes93 obj, DateFormat30Choice value) {
			obj.setPostingDate(value);
		}
	};
	@XmlElement(name = "TradgPrd")
	protected Period11 tradingPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Period11 Period11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTradingPeriod
	 * CorporateActionEvent.mmTradingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93
	 * FinancialInstrumentAttributes93}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :69a::TRDP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which intermediate or outturn securities are tradable in a secondary market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes93, Optional<Period11>> mmTradingPeriod = new MMMessageAssociationEnd<FinancialInstrumentAttributes93, Optional<Period11>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmTradingPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes93.mmObject();
			isDerived = false;
			xmlTag = "TradgPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":69a::TRDP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingPeriod";
			definition = "Period during which intermediate or outturn securities are tradable in a secondary market.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period11.mmObject();
		}

		@Override
		public Optional<Period11> getValue(FinancialInstrumentAttributes93 obj) {
			return obj.getTradingPeriod();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes93 obj, Optional<Period11> value) {
			obj.setTradingPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "UinstdBal")
	protected BalanceFormat5Choice uninstructedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat5Choice
	 * BalanceFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmUninstructedBalance
	 * CorporateActionEntitlement.mmUninstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93
	 * FinancialInstrumentAttributes93}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UinstdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::UNBA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UninstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of uninstructed position."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes93, Optional<BalanceFormat5Choice>> mmUninstructedBalance = new MMMessageAssociationEnd<FinancialInstrumentAttributes93, Optional<BalanceFormat5Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmUninstructedBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes93.mmObject();
			isDerived = false;
			xmlTag = "UinstdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::UNBA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UninstructedBalance";
			definition = "Balance of uninstructed position.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BalanceFormat5Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat5Choice> getValue(FinancialInstrumentAttributes93 obj) {
			return obj.getUninstructedBalance();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes93 obj, Optional<BalanceFormat5Choice> value) {
			obj.setUninstructedBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "InstdBal")
	protected BalanceFormat5Choice instructedBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.BalanceFormat5Choice
	 * BalanceFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEntitlement#mmInstructedBalance
	 * CorporateActionEntitlement.mmInstructedBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes93
	 * FinancialInstrumentAttributes93}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a::INBA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of instructed position."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancialInstrumentAttributes93, Optional<BalanceFormat5Choice>> mmInstructedBalance = new MMMessageAssociationEnd<FinancialInstrumentAttributes93, Optional<BalanceFormat5Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEntitlement.mmInstructedBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes93.mmObject();
			isDerived = false;
			xmlTag = "InstdBal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a::INBA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedBalance";
			definition = "Balance of instructed position.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BalanceFormat5Choice.mmObject();
		}

		@Override
		public Optional<BalanceFormat5Choice> getValue(FinancialInstrumentAttributes93 obj) {
			return obj.getInstructedBalance();
		}

		@Override
		public void setValue(FinancialInstrumentAttributes93 obj, Optional<BalanceFormat5Choice> value) {
			obj.setInstructedBalance(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes93.mmSecurityIdentification, com.tools20022.repository.msg.FinancialInstrumentAttributes93.mmQuantity,
						com.tools20022.repository.msg.FinancialInstrumentAttributes93.mmRenounceableEntitlementStatusType, com.tools20022.repository.msg.FinancialInstrumentAttributes93.mmFractionDisposition,
						com.tools20022.repository.msg.FinancialInstrumentAttributes93.mmIntermediateSecuritiesToUnderlyingRatio, com.tools20022.repository.msg.FinancialInstrumentAttributes93.mmMarketPrice,
						com.tools20022.repository.msg.FinancialInstrumentAttributes93.mmExpiryDate, com.tools20022.repository.msg.FinancialInstrumentAttributes93.mmPostingDate,
						com.tools20022.repository.msg.FinancialInstrumentAttributes93.mmTradingPeriod, com.tools20022.repository.msg.FinancialInstrumentAttributes93.mmUninstructedBalance,
						com.tools20022.repository.msg.FinancialInstrumentAttributes93.mmInstructedBalance);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionNotificationV08.mmIntermediateSecurity);
				trace_lazy = () -> Asset.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentAttributes93";
				definition = "Description of the financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public SecurityIdentification19 getSecurityIdentification() {
		return securityIdentification;
	}

	public FinancialInstrumentAttributes93 setSecurityIdentification(SecurityIdentification19 securityIdentification) {
		this.securityIdentification = Objects.requireNonNull(securityIdentification);
		return this;
	}

	public Optional<DecimalNumber> getQuantity() {
		return quantity == null ? Optional.empty() : Optional.of(quantity);
	}

	public FinancialInstrumentAttributes93 setQuantity(DecimalNumber quantity) {
		this.quantity = quantity;
		return this;
	}

	public Optional<RenounceableEntitlementStatusTypeFormat3Choice> getRenounceableEntitlementStatusType() {
		return renounceableEntitlementStatusType == null ? Optional.empty() : Optional.of(renounceableEntitlementStatusType);
	}

	public FinancialInstrumentAttributes93 setRenounceableEntitlementStatusType(RenounceableEntitlementStatusTypeFormat3Choice renounceableEntitlementStatusType) {
		this.renounceableEntitlementStatusType = renounceableEntitlementStatusType;
		return this;
	}

	public Optional<FractionDispositionType25Choice> getFractionDisposition() {
		return fractionDisposition == null ? Optional.empty() : Optional.of(fractionDisposition);
	}

	public FinancialInstrumentAttributes93 setFractionDisposition(FractionDispositionType25Choice fractionDisposition) {
		this.fractionDisposition = fractionDisposition;
		return this;
	}

	public Optional<QuantityToQuantityRatio1> getIntermediateSecuritiesToUnderlyingRatio() {
		return intermediateSecuritiesToUnderlyingRatio == null ? Optional.empty() : Optional.of(intermediateSecuritiesToUnderlyingRatio);
	}

	public FinancialInstrumentAttributes93 setIntermediateSecuritiesToUnderlyingRatio(QuantityToQuantityRatio1 intermediateSecuritiesToUnderlyingRatio) {
		this.intermediateSecuritiesToUnderlyingRatio = intermediateSecuritiesToUnderlyingRatio;
		return this;
	}

	public Optional<AmountPrice2> getMarketPrice() {
		return marketPrice == null ? Optional.empty() : Optional.of(marketPrice);
	}

	public FinancialInstrumentAttributes93 setMarketPrice(AmountPrice2 marketPrice) {
		this.marketPrice = marketPrice;
		return this;
	}

	public DateFormat30Choice getExpiryDate() {
		return expiryDate;
	}

	public FinancialInstrumentAttributes93 setExpiryDate(DateFormat30Choice expiryDate) {
		this.expiryDate = Objects.requireNonNull(expiryDate);
		return this;
	}

	public DateFormat30Choice getPostingDate() {
		return postingDate;
	}

	public FinancialInstrumentAttributes93 setPostingDate(DateFormat30Choice postingDate) {
		this.postingDate = Objects.requireNonNull(postingDate);
		return this;
	}

	public Optional<Period11> getTradingPeriod() {
		return tradingPeriod == null ? Optional.empty() : Optional.of(tradingPeriod);
	}

	public FinancialInstrumentAttributes93 setTradingPeriod(Period11 tradingPeriod) {
		this.tradingPeriod = tradingPeriod;
		return this;
	}

	public Optional<BalanceFormat5Choice> getUninstructedBalance() {
		return uninstructedBalance == null ? Optional.empty() : Optional.of(uninstructedBalance);
	}

	public FinancialInstrumentAttributes93 setUninstructedBalance(BalanceFormat5Choice uninstructedBalance) {
		this.uninstructedBalance = uninstructedBalance;
		return this;
	}

	public Optional<BalanceFormat5Choice> getInstructedBalance() {
		return instructedBalance == null ? Optional.empty() : Optional.of(instructedBalance);
	}

	public FinancialInstrumentAttributes93 setInstructedBalance(BalanceFormat5Choice instructedBalance) {
		this.instructedBalance = instructedBalance;
		return this;
	}
}